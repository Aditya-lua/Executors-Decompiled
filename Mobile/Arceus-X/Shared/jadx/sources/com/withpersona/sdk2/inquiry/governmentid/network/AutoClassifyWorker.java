package com.withpersona.sdk2.inquiry.governmentid.network;

import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.governmentid.C3541d;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p132fn.C5712u0;
import p229jt.C7348o;
import p231jv.C7396x;
import p256ku.C7864g1;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p420rq.InterfaceC11067a;
import p471um.InterfaceC11874i;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0004\u0018\u001a78BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001f*\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lvr/h;", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", NotificationCompat.CATEGORY_SERVICE, "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "governmentId", "Lrq/a;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lrq/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)V", "otherWorker", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "p", "(Ljava/util/List;)Ljava/util/List;", "Ljava/lang/String;", "d", "e", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "h", "Lrq/a;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "j", "J", "k", "Z", "Lfn/u0;", "l", "Lfn/u0;", "idFrontAnalyzer", "a", "SupplementaryData", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class AutoClassifyWorker implements InterfaceC13222o<InterfaceC3564c>, InterfaceC12257h<InterfaceC3564c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC3570b service;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final GovernmentId governmentId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11067a imageHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final SupplementaryData supplementaryData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final long defaultManualCaptureDelayMs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean extractTextFromImage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C5712u0 idFrontAnalyzer;

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "", "<init>", "()V", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class SupplementaryData {
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3562a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$a */
        @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "idConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;)V", "a", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a implements InterfaceC3562a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final String countryCode;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final IdConfig idConfig;

            public a(@NotNull String countryCode, @NotNull IdConfig idConfig) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(idConfig, "idConfig");
                this.countryCode = countryCode;
                this.idConfig = idConfig;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final IdConfig getIdConfig() {
                return this.idConfig;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$b */
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC3562a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final List<IdConfigForCountry> idClassesPerCountry;

            public b(@NotNull List<IdConfigForCountry> idClassesPerCountry) {
                Intrinsics.checkNotNullParameter(idClassesPerCountry, "idClassesPerCountry");
                this.idClassesPerCountry = idClassesPerCountry;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<IdConfigForCountry> m17701a() {
                return this.idClassesPerCountry;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$c */
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class c implements InterfaceC3562a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final List<IdConfigForCountry> idClassesPerCountry;

            public c(@NotNull List<IdConfigForCountry> idClassesPerCountry) {
                Intrinsics.checkNotNullParameter(idClassesPerCountry, "idClassesPerCountry");
                this.idClassesPerCountry = idClassesPerCountry;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<IdConfigForCountry> m17702a() {
                return this.idClassesPerCountry;
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$b */
    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", NotificationCompat.CATEGORY_SERVICE, "Lrq/a;", "imageHelper", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lrq/a;)V", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "governmentId", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "b", "Lrq/a;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3563b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC3570b service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC11067a imageHelper;

        public C3563b(@NotNull InterfaceC3570b service, @NotNull InterfaceC11067a imageHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
            this.service = service;
            this.imageHelper = imageHelper;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AutoClassifyWorker m17703a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull GovernmentId governmentId, @NotNull SupplementaryData supplementaryData, long defaultManualCaptureDelayMs, boolean extractTextFromImage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(governmentId, "governmentId");
            Intrinsics.checkNotNullParameter(supplementaryData, "supplementaryData");
            return new AutoClassifyWorker(sessionToken, inquiryId, fromStep, fromComponent, this.service, governmentId, this.imageHelper, supplementaryData, defaultManualCaptureDelayMs, extractTextFromImage);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "b", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3564c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a implements InterfaceC3564c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            public a(@NotNull InternalErrorInfo cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "autoClassificationResult", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b implements InterfaceC3564c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final InterfaceC3562a autoClassificationResult;

            public b(@NotNull InterfaceC3562a autoClassificationResult) {
                Intrinsics.checkNotNullParameter(autoClassificationResult, "autoClassificationResult");
                this.autoClassificationResult = autoClassificationResult;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC3562a getAutoClassificationResult() {
                return this.autoClassificationResult;
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$d */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1", m39664f = "AutoClassifyWorker.kt", m39665l = {94, 96, 140, 154, 160, 171, 180, 189, 195, 199}, m39666m = "invokeSuspend")
    public static final class C3565d extends AbstractC10351m implements Function2<InterfaceC9577i<? super InterfaceC3564c>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public int f14159A;

        /* JADX INFO: renamed from: B */
        public int f14160B;

        /* JADX INFO: renamed from: C */
        public int f14161C;

        /* JADX INFO: renamed from: D */
        public /* synthetic */ Object f14162D;

        /* JADX INFO: renamed from: t */
        public Object f14164t;

        /* JADX INFO: renamed from: u */
        public Object f14165u;

        /* JADX INFO: renamed from: v */
        public Object f14166v;

        /* JADX INFO: renamed from: w */
        public Object f14167w;

        /* JADX INFO: renamed from: x */
        public Object f14168x;

        /* JADX INFO: renamed from: y */
        public Object f14169y;

        /* JADX INFO: renamed from: z */
        public int f14170z;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2", m39664f = "AutoClassifyWorker.kt", m39665l = {141}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<AutoClassifyResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f14171t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ AutoClassifyWorker f14172u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ List<MultipartBody.Part> f14173v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AutoClassifyWorker autoClassifyWorker, List<MultipartBody.Part> list, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f14172u = autoClassifyWorker;
                this.f14173v = list;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f14172u, this.f14173v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f14171t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                InterfaceC3570b interfaceC3570b = this.f14172u.service;
                String str = this.f14172u.sessionToken;
                String str2 = this.f14172u.inquiryId;
                List<MultipartBody.Part> list = this.f14173v;
                SupplementaryData supplementaryData = this.f14172u.supplementaryData;
                this.f14171t = 1;
                Object objM17728b = interfaceC3570b.m17728b(str, str2, list, supplementaryData, this);
                return objM17728b == objM38805e ? objM38805e : objM17728b;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<AutoClassifyResponse>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public C3565d(InterfaceC9557b<? super C3565d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        /* JADX INFO: renamed from: r */
        public static final void m17706r(List<MultipartBody.Part> list, AutoClassifyWorker autoClassifyWorker, Frame frame) {
            String strM25887b;
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            list.add(companion.createFormData("data[attributes][image]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.INSTANCE.create(new File(frame.getAbsoluteFilePath()), MediaType.INSTANCE.parse(frame.getMimeType()))));
            if (!autoClassifyWorker.extractTextFromImage || (strM25887b = autoClassifyWorker.idFrontAnalyzer.m25887b(frame.getAbsoluteFilePath())) == null) {
                return;
            }
            list.add(companion.createFormData("data[attributes][client_extracted_text]", strM25887b));
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3565d c3565d = AutoClassifyWorker.this.new C3565d(interfaceC9557b);
            c3565d.f14162D = obj;
            return c3565d;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:20:0x0121  */
        /* JADX WARN: Code duplicated, block: B:23:0x0128  */
        /* JADX WARN: Code duplicated, block: B:73:0x00eb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:? A[PHI: r6 r9 r10 r11 r12
          PHI (r6v5 int) = (r6v4 int), (r6v6 int) binds: [B:12:0x0082, B:22:0x0126] A[DONT_GENERATE, DONT_INLINE]
          PHI (r9v2 java.util.Iterator) = (r9v1 java.util.Iterator), (r9v3 java.util.Iterator) binds: [B:12:0x0082, B:22:0x0126] A[DONT_GENERATE, DONT_INLINE]
          PHI (r10v1 com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker) = 
          (r10v0 com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker)
          (r10v2 com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker)
         binds: [B:12:0x0082, B:22:0x0126] A[DONT_GENERATE, DONT_INLINE]
          PHI (r11v1 java.lang.Iterable) = (r11v0 java.lang.Iterable), (r11v2 java.lang.Iterable) binds: [B:12:0x0082, B:22:0x0126] A[DONT_GENERATE, DONT_INLINE]
          PHI (r12v1 java.util.List) = (r12v0 java.util.List), (r12v2 java.util.List) binds: [B:12:0x0082, B:22:0x0126] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:0: B:13:0x00d2->B:76:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0121 -> B:21:0x0122). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f14162D
                nu.i r0 = (nu.InterfaceC9577i) r0
                java.lang.Object r1 = p344ot.C10047c.m38805e()
                int r2 = r14.f14161C
                r3 = 2
                r4 = 0
                r5 = 0
                switch(r2) {
                    case 0: goto L82;
                    case 1: goto L5d;
                    case 2: goto L48;
                    case 3: goto L3e;
                    case 4: goto L29;
                    case 5: goto L29;
                    case 6: goto L2d;
                    case 7: goto L2d;
                    case 8: goto L2d;
                    case 9: goto L2d;
                    case 10: goto L18;
                    default: goto L10;
                }
            L10:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L18:
                java.lang.Object r0 = r14.f14166v
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r0
                java.lang.Object r0 = r14.f14165u
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                java.lang.Object r0 = r14.f14164t
                java.util.List r0 = (java.util.List) r0
                p229jt.C7348o.m30470b(r15)
                goto L35a
            L29:
                java.lang.Object r2 = r14.f14167w
                com.withpersona.sdk2.inquiry.governmentid.IdConfig r2 = (com.withpersona.sdk2.inquiry.governmentid.IdConfig) r2
            L2d:
                java.lang.Object r2 = r14.f14166v
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse r2 = (com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse) r2
                java.lang.Object r2 = r14.f14165u
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                java.lang.Object r3 = r14.f14164t
                java.util.List r3 = (java.util.List) r3
                p229jt.C7348o.m30470b(r15)
                goto L325
            L3e:
                java.lang.Object r2 = r14.f14164t
                java.util.List r2 = (java.util.List) r2
                p229jt.C7348o.m30470b(r15)
                r3 = r2
                goto L1c4
            L48:
                java.lang.Object r0 = r14.f14168x
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r0 = r14.f14167w
                com.withpersona.sdk2.inquiry.governmentid.Frame r0 = (com.withpersona.sdk2.inquiry.governmentid.Frame) r0
                java.lang.Object r0 = r14.f14165u
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r14.f14164t
                java.util.List r0 = (java.util.List) r0
                p229jt.C7348o.m30470b(r15)
                goto L16a
            L5d:
                int r2 = r14.f14159A
                int r6 = r14.f14170z
                java.lang.Object r7 = r14.f14169y
                com.withpersona.sdk2.inquiry.governmentid.Frame r7 = (com.withpersona.sdk2.inquiry.governmentid.Frame) r7
                java.lang.Object r8 = r14.f14168x
                java.lang.Object r9 = r14.f14167w
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r14.f14166v
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r10 = (com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker) r10
                java.lang.Object r11 = r14.f14165u
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.lang.Object r12 = r14.f14164t
                java.util.List r12 = (java.util.List) r12
                p229jt.C7348o.m30470b(r15)
                jt.n r15 = (p229jt.C7347n) r15
                java.lang.Object r15 = r15.getValue()
                goto L122
            L82:
                p229jt.C7348o.m30470b(r15)
                okhttp3.MultipartBody$Part$Companion r15 = okhttp3.MultipartBody.Part.INSTANCE
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r2 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                java.lang.String r2 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17694k(r2)
                java.lang.String r6 = "data[id]"
                okhttp3.MultipartBody$Part r2 = r15.createFormData(r6, r2)
                java.lang.String r6 = "data[type]"
                java.lang.String r7 = "inquiry"
                okhttp3.MultipartBody$Part r6 = r15.createFormData(r6, r7)
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r7 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                java.lang.String r7 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17689f(r7)
                java.lang.String r8 = "meta[from_component]"
                okhttp3.MultipartBody$Part r7 = r15.createFormData(r8, r7)
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r8 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                java.lang.String r8 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17690g(r8)
                java.lang.String r9 = "meta[from_step]"
                okhttp3.MultipartBody$Part r15 = r15.createFormData(r9, r8)
                okhttp3.MultipartBody$Part[] r15 = new okhttp3.MultipartBody.Part[]{r2, r6, r7, r15}
                java.util.List r15 = kotlin.collections.C7699p.m31897p(r15)
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r2 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                com.withpersona.sdk2.inquiry.governmentid.GovernmentId r2 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17691h(r2)
                java.util.List r2 = r2.mo16936d3()
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r6 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                java.util.Iterator r7 = r2.iterator()
                r12 = r15
                r11 = r2
                r10 = r6
                r9 = r7
                r6 = r4
            Ld2:
                boolean r15 = r9.hasNext()
                if (r15 == 0) goto L16d
                java.lang.Object r8 = r9.next()
                r7 = r8
                com.withpersona.sdk2.inquiry.governmentid.Frame r7 = (com.withpersona.sdk2.inquiry.governmentid.Frame) r7
                java.lang.String r15 = r7.getMimeType()
                java.lang.String r2 = "image/"
                boolean r15 = kotlin.text.C7797x.m32309T(r15, r2, r4, r3, r5)
                if (r15 == 0) goto Ld2
                rq.a r15 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17693j(r10)
                java.io.File r2 = new java.io.File
                java.lang.String r13 = r7.getAbsoluteFilePath()
                r2.<init>(r13)
                r14.f14162D = r0
                r14.f14164t = r12
                java.lang.Object r13 = pt.C10350l.m39676a(r11)
                r14.f14165u = r13
                r14.f14166v = r10
                r14.f14167w = r9
                java.lang.Object r13 = pt.C10350l.m39676a(r8)
                r14.f14168x = r13
                java.lang.Object r13 = pt.C10350l.m39676a(r7)
                r14.f14169y = r13
                r14.f14170z = r6
                r14.f14159A = r4
                r13 = 1
                r14.f14161C = r13
                java.lang.Object r15 = r15.mo41740a(r2, r14)
                if (r15 != r1) goto L121
                goto L359
            L121:
                r2 = r4
            L122:
                java.lang.Throwable r15 = p229jt.C7347n.m30463e(r15)
                if (r15 == 0) goto Ld2
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a r9 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r10 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo
                java.lang.String r13 = "Error processing image file in AutoClassifyWorker."
                r10.<init>(r13)
                r9.<init>(r10)
                java.lang.Object r10 = pt.C10350l.m39676a(r0)
                r14.f14162D = r10
                java.lang.Object r10 = pt.C10350l.m39676a(r12)
                r14.f14164t = r10
                java.lang.Object r10 = pt.C10350l.m39676a(r11)
                r14.f14165u = r10
                java.lang.Object r8 = pt.C10350l.m39676a(r8)
                r14.f14166v = r8
                java.lang.Object r7 = pt.C10350l.m39676a(r7)
                r14.f14167w = r7
                java.lang.Object r15 = pt.C10350l.m39676a(r15)
                r14.f14168x = r15
                r14.f14169y = r5
                r14.f14170z = r6
                r14.f14159A = r2
                r14.f14160B = r4
                r14.f14161C = r3
                java.lang.Object r15 = r0.emit(r9, r14)
                if (r15 != r1) goto L16a
                goto L359
            L16a:
                kotlin.Unit r15 = kotlin.Unit.f29331a
                return r15
            L16d:
                okhttp3.MultipartBody$Part$Companion r15 = okhttp3.MultipartBody.Part.INSTANCE
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r2 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                com.withpersona.sdk2.inquiry.governmentid.GovernmentId r2 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17691h(r2)
                com.withpersona.sdk2.inquiry.governmentid.GovernmentId$a r2 = r2.getCaptureMethod()
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "data[attributes][files][][capture_method]"
                okhttp3.MultipartBody$Part r15 = r15.createFormData(r3, r2)
                java.util.List r15 = kotlin.collections.C7697o.m31878d(r15)
                java.util.Collection r15 = (java.util.Collection) r15
                r12.addAll(r15)
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r15 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                com.withpersona.sdk2.inquiry.governmentid.GovernmentId r2 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17691h(r15)
                java.util.List r2 = r2.mo16936d3()
                java.lang.Object r2 = kotlin.collections.CollectionsKt.m31706d0(r2)
                com.withpersona.sdk2.inquiry.governmentid.Frame r2 = (com.withpersona.sdk2.inquiry.governmentid.Frame) r2
                m17706r(r12, r15, r2)
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$d$a r15 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$d$a
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r2 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                r15.<init>(r2, r12, r5)
                r14.f14162D = r0
                java.lang.Object r2 = pt.C10350l.m39676a(r12)
                r14.f14164t = r2
                r14.f14165u = r5
                r14.f14166v = r5
                r14.f14167w = r5
                r14.f14168x = r5
                r14.f14169y = r5
                r2 = 3
                r14.f14161C = r2
                java.lang.Object r15 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueVerificationRequestWithRetry(r15, r14)
                if (r15 != r1) goto L1c3
                goto L359
            L1c3:
                r3 = r12
            L1c4:
                r2 = r15
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker r15 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.this
                boolean r6 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r6 == 0) goto L325
                r6 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r6 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r6
                java.lang.Object r6 = r6.getResponse()
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse r6 = (com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse) r6
                java.lang.String r7 = "Unexpected network response."
                if (r6 == 0) goto L2fc
                boolean r8 = r6 instanceof com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse.IdAcceptedResponse
                if (r8 == 0) goto L255
                r8 = r6
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdAcceptedResponse r8 = (com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse.IdAcceptedResponse) r8
                com.withpersona.sdk2.inquiry.network.dto.government_id.Id r9 = r8.getIdConfig()
                java.lang.String r10 = r8.getCountryCode()
                long r11 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17687d(r15)
                com.withpersona.sdk2.inquiry.governmentid.IdConfig r15 = com.withpersona.sdk2.inquiry.governmentid.C3541d.m17526o(r9, r10, r11)
                if (r15 != 0) goto L222
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a r8 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r9 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo
                r9.<init>(r7)
                r8.<init>(r9)
                r14.f14162D = r0
                java.lang.Object r7 = pt.C10350l.m39676a(r3)
                r14.f14164t = r7
                r14.f14165u = r2
                java.lang.Object r6 = pt.C10350l.m39676a(r6)
                r14.f14166v = r6
                java.lang.Object r15 = pt.C10350l.m39676a(r15)
                r14.f14167w = r15
                r14.f14170z = r4
                r14.f14159A = r4
                r15 = 4
                r14.f14161C = r15
                java.lang.Object r15 = r0.emit(r8, r14)
                if (r15 != r1) goto L325
                goto L359
            L222:
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$b r7 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$b
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$a r9 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$a
                java.lang.String r8 = r8.getCountryCode()
                r9.<init>(r8, r15)
                r7.<init>(r9)
                r14.f14162D = r0
                java.lang.Object r8 = pt.C10350l.m39676a(r3)
                r14.f14164t = r8
                r14.f14165u = r2
                java.lang.Object r6 = pt.C10350l.m39676a(r6)
                r14.f14166v = r6
                java.lang.Object r15 = pt.C10350l.m39676a(r15)
                r14.f14167w = r15
                r14.f14170z = r4
                r14.f14159A = r4
                r15 = 5
                r14.f14161C = r15
                java.lang.Object r15 = r0.emit(r7, r14)
                if (r15 != r1) goto L325
                goto L359
            L255:
                boolean r8 = r6 instanceof com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse.ClassificationFailedResponse
                if (r8 == 0) goto L28d
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$b r7 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$b
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$c r8 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$c
                r9 = r6
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$ClassificationFailedResponse r9 = (com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse.ClassificationFailedResponse) r9
                java.util.List r9 = r9.m17660a()
                java.util.List r15 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17698o(r15, r9)
                r8.<init>(r15)
                r7.<init>(r8)
                r14.f14162D = r0
                java.lang.Object r15 = pt.C10350l.m39676a(r3)
                r14.f14164t = r15
                r14.f14165u = r2
                java.lang.Object r15 = pt.C10350l.m39676a(r6)
                r14.f14166v = r15
                r14.f14170z = r4
                r14.f14159A = r4
                r15 = 6
                r14.f14161C = r15
                java.lang.Object r15 = r0.emit(r7, r14)
                if (r15 != r1) goto L325
                goto L359
            L28d:
                boolean r8 = r6 instanceof com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse.IdRejectedResponse
                if (r8 == 0) goto L2c5
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$b r7 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$b
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$b r8 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$b
                r9 = r6
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdRejectedResponse r9 = (com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse.IdRejectedResponse) r9
                java.util.List r9 = r9.m17673a()
                java.util.List r15 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.m17698o(r15, r9)
                r8.<init>(r15)
                r7.<init>(r8)
                r14.f14162D = r0
                java.lang.Object r15 = pt.C10350l.m39676a(r3)
                r14.f14164t = r15
                r14.f14165u = r2
                java.lang.Object r15 = pt.C10350l.m39676a(r6)
                r14.f14166v = r15
                r14.f14170z = r4
                r14.f14159A = r4
                r15 = 7
                r14.f14161C = r15
                java.lang.Object r15 = r0.emit(r7, r14)
                if (r15 != r1) goto L325
                goto L359
            L2c5:
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$Unknown r15 = com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse.Unknown.f14128a
                boolean r15 = kotlin.jvm.internal.Intrinsics.m31980c(r6, r15)
                if (r15 == 0) goto L2f6
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a r15 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r8 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo
                r8.<init>(r7)
                r15.<init>(r8)
                r14.f14162D = r0
                java.lang.Object r7 = pt.C10350l.m39676a(r3)
                r14.f14164t = r7
                r14.f14165u = r2
                java.lang.Object r6 = pt.C10350l.m39676a(r6)
                r14.f14166v = r6
                r14.f14170z = r4
                r14.f14159A = r4
                r6 = 8
                r14.f14161C = r6
                java.lang.Object r15 = r0.emit(r15, r14)
                if (r15 != r1) goto L325
                goto L359
            L2f6:
                jt.l r15 = new jt.l
                r15.<init>()
                throw r15
            L2fc:
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a r15 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo r8 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$UnknownErrorInfo
                r8.<init>(r7)
                r15.<init>(r8)
                r14.f14162D = r0
                java.lang.Object r7 = pt.C10350l.m39676a(r3)
                r14.f14164t = r7
                r14.f14165u = r2
                java.lang.Object r6 = pt.C10350l.m39676a(r6)
                r14.f14166v = r6
                r14.f14170z = r4
                r14.f14159A = r4
                r6 = 9
                r14.f14161C = r6
                java.lang.Object r15 = r0.emit(r15, r14)
                if (r15 != r1) goto L325
                goto L359
            L325:
                boolean r15 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r15 == 0) goto L35a
                r15 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r15 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r15
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r15 = r15.getNetworkErrorInfo()
                com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a r6 = new com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$c$a
                r6.<init>(r15)
                java.lang.Object r7 = pt.C10350l.m39676a(r0)
                r14.f14162D = r7
                java.lang.Object r3 = pt.C10350l.m39676a(r3)
                r14.f14164t = r3
                r14.f14165u = r2
                java.lang.Object r15 = pt.C10350l.m39676a(r15)
                r14.f14166v = r15
                r14.f14167w = r5
                r14.f14170z = r4
                r14.f14159A = r4
                r15 = 10
                r14.f14161C = r15
                java.lang.Object r15 = r0.emit(r6, r14)
                if (r15 != r1) goto L35a
            L359:
                return r1
            L35a:
                kotlin.Unit r15 = kotlin.Unit.f29331a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.C3565d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super InterfaceC3564c> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3565d) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public AutoClassifyWorker(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull InterfaceC3570b service, @NotNull GovernmentId governmentId, @NotNull InterfaceC11067a imageHelper, @NotNull SupplementaryData supplementaryData, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(governmentId, "governmentId");
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        Intrinsics.checkNotNullParameter(supplementaryData, "supplementaryData");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.service = service;
        this.governmentId = governmentId;
        this.imageHelper = imageHelper;
        this.supplementaryData = supplementaryData;
        this.defaultManualCaptureDelayMs = j10;
        this.extractTextFromImage = z10;
        this.idFrontAnalyzer = new C5712u0();
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof AutoClassifyWorker) && Intrinsics.m31980c(this.sessionToken, ((AutoClassifyWorker) otherWorker).sessionToken);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof AutoClassifyWorker) && Intrinsics.m31980c(this.sessionToken, ((AutoClassifyWorker) otherWorker).sessionToken);
    }

    /* JADX INFO: renamed from: p */
    public final List<IdConfigForCountry> m17699p(List<AutoClassifyResponse.IdClassesForCountry> list) {
        List<AutoClassifyResponse.IdClassesForCountry> list2 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list2, 10));
        for (AutoClassifyResponse.IdClassesForCountry idClassesForCountry : list2) {
            String countryName = idClassesForCountry.getCountryName();
            String countryCode = idClassesForCountry.getCountryCode();
            List<Id> listM17670g = idClassesForCountry.m17670g();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listM17670g.iterator();
            while (it.hasNext()) {
                IdConfig idConfigM17526o = C3541d.m17526o((Id) it.next(), idClassesForCountry.getCountryCode(), this.defaultManualCaptureDelayMs);
                if (idConfigM17526o != null) {
                    arrayList2.add(idConfigM17526o);
                }
            }
            arrayList.add(new IdConfigForCountry(countryName, countryCode, arrayList2));
        }
        return arrayList;
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<InterfaceC3564c> run() {
        return C9579j.m37808y(C9579j.m37806w(new C3565d(null)), C7864g1.m32643a());
    }
}
