package fw;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.b0;
import ew.j0;
import ew.l0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001<B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020!2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020!2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010#J\u0013\u0010*\u001a\u00020)*\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J%\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0,0\u000e*\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010,*\u00020/H\u0002¢\u0006\u0004\b0\u00101J!\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010,*\u00020/H\u0002¢\u0006\u0004\b2\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00105R-\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0,0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lfw/m;", "Lew/k;", "Ljava/lang/ClassLoader;", "classLoader", BuildConfig.FLAVOR, "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLew/k;)V", "Lew/b0;", "path", "E", "(Lew/b0;)Lew/b0;", "dir", BuildConfig.FLAVOR, "n", "(Lew/b0;)Ljava/util/List;", "file", "Lew/i;", "r", "(Lew/b0;)Lew/i;", "Lew/j;", "p", "(Lew/b0;)Lew/j;", "Lew/l0;", "w", "(Lew/b0;)Lew/l0;", "mustCreate", "Lew/j0;", "u", "(Lew/b0;Z)Lew/j0;", "mustExist", "b", BuildConfig.FLAVOR, "f", "(Lew/b0;Z)V", Payload.SOURCE, "target", "c", "(Lew/b0;Lew/b0;)V", "k", BuildConfig.FLAVOR, "T", "(Lew/b0;)Ljava/lang/String;", "Lkotlin/Pair;", "L", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "N", "(Ljava/net/URL;)Lkotlin/Pair;", "O", "e", "Ljava/lang/ClassLoader;", "Lew/k;", "g", "Lzt/h;", "I", "()Ljava/util/List;", "roots", "h", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends ew.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b0 f16651i = b0.Companion.e(b0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ClassLoader classLoader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.k systemFileSystem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h roots;

    /* JADX INFO: renamed from: fw.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfw/m$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lew/b0;", "base", "d", "(Lew/b0;Lew/b0;)Lew/b0;", "path", BuildConfig.FLAVOR, "c", "(Lew/b0;)Z", "ROOT", "Lew/b0;", "b", "()Lew/b0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b0 b() {
            return m.f16651i;
        }

        public final boolean c(b0 path) {
            return !x.C(path.e(), ".class", true);
        }

        @NotNull
        public final b0 d(@NotNull b0 b0Var, @NotNull b0 base) {
            Intrinsics.checkNotNullParameter(b0Var, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return b().p(x.M(StringsKt.G0(b0Var.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        public Companion() {
        }
    }

    public m(@NotNull ClassLoader classLoader, boolean z10, @NotNull ew.k systemFileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots = zt.i.a(new Function0() { // from class: fw.k
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.K(this.f16649a);
            }
        });
        if (z10) {
            I().size();
        }
    }

    private final b0 E(b0 path) {
        return f16651i.o(path, true);
    }

    public static final List K(m mVar) {
        return mVar.L(mVar.classLoader);
    }

    public static final boolean Q(o entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return INSTANCE.c(entry.getCanonicalPath());
    }

    public final List<Pair<ew.k, b0>> I() {
        return (List) this.roots.getValue();
    }

    public final List<Pair<ew.k, b0>> L(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources(BuildConfig.FLAVOR);
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ArrayList list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = list.get(i11);
            i11++;
            URL url = (URL) obj;
            Intrinsics.checkNotNull(url);
            Pair<ew.k, b0> pairN = N(url);
            if (pairN != null) {
                arrayList.add(pairN);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        int size2 = list2.size();
        while (i10 < size2) {
            Object obj2 = list2.get(i10);
            i10++;
            URL url2 = (URL) obj2;
            Intrinsics.checkNotNull(url2);
            Pair<ew.k, b0> pairO = O(url2);
            if (pairO != null) {
                arrayList2.add(pairO);
            }
        }
        return CollectionsKt.w0(arrayList, arrayList2);
    }

    public final Pair<ew.k, b0> N(URL url) {
        if (Intrinsics.c(url.getProtocol(), "file")) {
            return zt.s.a(this.systemFileSystem, b0.Companion.d(b0.INSTANCE, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    public final Pair<ew.k, b0> O(URL url) {
        int iT0;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!x.T(string, "jar:file:", false, 2, null) || (iT0 = StringsKt.t0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        b0.Companion companion = b0.INSTANCE;
        String strSubstring = string.substring(4, iT0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return zt.s.a(t.i(b0.Companion.d(companion, new File(URI.create(strSubstring)), false, 1, null), this.systemFileSystem, new Function1() { // from class: fw.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.Q((o) obj));
            }
        }), f16651i);
    }

    public final String T(b0 b0Var) {
        return E(b0Var).m(f16651i).toString();
    }

    @Override // ew.k
    @NotNull
    public j0 b(@NotNull b0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // ew.k
    public void c(@NotNull b0 source, @NotNull b0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // ew.k
    public void f(@NotNull b0 dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // ew.k
    public void k(@NotNull b0 path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // ew.k
    @NotNull
    public List<b0> n(@NotNull b0 dir) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strT = T(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair<ew.k, b0> pair : I()) {
            ew.k kVarA = pair.a();
            b0 b0VarB = pair.b();
            try {
                List<b0> listN = kVarA.n(b0VarB.p(strT));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listN) {
                    if (INSTANCE.c((b0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(INSTANCE.d((b0) obj2, b0VarB));
                }
                p001kotlin.collections.u.z(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return CollectionsKt.M0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // ew.k
    @Nullable
    public ew.j p(@NotNull b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!INSTANCE.c(path)) {
            return null;
        }
        String strT = T(path);
        for (Pair<ew.k, b0> pair : I()) {
            ew.j jVarP = pair.a().p(pair.b().p(strT));
            if (jVarP != null) {
                return jVarP;
            }
        }
        return null;
    }

    @Override // ew.k
    @NotNull
    public ew.i r(@NotNull b0 file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!INSTANCE.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strT = T(file);
        for (Pair<ew.k, b0> pair : I()) {
            try {
                return pair.a().r(pair.b().p(strT));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // ew.k
    @NotNull
    public j0 u(@NotNull b0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // ew.k
    @NotNull
    public l0 w(@NotNull b0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!INSTANCE.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        b0 b0Var = f16651i;
        URL resource = this.classLoader.getResource(b0.q(b0Var, file, false, 2, null).m(b0Var).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return ew.v.j(inputStream);
    }

    public /* synthetic */ m(ClassLoader classLoader, boolean z10, ew.k kVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? ew.k.b : kVar);
    }
}
