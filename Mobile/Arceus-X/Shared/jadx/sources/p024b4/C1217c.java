package p024b4;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.C0900c;

/* JADX INFO: renamed from: b4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1217c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f5089a;

    /* JADX INFO: renamed from: b */
    public final a f5090b;

    /* JADX INFO: renamed from: b4.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public boolean m6838a(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i10, int i11, boolean z10) {
            return C0900c.m4271f(inputConnection, editable, i10, i11, z10);
        }

        /* JADX INFO: renamed from: b */
        public void m6839b(@NonNull EditorInfo editorInfo) {
            if (C0900c.m4274i()) {
                C0900c.m4270c().m4289v(editorInfo);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1217c(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    /* JADX INFO: renamed from: a */
    public final Editable m6837a() {
        return this.f5089a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f5090b.m6838a(this, m6837a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f5090b.m6838a(this, m6837a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1217c(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull a aVar) {
        super(inputConnection, false);
        this.f5089a = textView;
        this.f5090b = aVar;
        aVar.m6839b(editorInfo);
    }
}
