package com.roblox.client.personasdk;

import android.util.Log;
import androidx.annotation.Keep;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.personasdk.PersonaActivityResultLauncher;
import com.roblox.universalapp.facialageestimation.a;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryResponse;
import g.d;
import j.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import zt.l;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;", "Lcom/roblox/universalapp/facialageestimation/a;", "<init>", "()V", "Lj/b;", "activity", BuildConfig.FLAVOR, "onActivityCreated", "(Lj/b;)V", BuildConfig.FLAVOR, "inquiryId", "sessionToken", "Lcom/roblox/universalapp/facialageestimation/a$a;", "callback", "launchInquiry", "(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V", "Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$a;", "currentInquiry", "Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$a;", "Lg/d;", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "inquiryLauncher", "Lg/d;", "a", "personasdk_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonaActivityResultLauncher implements a {

    @Nullable
    private InquiryCall currentInquiry;
    private d<Inquiry> inquiryLauncher;

    /* JADX INFO: renamed from: com.roblox.client.personasdk.PersonaActivityResultLauncher$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "inquiryId", "Lcom/roblox/universalapp/facialageestimation/a$a;", "callback", "<init>", "(Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/roblox/universalapp/facialageestimation/a$a;", "()Lcom/roblox/universalapp/facialageestimation/a$a;", "personasdk_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InquiryCall {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final a.InterfaceC0161a callback;

        public InquiryCall(@NotNull String inquiryId, @NotNull a.InterfaceC0161a callback) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.inquiryId = inquiryId;
            this.callback = callback;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final a.InterfaceC0161a getCallback() {
            return this.callback;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryCall)) {
                return false;
            }
            InquiryCall inquiryCall = (InquiryCall) other;
            return Intrinsics.c(this.inquiryId, inquiryCall.inquiryId) && Intrinsics.c(this.callback, inquiryCall.callback);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.callback.hashCode();
        }

        @NotNull
        public String toString() {
            return "InquiryCall(inquiryId=" + this.inquiryId + ", callback=" + this.callback + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityCreated$lambda$0(PersonaActivityResultLauncher personaActivityResultLauncher, InquiryResponse result) {
        a.InterfaceC0161a callback;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof InquiryResponse.Complete) {
            String inquiryId = ((InquiryResponse.Complete) result).getInquiryId();
            Log.d("PersonaActivityResultLauncher", "Inquiry " + inquiryId + " completed");
            InquiryCall inquiryCall = personaActivityResultLauncher.currentInquiry;
            if (inquiryCall != null) {
                if (!Intrinsics.c(inquiryCall.getInquiryId(), inquiryId)) {
                    inquiryCall = null;
                }
                if (inquiryCall == null || (callback = inquiryCall.getCallback()) == null) {
                    return;
                }
                callback.onComplete(inquiryId);
                return;
            }
            return;
        }
        if (result instanceof InquiryResponse.Cancel) {
            Log.d("PersonaActivityResultLauncher", "Inquiry cancelled");
            InquiryCall inquiryCall2 = personaActivityResultLauncher.currentInquiry;
            if (inquiryCall2 != null) {
                inquiryCall2.getCallback().onCancel(inquiryCall2.getInquiryId());
                return;
            }
            return;
        }
        if (!(result instanceof InquiryResponse.Error)) {
            throw new l();
        }
        InquiryResponse.Error error = (InquiryResponse.Error) result;
        Log.d("PersonaActivityResultLauncher", "Inquiry error. Debug message: " + error.getDebugMessage());
        InquiryCall inquiryCall3 = personaActivityResultLauncher.currentInquiry;
        if (inquiryCall3 != null) {
            inquiryCall3.getCallback().onError(inquiryCall3.getInquiryId(), error.getDebugMessage());
        }
    }

    @Override // com.roblox.universalapp.facialageestimation.a
    public void launchInquiry(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull a.InterfaceC0161a callback) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Log.d("PersonaActivityResultLauncher", "Launching inquiry with inquiryId " + inquiryId + ", sessionToken " + sessionToken);
        this.currentInquiry = new InquiryCall(inquiryId, callback);
        d<Inquiry> dVar = this.inquiryLauncher;
        if (dVar == null) {
            Intrinsics.u("inquiryLauncher");
            dVar = null;
        }
        dVar.b(Inquiry.INSTANCE.fromInquiry(inquiryId).sessionToken(sessionToken).build());
    }

    @Override // com.roblox.universalapp.facialageestimation.a
    public void onActivityCreated(@NotNull b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.inquiryLauncher = activity.h(new Inquiry.Contract(activity), new g.b() { // from class: jj.a
            @Override // g.b
            public final void a(Object obj) {
                PersonaActivityResultLauncher.onActivityCreated$lambda$0(this.f20778a, (InquiryResponse) obj);
            }
        });
    }
}
