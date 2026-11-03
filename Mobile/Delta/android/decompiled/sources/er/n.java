package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f16337a;

    @NonNull
    public final LinearLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f16338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f16339d;

    public n(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f16337a = linearLayout;
        this.b = linearLayout2;
        this.f16338c = textView;
        this.f16339d = textView2;
    }

    @NonNull
    public static n a(@NonNull View view) {
        int i10 = yq.d.f37057u0;
        LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
        if (linearLayout != null) {
            i10 = yq.d.f37063x0;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = yq.d.f37065y0;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    return new n((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(yq.e.f37081o, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f16337a;
    }
}
