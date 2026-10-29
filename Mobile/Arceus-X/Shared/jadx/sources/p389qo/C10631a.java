package p389qo;

import ar.InterfaceC1151f;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498vq.C12247a;

/* JADX INFO: renamed from: qo.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lqo/a;", "Lar/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;", "wrapped", "<init>", "(Lar/f;)V", "rendering", "Lvq/a;", "systemUiController", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;Lvq/a;)V", "b", "Lar/f;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10631a implements InterfaceC1151f<Screen.C3531f> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1151f<Screen.C3531f> wrapped;

    public C10631a(@NotNull InterfaceC1151f<Screen.C3531f> wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.wrapped = wrapped;
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Lvq/a;)V */
    @Override // ar.InterfaceC1151f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo6493b(@NotNull Screen.C3531f rendering, @Nullable C12247a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        this.wrapped.mo6493b(rendering, systemUiController);
    }
}
