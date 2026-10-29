package androidx.p616lifecycle;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4442f;
import p068d5.InterfaceC4445i;

/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Landroidx/lifecycle/k;", "", "<init>", "()V", "Ld5/f;", "registry", "Landroidx/lifecycle/l;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/n0;", "b", "(Ld5/f;Landroidx/lifecycle/l;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/n0;", "Landroidx/lifecycle/x0;", "viewModel", "", "a", "(Landroidx/lifecycle/x0;Ld5/f;Landroidx/lifecycle/l;)V", "c", "(Ld5/f;Landroidx/lifecycle/l;)V", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0964k {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0964k f3683a = new C0964k();

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Landroidx/lifecycle/k$a;", "Ld5/f$a;", "<init>", "()V", "Ld5/i;", "owner", "", "a", "(Ld5/i;)V", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements C4442f.a {
        @Override // p068d5.C4442f.a
        /* JADX INFO: renamed from: a */
        public void mo4925a(@NotNull InterfaceC4445i owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof InterfaceC0947c1)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            C0944b1 c0944b1Mo4712w = ((InterfaceC0947c1) owner).mo4712w();
            C4442f c4442fMo4583A = owner.mo4583A();
            Iterator<String> it = c0944b1Mo4712w.m4889c().iterator();
            while (it.hasNext()) {
                AbstractC0991x0 abstractC0991x0M4888b = c0944b1Mo4712w.m4888b(it.next());
                if (abstractC0991x0M4888b != null) {
                    C0964k.m4922a(abstractC0991x0M4888b, c4442fMo4583A, owner.mo4656a());
                }
            }
            if (c0944b1Mo4712w.m4889c().isEmpty()) {
                return;
            }
            c4442fMo4583A.m22355d(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.k$b */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"androidx/lifecycle/k$b", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "lifecycle-viewmodel-savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b implements InterfaceC0974p {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0966l f3684a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4442f f3685b;

        public b(AbstractC0966l abstractC0966l, C4442f c4442f) {
            this.f3684a = abstractC0966l;
            this.f3685b = c4442f;
        }

        @Override // androidx.p616lifecycle.InterfaceC0974p
        /* JADX INFO: renamed from: g */
        public void mo1334g(InterfaceC0980s source, AbstractC0966l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC0966l.a.ON_START) {
                this.f3684a.mo4938d(this);
                this.f3685b.m22355d(a.class);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m4922a(@NotNull AbstractC0991x0 viewModel, @NotNull C4442f registry, @NotNull AbstractC0966l lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C0971n0 c0971n0 = (C0971n0) viewModel.m5011c("androidx.lifecycle.savedstate.vm.tag");
        if (c0971n0 == null || c0971n0.getIsAttached()) {
            return;
        }
        c0971n0.m4960a(registry, lifecycle);
        f3683a.m4924c(registry, lifecycle);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C0971n0 m4923b(@NotNull C4442f registry, @NotNull AbstractC0966l lifecycle, @Nullable String key, @Nullable Bundle defaultArgs) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        C0971n0 c0971n0 = new C0971n0(key, C0967l0.INSTANCE.m4955a(registry.m22352a(key), defaultArgs));
        c0971n0.m4960a(registry, lifecycle);
        f3683a.m4924c(registry, lifecycle);
        return c0971n0;
    }

    /* JADX INFO: renamed from: c */
    public final void m4924c(C4442f registry, AbstractC0966l lifecycle) {
        AbstractC0966l.b state = lifecycle.getState();
        if (state == AbstractC0966l.b.INITIALIZED || state.m4945b(AbstractC0966l.b.STARTED)) {
            registry.m22355d(a.class);
        } else {
            lifecycle.mo4935a(new b(lifecycle, registry));
        }
    }
}
