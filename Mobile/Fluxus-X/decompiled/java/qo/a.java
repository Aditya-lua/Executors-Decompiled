package qo;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqo/a;", "Lor/h;", "Lno/j;", "wrapped", "<init>", "(Lor/h;)V", "rendering", "Ljr/a;", "systemUiController", BuildConfig.FLAVOR, "a", "(Lno/j;Ljr/a;)V", "b", "Lor/h;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements or.h<no.j> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final or.h<no.j> wrapped;

    public a(@NotNull or.h<no.j> wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.wrapped = wrapped;
    }

    @Override // or.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull no.j rendering, @Nullable jr.a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        this.wrapped.b(rendering, systemUiController);
    }
}
