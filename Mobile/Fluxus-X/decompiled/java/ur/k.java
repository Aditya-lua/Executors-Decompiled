package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f33901a;

    @NonNull
    public final PersonaMaterialButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f33902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f33903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f33904e;

    public k(@NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f33901a = linearLayout;
        this.b = personaMaterialButton;
        this.f33902c = textView;
        this.f33903d = textView2;
        this.f33904e = textView3;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = or.f.f28453v;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
        if (personaMaterialButton != null) {
            i10 = or.f.f28455w;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = or.f.I;
                TextView textView2 = (TextView) s5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = or.f.Y;
                    TextView textView3 = (TextView) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(or.g.f28473l, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f33901a;
    }
}
