package q;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public TextView f29443a;
    public TextClassifier b;

    public static final class a {
        @NonNull
        public static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public a0(@NonNull TextView textView) {
        this.f29443a = (TextView) x2.g.g(textView);
    }

    @NonNull
    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        return textClassifier == null ? a.a(this.f29443a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
