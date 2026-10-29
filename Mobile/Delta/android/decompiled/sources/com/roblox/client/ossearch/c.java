package com.roblox.client.ossearch;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.roblox.client.RobloxApplication;
import gk.p;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import jt.h;
import jt.i;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ut.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006*\u0001\u001c\u0018\u0000  2\u00020\u0001:\u0001\u0016B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/roblox/client/ossearch/c;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "thumbnailId", "Landroid/graphics/Bitmap;", "i", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "", "k", "(Ljava/lang/String;Landroid/graphics/Bitmap;)Z", "", "f", "()V", "Ljava/io/File;", "l", "(Ljava/lang/String;)Ljava/io/File;", "", "a", "I", "maxEntries", "b", "Ljava/io/File;", "cacheDir", "com/roblox/client/ossearch/c$b", "c", "Lcom/roblox/client/ossearch/c$b;", "lru", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final h<c> f9171e = i.b(new Function0() { // from class: zi.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return com.roblox.client.ossearch.c.j();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int maxEntries;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File cacheDir;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b lru;

    /* JADX INFO: renamed from: com.roblox.client.ossearch.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/roblox/client/ossearch/c$a;", "", "<init>", "()V", "Lcom/roblox/client/ossearch/c;", "instance$delegate", "Ljt/h;", "a", "()Lcom/roblox/client/ossearch/c;", "instance", "", "TAG", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            return (c) c.f9171e.getValue();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/roblox/client/ossearch/c$b", "Ljava/util/LinkedHashMap;", "", "Ljava/io/File;", "Lkotlin/collections/LinkedHashMap;", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends LinkedHashMap<String, File> {
        public b(int i10) {
            super(i10, 0.75f, true);
        }

        public /* bridge */ boolean a(String str) {
            return super.containsKey(str);
        }

        public /* bridge */ boolean b(File file) {
            return super.containsValue(file);
        }

        public /* bridge */ File c(String str) {
            return (File) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return a((String) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof File) {
                return b((File) obj);
            }
            return false;
        }

        public /* bridge */ Set<Map.Entry<String, File>> e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, File>> entrySet() {
            return e();
        }

        public /* bridge */ Set<String> f() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return c((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : i((String) obj, (File) obj2);
        }

        public /* bridge */ File i(String str, File file) {
            return (File) super.getOrDefault(str, file);
        }

        public /* bridge */ int j() {
            return super.size();
        }

        public /* bridge */ Collection<File> k() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return f();
        }

        public /* bridge */ File n(String str) {
            return (File) super.remove(str);
        }

        public /* bridge */ boolean o(String str, File file) {
            return super.remove(str, file);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return n((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, File> eldest) {
            Intrinsics.checkNotNullParameter(eldest, "eldest");
            if (size() <= c.this.maxEntries) {
                return false;
            }
            if (eldest.getValue().delete()) {
                return true;
            }
            p.k("ShortcutThumbnailCache", "Failed to delete evicted thumbnail: " + ((Object) eldest.getKey()));
            return true;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return j();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<File> values() {
            return k();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof File)) {
                return o((String) obj, (File) obj2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0143c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return mt.a.a(Long.valueOf(((File) t8).lastModified()), Long.valueOf(((File) t10).lastModified()));
        }
    }

    public c(@NotNull Context context) {
        List<File> listF0;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMax = Math.max(zi.a.a(context), 0);
        this.maxEntries = iMax;
        File file = new File(context.getCacheDir(), "ossearch_thumbnails");
        file.mkdirs();
        this.cacheDir = file;
        this.lru = new b(iMax);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || (listF0 = m.f0(fileArrListFiles, new C0143c())) == null) {
            return;
        }
        for (File file2 : listF0) {
            b bVar = this.lru;
            Intrinsics.checkNotNull(file2);
            bVar.put(k.q(file2), file2);
        }
    }

    public static final Unit g(String str, File file) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(file, "file");
        file.delete();
        return Unit.f22483a;
    }

    public static final void h(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    public static final c j() {
        Context contextF = RobloxApplication.f();
        Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
        return new c(contextF);
    }

    public final synchronized void f() {
        b bVar = this.lru;
        final Function2 function2 = new Function2() { // from class: zi.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return com.roblox.client.ossearch.c.g((String) obj, (File) obj2);
            }
        };
        bVar.forEach(new BiConsumer() { // from class: zi.d
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                com.roblox.client.ossearch.c.h(function2, obj, obj2);
            }
        });
        this.lru.clear();
    }

    @Nullable
    public final synchronized Bitmap i(@NotNull String thumbnailId) {
        Intrinsics.checkNotNullParameter(thumbnailId, "thumbnailId");
        File file = (File) this.lru.get(thumbnailId);
        if (file == null) {
            p.b("ShortcutThumbnailCache", "Cache miss for thumbnail: " + thumbnailId);
            return null;
        }
        p.b("ShortcutThumbnailCache", "Cache hit for thumbnail: " + thumbnailId);
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    public final synchronized boolean k(@NotNull String thumbnailId, @NotNull Bitmap bitmap) {
        Object objB;
        try {
            Intrinsics.checkNotNullParameter(thumbnailId, "thumbnailId");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            File fileL = l(thumbnailId);
            try {
                n.Companion companion = n.INSTANCE;
                FileOutputStream fileOutputStream = new FileOutputStream(fileL);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    ut.c.a(fileOutputStream, null);
                    this.lru.put(thumbnailId, fileL);
                    objB = n.b(Unit.f22483a);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th4));
            }
            Throwable thE = n.e(objB);
            if (thE != null) {
                p.e("ShortcutThumbnailCache", "Failed to cache thumbnail with id " + thumbnailId + ". Error: " + thE.getMessage());
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return n.h(objB);
    }

    public final File l(String str) {
        return new File(this.cacheDir, str + ".png");
    }
}
