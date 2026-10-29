package th;

import android.content.SharedPreferences;
import gk.p;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ3\u0010\u000f\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010\u001b\u0012\u0004\b$\u0010\u0003\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010*\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010\u001b\u0012\u0004\b,\u0010\u0003\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R-\u00106\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f030201*\u00020-8F¢\u0006\u0006\u001a\u0004\b4\u00105R$\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0301*\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00069"}, d2 = {"Lth/f;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "p", "(Landroid/content/SharedPreferences;)V", "h", "", "", "", "flagsToUpdate", "isBackgroundRefresh", "j", "(Ljava/util/Map;Landroid/content/SharedPreferences;Z)V", "q", "cachingKey", "l", "(Ljava/lang/String;)Z", "o", "", "b", "Ljava/util/Set;", "readBeforeFetch", "c", "Z", "isFetchFinished", "()Z", "setFetchFinished", "(Z)V", "isFetchFinished$annotations", "d", "isFetchForNativeFinished", "setFetchForNativeFinished", "isFetchForNativeFinished$annotations", "", "e", "Ljava/util/Map;", "flagLocalCache", "f", "isCacheInitialized", "setCacheInitialized", "isCacheInitialized$annotations", "Lth/g;", "g", "Lth/g;", "flags", "Lkotlin/sequences/Sequence;", "", "Lcom/roblox/client/flags/a;", "m", "(Lth/g;)Lkotlin/sequences/Sequence;", "cachedFlagEntries", "n", "cachedFlags", "flags_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean isFetchFinished;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static boolean isFetchForNativeFinished;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean isCacheInitialized;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static g flags;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f31815a = new f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> readBeforeFetch = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<String, Boolean> flagLocalCache = new LinkedHashMap();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31821a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof com.roblox.client.flags.a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31822a = new b();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Map.Entry);
        }
    }

    static {
        i iVarA = h.a();
        Intrinsics.checkNotNullExpressionValue(iVarA, "get(...)");
        flags = iVarA;
    }

    public static final boolean e(Map.Entry entry) {
        return ((com.roblox.client.flags.a) entry.getValue()).a();
    }

    public static final boolean f(Map.Entry entry) {
        return ((com.roblox.client.flags.a) entry.getValue()).a();
    }

    public static final com.roblox.client.flags.a g(Map.Entry entry) {
        Intrinsics.checkNotNull(entry);
        return (com.roblox.client.flags.a) entry.getValue();
    }

    public static final boolean i(com.roblox.client.flags.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !(it instanceof com.roblox.client.flags.a.d);
    }

    public static /* synthetic */ void k(f fVar, Map map, SharedPreferences sharedPreferences, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.j(map, sharedPreferences, z10);
    }

    public final synchronized void h(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (isFetchFinished) {
            p.k("FlagCache", "Duplicate cacheAndLoadServerFlags call! Please file a ticket to MOBAPP to report this log.");
            return;
        }
        Sequence<com.roblox.client.flags.a> sequenceP = iu.p.p(n(flags), new Function1() { // from class: th.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.i((com.roblox.client.flags.a) obj));
            }
        });
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (com.roblox.client.flags.a aVar : sequenceP) {
            Boolean bool = (Boolean) aVar.j(aVar.e());
            String strB = aVar.b();
            Intrinsics.checkNotNullExpressionValue(strB, "cachingKey(...)");
            Intrinsics.checkNotNull(bool);
            editorEdit.putBoolean(strB, bool.booleanValue());
            p.b("FlagCache", "Saved " + strB + " to SharedPreference with value " + bool + ", priority " + aVar.e() + ".");
            if (readBeforeFetch.contains(strB)) {
                p.b("FlagCache", "Won't update " + strB + " in memory since it's been read before.");
            } else {
                flagLocalCache.put(strB, bool);
            }
        }
        editorEdit.apply();
        isFetchFinished = true;
    }

    public final synchronized void j(@NotNull Map<String, Boolean> flagsToUpdate, @NotNull SharedPreferences sharedPreferences, boolean isBackgroundRefresh) {
        Intrinsics.checkNotNullParameter(flagsToUpdate, "flagsToUpdate");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (!isBackgroundRefresh && isFetchForNativeFinished) {
            p.k("FlagCache", "Duplicate cacheAndUpdateNativeFlags call! Please file a ticket to MOBAPP to report this log.");
            return;
        }
        p.b("FlagCache", "(NativeFlag): Size of flag-Map to update = " + flagsToUpdate.size());
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (Map.Entry<String, Boolean> entry : flagsToUpdate.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            boolean zBooleanValue = value.booleanValue();
            editorEdit.putBoolean(key, zBooleanValue);
            p.i("FlagCache", "(NativeFlag): Saved " + key + " = " + zBooleanValue + " to SharedPreference");
            if (readBeforeFetch.contains(key)) {
                p.b("FlagCache", "(NativeFlag) Won't update " + key + " in memory since it's been read.");
            } else if (!isBackgroundRefresh) {
                flagLocalCache.put(key, value);
            }
        }
        editorEdit.apply();
        if (!isBackgroundRefresh) {
            isFetchForNativeFinished = true;
        }
    }

    public final synchronized boolean l(@NotNull String cachingKey) {
        try {
            Intrinsics.checkNotNullParameter(cachingKey, "cachingKey");
            if (!isFetchFinished) {
                readBeforeFetch.add(cachingKey);
            }
            Boolean bool = flagLocalCache.get(cachingKey);
            if (bool != null) {
                return bool.booleanValue();
            }
            p.e("FlagCache", "FlagCache doesn't contain " + cachingKey + ".");
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final Sequence<Map.Entry<String, com.roblox.client.flags.a<Boolean>>> m(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Set<Map.Entry<String, com.roblox.client.flags.a>> setM3 = gVar.M3();
        Intrinsics.checkNotNullExpressionValue(setM3, "getEntrySet(...)");
        Sequence<Map.Entry<String, com.roblox.client.flags.a<Boolean>>> sequenceP = iu.p.p(iu.p.p(CollectionsKt.U(setM3), new Function1() { // from class: th.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.e((Map.Entry) obj));
            }
        }), b.f31822a);
        Intrinsics.d(sequenceP, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceP;
    }

    public final Sequence<com.roblox.client.flags.a<Boolean>> n(g gVar) {
        Set<Map.Entry<String, com.roblox.client.flags.a>> setM3 = gVar.M3();
        Intrinsics.checkNotNullExpressionValue(setM3, "getEntrySet(...)");
        Sequence<com.roblox.client.flags.a<Boolean>> sequenceP = iu.p.p(iu.p.x(iu.p.p(CollectionsKt.U(setM3), new Function1() { // from class: th.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.f((Map.Entry) obj));
            }
        }), new Function1() { // from class: th.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.g((Map.Entry) obj);
            }
        }), a.f31821a);
        Intrinsics.d(sequenceP, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceP;
    }

    public final synchronized boolean o(@NotNull String cachingKey) {
        try {
            Intrinsics.checkNotNullParameter(cachingKey, "cachingKey");
            if (!isFetchForNativeFinished) {
                readBeforeFetch.add(cachingKey);
            }
            Boolean bool = flagLocalCache.get(cachingKey);
            if (bool != null) {
                return bool.booleanValue();
            }
            p.e("FlagCache", "FlagCache doesn't contain Native " + cachingKey + ".");
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void p(@NotNull SharedPreferences sharedPreferences) {
        try {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            if (isCacheInitialized) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (com.roblox.client.flags.a<Boolean> aVar : f31815a.n(flags)) {
                Boolean boolJ = aVar.j(aVar.e());
                String strB = aVar.b();
                Intrinsics.checkNotNullExpressionValue(strB, "cachingKey(...)");
                Map<String, Boolean> map = flagLocalCache;
                Intrinsics.checkNotNull(boolJ);
                map.put(strB, Boolean.valueOf(sharedPreferences.getBoolean(strB, boolJ.booleanValue())));
                editorEdit.remove(strB);
                p.b("FlagCache", "Loaded and removed flag " + strB + " from SharedPreference with value " + map.get(strB));
            }
            editorEdit.commit();
            isCacheInitialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void q() {
        isFetchFinished = false;
        isFetchForNativeFinished = false;
    }
}
