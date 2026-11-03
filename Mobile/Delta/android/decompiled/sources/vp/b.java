package vp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.ui.WorkflowViewStub;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f33602a;

    @NonNull
    public final WorkflowViewStub b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FloatingActionButton f33603c;

    public b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WorkflowViewStub workflowViewStub, @NonNull FloatingActionButton floatingActionButton) {
        this.f33602a = coordinatorLayout;
        this.b = workflowViewStub;
        this.f33603c = floatingActionButton;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = up.a.f33151a;
        WorkflowViewStub workflowViewStub = (WorkflowViewStub) r5.b.a(view, i10);
        if (workflowViewStub != null) {
            i10 = up.a.b;
            FloatingActionButton floatingActionButton = (FloatingActionButton) r5.b.a(view, i10);
            if (floatingActionButton != null) {
                return new b((CoordinatorLayout) view, workflowViewStub, floatingActionButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(up.b.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f33602a;
    }
}
