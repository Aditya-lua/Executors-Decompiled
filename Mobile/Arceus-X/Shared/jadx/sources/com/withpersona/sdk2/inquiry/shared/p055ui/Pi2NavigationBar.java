package com.withpersona.sdk2.inquiry.shared.p055ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p226jq.C7280r;
import p226jq.C7281s;
import p226jq.C7285w;
import p313nq.C9547c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Landroid/graphics/Rect;", "padding", "setPreferredPadding", "(Landroid/graphics/Rect;)V", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "state", "Lkotlin/Function0;", "back", "cancel", "launchHelp", "G", "(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", Title.type, "setTitle", "(Ljava/lang/String;)V", "", "controlsColor", "setControlsColor", "(I)V", "defStyleAttr", "defStyleRes", "s", "(Landroid/util/AttributeSet;II)V", "Lnq/c;", "z", "Lnq/c;", "binding", "A", "I", "defaultPadding", "B", "minPadding", "C", "Landroid/graphics/Rect;", "preferredPadding", "Landroid/view/View;", "getBackButton", "()Landroid/view/View;", "backButton", "Landroid/widget/TextView;", "getNavBarTitleView", "()Landroid/widget/TextView;", "navBarTitleView", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Pi2NavigationBar extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final int defaultPadding;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final int minPadding;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public Rect preferredPadding;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final C9547c binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2NavigationBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        C9547c c9547cM37679b = C9547c.m37679b(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c9547cM37679b, "inflate(...)");
        this.binding = c9547cM37679b;
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(C7280r.f28039b);
        this.defaultPadding = dimensionPixelOffset;
        this.minPadding = (int) C7265j.m30285a(12.0d);
        this.preferredPadding = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        m20450s(attributeSet, 0, 0);
    }

    /* JADX INFO: renamed from: H */
    public static final void m20446H(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: I */
    public static final void m20447I(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: J */
    public static final void m20448J(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: G */
    public final void m20449G(@NotNull NavigationState state, @NotNull final Function0<Unit> back, @NotNull final Function0<Unit> cancel, @NotNull final Function0<Unit> launchHelp) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(cancel, "cancel");
        Intrinsics.checkNotNullParameter(launchHelp, "launchHelp");
        if (!state.getShowNavBar()) {
            this.binding.f34507b.setVisibility(8);
            this.binding.f34508c.setVisibility(8);
            this.binding.f34509d.setVisibility(8);
            return;
        }
        this.binding.f34507b.setVisibility(state.getShowBackButton() ? 0 : 4);
        this.binding.f34507b.setOnClickListener(new View.OnClickListener() { // from class: wq.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Pi2NavigationBar.m20446H(back, view);
            }
        });
        this.binding.f34508c.setVisibility(state.getShowCancelButton() ? 0 : 4);
        this.binding.f34508c.setOnClickListener(new View.OnClickListener() { // from class: wq.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Pi2NavigationBar.m20447I(cancel, view);
            }
        });
        this.binding.f34509d.setVisibility(state.getShowHelpButton() ? 0 : 4);
        this.binding.f34509d.setOnClickListener(new View.OnClickListener() { // from class: wq.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Pi2NavigationBar.m20448J(launchHelp, view);
            }
        });
        this.binding.f34507b.setEnabled(state.getIsNavigationEnabled());
        this.binding.f34508c.setEnabled(state.getIsNavigationEnabled());
        this.binding.f34509d.setEnabled(state.getIsNavigationEnabled());
    }

    @NotNull
    public final View getBackButton() {
        ImageView navBarBackButton = this.binding.f34507b;
        Intrinsics.checkNotNullExpressionValue(navBarBackButton, "navBarBackButton");
        return navBarBackButton;
    }

    @NotNull
    public final TextView getNavBarTitleView() {
        TextView navBarTitle = this.binding.f34510e;
        Intrinsics.checkNotNullExpressionValue(navBarTitle, "navBarTitle");
        return navBarTitle;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(C7280r.f28038a);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    /* JADX INFO: renamed from: s */
    public final void m20450s(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C7285w.f28130f, defStyleAttr, defStyleRes);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C7285w.f28131g) {
                    this.binding.f34507b.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, C7281s.f28059t));
                } else if (index == C7285w.f28132h) {
                    this.binding.f34508c.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, C7281s.f28060u));
                } else if (index == C7285w.f28133i) {
                    this.binding.f34509d.setImageResource(typedArrayObtainStyledAttributes.getResourceId(index, C7281s.f28061v));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setControlsColor(int controlsColor) {
        this.binding.f34507b.setColorFilter(controlsColor);
        this.binding.f34508c.setColorFilter(controlsColor);
        this.binding.f34509d.setColorFilter(controlsColor);
        this.binding.f34510e.setTextColor(controlsColor);
    }

    public final void setPreferredPadding(@NotNull Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        if (Intrinsics.m31980c(padding, this.preferredPadding)) {
            return;
        }
        this.preferredPadding = padding;
        int i10 = padding.left;
        int i11 = this.minPadding;
        int iM32078c = i10 - i11;
        int iM32078c2 = padding.top - i11;
        int iM32078c3 = padding.right - i11;
        int iM32078c4 = padding.bottom - i11;
        if (iM32078c < 0) {
            iM32078c = C7764d.m32078c(this.defaultPadding - i11, 0);
        }
        if (iM32078c2 < 0) {
            iM32078c2 = C7764d.m32078c(this.defaultPadding - this.minPadding, 0);
        }
        if (iM32078c3 < 0) {
            iM32078c3 = C7764d.m32078c(this.defaultPadding - this.minPadding, 0);
        }
        if (iM32078c4 < 0) {
            iM32078c4 = C7764d.m32078c(this.defaultPadding - this.minPadding, 0);
        }
        setPadding(iM32078c, iM32078c2, iM32078c3, iM32078c4);
    }

    public final void setTitle(@Nullable String title) {
        if (title == null || StringsKt.m32182p0(title)) {
            this.binding.f34510e.setVisibility(8);
        } else {
            this.binding.f34510e.setText(title);
            this.binding.f34510e.setVisibility(0);
        }
    }
}
