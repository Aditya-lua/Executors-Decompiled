package pr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.steps.p056ui.view.SignatureView;
import p342or.C9978r1;
import p342or.C9985s1;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: pr.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10318b implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f37155a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f37156b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Button f37157c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f37158d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Flow f37159e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Button f37160f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f37161g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final SignatureView f37162h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f37163i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f37164j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f37165k;

    public C10318b(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Button button, @NonNull ImageView imageView, @NonNull Flow flow, @NonNull Button button2, @NonNull View view, @NonNull SignatureView signatureView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f37155a = frameLayout;
        this.f37156b = frameLayout2;
        this.f37157c = button;
        this.f37158d = imageView;
        this.f37159e = flow;
        this.f37160f = button2;
        this.f37161g = view;
        this.f37162h = signatureView;
        this.f37163i = textView;
        this.f37164j = textView2;
        this.f37165k = constraintLayout;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C10318b m39626a(@NonNull View view) {
        View viewM41116a;
        int i10 = C9978r1.f36009a;
        FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
        if (frameLayout != null) {
            i10 = C9978r1.f36010b;
            Button button = (Button) C10785b.m41116a(view, i10);
            if (button != null) {
                i10 = C9978r1.f36011c;
                ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                if (imageView != null) {
                    i10 = C9978r1.f36013e;
                    Flow flow = (Flow) C10785b.m41116a(view, i10);
                    if (flow != null) {
                        i10 = C9978r1.f36024p;
                        Button button2 = (Button) C10785b.m41116a(view, i10);
                        if (button2 != null && (viewM41116a = C10785b.m41116a(view, (i10 = C9978r1.f36025q))) != null) {
                            i10 = C9978r1.f36026r;
                            SignatureView signatureView = (SignatureView) C10785b.m41116a(view, i10);
                            if (signatureView != null) {
                                i10 = C9978r1.f36027s;
                                TextView textView = (TextView) C10785b.m41116a(view, i10);
                                if (textView != null) {
                                    i10 = C9978r1.f36028t;
                                    TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                    if (textView2 != null) {
                                        i10 = C9978r1.f36029u;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                                        if (constraintLayout != null) {
                                            return new C10318b((FrameLayout) view, frameLayout, button, imageView, flow, button2, viewM41116a, signatureView, textView, textView2, constraintLayout);
                                        }
                                    }
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
    public static C10318b m39627c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C9985s1.f36045b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m39626a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f37155a;
    }
}
