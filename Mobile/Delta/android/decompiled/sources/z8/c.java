package z8;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface c extends k9.g<l> {
    @NonNull
    @Deprecated
    Task<PendingIntent> b(@NonNull GetSignInIntentRequest getSignInIntentRequest);

    @NonNull
    @Deprecated
    SignInCredential d(Intent intent);

    @NonNull
    String o(Intent intent);

    @NonNull
    Task<PendingIntent> q(@NonNull GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @NonNull
    @Deprecated
    Task<Void> r();

    @NonNull
    @Deprecated
    Task<BeginSignInResult> t(@NonNull BeginSignInRequest beginSignInRequest);
}
