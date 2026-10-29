package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputSelectComponentStyle;
import cr.InterfaceC4287o;
import cr.InterfaceC4337w1;
import cr.InterfaceC4341x;
import er.C5204m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.C7707t;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.InterfaceC8649a;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0392u;
import p016an.InterfaceC0389r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u00038:>B\u0089\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001d\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$¢\u0006\u0004\b+\u0010,Jª\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020$HÖ\u0001¢\u0006\u0004\b1\u0010&J\u001a\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b7\u00100R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u00100R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00100R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010MR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bD\u0010RR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR&\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bF\u0010Q\u0012\u0004\b]\u0010^\u001a\u0004\bJ\u0010RR(\u0010f\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bL\u0010a\u0012\u0004\be\u0010^\u001a\u0004\bP\u0010b\"\u0004\bc\u0010dR(\u0010j\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bI\u0010a\u0012\u0004\bi\u0010^\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR:\u0010m\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010\u00112\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010Q\u0012\u0004\bl\u0010^\u001a\u0004\bN\u0010RR0\u0010s\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\u0011\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bp\u0010q\u0012\u0004\br\u0010^R\u001d\u0010v\u001a\u00020!8\u0006¢\u0006\u0012\n\u0004\bg\u0010t\u0012\u0004\bu\u0010^\u001a\u0004\bW\u0010#R(\u0010~\u001a\u00020w8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010x\u0012\u0004\b}\u0010^\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0019\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bp\u0010R¨\u0006\u0080\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/o;", "Lcr/x;", "", "name", "selectedCountry", "selectedIdType", "idValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "", "hideCountryField", "hideIdTypeField", "hideCountryIfSingleChoice", "hideTypeIfSingleChoice", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$IdType;", "allowedIdTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "inputSelectStyle", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;J)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "A", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "C", "value", "D", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Lcr/w1;", "t", "()Lcr/w1;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "x", "c", "z", "d", "u", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "f", "getDisabled", "g", "Z", "n", "()Z", "h", "p", "i", "Ljava/lang/Boolean;", "o", "()Ljava/lang/Boolean;", "j", "q", "k", "Ljava/util/List;", "()Ljava/util/List;", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "w", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "m", "J", "R0", "()J", "", "Lmr/a;", "getAssociatedViews$annotations", "()V", "associatedViews", "Ler/m;", "Ler/m;", "()Ler/m;", "setCountryOptionsController", "(Ler/m;)V", "getCountryOptionsController$annotations", "countryOptionsController", "s", "setIdTypeOptionsController", "getIdTypeOptionsController$annotations", "idTypeOptionsController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$c;", "getCountryOptions$annotations", "countryOptions", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$e;", "r", "Ljava/util/Map;", "getTypesByCountryCode$annotations", "typesByCountryCode", "Lcr/w1;", "getCountrySelectComponent$annotations", "countrySelectComponent", "Lan/r;", "Lan/r;", "v", "()Lan/r;", "setIdValueController", "(Lan/r;)V", "getIdValueController$annotations", "idValueController", "idTypeOptions", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InputInternationalDbComponent implements UiComponent, InterfaceC4287o, InterfaceC4341x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String selectedCountry;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String selectedIdType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String idValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final boolean hideCountryField;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final boolean hideIdTypeField;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final Boolean hideCountryIfSingleChoice;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    public final Boolean hideTypeIfSingleChoice;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<InputInternationalDb.IdType> allowedIdTypes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    public final InputSelectComponentStyle inputSelectStyle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC8649a> associatedViews;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public C5204m countryOptionsController;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public C5204m idTypeOptionsController;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public List<CountryOption> countryOptions;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Map<String, ? extends List<IdOption>> typesByCountryCode;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4337w1 countrySelectComponent;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public InterfaceC0389r idValueController;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputInternationalDbComponent> CREATOR = new C4052d();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$a */
    @Metadata(m31664d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, m31665d2 = {"com/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$a", "Lcr/w1;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "j", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "g", "()Ljava/util/List;", "options", "", "f", "()Ljava/lang/String;", "label", "m", "selectedOptions", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4049a implements InterfaceC4337w1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set<CountryOption> f17209b;

        public C4049a(Set<CountryOption> set) {
            this.f17209b = set;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: f */
        public String getLabel() {
            return null;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.steps.ui.components.a.h(com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$c):com.withpersona.sdk2.inquiry.steps.ui.components.Option */
        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: g */
        public List<Option> mo20723g() {
            Set<CountryOption> set = this.f17209b;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(C4085a.m20875l((CountryOption) it.next()));
            }
            return arrayList;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: getStyles */
        public InputSelectBoxComponentStyle getF27964a() {
            return InputInternationalDbComponent.this.getInputSelectStyle();
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: j */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: m */
        public List<Option> mo20725m() {
            return C7699p.m31892k();
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: n */
        public RemoteImage getLeadingImageTemplate() {
            return super.getLeadingImageTemplate();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t10) {
                return C8662a.m34743a(((IdOption) t8).getName(), ((IdOption) t10).getName());
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InputInternationalDbComponent m20727a(@NotNull InputInternationalDb config) {
            List<InputInternationalDb.IdType> allowedIdTypes;
            String countryName;
            String name;
            Intrinsics.checkNotNullParameter(config, "config");
            InputInternationalDb.Attributes attributes = config.getAttributes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InputInternationalDb.Attributes attributes2 = config.getAttributes();
            if (attributes2 != null && (allowedIdTypes = attributes2.getAllowedIdTypes()) != null) {
                for (InputInternationalDb.IdType idType : allowedIdTypes) {
                    String countryCode = idType.getCountryCode();
                    if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                        linkedHashSet.add(new CountryOption(countryName, countryCode));
                        Object arrayList = linkedHashMap.get(countryCode);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(countryCode, arrayList);
                        }
                        Collection collection = (Collection) arrayList;
                        String idType2 = idType.getIdType();
                        if (idType2 != null && (name = idType.getName()) != null) {
                            collection.add(new IdOption(idType2, name));
                        }
                    }
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                if (list.size() > 1) {
                    C7707t.m31919y(list, new a());
                }
            }
            boolean z10 = (attributes != null ? Intrinsics.m31980c(attributes.getHideCountryIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbCountry() != null;
            boolean z11 = (attributes != null ? Intrinsics.m31980c(attributes.getHideTypeIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbType() != null;
            String name2 = config.getName();
            InputInternationalDb.Attributes attributes3 = config.getAttributes();
            String prefillIdbCountry = attributes3 != null ? attributes3.getPrefillIdbCountry() : null;
            InputInternationalDb.Attributes attributes4 = config.getAttributes();
            String prefillIdbType = attributes4 != null ? attributes4.getPrefillIdbType() : null;
            InputInternationalDb.Attributes attributes5 = config.getAttributes();
            String prefillIdbValue = attributes5 != null ? attributes5.getPrefillIdbValue() : null;
            InputInternationalDb.Attributes attributes6 = config.getAttributes();
            JsonLogicBoolean hidden = attributes6 != null ? attributes6.getHidden() : null;
            InputInternationalDb.Attributes attributes7 = config.getAttributes();
            JsonLogicBoolean disabled = attributes7 != null ? attributes7.getDisabled() : null;
            InputInternationalDb.Attributes attributes8 = config.getAttributes();
            Boolean hideCountryIfSingleChoice = attributes8 != null ? attributes8.getHideCountryIfSingleChoice() : null;
            InputInternationalDb.Attributes attributes9 = config.getAttributes();
            Boolean hideTypeIfSingleChoice = attributes9 != null ? attributes9.getHideTypeIfSingleChoice() : null;
            InputInternationalDb.Attributes attributes10 = config.getAttributes();
            List<InputInternationalDb.IdType> allowedIdTypes2 = attributes10 != null ? attributes10.getAllowedIdTypes() : null;
            InputInternationalDb.InputInternationalDbComponentStyle styles = config.getStyles();
            return new InputInternationalDbComponent(name2, prefillIdbCountry, prefillIdbType, prefillIdbValue, hidden, disabled, z10, z11, hideCountryIfSingleChoice, hideTypeIfSingleChoice, allowedIdTypes2, styles != null ? styles.getInputSelectStyle() : null, 0L, 4096, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$c, reason: from toString */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$c;", "", "", "countryName", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class CountryOption {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String countryName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String countryCode;

        public CountryOption(@NotNull String countryName, @NotNull String countryCode) {
            Intrinsics.checkNotNullParameter(countryName, "countryName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryName = countryName;
            this.countryCode = countryCode;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountryName() {
            return this.countryName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryOption)) {
                return false;
            }
            CountryOption countryOption = (CountryOption) other;
            return Intrinsics.m31980c(this.countryName, countryOption.countryName) && Intrinsics.m31980c(this.countryCode, countryOption.countryCode);
        }

        public int hashCode() {
            return (this.countryName.hashCode() * 31) + this.countryCode.hashCode();
        }

        @NotNull
        public String toString() {
            return "CountryOption(countryName=" + this.countryName + ", countryCode=" + this.countryCode + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4052d implements Parcelable.Creator<InputInternationalDbComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputInternationalDbComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader());
            boolean z10 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            if (parcel.readInt() == 0) {
                z11 = z10;
            }
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0 ? z11 : z10);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() == 0 ? z10 : true);
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new InputInternationalDbComponent(string, string2, string3, string4, jsonLogicBoolean, jsonLogicBoolean2, z10, z11, boolValueOf, boolValueOf2, arrayList, (InputSelectComponentStyle) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputInternationalDbComponent[] newArray(int i10) {
            return new InputInternationalDbComponent[i10];
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$e, reason: from toString */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$e;", "", "", "idType", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class IdOption {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String idType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String name;

        public IdOption(@NotNull String idType, @NotNull String name) {
            Intrinsics.checkNotNullParameter(idType, "idType");
            Intrinsics.checkNotNullParameter(name, "name");
            this.idType = idType;
            this.name = name;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIdType() {
            return this.idType;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdOption)) {
                return false;
            }
            IdOption idOption = (IdOption) other;
            return Intrinsics.m31980c(this.idType, idOption.idType) && Intrinsics.m31980c(this.name, idOption.name);
        }

        public int hashCode() {
            return (this.idType.hashCode() * 31) + this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "IdOption(idType=" + this.idType + ", name=" + this.name + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$f */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4054f<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(((IdOption) t8).getName(), ((IdOption) t10).getName());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$g */
    @Metadata(m31664d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, m31665d2 = {"com/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$g", "Lcr/w1;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "j", "()Z", "canSelectMultipleValues", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "g", "()Ljava/util/List;", "options", "", "f", "()Ljava/lang/String;", "label", "m", "selectedOptions", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4055g implements InterfaceC4337w1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<IdOption> f17215b;

        public C4055g(List<IdOption> list) {
            this.f17215b = list;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: f */
        public String getLabel() {
            return null;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: g */
        public List<Option> mo20723g() {
            List<IdOption> list = this.f17215b;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C4085a.m20876m((IdOption) it.next()));
            }
            return arrayList;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: getStyles */
        public InputSelectBoxComponentStyle getF27964a() {
            return InputInternationalDbComponent.this.getInputSelectStyle();
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: j */
        public boolean getCanSelectMultipleValues() {
            return false;
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: m */
        public List<Option> mo20725m() {
            return C7699p.m31892k();
        }

        @Override // cr.InterfaceC4337w1
        /* JADX INFO: renamed from: n */
        public RemoteImage getLeadingImageTemplate() {
            return super.getLeadingImageTemplate();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$h */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4056h<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(((CountryOption) t8).getCountryName(), ((CountryOption) t10).getCountryName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputInternationalDbComponent(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, boolean z10, boolean z11, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable List<InputInternationalDb.IdType> list, @Nullable InputSelectComponentStyle inputSelectComponentStyle, long j10) {
        Option optionM20876m;
        Object next;
        Object next2;
        String countryName;
        String name2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.selectedCountry = str;
        this.selectedIdType = str2;
        this.idValue = str3;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.hideCountryField = z10;
        this.hideIdTypeField = z11;
        this.hideCountryIfSingleChoice = bool;
        this.hideTypeIfSingleChoice = bool2;
        this.allowedIdTypes = list;
        this.inputSelectStyle = inputSelectComponentStyle;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        this.idValueController = C0392u.m1458a(str3 == null ? "" : str3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (InputInternationalDb.IdType idType : list) {
                String countryCode = idType.getCountryCode();
                if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                    linkedHashSet.add(new CountryOption(countryName, countryCode));
                    Object arrayList = linkedHashMap.get(countryCode);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(countryCode, arrayList);
                    }
                    Collection collection = (Collection) arrayList;
                    String idType2 = idType.getIdType();
                    if (idType2 != null && (name2 = idType.getName()) != null) {
                        collection.add(new IdOption(idType2, name2));
                    }
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            if (list2.size() > 1) {
                C7707t.m31919y(list2, new C4054f());
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        do {
            optionM20876m = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.m31980c(((CountryOption) next).getCountryCode(), this.selectedCountry));
        CountryOption countryOption = (CountryOption) next;
        Option optionM20875l = countryOption != null ? C4085a.m20875l(countryOption) : null;
        List list3 = (List) linkedHashMap.get(optionM20875l != null ? optionM20875l.getValue() : null);
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!Intrinsics.m31980c(((IdOption) next2).getIdType(), this.selectedIdType));
            IdOption idOption = (IdOption) next2;
            if (idOption != null) {
                optionM20876m = C4085a.m20876m(idOption);
            }
        }
        this.countryOptionsController = new C5204m(optionM20875l);
        this.idTypeOptionsController = new C5204m(optionM20876m);
        this.countryOptions = CollectionsKt.m31680F0(CollectionsKt.m31687M0(linkedHashSet), new C4056h());
        this.typesByCountryCode = linkedHashMap;
        this.countrySelectComponent = new C4049a(linkedHashSet);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InputInternationalDbComponent m20701f(InputInternationalDbComponent inputInternationalDbComponent, String str, String str2, String str3, String str4, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, boolean z10, boolean z11, Boolean bool, Boolean bool2, List list, InputSelectComponentStyle inputSelectComponentStyle, long j10, int i10, Object obj) {
        return inputInternationalDbComponent.m20705a((i10 & 1) != 0 ? inputInternationalDbComponent.name : str, (i10 & 2) != 0 ? inputInternationalDbComponent.selectedCountry : str2, (i10 & 4) != 0 ? inputInternationalDbComponent.selectedIdType : str3, (i10 & 8) != 0 ? inputInternationalDbComponent.idValue : str4, (i10 & 16) != 0 ? inputInternationalDbComponent.hidden : jsonLogicBoolean, (i10 & 32) != 0 ? inputInternationalDbComponent.disabled : jsonLogicBoolean2, (i10 & 64) != 0 ? inputInternationalDbComponent.hideCountryField : z10, (i10 & 128) != 0 ? inputInternationalDbComponent.hideIdTypeField : z11, (i10 & 256) != 0 ? inputInternationalDbComponent.hideCountryIfSingleChoice : bool, (i10 & 512) != 0 ? inputInternationalDbComponent.hideTypeIfSingleChoice : bool2, (i10 & 1024) != 0 ? inputInternationalDbComponent.allowedIdTypes : list, (i10 & 2048) != 0 ? inputInternationalDbComponent.inputSelectStyle : inputSelectComponentStyle, (i10 & 4096) != 0 ? inputInternationalDbComponent.lastValueUpdateTs : j10);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final InputInternationalDbComponent m20702A(@Nullable Option selectedCountry) {
        InputInternationalDbComponent inputInternationalDbComponentM20701f = m20701f(this, null, selectedCountry != null ? selectedCountry.getValue() : null, null, null, null, null, false, false, null, null, null, null, System.currentTimeMillis(), 4093, null);
        inputInternationalDbComponentM20701f.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentM20701f.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentM20701f.idValueController = this.idValueController;
        return inputInternationalDbComponentM20701f;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final InputInternationalDbComponent m20703C(@Nullable Option selectedIdType) {
        InputInternationalDbComponent inputInternationalDbComponentM20701f = m20701f(this, null, null, selectedIdType != null ? selectedIdType.getValue() : null, null, null, null, false, false, null, null, null, null, System.currentTimeMillis(), 4091, null);
        inputInternationalDbComponentM20701f.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentM20701f.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentM20701f.idValueController = this.idValueController;
        return inputInternationalDbComponentM20701f;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final InputInternationalDbComponent m20704D(@Nullable String value) {
        InputInternationalDbComponent inputInternationalDbComponentM20701f = m20701f(this, null, null, null, value, null, null, false, false, null, null, null, null, System.currentTimeMillis(), 4087, null);
        inputInternationalDbComponentM20701f.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentM20701f.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentM20701f.idValueController = this.idValueController;
        return inputInternationalDbComponentM20701f;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InputInternationalDbComponent m20705a(@NotNull String name, @Nullable String selectedCountry, @Nullable String selectedIdType, @Nullable String idValue, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, boolean hideCountryField, boolean hideIdTypeField, @Nullable Boolean hideCountryIfSingleChoice, @Nullable Boolean hideTypeIfSingleChoice, @Nullable List<InputInternationalDb.IdType> allowedIdTypes, @Nullable InputSelectComponentStyle inputSelectStyle, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputInternationalDbComponent(name, selectedCountry, selectedIdType, idValue, hidden, disabled, hideCountryField, hideIdTypeField, hideCountryIfSingleChoice, hideTypeIfSingleChoice, allowedIdTypes, inputSelectStyle, lastValueUpdateTs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputInternationalDbComponent)) {
            return false;
        }
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) other;
        return Intrinsics.m31980c(this.name, inputInternationalDbComponent.name) && Intrinsics.m31980c(this.selectedCountry, inputInternationalDbComponent.selectedCountry) && Intrinsics.m31980c(this.selectedIdType, inputInternationalDbComponent.selectedIdType) && Intrinsics.m31980c(this.idValue, inputInternationalDbComponent.idValue) && Intrinsics.m31980c(this.hidden, inputInternationalDbComponent.hidden) && Intrinsics.m31980c(this.disabled, inputInternationalDbComponent.disabled) && this.hideCountryField == inputInternationalDbComponent.hideCountryField && this.hideIdTypeField == inputInternationalDbComponent.hideIdTypeField && Intrinsics.m31980c(this.hideCountryIfSingleChoice, inputInternationalDbComponent.hideCountryIfSingleChoice) && Intrinsics.m31980c(this.hideTypeIfSingleChoice, inputInternationalDbComponent.hideTypeIfSingleChoice) && Intrinsics.m31980c(this.allowedIdTypes, inputInternationalDbComponent.allowedIdTypes) && Intrinsics.m31980c(this.inputSelectStyle, inputInternationalDbComponent.inputSelectStyle) && this.lastValueUpdateTs == inputInternationalDbComponent.lastValueUpdateTs;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final List<InputInternationalDb.IdType> m20706g() {
        return this.allowedIdTypes;
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
        String str = this.selectedCountry;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedIdType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idValue;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode5 = (iHashCode4 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode6 = (((((iHashCode5 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31) + Boolean.hashCode(this.hideCountryField)) * 31) + Boolean.hashCode(this.hideIdTypeField)) * 31;
        Boolean bool = this.hideCountryIfSingleChoice;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hideTypeIfSingleChoice;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<InputInternationalDb.IdType> list = this.allowedIdTypes;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.inputSelectStyle;
        return ((iHashCode9 + (inputSelectComponentStyle != null ? inputSelectComponentStyle.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.InterfaceC4341x
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<InterfaceC8649a> mo20534i() {
        return this.associatedViews;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final List<CountryOption> m20707j() {
        return this.countryOptions;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final C5204m getCountryOptionsController() {
        return this.countryOptionsController;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC4337w1 getCountrySelectComponent() {
        return this.countrySelectComponent;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getHideCountryField() {
        return this.hideCountryField;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getHideCountryIfSingleChoice() {
        return this.hideCountryIfSingleChoice;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getHideIdTypeField() {
        return this.hideIdTypeField;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getHideTypeIfSingleChoice() {
        return this.hideTypeIfSingleChoice;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final List<IdOption> m20714r() {
        Map<String, ? extends List<IdOption>> map = this.typesByCountryCode;
        if (map != null) {
            return map.get(this.selectedCountry);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final C5204m getIdTypeOptionsController() {
        return this.idTypeOptionsController;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final InterfaceC4337w1 m20716t() {
        List<IdOption> listM20714r = m20714r();
        if (listM20714r == null) {
            return null;
        }
        return new C4055g(listM20714r);
    }

    @NotNull
    public String toString() {
        return "InputInternationalDbComponent(name=" + this.name + ", selectedCountry=" + this.selectedCountry + ", selectedIdType=" + this.selectedIdType + ", idValue=" + this.idValue + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", hideCountryField=" + this.hideCountryField + ", hideIdTypeField=" + this.hideIdTypeField + ", hideCountryIfSingleChoice=" + this.hideCountryIfSingleChoice + ", hideTypeIfSingleChoice=" + this.hideTypeIfSingleChoice + ", allowedIdTypes=" + this.allowedIdTypes + ", inputSelectStyle=" + this.inputSelectStyle + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getIdValue() {
        return this.idValue;
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final InterfaceC0389r getIdValueController() {
        return this.idValueController;
    }

    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public final InputSelectComponentStyle getInputSelectStyle() {
        return this.inputSelectStyle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.selectedCountry);
        dest.writeString(this.selectedIdType);
        dest.writeString(this.idValue);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeInt(this.hideCountryField ? 1 : 0);
        dest.writeInt(this.hideIdTypeField ? 1 : 0);
        Boolean bool = this.hideCountryIfSingleChoice;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hideTypeIfSingleChoice;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<InputInternationalDb.IdType> list = this.allowedIdTypes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<InputInternationalDb.IdType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        dest.writeParcelable(this.inputSelectStyle, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getSelectedCountry() {
        return this.selectedCountry;
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getSelectedIdType() {
        return this.selectedIdType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
      (r18v0 java.lang.String)
      (r19v0 java.lang.String)
      (r20v0 java.lang.String)
      (r21v0 java.lang.String)
      (r22v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r23v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
      (r24v0 boolean)
      (r25v0 boolean)
      (r26v0 java.lang.Boolean)
      (r27v0 java.lang.Boolean)
      (r28v0 java.util.List)
      (r29v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle)
      (wrap long:?: TERNARY null = ((wrap int:0x0002: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
     A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, boolean, boolean, java.lang.Boolean, java.lang.Boolean, java.util.List<com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb$IdType>, com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle, long):void (m)] (LINE:48) call: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, boolean, boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle, long):void type: THIS */
    public /* synthetic */ InputInternationalDbComponent(String str, String str2, String str3, String str4, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, boolean z10, boolean z11, Boolean bool, Boolean bool2, List list, InputSelectComponentStyle inputSelectComponentStyle, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, jsonLogicBoolean, jsonLogicBoolean2, z10, z11, bool, bool2, list, inputSelectComponentStyle, (i10 & 4096) != 0 ? 0L : j10);
    }
}
