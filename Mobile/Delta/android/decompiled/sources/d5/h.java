package d5;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Ld5/h;", "", "Le5/b;", "impl", "<init>", "(Le5/b;)V", "", "c", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "d", "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "Le5/b;", "Ld5/f;", "b", "Ld5/f;", "()Ld5/f;", "savedStateRegistry", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e5.b impl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f savedStateRegistry;

    /* JADX INFO: renamed from: d5.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld5/h$a;", "", "<init>", "()V", "Ld5/i;", "owner", "Ld5/h;", "b", "(Ld5/i;)Ld5/h;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Unit c(i iVar) {
            iVar.a().a(new b(iVar));
            return Unit.f22483a;
        }

        @NotNull
        public final h b(@NotNull final i owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new h(new e5.b(owner, new Function0() { // from class: d5.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.Companion.c(owner);
                }
            }), null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ h(e5.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @NotNull
    public static final h a(@NotNull i iVar) {
        return INSTANCE.b(iVar);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void c() {
        this.impl.f();
    }

    public final void d(@Nullable Bundle savedState) {
        this.impl.h(savedState);
    }

    public final void e(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.impl.i(outBundle);
    }

    public h(e5.b bVar) {
        this.impl = bVar;
        this.savedStateRegistry = new f(bVar);
    }
}
