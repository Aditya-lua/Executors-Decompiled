package p313nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import p226jq.C7282t;
import p226jq.C7283u;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: nq.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C9549e implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f34523a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f34524b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ThemeableLottieAnimationView f34525c;

    public C9549e(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f34523a = linearLayout;
        this.f34524b = textView;
        this.f34525c = themeableLottieAnimationView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9549e m37683a(@NonNull View view) {
        int i10 = C7282t.f28070h;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C7282t.f28074l;
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) C10785b.m41116a(view, i10);
            if (themeableLottieAnimationView != null) {
                return new C9549e((LinearLayout) view, textView, themeableLottieAnimationView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C9549e m37684c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C7283u.f28093e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37683a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f34523a;
    }
}
