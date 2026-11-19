package com.withpersona.sdk2.inquiry.ui.network;

import android.content.ContentResolver;
import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import hn.i;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mv.b0;
import mv.c0;
import mv.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.j0;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;
import zt.l;

/* JADX INFO: loaded from: classes3.dex */
@p001kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "data", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;)V", BuildConfig.FLAVOR, "inquiryId", "Landroid/content/ContentResolver;", "contentResolver", BuildConfig.FLAVOR, "Lmv/c0$c;", "c", "(Ljava/lang/String;Landroid/content/ContentResolver;)Ljava/util/List;", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "b", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "Data", "Attributes", "Meta", "FieldMapping", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class TransitionInquiryRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Data data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Meta meta;

    @p001kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Map<String, ComponentParam> componentParams;

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(@Nullable Map<String, ? extends ComponentParam> map) {
            this.componentParams = map;
        }

        @Nullable
        public final Map<String, ComponentParam> a() {
            return this.componentParams;
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "attributes", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "()Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Attributes attributes;

        public Data(@NotNull Attributes attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.attributes = attributes;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Attributes getAttributes() {
            return this.attributes;
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sourceFieldName", "destinationFieldName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class FieldMapping {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String sourceFieldName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String destinationFieldName;

        public FieldMapping(@NotNull String sourceFieldName, @NotNull String destinationFieldName) {
            Intrinsics.checkNotNullParameter(sourceFieldName, "sourceFieldName");
            Intrinsics.checkNotNullParameter(destinationFieldName, "destinationFieldName");
            this.sourceFieldName = sourceFieldName;
            this.destinationFieldName = destinationFieldName;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDestinationFieldName() {
            return this.destinationFieldName;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSourceFieldName() {
            return this.sourceFieldName;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest$a, reason: from kotlin metadata */
    @p001kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lqr/x5;", "fromComponent", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "shareToken", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;", "fieldMappings", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "a", "(Lqr/x5;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransitionInquiryRequest a(@NotNull x5 fromComponent, @NotNull Map<String, ? extends ComponentParam> componentParams, @NotNull String fromStep, @Nullable String shareToken, @NotNull List<FieldMapping> fieldMappings) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(componentParams, "componentParams");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldMappings, "fieldMappings");
            Data data = new Data(new Attributes(componentParams));
            String name = fromComponent.getName();
            if (shareToken == null || shareToken.length() <= 0) {
                shareToken = null;
            }
            if (fieldMappings.isEmpty()) {
                fieldMappings = null;
            }
            return new TransitionInquiryRequest(data, new Meta(name, fromStep, shareToken, fieldMappings));
        }

        public Companion() {
        }
    }

    @p001kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11465a;

        static {
            int[] iArr = new int[eq.a.values().length];
            try {
                iArr[eq.a.NotRequested.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eq.a.NotSupported.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eq.a.Failed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eq.a.Success.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11465a = iArr;
        }
    }

    public TransitionInquiryRequest(@NotNull Data data, @NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x04aa  */
    @NotNull
    public final List<c0.c> c(@NotNull String inquiryId, @Nullable ContentResolver contentResolver) throws FileNotFoundException {
        String str;
        byte[] bArrC;
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        ArrayList arrayList = new ArrayList();
        c0.c.Companion companion = c0.c.INSTANCE;
        arrayList.add(companion.b("data[id]", inquiryId));
        arrayList.add(companion.b("data[type]", "inquiry"));
        arrayList.add(companion.b("meta[fromComponent]", this.meta.getFromComponent()));
        arrayList.add(companion.b("meta[fromStep]", this.meta.getFromStep()));
        String shareToken = this.meta.getShareToken();
        if (shareToken != null) {
            arrayList.add(companion.b("meta[shareToken]", shareToken));
        }
        List<FieldMapping> listA = this.meta.a();
        if (listA != null) {
            int i10 = 0;
            for (Object obj : listA) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    p.t();
                }
                FieldMapping fieldMapping = (FieldMapping) obj;
                c0.c.Companion companion2 = c0.c.INSTANCE;
                arrayList.add(companion2.b("meta[fieldMappings][" + i10 + "][sourceFieldName]", fieldMapping.getSourceFieldName()));
                arrayList.add(companion2.b("meta[fieldMappings][" + i10 + "][destinationFieldName]", fieldMapping.getDestinationFieldName()));
                i10 = i11;
            }
        }
        Map<String, ComponentParam> mapA = this.data.getAttributes().a();
        if (mapA != null) {
            for (Map.Entry<String, ComponentParam> entry : mapA.entrySet()) {
                String key = entry.getKey();
                ComponentParam value = entry.getValue();
                String str2 = "data[attributes][componentParams][" + key + "]";
                if (value instanceof ComponentParam.d) {
                    arrayList.add(c0.c.INSTANCE.b(str2, ((ComponentParam.d) value).getValue()));
                } else {
                    boolean z10 = value instanceof ComponentParam.e;
                    String str3 = BuildConfig.FLAVOR;
                    if (z10) {
                        ComponentParam.e eVar = (ComponentParam.e) value;
                        if (eVar.a().isEmpty()) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[]", BuildConfig.FLAVOR));
                        } else {
                            for (String str4 : eVar.a()) {
                                arrayList.add(c0.c.INSTANCE.b(str2 + "[]", str4));
                            }
                        }
                    } else if (value instanceof ComponentParam.b) {
                        arrayList.add(c0.c.INSTANCE.b(str2, String.valueOf(((ComponentParam.b) value).getValue())));
                    } else if (value instanceof ComponentParam.c) {
                        arrayList.add(c0.c.INSTANCE.b(str2, ((ComponentParam.c) value).getValue().toString()));
                    } else if (value instanceof ComponentParam.a) {
                        ComponentParam.a aVar = (ComponentParam.a) value;
                        String street1 = aVar.getStreet1();
                        if (street1 != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[street_1]", street1));
                        }
                        String street2 = aVar.getStreet2();
                        if (street2 != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[street_2]", street2));
                        }
                        String city = aVar.getCity();
                        if (city != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[city]", city));
                        }
                        String subdivision = aVar.getSubdivision();
                        if (subdivision != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[subdivision]", subdivision));
                        }
                        String postalCode = aVar.getPostalCode();
                        if (postalCode != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[postal_code]", postalCode));
                        }
                    } else if (value instanceof ComponentParam.f) {
                        String signatureImageString = ((ComponentParam.f) value).getSignatureImageString();
                        if (signatureImageString != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2, signatureImageString));
                        }
                    } else if (value instanceof ComponentParam.h) {
                        ComponentParam.h hVar = (ComponentParam.h) value;
                        eq.a chipAuthenticationStatus = hVar.getChipAuthenticationStatus();
                        if (chipAuthenticationStatus != null) {
                            int i12 = b.f11465a[chipAuthenticationStatus.ordinal()];
                            if (i12 == 1) {
                                str = "notRequested";
                            } else if (i12 == 2) {
                                str = "notSupported";
                            } else if (i12 == 3) {
                                str = "failed";
                            } else {
                                if (i12 != 4) {
                                    throw new l();
                                }
                                str = "success";
                            }
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[caFlag]", str));
                        }
                        String dg1 = hVar.getDg1();
                        if (dg1 != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[dg1]", dg1));
                        }
                        String dg2 = hVar.getDg2();
                        if (dg2 != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[dg2]", dg2));
                        }
                        String sod = hVar.getSod();
                        if (sod != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[sod]", sod));
                        }
                    } else if (value instanceof ComponentParam.j) {
                        Map<String, String> mapA2 = ((ComponentParam.j) value).a();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry2 : mapA2.entrySet()) {
                            if (entry2.getValue().length() > 0) {
                                linkedHashMap.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        for (Map.Entry entry3 : j0.i(linkedHashMap).entrySet()) {
                            String str5 = (String) entry3.getKey();
                            String str6 = (String) entry3.getValue();
                            Intrinsics.checkNotNull(str6);
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[" + str5 + "]", str6));
                        }
                    } else if (value instanceof ComponentParam.i) {
                        ComponentParam.i iVar = (ComponentParam.i) value;
                        String country = iVar.getCountry();
                        if (country != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[idb_country]", country));
                        }
                        String str7 = iVar.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String();
                        if (str7 != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[idb_type]", str7));
                        }
                        String value2 = iVar.getValue();
                        if (value2 != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[idb_value]", value2));
                        }
                    } else if (value instanceof ComponentParam.k) {
                        ComponentParam.k kVar = (ComponentParam.k) value;
                        String code = kVar.getCode();
                        if (code != null) {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[code]", code));
                        }
                        String errorName = kVar.getErrorName();
                        if (errorName != null) {
                            c0.c.Companion companion3 = c0.c.INSTANCE;
                            arrayList.add(companion3.b(str2 + "[error][name]", errorName));
                            String str8 = str2 + "[error][message]";
                            String errorMessage = kVar.getErrorMessage();
                            if (errorMessage != null) {
                                str3 = errorMessage;
                            }
                            arrayList.add(companion3.b(str8, str3));
                        }
                    } else {
                        if (!(value instanceof ComponentParam.g)) {
                            throw new l();
                        }
                        ComponentParam.g gVar = (ComponentParam.g) value;
                        if (!gVar.f().isEmpty() && contentResolver != null) {
                            for (Uri uri : gVar.f()) {
                                String type = contentResolver.getType(uri);
                                if (type == null) {
                                    type = "application/octet-stream";
                                }
                                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        bArrC = lu.b.c(inputStreamOpenInputStream);
                                        lu.c.a(inputStreamOpenInputStream, null);
                                        if (bArrC == null) {
                                            bArrC = new byte[0];
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            lu.c.a(inputStreamOpenInputStream, th2);
                                            throw th3;
                                        }
                                    }
                                } else {
                                    bArrC = new byte[0];
                                }
                                g0 g0VarL = g0.Companion.l(g0.INSTANCE, bArrC, b0.INSTANCE.b(type), 0, 0, 6, null);
                                String lastPathSegment = uri.getLastPathSegment();
                                if (lastPathSegment == null) {
                                    lastPathSegment = "file";
                                }
                                arrayList.add(c0.c.INSTANCE.c(str2 + "[]", lastPathSegment, g0VarL));
                            }
                        } else if (gVar.getHasPrefill()) {
                            arrayList.add(c0.c.INSTANCE.b(str2, "USE PREVIOUS FILE"));
                        } else {
                            arrayList.add(c0.c.INSTANCE.b(str2 + "[]", BuildConfig.FLAVOR));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @p001kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "fromComponent", "fromStep", "shareToken", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;", "fieldMappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class Meta {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String shareToken;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final List<FieldMapping> fieldMappings;

        public Meta(@NotNull String fromComponent, @NotNull String fromStep, @Nullable String str, @Nullable List<FieldMapping> list) {
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.shareToken = str;
            this.fieldMappings = list;
        }

        @Nullable
        public final List<FieldMapping> a() {
            return this.fieldMappings;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getShareToken() {
            return this.shareToken;
        }

        public /* synthetic */ Meta(String str, String str2, String str3, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : list);
        }
    }
}
