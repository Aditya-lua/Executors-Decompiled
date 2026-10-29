package p588yu;

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
import kotlin.collections.C7701q;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.C7352s;
import p229jt.InterfaceC7341h;
import p560xu.AbstractC12934j;
import p560xu.AbstractC12938l;
import p560xu.C12919b0;
import p560xu.C12931h0;
import p560xu.C12936k;
import p560xu.InterfaceC12947p0;
import p560xu.InterfaceC12951r0;

/* JADX INFO: renamed from: yu.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u00017B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020%2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010'J\u001f\u0010,\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010*J\u0013\u0010.\u001a\u00020-*\u00020\tH\u0002¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t000\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102J!\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u000100*\u000203H\u0002¢\u0006\u0004\b4\u00105J!\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u000100*\u000203H\u0002¢\u0006\u0004\b6\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R-\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t000\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m31665d2 = {"Lyu/m;", "Lxu/l;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLxu/l;)V", "Lxu/h0;", "path", "d", "(Lxu/h0;)Lxu/h0;", "canonicalize", "dir", "", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "Lxu/k;", "metadataOrNull", "(Lxu/h0;)Lxu/k;", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "delete", "createSymlink", "", "m", "(Lxu/h0;)Ljava/lang/String;", "Lkotlin/Pair;", "g", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "h", "(Ljava/net/URL;)Lkotlin/Pair;", "j", "a", "Ljava/lang/ClassLoader;", "b", "Lxu/l;", "c", "Ljt/h;", "e", "()Ljava/util/List;", "roots", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13464m extends AbstractC12938l {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C12931h0 f47147e = C12931h0.Companion.m48135e(C12931h0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ClassLoader classLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12938l systemFileSystem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h roots;

    /* JADX INFO: renamed from: yu.m$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lyu/m$a;", "", "<init>", "()V", "Lxu/h0;", "base", "d", "(Lxu/h0;Lxu/h0;)Lxu/h0;", "path", "", "c", "(Lxu/h0;)Z", "ROOT", "Lxu/h0;", "b", "()Lxu/h0;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: yu.m.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C12931h0 m49121b() {
            return C13464m.f47147e;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m49122c(C12931h0 path) {
            return !C7797x.m32292C(path.m48125e(), ".class", true);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C12931h0 m49123d(@NotNull C12931h0 c12931h0, @NotNull C12931h0 base) {
            Intrinsics.checkNotNullParameter(c12931h0, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return m49121b().m48129n(C7797x.m32302M(StringsKt.m32126G0(c12931h0.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13464m(@NotNull ClassLoader classLoader, boolean z10, @NotNull AbstractC12938l systemFileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots = C7342i.m30456b(new Function0() { // from class: yu.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13464m.m49113f(this.f47145a);
            }
        });
        if (z10) {
            m49115e().size();
        }
    }

    /* JADX INFO: renamed from: d */
    private final C12931h0 m49112d(C12931h0 path) {
        return f47147e.m48131q(path, true);
    }

    /* JADX INFO: renamed from: f */
    public static final List m49113f(C13464m c13464m) {
        return c13464m.m49116g(c13464m.classLoader);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m49114l(C13466o entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return INSTANCE.m49122c(entry.getCanonicalPath());
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 appendingSink(@NotNull C12931h0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // p560xu.AbstractC12938l
    public void atomicMove(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public C12931h0 canonicalize(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return m49112d(path);
    }

    @Override // p560xu.AbstractC12938l
    public void createDirectory(@NotNull C12931h0 dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // p560xu.AbstractC12938l
    public void createSymlink(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // p560xu.AbstractC12938l
    public void delete(@NotNull C12931h0 path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    /* JADX INFO: renamed from: e */
    public final List<Pair<AbstractC12938l, C12931h0>> m49115e() {
        return (List) this.roots.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final List<Pair<AbstractC12938l, C12931h0>> m49116g(ClassLoader classLoader) throws IOException {
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
            Pair<AbstractC12938l, C12931h0> pairM49117h = m49117h(url);
            if (pairM49117h != null) {
                arrayList.add(pairM49117h);
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
            Pair<AbstractC12938l, C12931h0> pairM49118j = m49118j(url2);
            if (pairM49118j != null) {
                arrayList2.add(pairM49118j);
            }
        }
        return CollectionsKt.m31725w0(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: h */
    public final Pair<AbstractC12938l, C12931h0> m49117h(URL url) {
        if (Intrinsics.m31980c(url.getProtocol(), "file")) {
            return C7352s.m30477a(this.systemFileSystem, C12931h0.Companion.m48134d(C12931h0.INSTANCE, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final Pair<AbstractC12938l, C12931h0> m49118j(URL url) {
        int iT0;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!C7797x.m32309T(string, "jar:file:", false, 2, null) || (iT0 = StringsKt.m32190t0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        C12931h0.Companion companion = C12931h0.INSTANCE;
        String strSubstring = string.substring(4, iT0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return C7352s.m30477a(C13471t.m49143i(C12931h0.Companion.m48134d(companion, new File(URI.create(strSubstring)), false, 1, null), this.systemFileSystem, new Function1() { // from class: yu.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C13464m.m49114l((C13466o) obj));
            }
        }), f47147e);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public List<C12931h0> list(@NotNull C12931h0 dir) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strM49119m = m49119m(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair<AbstractC12938l, C12931h0> pair : m49115e()) {
            AbstractC12938l abstractC12938lM31671a = pair.m31671a();
            C12931h0 c12931h0M31672b = pair.m31672b();
            try {
                List<C12931h0> list = abstractC12938lM31671a.list(c12931h0M31672b.m48129n(strM49119m));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (INSTANCE.m49122c((C12931h0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C7701q.m31905u(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(INSTANCE.m49123d((C12931h0) obj2, c12931h0M31672b));
                }
                C7708u.m31931z(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return CollectionsKt.m31687M0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // p560xu.AbstractC12938l
    @Nullable
    public List<C12931h0> listOrNull(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strM49119m = m49119m(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<AbstractC12938l, C12931h0>> it = m49115e().iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<AbstractC12938l, C12931h0> next = it.next();
            AbstractC12938l abstractC12938lM31671a = next.m31671a();
            C12931h0 c12931h0M31672b = next.m31672b();
            List<C12931h0> listListOrNull = abstractC12938lM31671a.listOrNull(c12931h0M31672b.m48129n(strM49119m));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (INSTANCE.m49122c((C12931h0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C7701q.m31905u(arrayList2, 10));
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    arrayList3.add(INSTANCE.m49123d((C12931h0) obj2, c12931h0M31672b));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                C7708u.m31931z(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return CollectionsKt.m31687M0(linkedHashSet);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final String m49119m(C12931h0 c12931h0) {
        return m49112d(c12931h0).m48128l(f47147e).toString();
    }

    @Override // p560xu.AbstractC12938l
    @Nullable
    public C12936k metadataOrNull(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!INSTANCE.m49122c(path)) {
            return null;
        }
        String strM49119m = m49119m(path);
        for (Pair<AbstractC12938l, C12931h0> pair : m49115e()) {
            C12936k c12936kMetadataOrNull = pair.m31671a().metadataOrNull(pair.m31672b().m48129n(strM49119m));
            if (c12936kMetadataOrNull != null) {
                return c12936kMetadataOrNull;
            }
        }
        return null;
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadOnly(@NotNull C12931h0 file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!INSTANCE.m49122c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strM49119m = m49119m(file);
        for (Pair<AbstractC12938l, C12931h0> pair : m49115e()) {
            try {
                return pair.m31671a().openReadOnly(pair.m31672b().m48129n(strM49119m));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadWrite(@NotNull C12931h0 file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 sink(@NotNull C12931h0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12951r0 source(@NotNull C12931h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!INSTANCE.m49122c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        C12931h0 c12931h0 = f47147e;
        URL resource = this.classLoader.getResource(C12931h0.m48120r(c12931h0, file, false, 2, null).m48128l(c12931h0).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return C12919b0.m47968j(inputStream);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (r1v0 java.lang.ClassLoader)
      (r2v0 boolean)
      (wrap xu.l:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap xu.l:0x0004: SGET  A[WRAPPED] (LINE:6) xu.l.SYSTEM xu.l) : (r3v0 xu.l))
     A[MD:(java.lang.ClassLoader, boolean, xu.l):void (m)] (LINE:7) call: yu.m.<init>(java.lang.ClassLoader, boolean, xu.l):void type: THIS */
    public /* synthetic */ C13464m(ClassLoader classLoader, boolean z10, AbstractC12938l abstractC12938l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? AbstractC12938l.SYSTEM : abstractC12938l);
    }
}
