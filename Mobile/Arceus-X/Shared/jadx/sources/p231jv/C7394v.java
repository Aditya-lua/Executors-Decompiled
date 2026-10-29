package p231jv;

import java.io.EOFException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import p560xu.C12924e;
import p560xu.InterfaceC12926f;

/* JADX INFO: renamed from: jv.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C7394v {

    /* JADX INFO: renamed from: l */
    public static final char[] f28410l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m */
    public static final Pattern f28411m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final String f28412a;

    /* JADX INFO: renamed from: b */
    public final HttpUrl f28413b;

    /* JADX INFO: renamed from: c */
    public String f28414c;

    /* JADX INFO: renamed from: d */
    public HttpUrl.Builder f28415d;

    /* JADX INFO: renamed from: e */
    public final Request.Builder f28416e = new Request.Builder();

    /* JADX INFO: renamed from: f */
    public final Headers.Builder f28417f;

    /* JADX INFO: renamed from: g */
    public MediaType f28418g;

    /* JADX INFO: renamed from: h */
    public final boolean f28419h;

    /* JADX INFO: renamed from: i */
    public MultipartBody.Builder f28420i;

    /* JADX INFO: renamed from: j */
    public FormBody.Builder f28421j;

    /* JADX INFO: renamed from: k */
    public RequestBody f28422k;

    /* JADX INFO: renamed from: jv.v$a */
    public static class a extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final RequestBody f28423a;

        /* JADX INFO: renamed from: b */
        public final MediaType f28424b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.f28423a = requestBody;
            this.f28424b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f28423a.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.f28424b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC12926f interfaceC12926f) {
            this.f28423a.writeTo(interfaceC12926f);
        }
    }

    public C7394v(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f28412a = str;
        this.f28413b = httpUrl;
        this.f28414c = str2;
        this.f28418g = mediaType;
        this.f28419h = z10;
        if (headers != null) {
            this.f28417f = headers.newBuilder();
        } else {
            this.f28417f = new Headers.Builder();
        }
        if (z11) {
            this.f28421j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f28420i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m30624i(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C12924e c12924e = new C12924e();
                c12924e.mo48001K0(str, 0, iCharCount);
                m30625j(c12924e, str, iCharCount, length, z10);
                return c12924e.mo48008R2();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    /* JADX INFO: renamed from: j */
    public static void m30625j(C12924e c12924e, String str, int i10, int i11, boolean z10) throws EOFException {
        C12924e c12924e2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (c12924e2 == null) {
                        c12924e2 = new C12924e();
                    }
                    c12924e2.mo48009T(iCodePointAt);
                    long size = c12924e2.getSize();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte bM48033j = c12924e2.m48033j(j10);
                        c12924e.writeByte(37);
                        char[] cArr = f28410l;
                        c12924e.writeByte(cArr[((bM48033j & 255) >> 4) & 15]);
                        c12924e.writeByte(cArr[bM48033j & 15]);
                    }
                    c12924e2.m48017a();
                } else {
                    c12924e.mo48009T(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m30626a(String str, String str2, boolean z10) {
        if (z10) {
            this.f28421j.addEncoded(str, str2);
        } else {
            this.f28421j.add(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m30627b(String str, String str2, boolean z10) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z10) {
                this.f28417f.addUnsafeNonAscii(str, str2);
                return;
            } else {
                this.f28417f.add(str, str2);
                return;
            }
        }
        try {
            this.f28418g = MediaType.get(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m30628c(Headers headers) {
        this.f28417f.addAll(headers);
    }

    /* JADX INFO: renamed from: d */
    public void m30629d(Headers headers, RequestBody requestBody) {
        this.f28420i.addPart(headers, requestBody);
    }

    /* JADX INFO: renamed from: e */
    public void m30630e(MultipartBody.Part part) {
        this.f28420i.addPart(part);
    }

    /* JADX INFO: renamed from: f */
    public void m30631f(String str, String str2, boolean z10) throws EOFException {
        if (this.f28414c == null) {
            throw new AssertionError();
        }
        String strM30624i = m30624i(str2, z10);
        String strReplace = this.f28414c.replace("{" + str + "}", strM30624i);
        if (!f28411m.matcher(strReplace).matches()) {
            this.f28414c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    /* JADX INFO: renamed from: g */
    public void m30632g(String str, String str2, boolean z10) {
        String str3 = this.f28414c;
        if (str3 != null) {
            HttpUrl.Builder builderNewBuilder = this.f28413b.newBuilder(str3);
            this.f28415d = builderNewBuilder;
            if (builderNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f28413b + ", Relative: " + this.f28414c);
            }
            this.f28414c = null;
        }
        if (z10) {
            this.f28415d.addEncodedQueryParameter(str, str2);
        } else {
            this.f28415d.addQueryParameter(str, str2);
        }
    }

    /* JADX INFO: renamed from: h */
    public <T> void m30633h(Class<T> cls, T t8) {
        this.f28416e.tag(cls, t8);
    }

    /* JADX INFO: renamed from: k */
    public Request.Builder m30634k() {
        HttpUrl httpUrlResolve;
        HttpUrl.Builder builder = this.f28415d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            httpUrlResolve = this.f28413b.resolve(this.f28414c);
            if (httpUrlResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f28413b + ", Relative: " + this.f28414c);
            }
        }
        RequestBody aVar = this.f28422k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f28421j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f28420i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f28419h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f28418g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.f28417f.add("Content-Type", mediaType.toString());
            }
        }
        return this.f28416e.url(httpUrlResolve).headers(this.f28417f.build()).method(this.f28412a, aVar);
    }

    /* JADX INFO: renamed from: l */
    public void m30635l(RequestBody requestBody) {
        this.f28422k = requestBody;
    }

    /* JADX INFO: renamed from: m */
    public void m30636m(Object obj) {
        this.f28414c = obj.toString();
    }
}
