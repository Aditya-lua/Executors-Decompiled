package androidx.credentials.playservices.controllers.identityauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J \u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\"\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m31665d2 = {"Landroidx/credentials/playservices/controllers/identityauth/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "resultReceiver", "Landroid/os/ResultReceiver;", "mWaitingForActivityResult", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "restoreState", "setupFailure", "errName", "", "errMsg", "onSaveInstanceState", "outState", "handleCredentialFlow", Payload.TYPE, "setupIntentSenderFailureByType", "e", "Landroid/content/IntentSender$SendIntentException;", "setupPendingIntentFailureByType", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "credentials-play-services-auth_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class HiddenActivity extends Activity {
    private static final int DEFAULT_VALUE = 1;

    @NotNull
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";

    @NotNull
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;

    @Nullable
    private ResultReceiver resultReceiver;

    private final void handleCredentialFlow(String type) {
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (pendingIntent == null) {
            setupPendingIntentFailureByType(type);
            return;
        }
        try {
            this.mWaitingForActivityResult = true;
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                setupIntentSenderFailureByType(type, e);
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    private final void restoreState(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    private final void setupFailure(ResultReceiver resultReceiver, String errName, String errMsg) {
        CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver, errName, errMsg);
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void setupIntentSenderFailureByType(String type, IntentSender.SendIntentException e10) {
        switch (type.hashCode()) {
            case -441061071:
                if (type.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                    ResultReceiver resultReceiver = this.resultReceiver;
                    Intrinsics.checkNotNull(resultReceiver);
                    setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "During begin sign in, one tap ui intent sender failure: " + e10.getMessage());
                    break;
                }
                break;
            case 15545322:
                if (type.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                    ResultReceiver resultReceiver2 = this.resultReceiver;
                    Intrinsics.checkNotNull(resultReceiver2);
                    setupFailure(resultReceiver2, CredentialProviderBaseController.CREATE_UNKNOWN, "During public key credential, found IntentSender failure on public key creation: " + e10.getMessage());
                    break;
                }
                break;
            case 1246634622:
                if (type.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                    ResultReceiver resultReceiver3 = this.resultReceiver;
                    Intrinsics.checkNotNull(resultReceiver3);
                    setupFailure(resultReceiver3, CredentialProviderBaseController.CREATE_UNKNOWN, "During save password, found UI intent sender failure: " + e10.getMessage());
                    break;
                }
                break;
            case 1980564212:
                if (type.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                    ResultReceiver resultReceiver4 = this.resultReceiver;
                    Intrinsics.checkNotNull(resultReceiver4);
                    setupFailure(resultReceiver4, CredentialProviderBaseController.GET_UNKNOWN, "During get sign-in intent, one tap ui intent sender failure: " + e10.getMessage());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void setupPendingIntentFailureByType(String type) {
        switch (type.hashCode()) {
            case -441061071:
                if (type.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                    ResultReceiver resultReceiver = this.resultReceiver;
                    Intrinsics.checkNotNull(resultReceiver);
                    setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "internal error during the begin sign in operation");
                    break;
                }
                break;
            case 15545322:
                if (type.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                    ResultReceiver resultReceiver2 = this.resultReceiver;
                    Intrinsics.checkNotNull(resultReceiver2);
                    setupFailure(resultReceiver2, CredentialProviderBaseController.CREATE_UNKNOWN, "internal error during public key credential creation");
                    break;
                }
                break;
            case 1246634622:
                if (type.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                    ResultReceiver resultReceiver3 = this.resultReceiver;
                    Intrinsics.checkNotNull(resultReceiver3);
                    setupFailure(resultReceiver3, CredentialProviderBaseController.CREATE_UNKNOWN, "internal error during password creation");
                    break;
                }
                break;
            case 1980564212:
                if (type.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                    ResultReceiver resultReceiver4 = this.resultReceiver;
                    Intrinsics.checkNotNull(resultReceiver4);
                    setupFailure(resultReceiver4, CredentialProviderBaseController.GET_UNKNOWN, "internal error during the sign-in intent operation");
                    break;
                }
                break;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            CredentialProviderBaseController.INSTANCE.reportResult$credentials_play_services_auth_release(resultReceiver, requestCode, resultCode, data);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            handleCredentialFlow(stringExtra);
        } else {
            Log.w(TAG, "Activity handed an unsupported type");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
