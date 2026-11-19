package mv;

import com.github.luben.zstd.BuildConfig;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Regex;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\u0018\u0000  2\u00020\u0001:\u0002+.Bc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b\u0004\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b\u0005\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b\f\u0010\u001bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010,R\u0011\u0010<\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010=\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b5\u0010\u001bR\u0011\u0010>\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b.\u0010\u001bR\u0011\u0010?\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b/\u0010\u001bR\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b0\u00108R\u0013\u0010A\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0013\u0010C\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\bB\u0010\u001bR\u0011\u0010E\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bD\u0010)R\u0013\u0010F\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b+\u0010\u001b¨\u0006G"}, d2 = {"Lmv/z;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "scheme", "username", "password", "host", BuildConfig.FLAVOR, "port", BuildConfig.FLAVOR, "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "v", "()Ljava/net/URL;", "Ljava/net/URI;", "u", "()Ljava/net/URI;", "index", "o", "(I)Ljava/lang/String;", "p", "r", "()Ljava/lang/String;", "link", "s", "(Ljava/lang/String;)Lmv/z;", "Lmv/z$a;", "j", "()Lmv/z$a;", "k", "(Ljava/lang/String;)Lmv/z$a;", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "a", "Ljava/lang/String;", "t", "b", "c", "d", "h", "e", "I", "m", "f", "Ljava/util/List;", "l", "()Ljava/util/List;", "g", "i", "()Z", "isHttps", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "n", "query", "q", "querySize", "encodedFragment", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String scheme;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String username;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String password;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int port;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> pathSegments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<String> queryNamesAndValues;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String fragment;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001e*\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\"J'\u0010$\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\"J'\u0010%\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\"J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b*\u0010(J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\b¢\u0006\u0004\b,\u0010(J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b.\u0010(J\u0015\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b3\u0010(J\u0017\u00105\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b5\u0010(J\u001f\u00108\u001a\u00020\u00002\u0006\u00106\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b<\u00109J\u000f\u0010=\u001a\u00020\u0000H\u0000¢\u0006\u0004\b=\u0010>J\r\u0010@\u001a\u00020?¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\bH\u0016¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010?2\u0006\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\bE\u0010FR$\u0010&\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010G\u001a\u0004\bH\u0010C\"\u0004\bI\u0010JR\"\u0010M\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010G\u001a\u0004\bK\u0010C\"\u0004\bL\u0010JR\"\u0010P\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010G\u001a\u0004\bN\u0010C\"\u0004\bO\u0010JR$\u0010-\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010G\u001a\u0004\bQ\u0010C\"\u0004\bR\u0010JR\"\u0010/\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010S\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010VR \u0010Z\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bW\u0010YR,\u0010^\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010X\u001a\u0004\b[\u0010Y\"\u0004\b\\\u0010]R$\u0010a\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010G\u001a\u0004\b_\u0010C\"\u0004\b`\u0010J¨\u0006b"}, d2 = {"Lmv/z$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "d", "()I", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", BuildConfig.FLAVOR, "C", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "input", "startPos", "limit", "s", "(Ljava/lang/String;II)V", "pos", BuildConfig.FLAVOR, "addTrailingSlash", "alreadyEncoded", "p", "(Ljava/lang/String;IIZZ)V", "m", "h", "(Ljava/lang/String;)Z", "i", BuildConfig.FLAVOR, "D", "(Ljava/lang/String;)Ljava/util/List;", "u", "(Ljava/lang/String;II)I", "B", "o", "k", "scheme", "t", "(Ljava/lang/String;)Lmv/z$a;", "username", "E", "password", "l", "host", "g", "port", "n", "(I)Lmv/z$a;", "query", "q", "encodedQuery", "e", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lmv/z$a;", "encodedName", "encodedValue", "a", "r", "()Lmv/z$a;", "Lmv/z;", "c", "()Lmv/z;", "toString", "()Ljava/lang/String;", "base", "j", "(Lmv/z;Ljava/lang/String;)Lmv/z$a;", "Ljava/lang/String;", "getScheme$okhttp", "A", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "x", "encodedUsername", "getEncodedPassword$okhttp", "w", "encodedPassword", "getHost$okhttp", "y", "I", "getPort$okhttp", "z", "(I)V", "f", "Ljava/util/List;", "()Ljava/util/List;", "encodedPathSegments", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp", "v", "encodedFragment", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String scheme;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String host;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<String> encodedQueryNamesAndValues;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String encodedFragment;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String encodedUsername = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String encodedPassword = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int port = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> encodedPathSegments = p001kotlin.collections.p.p(BuildConfig.FLAVOR);

        public final void A(@Nullable String str) {
            this.scheme = str;
        }

        public final int B(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '/' && cCharAt != '\\') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public final void C(List<String> list, StringBuilder sb2) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> D(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iM0 = StringsKt.m0(str2, '&', i10, false, 4, null);
                if (iM0 == -1) {
                    iM0 = str2.length();
                }
                int iM1 = StringsKt.m0(str2, '=', i10, false, 4, null);
                if (iM1 == -1 || iM1 > iM0) {
                    String strSubstring = str2.substring(i10, iM0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iM1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iM1 + 1, iM0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i10 = iM0 + 1;
                str = str2;
            }
            return arrayList;
        }

        @NotNull
        public final a E(@NotNull String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.encodedUsername = cw.a.b(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        @NotNull
        public final a a(@NotNull String encodedName, @Nullable String encodedValue) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(cw.a.b(encodedName, 0, 0, " \"'<>#&=", true, false, true, false, 83, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(encodedValue != null ? cw.a.b(encodedValue, 0, 0, " \"'<>#&=", true, false, true, false, 83, null) : null);
            return this;
        }

        @NotNull
        public final a b(@NotNull String name, @Nullable String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(cw.a.b(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(value != null ? cw.a.b(value, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null) : null);
            return this;
        }

        @NotNull
        public final z c() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strG = cw.a.g(this.encodedUsername, 0, 0, false, 7, null);
            String strG2 = cw.a.g(this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iD = d();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(cw.a.g((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(p001kotlin.collections.q.u(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? cw.a.g(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new z(str, strG, strG2, str2, iD, arrayList2, arrayList, str4 != null ? cw.a.g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final int d() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = z.INSTANCE;
            String str = this.scheme;
            Intrinsics.checkNotNull(str);
            return companion.b(str);
        }

        @NotNull
        public final a e(@Nullable String encodedQuery) {
            String strB;
            this.encodedQueryNamesAndValues = (encodedQuery == null || (strB = cw.a.b(encodedQuery, 0, 0, " \"'<>#", true, false, true, false, 83, null)) == null) ? null : D(strB);
            return this;
        }

        @NotNull
        public final List<String> f() {
            return this.encodedPathSegments;
        }

        @NotNull
        public final a g(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strK = nv.l.k(cw.a.g(host, 0, 0, false, 7, null));
            if (strK != null) {
                this.host = strK;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final boolean h(String input) {
            return Intrinsics.c(input, ".") || p001kotlin.text.x.E(input, "%2e", true);
        }

        public final boolean i(String input) {
            return Intrinsics.c(input, "..") || p001kotlin.text.x.E(input, "%2e.", true) || p001kotlin.text.x.E(input, ".%2e", true) || p001kotlin.text.x.E(input, "%2e%2e", true);
        }

        @NotNull
        public final a j(@Nullable z base, @NotNull String input) {
            int iK;
            boolean z10;
            int i10;
            int i11;
            char c10;
            String input2 = input;
            Intrinsics.checkNotNullParameter(input2, "input");
            int iR = nv.n.r(input2, 0, 0, 3, null);
            int iT = nv.n.t(input2, iR, 0, 2, null);
            int iU = u(input2, iR, iT);
            boolean z11 = true;
            if (iU != -1) {
                if (p001kotlin.text.x.Q(input2, "https:", iR, true)) {
                    this.scheme = "https";
                    iR += 6;
                } else {
                    if (!p001kotlin.text.x.Q(input2, "http:", iR, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input2.substring(0, iU);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = "http";
                    iR += 5;
                }
            } else {
                if (base == null) {
                    if (input2.length() > 6) {
                        input2 = p001kotlin.text.c0.z1(input2, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input2);
                }
                this.scheme = base.getScheme();
            }
            int iB = B(input2, iR, iT);
            char c11 = '?';
            char c12 = '#';
            if (iB >= 2 || base == null || !Intrinsics.c(base.getScheme(), this.scheme)) {
                boolean z12 = false;
                boolean z13 = false;
                int i12 = iR + iB;
                while (true) {
                    iK = nv.n.k(input2, "@/\\?#", i12, iT);
                    byte bCharAt = iK != iT ? input2.charAt(iK) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c12 || bCharAt == 47 || bCharAt == 92 || bCharAt == c11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z12) {
                            z10 = z11;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            input2 = input;
                            i10 = iK;
                            sb3.append(cw.a.b(input2, i12, iK, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.encodedPassword = sb3.toString();
                        } else {
                            int iJ = nv.n.j(input2, ':', i12, iK);
                            z10 = z11;
                            String strB = cw.a.b(input2, i12, iJ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z13) {
                                strB = this.encodedUsername + "%40" + strB;
                            }
                            this.encodedUsername = strB;
                            if (iJ != iK) {
                                i11 = iK;
                                this.encodedPassword = cw.a.b(input, iJ + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z12 = z10;
                            } else {
                                i11 = iK;
                            }
                            input2 = input;
                            i10 = i11;
                            z13 = z10;
                        }
                        i12 = i10 + 1;
                        z11 = z10;
                        c12 = '#';
                        c11 = '?';
                    }
                }
                int iO = o(input2, i12, iK);
                int i13 = iO + 1;
                if (i13 < iK) {
                    this.host = nv.l.k(cw.a.g(input2, i12, iO, false, 4, null));
                    int iK2 = k(input2, i13, iK);
                    this.port = iK2;
                    if (iK2 == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input2.substring(i13, iK);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.host = nv.l.k(cw.a.g(input2, i12, iO, false, 4, null));
                    Companion companion = z.INSTANCE;
                    String str = this.scheme;
                    Intrinsics.checkNotNull(str);
                    this.port = companion.b(str);
                }
                if (this.host == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input2.substring(i12, iO);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iR = iK;
            } else {
                this.encodedUsername = base.f();
                this.encodedPassword = base.b();
                this.host = base.getHost();
                this.port = base.getPort();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.d());
                if (iR == iT || input2.charAt(iR) == '#') {
                    e(base.e());
                }
            }
            int iK3 = nv.n.k(input2, "?#", iR, iT);
            s(input2, iR, iK3);
            if (iK3 >= iT || input2.charAt(iK3) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iJ2 = nv.n.j(input2, '#', iK3, iT);
                this.encodedQueryNamesAndValues = D(cw.a.b(input2, iK3 + 1, iJ2, " \"'<>#", true, false, true, false, 80, null));
                iK3 = iJ2;
            }
            if (iK3 < iT && input2.charAt(iK3) == c10) {
                this.encodedFragment = cw.a.b(input2, iK3 + 1, iT, BuildConfig.FLAVOR, true, false, false, true, 48, null);
            }
            return this;
        }

        public final int k(String input, int pos, int limit) {
            try {
                int i10 = Integer.parseInt(cw.a.b(input, pos, limit, BuildConfig.FLAVOR, false, false, false, false, 120, null));
                if (1 > i10 || i10 >= 65536) {
                    return -1;
                }
                return i10;
            } catch (NumberFormatException unused) {
            }
        }

        @NotNull
        public final a l(@NotNull String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.encodedPassword = cw.a.b(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final void m() {
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(BuildConfig.FLAVOR);
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, BuildConfig.FLAVOR);
            }
        }

        @NotNull
        public final a n(int port) {
            if (1 <= port && port < 65536) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + port).toString());
        }

        public final int o(String input, int pos, int limit) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (cCharAt == ':') {
                    return pos;
                }
                if (cCharAt == '[') {
                    do {
                        pos++;
                        if (pos >= limit) {
                            break;
                        }
                    } while (input.charAt(pos) != ']');
                }
                pos++;
            }
            return limit;
        }

        public final void p(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strB = cw.a.b(input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, false, 112, null);
            if (h(strB)) {
                return;
            }
            if (i(strB)) {
                m();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strB);
            } else {
                this.encodedPathSegments.add(strB);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add(BuildConfig.FLAVOR);
            }
        }

        @NotNull
        public final a q(@Nullable String query) {
            String strB;
            this.encodedQueryNamesAndValues = (query == null || (strB = cw.a.b(query, 0, 0, " \"'<>#", false, false, true, false, 91, null)) == null) ? null : D(strB);
            return this;
        }

        @NotNull
        public final a r() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").replace(str, BuildConfig.FLAVOR) : null;
            int size = this.encodedPathSegments.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.encodedPathSegments;
                list.set(i10, cw.a.b(list.get(i10), 0, 0, "[]", true, true, false, false, 99, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? cw.a.b(str2, 0, 0, "\\^`{|}", true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? cw.a.b(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35, null) : null;
            return this;
        }

        public final void s(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add(BuildConfig.FLAVOR);
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, BuildConfig.FLAVOR);
            }
            int i10 = startPos;
            while (i10 < limit) {
                int iK = nv.n.k(input, "/\\", i10, limit);
                boolean z10 = iK < limit;
                input = input;
                p(input, i10, iK, z10, true);
                i10 = z10 ? iK + 1 : iK;
            }
        }

        @NotNull
        public final a t(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (p001kotlin.text.x.E(scheme, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (p001kotlin.text.x.E(scheme, "https", true)) {
                this.scheme = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt.Z(str2, ':', false, 2, null)) {
                    sb2.append('[');
                    sb2.append(this.host);
                    sb2.append(']');
                } else {
                    sb2.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iD = d();
                String str3 = this.scheme;
                if (str3 != null) {
                    Companion companion = z.INSTANCE;
                    Intrinsics.checkNotNull(str3);
                    if (iD != companion.b(str3)) {
                        sb2.append(':');
                        sb2.append(iD);
                    }
                } else {
                    sb2.append(':');
                    sb2.append(iD);
                }
            }
            C(this.encodedPathSegments, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                Companion companion2 = z.INSTANCE;
                List<String> list = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list);
                companion2.e(list, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            return sb2.toString();
        }

        public final int u(String input, int pos, int limit) {
            if (limit - pos < 2) {
                return -1;
            }
            char cCharAt = input.charAt(pos);
            if ((Intrinsics.f(cCharAt, 97) >= 0 && Intrinsics.f(cCharAt, 122) <= 0) || (Intrinsics.f(cCharAt, 65) >= 0 && Intrinsics.f(cCharAt, 90) <= 0)) {
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        break;
                    }
                    char cCharAt2 = input.charAt(pos);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return pos;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public final void v(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void w(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final void x(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void y(@Nullable String str) {
            this.host = str;
        }

        public final void z(int i10) {
            this.port = i10;
        }
    }

    /* JADX INFO: renamed from: mv.z$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0012\u001a\u00020\u0011*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmv/z$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "scheme", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;)I", "Lmv/z;", "c", "(Ljava/lang/String;)Lmv/z;", "d", BuildConfig.FLAVOR, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", BuildConfig.FLAVOR, "e", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int b(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.c(scheme, "http")) {
                return 80;
            }
            return Intrinsics.c(scheme, "https") ? 443 : -1;
        }

        @NotNull
        public final z c(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().j(null, str).c();
        }

        @Nullable
        public final z d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final void e(List<String> list, StringBuilder sb2) {
            p001kotlin.ranges.a aVarP = p001kotlin.ranges.d.p(p001kotlin.ranges.d.q(0, list.size()), 2);
            int first = aVarP.getFirst();
            int last = aVarP.getLast();
            int step = aVarP.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ z(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i10, list, list2, str5, str6);
    }

    @NotNull
    public static final z g(@NotNull String str) {
        return INSTANCE.c(str);
    }

    @Nullable
    public final String a() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(StringsKt.m0(this.url, '#', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final String b() {
        if (this.password.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        String strSubstring = this.url.substring(StringsKt.m0(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1, StringsKt.m0(this.url, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final String c() {
        int iM0 = StringsKt.m0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        String strSubstring = this.url.substring(iM0, nv.n.k(str, "?#", iM0, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final List<String> d() {
        int iM0 = StringsKt.m0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iK = nv.n.k(str, "?#", iM0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM0 < iK) {
            int i10 = iM0 + 1;
            int iJ = nv.n.j(this.url, '/', i10, iK);
            String strSubstring = this.url.substring(i10, iJ);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iM0 = iJ;
        }
        return arrayList;
    }

    @Nullable
    public final String e() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iM0 = StringsKt.m0(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iM0, nv.n.j(str, '#', iM0, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof z) && Intrinsics.c(((z) other).url, this.url);
    }

    @NotNull
    public final String f() {
        if (this.username.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, nv.n.k(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final boolean i() {
        return Intrinsics.c(this.scheme, "https");
    }

    @NotNull
    public final a j() {
        a aVar = new a();
        aVar.A(this.scheme);
        aVar.x(f());
        aVar.w(b());
        aVar.y(this.host);
        aVar.z(this.port != INSTANCE.b(this.scheme) ? this.port : -1);
        aVar.f().clear();
        aVar.f().addAll(d());
        aVar.e(e());
        aVar.v(a());
        return aVar;
    }

    @Nullable
    public final a k(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().j(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @NotNull
    public final List<String> l() {
        return this.pathSegments;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @Nullable
    public final String n() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.e(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    @NotNull
    public final String o(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        Intrinsics.checkNotNull(str);
        return str;
    }

    @Nullable
    public final String p(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int q() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String r() {
        a aVarK = k("/...");
        Intrinsics.checkNotNull(aVarK);
        return aVarK.E(BuildConfig.FLAVOR).l(BuildConfig.FLAVOR).c().getUrl();
    }

    @Nullable
    public final z s(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarK = k(link);
        if (aVarK != null) {
            return aVarK.c();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @NotNull
    public final URI u() {
        String string = j().r().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, BuildConfig.FLAVOR));
                Intrinsics.checkNotNull(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    @NotNull
    public final URL v() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public z(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i10;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }
}
