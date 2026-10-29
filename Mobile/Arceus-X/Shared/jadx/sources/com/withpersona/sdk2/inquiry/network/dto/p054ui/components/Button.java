package com.withpersona.sdk2.inquiry.network.dto.p054ui.components;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.BaseButtonComponentStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11874i;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\nR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "ButtonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ActionButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CancelButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CompleteButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/SubmitButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface Button extends UiComponentConfig {

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum ButtonType {
        PRIMARY,
        SECONDARY;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<ButtonType> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.Button.ButtonType.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable ButtonType value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @NotNull
            @InterfaceC11871f
            public ButtonType fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object objM44315B = reader.m44315B();
                if (Intrinsics.m31980c(objM44315B, "primary")) {
                    return ButtonType.PRIMARY;
                }
                return Intrinsics.m31980c(objM44315B, "secondary") ? ButtonType.SECONDARY : ButtonType.PRIMARY;
            }
        }

        @NotNull
        public static InterfaceC10707a<ButtonType> getEntries() {
            return $ENTRIES;
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @Nullable
    BaseButtonAttributes getAttributes();

    @Nullable
    BaseButtonComponentStyle getStyles();
}
