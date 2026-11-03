package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16353a;

    @NonNull
    public final MaterialCheckBox b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f16354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16355d;

    public r(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.f16353a = constraintLayout;
        this.b = materialCheckBox;
        this.f16354c = textView;
        this.f16355d = constraintLayout2;
    }

    @NonNull
    public static r a(@NonNull View view) {
        int i10 = yq.d.f37044o;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) r5.b.a(view, i10);
        if (materialCheckBox != null) {
            i10 = yq.d.X;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = yq.d.Z;
                ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout != null) {
                    return new r((ConstraintLayout) view, materialCheckBox, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(yq.e.f37085s, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16353a;
    }
}
