package p068d5;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p094e5.C4843b;

/* JADX INFO: renamed from: d5.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Ld5/h;", "", "Le5/b;", "impl", "<init>", "(Le5/b;)V", "", "c", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "d", "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "Le5/b;", "Ld5/f;", "b", "Ld5/f;", "()Ld5/f;", "savedStateRegistry", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4444h {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C4843b impl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C4442f savedStateRegistry;

    /* JADX INFO: renamed from: d5.h$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Ld5/h$a;", "", "<init>", "()V", "Ld5/i;", "owner", "Ld5/h;", "b", "(Ld5/i;)Ld5/h;", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: d5.h.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m22363c(InterfaceC4445i interfaceC4445i) {
            interfaceC4445i.mo4656a().mo4935a(new C4438b(interfaceC4445i));
            return Unit.f29331a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C4444h m22364b(@NotNull final InterfaceC4445i owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new C4444h(new C4843b(owner, new Function0() { // from class: d5.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4444h.Companion.m22363c(owner);
                }
            }), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 e5.b) A[MD:(e5.b):void (m)] (LINE:1) call: d5.h.<init>(e5.b):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4444h(C4843b c4843b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4843b);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C4444h m22357a(@NotNull InterfaceC4445i interfaceC4445i) {
        return INSTANCE.m22364b(interfaceC4445i);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4442f getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    /* JADX INFO: renamed from: c */
    public final void m22359c() {
        this.impl.m23398f();
    }

    /* JADX INFO: renamed from: d */
    public final void m22360d(@Nullable Bundle savedState) {
        this.impl.m23399h(savedState);
    }

    /* JADX INFO: renamed from: e */
    public final void m22361e(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.impl.m23400i(outBundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4444h(C4843b c4843b) {
        this.impl = c4843b;
        this.savedStateRegistry = new C4442f(c4843b);
    }
}
