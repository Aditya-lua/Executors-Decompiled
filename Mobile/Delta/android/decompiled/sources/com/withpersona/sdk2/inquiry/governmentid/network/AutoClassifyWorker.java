package com.withpersona.sdk2.inquiry.governmentid.network;

import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import dn.u0;
import hv.x;
import iu.g1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.j;
import nt.f;
import nt.m;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import sm.i;
import tr.h;
import wm.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0004$\u0018\u001a8BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001f*\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Ltr/h;", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "service", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "governmentId", "Lpq/a;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lpq/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)V", "otherWorker", "c", "(Lwm/o;)Z", "a", "(Ltr/h;)Z", "Llu/h;", "run", "()Llu/h;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "p", "(Ljava/util/List;)Ljava/util/List;", "b", "Ljava/lang/String;", "d", "e", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "h", "Lpq/a;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "j", "J", "k", "Z", "Ldn/u0;", "l", "Ldn/u0;", "idFrontAnalyzer", "SupplementaryData", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoClassifyWorker implements o<c>, h<c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromStep;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fromComponent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.governmentid.network.b service;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GovernmentId governmentId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.a imageHelper;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SupplementaryData supplementaryData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long defaultManualCaptureDelayMs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean extractTextFromImage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u0 idFrontAnalyzer;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "", "<init>", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SupplementaryData {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "idConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;)V", "a", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0203a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String countryCode;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final IdConfig idConfig;

            public C0203a(@NotNull String countryCode, @NotNull IdConfig idConfig) {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<IdConfigForCountry> idClassesPerCountry;

            public b(@NotNull List<IdConfigForCountry> idClassesPerCountry) {
                Intrinsics.checkNotNullParameter(idClassesPerCountry, "idClassesPerCountry");
                this.idClassesPerCountry = idClassesPerCountry;
            }

            @NotNull
            public final List<IdConfigForCountry> a() {
                return this.idClassesPerCountry;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<IdConfigForCountry> idClassesPerCountry;

            public c(@NotNull List<IdConfigForCountry> idClassesPerCountry) {
                Intrinsics.checkNotNullParameter(idClassesPerCountry, "idClassesPerCountry");
                this.idClassesPerCountry = idClassesPerCountry;
            }

            @NotNull
            public final List<IdConfigForCountry> a() {
                return this.idClassesPerCountry;
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "service", "Lpq/a;", "imageHelper", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lpq/a;)V", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "governmentId", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "b", "Lpq/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final com.withpersona.sdk2.inquiry.governmentid.network.b service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final pq.a imageHelper;

        public b(@NotNull com.withpersona.sdk2.inquiry.governmentid.network.b service, @NotNull pq.a imageHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
            this.service = service;
            this.imageHelper = imageHelper;
        }

        @NotNull
        public final AutoClassifyWorker a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull GovernmentId governmentId, @NotNull SupplementaryData supplementaryData, long defaultManualCaptureDelayMs, boolean extractTextFromImage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(governmentId, "governmentId");
            Intrinsics.checkNotNullParameter(supplementaryData, "supplementaryData");
            return new AutoClassifyWorker(sessionToken, inquiryId, fromStep, fromComponent, this.service, governmentId, this.imageHelper, supplementaryData, defaultManualCaptureDelayMs, extractTextFromImage);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "b", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "autoClassificationResult", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final a autoClassificationResult;

            public b(@NotNull a autoClassificationResult) {
                Intrinsics.checkNotNullParameter(autoClassificationResult, "autoClassificationResult");
                this.autoClassificationResult = autoClassificationResult;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getAutoClassificationResult() {
                return this.autoClassificationResult;
            }
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1", f = "AutoClassifyWorker.kt", l = {94, 96, 140, 154, 160, 171, 180, 189, 195, 199}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<lu.i<? super c>, lt.b<? super Unit>, Object> {
        public int A;
        public int B;
        public int C;
        public /* synthetic */ Object D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11044t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11045u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11046v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f11047w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f11048x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f11049y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f11050z;

        @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2", f = "AutoClassifyWorker.kt", l = {141}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<AutoClassifyResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11051t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ AutoClassifyWorker f11052u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<MultipartBody.Part> f11053v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AutoClassifyWorker autoClassifyWorker, List<MultipartBody.Part> list, lt.b<? super a> bVar) {
                super(1, bVar);
                this.f11052u = autoClassifyWorker;
                this.f11053v = list;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f11052u, this.f11053v, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f11051t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                com.withpersona.sdk2.inquiry.governmentid.network.b bVar = this.f11052u.service;
                String str = this.f11052u.sessionToken;
                String str2 = this.f11052u.inquiryId;
                List<MultipartBody.Part> list = this.f11053v;
                SupplementaryData supplementaryData = this.f11052u.supplementaryData;
                this.f11051t = 1;
                Object objA = bVar.a(str, str2, list, supplementaryData, this);
                return objA == objE ? objE : objA;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<AutoClassifyResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        public d(lt.b<? super d> bVar) {
            super(2, bVar);
        }

        public static final void n(List<MultipartBody.Part> list, AutoClassifyWorker autoClassifyWorker, Frame frame) {
            String strB;
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            list.add(companion.createFormData("data[attributes][image]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.INSTANCE.create(new File(frame.getAbsoluteFilePath()), MediaType.INSTANCE.parse(frame.getMimeType()))));
            if (!autoClassifyWorker.extractTextFromImage || (strB = autoClassifyWorker.idFrontAnalyzer.b(frame.getAbsoluteFilePath())) == null) {
                return;
            }
            list.add(companion.createFormData("data[attributes][client_extracted_text]", strB));
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            d dVar = AutoClassifyWorker.this.new d(bVar);
            dVar.D = obj;
            return dVar;
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
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 888
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super c> iVar, lt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public AutoClassifyWorker(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull com.withpersona.sdk2.inquiry.governmentid.network.b service, @NotNull GovernmentId governmentId, @NotNull pq.a imageHelper, @NotNull SupplementaryData supplementaryData, long j10, boolean z10) {
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
        this.idFrontAnalyzer = new u0();
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof AutoClassifyWorker) && Intrinsics.c(this.sessionToken, ((AutoClassifyWorker) otherWorker).sessionToken);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof AutoClassifyWorker) && Intrinsics.c(this.sessionToken, ((AutoClassifyWorker) otherWorker).sessionToken);
    }

    public final List<IdConfigForCountry> p(List<AutoClassifyResponse.IdClassesForCountry> list) {
        List<AutoClassifyResponse.IdClassesForCountry> list2 = list;
        ArrayList arrayList = new ArrayList(q.u(list2, 10));
        for (AutoClassifyResponse.IdClassesForCountry idClassesForCountry : list2) {
            String countryName = idClassesForCountry.getCountryName();
            String countryCode = idClassesForCountry.getCountryCode();
            List<Id> listG = idClassesForCountry.g();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                IdConfig idConfigO = com.withpersona.sdk2.inquiry.governmentid.d.o((Id) it.next(), idClassesForCountry.getCountryCode(), this.defaultManualCaptureDelayMs);
                if (idConfigO != null) {
                    arrayList2.add(idConfigO);
                }
            }
            arrayList.add(new IdConfigForCountry(countryName, countryCode, arrayList2));
        }
        return arrayList;
    }

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<c> run() {
        return j.y(j.w(new d(null)), g1.a());
    }
}
