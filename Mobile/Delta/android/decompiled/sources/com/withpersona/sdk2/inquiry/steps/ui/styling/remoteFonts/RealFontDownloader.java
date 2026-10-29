package com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jt.l;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kr.a;
import ku.a2;
import ku.g1;
import ku.k;
import ku.l0;
import ku.p0;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u00046\u0016\u0010\u001bB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RT\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'2\u001e\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b%\u0010+R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010-0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader;", "Lkr/a;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Landroid/app/Application;", "context", "Lku/p0;", "coroutineScope", "<init>", "(Lokhttp3/OkHttpClient;Landroid/app/Application;Lku/p0;)V", "Landroid/os/Bundle;", "outState", "", "e", "(Landroid/os/Bundle;)V", "inState", "b", "", "fontUrl", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onSuccess", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "Lkr/f;", "remoteFonts", "c", "(Ljava/util/List;)V", "Ljava/io/File;", "m", "()Ljava/io/File;", "destinationFile", "k", "(Ljava/lang/String;Ljava/io/File;Lnt/b;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "Landroid/app/Application;", "d", "Lku/p0;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "value", "Ljava/util/Map;", "()Ljava/util/Map;", "fontDownloaderMapping", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "f", "fontCache", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$b;", "g", "Ljava/util/List;", "onFontDownloadedCallbacks", "h", "FontDownloaderState", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            public static final b f13623a = new b();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1", f = "RealFontDownloader.kt", l = {84, 90}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13624t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13625u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13626v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13628x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<Typeface, Unit> f13629y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1", f = "RealFontDownloader.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f13630t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Function1<Typeface, Unit> f13631u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Typeface f13632v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ RealFontDownloader f13633w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f13634x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Typeface, Unit> function1, Typeface typeface, RealFontDownloader realFontDownloader, String str, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f13631u = function1;
                this.f13632v = typeface;
                this.f13633w = realFontDownloader;
                this.f13634x = str;
            }

            public static final boolean r(String str, b bVar) {
                return Intrinsics.c(bVar.getUrl(), str);
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f13631u, this.f13632v, this.f13633w, this.f13634x, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f13630t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Function1<Typeface, Unit> function1 = this.f13631u;
                Typeface typeface = this.f13632v;
                Intrinsics.checkNotNull(typeface);
                function1.invoke(typeface);
                List list = this.f13633w.onFontDownloadedCallbacks;
                String str = this.f13634x;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.c(((b) obj2).getUrl(), str)) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = this.f13633w.onFontDownloadedCallbacks;
                final String str2 = this.f13634x;
                u.F(list2, new Function1() { // from class: kr.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(RealFontDownloader.d.a.r(str2, (RealFontDownloader.b) obj3));
                    }
                });
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Function1<Typeface, Unit> function1A = ((b) obj3).a();
                    Typeface typeface2 = this.f13632v;
                    Intrinsics.checkNotNull(typeface2);
                    function1A.invoke(typeface2);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function1<? super Typeface, Unit> function1, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f13628x = str;
            this.f13629y = function1;
        }

        public static final boolean r(String str, b bVar) {
            return Intrinsics.c(bVar.getUrl(), str);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return RealFontDownloader.this.new d(this.f13628x, this.f13629y, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
        
            if (ku.i.g(r10, r3, r9) == r0) goto L20;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r9.f13626v
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r9.f13625u
                android.graphics.Typeface r0 = (android.graphics.Typeface) r0
                java.lang.Object r0 = r9.f13624t
                java.io.File r0 = (java.io.File) r0
                jt.o.b(r10)     // Catch: java.lang.Exception -> L82
                goto L9e
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f13624t
                java.io.File r1 = (java.io.File) r1
                jt.o.b(r10)     // Catch: java.lang.Exception -> L82
                goto L43
            L2b:
                jt.o.b(r10)
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.io.File r1 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.i(r10)     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.lang.String r4 = r9.f13628x     // Catch: java.lang.Exception -> L82
                r9.f13624t = r1     // Catch: java.lang.Exception -> L82
                r9.f13626v = r3     // Catch: java.lang.Exception -> L82
                java.lang.Object r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.g(r10, r4, r1, r9)     // Catch: java.lang.Exception -> L82
                if (r10 != r0) goto L43
                goto L81
            L43:
                android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r1)     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.util.Map r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.h(r10)     // Catch: java.lang.Exception -> L82
                java.lang.String r3 = r9.f13628x     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a r4 = new com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a     // Catch: java.lang.Exception -> L82
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Exception -> L82
                r4.<init>(r5)     // Catch: java.lang.Exception -> L82
                r10.put(r3, r4)     // Catch: java.lang.Exception -> L82
                r1.delete()     // Catch: java.lang.Exception -> L82
                ku.n2 r10 = ku.g1.c()     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$d$a r3 = new com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$d$a     // Catch: java.lang.Exception -> L82
                kotlin.jvm.functions.Function1<android.graphics.Typeface, kotlin.Unit> r4 = r9.f13629y     // Catch: java.lang.Exception -> L82
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r6 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this     // Catch: java.lang.Exception -> L82
                java.lang.String r7 = r9.f13628x     // Catch: java.lang.Exception -> L82
                r8 = 0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L82
                java.lang.Object r1 = pt.l.a(r1)     // Catch: java.lang.Exception -> L82
                r9.f13624t = r1     // Catch: java.lang.Exception -> L82
                java.lang.Object r1 = pt.l.a(r5)     // Catch: java.lang.Exception -> L82
                r9.f13625u = r1     // Catch: java.lang.Exception -> L82
                r9.f13626v = r2     // Catch: java.lang.Exception -> L82
                java.lang.Object r10 = ku.i.g(r10, r3, r9)     // Catch: java.lang.Exception -> L82
                if (r10 != r0) goto L9e
            L81:
                return r0
            L82:
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this
                java.util.Map r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.h(r10)
                java.lang.String r0 = r9.f13628x
                r1 = 0
                r10.put(r0, r1)
                com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.this
                java.util.List r10 = com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.j(r10)
                java.lang.String r0 = r9.f13628x
                kr.c r1 = new kr.c
                r1.<init>()
                kotlin.collections.u.F(r10, r1)
            L9e:
                kotlin.Unit r10 = kotlin.Unit.f22483a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader", f = "RealFontDownloader.kt", l = {138}, m = "downloadFontFile")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13635t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13636u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f13637v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f13638w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13640y;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13638w = obj;
            this.f13640y |= Integer.MIN_VALUE;
            return RealFontDownloader.this.k(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return mt.a.a(Boolean.valueOf(((kr.f) t10).d()), Boolean.valueOf(((kr.f) t8).d()));
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

    @Override // kr.a
    public void a(@NotNull String fontUrl, @NotNull Function1<? super Typeface, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(fontUrl, "fontUrl");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        c cVar = this.fontCache.get(fontUrl);
        if (cVar instanceof c.Cached) {
            onSuccess.invoke(((c.Cached) cVar).getTypeface());
            return;
        }
        c.b bVar = c.b.f13623a;
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

    @Override // kr.a
    public void b(@Nullable Bundle inState) {
        Map<String, Map<StyleElements.FontWeight, String>> linkedHashMap;
        FontDownloaderState fontDownloaderState;
        if (inState == null || (fontDownloaderState = (FontDownloaderState) u2.c.a(inState, "font_downloader_mapping", FontDownloaderState.class)) == null || (linkedHashMap = fontDownloaderState.a()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.fontDownloaderMapping = linkedHashMap;
    }

    @Override // kr.a
    public void c(@Nullable List<kr.f> remoteFonts) {
        if (remoteFonts == null) {
            remoteFonts = p.k();
        }
        for (kr.f fVar : CollectionsKt.F0(remoteFonts, new f())) {
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

    @Override // kr.a
    @NotNull
    public Map<String, Map<StyleElements.FontWeight, String>> d() {
        return this.fontDownloaderMapping;
    }

    @Override // kr.a
    public void e(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("font_downloader_mapping", new FontDownloaderState(d()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, File file, nt.b<? super Unit> bVar) {
        e eVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f13640y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f13640y = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object objB = eVar.f13638w;
        Object objE = ot.c.e();
        int i11 = eVar.f13640y;
        if (i11 == 0) {
            o.b(objB);
            final Request requestBuild = new Request.Builder().url(str).build();
            l0 l0VarB = g1.b();
            Function0 function0 = new Function0() { // from class: kr.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealFontDownloader.l(this.f22709a, requestBuild);
                }
            };
            eVar.f13635t = pt.l.a(str);
            eVar.f13636u = file;
            eVar.f13637v = pt.l.a(requestBuild);
            eVar.f13640y = 1;
            objB = a2.b(l0VarB, function0, eVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) eVar.f13636u;
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
                        pt.b.e(ut.b.b(inputStreamByteStream, fileOutputStream, 0, 2, null));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ut.c.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                ut.c.a(fileOutputStream, null);
                ut.c.a(inputStreamByteStream, null);
                ut.c.a(response, null);
                return Unit.f22483a;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ut.c.a(inputStreamByteStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                ut.c.a(response, th6);
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
