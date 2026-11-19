package uv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ew.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0006\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, d2 = {"Luv/e;", BuildConfig.FLAVOR, "<init>", "()V", "Lew/h;", "name", "a", "(Lew/h;)Lew/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "d", "()Ljava/util/Map;", BuildConfig.FLAVOR, "Luv/d;", "b", "[Luv/d;", "c", "()[Luv/d;", "STATIC_HEADER_TABLE", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f33980a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final d[] STATIC_HEADER_TABLE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<ew.h, Integer> NAME_TO_FIRST_INDEX;

    static {
        e eVar = new e();
        f33980a = eVar;
        d dVar = new d(d.f33977j, BuildConfig.FLAVOR);
        ew.h hVar = d.f33974g;
        d dVar2 = new d(hVar, "GET");
        d dVar3 = new d(hVar, "POST");
        ew.h hVar2 = d.f33975h;
        d dVar4 = new d(hVar2, "/");
        d dVar5 = new d(hVar2, "/index.html");
        ew.h hVar3 = d.f33976i;
        d dVar6 = new d(hVar3, "http");
        d dVar7 = new d(hVar3, "https");
        ew.h hVar4 = d.f33973f;
        STATIC_HEADER_TABLE = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(hVar4, "200"), new d(hVar4, "204"), new d(hVar4, "206"), new d(hVar4, "304"), new d(hVar4, "400"), new d(hVar4, "404"), new d(hVar4, "500"), new d("accept-charset", BuildConfig.FLAVOR), new d("accept-encoding", "gzip, deflate"), new d("accept-language", BuildConfig.FLAVOR), new d("accept-ranges", BuildConfig.FLAVOR), new d("accept", BuildConfig.FLAVOR), new d("access-control-allow-origin", BuildConfig.FLAVOR), new d("age", BuildConfig.FLAVOR), new d("allow", BuildConfig.FLAVOR), new d("authorization", BuildConfig.FLAVOR), new d("cache-control", BuildConfig.FLAVOR), new d("content-disposition", BuildConfig.FLAVOR), new d("content-encoding", BuildConfig.FLAVOR), new d("content-language", BuildConfig.FLAVOR), new d("content-length", BuildConfig.FLAVOR), new d("content-location", BuildConfig.FLAVOR), new d("content-range", BuildConfig.FLAVOR), new d("content-type", BuildConfig.FLAVOR), new d("cookie", BuildConfig.FLAVOR), new d(InquiryField.DateField.TYPE, BuildConfig.FLAVOR), new d("etag", BuildConfig.FLAVOR), new d("expect", BuildConfig.FLAVOR), new d("expires", BuildConfig.FLAVOR), new d("from", BuildConfig.FLAVOR), new d("host", BuildConfig.FLAVOR), new d("if-match", BuildConfig.FLAVOR), new d("if-modified-since", BuildConfig.FLAVOR), new d("if-none-match", BuildConfig.FLAVOR), new d("if-range", BuildConfig.FLAVOR), new d("if-unmodified-since", BuildConfig.FLAVOR), new d("last-modified", BuildConfig.FLAVOR), new d("link", BuildConfig.FLAVOR), new d("location", BuildConfig.FLAVOR), new d("max-forwards", BuildConfig.FLAVOR), new d("proxy-authenticate", BuildConfig.FLAVOR), new d("proxy-authorization", BuildConfig.FLAVOR), new d("range", BuildConfig.FLAVOR), new d("referer", BuildConfig.FLAVOR), new d("refresh", BuildConfig.FLAVOR), new d("retry-after", BuildConfig.FLAVOR), new d("server", BuildConfig.FLAVOR), new d("set-cookie", BuildConfig.FLAVOR), new d("strict-transport-security", BuildConfig.FLAVOR), new d("transfer-encoding", BuildConfig.FLAVOR), new d("user-agent", BuildConfig.FLAVOR), new d("vary", BuildConfig.FLAVOR), new d("via", BuildConfig.FLAVOR), new d("www-authenticate", BuildConfig.FLAVOR)};
        NAME_TO_FIRST_INDEX = eVar.d();
    }

    @NotNull
    public final ew.h a(@NotNull ew.h name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int I = name.I();
        for (int i10 = 0; i10 < I; i10++) {
            byte bK = name.k(i10);
            if (65 <= bK && bK < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.P());
            }
        }
        return name;
    }

    @NotNull
    public final Map<ew.h, Integer> b() {
        return NAME_TO_FIRST_INDEX;
    }

    @NotNull
    public final d[] c() {
        return STATIC_HEADER_TABLE;
    }

    public final Map<ew.h, Integer> d() {
        d[] dVarArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(dVarArr.length, 1.0f);
        int length = dVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            d[] dVarArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(dVarArr2[i10].name)) {
                linkedHashMap.put(dVarArr2[i10].name, Integer.valueOf(i10));
            }
        }
        Map<ew.h, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010%\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\n008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00104R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010/R\u0016\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010/R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010/¨\u0006;"}, d2 = {"Luv/e$a;", BuildConfig.FLAVOR, "Lew/l0;", Payload.SOURCE, BuildConfig.FLAVOR, "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lew/l0;II)V", BuildConfig.FLAVOR, "Luv/d;", "e", "()Ljava/util/List;", BuildConfig.FLAVOR, "k", "()V", "firstByte", "prefixMask", "m", "(II)I", "Lew/h;", "j", "()Lew/h;", "a", "b", "bytesToRecover", "d", "(I)I", "index", "l", "(I)V", "c", "p", "q", "nameIndex", "n", "o", "f", "(I)Lew/h;", BuildConfig.FLAVOR, "h", "(I)Z", "entry", "g", "(ILuv/d;)V", "i", "()I", "I", BuildConfig.FLAVOR, "Ljava/util/List;", "headerList", "Lew/g;", "Lew/g;", BuildConfig.FLAVOR, "[Luv/d;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int headerTableSizeSetting;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int maxDynamicTableByteCount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<d> headerList;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.g source;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public d[] dynamicTable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int nextHeaderIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        public a(@NotNull l0 source, int i10, int i11) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i11;
            this.headerList = new ArrayList();
            this.source = ew.v.c(source);
            d[] dVarArr = new d[8];
            this.dynamicTable = dVarArr;
            this.nextHeaderIndex = dVarArr.length - 1;
        }

        public final void a() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        public final void b() {
            p001kotlin.collections.l.t(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        public final int c(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        public final int d(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    d dVar = this.dynamicTable[length];
                    Intrinsics.checkNotNull(dVar);
                    int i12 = dVar.hpackSize;
                    bytesToRecover -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                d[] dVarArr = this.dynamicTable;
                System.arraycopy(dVarArr, i10 + 1, dVarArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        @NotNull
        public final List<d> e() {
            List<d> listM0 = CollectionsKt.M0(this.headerList);
            this.headerList.clear();
            return listM0;
        }

        public final ew.h f(int index) throws IOException {
            if (h(index)) {
                return e.f33980a.c()[index].name;
            }
            int iC = c(index - e.f33980a.c().length);
            if (iC >= 0) {
                d[] dVarArr = this.dynamicTable;
                if (iC < dVarArr.length) {
                    d dVar = dVarArr[iC];
                    Intrinsics.checkNotNull(dVar);
                    return dVar.name;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        public final void g(int index, d entry) {
            this.headerList.add(entry);
            int i10 = entry.hpackSize;
            if (index != -1) {
                d dVar = this.dynamicTable[c(index)];
                Intrinsics.checkNotNull(dVar);
                i10 -= dVar.hpackSize;
            }
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                b();
                return;
            }
            int iD = d((this.dynamicTableByteCount + i10) - i11);
            if (index == -1) {
                int i12 = this.headerCount + 1;
                d[] dVarArr = this.dynamicTable;
                if (i12 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = dVarArr2;
                }
                int i13 = this.nextHeaderIndex;
                this.nextHeaderIndex = i13 - 1;
                this.dynamicTable[i13] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + c(index) + iD] = entry;
            }
            this.dynamicTableByteCount += i10;
        }

        public final boolean h(int index) {
            return index >= 0 && index <= e.f33980a.c().length - 1;
        }

        public final int i() {
            return nv.n.b(this.source.readByte(), 255);
        }

        @NotNull
        public final ew.h j() {
            int i10 = i();
            boolean z10 = (i10 & Barcode.FORMAT_ITF) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.source.M1(jM);
            }
            ew.e eVar = new ew.e();
            x.f34108a.b(this.source, jM, eVar);
            return eVar.J2();
        }

        public final void k() throws IOException {
            while (!this.source.c2()) {
                int iB = nv.n.b(this.source.readByte(), 255);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & Barcode.FORMAT_ITF) == 128) {
                    l(m(iB, 127) - 1);
                } else if (iB == 64) {
                    o();
                } else if ((iB & 64) == 64) {
                    n(m(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iM = m(iB, 31);
                    this.maxDynamicTableByteCount = iM;
                    if (iM < 0 || iM > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    a();
                } else if (iB == 16 || iB == 0) {
                    q();
                } else {
                    p(m(iB, 15) - 1);
                }
            }
        }

        public final void l(int index) throws IOException {
            if (h(index)) {
                this.headerList.add(e.f33980a.c()[index]);
                return;
            }
            int iC = c(index - e.f33980a.c().length);
            if (iC >= 0) {
                d[] dVarArr = this.dynamicTable;
                if (iC < dVarArr.length) {
                    List<d> list = this.headerList;
                    d dVar = dVarArr[iC];
                    Intrinsics.checkNotNull(dVar);
                    list.add(dVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        public final int m(int firstByte, int prefixMask) {
            int i10 = firstByte & prefixMask;
            if (i10 < prefixMask) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & Barcode.FORMAT_ITF) == 0) {
                    return prefixMask + (i12 << i11);
                }
                prefixMask += (i12 & 127) << i11;
                i11 += 7;
            }
        }

        public final void n(int nameIndex) {
            g(-1, new d(f(nameIndex), j()));
        }

        public final void o() {
            g(-1, new d(e.f33980a.a(j()), j()));
        }

        public final void p(int index) throws IOException {
            this.headerList.add(new d(f(index), j()));
        }

        public final void q() throws IOException {
            this.headerList.add(new d(e.f33980a.a(j()), j()));
        }

        public /* synthetic */ a(l0 l0Var, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(l0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u00062"}, d2 = {"Luv/e$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "headerTableSizeSetting", BuildConfig.FLAVOR, "useCompression", "Lew/e;", "out", "<init>", "(IZLew/e;)V", BuildConfig.FLAVOR, "Luv/d;", "headerBlock", BuildConfig.FLAVOR, "g", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "h", "(III)V", "Lew/h;", "data", "f", "(Lew/h;)V", "e", "(I)V", "b", "()V", "bytesToRecover", "c", "(I)I", "entry", "d", "(Luv/d;)V", "a", "I", "Z", "Lew/e;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", BuildConfig.FLAVOR, "[Luv/d;", "dynamicTable", "nextHeaderIndex", "i", "headerCount", "j", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int headerTableSizeSetting;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean useCompression;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.e out;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int smallestHeaderTableSizeSetting;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean emitDynamicTableSizeUpdate;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int maxDynamicTableByteCount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public d[] dynamicTable;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int nextHeaderIndex;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        public b(int i10, boolean z10, @NotNull ew.e out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.headerTableSizeSetting = i10;
            this.useCompression = z10;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i10;
            d[] dVarArr = new d[8];
            this.dynamicTable = dVarArr;
            this.nextHeaderIndex = dVarArr.length - 1;
        }

        public final void a() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        public final void b() {
            p001kotlin.collections.l.t(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        public final int c(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    d dVar = this.dynamicTable[length];
                    Intrinsics.checkNotNull(dVar);
                    bytesToRecover -= dVar.hpackSize;
                    int i12 = this.dynamicTableByteCount;
                    d dVar2 = this.dynamicTable[length];
                    Intrinsics.checkNotNull(dVar2);
                    this.dynamicTableByteCount = i12 - dVar2.hpackSize;
                    this.headerCount--;
                    i11++;
                }
                d[] dVarArr = this.dynamicTable;
                System.arraycopy(dVarArr, i10 + 1, dVarArr, i10 + 1 + i11, this.headerCount);
                d[] dVarArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(dVarArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        public final void d(d entry) {
            int i10 = entry.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            d[] dVarArr = this.dynamicTable;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = dVarArr2;
            }
            int i13 = this.nextHeaderIndex;
            this.nextHeaderIndex = i13 - 1;
            this.dynamicTable[i13] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public final void e(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            a();
        }

        public final void f(@NotNull ew.h data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.useCompression) {
                x xVar = x.f34108a;
                if (xVar.d(data) < data.I()) {
                    ew.e eVar = new ew.e();
                    xVar.c(data, eVar);
                    ew.h hVarJ2 = eVar.J2();
                    h(hVarJ2.I(), 127, Barcode.FORMAT_ITF);
                    this.out.z1(hVarJ2);
                    return;
                }
            }
            h(data.I(), 127, 0);
            this.out.z1(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0077  */
        public final void g(@NotNull List<d> headerBlock) {
            int length;
            int length2;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i10 = this.smallestHeaderTableSizeSetting;
                if (i10 < this.maxDynamicTableByteCount) {
                    h(i10, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                h(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = headerBlock.get(i11);
                ew.h hVarN = dVar.name.N();
                ew.h hVar = dVar.value;
                e eVar = e.f33980a;
                Integer num = eVar.b().get(hVarN);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (Intrinsics.c(eVar.c()[iIntValue].value, hVar)) {
                        length = length2;
                    } else if (Intrinsics.c(eVar.c()[length2].value, hVar)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i12 = this.nextHeaderIndex + 1; i12 < length3; i12++) {
                        d dVar2 = this.dynamicTable[i12];
                        Intrinsics.checkNotNull(dVar2);
                        if (Intrinsics.c(dVar2.name, hVarN)) {
                            d dVar3 = this.dynamicTable[i12];
                            Intrinsics.checkNotNull(dVar3);
                            if (Intrinsics.c(dVar3.value, hVar)) {
                                length2 = e.f33980a.c().length + (i12 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.nextHeaderIndex) + e.f33980a.c().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    h(length2, 127, Barcode.FORMAT_ITF);
                } else if (length == -1) {
                    this.out.writeByte(64);
                    f(hVarN);
                    f(hVar);
                    d(dVar);
                } else if (!hVarN.J(d.f33972e) || Intrinsics.c(d.f33977j, hVarN)) {
                    h(length, 63, 64);
                    f(hVar);
                    d(dVar);
                } else {
                    h(length, 15, 0);
                    f(hVar);
                }
            }
        }

        public final void h(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i10 = value - prefixMask;
            while (i10 >= 128) {
                this.out.writeByte(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.out.writeByte(i10);
        }

        public /* synthetic */ b(int i10, boolean z10, ew.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Barcode.FORMAT_AZTEC : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }
}
