package er;

import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.c0;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Ler/m;", "", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "initialValue", "<init>", "(Ljava/util/List;)V", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)V", "Lnu/c0;", "a", "Lnu/c0;", "_selectedOptionsValue", "Lnu/h;", "b", "Lnu/h;", "()Lnu/h;", "onChanged", "value", "()Ljava/util/List;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<List<Option>> _selectedOptionsValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final nu.h<List<Option>> onChanged;

    public m(@NotNull List<Option> initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        c0<List<Option>> c0VarA = r0.a(initialValue);
        this._selectedOptionsValue = c0VarA;
        this.onChanged = nu.j.n(c0VarA, 1);
    }

    @NotNull
    public final nu.h<List<Option>> a() {
        return this.onChanged;
    }

    @NotNull
    public final List<Option> b() {
        return this._selectedOptionsValue.getValue();
    }

    public final void c(@NotNull List<Option> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._selectedOptionsValue.setValue(value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(@Nullable Option option) {
        List listD;
        if (option == null) {
            listD = kotlin.collections.p.k();
        } else {
            listD = kotlin.collections.o.d(option);
        }
        this((List<Option>) listD);
    }
}
