package com.withpersona.sdk2.inquiry.governmentid.network;

import av.g1;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import gu.f;
import gu.m;
import hn.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln.o;
import ls.j;
import mv.b0;
import mv.c0;
import mv.g0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.q;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import sn.i1;
import sw.x;
import vo.Frame;
import vo.IdConfig;
import vo.IdConfigForCountry;
import vo.h;
import vo.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0004$\u001a\u00188BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001f*\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lln/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "service", "Lvo/n;", "governmentId", "Lfr/a;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", BuildConfig.FLAVOR, "defaultManualCaptureDelayMs", BuildConfig.FLAVOR, "extractTextFromImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lvo/n;Lfr/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)V", "otherWorker", "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Lvo/f3;", "p", "(Ljava/util/List;)Ljava/util/List;", "b", "Ljava/lang/String;", "d", "e", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "g", "Lvo/n;", "h", "Lfr/a;", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "j", "J", "k", "Z", "Lsn/i1;", "l", "Lsn/i1;", "idFrontAnalyzer", "SupplementaryData", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoClassifyWorker implements o<c>, j<c> {

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
    public final n governmentId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fr.a imageHelper;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SupplementaryData supplementaryData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long defaultManualCaptureDelayMs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean extractTextFromImage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i1 idFrontAnalyzer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", BuildConfig.FLAVOR, "<init>", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SupplementaryData {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", BuildConfig.FLAVOR, "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", BuildConfig.FLAVOR, "countryCode", "Lvo/d3;", "idConfig", "<init>", "(Ljava/lang/String;Lvo/d3;)V", "a", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "b", "Lvo/d3;", "()Lvo/d3;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0175a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String countryCode;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final IdConfig idConfig;

            public C0175a(@NotNull String countryCode, @NotNull IdConfig idConfig) {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", BuildConfig.FLAVOR, "Lvo/f3;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", BuildConfig.FLAVOR, "Lvo/f3;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "service", "Lfr/a;", "imageHelper", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/b;Lfr/a;)V", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lvo/n;", "governmentId", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", BuildConfig.FLAVOR, "defaultManualCaptureDelayMs", BuildConfig.FLAVOR, "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/n;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;", "b", "Lfr/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final com.withpersona.sdk2.inquiry.governmentid.network.b service;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final fr.a imageHelper;

        public b(@NotNull com.withpersona.sdk2.inquiry.governmentid.network.b service, @NotNull fr.a imageHelper) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
            this.service = service;
            this.imageHelper = imageHelper;
        }

        @NotNull
        public final AutoClassifyWorker a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull n governmentId, @NotNull SupplementaryData supplementaryData, long defaultManualCaptureDelayMs, boolean extractTextFromImage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(governmentId, "governmentId");
            Intrinsics.checkNotNullParameter(supplementaryData, "supplementaryData");
            return new AutoClassifyWorker(sessionToken, inquiryId, fromStep, fromComponent, this.service, governmentId, this.imageHelper, supplementaryData, defaultManualCaptureDelayMs, extractTextFromImage);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", BuildConfig.FLAVOR, "b", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1", f = "AutoClassifyWorker.kt", l = {94, 96, 140, 154, 160, 171, 180, 189, 195, 199}, m = "invokeSuspend")
    public static final class d extends m implements Function2<dv.i<? super c>, eu.b<? super Unit>, Object> {
        public int A;
        public int B;
        public int C;
        public /* synthetic */ Object D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10044t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10045u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10046v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f10047w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f10048x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f10049y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f10050z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2", f = "AutoClassifyWorker.kt", l = {141}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<AutoClassifyResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10051t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ AutoClassifyWorker f10052u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<c0.c> f10053v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AutoClassifyWorker autoClassifyWorker, List<c0.c> list, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f10052u = autoClassifyWorker;
                this.f10053v = list;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f10052u, this.f10053v, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f10051t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                com.withpersona.sdk2.inquiry.governmentid.network.b bVar = this.f10052u.service;
                String str = this.f10052u.sessionToken;
                String str2 = this.f10052u.inquiryId;
                List<c0.c> list = this.f10053v;
                SupplementaryData supplementaryData = this.f10052u.supplementaryData;
                this.f10051t = 1;
                Object objA = bVar.a(str, str2, list, supplementaryData, this);
                return objA == objE ? objE : objA;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<AutoClassifyResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        public static final void p(List<c0.c> list, AutoClassifyWorker autoClassifyWorker, Frame frame) {
            String strB;
            c0.c.Companion companion = c0.c.INSTANCE;
            list.add(companion.c("data[attributes][image]", new File(frame.getAbsoluteFilePath()).getName(), g0.INSTANCE.b(new File(frame.getAbsoluteFilePath()), b0.INSTANCE.b(frame.getMimeType()))));
            if (!autoClassifyWorker.extractTextFromImage || (strB = autoClassifyWorker.idFrontAnalyzer.b(frame.getAbsoluteFilePath())) == null) {
                return;
            }
            list.add(companion.b("data[attributes][client_extracted_text]", strB));
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
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
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 888
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super c> iVar, eu.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public AutoClassifyWorker(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull com.withpersona.sdk2.inquiry.governmentid.network.b service, @NotNull n governmentId, @NotNull fr.a imageHelper, @NotNull SupplementaryData supplementaryData, long j10, boolean z10) {
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
        this.idFrontAnalyzer = new i1();
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof AutoClassifyWorker) && Intrinsics.c(this.sessionToken, ((AutoClassifyWorker) otherWorker).sessionToken);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> otherWorker) {
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
                IdConfig idConfigO = h.o((Id) it.next(), idClassesForCountry.getCountryCode(), this.defaultManualCaptureDelayMs);
                if (idConfigO != null) {
                    arrayList2.add(idConfigO);
                }
            }
            arrayList.add(new IdConfigForCountry(countryName, countryCode, arrayList2));
        }
        return arrayList;
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<c> run() {
        return dv.j.y(dv.j.w(new d(null)), g1.a());
    }
}
