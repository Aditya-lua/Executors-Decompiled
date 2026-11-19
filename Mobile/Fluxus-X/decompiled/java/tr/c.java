package tr;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ltr/c;", BuildConfig.FLAVOR, "<init>", "()V", "Lkotlin/Function0;", BuildConfig.FLAVOR, "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "c", "(Lkotlin/jvm/functions/Function0;)V", "submitCode", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> submitCode = new Function0() { // from class: tr.b
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return c.d();
        }
    };

    public static final Unit d() {
        return Unit.f21506a;
    }

    @NotNull
    public final Function0<Unit> b() {
        return this.submitCode;
    }

    public final void c(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.submitCode = function0;
    }
}
