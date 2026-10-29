package p434sp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p419rp.C11043o1;
import p419rp.C11046p1;

/* JADX INFO: renamed from: sp.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11444c implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f40449a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f40450b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f40451c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Flow f40452d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f40453e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final PersonaMaterialButton f40454f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final PersonaMaterialButton f40455g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f40456h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f40457i;

    public C11444c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull TextView textView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull PersonaMaterialButton personaMaterialButton2, @NonNull View view, @NonNull TextView textView2) {
        this.f40449a = coordinatorLayout;
        this.f40450b = frameLayout;
        this.f40451c = constraintLayout;
        this.f40452d = flow;
        this.f40453e = textView;
        this.f40454f = personaMaterialButton;
        this.f40455g = personaMaterialButton2;
        this.f40456h = view;
        this.f40457i = textView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C11444c m42860a(@NonNull View view) {
        View viewM41116a;
        int i10 = C11043o1.f39022a;
        FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
        if (frameLayout != null) {
            i10 = C11043o1.f39023b;
            ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
            if (constraintLayout != null) {
                i10 = C11043o1.f39025d;
                Flow flow = (Flow) C10785b.m41116a(view, i10);
                if (flow != null) {
                    i10 = C11043o1.f39026e;
                    TextView textView = (TextView) C10785b.m41116a(view, i10);
                    if (textView != null) {
                        i10 = C11043o1.f39027f;
                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                        if (personaMaterialButton != null) {
                            i10 = C11043o1.f39028g;
                            PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                            if (personaMaterialButton2 != null && (viewM41116a = C10785b.m41116a(view, (i10 = C11043o1.f39029h))) != null) {
                                i10 = C11043o1.f39030i;
                                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                if (textView2 != null) {
                                    return new C11444c((CoordinatorLayout) view, frameLayout, constraintLayout, flow, textView, personaMaterialButton, personaMaterialButton2, viewM41116a, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C11444c m42861c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C11046p1.f39037c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m42860a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f40449a;
    }
}
