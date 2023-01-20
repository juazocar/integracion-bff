package cl.duoc.integracionbff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.integracionbff.clients.WebPayAmbFeignClient;
import cl.duoc.integracionbff.model.dto.CommonHeader;
import cl.duoc.integracionbff.model.dto.CommonResponse;
import cl.duoc.integracionbff.model.dto.webpay.WebPayTransactionInitRequest;
import cl.duoc.integracionbff.model.dto.webpay.WebPayTransactionInitResponse;

@Service
public class VentaService {
    
    @Autowired
    WebPayAmbFeignClient webPayAmbFeignClient;

    public CommonResponse generarTransaccion(WebPayTransactionInitRequest request){
        CommonResponse commonResponse = new CommonResponse();
        WebPayTransactionInitResponse transactionInitResponse = webPayAmbFeignClient.initTransaction(request);
        
        CommonHeader commonHeader = new CommonHeader();
        commonHeader.setCode("0");
        commonHeader.setMessage("Transaction created");

        commonResponse.setData(commonHeader);
        commonResponse.setData(transactionInitResponse);
        return commonResponse;
    }

}
