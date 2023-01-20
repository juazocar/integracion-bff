package cl.duoc.integracionbff.model.dto;

public class CommonResponse {
    
    private CommonHeader headers;
    private Object data;
    
    public CommonResponse() {
    }

    public CommonHeader getHeaders() {
        return headers;
    }

    public void setHeaders(CommonHeader headers) {
        this.headers = headers;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

   

    
    
}
