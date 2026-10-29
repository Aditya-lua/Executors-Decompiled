package androidx.p616lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7704r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9566c0;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4439c;
import p068d5.C4442f;
import p186i4.C6637b;
import p186i4.C6638c;

/* JADX INFO: renamed from: androidx.lifecycle.l0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u001a&B\u001f\b\u0017\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\"\u0010#R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*¨\u0006,"}, m31665d2 = {"Landroidx/lifecycle/l0;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Ld5/f$b;", "h", "()Ld5/f$b;", "T", "key", "initialValue", "Landroidx/lifecycle/d0;", "c", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/d0;", "Lnu/p0;", "f", "(Ljava/lang/String;Ljava/lang/Object;)Lnu/p0;", "Lnu/c0;", "e", "(Ljava/lang/String;Ljava/lang/Object;)Lnu/c0;", "", "g", "()Ljava/util/Set;", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "i", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "hasInitialValue", "d", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/d0;", "", "Landroidx/lifecycle/l0$b;", "a", "Ljava/util/Map;", "liveDatas", "Li4/b;", "Li4/b;", "impl", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0967l0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, b<?>> liveDatas;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C6637b impl;

    /* JADX INFO: renamed from: androidx.lifecycle.l0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Landroidx/lifecycle/l0$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "restoredState", "defaultState", "Landroidx/lifecycle/l0;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/l0;", "value", "", "b", "(Ljava/lang/Object;)Z", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.l0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0967l0 m4955a(@Nullable Bundle restoredState, @Nullable Bundle defaultState) {
            if (restoredState == null) {
                restoredState = defaultState;
            }
            if (restoredState == null) {
                return new C0967l0();
            }
            ClassLoader classLoader = C0967l0.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            restoredState.setClassLoader(classLoader);
            return new C0967l0(C4439c.m22349g(C4439c.m22343a(restoredState)));
        }

        /* JADX INFO: renamed from: b */
        public final boolean m4956b(@Nullable Object value) {
            return C6638c.m28633a(value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0967l0(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new C6637b(initialState);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final <T> T m4947b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.impl.m28624b(key);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final <T> C0949d0<T> m4948c(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return m4949d(key, true, initialValue);
    }

    /* JADX INFO: renamed from: d */
    public final <T> C0949d0<T> m4949d(String key, boolean hasInitialValue, T initialValue) {
        b<?> bVar;
        if (this.impl.m28625c().containsKey(key)) {
            throw new IllegalArgumentException(C0975p0.m4970b(key).toString());
        }
        Map<String, b<?>> map = this.liveDatas;
        b<?> bVar2 = map.get(key);
        if (bVar2 == null) {
            if (this.impl.m28627e().containsKey(key)) {
                bVar = new b<>(this, key, this.impl.m28627e().get(key));
            } else if (hasInitialValue) {
                this.impl.m28627e().put(key, initialValue);
                bVar = new b<>(this, key, initialValue);
            } else {
                bVar = new b<>(this, key);
            }
            bVar2 = bVar;
            map.put(key, bVar2);
        }
        return bVar2;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final <T> InterfaceC9566c0<T> m4950e(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.liveDatas.containsKey(key)) {
            throw new IllegalArgumentException(C0975p0.m4970b(key).toString());
        }
        return this.impl.m28626d(key, initialValue);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final <T> InterfaceC9592p0<T> m4951f(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.impl.m28625c().containsKey(key) ? C9579j.m37784a(this.impl.m28626d(key, initialValue)) : this.impl.m28629g(key, initialValue);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Set<String> m4952g() {
        return C7704r0.m31913i(this.impl.m28630h(), this.liveDatas.keySet());
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C4442f.b m4953h() {
        return this.impl.getSavedStateProvider();
    }

    /* JADX INFO: renamed from: i */
    public final <T> void m4954i(@NotNull String key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (INSTANCE.m4956b(value)) {
            b<?> bVar = this.liveDatas.get(key);
            b<?> bVar2 = bVar instanceof C0949d0 ? bVar : null;
            if (bVar2 != null) {
                bVar2.mo4863o(value);
            }
            this.impl.m28632k(key, value);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        Intrinsics.checkNotNull(value);
        sb2.append(value.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* JADX INFO: renamed from: androidx.lifecycle.l0$b */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Landroidx/lifecycle/l0$b;", "T", "Landroidx/lifecycle/d0;", "Landroidx/lifecycle/l0;", "handle", "", "key", "value", "<init>", "(Landroidx/lifecycle/l0;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/l0;Ljava/lang/String;)V", "", "o", "(Ljava/lang/Object;)V", "l", "Ljava/lang/String;", "m", "Landroidx/lifecycle/l0;", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b<T> extends C0949d0<T> {

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public String key;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public C0967l0 handle;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@Nullable C0967l0 c0967l0, @NotNull String key, T t8) {
            super(t8);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = c0967l0;
        }

        @Override // androidx.p616lifecycle.C0949d0, androidx.p616lifecycle.AbstractC0940a0
        /* JADX INFO: renamed from: o */
        public void mo4863o(T value) {
            C6637b c6637b;
            C0967l0 c0967l0 = this.handle;
            if (c0967l0 != null && (c6637b = c0967l0.impl) != null) {
                c6637b.m28632k(this.key, value);
            }
            super.mo4863o(value);
        }

        public b(@Nullable C0967l0 c0967l0, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = c0967l0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C0967l0() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new C6637b(null, 1, 0 == true ? 1 : 0);
    }
}
