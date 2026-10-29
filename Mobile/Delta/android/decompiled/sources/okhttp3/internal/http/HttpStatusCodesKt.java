package okhttp3.internal.http;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"HTTP_CONTINUE", "", "HTTP_SWITCHING_PROTOCOLS", "HTTP_PROCESSING", "HTTP_EARLY_HINTS", "HTTP_TEMP_REDIRECT", "HTTP_PERM_REDIRECT", "HTTP_MISDIRECTED_REQUEST", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HttpStatusCodesKt {
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_EARLY_HINTS = 103;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_PROCESSING = 102;
    public static final int HTTP_SWITCHING_PROTOCOLS = 101;
    public static final int HTTP_TEMP_REDIRECT = 307;
}
