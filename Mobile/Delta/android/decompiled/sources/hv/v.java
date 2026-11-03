package hv;

import java.io.EOFException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f19936l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f19937m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19938a;
    public final HttpUrl b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpUrl.Builder f19940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request.Builder f19941e = new Request.Builder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers.Builder f19942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MediaType f19943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MultipartBody.Builder f19945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FormBody.Builder f19946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RequestBody f19947k;

    public static class a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestBody f19948a;
        public final MediaType b;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.f19948a = requestBody;
            this.b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f19948a.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType get$contentType() {
            return this.b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(vu.f fVar) {
            this.f19948a.writeTo(fVar);
        }
    }

    public v(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f19938a = str;
        this.b = httpUrl;
        this.f19939c = str2;
        this.f19943g = mediaType;
        this.f19944h = z10;
        if (headers != null) {
            this.f19942f = headers.newBuilder();
        } else {
            this.f19942f = new Headers.Builder();
        }
        if (z11) {
            this.f19946j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f19945i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public static String i(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                vu.e eVar = new vu.e();
                eVar.G0(str, 0, iCharCount);
                j(eVar, str, iCharCount, length, z10);
                return eVar.Q2();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public static void j(vu.e eVar, String str, int i10, int i11, boolean z10) throws EOFException {
        vu.e eVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new vu.e();
                    }
                    eVar2.T(iCodePointAt);
                    long size = eVar2.getSize();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte bJ = eVar2.j(j10);
                        eVar.writeByte(37);
                        char[] cArr = f19936l;
                        eVar.writeByte(cArr[((bJ & 255) >> 4) & 15]);
                        eVar.writeByte(cArr[bJ & 15]);
                    }
                    eVar2.a();
                } else {
                    eVar.T(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f19946j.addEncoded(str, str2);
        } else {
            this.f19946j.add(str, str2);
        }
    }

    public void b(String str, String str2, boolean z10) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z10) {
                this.f19942f.addUnsafeNonAscii(str, str2);
                return;
            } else {
                this.f19942f.add(str, str2);
                return;
            }
        }
        try {
            this.f19943g = MediaType.get(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    public void c(Headers headers) {
        this.f19942f.addAll(headers);
    }

    public void d(Headers headers, RequestBody requestBody) {
        this.f19945i.addPart(headers, requestBody);
    }

    public void e(MultipartBody.Part part) {
        this.f19945i.addPart(part);
    }

    public void f(String str, String str2, boolean z10) throws EOFException {
        if (this.f19939c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z10);
        String strReplace = this.f19939c.replace("{" + str + "}", strI);
        if (!f19937m.matcher(strReplace).matches()) {
            this.f19939c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public void g(String str, String str2, boolean z10) {
        String str3 = this.f19939c;
        if (str3 != null) {
            HttpUrl.Builder builderNewBuilder = this.b.newBuilder(str3);
            this.f19940d = builderNewBuilder;
            if (builderNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.f19939c);
            }
            this.f19939c = null;
        }
        if (z10) {
            this.f19940d.addEncodedQueryParameter(str, str2);
        } else {
            this.f19940d.addQueryParameter(str, str2);
        }
    }

    public <T> void h(Class<T> cls, T t8) {
        this.f19941e.tag(cls, t8);
    }

    public Request.Builder k() {
        HttpUrl httpUrlResolve;
        HttpUrl.Builder builder = this.f19940d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            httpUrlResolve = this.b.resolve(this.f19939c);
            if (httpUrlResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.f19939c);
            }
        }
        RequestBody aVar = this.f19947k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f19946j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f19945i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f19944h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f19943g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.f19942f.add("Content-Type", mediaType.toString());
            }
        }
        return this.f19941e.url(httpUrlResolve).headers(this.f19942f.build()).method(this.f19938a, aVar);
    }

    public void l(RequestBody requestBody) {
        this.f19947k = requestBody;
    }

    public void m(Object obj) {
        this.f19939c = obj.toString();
    }
}
