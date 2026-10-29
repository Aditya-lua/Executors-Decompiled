package com.withpersona.sdk2.inquiry.p057ui.network;

import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\n\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "b", "Meta", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class AddressAutocompleteRequest {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Meta meta;

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "", "", "fromComponent", "searchInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Meta {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String searchInput;

        public Meta(@NotNull String fromComponent, @NotNull String searchInput) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(searchInput, "searchInput");
            this.fromComponent = fromComponent;
            this.searchInput = searchInput;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSearchInput() {
            return this.searchInput;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "fromComponent", "", "searchInput", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "a", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AddressAutocompleteRequest m21528a(@NotNull UiComponent fromComponent, @NotNull String searchInput) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(searchInput, "searchInput");
            return new AddressAutocompleteRequest(new Meta(fromComponent.getName(), searchInput));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public AddressAutocompleteRequest(@NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.meta = meta;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }
}
