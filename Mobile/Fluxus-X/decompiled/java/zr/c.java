package zr;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import av.a2;
import av.g1;
import av.k;
import av.l0;
import av.n2;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import gu.l;
import gu.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mv.d0;
import mv.f0;
import mv.h0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.p;
import p001kotlin.collections.u;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u00020\u0001:\u0004\u001b\u0016\u0010%B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RT\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'2\u001e\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b%\u0010+R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010-0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lzr/c;", "Lzr/a;", "Lmv/d0;", "okHttpClient", "Landroid/app/Application;", "context", "Lav/p0;", "coroutineScope", "<init>", "(Lmv/d0;Landroid/app/Application;Lav/p0;)V", "Landroid/os/Bundle;", "outState", BuildConfig.FLAVOR, "e", "(Landroid/os/Bundle;)V", "inState", "b", BuildConfig.FLAVOR, "fontUrl", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onSuccess", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", BuildConfig.FLAVOR, "Lzr/g;", "remoteFonts", "c", "(Ljava/util/List;)V", "Ljava/io/File;", "m", "()Ljava/io/File;", "destinationFile", "k", "(Ljava/lang/String;Ljava/io/File;Leu/b;)Ljava/lang/Object;", "Lmv/d0;", "Landroid/app/Application;", "d", "Lav/p0;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "value", "Ljava/util/Map;", "()Ljava/util/Map;", "fontDownloaderMapping", "Lzr/c$d;", "f", "fontCache", BuildConfig.FLAVOR, "Lzr/c$b;", "g", "Ljava/util/List;", "onFontDownloadedCallbacks", "h", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d0 okHttpClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Application context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, d> fontCache;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<b> onFontDownloadedCallbacks;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzr/c$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "url", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", BuildConfig.FLAVOR, "onFontDownloaded", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function1<Typeface, Unit> onFontDownloaded;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull String url, @NotNull Function1<? super Typeface, Unit> onFontDownloaded) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(onFontDownloaded, "onFontDownloaded");
            this.url = url;
            this.onFontDownloaded = onFontDownloaded;
        }

        @NotNull
        public final Function1<Typeface, Unit> a() {
            return this.onFontDownloaded;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: renamed from: zr.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzr/c$c;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontDownloaderMapping", "<init>", "(Ljava/util/Map;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0794c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C0794c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

        /* JADX INFO: renamed from: zr.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C0794c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0794c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        linkedHashMap2.put(StyleElements.FontWeight.valueOf(parcel.readString()), parcel.readString());
                    }
                    linkedHashMap.put(string, linkedHashMap2);
                }
                return new C0794c(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0794c[] newArray(int i10) {
                return new C0794c[i10];
            }
        }

        public C0794c(@NotNull Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping) {
            Intrinsics.checkNotNullParameter(fontDownloaderMapping, "fontDownloaderMapping");
            this.fontDownloaderMapping = fontDownloaderMapping;
        }

        @NotNull
        public final Map<String, Map<StyleElements.FontWeight, String>> a() {
            return this.fontDownloaderMapping;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map<String, Map<StyleElements.FontWeight, String>> map = this.fontDownloaderMapping;
            dest.writeInt(map.size());
            for (Map.Entry<String, Map<StyleElements.FontWeight, String>> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                Map<StyleElements.FontWeight, String> value = entry.getValue();
                dest.writeInt(value.size());
                for (Map.Entry<StyleElements.FontWeight, String> entry2 : value.entrySet()) {
                    dest.writeString(entry2.getKey().name());
                    dest.writeString(entry2.getValue());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzr/c$d;", BuildConfig.FLAVOR, "b", "a", "Lzr/c$d$a;", "Lzr/c$d$b;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {

        /* JADX INFO: renamed from: zr.c$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzr/c$d$a;", "Lzr/c$d;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cached implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Typeface typeface;

            public Cached(@NotNull Typeface typeface) {
                Intrinsics.checkNotNullParameter(typeface, "typeface");
                this.typeface = typeface;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Typeface getTypeface() {
                return this.typeface;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cached) && Intrinsics.c(this.typeface, ((Cached) other).typeface);
            }

            public int hashCode() {
                return this.typeface.hashCode();
            }

            @NotNull
            public String toString() {
                return "Cached(typeface=" + this.typeface + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzr/c$d$b;", "Lzr/c$d;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f39447a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1662305117;
            }

            @NotNull
            public String toString() {
                return "Downloading";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1", f = "RealFontDownloader.kt", l = {84, 90}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f39448t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f39449u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f39450v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f39452x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<Typeface, Unit> f39453y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1", f = "RealFontDownloader.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f39454t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function1<Typeface, Unit> f39455u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Typeface f39456v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ c f39457w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f39458x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Typeface, Unit> function1, Typeface typeface, c cVar, String str, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f39455u = function1;
                this.f39456v = typeface;
                this.f39457w = cVar;
                this.f39458x = str;
            }

            public static final boolean p(String str, b bVar) {
                return Intrinsics.c(bVar.getUrl(), str);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f39455u, this.f39456v, this.f39457w, this.f39458x, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f39454t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Function1<Typeface, Unit> function1 = this.f39455u;
                Typeface typeface = this.f39456v;
                Intrinsics.checkNotNull(typeface);
                function1.invoke(typeface);
                List list = this.f39457w.onFontDownloadedCallbacks;
                String str = this.f39458x;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.c(((b) obj2).getUrl(), str)) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = this.f39457w.onFontDownloadedCallbacks;
                final String str2 = this.f39458x;
                u.F(list2, new Function1() { // from class: zr.e
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(c.e.a.p(str2, (c.b) obj3));
                    }
                });
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Function1<Typeface, Unit> function1A = ((b) obj3).a();
                    Typeface typeface2 = this.f39456v;
                    Intrinsics.checkNotNull(typeface2);
                    function1A.invoke(typeface2);
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, Function1<? super Typeface, Unit> function1, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f39452x = str;
            this.f39453y = function1;
        }

        public static final boolean p(String str, b bVar) {
            return Intrinsics.c(bVar.getUrl(), str);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return c.this.new e(this.f39452x, this.f39453y, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
        
            if (av.i.g(r10, r3, r9) == r0) goto L20;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            File fileM;
            Object objE = fu.c.e();
            int i10 = this.f39450v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    fileM = c.this.m();
                    c cVar = c.this;
                    String str = this.f39452x;
                    this.f39448t = fileM;
                    this.f39450v = 1;
                    if (cVar.k(str, fileM, this) == objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    fileM = (File) this.f39448t;
                    o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f21506a;
                Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM);
                Map map = c.this.fontCache;
                String str2 = this.f39452x;
                Intrinsics.checkNotNull(typefaceCreateFromFile);
                map.put(str2, new d.Cached(typefaceCreateFromFile));
                fileM.delete();
                n2 n2VarC = g1.c();
                a aVar = new a(this.f39453y, typefaceCreateFromFile, c.this, this.f39452x, null);
                this.f39448t = l.a(fileM);
                this.f39449u = l.a(typefaceCreateFromFile);
                this.f39450v = 2;
            } catch (Exception unused) {
                c.this.fontCache.put(this.f39452x, null);
                List list = c.this.onFontDownloadedCallbacks;
                final String str3 = this.f39452x;
                u.F(list, new Function1() { // from class: zr.d
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(c.e.p(str3, (c.b) obj2));
                    }
                });
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader", f = "RealFontDownloader.kt", l = {138}, m = "downloadFontFile")
    public static final class f extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f39459t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f39460u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f39461v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f39462w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f39464y;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f39462w = obj;
            this.f39464y |= Integer.MIN_VALUE;
            return c.this.k(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return cu.a.a(Boolean.valueOf(((zr.g) t10).d()), Boolean.valueOf(((zr.g) t8).d()));
        }
    }

    public c(@NotNull d0 okHttpClient, @NotNull Application context, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.okHttpClient = okHttpClient;
        this.context = context;
        this.coroutineScope = coroutineScope;
        this.fontDownloaderMapping = new LinkedHashMap();
        this.fontCache = new LinkedHashMap();
        this.onFontDownloadedCallbacks = new ArrayList();
    }

    public static final h0 l(c cVar, f0 f0Var) {
        return cVar.okHttpClient.a(f0Var).j();
    }

    @Override // zr.a
    public void a(@NotNull String fontUrl, @NotNull Function1<? super Typeface, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(fontUrl, "fontUrl");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        d dVar = this.fontCache.get(fontUrl);
        if (dVar instanceof d.Cached) {
            onSuccess.invoke(((d.Cached) dVar).getTypeface());
            return;
        }
        d.b bVar = d.b.f39447a;
        if (Intrinsics.c(dVar, bVar)) {
            this.onFontDownloadedCallbacks.add(new b(fontUrl, onSuccess));
        } else {
            if (dVar != null) {
                throw new zt.l();
            }
            this.fontCache.put(fontUrl, bVar);
            k.d(this.coroutineScope, null, null, new e(fontUrl, onSuccess, null), 3, null);
        }
    }

    @Override // zr.a
    public void b(@Nullable Bundle inState) {
        Map<String, Map<StyleElements.FontWeight, String>> linkedHashMap;
        C0794c c0794c;
        if (inState == null || (c0794c = (C0794c) u2.c.a(inState, "font_downloader_mapping", C0794c.class)) == null || (linkedHashMap = c0794c.a()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.fontDownloaderMapping = linkedHashMap;
    }

    @Override // zr.a
    public void c(@Nullable List<zr.g> remoteFonts) {
        if (remoteFonts == null) {
            remoteFonts = p.k();
        }
        for (zr.g gVar : CollectionsKt.F0(remoteFonts, new g())) {
            String fontFamilyName = gVar.getFontFamilyName();
            String url = gVar.getUrl();
            StyleElements.FontWeight fontWeight = gVar.getFontWeight();
            if (fontFamilyName != null && url != null && fontWeight != null) {
                Map<String, Map<StyleElements.FontWeight, String>> mapD = d();
                Map<StyleElements.FontWeight, String> linkedHashMap = mapD.get(fontFamilyName);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    mapD.put(fontFamilyName, linkedHashMap);
                }
                linkedHashMap.put(fontWeight, url);
            }
        }
    }

    @Override // zr.a
    @NotNull
    public Map<String, Map<StyleElements.FontWeight, String>> d() {
        return this.fontDownloaderMapping;
    }

    @Override // zr.a
    public void e(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("font_downloader_mapping", new C0794c(d()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, File file, eu.b<? super Unit> bVar) {
        f fVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f39464y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f39464y = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object objB = fVar.f39462w;
        Object objE = fu.c.e();
        int i11 = fVar.f39464y;
        if (i11 == 0) {
            o.b(objB);
            final f0 f0VarB = new f0.a().t(str).b();
            l0 l0VarB = g1.b();
            Function0 function0 = new Function0() { // from class: zr.b
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.l(this.f39437a, f0VarB);
                }
            };
            fVar.f39459t = l.a(str);
            fVar.f39460u = file;
            fVar.f39461v = l.a(f0VarB);
            fVar.f39464y = 1;
            objB = a2.b(l0VarB, function0, fVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) fVar.f39460u;
            o.b(objB);
        }
        h0 h0Var = (h0) objB;
        try {
            i0 body = h0Var.getBody();
            InputStream inputStreamA = body != null ? body.a() : null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (inputStreamA != null) {
                    try {
                        gu.b.d(lu.b.b(inputStreamA, fileOutputStream, 0, 2, null));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            lu.c.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                lu.c.a(fileOutputStream, null);
                lu.c.a(inputStreamA, null);
                lu.c.a(h0Var, null);
                return Unit.f21506a;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    lu.c.a(inputStreamA, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                lu.c.a(h0Var, th6);
                throw th7;
            }
        }
    }

    public final File m() {
        File file = new File(new File(this.context.getCacheDir(), ".com.withpersona.sdk2.inquiry"), "fonts");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, UUID.randomUUID().toString());
    }
}
