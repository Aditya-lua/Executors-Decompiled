package ql;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import sb.f;
import sb.g;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    public class a implements g<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29462a;

        public a(String str) {
            this.f29462a = str;
        }

        @Override // sb.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            Log.i(this.f29462a, "onSuccess.");
        }
    }

    public class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29463a;

        public b(String str) {
            this.f29463a = str;
        }

        @Override // sb.f
        public void onFailure(@NonNull Exception exc) {
            Log.i(this.f29463a, "onFailure.");
        }
    }

    public void a(Context context, String str) {
        Task<Void> taskP = a9.a.a(context).P();
        taskP.g(new a(str));
        taskP.e(new b(str));
    }
}
