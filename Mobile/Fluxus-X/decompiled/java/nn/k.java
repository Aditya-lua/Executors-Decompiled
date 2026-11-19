package nn;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnn/k;", BuildConfig.FLAVOR, "RenderingT", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;Lnn/z;)V", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface k<RenderingT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f25877a;

    /* JADX INFO: renamed from: nn.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/k$a;", BuildConfig.FLAVOR, "<init>", "()V", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f25877a = new Companion();
    }

    void a(@NotNull RenderingT rendering, @NotNull ViewEnvironment viewEnvironment);
}
