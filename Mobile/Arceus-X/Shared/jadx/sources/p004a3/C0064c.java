package p004a3;

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
import androidx.core.view.C0591d;
import androidx.core.view.C0625o0;
import p533x2.C12632b;
import p533x2.C12637g;

/* JADX INFO: renamed from: a3.c */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C0064c {

    /* JADX INFO: renamed from: a3.c$a */
    public class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f137a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z10, b bVar) {
            super(inputConnection, z10);
            this.f137a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f137a.mo136a(C0065d.m141f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* JADX INFO: renamed from: a3.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo136a(C0065d c0065d, int i10, Bundle bundle);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m137a(View view, C0065d c0065d, int i10, Bundle bundle) {
        if ((i10 & 1) != 0) {
            try {
                c0065d.m145d();
                Parcelable parcelable = (Parcelable) c0065d.m146e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return C0625o0.m3020c0(view, new C0591d.a(new ClipData(c0065d.m143b(), new ClipData.Item(c0065d.m142a())), 2).m2835d(c0065d.m144c()).m2833b(bundle).m2832a()) == null;
    }

    /* JADX INFO: renamed from: b */
    public static b m138b(final View view) {
        C12637g.m47075g(view);
        return new b() { // from class: a3.b
            @Override // p004a3.C0064c.b
            /* JADX INFO: renamed from: a */
            public final boolean mo136a(C0065d c0065d, int i10, Bundle bundle) {
                return C0064c.m137a(view, c0065d, i10, bundle);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static InputConnection m139c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m140d(inputConnection, editorInfo, m138b(view));
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static InputConnection m140d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        C12632b.m47063d(inputConnection, "inputConnection must be non-null");
        C12632b.m47063d(editorInfo, "editorInfo must be non-null");
        C12632b.m47063d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }
}
