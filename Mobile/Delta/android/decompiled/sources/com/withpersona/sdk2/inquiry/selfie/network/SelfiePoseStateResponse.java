package com.withpersona.sdk2.inquiry.selfie.network;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "", "", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;", "poses", "", "complete", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "SelfiePoseState", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class SelfiePoseStateResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<SelfiePoseState> poses;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Boolean complete;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;", "", "", "index", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "pose", "", "token", "<init>", "(Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfiePoseState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Integer index;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final NextStep.Selfie.SelfiePose pose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String token;

        public SelfiePoseState(@Nullable Integer num, @Nullable NextStep.Selfie.SelfiePose selfiePose, @Nullable String str) {
            this.index = num;
            this.pose = selfiePose;
            this.token = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getIndex() {
            return this.index;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NextStep.Selfie.SelfiePose getPose() {
            return this.pose;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getToken() {
            return this.token;
        }
    }

    public SelfiePoseStateResponse(@Nullable List<SelfiePoseState> list, @Nullable Boolean bool) {
        this.poses = list;
        this.complete = bool;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getComplete() {
        return this.complete;
    }

    @Nullable
    public final List<SelfiePoseState> b() {
        return this.poses;
    }
}
