package p386ql;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p010a9.C0099a;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: ql.e */
/* JADX INFO: loaded from: classes2.dex */
public class C10599e {

    /* JADX INFO: renamed from: ql.e$a */
    public class a implements InterfaceC11256g<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f38056a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(String str) {
            this.f38056a = str;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // sb.InterfaceC11256g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            Log.i(this.f38056a, "onSuccess.");
        }
    }

    /* JADX INFO: renamed from: ql.e$b */
    public class b implements InterfaceC11254f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f38058a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(String str) {
            this.f38058a = str;
        }

        @Override // sb.InterfaceC11254f
        public void onFailure(@NonNull Exception exc) {
            Log.i(this.f38058a, "onFailure.");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40629a(Context context, String str) {
        Task<Void> taskMo298P = C0099a.m297a(context).mo298P();
        taskMo298P.mo11893g(new a(str));
        taskMo298P.mo11891e(new b(str));
    }
}
