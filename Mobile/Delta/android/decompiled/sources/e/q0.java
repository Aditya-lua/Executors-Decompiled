package e;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le/p0;", "Landroidx/lifecycle/s;", "owner", "", "enabled", "Lkotlin/Function1;", "Le/m0;", "", "onBackPressed", "a", "(Le/p0;Landroidx/lifecycle/s;ZLkotlin/jvm/functions/Function1;)Le/m0;", "activity"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/q0$a", "Le/m0;", "", "handleOnBackPressed", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends m0 {
        public final /* synthetic */ Function1<m0, Unit> X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, Function1<? super m0, Unit> function1) {
            super(z10);
            this.X = function1;
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            this.X.invoke(this);
        }
    }

    @NotNull
    public static final m0 a(@NotNull p0 p0Var, @Nullable androidx.p000lifecycle.s sVar, boolean z10, @NotNull Function1<? super m0, Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (sVar != null) {
            p0Var.d(sVar, aVar);
            return aVar;
        }
        p0Var.e(aVar);
        return aVar;
    }

    public static /* synthetic */ m0 b(p0 p0Var, androidx.p000lifecycle.s sVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(p0Var, sVar, z10, function1);
    }
}
