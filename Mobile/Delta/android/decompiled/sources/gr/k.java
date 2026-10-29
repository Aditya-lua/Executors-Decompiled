package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f18432a;

    @NonNull
    public final PersonaMaterialButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f18433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f18434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f18435e;

    public k(@NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18432a = linearLayout;
        this.b = personaMaterialButton;
        this.f18433c = textView;
        this.f18434d = textView2;
        this.f18435e = textView3;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = ar.d.f3699v;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
        if (personaMaterialButton != null) {
            i10 = ar.d.f3701w;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = ar.d.I;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = ar.d.Y;
                    TextView textView3 = (TextView) r5.b.a(view, i10);
                    if (textView3 != null) {
                        return new k((LinearLayout) view, personaMaterialButton, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(ar.e.f3719l, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f18432a;
    }
}
