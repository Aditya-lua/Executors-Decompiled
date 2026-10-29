package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.dto.Relationships;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;", "data", "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;", "b", "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;", "()Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;", "Data", "Metadata", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@um.i(generateAdapter = true)
public final class CurrentRelaySessionResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Data data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Metadata meta;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;", "relationships", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;", "()Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @um.i(generateAdapter = true)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Relationships relationships;

        public Data(@Nullable Relationships relationships) {
            this.relationships = relationships;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Relationships getRelationships() {
            return this.relationships;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.relationships, ((Data) other).relationships);
        }

        public int hashCode() {
            Relationships relationships = this.relationships;
            if (relationships == null) {
                return 0;
            }
            return relationships.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(relationships=" + this.relationships + ")";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;", "", "", "inquirySessionToken", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @um.i(generateAdapter = true)
    public static final /* data */ class Metadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String inquirySessionToken;

        public Metadata(@Nullable String str) {
            this.inquirySessionToken = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInquirySessionToken() {
            return this.inquirySessionToken;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Metadata) && Intrinsics.c(this.inquirySessionToken, ((Metadata) other).inquirySessionToken);
        }

        public int hashCode() {
            String str = this.inquirySessionToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "Metadata(inquirySessionToken=" + this.inquirySessionToken + ")";
        }
    }

    public CurrentRelaySessionResponse(@Nullable Data data, @Nullable Metadata metadata) {
        this.data = data;
        this.meta = metadata;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Metadata getMeta() {
        return this.meta;
    }
}
