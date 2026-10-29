package p365q;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import p533x2.C12637g;

/* JADX INFO: renamed from: q.z */
/* JADX INFO: loaded from: classes.dex */
public final class C10413z {

    /* JADX INFO: renamed from: a */
    @NonNull
    public TextView f37524a;

    /* JADX INFO: renamed from: b */
    public TextClassifier f37525b;

    /* JADX INFO: renamed from: q.z$a */
    public static final class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static TextClassifier m40077a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C10413z(@NonNull TextView textView) {
        this.f37524a = (TextView) C12637g.m47075g(textView);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public TextClassifier m40075a() {
        TextClassifier textClassifier = this.f37525b;
        return textClassifier == null ? a.m40077a(this.f37524a) : textClassifier;
    }

    /* JADX INFO: renamed from: b */
    public void m40076b(TextClassifier textClassifier) {
        this.f37525b = textClassifier;
    }
}
