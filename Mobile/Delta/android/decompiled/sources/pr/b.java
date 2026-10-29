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
import com.withpersona.sdk2.inquiry.steps.ui.view.SignatureView;
import or.r1;
import or.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28853a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f28854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f28855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Flow f28856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f28857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f28858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final SignatureView f28859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f28860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f28861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28862k;

    public b(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Button button, @NonNull ImageView imageView, @NonNull Flow flow, @NonNull Button button2, @NonNull View view, @NonNull SignatureView signatureView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f28853a = frameLayout;
        this.b = frameLayout2;
        this.f28854c = button;
        this.f28855d = imageView;
        this.f28856e = flow;
        this.f28857f = button2;
        this.f28858g = view;
        this.f28859h = signatureView;
        this.f28860i = textView;
        this.f28861j = textView2;
        this.f28862k = constraintLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        int i10 = r1.f27808a;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = r1.b;
            Button button = (Button) r5.b.a(view, i10);
            if (button != null) {
                i10 = r1.f27809c;
                ImageView imageView = (ImageView) r5.b.a(view, i10);
                if (imageView != null) {
                    i10 = r1.f27811e;
                    Flow flow = (Flow) r5.b.a(view, i10);
                    if (flow != null) {
                        i10 = r1.f27822p;
                        Button button2 = (Button) r5.b.a(view, i10);
                        if (button2 != null && (viewA = r5.b.a(view, (i10 = r1.f27823q))) != null) {
                            i10 = r1.f27824r;
                            SignatureView signatureView = (SignatureView) r5.b.a(view, i10);
                            if (signatureView != null) {
                                i10 = r1.f27825s;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = r1.f27826t;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = r1.f27827u;
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
        return this.f28853a;
    }
}
