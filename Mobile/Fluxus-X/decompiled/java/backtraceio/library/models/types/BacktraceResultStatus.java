package backtraceio.library.models.types;

/* JADX INFO: loaded from: classes.dex */
public enum BacktraceResultStatus {
    ServerError,
    Ok;

    public static BacktraceResultStatus enumOf(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        if (lowerCase.equals("servererror")) {
            return ServerError;
        }
        if (lowerCase.equals("ok")) {
            return Ok;
        }
        throw new IllegalArgumentException("Invalid BacktraceResultStatus enum value");
    }
}
