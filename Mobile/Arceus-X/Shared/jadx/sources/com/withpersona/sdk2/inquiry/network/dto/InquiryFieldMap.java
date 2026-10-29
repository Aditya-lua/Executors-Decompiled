package com.withpersona.sdk2.inquiry.network.dto;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7346m;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "", "fields", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "<init>", "(Ljava/util/Map;)V", "getFields", "()Ljava/util/Map;", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class InquiryFieldMap {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, InquiryField> fields;

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion extends AbstractC11873h<InquiryFieldMap> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p471um.AbstractC11873h
        @Nullable
        @InterfaceC11871f
        public InquiryFieldMap fromJson(@NotNull AbstractC11878m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            throw new C7346m("An operation is not implemented: Not yet implemented");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        @InterfaceC11891z
        public void toJson(@NotNull AbstractC11885t writer, @Nullable InquiryFieldMap value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (value == null) {
                writer.mo44381o();
                return;
            }
            writer.mo44374c();
            for (Map.Entry<String, InquiryField> entry : value.getFields().entrySet()) {
                String key = entry.getKey();
                InquiryField value2 = entry.getValue();
                writer.mo44380n(key);
                if (value2 instanceof InquiryField.StringField) {
                    writer.mo44367M(((InquiryField.StringField) value2).getValue());
                } else if (value2 instanceof InquiryField.IntegerField) {
                    writer.mo44366L(((InquiryField.IntegerField) value2).getValue());
                } else if (value2 instanceof InquiryField.BooleanField) {
                    writer.mo44365I(((InquiryField.BooleanField) value2).getValue());
                } else if (value2 instanceof InquiryField.DatetimeField) {
                    writer.mo44367M(((InquiryField.DatetimeField) value2).getValue());
                } else if (value2 instanceof InquiryField.DateField) {
                    writer.mo44367M(((InquiryField.DateField) value2).getValue());
                } else if (value2 instanceof InquiryField.FloatField) {
                    writer.mo44366L(((InquiryField.FloatField) value2).getValue());
                } else if (value2 instanceof InquiryField.ChoicesField) {
                    writer.mo44367M(((InquiryField.ChoicesField) value2).getValue());
                } else {
                    if (!(value2 instanceof InquiryField.MultiChoicesField)) {
                        if (!(value2 instanceof InquiryField.Unknown)) {
                            throw new C7345l();
                        }
                        throw new IllegalStateException("Attempted to write field with type `Unknown`.");
                    }
                    writer.mo44371a();
                    String[] value3 = ((InquiryField.MultiChoicesField) value2).getValue();
                    if (value3 != null) {
                        for (String str : value3) {
                            writer.mo44367M(str);
                        }
                    }
                    writer.mo44375e();
                }
            }
            writer.mo44378g();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends com.withpersona.sdk2.inquiry.network.dto.InquiryField> */
    /* JADX WARN: Multi-variable type inference failed */
    public InquiryFieldMap(@NotNull Map<String, ? extends InquiryField> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.fields = fields;
    }

    @NotNull
    public final Map<String, InquiryField> getFields() {
        return this.fields;
    }
}
