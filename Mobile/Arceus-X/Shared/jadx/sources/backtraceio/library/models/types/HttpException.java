package backtraceio.library.models.types;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends Exception {
    private Integer httpStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HttpException(String str) {
        this(null, str);
    }

    private void setHttpStatus(int i10) {
        this.httpStatus = Integer.valueOf(i10);
    }

    public int getHttpStatus() {
        return this.httpStatus.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public HttpException(Integer num) {
        this(num, null);
    }

    public HttpException(Integer num, String str) {
        super(str);
        setHttpStatus(num.intValue());
    }
}
