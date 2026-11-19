package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33924a;

    @NonNull
    public final MaterialCheckBox b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f33925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33926d;

    public r(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.f33924a = constraintLayout;
        this.b = materialCheckBox;
        this.f33925c = textView;
        this.f33926d = constraintLayout2;
    }

    @NonNull
    public static r a(@NonNull View view) {
        int i10 = or.f.f28439o;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) s5.b.a(view, i10);
        if (materialCheckBox != null) {
            i10 = or.f.X;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = or.f.Z;
                ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                if (constraintLayout != null) {
                    return new r((ConstraintLayout) view, materialCheckBox, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28480s, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33924a;
    }
}
