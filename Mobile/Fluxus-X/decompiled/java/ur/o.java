package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33911a;

    @NonNull
    public final TextInputEditText b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33912c;

    public o(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.f33911a = textInputLayout;
        this.b = textInputEditText;
        this.f33912c = textInputLayout2;
    }

    @NonNull
    public static o a(@NonNull View view) {
        int i10 = or.f.B;
        TextInputEditText textInputEditText = (TextInputEditText) s5.b.a(view, i10);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new o(textInputLayout, textInputEditText, textInputLayout);
    }

    @NonNull
    public static o c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static o d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28478q, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f33911a;
    }
}
