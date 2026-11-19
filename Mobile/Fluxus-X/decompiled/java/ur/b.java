package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33853a;

    @NonNull
    public final MaterialRadioButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f33854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f33855d;

    public b(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f33853a = constraintLayout;
        this.b = materialRadioButton;
        this.f33854c = textView;
        this.f33855d = textView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = or.f.f28450t0;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) s5.b.a(view, i10);
        if (materialRadioButton != null) {
            i10 = or.f.f28454v0;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = or.f.f28456w0;
                TextView textView2 = (TextView) s5.b.a(view, i10);
                if (textView2 != null) {
                    return new b((ConstraintLayout) view, materialRadioButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33853a;
    }
}
