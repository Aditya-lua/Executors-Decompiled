package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import cr.InterfaceC4287o;
import cr.InterfaceC4292o4;
import cr.InterfaceC4337w1;
import cr.InterfaceC4341x;
import er.C5197f;
import er.C5204m;
import er.PhoneNumberInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0392u;
import p016an.InterfaceC0389r;
import p471um.InterfaceC11872g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 V2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004:\u00011B]\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b#\u0010$Jt\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u001a\u0010,\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010/\u001a\u0004\bA\u0010(\"\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR&\u0010S\u001a\b\u0012\u0004\u0012\u00020M0L8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bQ\u0010R\u001a\u0004\bH\u0010PR\u001d\u0010Y\u001a\u00020T8\u0006¢\u0006\u0012\n\u0004\b?\u0010U\u0012\u0004\bX\u0010R\u001a\u0004\bV\u0010WR(\u0010b\u001a\u00020Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\ba\u0010R\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R#\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00190c8\u0006¢\u0006\u0012\n\u0004\bd\u0010O\u0012\u0004\be\u0010R\u001a\u0004\bd\u0010PR(\u0010m\u001a\u00020g8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b]\u0010h\u0012\u0004\bl\u0010R\u001a\u0004\b=\u0010i\"\u0004\bj\u0010k¨\u0006n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/o4;", "Lcr/o;", "Lcr/x;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "", "activeOptionBackgroundColor", "selectedCountryCode", "", "disableCountryCodeSelection", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Ljava/lang/Integer;Ljava/lang/String;ZJ)V", "newString", "t", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedCountry", "u", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Ljava/lang/Integer;Ljava/lang/String;ZJ)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getValue", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "getDisabled", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "q", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "f", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "r", "setSelectedCountryCode", "(Ljava/lang/String;)V", "h", "Z", "p", "()Z", "i", "J", "R0", "()J", "", "Lmr/a;", "j", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Lcr/w1;", "Lcr/w1;", "o", "()Lcr/w1;", "getCountryCodeSelectComponent$annotations", "countryCodeSelectComponent", "Ler/m;", "l", "Ler/m;", "n", "()Ler/m;", "setCountryCodeOptionsController", "(Ler/m;)V", "getCountryCodeOptionsController$annotations", "countryCodeOptionsController", "", "m", "getCountryCodeOptions$annotations", "countryCodeOptions", "Lan/r;", "Lan/r;", "()Lan/r;", "s", "(Lan/r;)V", "getTextController$annotations", "textController", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputPhoneNumberComponent implements UiComponent, InterfaceC4292o4<InputPhoneNumberComponent>, InterfaceC4287o, InterfaceC4341x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final TextBasedComponentStyle errorTextStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer activeOptionBackgroundColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public String selectedCountryCode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final boolean disableCountryCodeSelection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4337w1 countryCodeSelectComponent;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public C5204m countryCodeOptionsController;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<Option> countryCodeOptions;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public InterfaceC0389r textController;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputPhoneNumberComponent> CREATOR = new C4063c();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent$a */
    @Metadata(m31664d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, m31665d2 = {"com/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent$a", "Lcr/w1;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "j", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "g", "()Ljava/util/List;", "options", "", "f", "()Ljava/lang/String;", "label", "m", "selectedOptions", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4061a implements InterfaceC4337w1 {
        public C4061a() {
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: f */
        public String getLabel() {
            return null;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: g */
        public List<Option> mo20723g() {
            return InputPhoneNumberComponent.this.m20760m();
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: getStyles */
        public InputSelectBoxComponentStyle getF27964a() {
            return null;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: j */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: m */
        public List<Option> mo20725m() {
            return C7697o.m31878d(C5197f.f20219a.m24109g(InputPhoneNumberComponent.this.getSelectedCountryCode()));
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: n */
        public RemoteImage getLeadingImageTemplate() {
            return super.getLeadingImageTemplate();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InputPhoneNumberComponent m20769a(@NotNull InputPhoneNumber config) {
            String string;
            String countryCode;
            String str;
            String countryCode2;
            Boolean disableCountryCodeSelection;
            String prefill;
            Intrinsics.checkNotNullParameter(config, "config");
            InputPhoneNumber.Attributes attributes = config.getAttributes();
            if (attributes == null || (prefill = attributes.getPrefill()) == null || (string = StringsKt.m32183p1(prefill).toString()) == null) {
                string = "";
            }
            boolean zBooleanValue = false;
            if (C7797x.m32309T(string, "+", false, 2, null)) {
                PhoneNumberInfo phoneNumberInfoM24113k = C5197f.f20219a.m24113k(string);
                String localPhoneNumber = phoneNumberInfoM24113k.getLocalPhoneNumber();
                countryCode2 = phoneNumberInfoM24113k.getCountryCode();
                str = localPhoneNumber;
            } else {
                InputPhoneNumber.Attributes attributes2 = config.getAttributes();
                if (attributes2 == null || (countryCode = attributes2.getCountryCode()) == null) {
                    countryCode = C5197f.f20219a.m24112j().getCountryCode();
                }
                str = string;
                countryCode2 = countryCode;
            }
            String name = config.getName();
            InputPhoneNumber.Attributes attributes3 = config.getAttributes();
            JsonLogicBoolean hidden = attributes3 != null ? attributes3.getHidden() : null;
            InputPhoneNumber.Attributes attributes4 = config.getAttributes();
            JsonLogicBoolean disabled = attributes4 != null ? attributes4.getDisabled() : null;
            InputTextBasedComponentStyle styles = config.getStyles();
            TextBasedComponentStyle errorTextStyle = styles != null ? styles.getErrorTextStyle() : null;
            InputTextBasedComponentStyle styles2 = config.getStyles();
            Integer activeOptionBackgroundColorValue = styles2 != null ? styles2.getActiveOptionBackgroundColorValue() : null;
            InputPhoneNumber.Attributes attributes5 = config.getAttributes();
            if (attributes5 != null && (disableCountryCodeSelection = attributes5.getDisableCountryCodeSelection()) != null) {
                zBooleanValue = disableCountryCodeSelection.booleanValue();
            }
            return new InputPhoneNumberComponent(name, str, hidden, disabled, errorTextStyle, activeOptionBackgroundColorValue, countryCode2, zBooleanValue, 0L, 256, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4063c implements Parcelable.Creator<InputPhoneNumberComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputPhoneNumberComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputPhoneNumberComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputPhoneNumberComponent[] newArray(int i10) {
            return new InputPhoneNumberComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputPhoneNumberComponent(@NotNull String name, @NotNull String value, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable TextBasedComponentStyle textBasedComponentStyle, @Nullable Integer num, @Nullable String str, boolean z10, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.activeOptionBackgroundColor = num;
        this.selectedCountryCode = str;
        this.disableCountryCodeSelection = z10;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        C5197f c5197f = C5197f.f20219a;
        this.countryCodeOptions = c5197f.m24108f();
        this.countryCodeSelectComponent = new C4061a();
        this.countryCodeOptionsController = new C5204m(c5197f.m24109g(this.selectedCountryCode));
        this.textController = C0392u.m1458a(value);
    }

    @InterfaceC11872g(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InputPhoneNumberComponent m20757j(InputPhoneNumberComponent inputPhoneNumberComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, Integer num, String str3, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inputPhoneNumberComponent.name;
        }
        if ((i10 & 2) != 0) {
            str2 = inputPhoneNumberComponent.value;
        }
        if ((i10 & 4) != 0) {
            jsonLogicBoolean = inputPhoneNumberComponent.hidden;
        }
        if ((i10 & 8) != 0) {
            jsonLogicBoolean2 = inputPhoneNumberComponent.disabled;
        }
        if ((i10 & 16) != 0) {
            textBasedComponentStyle = inputPhoneNumberComponent.errorTextStyle;
        }
        if ((i10 & 32) != 0) {
            num = inputPhoneNumberComponent.activeOptionBackgroundColor;
        }
        if ((i10 & 64) != 0) {
            str3 = inputPhoneNumberComponent.selectedCountryCode;
        }
        if ((i10 & 128) != 0) {
            z10 = inputPhoneNumberComponent.disableCountryCodeSelection;
        }
        if ((i10 & 256) != 0) {
            j10 = inputPhoneNumberComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        String str4 = str3;
        boolean z11 = z10;
        TextBasedComponentStyle textBasedComponentStyle2 = textBasedComponentStyle;
        Integer num2 = num;
        return inputPhoneNumberComponent.m20758g(str, str2, jsonLogicBoolean, jsonLogicBoolean2, textBasedComponentStyle2, num2, str4, z11, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputPhoneNumberComponent)) {
            return false;
        }
        InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) other;
        return Intrinsics.m31980c(this.name, inputPhoneNumberComponent.name) && Intrinsics.m31980c(this.value, inputPhoneNumberComponent.value) && Intrinsics.m31980c(this.hidden, inputPhoneNumberComponent.hidden) && Intrinsics.m31980c(this.disabled, inputPhoneNumberComponent.disabled) && Intrinsics.m31980c(this.errorTextStyle, inputPhoneNumberComponent.errorTextStyle) && Intrinsics.m31980c(this.activeOptionBackgroundColor, inputPhoneNumberComponent.activeOptionBackgroundColor) && Intrinsics.m31980c(this.selectedCountryCode, inputPhoneNumberComponent.selectedCountryCode) && this.disableCountryCodeSelection == inputPhoneNumberComponent.disableCountryCodeSelection && this.lastValueUpdateTs == inputPhoneNumberComponent.lastValueUpdateTs;
    }

    @Override // cr.InterfaceC4292o4
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public InterfaceC0389r getTextController() {
        return this.textController;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InputPhoneNumberComponent m20758g(@NotNull String name, @NotNull String value, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @Nullable TextBasedComponentStyle errorTextStyle, @Nullable Integer activeOptionBackgroundColor, @Nullable String selectedCountryCode, boolean disableCountryCodeSelection, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputPhoneNumberComponent(name, value, hidden, disabled, errorTextStyle, activeOptionBackgroundColor, selectedCountryCode, disableCountryCodeSelection, lastValueUpdateTs);
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
        int iHashCode = ((this.name.hashCode() * 31) + this.value.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        int iHashCode4 = (iHashCode3 + (textBasedComponentStyle == null ? 0 : textBasedComponentStyle.hashCode())) * 31;
        Integer num = this.activeOptionBackgroundColor;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.selectedCountryCode;
        return ((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.disableCountryCodeSelection)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getActiveOptionBackgroundColor() {
        return this.activeOptionBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final List<Option> m20760m() {
        return this.countryCodeOptions;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final C5204m getCountryCodeOptionsController() {
        return this.countryCodeOptionsController;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC4337w1 getCountryCodeSelectComponent() {
        return this.countryCodeSelectComponent;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getDisableCountryCodeSelection() {
        return this.disableCountryCodeSelection;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextBasedComponentStyle getErrorTextStyle() {
        return this.errorTextStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getSelectedCountryCode() {
        return this.selectedCountryCode;
    }

    /* JADX INFO: renamed from: s */
    public void m20766s(@NotNull InterfaceC0389r interfaceC0389r) {
        Intrinsics.checkNotNullParameter(interfaceC0389r, "<set-?>");
        this.textController = interfaceC0389r;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent; */
    @Override // cr.InterfaceC4292o4
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public InputPhoneNumberComponent mo20667a(@NotNull String newString) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        InputPhoneNumberComponent inputPhoneNumberComponentM20757j = m20757j(this, null, newString, null, null, null, null, null, false, System.currentTimeMillis(), 253, null);
        inputPhoneNumberComponentM20757j.m20766s(getTextController());
        inputPhoneNumberComponentM20757j.countryCodeOptionsController = this.countryCodeOptionsController;
        return inputPhoneNumberComponentM20757j;
    }

    @NotNull
    public String toString() {
        return "InputPhoneNumberComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ", activeOptionBackgroundColor=" + this.activeOptionBackgroundColor + ", selectedCountryCode=" + this.selectedCountryCode + ", disableCountryCodeSelection=" + this.disableCountryCodeSelection + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final InputPhoneNumberComponent m20768u(@Nullable Option selectedCountry) {
        InputPhoneNumberComponent inputPhoneNumberComponentM20757j = m20757j(this, null, null, null, null, null, null, selectedCountry != null ? C5197f.f20219a.m24107e(selectedCountry) : null, false, System.currentTimeMillis(), 191, null);
        inputPhoneNumberComponentM20757j.m20766s(getTextController());
        inputPhoneNumberComponentM20757j.countryCodeOptionsController = this.countryCodeOptionsController;
        return inputPhoneNumberComponentM20757j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.errorTextStyle, flags);
        Integer num = this.activeOptionBackgroundColor;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.selectedCountryCode);
        dest.writeInt(this.disableCountryCodeSelection ? 1 : 0);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
      (r14v0 java.lang.String)
      (r15v0 java.lang.String)
      (r16v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r17v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r18v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle)
      (r19v0 java.lang.Integer)
      (r20v0 java.lang.String)
      (r21v0 boolean)
      (wrap long:?: TERNARY null = ((wrap int:0x0002: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
     A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle, java.lang.Integer, java.lang.String, boolean, long):void (m)] (LINE:16) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle, java.lang.Integer, java.lang.String, boolean, long):void type: THIS */
    public /* synthetic */ InputPhoneNumberComponent(String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, Integer num, String str3, boolean z10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jsonLogicBoolean, jsonLogicBoolean2, textBasedComponentStyle, num, str3, z10, (i10 & 256) != 0 ? 0L : j10);
    }
}
