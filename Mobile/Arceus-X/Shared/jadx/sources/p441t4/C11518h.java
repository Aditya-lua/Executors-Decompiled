package p441t4;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t4.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m31665d2 = {"Lt4/h;", "", "<init>", "()V", "Landroid/adservices/topics/GetTopicsResponse;", Payload.RESPONSE, "Lt4/e;", "a", "(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;", "b", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
@SuppressLint({"ClassVerificationFailure"})
public final class C11518h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11518h f40796a = new C11518h();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C11515e m43085a(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator<Topic> it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicM43083a = C11516f.m43083a(it.next());
            arrayList.add(new C11519i(topicM43083a.getTaxonomyVersion(), topicM43083a.getModelVersion(), topicM43083a.getTopicId()));
        }
        return new C11515e(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C11515e m43086b(@NotNull GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator<Topic> it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicM43083a = C11516f.m43083a(it.next());
            arrayList.add(new C11519i(topicM43083a.getTaxonomyVersion(), topicM43083a.getModelVersion(), topicM43083a.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            EncryptedTopic encryptedTopicM43084a = C11517g.m43084a(it2.next());
            byte[] encryptedTopic = encryptedTopicM43084a.getEncryptedTopic();
            Intrinsics.checkNotNullExpressionValue(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicM43084a.getKeyIdentifier();
            Intrinsics.checkNotNullExpressionValue(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicM43084a.getEncapsulatedKey();
            Intrinsics.checkNotNullExpressionValue(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new C11511a(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new C11515e(arrayList, arrayList2);
    }
}
