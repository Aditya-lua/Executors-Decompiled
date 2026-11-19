package fs;

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
import es.w1;
import es.x1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f16586a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f16587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f16588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Flow f16589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f16590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f16591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final SignatureView f16592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f16593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f16594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16595k;

    public b(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Button button, @NonNull ImageView imageView, @NonNull Flow flow, @NonNull Button button2, @NonNull View view, @NonNull SignatureView signatureView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f16586a = frameLayout;
        this.b = frameLayout2;
        this.f16587c = button;
        this.f16588d = imageView;
        this.f16589e = flow;
        this.f16590f = button2;
        this.f16591g = view;
        this.f16592h = signatureView;
        this.f16593i = textView;
        this.f16594j = textView2;
        this.f16595k = constraintLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        int i10 = w1.f14577a;
        FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = w1.b;
            Button button = (Button) s5.b.a(view, i10);
            if (button != null) {
                i10 = w1.f14578c;
                ImageView imageView = (ImageView) s5.b.a(view, i10);
                if (imageView != null) {
                    i10 = w1.f14580e;
                    Flow flow = (Flow) s5.b.a(view, i10);
                    if (flow != null) {
                        i10 = w1.f14591p;
                        Button button2 = (Button) s5.b.a(view, i10);
                        if (button2 != null && (viewA = s5.b.a(view, (i10 = w1.f14592q))) != null) {
                            i10 = w1.f14593r;
                            SignatureView signatureView = (SignatureView) s5.b.a(view, i10);
                            if (signatureView != null) {
                                i10 = w1.f14594s;
                                TextView textView = (TextView) s5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = w1.f14595t;
                                    TextView textView2 = (TextView) s5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = w1.f14596u;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(x1.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f16586a;
    }
}
