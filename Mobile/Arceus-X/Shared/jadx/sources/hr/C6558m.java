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
import androidx.recyclerview.widget.C1053d;
import androidx.recyclerview.widget.C1056g;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import gr.C6230r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lr.C8243c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7266j0;
import p226jq.C7268k0;
import p227jr.C7304h0;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: hr.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R.\u0010<\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010A\u001a\n >*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010I\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\u00060\u00060F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, m31665d2 = {"Lhr/m;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "canSelectMultipleValues", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leadingImageTemplate", "initialSelectedOptions", "Lkotlin/Function1;", "", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;ZLcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "e", "()I", "holder", "position", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "K", "()V", "Lgr/r;", "binding", "option", "E", "(Lgr/r;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)V", "I", "(I)V", "d", "Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "f", "Z", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "h", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "", "value", "i", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "J", "(Ljava/lang/String;)V", "query", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "j", "Landroid/view/LayoutInflater;", "inflater", "", "k", "Ljava/util/Set;", "_selectedValues", "Landroidx/recyclerview/widget/d;", "l", "Landroidx/recyclerview/widget/d;", "asyncListDiffer", "F", "()Ljava/util/List;", "selectedOptions", "a", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6558m extends RecyclerView.AbstractC1025h<RecyclerView.AbstractC1023f0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<Option> options;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final InputSelectBoxComponentStyle styles;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean canSelectMultipleValues;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final RemoteImage leadingImageTemplate;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Function1<Option, Unit> onClick;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String query;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final LayoutInflater inflater;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Set<Option> _selectedValues;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C1053d<Option> asyncListDiffer;

    /* JADX INFO: renamed from: hr.m$a */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lhr/m$a;", "Landroidx/recyclerview/widget/g$f;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "<init>", "()V", "oldItem", "newItem", "", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Z", "d", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends C1056g.f<Option> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.C1056g.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo5935a(@NotNull Option oldItem, @NotNull Option newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.m31980c(oldItem, newItem);
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.C1056g.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo5936b(@NotNull Option oldItem, @NotNull Option newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.m31980c(oldItem, newItem);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.Option, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6558m(@NotNull Context context, @NotNull List<Option> options, @Nullable InputSelectBoxComponentStyle inputSelectBoxComponentStyle, boolean z10, @Nullable RemoteImage remoteImage, @NotNull List<Option> initialSelectedOptions, @NotNull Function1<? super Option, Unit> onClick) {
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
        this.asyncListDiffer = new C1053d<>(this, new a());
        List<Option> list = options;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Option) it.next()).getValue());
        }
        Set setQ0 = CollectionsKt.m31691Q0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : initialSelectedOptions) {
            if (setQ0.contains(((Option) obj).getValue())) {
                arrayList2.add(obj);
            }
        }
        this._selectedValues = CollectionsKt.m31690P0(arrayList2);
        m28419K();
    }

    /* JADX INFO: renamed from: G */
    public static final void m28413G(C6558m c6558m, RecyclerView.AbstractC1023f0 abstractC1023f0, View view) {
        c6558m.m28417I(abstractC1023f0.m5442k());
    }

    /* JADX INFO: renamed from: H */
    public static final void m28414H(C6558m c6558m, RecyclerView.AbstractC1023f0 abstractC1023f0, View view) {
        c6558m.m28417I(abstractC1023f0.m5442k());
    }

    /* JADX INFO: renamed from: E */
    public final void m28415E(C6230r binding, Option option) {
        binding.f23733d.removeAllViews();
        RemoteImage remoteImage = this.leadingImageTemplate;
        String leadingImageUrl = option.getLeadingImageUrl();
        if (remoteImage == null || leadingImageUrl == null || StringsKt.m32182p0(leadingImageUrl)) {
            binding.f23733d.setVisibility(8);
            return;
        }
        binding.f23733d.setVisibility(0);
        RemoteImage remoteImageM33621i = C8243c.m33621i(remoteImage, leadingImageUrl);
        ConstraintLayout leadingImageContainer = binding.f23733d;
        Intrinsics.checkNotNullExpressionValue(leadingImageContainer, "leadingImageContainer");
        C8243c.m33617e(remoteImageM33621i, leadingImageContainer, true);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final List<Option> m28416F() {
        return CollectionsKt.m31687M0(this._selectedValues);
    }

    /* JADX INFO: renamed from: I */
    public final void m28417I(int position) {
        if (!this.canSelectMultipleValues) {
            this._selectedValues.clear();
        }
        Option option = this.asyncListDiffer.m5864a().get(position);
        if (this._selectedValues.contains(option)) {
            this._selectedValues.remove(option);
        } else {
            Set<Option> set = this._selectedValues;
            Intrinsics.checkNotNull(option);
            set.add(option);
        }
        m5479k(position);
        Function1<Option, Unit> function1 = this.onClick;
        Intrinsics.checkNotNull(option);
        function1.invoke(option);
    }

    /* JADX INFO: renamed from: J */
    public final void m28418J(@Nullable String str) {
        this.query = str;
        m28419K();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.recyclerview.widget.d<com.withpersona.sdk2.inquiry.steps.ui.components.Option> */
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
    /* JADX INFO: renamed from: K */
    public final void m28419K() {
        Collection arrayList;
        String str = this.query;
        if (str == null || StringsKt.m32182p0(str)) {
            arrayList = this.options;
        } else {
            List<Option> list = this.options;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt.m32148Y(((Option) obj).getText(), str, true)) {
                    arrayList.add(obj);
                }
            }
        }
        this.asyncListDiffer.m5867d(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: e */
    public int mo5473e() {
        return this.asyncListDiffer.m5864a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: r */
    public void mo5486r(@NotNull final RecyclerView.AbstractC1023f0 holder, int position) {
        Integer focusedBackgroundColorValue;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Option option = this.asyncListDiffer.m5864a().get(position);
        C6230r c6230r = (C6230r) C7268k0.m30294a(holder);
        c6230r.f23732c.setText(option.getText());
        Intrinsics.checkNotNull(option);
        m28415E(c6230r, option);
        c6230r.getRoot().setOnClickListener(new View.OnClickListener() { // from class: hr.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6558m.m28413G(this.f24920a, holder, view);
            }
        });
        c6230r.f23731b.setOnClickListener(new View.OnClickListener() { // from class: hr.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6558m.m28414H(this.f24922a, holder, view);
            }
        });
        boolean zContains = this._selectedValues.contains(option);
        c6230r.f23731b.setChecked(zContains);
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle == null || (focusedBackgroundColorValue = inputSelectBoxComponentStyle.getFocusedBackgroundColorValue()) == null) {
            return;
        }
        int iIntValue = focusedBackgroundColorValue.intValue();
        if (this.canSelectMultipleValues) {
            return;
        }
        if (zContains) {
            c6230r.getRoot().setBackgroundColor(iIntValue);
            return;
        }
        TypedValue typedValue = new TypedValue();
        c6230r.getRoot().getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        c6230r.getRoot().setBackgroundResource(typedValue.resourceId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    @NotNull
    /* JADX INFO: renamed from: t */
    public RecyclerView.AbstractC1023f0 mo5488t(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C6230r c6230rM27409c = C6230r.m27409c(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(c6230rM27409c, "inflate(...)");
        C7266j0 c7266j0 = new C7266j0(c6230rM27409c);
        InterfaceC10784a interfaceC10784aM30292N = c7266j0.m30292N();
        Intrinsics.checkNotNullExpressionValue(interfaceC10784aM30292N, "<get-binding>(...)");
        C6230r c6230r = (C6230r) interfaceC10784aM30292N;
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle != null) {
            TextView label = c6230r.f23732c;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            C7304h0.m30392l(label, inputSelectBoxComponentStyle.getTextBasedStyle(), null, 2, null);
        }
        if (!this.canSelectMultipleValues) {
            c6230r.f23731b.setVisibility(8);
            return c7266j0;
        }
        c6230r.f23731b.setVisibility(0);
        c6230r.f23731b.setButtonTintList(ColorStateList.valueOf(c6230r.f23732c.getCurrentTextColor()));
        return c7266j0;
    }
}
