package s6;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k6.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0018\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0003RV\u0010\"\u001a>\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0\u001aj\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d`\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006&"}, d2 = {"Ls6/h;", "Ls6/j;", "<init>", "()V", "Ls6/d$b;", "key", "Ls6/d$c;", "a", "(Ls6/d$b;)Ls6/d$c;", "Lk6/n;", "image", "", "", "", "extras", "", "size", "", "c", "(Ls6/d$b;Lk6/n;Ljava/util/Map;J)V", "", "f", "(Ls6/d$b;)Z", "clear", "b", "d", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Ls6/h$b;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "getCache$coil_core_release", "()Ljava/util/LinkedHashMap;", "cache", "", "I", "operationsSinceCleanUp", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedHashMap<d.Key, ArrayList<b>> cache = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int operationsSinceCleanUp;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Ls6/h$b;", "", "Ljava/lang/ref/WeakReference;", "Lk6/n;", "Lcoil3/util/WeakReference;", "image", "", "", "extras", "", "size", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V", "a", "Ljava/lang/ref/WeakReference;", "b", "()Ljava/lang/ref/WeakReference;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "J", "()J", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final WeakReference<n> image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Object> extras;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final long size;

        public b(@NotNull WeakReference<n> weakReference, @NotNull Map<String, ? extends Object> map, long j10) {
            this.image = weakReference;
            this.extras = map;
            this.size = j10;
        }

        @NotNull
        public final Map<String, Object> a() {
            return this.extras;
        }

        @NotNull
        public final WeakReference<n> b() {
            return this.image;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getSize() {
            return this.size;
        }
    }

    @Override // s6.j
    @Nullable
    public d.Value a(@NotNull d.Key key) {
        ArrayList<b> arrayList = this.cache.get(key);
        d.Value value = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            n nVar = bVar.b().get();
            d.Value value2 = nVar != null ? new d.Value(nVar, bVar.a()) : null;
            if (value2 != null) {
                value = value2;
                break;
            }
        }
        d();
        return value;
    }

    public final void b() {
        WeakReference<n> weakReferenceB;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<b>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull(next);
                if (((bVar == null || (weakReferenceB = bVar.b()) == null) ? null : weakReferenceB.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (next.get(i12).b().get() == null) {
                        next.remove(i12);
                        i10++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // s6.j
    public void c(@NotNull d.Key key, @NotNull n image, @NotNull Map<String, ? extends Object> extras, long size) {
        LinkedHashMap<d.Key, ArrayList<b>> linkedHashMap = this.cache;
        ArrayList<b> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<b> arrayList2 = arrayList;
        b bVar = new b(new WeakReference(image), extras, size);
        if (arrayList2.isEmpty()) {
            arrayList2.add(bVar);
        } else {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                b bVar2 = arrayList2.get(i10);
                if (size >= bVar2.getSize()) {
                    if (bVar2.b().get() == image) {
                        arrayList2.set(i10, bVar);
                        break;
                    } else {
                        arrayList2.add(i10, bVar);
                        break;
                    }
                }
            }
        }
        d();
    }

    @Override // s6.j
    public void clear() {
        this.operationsSinceCleanUp = 0;
        this.cache.clear();
    }

    public final void d() {
        int i10 = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i10 + 1;
        if (i10 >= 10) {
            b();
        }
    }

    @Override // s6.j
    public boolean f(@NotNull d.Key key) {
        return this.cache.remove(key) != null;
    }
}
