package com.withpersona.sdk2.inquiry.document.network;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\bB\u001b\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "data", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "b", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "c", "Data", "Meta", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class SubmitDocumentRequest {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Data data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Meta meta;

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "", "", Payload.TYPE, "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Data {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Data(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("inquiry") : (r1v0 java.lang.String))
         A[MD:(java.lang.String):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.Data.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Data(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "inquiry" : str);
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "", "", "fromStep", "fromComponent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Meta {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String fromComponent;

        public Meta(@NotNull String fromStep, @NotNull String fromComponent) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$a;", "", "<init>", "()V", "", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final SubmitDocumentRequest m16692a(@NotNull String fromStep, @NotNull String fromComponent) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            return new SubmitDocumentRequest(null, new Meta(fromStep, fromComponent), 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SubmitDocumentRequest(@NotNull Data data, @NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
      (wrap com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$Data:?: TERNARY null = ((wrap int:0x0001: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$Data:0x0007: CONSTRUCTOR 
      (null java.lang.String)
      (1 int)
      (wrap java.lang.Object[]:?: TERNARY null = ((0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
     A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:4) call: com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.Data.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$Data))
      (r2v0 com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$Meta)
     A[MD:(com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$Data, com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$Meta):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.<init>(com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$Data, com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest$Meta):void type: THIS */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SubmitDocumentRequest(Data data, Meta meta, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Data(null, 1, 0 == true ? 1 : 0) : data, meta);
    }
}
