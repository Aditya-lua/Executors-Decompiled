package rp;

import com.squareup.workflow1.ui.backstack.BackStackContainer;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lrp/k1;", "", "a", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f30147a;

    /* JADX INFO: renamed from: rp.k1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrp/k1$a;", "", "<init>", "()V", "", "Lan/a0;", "a", "()Ljava/util/Set;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f30147a = new Companion();

        @NotNull
        public final Set<an.a0<?>> a() {
            return kotlin.collections.q0.g(op.b.INSTANCE, BackStackContainer.INSTANCE);
        }
    }

    @NotNull
    static Set<an.a0<?>> a() {
        return INSTANCE.a();
    }
}
