package com.squareup.workflow1.ui;

import an.ViewEnvironment;
import an.c0;
import an.d0;
import an.e0;
import an.f0;
import an.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bn.d;
import com.squareup.workflow1.ui.WorkflowViewStub;
import d5.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u000eR4\u0010:\u001a\u0014\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/squareup/workflow1/ui/WorkflowViewStub;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "id", "", "setId", "(I)V", "visibility", "setVisibility", "getVisibility", "()I", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "rendering", "Lan/y;", "viewEnvironment", "c", "(Ljava/lang/Object;Lan/y;)Landroid/view/View;", "newView", "b", "(Landroid/view/View;)V", "<set-?>", "a", "Landroid/view/View;", "getActual", "()Landroid/view/View;", "actual", "", "Z", "getUpdatesVisibility", "()Z", "setUpdatesVisibility", "(Z)V", "updatesVisibility", "value", "I", "getInflatedId", "setInflatedId", "inflatedId", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "d", "Lkotlin/jvm/functions/Function2;", "getReplaceOldViewInParent", "()Lkotlin/jvm/functions/Function2;", "setReplaceOldViewInParent", "(Lkotlin/jvm/functions/Function2;)V", "replaceOldViewInParent", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WorkflowViewStub extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public View actual;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean updatesVisibility;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int inflatedId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function2<? super ViewGroup, ? super View, Unit> replaceOldViewInParent;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "newView", "", "a", "(Landroid/view/ViewGroup;Landroid/view/View;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends m implements Function2<ViewGroup, View, Unit> {
        public a() {
            super(2);
        }

        public final void a(@NotNull ViewGroup parent, @NotNull View newView) {
            Unit unit;
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(newView, "newView");
            int iIndexOfChild = parent.indexOfChild(WorkflowViewStub.this.getActual());
            parent.removeView(WorkflowViewStub.this.getActual());
            ViewGroup.LayoutParams layoutParams = WorkflowViewStub.this.getActual().getLayoutParams();
            if (layoutParams == null) {
                unit = null;
            } else {
                parent.addView(newView, iIndexOfChild, layoutParams);
                unit = Unit.f22483a;
            }
            if (unit == null) {
                parent.addView(newView, iIndexOfChild);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup, View view) {
            a(viewGroup, view);
            return Unit.f22483a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void d(View view, Function0 doStart) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(doStart, "doStart");
        d.Companion.e(d.INSTANCE, view, null, 2, null);
        doStart.invoke();
    }

    public final void b(View newView) {
        i iVarA = d5.m.a(this);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (iVarA != (viewGroup != null ? d5.m.a(viewGroup) : null)) {
            d5.m.b(newView, iVarA);
        }
    }

    @NotNull
    public final View c(@NotNull Object rendering, @NotNull ViewEnvironment viewEnvironment) {
        d dVarC;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        View view = this.actual;
        if (!e0.b(view, rendering)) {
            view = null;
        }
        if (view != null) {
            e0.g(view, rendering, viewEnvironment);
            return view;
        }
        ViewParent parent = this.actual.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            throw new IllegalStateException("WorkflowViewStub must have a non-null ViewGroup parent");
        }
        View view2 = this.actual;
        if (view2 != this && (dVarC = d.INSTANCE.c(view2)) != null) {
            dVarC.L();
        }
        c0 c0Var = (c0) viewEnvironment.a(c0.INSTANCE);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View viewC = d0.c(c0Var, rendering, viewEnvironment, context, viewGroup, new f0() { // from class: an.i0
            @Override // an.f0
            public final void a(View view3, Function0 function0) {
                WorkflowViewStub.d(view3, function0);
            }
        });
        e0.h(viewC);
        if (getInflatedId() != -1) {
            viewC.setId(getInflatedId());
        }
        if (getUpdatesVisibility()) {
            viewC.setVisibility(getVisibility());
        }
        Drawable background = getBackground();
        if (background != null) {
            viewC.setBackground(background);
        }
        b(viewC);
        getReplaceOldViewInParent().invoke(viewGroup, viewC);
        this.actual = viewC;
        return viewC;
    }

    @NotNull
    public final View getActual() {
        return this.actual;
    }

    public final int getInflatedId() {
        return this.inflatedId;
    }

    @NotNull
    public final Function2<ViewGroup, View, Unit> getReplaceOldViewInParent() {
        return this.replaceOldViewInParent;
    }

    public final boolean getUpdatesVisibility() {
        return this.updatesVisibility;
    }

    @Override // android.view.View
    public int getVisibility() {
        View view = this.actual;
        return (Intrinsics.c(view, this) || view == null) ? super.getVisibility() : this.actual.getVisibility();
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable background) {
        View view;
        super.setBackground(background);
        if (Intrinsics.c(this.actual, this) || (view = this.actual) == null || background == null) {
            return;
        }
        view.setBackground(background);
    }

    @Override // android.view.View
    public void setId(int id2) {
        if (id2 != -1 && id2 == this.inflatedId) {
            throw new IllegalArgumentException(Intrinsics.l("id must be distinct from inflatedId: ", getResources().getResourceName(id2)).toString());
        }
        super.setId(id2);
    }

    public final void setInflatedId(int i10) {
        if (i10 != -1 && i10 == getId()) {
            throw new IllegalArgumentException(Intrinsics.l("inflatedId must be distinct from id: ", getResources().getResourceName(getId())).toString());
        }
        this.inflatedId = i10;
    }

    public final void setReplaceOldViewInParent(@NotNull Function2<? super ViewGroup, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.replaceOldViewInParent = function2;
    }

    public final void setUpdatesVisibility(boolean z10) {
        this.updatesVisibility = z10;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        View view;
        super.setVisibility(visibility);
        if (Intrinsics.c(this.actual, this) || (view = this.actual) == null) {
            return;
        }
        view.setVisibility(visibility);
    }

    public /* synthetic */ WorkflowViewStub(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actual = this;
        this.updatesVisibility = true;
        this.inflatedId = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f732a, i10, i11);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…fStyle, defStyleRes\n    )");
        setInflatedId(typedArrayObtainStyledAttributes.getResourceId(p.b, -1));
        this.updatesVisibility = typedArrayObtainStyledAttributes.getBoolean(p.f733c, true);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        this.replaceOldViewInParent = new a();
    }
}
