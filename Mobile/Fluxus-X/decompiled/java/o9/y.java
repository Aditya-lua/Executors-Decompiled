package o9;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
public interface y extends l9.i<z> {
    @NonNull
    @ResultIgnorabilityUnspecified
    Task<Void> g(@NonNull w wVar);
}
