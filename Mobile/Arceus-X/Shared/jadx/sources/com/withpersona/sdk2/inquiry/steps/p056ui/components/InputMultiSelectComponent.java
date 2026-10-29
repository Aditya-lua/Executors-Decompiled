package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Option;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputSelectComponentStyle;
import cr.InterfaceC4287o;
import cr.InterfaceC4337w1;
import cr.InterfaceC4339w3;
import cr.InterfaceC4341x;
import er.C5204m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 52\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001,Bg\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u0080\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b=\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010%R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\b>\u00106R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR&\u0010J\u001a\b\u0012\u0004\u0012\u00020F0E8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bG\u00104\u0012\u0004\bH\u0010I\u001a\u0004\bA\u00106R \u0010O\u001a\u00020)8\u0016X\u0096D¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bN\u0010I\u001a\u0004\bG\u0010MR(\u0010W\u001a\u00020P8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bV\u0010I\u001a\u0004\b,\u0010S\"\u0004\bT\u0010U¨\u0006X"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/w3;", "Lcr/w1;", "Lcr/o;", "Lcr/x;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "label", "placeholder", "options", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)V", "s", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "q", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "c", "Ljava/util/List;", "m", "()Ljava/util/List;", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "e", "getDisabled", "f", "g", "getPlaceholder", "h", "i", "J", "R0", "()J", "", "Lmr/a;", "j", "getAssociatedViews$annotations", "()V", "associatedViews", "k", "Z", "()Z", "getCanSelectMultipleValues$annotations", "canSelectMultipleValues", "Ler/m;", "l", "Ler/m;", "()Ler/m;", "r", "(Ler/m;)V", "getSelectedOptionsController$annotations", "selectedOptionsController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputMultiSelectComponent implements UiComponent, InterfaceC4339w3<InputMultiSelectComponent>, InterfaceC4337w1, InterfaceC4287o, InterfaceC4341x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final InputSelectComponentStyle styles;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Option> selectedOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String label;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final String placeholder;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Option> options;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean canSelectMultipleValues;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public C5204m selectedOptionsController;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputMultiSelectComponent> CREATOR = new C4059b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InputMultiSelectComponent m20748a(@NotNull InputMultiSelect config) {
            Set setM31908d;
            List listM31892k;
            List listM31892k2;
            List<Option> options;
            List<String> prefill;
            Intrinsics.checkNotNullParameter(config, "config");
            InputMultiSelect.Attributes attributes = config.getAttributes();
            List<Option> options2 = attributes != null ? attributes.getOptions() : null;
            InputMultiSelect.Attributes attributes2 = config.getAttributes();
            if (attributes2 == null || (prefill = attributes2.getPrefill()) == null || (setM31908d = CollectionsKt.m31691Q0(prefill)) == null) {
                setM31908d = C7702q0.m31908d();
            }
            if (options2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : options2) {
                    if (setM31908d.contains(((Option) obj).getValue())) {
                        arrayList.add(obj);
                    }
                }
                listM31892k = new ArrayList(C7701q.m31905u(arrayList, 10));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    Option option = (Option) obj2;
                    listM31892k.add(new Option(option.getText(), option.getValue(), null, 4, null));
                }
            } else {
                listM31892k = C7699p.m31892k();
            }
            List list = listM31892k;
            String name = config.getName();
            InputSelectComponentStyle styles = config.getStyles();
            InputMultiSelect.Attributes attributes3 = config.getAttributes();
            JsonLogicBoolean hidden = attributes3 != null ? attributes3.getHidden() : null;
            InputMultiSelect.Attributes attributes4 = config.getAttributes();
            JsonLogicBoolean disabled = attributes4 != null ? attributes4.getDisabled() : null;
            InputMultiSelect.Attributes attributes5 = config.getAttributes();
            String label = attributes5 != null ? attributes5.getLabel() : null;
            InputMultiSelect.Attributes attributes6 = config.getAttributes();
            String placeholder = attributes6 != null ? attributes6.getPlaceholder() : null;
            InputMultiSelect.Attributes attributes7 = config.getAttributes();
            if (attributes7 == null || (options = attributes7.getOptions()) == null) {
                listM31892k2 = C7699p.m31892k();
            } else {
                List<Option> list2 = options;
                listM31892k2 = new ArrayList(C7701q.m31905u(list2, 10));
                for (Option option2 : list2) {
                    listM31892k2.add(new Option(option2.getText(), option2.getValue(), null, 4, null));
                }
            }
            return new InputMultiSelectComponent(name, styles, list, hidden, disabled, label, placeholder, listM31892k2, 0L, 256, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4059b implements Parcelable.Creator<InputMultiSelectComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMultiSelectComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            InputSelectComponentStyle inputSelectComponentStyle = (InputSelectComponentStyle) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Option.CREATOR.createFromParcel(parcel));
            }
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(Option.CREATOR.createFromParcel(parcel));
            }
            return new InputMultiSelectComponent(string, inputSelectComponentStyle, arrayList, jsonLogicBoolean, jsonLogicBoolean2, string2, string3, arrayList2, parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputMultiSelectComponent[] newArray(int i10) {
            return new InputMultiSelectComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputMultiSelectComponent(@NotNull String name, @Nullable InputSelectComponentStyle inputSelectComponentStyle, @NotNull List<Option> selectedOptions, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str, @Nullable String str2, @NotNull List<Option> options, long j10) {
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
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.canSelectMultipleValues = true;
        this.selectedOptionsController = new C5204m(mo20725m());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ InputMultiSelectComponent m20741p(InputMultiSelectComponent inputMultiSelectComponent, String str, InputSelectComponentStyle inputSelectComponentStyle, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, List list2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputMultiSelectComponent.name;
        }
        if ((i10 & 2) != 0) {
            inputSelectComponentStyle = inputMultiSelectComponent.styles;
        }
        if ((i10 & 4) != 0) {
            list = inputMultiSelectComponent.selectedOptions;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean = inputMultiSelectComponent.hidden;
        }
        if ((i10 & 16) != 0) {
            jsonLogicBoolean2 = inputMultiSelectComponent.disabled;
        }
        if ((i10 & 32) != 0) {
            str2 = inputMultiSelectComponent.label;
        }
        if ((i10 & 64) != 0) {
            str3 = inputMultiSelectComponent.placeholder;
        }
        if ((i10 & 128) != 0) {
            list2 = inputMultiSelectComponent.options;
        }
        if ((i10 & 256) != 0) {
            j10 = inputMultiSelectComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        String str4 = str3;
        List list3 = list2;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        String str5 = str2;
        return inputMultiSelectComponent.m20744o(str, inputSelectComponentStyle, list, jsonLogicBoolean, jsonLogicBoolean3, str5, str4, list3, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4339w3
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public C5204m getSelectedOptionsController() {
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
        if (!(other instanceof InputMultiSelectComponent)) {
            return false;
        }
        InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) other;
        return Intrinsics.m31980c(this.name, inputMultiSelectComponent.name) && Intrinsics.m31980c(this.styles, inputMultiSelectComponent.styles) && Intrinsics.m31980c(this.selectedOptions, inputMultiSelectComponent.selectedOptions) && Intrinsics.m31980c(this.hidden, inputMultiSelectComponent.hidden) && Intrinsics.m31980c(this.disabled, inputMultiSelectComponent.disabled) && Intrinsics.m31980c(this.label, inputMultiSelectComponent.label) && Intrinsics.m31980c(this.placeholder, inputMultiSelectComponent.placeholder) && Intrinsics.m31980c(this.options, inputMultiSelectComponent.options) && this.lastValueUpdateTs == inputMultiSelectComponent.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4337w1
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getLabel() {
        return this.label;
    }

    @Override // cr.InterfaceC4337w1
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<Option> mo20723g() {
        return this.options;
    }

    @Override // cr.InterfaceC4287o
    @Nullable
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // cr.InterfaceC4341x
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
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
        return ((((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.options.hashCode()) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @Override // cr.InterfaceC4337w1
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getCanSelectMultipleValues() {
        return this.canSelectMultipleValues;
    }

    @Override // cr.InterfaceC4337w1
    @NotNull
    /* JADX INFO: renamed from: m */
    public List<Option> mo20725m() {
        return this.selectedOptions;
    }

    @Override // cr.InterfaceC4337w1
    @Nullable
    /* JADX INFO: renamed from: n */
    public RemoteImage getLeadingImageTemplate() {
        return super.getLeadingImageTemplate();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final InputMultiSelectComponent m20744o(@NotNull String name, @Nullable InputSelectComponentStyle styles, @NotNull List<Option> selectedOptions, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable String label, @Nullable String placeholder, @NotNull List<Option> options, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputMultiSelectComponent(name, styles, selectedOptions, hidden, disabled, label, placeholder, options, lastValueUpdateTs);
    }

    /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle; */
    @Override // cr.InterfaceC4337w1
    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public InputSelectComponentStyle getStyles() {
        return this.styles;
    }

    /* JADX INFO: renamed from: r */
    public void m20746r(@NotNull C5204m c5204m) {
        Intrinsics.checkNotNullParameter(c5204m, "<set-?>");
        this.selectedOptionsController = c5204m;
    }

    /* JADX DEBUG: Method merged with bridge method: k(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4339w3
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public InputMultiSelectComponent mo20743k(@NotNull List<Option> selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        InputMultiSelectComponent inputMultiSelectComponentM20741p = m20741p(this, null, null, selectedOptions, null, null, null, null, null, System.currentTimeMillis(), 251, null);
        inputMultiSelectComponentM20741p.m20746r(getSelectedOptionsController());
        return inputMultiSelectComponentM20741p;
    }

    @NotNull
    public String toString() {
        return "InputMultiSelectComponent(name=" + this.name + ", styles=" + this.styles + ", selectedOptions=" + this.selectedOptions + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", label=" + this.label + ", placeholder=" + this.placeholder + ", options=" + this.options + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
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
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
      (r14v0 java.lang.String)
      (r15v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle)
      (r16v0 java.util.List)
      (r17v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r18v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r19v0 java.lang.String)
      (r20v0 java.lang.String)
      (r21v0 java.util.List)
      (wrap long:?: TERNARY null = ((wrap int:0x0002: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle, java.util.List<com.withpersona.sdk2.inquiry.steps.ui.components.Option>, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.steps.ui.components.Option>, long):void (m)] (LINE:14) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle, java.util.List, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.String, java.util.List, long):void type: THIS */
    public /* synthetic */ InputMultiSelectComponent(String str, InputSelectComponentStyle inputSelectComponentStyle, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, List list2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, inputSelectComponentStyle, list, jsonLogicBoolean, jsonLogicBoolean2, str2, str3, list2, (i10 & 256) != 0 ? 0L : j10);
    }
}
