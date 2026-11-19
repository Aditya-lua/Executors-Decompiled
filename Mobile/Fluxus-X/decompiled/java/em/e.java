package em;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import tb.f;
import tb.g;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    public class a implements g<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13832a;

        public a(String str) {
            this.f13832a = str;
        }

        @Override // tb.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r10) {
            Log.i(this.f13832a, "onSuccess.");
        }
    }

    public class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13833a;

        public b(String str) {
            this.f13833a = str;
        }

        @Override // tb.f
        public void onFailure(@NonNull Exception exc) {
            Log.i(this.f13833a, "onFailure.");
        }
    }

    public void a(Context context, String str) {
        Task<Void> taskP = b9.a.a(context).P();
        taskP.g(new a(str));
        taskP.e(new b(str));
    }
}
