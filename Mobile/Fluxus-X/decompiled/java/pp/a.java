package pp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import np.g0;
import np.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f29253a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f29254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f29255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f29256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f29257f;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f29253a = constraintLayout;
        this.b = constraintLayout2;
        this.f29254c = personaMaterialButton;
        this.f29255d = textView;
        this.f29256e = textView2;
        this.f29257f = personaMaterialButton2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = g0.b;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
        if (personaMaterialButton != null) {
            i10 = g0.f26313g;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = g0.f26314h;
                TextView textView2 = (TextView) s5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = g0.f26318l;
                    PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) s5.b.a(view, i10);
                    if (personaMaterialButton2 != null) {
                        return new a(constraintLayout, constraintLayout, personaMaterialButton, textView, textView2, personaMaterialButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(h0.f26323a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f29253a;
    }
}
