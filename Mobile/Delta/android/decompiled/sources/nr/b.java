package nr;

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
import com.withpersona.sdk2.inquiry.steps.ui.view.SignatureView;
import mr.r1;
import mr.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f27447a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f27448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f27449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Flow f27450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f27451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f27452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final SignatureView f27453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f27454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f27455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f27456k;

    public b(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Button button, @NonNull ImageView imageView, @NonNull Flow flow, @NonNull Button button2, @NonNull View view, @NonNull SignatureView signatureView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f27447a = frameLayout;
        this.b = frameLayout2;
        this.f27448c = button;
        this.f27449d = imageView;
        this.f27450e = flow;
        this.f27451f = button2;
        this.f27452g = view;
        this.f27453h = signatureView;
        this.f27454i = textView;
        this.f27455j = textView2;
        this.f27456k = constraintLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        int i10 = r1.f25197a;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = r1.b;
            Button button = (Button) r5.b.a(view, i10);
            if (button != null) {
                i10 = r1.f25198c;
                ImageView imageView = (ImageView) r5.b.a(view, i10);
                if (imageView != null) {
                    i10 = r1.f25200e;
                    Flow flow = (Flow) r5.b.a(view, i10);
                    if (flow != null) {
                        i10 = r1.f25211p;
                        Button button2 = (Button) r5.b.a(view, i10);
                        if (button2 != null && (viewA = r5.b.a(view, (i10 = r1.f25212q))) != null) {
                            i10 = r1.f25213r;
                            SignatureView signatureView = (SignatureView) r5.b.a(view, i10);
                            if (signatureView != null) {
                                i10 = r1.f25214s;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = r1.f25215t;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = r1.f25216u;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                                        if (constraintLayout != null) {
                                            return new b((FrameLayout) view, frameLayout, button, imageView, flow, button2, viewA, signatureView, textView, textView2, constraintLayout);
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
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(s1.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f27447a;
    }
}
