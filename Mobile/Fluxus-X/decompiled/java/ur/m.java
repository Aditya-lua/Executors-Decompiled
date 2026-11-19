package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33907a;

    @NonNull
    public final TextInputLayout b;

    public m(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        this.f33907a = textInputLayout;
        this.b = textInputLayout2;
    }

    @NonNull
    public static m a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new m(textInputLayout, textInputLayout);
    }

    @NonNull
    public static m c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static m d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28475n, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f33907a;
    }
}
