package th;

import android.content.SharedPreferences;
import com.roblox.client.flags.C3187a;
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
import p151gk.C6124q;
import p201iu.C6988p;

/* JADX INFO: renamed from: th.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ3\u0010\u000f\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010\u001b\u0012\u0004\b$\u0010\u0003\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010*\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010\u001b\u0012\u0004\b,\u0010\u0003\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R-\u00106\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f030201*\u00020-8F¢\u0006\u0006\u001a\u0004\b4\u00105R$\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0301*\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00069"}, m31665d2 = {"Lth/f;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "p", "(Landroid/content/SharedPreferences;)V", "h", "", "", "", "flagsToUpdate", "isBackgroundRefresh", "j", "(Ljava/util/Map;Landroid/content/SharedPreferences;Z)V", "q", "cachingKey", "l", "(Ljava/lang/String;)Z", "o", "", "b", "Ljava/util/Set;", "readBeforeFetch", "c", "Z", "isFetchFinished", "()Z", "setFetchFinished", "(Z)V", "isFetchFinished$annotations", "d", "isFetchForNativeFinished", "setFetchForNativeFinished", "isFetchForNativeFinished$annotations", "", "e", "Ljava/util/Map;", "flagLocalCache", "f", "isCacheInitialized", "setCacheInitialized", "isCacheInitialized$annotations", "Lth/g;", "g", "Lth/g;", "flags", "Lkotlin/sequences/Sequence;", "", "Lcom/roblox/client/flags/a;", "m", "(Lth/g;)Lkotlin/sequences/Sequence;", "cachedFlagEntries", "n", "cachedFlags", "flags_prodRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11657f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isFetchFinished;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean isFetchForNativeFinished;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static volatile boolean isCacheInitialized;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static InterfaceC11658g flags;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11657f f41211a = new C11657f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> readBeforeFetch = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Boolean> flagLocalCache = new LinkedHashMap();

    /* JADX INFO: renamed from: th.f$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final a f41218a = new a();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof C3187a);
        }
    }

    /* JADX INFO: renamed from: th.f$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final b f41219a = new b();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Map.Entry);
        }
    }

    static {
        InterfaceC11660i interfaceC11660iM43403a = C11659h.m43403a();
        Intrinsics.checkNotNullExpressionValue(interfaceC11660iM43403a, "get(...)");
        flags = interfaceC11660iM43403a;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m43388e(Map.Entry entry) {
        return ((C3187a) entry.getValue()).m15123a();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m43389f(Map.Entry entry) {
        return ((C3187a) entry.getValue()).m15123a();
    }

    /* JADX INFO: renamed from: g */
    public static final C3187a m43390g(Map.Entry entry) {
        Intrinsics.checkNotNull(entry);
        return (C3187a) entry.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m43391i(C3187a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !(it instanceof C3187a.d);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m43392k(C11657f c11657f, Map map, SharedPreferences sharedPreferences, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c11657f.m43394j(map, sharedPreferences, z10);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m43393h(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (isFetchFinished) {
            C6124q.m27066k("FlagCache", "Duplicate cacheAndLoadServerFlags call! Please file a ticket to MOBAPP to report this log.");
            return;
        }
        Sequence<C3187a> sequenceM29388p = C6988p.m29388p(m43397n(flags), new Function1() { // from class: th.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C11657f.m43391i((C3187a) obj));
            }
        });
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (C3187a c3187a : sequenceM29388p) {
            Boolean bool = (Boolean) c3187a.m15132j(c3187a.m15127e());
            String strMo15124b = c3187a.mo15124b();
            Intrinsics.checkNotNullExpressionValue(strMo15124b, "cachingKey(...)");
            Intrinsics.checkNotNull(bool);
            editorEdit.putBoolean(strMo15124b, bool.booleanValue());
            C6124q.m27057b("FlagCache", "Saved " + strMo15124b + " to SharedPreference with value " + bool + ", priority " + c3187a.m15127e() + ".");
            if (readBeforeFetch.contains(strMo15124b)) {
                C6124q.m27057b("FlagCache", "Won't update " + strMo15124b + " in memory since it's been read before.");
            } else {
                flagLocalCache.put(strMo15124b, bool);
            }
        }
        editorEdit.apply();
        isFetchFinished = true;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m43394j(@NotNull Map<String, Boolean> flagsToUpdate, @NotNull SharedPreferences sharedPreferences, boolean isBackgroundRefresh) {
        Intrinsics.checkNotNullParameter(flagsToUpdate, "flagsToUpdate");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (!isBackgroundRefresh && isFetchForNativeFinished) {
            C6124q.m27066k("FlagCache", "Duplicate cacheAndUpdateNativeFlags call! Please file a ticket to MOBAPP to report this log.");
            return;
        }
        C6124q.m27057b("FlagCache", "(NativeFlag): Size of flag-Map to update = " + flagsToUpdate.size());
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (Map.Entry<String, Boolean> entry : flagsToUpdate.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            boolean zBooleanValue = value.booleanValue();
            editorEdit.putBoolean(key, zBooleanValue);
            C6124q.m27064i("FlagCache", "(NativeFlag): Saved " + key + " = " + zBooleanValue + " to SharedPreference");
            if (readBeforeFetch.contains(key)) {
                C6124q.m27057b("FlagCache", "(NativeFlag) Won't update " + key + " in memory since it's been read.");
            } else if (!isBackgroundRefresh) {
                flagLocalCache.put(key, value);
            }
        }
        editorEdit.apply();
        if (!isBackgroundRefresh) {
            isFetchForNativeFinished = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized boolean m43395l(@NotNull String cachingKey) {
        try {
            Intrinsics.checkNotNullParameter(cachingKey, "cachingKey");
            if (!isFetchFinished) {
                readBeforeFetch.add(cachingKey);
            }
            Boolean bool = flagLocalCache.get(cachingKey);
            if (bool != null) {
                return bool.booleanValue();
            }
            C6124q.m27060e("FlagCache", "FlagCache doesn't contain " + cachingKey + ".");
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final Sequence<Map.Entry<String, C3187a<Boolean>>> m43396m(@NotNull InterfaceC11658g interfaceC11658g) {
        Intrinsics.checkNotNullParameter(interfaceC11658g, "<this>");
        Set<Map.Entry<String, C3187a>> setMo15152R3 = interfaceC11658g.mo15152R3();
        Intrinsics.checkNotNullExpressionValue(setMo15152R3, "getEntrySet(...)");
        Sequence<Map.Entry<String, C3187a<Boolean>>> sequenceM29388p = C6988p.m29388p(C6988p.m29388p(CollectionsKt.m31696U(setMo15152R3), new Function1() { // from class: th.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C11657f.m43388e((Map.Entry) obj));
            }
        }), b.f41219a);
        Intrinsics.m31981d(sequenceM29388p, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceM29388p;
    }

    /* JADX INFO: renamed from: n */
    public final Sequence<C3187a<Boolean>> m43397n(InterfaceC11658g interfaceC11658g) {
        Set<Map.Entry<String, C3187a>> setMo15152R3 = interfaceC11658g.mo15152R3();
        Intrinsics.checkNotNullExpressionValue(setMo15152R3, "getEntrySet(...)");
        Sequence<C3187a<Boolean>> sequenceM29388p = C6988p.m29388p(C6988p.m29396x(C6988p.m29388p(CollectionsKt.m31696U(setMo15152R3), new Function1() { // from class: th.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C11657f.m43389f((Map.Entry) obj));
            }
        }), new Function1() { // from class: th.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11657f.m43390g((Map.Entry) obj);
            }
        }), a.f41218a);
        Intrinsics.m31981d(sequenceM29388p, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceM29388p;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized boolean m43398o(@NotNull String cachingKey) {
        try {
            Intrinsics.checkNotNullParameter(cachingKey, "cachingKey");
            if (!isFetchForNativeFinished) {
                readBeforeFetch.add(cachingKey);
            }
            Boolean bool = flagLocalCache.get(cachingKey);
            if (bool != null) {
                return bool.booleanValue();
            }
            C6124q.m27060e("FlagCache", "FlagCache doesn't contain Native " + cachingKey + ".");
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m43399p(@NotNull SharedPreferences sharedPreferences) {
        try {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            if (isCacheInitialized) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (C3187a<Boolean> c3187a : f41211a.m43397n(flags)) {
                Boolean boolM15132j = c3187a.m15132j(c3187a.m15127e());
                String strMo15124b = c3187a.mo15124b();
                Intrinsics.checkNotNullExpressionValue(strMo15124b, "cachingKey(...)");
                Map<String, Boolean> map = flagLocalCache;
                Intrinsics.checkNotNull(boolM15132j);
                map.put(strMo15124b, Boolean.valueOf(sharedPreferences.getBoolean(strMo15124b, boolM15132j.booleanValue())));
                editorEdit.remove(strMo15124b);
                C6124q.m27057b("FlagCache", "Loaded and removed flag " + strMo15124b + " from SharedPreference with value " + map.get(strMo15124b));
            }
            editorEdit.commit();
            isCacheInitialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m43400q() {
        isFetchFinished = false;
        isFetchForNativeFinished = false;
    }
}
