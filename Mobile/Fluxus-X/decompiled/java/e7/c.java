package e7;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import y6.ErrorResult;
import y6.SuccessResult;
import y6.k;
import zt.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Le7/c;", "Le7/d;", "Le7/e;", "target", "Ly6/k;", "result", "<init>", "(Le7/e;Ly6/k;)V", BuildConfig.FLAVOR, "a", "()V", "Le7/e;", "b", "Ly6/k;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e target;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final k result;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le7/c$a;", "Le7/d$a;", "<init>", "()V", "Le7/e;", "target", "Ly6/k;", "result", "Le7/d;", "a", "(Le7/e;Ly6/k;)Le7/d;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements d.a {
        @Override // e7.d.a
        @NotNull
        public d a(@NotNull e target, @NotNull k result) {
            return new c(target, result);
        }
    }

    public c(@NotNull e eVar, @NotNull k kVar) {
        this.target = eVar;
        this.result = kVar;
    }

    @Override // e7.d
    public void a() {
        k kVar = this.result;
        if (kVar instanceof SuccessResult) {
            this.target.a(((SuccessResult) kVar).getImage());
        } else {
            if (!(kVar instanceof ErrorResult)) {
                throw new l();
            }
            this.target.c(((ErrorResult) kVar).getImage());
        }
    }
}
