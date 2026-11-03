package com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import gt.l;
import gt.o;
import ir.a;
import iu.a2;
import iu.g1;
import iu.k;
import iu.l0;
import iu.p0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.m;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u00046\u0016\u0010\u001bB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RT\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'2\u001e\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b%\u0010+R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010-0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader;", "Lir/a;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Landroid/app/Application;", "context", "Liu/p0;", "coroutineScope", "<init>", "(Lokhttp3/OkHttpClient;Landroid/app/Application;Liu/p0;)V", "Landroid/os/Bundle;", "outState", "", "e", "(Landroid/os/Bundle;)V", "inState", "b", "", "fontUrl", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onSuccess", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "Lir/f;", "remoteFonts", "c", "(Ljava/util/List;)V", "Ljava/io/File;", "m", "()Ljava/io/File;", "destinationFile", "k", "(Ljava/lang/String;Ljava/io/File;Llt/b;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "Landroid/app/Application;", "d", "Liu/p0;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "value", "Ljava/util/Map;", "()Ljava/util/Map;", "fontDownloaderMapping", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "f", "fontCache", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$b;", "g", "Ljava/util/List;", "onFontDownloadedCallbacks", "h", "FontDownloaderState", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RealFontDownloader implements a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient okHttpClient;

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
    public final Map<String, c> fontCache;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<b> onFontDownloadedCallbacks;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontDownloaderState;", "Landroid/os/Parcelable;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontDownloaderMapping", "<init>", "(Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FontDownloaderState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FontDownloaderState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FontDownloaderState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FontDownloaderState createFromParcel(Parcel parcel) {
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
                return new FontDownloaderState(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FontDownloaderState[] newArray(int i10) {
                return new FontDownloaderState[i10];
            }
        }

        public FontDownloaderState(@NotNull Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping) {
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$b;", "", "", "url", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "", "onFontDownloaded", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "", "b", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$a;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$b;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$a;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cached implements c {

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f13704a = new b();

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

    @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1", f = "RealFontDownloader.kt", l = {84, 90}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13705t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13706u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13707v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13709x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<Typeface, Unit> f13710y;

        @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1", f = "RealFontDownloader.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f13711t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function1<Typeface, Unit> f13712u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Typeface f13713v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ RealFontDownloader f13714w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f13715x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Typeface, Unit> function1, Typeface typeface, RealFontDownloader realFontDownloader, String str, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f13712u = function1;
                this.f13713v = typeface;
                this.f13714w = realFontDownloader;
                this.f13715x = str;
            }

            public static final boolean n(String str, b bVar) {
                return Intrinsics.c(bVar.getUrl(), str);
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f13712u, this.f13713v, this.f13714w, this.f13715x, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f13711t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Function1<Typeface, Unit> function1 = this.f13712u;
                Typeface typeface = this.f13713v;
                Intrinsics.checkNotNull(typeface);
                function1.invoke(typeface);
                List list = this.f13714w.onFontDownloadedCallbacks;
                String str = this.f13715x;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.c(((b) obj2).getUrl(), str)) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = this.f13714w.onFontDownloadedCallbacks;
                final String str2 = this.f13715x;
                u.F(list2, new Function1() { // from class: ir.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(RealFontDownloader.d.a.n(str2, (RealFontDownloader.b) obj3));
                    }
                });
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Function1<Typeface, Unit> function1A = ((b) obj3).a();
                    Typeface typeface2 = this.f13713v;
                    Intrinsics.checkNotNull(typeface2);
                    function1A.invoke(typeface2);
                }
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function1<? super Typeface, Unit> function1, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f13709x = str;
            this.f13710y = function1;
        }

        public static final boolean n(String str, b bVar) {
            return Intrinsics.c(bVar.getUrl(), str);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return RealFontDownloader.this.new d(this.f13709x, this.f13710y, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
        
            if (iu.i.g(r10, r3, r9) == r0) goto L20;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r9.f13707v
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r9.f13706u
                android.graphics.Typeface r0 = (android.graphics.Typeface) r0
                java.lang.Object r0 = r9.f13705t
                java.io.File r0 = (java.io.File) r0
                gt.o.b(r10)     // Catch: java.lang.Exception -> L82
                goto L9e
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f13705t
                java.io.File r1 = (java.io.File) r1
                gt.o.b(r10)     // Catch: java.lang.Exception -> L82
                goto L43
            L2b:
                gt.o.b(r10)
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.io.File r1 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.i(r10)     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.lang.String r4 = r9.f13709x     // Catch: java.lang.Exception -> L82
                r9.f13705t = r1     // Catch: java.lang.Exception -> L82
                r9.f13707v = r3     // Catch: java.lang.Exception -> L82
                java.lang.Object r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.g(r10, r4, r1, r9)     // Catch: java.lang.Exception -> L82
                if (r10 != r0) goto L43
                goto L81
            L43:
                android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r1)     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.util.Map r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.h(r10)     // Catch: java.lang.Exception -> L82
                java.lang.String r3 = r9.f13709x     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a r4 = new com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a     // Catch: java.lang.Exception -> L82
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Exception -> L82
                r4.<init>(r5)     // Catch: java.lang.Exception -> L82
                r10.put(r3, r4)     // Catch: java.lang.Exception -> L82
                r1.delete()     // Catch: java.lang.Exception -> L82
                iu.n2 r10 = iu.g1.c()     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$d$a r3 = new com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$d$a     // Catch: java.lang.Exception -> L82
                kotlin.jvm.functions.Function1<android.graphics.Typeface, kotlin.Unit> r4 = r9.f13710y     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r6 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.lang.String r7 = r9.f13709x     // Catch: java.lang.Exception -> L82
                r8 = 0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L82
                java.lang.Object r1 = nt.l.a(r1)     // Catch: java.lang.Exception -> L82
                r9.f13705t = r1     // Catch: java.lang.Exception -> L82
                java.lang.Object r1 = nt.l.a(r5)     // Catch: java.lang.Exception -> L82
                r9.f13706u = r1     // Catch: java.lang.Exception -> L82
                r9.f13707v = r2     // Catch: java.lang.Exception -> L82
                java.lang.Object r10 = iu.i.g(r10, r3, r9)     // Catch: java.lang.Exception -> L82
                if (r10 != r0) goto L9e
            L81:
                return r0
            L82:
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this
                java.util.Map r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.h(r10)
                java.lang.String r0 = r9.f13709x
                r1 = 0
                r10.put(r0, r1)
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this
                java.util.List r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.j(r10)
                java.lang.String r0 = r9.f13709x
                ir.c r1 = new ir.c
                r1.<init>()
                kotlin.collections.u.F(r10, r1)
            L9e:
                kotlin.Unit r10 = kotlin.Unit.f22938a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader", f = "RealFontDownloader.kt", l = {138}, m = "downloadFontFile")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13716t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13717u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f13718v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f13719w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13721y;

        public e(lt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13719w = obj;
            this.f13721y |= Integer.MIN_VALUE;
            return RealFontDownloader.this.k(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return kt.a.a(Boolean.valueOf(((ir.f) t10).d()), Boolean.valueOf(((ir.f) t8).d()));
        }
    }

    public RealFontDownloader(@NotNull OkHttpClient okHttpClient, @NotNull Application context, @NotNull p0 coroutineScope) {
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

    public static final Response l(RealFontDownloader realFontDownloader, Request request) {
        return realFontDownloader.okHttpClient.newCall(request).execute();
    }

    @Override // ir.a
    public void a(@NotNull String fontUrl, @NotNull Function1<? super Typeface, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(fontUrl, "fontUrl");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        c cVar = this.fontCache.get(fontUrl);
        if (cVar instanceof c.Cached) {
            onSuccess.invoke(((c.Cached) cVar).getTypeface());
            return;
        }
        c.b bVar = c.b.f13704a;
        if (Intrinsics.c(cVar, bVar)) {
            this.onFontDownloadedCallbacks.add(new b(fontUrl, onSuccess));
        } else {
            if (cVar != null) {
                throw new l();
            }
            this.fontCache.put(fontUrl, bVar);
            k.d(this.coroutineScope, null, null, new d(fontUrl, onSuccess, null), 3, null);
        }
    }

    @Override // ir.a
    public void b(@Nullable Bundle inState) {
        Map<String, Map<StyleElements.FontWeight, String>> linkedHashMap;
        FontDownloaderState fontDownloaderState;
        if (inState == null || (fontDownloaderState = (FontDownloaderState) u2.c.a(inState, "font_downloader_mapping", FontDownloaderState.class)) == null || (linkedHashMap = fontDownloaderState.a()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.fontDownloaderMapping = linkedHashMap;
    }

    @Override // ir.a
    public void c(@Nullable List<ir.f> remoteFonts) {
        if (remoteFonts == null) {
            remoteFonts = p.k();
        }
        for (ir.f fVar : CollectionsKt.F0(remoteFonts, new f())) {
            String fontFamilyName = fVar.getFontFamilyName();
            String url = fVar.getUrl();
            StyleElements.FontWeight fontWeight = fVar.getFontWeight();
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

    @Override // ir.a
    @NotNull
    public Map<String, Map<StyleElements.FontWeight, String>> d() {
        return this.fontDownloaderMapping;
    }

    @Override // ir.a
    public void e(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("font_downloader_mapping", new FontDownloaderState(d()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, File file, lt.b<? super Unit> bVar) {
        e eVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f13721y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f13721y = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object objB = eVar.f13719w;
        Object objE = mt.c.e();
        int i11 = eVar.f13721y;
        if (i11 == 0) {
            o.b(objB);
            final Request requestBuild = new Request.Builder().url(str).build();
            l0 l0VarB = g1.b();
            Function0 function0 = new Function0() { // from class: ir.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealFontDownloader.l(this.f21313a, requestBuild);
                }
            };
            eVar.f13716t = nt.l.a(str);
            eVar.f13717u = file;
            eVar.f13718v = nt.l.a(requestBuild);
            eVar.f13721y = 1;
            objB = a2.b(l0VarB, function0, eVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) eVar.f13717u;
            o.b(objB);
        }
        Response response = (Response) objB;
        try {
            ResponseBody responseBodyBody = response.body();
            InputStream inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (inputStreamByteStream != null) {
                    try {
                        nt.b.e(st.b.b(inputStreamByteStream, fileOutputStream, 0, 2, null));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            st.c.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                st.c.a(fileOutputStream, null);
                st.c.a(inputStreamByteStream, null);
                st.c.a(response, null);
                return Unit.f22938a;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    st.c.a(inputStreamByteStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                st.c.a(response, th6);
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
