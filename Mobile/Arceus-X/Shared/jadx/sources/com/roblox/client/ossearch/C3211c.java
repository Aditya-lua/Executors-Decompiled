package com.roblox.client.ossearch;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.roblox.client.RobloxApplication;
import com.roblox.client.ossearch.C3211c;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p477ut.C11958c;
import p477ut.C11966k;
import p605zi.C13813a;

/* JADX INFO: renamed from: com.roblox.client.ossearch.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006*\u0001\u001c\u0018\u0000  2\u00020\u0001:\u0001\u0016B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m31665d2 = {"Lcom/roblox/client/ossearch/c;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "thumbnailId", "Landroid/graphics/Bitmap;", "i", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "", "k", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Z", "", "f", "()V", "Ljava/io/File;", "l", "(Ljava/lang/String;)Ljava/io/File;", "", "a", "I", "maxEntries", "b", "Ljava/io/File;", "cacheDir", "com/roblox/client/ossearch/c$b", "c", "Lcom/roblox/client/ossearch/c$b;", "lru", "d", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3211c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final InterfaceC7341h<C3211c> f11959e = C7342i.m30456b(new Function0() { // from class: zi.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C3211c.m15331j();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxEntries;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File cacheDir;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final b lru;

    /* JADX INFO: renamed from: com.roblox.client.ossearch.c$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lcom/roblox/client/ossearch/c$a;", "", "<init>", "()V", "Lcom/roblox/client/ossearch/c;", "instance$delegate", "Ljt/h;", "a", "()Lcom/roblox/client/ossearch/c;", "instance", "", "TAG", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.ossearch.c.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3211c m15336a() {
            return (C3211c) C3211c.f11959e.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.c$b */
    @Metadata(m31664d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"com/roblox/client/ossearch/c$b", "Ljava/util/LinkedHashMap;", "", "Ljava/io/File;", "Lkotlin/collections/LinkedHashMap;", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends LinkedHashMap<String, File> {
        public b(int i10) {
            super(i10, 0.75f, true);
        }

        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean m15337a(String str) {
            return super.containsKey(str);
        }

        /* JADX INFO: renamed from: b */
        public /* bridge */ boolean m15338b(File file) {
            return super.containsValue(file);
        }

        /* JADX INFO: renamed from: c */
        public /* bridge */ File m15339c(String str) {
            return (File) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return m15337a((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof File) {
                return m15338b((File) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public /* bridge */ Set<Map.Entry<String, File>> m15340e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, File>> entrySet() {
            return m15340e();
        }

        /* JADX INFO: renamed from: f */
        public /* bridge */ Set<String> m15341f() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return m15339c((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : m15342i((String) obj, (File) obj2);
        }

        /* JADX INFO: renamed from: i */
        public /* bridge */ File m15342i(String str, File file) {
            return (File) super.getOrDefault(str, file);
        }

        /* JADX INFO: renamed from: j */
        public /* bridge */ int m15343j() {
            return super.size();
        }

        /* JADX INFO: renamed from: k */
        public /* bridge */ Collection<File> m15344k() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return m15341f();
        }

        /* JADX INFO: renamed from: n */
        public /* bridge */ File m15345n(String str) {
            return (File) super.remove(str);
        }

        /* JADX INFO: renamed from: o */
        public /* bridge */ boolean m15346o(String str, File file) {
            return super.remove(str, file);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return m15345n((String) obj);
            }
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry<java.lang.String, ? extends java.io.File>] */
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, File> eldest) {
            Intrinsics.checkNotNullParameter(eldest, "eldest");
            if (size() <= C3211c.this.maxEntries) {
                return false;
            }
            if (eldest.getValue().delete()) {
                return true;
            }
            C6124q.m27066k("ShortcutThumbnailCache", "Failed to delete evicted thumbnail: " + ((Object) eldest.getKey()));
            return true;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m15343j();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<File> values() {
            return m15344k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof File)) {
                return m15346o((String) obj, (File) obj2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.c$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(Long.valueOf(((File) t8).lastModified()), Long.valueOf(((File) t10).lastModified()));
        }
    }

    public C3211c(@NotNull Context context) {
        List<File> listM31863f0;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMax = Math.max(C13813a.m50293a(context), 0);
        this.maxEntries = iMax;
        File file = new File(context.getCacheDir(), "ossearch_thumbnails");
        file.mkdirs();
        this.cacheDir = file;
        this.lru = new b(iMax);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || (listM31863f0 = C7693m.m31863f0(fileArrListFiles, new c())) == null) {
            return;
        }
        for (File file2 : listM31863f0) {
            b bVar = this.lru;
            Intrinsics.checkNotNull(file2);
            bVar.put(C11966k.m44659q(file2), file2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m15329g(String str, File file) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(file, "file");
        file.delete();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m15330h(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: j */
    public static final C3211c m15331j() {
        Context contextM14834f = RobloxApplication.m14834f();
        Intrinsics.checkNotNullExpressionValue(contextM14834f, "getAppContext(...)");
        return new C3211c(contextM14834f);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m15332f() {
        b bVar = this.lru;
        final Function2 function2 = new Function2() { // from class: zi.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3211c.m15329g((String) obj, (File) obj2);
            }
        };
        bVar.forEach(new BiConsumer() { // from class: zi.d
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C3211c.m15330h(function2, obj, obj2);
            }
        });
        this.lru.clear();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final synchronized Bitmap m15333i(@NotNull String thumbnailId) {
        Intrinsics.checkNotNullParameter(thumbnailId, "thumbnailId");
        File file = (File) this.lru.get(thumbnailId);
        if (file == null) {
            C6124q.m27057b("ShortcutThumbnailCache", "Cache miss for thumbnail: " + thumbnailId);
            return null;
        }
        C6124q.m27057b("ShortcutThumbnailCache", "Cache hit for thumbnail: " + thumbnailId);
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    /* JADX INFO: renamed from: k */
    public final synchronized boolean m15334k(@NotNull String thumbnailId, @NotNull Bitmap bitmap) {
        Object objM30460b;
        try {
            Intrinsics.checkNotNullParameter(thumbnailId, "thumbnailId");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            File fileM15335l = m15335l(thumbnailId);
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                FileOutputStream fileOutputStream = new FileOutputStream(fileM15335l);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    C11958c.m44629a(fileOutputStream, null);
                    this.lru.put(thumbnailId, fileM15335l);
                    objM30460b = C7347n.m30460b(Unit.f29331a);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th4));
            }
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                C6124q.m27060e("ShortcutThumbnailCache", "Failed to cache thumbnail with id " + thumbnailId + ". Error: " + thM30463e.getMessage());
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return C7347n.m30466h(objM30460b);
    }

    /* JADX INFO: renamed from: l */
    public final File m15335l(String str) {
        return new File(this.cacheDir, str + ".png");
    }
}
