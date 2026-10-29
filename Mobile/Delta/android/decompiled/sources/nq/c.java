package nq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import jq.t;
import jq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f26640a;

    @NonNull
    public final ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f26641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f26642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f26643e;

    public c(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.f26640a = view;
        this.b = imageView;
        this.f26641c = imageView2;
        this.f26642d = imageView3;
        this.f26643e = textView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = t.f21665m;
        ImageView imageView = (ImageView) r5.b.a(view, i10);
        if (imageView != null) {
            i10 = t.f21666n;
            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
            if (imageView2 != null) {
                i10 = t.f21667o;
                ImageView imageView3 = (ImageView) r5.b.a(view, i10);
                if (imageView3 != null) {
                    i10 = t.f21668p;
                    TextView textView = (TextView) r5.b.a(view, i10);
                    if (textView != null) {
                        return new c(view, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(u.f21680c, viewGroup);
        return a(viewGroup);
    }

    @Override // r5.a
    @NonNull
    public View getRoot() {
        return this.f26640a;
    }
}
