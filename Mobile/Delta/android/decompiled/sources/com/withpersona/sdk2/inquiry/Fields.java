package com.withpersona.sdk2.inquiry;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u001d\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/Fields;", "", "fields", "", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "<init>", "(Ljava/util/Map;)V", "getFields$inquiry_dynamic_feature_release", "()Ljava/util/Map;", "Builder", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Fields {

    @NotNull
    private final Map<String, InquiryField> fields;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J!\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "", "<init>", "()V", "fields", "", "", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "field", "name", "value", "", "", "", "Ljava/util/Date;", "fieldChoices", "fieldMultiChoices", "", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "build", "Lcom/withpersona/sdk2/inquiry/Fields;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final Map<String, InquiryField> fields = new LinkedHashMap();

        @NotNull
        public final Fields build() {
            return new Fields(this.fields, null);
        }

        @NotNull
        public final Builder field(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.fields.put(name, new InquiryField.StringField(value));
            return this;
        }

        @NotNull
        public final Builder fieldChoices(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.fields.put(name, new InquiryField.ChoicesField(value));
            return this;
        }

        @NotNull
        public final Builder fieldMultiChoices(@NotNull String name, @NotNull String[] value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.fields.put(name, new InquiryField.MultiChoicesField(value));
            return this;
        }

        @NotNull
        public final Builder field(@NotNull String name, int value) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.fields.put(name, new InquiryField.IntegerField(Integer.valueOf(value)));
            return this;
        }

        @NotNull
        public final Builder field(@NotNull String name, boolean value) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.fields.put(name, new InquiryField.BooleanField(Boolean.valueOf(value)));
            return this;
        }

        @NotNull
        public final Builder field(@NotNull String name, float value) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.fields.put(name, new InquiryField.FloatField(Float.valueOf(value)));
            return this;
        }

        @NotNull
        public final Builder field(@NotNull String name, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.fields.put(name, new InquiryField.DateField(value));
            return this;
        }
    }

    public /* synthetic */ Fields(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    public final Map<String, InquiryField> getFields$inquiry_dynamic_feature_release() {
        return this.fields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Fields(Map<String, ? extends InquiryField> map) {
        this.fields = map;
    }
}
