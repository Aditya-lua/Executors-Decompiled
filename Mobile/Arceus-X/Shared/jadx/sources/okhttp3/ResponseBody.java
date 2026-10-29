package okhttp3;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7745l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, m31665d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lxu/g;", "consumer", "", "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", Payload.SOURCE, "()Lxu/g;", "", "bytes", "()[B", "Lxu/h;", "byteString", "()Lxu/h;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", InquiryField.StringField.TYPE, "()Ljava/lang/String;", "", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final ResponseBody EMPTY;

    @Nullable
    private Reader reader;

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lxu/g;", Payload.SOURCE, "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lxu/g;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "", "close", "()V", "Lxu/g;", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class BomAwareReader extends Reader {

        @NotNull
        private final Charset charset;
        private boolean closed;

        @Nullable
        private Reader delegate;

        @NotNull
        private final InterfaceC12928g source;

        public BomAwareReader(@NotNull InterfaceC12928g source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.mo48051s3(), _UtilJvmKt.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lxu/h;", "(Lxu/h;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lxu/g;", "", "contentLength", "(Lxu/g;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lxu/h;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLxu/g;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.ResponseBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @NotNull
        public final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pair<Charset, MediaType> pairChooseCharset = Internal.chooseCharset(mediaType);
            Charset charsetM31671a = pairChooseCharset.m31671a();
            MediaType mediaTypeM31672b = pairChooseCharset.m31672b();
            C12924e c12924eM47993D0 = new C12924e().m47993D0(str, charsetM31671a);
            return create(c12924eM47993D0, mediaTypeM31672b, c12924eM47993D0.getSize());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C12930h c12930h, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c12930h, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, InterfaceC12928g interfaceC12928g, MediaType mediaType, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return companion.create(interfaceC12928g, mediaType, j10);
        }

        @NotNull
        public final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create(new C12924e().write(bArr), mediaType, bArr.length);
        }

        @NotNull
        public final ResponseBody create(@NotNull C12930h c12930h, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(c12930h, "<this>");
            return create(new C12924e().mo48023d0(c12930h), mediaType, c12930h.m48089I());
        }

        @NotNull
        public final ResponseBody create(@NotNull final InterfaceC12928g interfaceC12928g, @Nullable final MediaType mediaType, final long j10) {
            Intrinsics.checkNotNullParameter(interfaceC12928g, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j10;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: source, reason: from getter */
                public InterfaceC12928g get$this_asResponseBody() {
                    return interfaceC12928g;
                }
            };
        }

        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull C12930h content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, long contentLength, @NotNull InterfaceC12928g content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType, contentLength);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, C12930h.f45830e, (MediaType) null, 1, (Object) null);
    }

    private final Charset charset() {
        return Internal.charsetOrUtf8(get$contentType());
    }

    /* JADX DEBUG: Type inference failed for r2v9. Raw type applied. Possible types: ? super T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Throwable] */
    private final <T> T consumeSource(ResponseBody responseBody, Function1<? super InterfaceC12928g, ? extends T> function1, Function1<? super T, Integer> function2) throws IOException {
        ?? r8;
        long jContentLength = responseBody.get$contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        InterfaceC12928g interfaceC12928gSource = responseBody.get$this_asResponseBody();
        Object obj = (Object) null;
        try {
            Object objInvoke = function1.invoke(interfaceC12928gSource);
            C7745l.m32060b(1);
            if (interfaceC12928gSource != null) {
                try {
                    interfaceC12928gSource.close();
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    this = this;
                    long r0 = r6.get$contentLength()
                    r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 > 0) goto L75
                    xu.g r6 = r6.get$this_asResponseBody()
                    r2 = 0
                    r3 = 1
                    java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L26
                    kotlin.jvm.internal.C7745l.m32060b(r3)
                    if (r6 == 0) goto L1f
                    r6.close()     // Catch: java.lang.Throwable -> L1e
                    goto L1f
                L1e:
                    r2 = move-exception
                L1f:
                    kotlin.jvm.internal.C7745l.m32059a(r3)
                    r4 = r2
                    r2 = r7
                    r7 = r4
                    goto L37
                L26:
                    r7 = move-exception
                    kotlin.jvm.internal.C7745l.m32060b(r3)
                    if (r6 == 0) goto L34
                    r6.close()     // Catch: java.lang.Throwable -> L30
                    goto L34
                L30:
                    r6 = move-exception
                    p229jt.C7328a.m30429a(r7, r6)
                L34:
                    kotlin.jvm.internal.C7745l.m32059a(r3)
                L37:
                    if (r7 != 0) goto L74
                    java.lang.Object r6 = r8.invoke(r2)
                    java.lang.Number r6 = (java.lang.Number) r6
                    int r6 = r6.intValue()
                    r7 = -1
                    int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                    if (r7 == 0) goto L73
                    long r7 = (long) r6
                    int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                    if (r7 != 0) goto L4f
                    goto L73
                L4f:
                    java.io.IOException r7 = new java.io.IOException
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r2 = "Content-Length ("
                    r8.append(r2)
                    r8.append(r0)
                    java.lang.String r0 = ") and stream length ("
                    r8.append(r0)
                    r8.append(r6)
                    java.lang.String r6 = ") disagree"
                    r8.append(r6)
                    java.lang.String r6 = r8.toString()
                    r7.<init>(r6)
                    throw r7
                L73:
                    return r2
                L74:
                    throw r7
                L75:
                    java.io.IOException r6 = new java.io.IOException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r8 = "Cannot buffer entire body for content length: "
                    r7.append(r8)
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    r6.<init>(r7)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(okhttp3.ResponseBody, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):java.lang.Object");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @NotNull
            public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
                return INSTANCE.create(str, mediaType);
            }

            @NotNull
            public final InputStream byteStream() {
                return get$this_asResponseBody().mo48051s3();
            }

            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v9 */
            @NotNull
            public final C12930h byteString() throws IOException {
                long jContentLength = get$contentLength();
                if (jContentLength > 2147483647L) {
                    throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
                }
                InterfaceC12928g interfaceC12928gSource = get$this_asResponseBody();
                C12930h th2 = null;
                try {
                    C12930h c12930hMo47997F2 = interfaceC12928gSource.mo47997F2();
                    if (interfaceC12928gSource != null) {
                        try {
                            interfaceC12928gSource.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th = th2;
                    th2 = c12930hMo47997F2;
                } catch (Throwable th4) {
                    th = th4;
                    if (interfaceC12928gSource != null) {
                        try {
                            interfaceC12928gSource.close();
                        } catch (Throwable th5) {
                            C7328a.m30429a(th, th5);
                        }
                    }
                }
                if (th != 0) {
                    throw th;
                }
                int iM48089I = th2.m48089I();
                if (jContentLength == -1 || jContentLength == iM48089I) {
                    return th2;
                }
                throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iM48089I + ") disagree");
            }

            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v9 */
            @NotNull
            public final byte[] bytes() throws IOException {
                long jContentLength = get$contentLength();
                if (jContentLength > 2147483647L) {
                    throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
                }
                InterfaceC12928g interfaceC12928gSource = get$this_asResponseBody();
                byte[] th2 = null;
                try {
                    byte[] bArrMo48013X1 = interfaceC12928gSource.mo48013X1();
                    if (interfaceC12928gSource != null) {
                        try {
                            interfaceC12928gSource.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th = th2;
                    th2 = bArrMo48013X1;
                } catch (Throwable th4) {
                    th = th4;
                    if (interfaceC12928gSource != null) {
                        try {
                            interfaceC12928gSource.close();
                        } catch (Throwable th5) {
                            C7328a.m30429a(th, th5);
                        }
                    }
                }
                if (th != 0) {
                    throw th;
                }
                int length = th2.length;
                if (jContentLength == -1 || jContentLength == length) {
                    return th2;
                }
                throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
            }

            @NotNull
            public final Reader charStream() {
                Reader reader = this.reader;
                if (reader != null) {
                    return reader;
                }
                BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
                this.reader = bomAwareReader;
                return bomAwareReader;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                _UtilCommonKt.closeQuietly(get$this_asResponseBody());
            }

            /* JADX INFO: renamed from: contentLength */
            public abstract long get$contentLength();

            @Nullable
            /* JADX INFO: renamed from: contentType */
            public abstract MediaType get$contentType();

            @NotNull
            /* JADX INFO: renamed from: source */
            public abstract InterfaceC12928g get$this_asResponseBody();

            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x001d */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r2v5 */
            @NotNull
            public final String string() {
                InterfaceC12928g interfaceC12928gSource = get$this_asResponseBody();
                String th2 = null;
                try {
                    String strMo48059z2 = interfaceC12928gSource.mo48059z2(_UtilJvmKt.readBomAsCharset(interfaceC12928gSource, charset()));
                    if (interfaceC12928gSource != null) {
                        try {
                            interfaceC12928gSource.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th = th2;
                    th2 = strMo48059z2;
                } catch (Throwable th4) {
                    th = th4;
                    if (interfaceC12928gSource != null) {
                        try {
                            interfaceC12928gSource.close();
                        } catch (Throwable th5) {
                            C7328a.m30429a(th, th5);
                        }
                    }
                }
                if (th == 0) {
                    return th2;
                }
                throw th;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @NotNull
            public static final ResponseBody create(@Nullable MediaType mediaType, long j10, @NotNull InterfaceC12928g interfaceC12928g) {
                return INSTANCE.create(mediaType, j10, interfaceC12928g);
            }

            @NotNull
            public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
                return INSTANCE.create(mediaType, str);
            }

            @NotNull
            public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull C12930h c12930h) {
                return INSTANCE.create(mediaType, c12930h);
            }

            @NotNull
            public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
                return INSTANCE.create(mediaType, bArr);
            }

            @NotNull
            public static final ResponseBody create(@NotNull InterfaceC12928g interfaceC12928g, @Nullable MediaType mediaType, long j10) {
                return INSTANCE.create(interfaceC12928g, mediaType, j10);
            }

            @NotNull
            public static final ResponseBody create(@NotNull C12930h c12930h, @Nullable MediaType mediaType) {
                return INSTANCE.create(c12930h, mediaType);
            }

            @NotNull
            public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
                return INSTANCE.create(bArr, mediaType);
            }
        }
