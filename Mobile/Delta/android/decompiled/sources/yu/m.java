package yu;

import com.appsflyer.sdk_base.referrer.Payload;
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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.b0;
import xu.h0;
import xu.p0;
import xu.r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u00017B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020%2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010'J\u001f\u0010,\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010*J\u0013\u0010.\u001a\u00020-*\u00020\tH\u0002¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t000\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102J!\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u000100*\u000203H\u0002¢\u0006\u0004\b4\u00105J!\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u000100*\u000203H\u0002¢\u0006\u0004\b6\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R-\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t000\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lyu/m;", "Lxu/l;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLxu/l;)V", "Lxu/h0;", "path", "d", "(Lxu/h0;)Lxu/h0;", "canonicalize", "dir", "", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "Lxu/k;", "metadataOrNull", "(Lxu/h0;)Lxu/k;", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "delete", "createSymlink", "", "m", "(Lxu/h0;)Ljava/lang/String;", "Lkotlin/Pair;", "g", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "h", "(Ljava/net/URL;)Lkotlin/Pair;", "j", "a", "Ljava/lang/ClassLoader;", "b", "Lxu/l;", "c", "Ljt/h;", "e", "()Ljava/util/List;", "roots", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends xu.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final h0 f36387e = h0.Companion.e(h0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ClassLoader classLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final xu.l systemFileSystem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h roots;

    /* JADX INFO: renamed from: yu.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyu/m$a;", "", "<init>", "()V", "Lxu/h0;", "base", "d", "(Lxu/h0;Lxu/h0;)Lxu/h0;", "path", "", "c", "(Lxu/h0;)Z", "ROOT", "Lxu/h0;", "b", "()Lxu/h0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h0 b() {
            return m.f36387e;
        }

        public final boolean c(h0 path) {
            return !x.C(path.e(), ".class", true);
        }

        @NotNull
        public final h0 d(@NotNull h0 h0Var, @NotNull h0 base) {
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return b().n(x.M(StringsKt.G0(h0Var.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        public Companion() {
        }
    }

    public m(@NotNull ClassLoader classLoader, boolean z10, @NotNull xu.l systemFileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots = jt.i.b(new Function0() { // from class: yu.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.f(this.f36385a);
            }
        });
        if (z10) {
            e().size();
        }
    }

    private final h0 d(h0 path) {
        return f36387e.q(path, true);
    }

    public static final List f(m mVar) {
        return mVar.g(mVar.classLoader);
    }

    public static final boolean l(o entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return INSTANCE.c(entry.getCanonicalPath());
    }

    @Override // xu.l
    @NotNull
    public p0 appendingSink(@NotNull h0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // xu.l
    public void atomicMove(@NotNull h0 source, @NotNull h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // xu.l
    @NotNull
    public h0 canonicalize(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return d(path);
    }

    @Override // xu.l
    public void createDirectory(@NotNull h0 dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // xu.l
    public void createSymlink(@NotNull h0 source, @NotNull h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // xu.l
    public void delete(@NotNull h0 path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    public final List<Pair<xu.l, h0>> e() {
        return (List) this.roots.getValue();
    }

    public final List<Pair<xu.l, h0>> g(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
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
            Pair<xu.l, h0> pairH = h(url);
            if (pairH != null) {
                arrayList.add(pairH);
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
            Pair<xu.l, h0> pairJ = j(url2);
            if (pairJ != null) {
                arrayList2.add(pairJ);
            }
        }
        return CollectionsKt.w0(arrayList, arrayList2);
    }

    public final Pair<xu.l, h0> h(URL url) {
        if (Intrinsics.c(url.getProtocol(), "file")) {
            return jt.s.a(this.systemFileSystem, h0.Companion.d(h0.INSTANCE, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    public final Pair<xu.l, h0> j(URL url) {
        int iT0;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!x.T(string, "jar:file:", false, 2, null) || (iT0 = StringsKt.t0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        h0.Companion companion = h0.INSTANCE;
        String strSubstring = string.substring(4, iT0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return jt.s.a(t.i(h0.Companion.d(companion, new File(URI.create(strSubstring)), false, 1, null), this.systemFileSystem, new Function1() { // from class: yu.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.l((o) obj));
            }
        }), f36387e);
    }

    @Override // xu.l
    @NotNull
    public List<h0> list(@NotNull h0 dir) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strM = m(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair<xu.l, h0> pair : e()) {
            xu.l lVarA = pair.a();
            h0 h0VarB = pair.b();
            try {
                List<h0> list = lVarA.list(h0VarB.n(strM));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (INSTANCE.c((h0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(INSTANCE.d((h0) obj2, h0VarB));
                }
                kotlin.collections.u.z(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return CollectionsKt.M0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // xu.l
    @Nullable
    public List<h0> listOrNull(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strM = m(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<xu.l, h0>> it = e().iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<xu.l, h0> next = it.next();
            xu.l lVarA = next.a();
            h0 h0VarB = next.b();
            List<h0> listListOrNull = lVarA.listOrNull(h0VarB.n(strM));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (INSTANCE.c((h0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(kotlin.collections.q.u(arrayList2, 10));
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    arrayList3.add(INSTANCE.d((h0) obj2, h0VarB));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                kotlin.collections.u.z(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return CollectionsKt.M0(linkedHashSet);
        }
        return null;
    }

    public final String m(h0 h0Var) {
        return d(h0Var).l(f36387e).toString();
    }

    @Override // xu.l
    @Nullable
    public xu.k metadataOrNull(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!INSTANCE.c(path)) {
            return null;
        }
        String strM = m(path);
        for (Pair<xu.l, h0> pair : e()) {
            xu.k kVarMetadataOrNull = pair.a().metadataOrNull(pair.b().n(strM));
            if (kVarMetadataOrNull != null) {
                return kVarMetadataOrNull;
            }
        }
        return null;
    }

    @Override // xu.l
    @NotNull
    public xu.j openReadOnly(@NotNull h0 file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!INSTANCE.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strM = m(file);
        for (Pair<xu.l, h0> pair : e()) {
            try {
                return pair.a().openReadOnly(pair.b().n(strM));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // xu.l
    @NotNull
    public xu.j openReadWrite(@NotNull h0 file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // xu.l
    @NotNull
    public p0 sink(@NotNull h0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // xu.l
    @NotNull
    public r0 source(@NotNull h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!INSTANCE.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        h0 h0Var = f36387e;
        URL resource = this.classLoader.getResource(h0.r(h0Var, file, false, 2, null).l(h0Var).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return b0.j(inputStream);
    }

    public /* synthetic */ m(ClassLoader classLoader, boolean z10, xu.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? xu.l.SYSTEM : lVar);
    }
}
