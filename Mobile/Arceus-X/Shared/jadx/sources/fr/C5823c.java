package fr;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fr.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lfr/c;", "", "<init>", "()V", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "c", "(Lkotlin/jvm/functions/Function0;)V", "submitCode", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5823c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> submitCode = new Function0() { // from class: fr.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C5823c.m26162d();
        }
    };

    /* JADX INFO: renamed from: d */
    public static final Unit m26162d() {
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function0<Unit> m26163b() {
        return this.submitCode;
    }

    /* JADX INFO: renamed from: c */
    public final void m26164c(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.submitCode = function0;
    }
}
