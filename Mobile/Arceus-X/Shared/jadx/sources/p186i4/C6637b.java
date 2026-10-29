package p186i4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7690k0;
import kotlin.collections.C7704r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4442f;
import p068d5.C4446j;
import p229jt.C7352s;
import p456u2.C11775d;

/* JADX INFO: renamed from: i4.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0014R%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR(\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR+\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\u001a8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010(\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m31665d2 = {"Li4/b;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "T", "key", "initialValue", "Lnu/p0;", "g", "(Ljava/lang/String;Ljava/lang/Object;)Lnu/p0;", "Lnu/c0;", "d", "(Ljava/lang/String;Ljava/lang/Object;)Lnu/c0;", "", "h", "()Ljava/util/Set;", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "k", "(Ljava/lang/String;Ljava/lang/Object;)V", "i", "", "a", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "regular", "Ld5/f$b;", "providers", "c", "flows", "mutableFlows", "Ld5/f$b;", "f", "()Ld5/f$b;", "savedStateProvider", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C6637b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> regular;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C4442f.b> providers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, InterfaceC9566c0<Object>> flows;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, InterfaceC9566c0<Object>> mutableFlows;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C4442f.b savedStateProvider;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6637b(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.regular = C7690k0.m31809x(initialState);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new C4442f.b() { // from class: i4.a
            @Override // p068d5.C4442f.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo4974a() {
                return C6637b.m28623j(this.f25589a);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static final Bundle m28623j(C6637b c6637b) {
        Pair[] pairArr;
        for (Map.Entry entry : C7690k0.m31807v(c6637b.mutableFlows).entrySet()) {
            c6637b.m28632k((String) entry.getKey(), ((InterfaceC9566c0) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : C7690k0.m31807v(c6637b.providers).entrySet()) {
            c6637b.m28632k((String) entry2.getKey(), ((C4442f.b) entry2.getValue()).mo4974a());
        }
        Map<String, Object> map = c6637b.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(C7352s.m30477a(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM44057a = C11775d.m44057a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        C4446j.m22365a(bundleM44057a);
        return bundleM44057a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final <T> T m28624b(@NotNull String key) {
        T t8;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            InterfaceC9566c0<Object> interfaceC9566c0 = this.mutableFlows.get(key);
            if (interfaceC9566c0 != null && (t8 = (T) interfaceC9566c0.getValue()) != null) {
                return t8;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            m28631i(key);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, InterfaceC9566c0<Object>> m28625c() {
        return this.mutableFlows;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <T> InterfaceC9566c0<T> m28626d(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, InterfaceC9566c0<Object>> map = this.mutableFlows;
        InterfaceC9564b0 interfaceC9564b0M37859a = map.get(key);
        if (interfaceC9564b0M37859a == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            interfaceC9564b0M37859a = C9596r0.m37859a(this.regular.get(key));
            map.put(key, (InterfaceC9566c0<Object>) interfaceC9564b0M37859a);
        }
        InterfaceC9566c0<T> interfaceC9566c0 = (InterfaceC9566c0) interfaceC9564b0M37859a;
        Intrinsics.m31981d(interfaceC9566c0, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return interfaceC9566c0;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<String, Object> m28627e() {
        return this.regular;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final C4442f.b getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final <T> InterfaceC9592p0<T> m28629g(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, InterfaceC9566c0<Object>> map = this.flows;
        InterfaceC9566c0<Object> interfaceC9566c0M37859a = map.get(key);
        if (interfaceC9566c0M37859a == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            interfaceC9566c0M37859a = C9596r0.m37859a(this.regular.get(key));
            map.put(key, interfaceC9566c0M37859a);
        }
        InterfaceC9592p0<T> interfaceC9592p0M37784a = C9579j.m37784a(interfaceC9566c0M37859a);
        Intrinsics.m31981d(interfaceC9592p0M37784a, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return interfaceC9592p0M37784a;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Set<String> m28630h() {
        return C7704r0.m31913i(this.regular.keySet(), this.providers.keySet());
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final <T> T m28631i(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t8 = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t8;
    }

    /* JADX INFO: renamed from: k */
    public final <T> void m28632k(@NotNull String key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.regular.put(key, value);
        InterfaceC9566c0<Object> interfaceC9566c0 = this.flows.get(key);
        if (interfaceC9566c0 != null) {
            interfaceC9566c0.setValue(value);
        }
        InterfaceC9566c0<Object> interfaceC9566c1 = this.mutableFlows.get(key);
        if (interfaceC9566c1 != null) {
            interfaceC9566c1.setValue(value);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (wrap java.util.Map:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Map:0x0004: INVOKE  STATIC call: kotlin.collections.k0.j():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:7)) : (r1v0 java.util.Map))
     A[MD:(java.util.Map<java.lang.String, ? extends java.lang.Object>):void (m)] (LINE:7) call: i4.b.<init>(java.util.Map):void type: THIS */
    public /* synthetic */ C6637b(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7690k0.m31795j() : map);
    }
}
