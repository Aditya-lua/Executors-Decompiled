package a3;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.o0;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class c {

    public class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f98a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z10, b bVar) {
            super(inputConnection, z10);
            this.f98a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f98a.a(d.f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    public interface b {
        boolean a(d dVar, int i10, Bundle bundle);
    }

    public static /* synthetic */ boolean a(View view, d dVar, int i10, Bundle bundle) {
        if ((i10 & 1) != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return o0.c0(view, new androidx.core.view.d.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null;
    }

    public static b b(final View view) {
        g.g(view);
        return new b() { // from class: a3.b
            @Override // a3.c.b
            public final boolean a(d dVar, int i10, Bundle bundle) {
                return c.a(view, dVar, i10, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        x2.b.d(inputConnection, "inputConnection must be non-null");
        x2.b.d(editorInfo, "editorInfo must be non-null");
        x2.b.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }
}
