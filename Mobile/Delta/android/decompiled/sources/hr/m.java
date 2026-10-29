package hr;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import gr.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jq.j0;
import jq.k0;
import jr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R.\u0010<\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010A\u001a\n >*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010I\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\u00060\u00060F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lhr/m;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "canSelectMultipleValues", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leadingImageTemplate", "initialSelectedOptions", "Lkotlin/Function1;", "", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;ZLcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "e", "()I", "holder", "position", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "K", "()V", "Lgr/r;", "binding", "option", "E", "(Lgr/r;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)V", "I", "(I)V", "d", "Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "f", "Z", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "h", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "", "value", "i", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "J", "(Ljava/lang/String;)V", "query", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "j", "Landroid/view/LayoutInflater;", "inflater", "", "k", "Ljava/util/Set;", "_selectedValues", "Landroidx/recyclerview/widget/d;", "l", "Landroidx/recyclerview/widget/d;", "asyncListDiffer", "F", "()Ljava/util/List;", "selectedOptions", "a", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Option> options;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final InputSelectBoxComponentStyle styles;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean canSelectMultipleValues;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final RemoteImage leadingImageTemplate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Option, Unit> onClick;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String query;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final LayoutInflater inflater;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Set<Option> _selectedValues;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.recyclerview.widget.d<Option> asyncListDiffer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lhr/m$a;", "Landroidx/recyclerview/widget/g$f;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "<init>", "()V", "oldItem", "newItem", "", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Z", "d", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.g.f<Option> {
        @Override // androidx.recyclerview.widget.g.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(@NotNull Option oldItem, @NotNull Option newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.c(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.g.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(@NotNull Option oldItem, @NotNull Option newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.c(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull Context context, @NotNull List<Option> options, @Nullable InputSelectBoxComponentStyle inputSelectBoxComponentStyle, boolean z10, @Nullable RemoteImage remoteImage, @NotNull List<Option> initialSelectedOptions, @NotNull Function1<? super Option, Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(initialSelectedOptions, "initialSelectedOptions");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.options = options;
        this.styles = inputSelectBoxComponentStyle;
        this.canSelectMultipleValues = z10;
        this.leadingImageTemplate = remoteImage;
        this.onClick = onClick;
        this.inflater = LayoutInflater.from(context);
        this.asyncListDiffer = new androidx.recyclerview.widget.d<>(this, new a());
        List<Option> list = options;
        ArrayList arrayList = new ArrayList(q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Option) it.next()).getValue());
        }
        Set setQ0 = CollectionsKt.Q0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : initialSelectedOptions) {
            if (setQ0.contains(((Option) obj).getValue())) {
                arrayList2.add(obj);
            }
        }
        this._selectedValues = CollectionsKt.P0(arrayList2);
        K();
    }

    public static final void G(m mVar, RecyclerView.f0 f0Var, View view) {
        mVar.I(f0Var.k());
    }

    public static final void H(m mVar, RecyclerView.f0 f0Var, View view) {
        mVar.I(f0Var.k());
    }

    public final void E(r binding, Option option) {
        binding.f18457d.removeAllViews();
        RemoteImage remoteImage = this.leadingImageTemplate;
        String leadingImageUrl = option.getLeadingImageUrl();
        if (remoteImage == null || leadingImageUrl == null || StringsKt.p0(leadingImageUrl)) {
            binding.f18457d.setVisibility(8);
            return;
        }
        binding.f18457d.setVisibility(0);
        RemoteImage remoteImageI = lr.c.i(remoteImage, leadingImageUrl);
        ConstraintLayout leadingImageContainer = binding.f18457d;
        Intrinsics.checkNotNullExpressionValue(leadingImageContainer, "leadingImageContainer");
        lr.c.e(remoteImageI, leadingImageContainer, true);
    }

    @NotNull
    public final List<Option> F() {
        return CollectionsKt.M0(this._selectedValues);
    }

    public final void I(int position) {
        if (!this.canSelectMultipleValues) {
            this._selectedValues.clear();
        }
        Option option = this.asyncListDiffer.a().get(position);
        if (this._selectedValues.contains(option)) {
            this._selectedValues.remove(option);
        } else {
            Set<Option> set = this._selectedValues;
            Intrinsics.checkNotNull(option);
            set.add(option);
        }
        k(position);
        Function1<Option, Unit> function1 = this.onClick;
        Intrinsics.checkNotNull(option);
        function1.invoke(option);
    }

    public final void J(@Nullable String str) {
        this.query = str;
        K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void K() {
        Collection arrayList;
        String str = this.query;
        if (str == null || StringsKt.p0(str)) {
            arrayList = this.options;
        } else {
            List<Option> list = this.options;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.Y(((Option) obj).getText(), str, true)) {
                    arrayList.add(obj);
                }
            }
        }
        this.asyncListDiffer.d(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.asyncListDiffer.a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void r(@NotNull final RecyclerView.f0 holder, int position) {
        Integer focusedBackgroundColorValue;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Option option = this.asyncListDiffer.a().get(position);
        r rVar = (r) k0.a(holder);
        rVar.f18456c.setText(option.getText());
        Intrinsics.checkNotNull(option);
        E(rVar, option);
        rVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: hr.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.G(this.f19789a, holder, view);
            }
        });
        rVar.b.setOnClickListener(new View.OnClickListener() { // from class: hr.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.H(this.f19790a, holder, view);
            }
        });
        boolean zContains = this._selectedValues.contains(option);
        rVar.b.setChecked(zContains);
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle == null || (focusedBackgroundColorValue = inputSelectBoxComponentStyle.getFocusedBackgroundColorValue()) == null) {
            return;
        }
        int iIntValue = focusedBackgroundColorValue.intValue();
        if (this.canSelectMultipleValues) {
            return;
        }
        if (zContains) {
            rVar.getRoot().setBackgroundColor(iIntValue);
            return;
        }
        TypedValue typedValue = new TypedValue();
        rVar.getRoot().getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        rVar.getRoot().setBackgroundResource(typedValue.resourceId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.f0 t(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        r rVarC = r.c(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(rVarC, "inflate(...)");
        j0 j0Var = new j0(rVarC);
        r5.a aVarN = j0Var.N();
        Intrinsics.checkNotNullExpressionValue(aVarN, "<get-binding>(...)");
        r rVar = (r) aVarN;
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle != null) {
            TextView label = rVar.f18456c;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            h0.l(label, inputSelectBoxComponentStyle.getTextBasedStyle(), null, 2, null);
        }
        if (!this.canSelectMultipleValues) {
            rVar.b.setVisibility(8);
            return j0Var;
        }
        rVar.b.setVisibility(0);
        rVar.b.setButtonTintList(ColorStateList.valueOf(rVar.f18456c.getCurrentTextColor()));
        return j0Var;
    }
}
