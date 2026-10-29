package androidx.p000lifecycle;

import android.os.Bundle;
import d5.c;
import d5.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.c0;
import nu.j;
import nu.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u001a&B\u001f\b\u0017\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\"\u0010#R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*¨\u0006,"}, d2 = {"Landroidx/lifecycle/l0;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Ld5/f$b;", "h", "()Ld5/f$b;", "T", "key", "initialValue", "Landroidx/lifecycle/d0;", "c", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/d0;", "Lnu/p0;", "f", "(Ljava/lang/String;Ljava/lang/Object;)Lnu/p0;", "Lnu/c0;", "e", "(Ljava/lang/String;Ljava/lang/Object;)Lnu/c0;", "", "g", "()Ljava/util/Set;", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "i", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "hasInitialValue", "d", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/d0;", "", "Landroidx/lifecycle/l0$b;", "a", "Ljava/util/Map;", "liveDatas", "Li4/b;", "Li4/b;", "impl", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, b<?>> liveDatas;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public i4.b impl;

    /* JADX INFO: renamed from: androidx.lifecycle.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/l0$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "restoredState", "defaultState", "Landroidx/lifecycle/l0;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/l0;", "value", "", "b", "(Ljava/lang/Object;)Z", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final l0 a(@Nullable Bundle restoredState, @Nullable Bundle defaultState) {
            if (restoredState == null) {
                restoredState = defaultState;
            }
            if (restoredState == null) {
                return new l0();
            }
            ClassLoader classLoader = l0.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            restoredState.setClassLoader(classLoader);
            return new l0(c.g(c.a(restoredState)));
        }

        public final boolean b(@Nullable Object value) {
            return i4.c.a(value);
        }

        public Companion() {
        }
    }

    public l0(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new i4.b(initialState);
    }

    @Nullable
    public final <T> T b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.impl.b(key);
    }

    @NotNull
    public final <T> d0<T> c(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return d(key, true, initialValue);
    }

    public final <T> d0<T> d(String key, boolean hasInitialValue, T initialValue) {
        b<?> bVar;
        if (this.impl.c().containsKey(key)) {
            throw new IllegalArgumentException(p0.b(key).toString());
        }
        Map<String, b<?>> map = this.liveDatas;
        b<?> bVar2 = map.get(key);
        if (bVar2 == null) {
            if (this.impl.e().containsKey(key)) {
                bVar = new b<>(this, key, this.impl.e().get(key));
            } else if (hasInitialValue) {
                this.impl.e().put(key, initialValue);
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
    public final <T> c0<T> e(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.liveDatas.containsKey(key)) {
            throw new IllegalArgumentException(p0.b(key).toString());
        }
        return this.impl.d(key, initialValue);
    }

    @NotNull
    public final <T> p0<T> f(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.impl.c().containsKey(key) ? j.a(this.impl.d(key, initialValue)) : this.impl.g(key, initialValue);
    }

    @NotNull
    public final Set<String> g() {
        return r0.i(this.impl.h(), this.liveDatas.keySet());
    }

    @NotNull
    public final f.b h() {
        return this.impl.getSavedStateProvider();
    }

    public final <T> void i(@NotNull String key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (INSTANCE.b(value)) {
            b<?> bVar = this.liveDatas.get(key);
            b<?> bVar2 = bVar instanceof d0 ? bVar : null;
            if (bVar2 != null) {
                bVar2.o(value);
            }
            this.impl.k(key, value);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        Intrinsics.checkNotNull(value);
        sb2.append(value.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/l0$b;", "T", "Landroidx/lifecycle/d0;", "Landroidx/lifecycle/l0;", "handle", "", "key", "value", "<init>", "(Landroidx/lifecycle/l0;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/l0;Ljava/lang/String;)V", "", "o", "(Ljava/lang/Object;)V", "l", "Ljava/lang/String;", "m", "Landroidx/lifecycle/l0;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> extends d0<T> {

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String key;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public l0 handle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@Nullable l0 l0Var, @NotNull String key, T t8) {
            super(t8);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = l0Var;
        }

        @Override // androidx.p000lifecycle.d0, androidx.p000lifecycle.a0
        public void o(T value) {
            i4.b bVar;
            l0 l0Var = this.handle;
            if (l0Var != null && (bVar = l0Var.impl) != null) {
                bVar.k(this.key, value);
            }
            super.o(value);
        }

        public b(@Nullable l0 l0Var, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = l0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new i4.b(null, 1, 0 == true ? 1 : 0);
    }
}
