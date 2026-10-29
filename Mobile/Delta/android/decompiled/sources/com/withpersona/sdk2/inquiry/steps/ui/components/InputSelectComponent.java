package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import cr.o;
import cr.w1;
import cr.w3;
import cr.x;
import er.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 E2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001.Bq\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\u008c\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b?\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\bA\u0010'R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\b@\u00108R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR&\u0010P\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bM\u00106\u0012\u0004\bN\u0010O\u001a\u0004\bC\u00108R \u0010U\u001a\u00020+8\u0016X\u0096D¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bT\u0010O\u001a\u0004\bG\u0010SR(\u0010\\\u001a\u00020V8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b7\u0010W\u0012\u0004\b[\u0010O\u001a\u0004\b.\u0010X\"\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/w3;", "Lcr/w1;", "Lcr/o;", "Lcr/x;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "label", "placeholder", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leadingImageTemplate", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;J)V", "s", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "q", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "c", "Ljava/util/List;", "m", "()Ljava/util/List;", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "e", "getDisabled", "f", "g", "getPlaceholder", "h", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "j", "J", "R0", "()J", "", "Lmr/a;", "k", "getAssociatedViews$annotations", "()V", "associatedViews", "l", "Z", "()Z", "getCanSelectMultipleValues$annotations", "canSelectMultipleValues", "Ler/m;", "Ler/m;", "()Ler/m;", "r", "(Ler/m;)V", "getSelectedOptionsController$annotations", "selectedOptionsController", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputSelectComponent implements UiComponent, w3<InputSelectComponent>, w1, o, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final InputSelectComponentStyle styles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Option> selectedOptions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String label;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String placeholder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Option> options;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final RemoteImage leadingImageTemplate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<mr.a> associatedViews;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean canSelectMultipleValues;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public m selectedOptionsController;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputSelectComponent> CREATOR = new b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InputSelectComponent a(@NotNull InputSelect config) {
            List listK;
            List listK2;
            List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options;
            Intrinsics.checkNotNullParameter(config, "config");
            InputSelect.Attributes attributes = config.getAttributes();
            List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options2 = attributes != null ? attributes.getOptions() : null;
            if (options2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : options2) {
                    String value = ((com.withpersona.sdk2.inquiry.network.dto.ui.components.Option) obj).getValue();
                    InputSelect.Attributes attributes2 = config.getAttributes();
                    if (Intrinsics.c(value, attributes2 != null ? attributes2.getPrefill() : null)) {
                        arrayList.add(obj);
                    }
                }
                listK = new ArrayList(q.u(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option = (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option) obj2;
                    listK.add(new Option(option.getText(), option.getValue(), option.getLeadingImageUrl()));
                }
            } else {
                listK = p.k();
            }
            List list = listK;
            String name = config.getName();
            InputSelectComponentStyle styles = config.getStyles();
            InputSelect.Attributes attributes3 = config.getAttributes();
            JsonLogicBoolean hidden = attributes3 != null ? attributes3.getHidden() : null;
            InputSelect.Attributes attributes4 = config.getAttributes();
            JsonLogicBoolean disabled = attributes4 != null ? attributes4.getDisabled() : null;
            InputSelect.Attributes attributes5 = config.getAttributes();
            String label = attributes5 != null ? attributes5.getLabel() : null;
            InputSelect.Attributes attributes6 = config.getAttributes();
            String placeholder = attributes6 != null ? attributes6.getPlaceholder() : null;
            InputSelect.Attributes attributes7 = config.getAttributes();
            if (attributes7 == null || (options = attributes7.getOptions()) == null) {
                listK2 = p.k();
            } else {
                List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> list2 = options;
                listK2 = new ArrayList(q.u(list2, 10));
                for (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option2 : list2) {
                    listK2.add(new Option(option2.getText(), option2.getValue(), option2.getLeadingImageUrl()));
                }
            }
            List list3 = listK2;
            InputSelect.Attributes attributes8 = config.getAttributes();
            return new InputSelectComponent(name, styles, list, hidden, disabled, label, placeholder, list3, attributes8 != null ? attributes8.getLeadingImageTemplate() : null, 0L, Barcode.FORMAT_UPC_A, null);
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InputSelectComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputSelectComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            InputSelectComponentStyle inputSelectComponentStyle = (InputSelectComponentStyle) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Option.CREATOR.createFromParcel(parcel));
            }
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(Option.CREATOR.createFromParcel(parcel));
            }
            return new InputSelectComponent(string, inputSelectComponentStyle, arrayList, jsonLogicBoolean, jsonLogicBoolean2, string2, string3, arrayList2, (RemoteImage) parcel.readParcelable(InputSelectComponent.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputSelectComponent[] newArray(int i10) {
            return new InputSelectComponent[i10];
        }
    }

    public InputSelectComponent(@NotNull String name, @Nullable InputSelectComponentStyle inputSelectComponentStyle, @NotNull List<Option> selectedOptions, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str, @Nullable String str2, @NotNull List<Option> options, @Nullable RemoteImage remoteImage, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(options, "options");
        this.name = name;
        this.styles = inputSelectComponentStyle;
        this.selectedOptions = selectedOptions;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.label = str;
        this.placeholder = str2;
        this.options = options;
        this.leadingImageTemplate = remoteImage;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.selectedOptionsController = new m(m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputSelectComponent p(InputSelectComponent inputSelectComponent, String str, InputSelectComponentStyle inputSelectComponentStyle, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, List list2, RemoteImage remoteImage, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputSelectComponent.name;
        }
        if ((i10 & 2) != 0) {
            inputSelectComponentStyle = inputSelectComponent.styles;
        }
        if ((i10 & 4) != 0) {
            list = inputSelectComponent.selectedOptions;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean = inputSelectComponent.hidden;
        }
        if ((i10 & 16) != 0) {
            jsonLogicBoolean2 = inputSelectComponent.disabled;
        }
        if ((i10 & 32) != 0) {
            str2 = inputSelectComponent.label;
        }
        if ((i10 & 64) != 0) {
            str3 = inputSelectComponent.placeholder;
        }
        if ((i10 & 128) != 0) {
            list2 = inputSelectComponent.options;
        }
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
            remoteImage = inputSelectComponent.leadingImageTemplate;
        }
        if ((i10 & Barcode.FORMAT_UPC_A) != 0) {
            j10 = inputSelectComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        List list3 = list2;
        RemoteImage remoteImage2 = remoteImage;
        String str4 = str2;
        String str5 = str3;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        List list4 = list;
        return inputSelectComponent.o(str, inputSelectComponentStyle, list4, jsonLogicBoolean, jsonLogicBoolean3, str4, str5, list3, remoteImage2, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // cr.w3
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public m getSelectedOptionsController() {
        return this.selectedOptionsController;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSelectComponent)) {
            return false;
        }
        InputSelectComponent inputSelectComponent = (InputSelectComponent) other;
        return Intrinsics.c(this.name, inputSelectComponent.name) && Intrinsics.c(this.styles, inputSelectComponent.styles) && Intrinsics.c(this.selectedOptions, inputSelectComponent.selectedOptions) && Intrinsics.c(this.hidden, inputSelectComponent.hidden) && Intrinsics.c(this.disabled, inputSelectComponent.disabled) && Intrinsics.c(this.label, inputSelectComponent.label) && Intrinsics.c(this.placeholder, inputSelectComponent.placeholder) && Intrinsics.c(this.options, inputSelectComponent.options) && Intrinsics.c(this.leadingImageTemplate, inputSelectComponent.leadingImageTemplate) && this.lastValueUpdateTs == inputSelectComponent.lastValueUpdateTs;
    }

    @Override // cr.w1
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getLabel() {
        return this.label;
    }

    @Override // cr.w1
    @NotNull
    public List<Option> g() {
        return this.options;
    }

    @Override // cr.o
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // cr.x
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.styles;
        int iHashCode2 = (((iHashCode + (inputSelectComponentStyle == null ? 0 : inputSelectComponentStyle.hashCode())) * 31) + this.selectedOptions.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.label;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode6 = (((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.options.hashCode()) * 31;
        RemoteImage remoteImage = this.leadingImageTemplate;
        return ((iHashCode6 + (remoteImage != null ? remoteImage.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.x
    @NotNull
    public List<mr.a> i() {
        return this.associatedViews;
    }

    @Override // cr.w1
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getCanSelectMultipleValues() {
        return this.canSelectMultipleValues;
    }

    @Override // cr.w1
    @NotNull
    public List<Option> m() {
        return this.selectedOptions;
    }

    @Override // cr.w1
    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public RemoteImage getLeadingImageTemplate() {
        return this.leadingImageTemplate;
    }

    @NotNull
    public final InputSelectComponent o(@NotNull String name, @Nullable InputSelectComponentStyle styles, @NotNull List<Option> selectedOptions, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable String label, @Nullable String placeholder, @NotNull List<Option> options, @Nullable RemoteImage leadingImageTemplate, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputSelectComponent(name, styles, selectedOptions, hidden, disabled, label, placeholder, options, leadingImageTemplate, lastValueUpdateTs);
    }

    @Override // cr.w1
    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public InputSelectComponentStyle getStyles() {
        return this.styles;
    }

    public void r(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.selectedOptionsController = mVar;
    }

    @Override // cr.w3
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InputSelectComponent k(@NotNull List<Option> selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        InputSelectComponent inputSelectComponentP = p(this, null, null, CollectionsKt.H0(selectedOptions, 1), null, null, null, null, null, null, System.currentTimeMillis(), 507, null);
        inputSelectComponentP.r(getSelectedOptionsController());
        return inputSelectComponentP;
    }

    @NotNull
    public String toString() {
        return "InputSelectComponent(name=" + this.name + ", styles=" + this.styles + ", selectedOptions=" + this.selectedOptions + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", label=" + this.label + ", placeholder=" + this.placeholder + ", options=" + this.options + ", leadingImageTemplate=" + this.leadingImageTemplate + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.styles, flags);
        List<Option> list = this.selectedOptions;
        dest.writeInt(list.size());
        Iterator<Option> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.label);
        dest.writeString(this.placeholder);
        List<Option> list2 = this.options;
        dest.writeInt(list2.size());
        Iterator<Option> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.leadingImageTemplate, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    public /* synthetic */ InputSelectComponent(String str, InputSelectComponentStyle inputSelectComponentStyle, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, List list2, RemoteImage remoteImage, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, inputSelectComponentStyle, list, jsonLogicBoolean, jsonLogicBoolean2, str2, str3, list2, remoteImage, (i10 & Barcode.FORMAT_UPC_A) != 0 ? 0L : j10);
    }
}
