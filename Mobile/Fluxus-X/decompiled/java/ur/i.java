package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33894a;

    @NonNull
    public final MaterialCheckBox b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f33895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f33896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f33897e;

    public i(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f33894a = constraintLayout;
        this.b = materialCheckBox;
        this.f33895c = textView;
        this.f33896d = textView2;
        this.f33897e = textView3;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = or.f.f28439o;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) s5.b.a(view, i10);
        if (materialCheckBox != null) {
            i10 = or.f.f28441p;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = or.f.f28443q;
                TextView textView2 = (TextView) s5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = or.f.f28451u;
                    TextView textView3 = (TextView) s5.b.a(view, i10);
                    if (textView3 != null) {
                        return new i((ConstraintLayout) view, materialCheckBox, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28471j, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33894a;
    }
}
