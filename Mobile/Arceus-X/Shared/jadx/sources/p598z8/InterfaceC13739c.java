package p598z8;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.tasks.Task;
import p242k9.InterfaceC7497g;

/* JADX INFO: renamed from: z8.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC13739c extends InterfaceC7497g<C13748l> {
    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: b */
    Task<PendingIntent> mo48758b(@NonNull GetSignInIntentRequest getSignInIntentRequest);

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: d */
    SignInCredential mo48759d(Intent intent);

    @NonNull
    /* JADX INFO: renamed from: o */
    String mo48760o(Intent intent);

    @NonNull
    /* JADX INFO: renamed from: q */
    Task<PendingIntent> mo48761q(@NonNull GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: r */
    Task<Void> mo48762r();

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: t */
    Task<BeginSignInResult> mo48763t(@NonNull BeginSignInRequest beginSignInRequest);
}
