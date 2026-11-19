package vp;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004R\u0014\u0010\u0007\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lvp/e1;", "PropsT", "StateT", "OutputT", "Lvp/s0;", "a", "()Ljava/lang/Object;", "props", "Lln/k;", BuildConfig.FLAVOR, "c", "()Lln/k;", "child", "Lkotlin/Function1;", BuildConfig.FLAVOR, "getHandler", "()Lkotlin/jvm/functions/Function1;", "handler", "Lvp/d;", "Lvp/h;", "Lvp/q0;", "Lvp/x0;", "Lvp/c1;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e1<PropsT, StateT, OutputT> extends s0 {
    PropsT a();

    @NotNull
    ln.k<PropsT, StateT, OutputT, Object> c();

    @NotNull
    Function1<OutputT, Unit> getHandler();
}
