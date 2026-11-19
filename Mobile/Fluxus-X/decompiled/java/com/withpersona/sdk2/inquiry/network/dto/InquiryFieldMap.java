package com.withpersona.sdk2.inquiry.network.dto;

import com.github.luben.zstd.BuildConfig;
import hn.f;
import hn.h;
import hn.m;
import hn.t;
import hn.z;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import zt.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", BuildConfig.FLAVOR, "fields", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "<init>", "(Ljava/util/Map;)V", "getFields", "()Ljava/util/Map;", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InquiryFieldMap {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, InquiryField> fields;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "<init>", "()V", "Lhn/m;", "reader", "fromJson", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;", "Lhn/t;", "writer", "value", BuildConfig.FLAVOR, "toJson", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;)V", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion extends h<InquiryFieldMap> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // hn.h
        @f
        @Nullable
        public InquiryFieldMap fromJson(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            throw new zt.m("An operation is not implemented: Not yet implemented");
        }

        @Override // hn.h
        @z
        public void toJson(@NotNull t writer, @Nullable InquiryFieldMap value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (value == null) {
                writer.p();
                return;
            }
            writer.c();
            for (Map.Entry<String, InquiryField> entry : value.getFields().entrySet()) {
                String key = entry.getKey();
                InquiryField value2 = entry.getValue();
                writer.o(key);
                if (value2 instanceof InquiryField.StringField) {
                    writer.Q(((InquiryField.StringField) value2).getValue());
                } else if (value2 instanceof InquiryField.IntegerField) {
                    writer.O(((InquiryField.IntegerField) value2).getValue());
                } else if (value2 instanceof InquiryField.BooleanField) {
                    writer.N(((InquiryField.BooleanField) value2).getValue());
                } else if (value2 instanceof InquiryField.DatetimeField) {
                    writer.Q(((InquiryField.DatetimeField) value2).getValue());
                } else if (value2 instanceof InquiryField.DateField) {
                    writer.Q(((InquiryField.DateField) value2).getValue());
                } else if (value2 instanceof InquiryField.FloatField) {
                    writer.O(((InquiryField.FloatField) value2).getValue());
                } else if (value2 instanceof InquiryField.ChoicesField) {
                    writer.Q(((InquiryField.ChoicesField) value2).getValue());
                } else {
                    if (!(value2 instanceof InquiryField.MultiChoicesField)) {
                        if (!(value2 instanceof InquiryField.Unknown)) {
                            throw new l();
                        }
                        throw new IllegalStateException("Attempted to write field with type `Unknown`.");
                    }
                    writer.a();
                    String[] value3 = ((InquiryField.MultiChoicesField) value2).getValue();
                    if (value3 != null) {
                        for (String str : value3) {
                            writer.Q(str);
                        }
                    }
                    writer.e();
                }
            }
            writer.g();
        }
    }

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
