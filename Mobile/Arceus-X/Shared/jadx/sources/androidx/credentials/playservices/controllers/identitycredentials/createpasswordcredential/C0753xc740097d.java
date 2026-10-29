package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import p117f3.AbstractC5332f;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
public final /* synthetic */ class C0753xc740097d extends C7744k implements Function2<String, String, AbstractC5332f> {
    public C0753xc740097d(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final AbstractC5332f invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m3294x5e74af(str, str2);
    }
}
