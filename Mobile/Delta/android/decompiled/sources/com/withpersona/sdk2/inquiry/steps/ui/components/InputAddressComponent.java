package com.withpersona.sdk2.inquiry.steps.ui.components;

import an.r;
import an.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import cr.e0;
import cr.o;
import cr.x;
import er.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b5\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001?B\u009f\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b#\u0010\"J\u0019\u0010$\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b$\u0010\"J\u0019\u0010%\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b%\u0010\"J\u0019\u0010&\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b&\u0010\"J\u0019\u0010'\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b'\u0010\"J\u001f\u0010(\u001a\u00020\u00002\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b+\u0010\"J\u0019\u0010,\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b,\u0010\u001fJ\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020-¢\u0006\u0004\b4\u00105Jº\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020-HÖ\u0001¢\u0006\u0004\b:\u0010/J\u001a\u0010=\u001a\u00020\u00162\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u00109R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010@\u001a\u0004\bC\u00109\"\u0004\bD\u0010ER\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u00109\"\u0004\bH\u0010ER\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010@\u001a\u0004\bJ\u00109\"\u0004\bK\u0010ER\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010@\u001a\u0004\bM\u00109\"\u0004\bN\u0010ER\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010@\u001a\u0004\bP\u00109\"\u0004\bQ\u0010ER\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R$\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010@\u001a\u0004\b\\\u00109\"\u0004\b]\u0010ER*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010@\u001a\u0004\bd\u00109\"\u0004\be\u0010ER$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010g\u001a\u0004\bm\u0010i\"\u0004\bn\u0010kR\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010m\u001a\u0004\bo\u0010pR&\u0010u\u001a\b\u0012\u0004\u0012\u00020r0q8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010^\u0012\u0004\bs\u0010t\u001a\u0004\bX\u0010`R(\u0010}\u001a\u00020v8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b!\u0010w\u0012\u0004\b|\u0010t\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R-\u0010\u0084\u0001\u001a\u00020~8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\bx\u0010\u007f\u0012\u0005\b\u0083\u0001\u0010t\u001a\u0005\bf\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R-\u0010\u0087\u0001\u001a\u00020~8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b%\u0010\u007f\u0012\u0005\b\u0086\u0001\u0010t\u001a\u0005\bl\u0010\u0080\u0001\"\u0006\b\u0085\u0001\u0010\u0082\u0001R-\u0010\u008a\u0001\u001a\u00020~8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\b6\u0010\u007f\u0012\u0005\b\u0089\u0001\u0010t\u001a\u0005\b?\u0010\u0080\u0001\"\u0006\b\u0088\u0001\u0010\u0082\u0001R.\u0010\u008e\u0001\u001a\u00020~8\u0016@\u0016X\u0097\u000e¢\u0006\u001d\n\u0005\b\u008b\u0001\u0010\u007f\u0012\u0005\b\u008d\u0001\u0010t\u001a\u0005\bR\u0010\u0080\u0001\"\u0006\b\u008c\u0001\u0010\u0082\u0001R-\u0010\u0091\u0001\u001a\u00020~8\u0016@\u0016X\u0097\u000e¢\u0006\u001c\n\u0004\bZ\u0010\u007f\u0012\u0005\b\u0090\u0001\u0010t\u001a\u0005\bO\u0010\u0080\u0001\"\u0006\b\u008f\u0001\u0010\u0082\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcr/b;", "Lcr/o;", "Lcr/x;", "", "name", "street1", "street2", "city", "subdivision", "postalCode", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Ler/b;", "autocompleteMethod", "searchQuery", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "searchResults", "selectedSearchResultId", "", "isAddressAutocompleteLoading", "isAddressComponentsCollapsed", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ler/b;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;J)V", "newState", "o", "(Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "newString", "q", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "j", "k", "s", "p", "T", "U", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "resultId", "V", "S", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ler/b;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "D", "setStreet1", "(Ljava/lang/String;)V", "c", "E", "setStreet2", "d", "w", "setCity", "e", "G", "setSubdivision", "f", "x", "setPostalCode", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "h", "getDisabled", "i", "Ler/b;", "v", "()Ler/b;", "z", "setSearchQuery", "Ljava/util/List;", "A", "()Ljava/util/List;", "setSearchResults", "(Ljava/util/List;)V", "l", "C", "setSelectedSearchResultId", "m", "Ljava/lang/Boolean;", "I", "()Ljava/lang/Boolean;", "setAddressAutocompleteLoading", "(Ljava/lang/Boolean;)V", "n", "J", "K", "R0", "()J", "", "Lmr/a;", "getAssociatedViews$annotations", "()V", "associatedViews", "Ler/p;", "Ler/p;", "r", "()Ler/p;", "L", "(Ler/p;)V", "isAddressFieldCollapsed$annotations", "isAddressFieldCollapsed", "Lan/r;", "Lan/r;", "()Lan/r;", "P", "(Lan/r;)V", "getTextControllerForAddressStreet1$annotations", "textControllerForAddressStreet1", "Q", "getTextControllerForAddressStreet2$annotations", "textControllerForAddressStreet2", "N", "getTextControllerForAddressCity$annotations", "textControllerForAddressCity", "u", "R", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressSubdivision", "O", "getTextControllerForAddressPostalCode$annotations", "textControllerForAddressPostalCode", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputAddressComponent implements UiComponent, cr.b, o, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String street1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String street2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String city;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String subdivision;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String postalCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final er.b autocompleteMethod;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String searchQuery;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public List<Suggestion> searchResults;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String selectedSearchResultId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Boolean isAddressAutocompleteLoading;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Boolean isAddressComponentsCollapsed;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<mr.a> associatedViews;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public p isAddressFieldCollapsed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public r textControllerForAddressStreet1;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public r textControllerForAddressStreet2;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public r textControllerForAddressCity;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public r textControllerForAddressSubdivision;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public r textControllerForAddressPostalCode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InputAddressComponent> CREATOR = new b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InputAddressComponent a(@NotNull InputAddress config) {
            String lowerCase;
            String prefillAddressStreet1;
            String prefillAddressStreet2;
            String prefillAddressCity;
            String prefillAddressSubdivision;
            String prefillAddressPostalCode;
            String addressAutocompleteMethod;
            Intrinsics.checkNotNullParameter(config, "config");
            InputAddress.Attributes attributes = config.getAttributes();
            if (attributes == null || (addressAutocompleteMethod = attributes.getAddressAutocompleteMethod()) == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = addressAutocompleteMethod.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            er.b bVar = Intrinsics.c(lowerCase, "google_maps") ? er.b.Server : er.b.None;
            String name = config.getName();
            if (attributes == null || (prefillAddressStreet1 = attributes.getPrefillAddressStreet1()) == null) {
                prefillAddressStreet1 = "";
            }
            if (attributes == null || (prefillAddressStreet2 = attributes.getPrefillAddressStreet2()) == null) {
                prefillAddressStreet2 = "";
            }
            if (attributes == null || (prefillAddressCity = attributes.getPrefillAddressCity()) == null) {
                prefillAddressCity = "";
            }
            if (attributes == null || (prefillAddressSubdivision = attributes.getPrefillAddressSubdivision()) == null) {
                prefillAddressSubdivision = "";
            }
            if (attributes == null || (prefillAddressPostalCode = attributes.getPrefillAddressPostalCode()) == null) {
                prefillAddressPostalCode = "";
            }
            return new InputAddressComponent(name, prefillAddressStreet1, prefillAddressStreet2, prefillAddressCity, prefillAddressSubdivision, prefillAddressPostalCode, attributes != null ? attributes.getHidden() : null, attributes != null ? attributes.getDisabled() : null, bVar, null, null, null, null, Boolean.valueOf(e0.e(config) && bVar != er.b.None), 0L, 24064, null);
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InputAddressComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputAddressComponent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
            er.b bVarValueOf = er.b.valueOf(parcel.readString());
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Suggestion.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputAddressComponent(string, string2, string3, string4, string5, string6, jsonLogicBoolean, jsonLogicBoolean2, bVarValueOf, string7, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InputAddressComponent[] newArray(int i10) {
            return new InputAddressComponent[i10];
        }
    }

    public InputAddressComponent(@NotNull String name, @NotNull String street1, @NotNull String street2, @NotNull String city, @NotNull String subdivision, @NotNull String postalCode, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @NotNull er.b autocompleteMethod, @Nullable String str, @Nullable List<Suggestion> list, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(street1, "street1");
        Intrinsics.checkNotNullParameter(street2, "street2");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(subdivision, "subdivision");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(autocompleteMethod, "autocompleteMethod");
        this.name = name;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.subdivision = subdivision;
        this.postalCode = postalCode;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autocompleteMethod = autocompleteMethod;
        this.searchQuery = str;
        this.searchResults = list;
        this.selectedSearchResultId = str2;
        this.isAddressAutocompleteLoading = bool;
        this.isAddressComponentsCollapsed = bool2;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
        Boolean bool3 = this.isAddressComponentsCollapsed;
        this.isAddressFieldCollapsed = new p(bool3 != null ? bool3.booleanValue() : true);
        this.textControllerForAddressStreet1 = u.a(this.street1);
        this.textControllerForAddressStreet2 = u.a(this.street2);
        this.textControllerForAddressCity = u.a(this.city);
        this.textControllerForAddressSubdivision = u.a(this.subdivision);
        this.textControllerForAddressPostalCode = u.a(this.postalCode);
    }

    @g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressCity$annotations() {
    }

    @g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressPostalCode$annotations() {
    }

    @g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet1$annotations() {
    }

    @g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet2$annotations() {
    }

    @g(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressSubdivision$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputAddressComponent u(InputAddressComponent inputAddressComponent, String str, String str2, String str3, String str4, String str5, String str6, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, er.b bVar, String str7, List list, String str8, Boolean bool, Boolean bool2, long j10, int i10, Object obj) {
        long j11;
        String str9;
        String str10 = (i10 & 1) != 0 ? inputAddressComponent.name : str;
        String str11 = (i10 & 2) != 0 ? inputAddressComponent.street1 : str2;
        String str12 = (i10 & 4) != 0 ? inputAddressComponent.street2 : str3;
        String str13 = (i10 & 8) != 0 ? inputAddressComponent.city : str4;
        String str14 = (i10 & 16) != 0 ? inputAddressComponent.subdivision : str5;
        String str15 = (i10 & 32) != 0 ? inputAddressComponent.postalCode : str6;
        JsonLogicBoolean jsonLogicBoolean3 = (i10 & 64) != 0 ? inputAddressComponent.hidden : jsonLogicBoolean;
        JsonLogicBoolean jsonLogicBoolean4 = (i10 & 128) != 0 ? inputAddressComponent.disabled : jsonLogicBoolean2;
        er.b bVar2 = (i10 & Barcode.FORMAT_QR_CODE) != 0 ? inputAddressComponent.autocompleteMethod : bVar;
        String str16 = (i10 & Barcode.FORMAT_UPC_A) != 0 ? inputAddressComponent.searchQuery : str7;
        List list2 = (i10 & Barcode.FORMAT_UPC_E) != 0 ? inputAddressComponent.searchResults : list;
        String str17 = (i10 & Barcode.FORMAT_PDF417) != 0 ? inputAddressComponent.selectedSearchResultId : str8;
        Boolean bool3 = (i10 & Barcode.FORMAT_AZTEC) != 0 ? inputAddressComponent.isAddressAutocompleteLoading : bool;
        Boolean bool4 = (i10 & 8192) != 0 ? inputAddressComponent.isAddressComponentsCollapsed : bool2;
        if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str9 = str10;
            j11 = inputAddressComponent.lastValueUpdateTs;
        } else {
            j11 = j10;
            str9 = str10;
        }
        return inputAddressComponent.t(str9, str11, str12, str13, str14, str15, jsonLogicBoolean3, jsonLogicBoolean4, bVar2, str16, list2, str17, bool3, bool4, j11);
    }

    @Nullable
    public final List<Suggestion> A() {
        return this.searchResults;
    }

    @Nullable
    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getSelectedSearchResultId() {
        return this.selectedSearchResultId;
    }

    @NotNull
    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getStreet1() {
        return this.street1;
    }

    @NotNull
    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getStreet2() {
        return this.street2;
    }

    @NotNull
    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getSubdivision() {
        return this.subdivision;
    }

    @Nullable
    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getIsAddressAutocompleteLoading() {
        return this.isAddressAutocompleteLoading;
    }

    @Nullable
    /* JADX INFO: renamed from: J, reason: from getter */
    public final Boolean getIsAddressComponentsCollapsed() {
        return this.isAddressComponentsCollapsed;
    }

    public final void K(@Nullable Boolean bool) {
        this.isAddressComponentsCollapsed = bool;
    }

    public void L(@NotNull p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.isAddressFieldCollapsed = pVar;
    }

    public void N(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressCity = rVar;
    }

    public void O(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressPostalCode = rVar;
    }

    public void P(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressStreet1 = rVar;
    }

    public void Q(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressStreet2 = rVar;
    }

    public void R(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<set-?>");
        this.textControllerForAddressSubdivision = rVar;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @NotNull
    public InputAddressComponent S(@Nullable Boolean isAddressAutocompleteLoading) {
        return e0.f(u(this, null, null, null, null, null, null, null, null, null, null, null, null, isAddressAutocompleteLoading, null, System.currentTimeMillis(), 12287, null), this);
    }

    @NotNull
    public InputAddressComponent T(@Nullable String searchQuery) {
        return e0.f(u(this, null, null, null, null, null, null, null, null, null, searchQuery, null, null, null, null, System.currentTimeMillis(), 15871, null), this);
    }

    @NotNull
    public InputAddressComponent U(@Nullable List<Suggestion> searchResults) {
        return e0.f(u(this, null, null, null, null, null, null, null, null, null, null, searchResults, null, null, null, System.currentTimeMillis(), 15359, null), this);
    }

    @NotNull
    public InputAddressComponent V(@Nullable String resultId) {
        return e0.f(u(this, null, null, null, null, null, null, null, null, null, null, null, resultId, null, null, System.currentTimeMillis(), 14335, null), this);
    }

    @Override // cr.b
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public r getTextControllerForAddressCity() {
        return this.textControllerForAddressCity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputAddressComponent)) {
            return false;
        }
        InputAddressComponent inputAddressComponent = (InputAddressComponent) other;
        return Intrinsics.c(this.name, inputAddressComponent.name) && Intrinsics.c(this.street1, inputAddressComponent.street1) && Intrinsics.c(this.street2, inputAddressComponent.street2) && Intrinsics.c(this.city, inputAddressComponent.city) && Intrinsics.c(this.subdivision, inputAddressComponent.subdivision) && Intrinsics.c(this.postalCode, inputAddressComponent.postalCode) && Intrinsics.c(this.hidden, inputAddressComponent.hidden) && Intrinsics.c(this.disabled, inputAddressComponent.disabled) && this.autocompleteMethod == inputAddressComponent.autocompleteMethod && Intrinsics.c(this.searchQuery, inputAddressComponent.searchQuery) && Intrinsics.c(this.searchResults, inputAddressComponent.searchResults) && Intrinsics.c(this.selectedSearchResultId, inputAddressComponent.selectedSearchResultId) && Intrinsics.c(this.isAddressAutocompleteLoading, inputAddressComponent.isAddressAutocompleteLoading) && Intrinsics.c(this.isAddressComponentsCollapsed, inputAddressComponent.isAddressComponentsCollapsed) && this.lastValueUpdateTs == inputAddressComponent.lastValueUpdateTs;
    }

    @Override // cr.b
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public r getTextControllerForAddressPostalCode() {
        return this.textControllerForAddressPostalCode;
    }

    @Override // cr.b
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public r getTextControllerForAddressSubdivision() {
        return this.textControllerForAddressSubdivision;
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
        int iHashCode = ((((((((((this.name.hashCode() * 31) + this.street1.hashCode()) * 31) + this.street2.hashCode()) * 31) + this.city.hashCode()) * 31) + this.subdivision.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (((iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31) + this.autocompleteMethod.hashCode()) * 31;
        String str = this.searchQuery;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<Suggestion> list = this.searchResults;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.selectedSearchResultId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAddressAutocompleteLoading;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAddressComponentsCollapsed;
        return ((iHashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // cr.x
    @NotNull
    public List<mr.a> i() {
        return this.associatedViews;
    }

    @Override // cr.b
    @NotNull
    public InputAddressComponent j(@Nullable String newString) {
        return e0.f(u(this, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, null, null, System.currentTimeMillis(), 16379, null), this);
    }

    @Override // cr.b
    @NotNull
    public InputAddressComponent k(@Nullable String newString) {
        return e0.f(u(this, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, null, System.currentTimeMillis(), 16375, null), this);
    }

    @Override // cr.b
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public r getTextControllerForAddressStreet1() {
        return this.textControllerForAddressStreet1;
    }

    @Override // cr.b
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public r getTextControllerForAddressStreet2() {
        return this.textControllerForAddressStreet2;
    }

    @Override // cr.b
    @NotNull
    public InputAddressComponent o(@Nullable Boolean newState) {
        return e0.f(u(this, null, null, null, null, null, null, null, null, null, null, null, null, null, newState, System.currentTimeMillis(), 8191, null), this);
    }

    @Override // cr.b
    @NotNull
    public InputAddressComponent p(@Nullable String newString) {
        return e0.f(u(this, null, null, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, System.currentTimeMillis(), 16351, null), this);
    }

    @Override // cr.b
    @NotNull
    public InputAddressComponent q(@Nullable String newString) {
        return e0.f(u(this, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, null, null, null, System.currentTimeMillis(), 16381, null), this);
    }

    @Override // cr.b
    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public p getIsAddressFieldCollapsed() {
        return this.isAddressFieldCollapsed;
    }

    @Override // cr.b
    @NotNull
    public InputAddressComponent s(@Nullable String newString) {
        return e0.f(u(this, null, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, System.currentTimeMillis(), 16367, null), this);
    }

    @NotNull
    public final InputAddressComponent t(@NotNull String name, @NotNull String street1, @NotNull String street2, @NotNull String city, @NotNull String subdivision, @NotNull String postalCode, @Nullable JsonLogicBoolean hidden, @Nullable JsonLogicBoolean disabled, @NotNull er.b autocompleteMethod, @Nullable String searchQuery, @Nullable List<Suggestion> searchResults, @Nullable String selectedSearchResultId, @Nullable Boolean isAddressAutocompleteLoading, @Nullable Boolean isAddressComponentsCollapsed, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(street1, "street1");
        Intrinsics.checkNotNullParameter(street2, "street2");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(subdivision, "subdivision");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(autocompleteMethod, "autocompleteMethod");
        return new InputAddressComponent(name, street1, street2, city, subdivision, postalCode, hidden, disabled, autocompleteMethod, searchQuery, searchResults, selectedSearchResultId, isAddressAutocompleteLoading, isAddressComponentsCollapsed, lastValueUpdateTs);
    }

    @NotNull
    public String toString() {
        return "InputAddressComponent(name=" + this.name + ", street1=" + this.street1 + ", street2=" + this.street2 + ", city=" + this.city + ", subdivision=" + this.subdivision + ", postalCode=" + this.postalCode + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", autocompleteMethod=" + this.autocompleteMethod + ", searchQuery=" + this.searchQuery + ", searchResults=" + this.searchResults + ", selectedSearchResultId=" + this.selectedSearchResultId + ", isAddressAutocompleteLoading=" + this.isAddressAutocompleteLoading + ", isAddressComponentsCollapsed=" + this.isAddressComponentsCollapsed + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final er.b getAutocompleteMethod() {
        return this.autocompleteMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.street1);
        dest.writeString(this.street2);
        dest.writeString(this.city);
        dest.writeString(this.subdivision);
        dest.writeString(this.postalCode);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.autocompleteMethod.name());
        dest.writeString(this.searchQuery);
        List<Suggestion> list = this.searchResults;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Suggestion> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.selectedSearchResultId);
        Boolean bool = this.isAddressAutocompleteLoading;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isAddressComponentsCollapsed;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeLong(this.lastValueUpdateTs);
    }

    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public /* synthetic */ InputAddressComponent(String str, String str2, String str3, String str4, String str5, String str6, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, er.b bVar, String str7, List list, String str8, Boolean bool, Boolean bool2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, jsonLogicBoolean, jsonLogicBoolean2, bVar, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : str7, (i10 & Barcode.FORMAT_UPC_E) != 0 ? null : list, (i10 & Barcode.FORMAT_PDF417) != 0 ? null : str8, (i10 & Barcode.FORMAT_AZTEC) != 0 ? null : bool, (i10 & 8192) != 0 ? null : bool2, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0L : j10);
    }
}
