package p555xp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.p052ui.WorkflowViewStub;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p525wp.C12502a;
import p525wp.C12503b;

/* JADX INFO: renamed from: xp.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C12887b implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f45748a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final WorkflowViewStub f45749b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FloatingActionButton f45750c;

    public C12887b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WorkflowViewStub workflowViewStub, @NonNull FloatingActionButton floatingActionButton) {
        this.f45748a = coordinatorLayout;
        this.f45749b = workflowViewStub;
        this.f45750c = floatingActionButton;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C12887b m47912a(@NonNull View view) {
        int i10 = C12502a.f44686a;
        WorkflowViewStub workflowViewStub = (WorkflowViewStub) C10785b.m41116a(view, i10);
        if (workflowViewStub != null) {
            i10 = C12502a.f44687b;
            FloatingActionButton floatingActionButton = (FloatingActionButton) C10785b.m41116a(view, i10);
            if (floatingActionButton != null) {
                return new C12887b((CoordinatorLayout) view, workflowViewStub, floatingActionButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C12887b m47913c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C12503b.f44691b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m47912a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f45748a;
    }
}
