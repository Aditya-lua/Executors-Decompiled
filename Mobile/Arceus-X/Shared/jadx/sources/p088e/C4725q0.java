package p088e;

import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e.q0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Le/p0;", "Landroidx/lifecycle/s;", "owner", "", "enabled", "Lkotlin/Function1;", "Le/m0;", "", "onBackPressed", "a", "(Le/p0;Landroidx/lifecycle/s;ZLkotlin/jvm/functions/Function1;)Le/m0;", "activity"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4725q0 {

    /* JADX INFO: renamed from: e.q0$a */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"e/q0$a", "Le/m0;", "", "handleOnBackPressed", "()V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a extends AbstractC4717m0 {

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ Function1<AbstractC4717m0, Unit> f19249X;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super e.m0, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, Function1<? super AbstractC4717m0, Unit> function1) {
            super(z10);
            this.f19249X = function1;
        }

        @Override // p088e.AbstractC4717m0
        public void handleOnBackPressed() {
            this.f19249X.invoke(this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC4717m0 m23085a(@NotNull C4723p0 c4723p0, @Nullable InterfaceC0980s interfaceC0980s, boolean z10, @NotNull Function1<? super AbstractC4717m0, Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(c4723p0, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (interfaceC0980s != null) {
            c4723p0.m23077d(interfaceC0980s, aVar);
            return aVar;
        }
        c4723p0.m23078e(aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC4717m0 m23086b(C4723p0 c4723p0, InterfaceC0980s interfaceC0980s, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0980s = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return m23085a(c4723p0, interfaceC0980s, z10, function1);
    }
}
