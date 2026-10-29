package p084dr;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7255e;
import p227jr.C7301g;
import p227jr.C7304h0;
import p227jr.EnumC7298e0;
import p313nq.C9549e;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: dr.r */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m31665d2 = {"Ldr/r;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;", "helpBottomSheetComponentStyle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;)V", "", "Ldr/s;", "tips", "", "G", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "holder", "position", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "e", "()I", "Ljq/e;", "d", "Ljq/e;", "adapterHelper", "a", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4678r extends RecyclerView.AbstractC1025h<RecyclerView.AbstractC1023f0> {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String[] f19158f = {"#02099C", "#030A9C", "#020A9B", "#02089B"};

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final String[] f19159g = {"#D3D5FF", "#D4D6FF", "#D3D6FF", "#D2D4FF", "#7379FC"};

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final String[] f19160h = {"#7379FD"};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C7255e<HelpPagerItem> adapterHelper;

    /* JADX INFO: renamed from: dr.r$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9549e> {

        /* JADX INFO: renamed from: a */
        public static final b f19162a = new b();

        public b() {
            super(3, C9549e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2NavigationTroubleshootingTipsPageItemBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C9549e m22968d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C9549e.m37684c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C9549e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m22968d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public C4678r(@Nullable final HelpBottomSheetComponentStyle helpBottomSheetComponentStyle) {
        C7255e<HelpPagerItem> c7255e = new C7255e<>(new Function2() { // from class: dr.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C4678r.m22965E((HelpPagerItem) obj, (HelpPagerItem) obj2));
            }
        }, null, null, 6, null);
        c7255e.m30242j(C7731d0.m32002b(HelpPagerItem.class), C7731d0.m32002b(C9549e.class), b.f19162a, new InterfaceC14057n() { // from class: dr.q
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C4678r.m22966F(helpBottomSheetComponentStyle, (HelpPagerItem) obj, (C9549e) obj2, (RecyclerView.AbstractC1023f0) obj3);
            }
        }, null);
        this.adapterHelper = c7255e;
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m22965E(HelpPagerItem old, HelpPagerItem helpPagerItem) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(helpPagerItem, "new");
        return Intrinsics.m31980c(old.getDescription(), helpPagerItem.getDescription()) && Intrinsics.m31980c(old.getLocalAsset(), helpPagerItem.getLocalAsset());
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m22966F(HelpBottomSheetComponentStyle helpBottomSheetComponentStyle, HelpPagerItem item, C9549e viewBinding, RecyclerView.AbstractC1023f0 viewHolder) {
        TextViewStyle helpTextviewStyle;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewBinding.f34524b.setText(item.getDescription());
        if (helpBottomSheetComponentStyle != null && (helpTextviewStyle = helpBottomSheetComponentStyle.getHelpTextviewStyle()) != null) {
            TextView description = viewBinding.f34524b;
            Intrinsics.checkNotNullExpressionValue(description, "description");
            C7304h0.m30391k(description, helpTextviewStyle, C7700p0.m31904c(EnumC7298e0.Margin));
        }
        Integer localAsset = item.getLocalAsset();
        if (localAsset != null) {
            int iIntValue = localAsset.intValue();
            ThemeableLottieAnimationView themeableLottieAnimationView = viewBinding.f34525c;
            themeableLottieAnimationView.setAnimation(iIntValue);
            if (helpBottomSheetComponentStyle != null) {
                Intrinsics.checkNotNull(themeableLottieAnimationView);
                C7301g.m30380m(themeableLottieAnimationView, helpBottomSheetComponentStyle.getStrokeColorValue(), helpBottomSheetComponentStyle.getFillColorValue(), null, helpBottomSheetComponentStyle.getBackgroundColorValue(), f19158f, f19159g, null, f19160h, 68, null);
            }
            themeableLottieAnimationView.m8434v();
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G */
    public final void m22967G(@NotNull List<HelpPagerItem> tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        C7255e.m30240t(this.adapterHelper, tips, this, null, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: e */
    public int mo5473e() {
        return this.adapterHelper.m30243m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: r */
    public void mo5486r(@NotNull RecyclerView.AbstractC1023f0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.adapterHelper.m30247q(holder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    @NotNull
    /* JADX INFO: renamed from: t */
    public RecyclerView.AbstractC1023f0 mo5488t(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.adapterHelper.m30248r(parent, viewType);
    }
}
