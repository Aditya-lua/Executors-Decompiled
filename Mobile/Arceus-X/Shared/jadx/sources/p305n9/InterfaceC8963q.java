package p305n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p242k9.InterfaceC7497g;

/* JADX INFO: renamed from: n9.q */
/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
public interface InterfaceC8963q extends InterfaceC7497g<C8965r> {
    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: c */
    Task<Void> mo36065c(@NonNull TelemetryData telemetryData);
}
