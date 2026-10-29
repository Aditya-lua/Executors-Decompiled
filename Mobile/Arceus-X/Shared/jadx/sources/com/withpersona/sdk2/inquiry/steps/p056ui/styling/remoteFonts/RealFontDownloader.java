package com.withpersona.sdk2.inquiry.steps.p056ui.styling.remoteFonts;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.styling.remoteFonts.RealFontDownloader;
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
import kotlin.collections.C7699p;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kr.C7819f;
import kr.InterfaceC7814a;
import mt.C8662a;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7900n2;
import p256ku.C7835a2;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p456u2.C11774c;
import p477ut.C11957b;
import p477ut.C11958c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u00046\u0016\u0010\u001bB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001dH\u0082@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RT\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'2\u001e\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0'8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b%\u0010+R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010-0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader;", "Lkr/a;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Landroid/app/Application;", "context", "Lku/p0;", "coroutineScope", "<init>", "(Lokhttp3/OkHttpClient;Landroid/app/Application;Lku/p0;)V", "Landroid/os/Bundle;", "outState", "", "e", "(Landroid/os/Bundle;)V", "inState", "b", "", "fontUrl", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "onSuccess", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "Lkr/f;", "remoteFonts", "c", "(Ljava/util/List;)V", "Ljava/io/File;", "m", "()Ljava/io/File;", "destinationFile", "k", "(Ljava/lang/String;Ljava/io/File;Lnt/b;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "Landroid/app/Application;", "d", "Lku/p0;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "value", "Ljava/util/Map;", "()Ljava/util/Map;", "fontDownloaderMapping", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "f", "fontCache", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$b;", "g", "Ljava/util/List;", "onFontDownloadedCallbacks", "h", "FontDownloaderState", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RealFontDownloader implements InterfaceC7814a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient okHttpClient;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Application context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<String, InterfaceC4095c> fontCache;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<C4094b> onFontDownloadedCallbacks;

    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontDownloaderState;", "Landroid/os/Parcelable;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontDownloaderMapping", "<init>", "(Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class FontDownloaderState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FontDownloaderState> CREATOR = new C4092a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$FontDownloaderState$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C4092a implements Parcelable.Creator<FontDownloaderState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
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

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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
        /* JADX INFO: renamed from: a */
        public final Map<String, Map<StyleElements.FontWeight, String>> m20933a() {
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$b;", "", "", "url", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "", "onFontDownloaded", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4094b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Function1<Typeface, Unit> onFontDownloaded;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.Typeface, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4094b(@NotNull String url, @NotNull Function1<? super Typeface, Unit> onFontDownloaded) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(onFontDownloaded, "onFontDownloaded");
            this.url = url;
            this.onFontDownloaded = onFontDownloaded;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function1<Typeface, Unit> m20936a() {
            return this.onFontDownloaded;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "", "b", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$a;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$b;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC4095c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$a;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Typeface;", "()Landroid/graphics/Typeface;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Cached implements InterfaceC4095c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
                return (other instanceof Cached) && Intrinsics.m31980c(this.typeface, ((Cached) other).typeface);
            }

            public int hashCode() {
                return this.typeface.hashCode();
            }

            @NotNull
            public String toString() {
                return "Cached(typeface=" + this.typeface + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$c$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c$b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b implements InterfaceC4095c {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f17428a = new b();

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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1", m39664f = "RealFontDownloader.kt", m39665l = {84, 90}, m39666m = "invokeSuspend")
    public static final class C4096d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f17429t;

        /* JADX INFO: renamed from: u */
        public Object f17430u;

        /* JADX INFO: renamed from: v */
        public int f17431v;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f17433x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Function1<Typeface, Unit> f17434y;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1", m39664f = "RealFontDownloader.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f17435t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ Function1<Typeface, Unit> f17436u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Typeface f17437v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ RealFontDownloader f17438w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ String f17439x;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.Typeface, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Typeface, Unit> function1, Typeface typeface, RealFontDownloader realFontDownloader, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f17436u = function1;
                this.f17437v = typeface;
                this.f17438w = realFontDownloader;
                this.f17439x = str;
            }

            /* JADX INFO: renamed from: r */
            public static final boolean m20942r(String str, C4094b c4094b) {
                return Intrinsics.m31980c(c4094b.getUrl(), str);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f17436u, this.f17437v, this.f17438w, this.f17439x, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f17435t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                Function1<Typeface, Unit> function1 = this.f17436u;
                Typeface typeface = this.f17437v;
                Intrinsics.checkNotNull(typeface);
                function1.invoke(typeface);
                List list = this.f17438w.onFontDownloadedCallbacks;
                String str = this.f17439x;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.m31980c(((C4094b) obj2).getUrl(), str)) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = this.f17438w.onFontDownloadedCallbacks;
                final String str2 = this.f17439x;
                C7708u.m31925F(list2, new Function1() { // from class: kr.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(RealFontDownloader.C4096d.a.m20942r(str2, (RealFontDownloader.C4094b) obj3));
                    }
                });
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Function1<Typeface, Unit> function1M20936a = ((C4094b) obj3).m20936a();
                    Typeface typeface2 = this.f17437v;
                    Intrinsics.checkNotNull(typeface2);
                    function1M20936a.invoke(typeface2);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.Typeface, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4096d(String str, Function1<? super Typeface, Unit> function1, InterfaceC9557b<? super C4096d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f17433x = str;
            this.f17434y = function1;
        }

        /* JADX INFO: renamed from: r */
        public static final boolean m20940r(String str, C4094b c4094b) {
            return Intrinsics.m31980c(c4094b.getUrl(), str);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return RealFontDownloader.this.new C4096d(this.f17433x, this.f17434y, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
        
            if (p256ku.C7872i.m32684g(r10, r3, r9) == r0) goto L20;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            File fileM20932m;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f17431v;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    fileM20932m = RealFontDownloader.this.m20932m();
                    RealFontDownloader realFontDownloader = RealFontDownloader.this;
                    String str = this.f17433x;
                    this.f17429t = fileM20932m;
                    this.f17431v = 1;
                    if (realFontDownloader.m20931k(str, fileM20932m, this) == objM38805e) {
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    fileM20932m = (File) this.f17429t;
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
                Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM20932m);
                Map map = RealFontDownloader.this.fontCache;
                String str2 = this.f17433x;
                Intrinsics.checkNotNull(typefaceCreateFromFile);
                map.put(str2, new InterfaceC4095c.Cached(typefaceCreateFromFile));
                fileM20932m.delete();
                AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                a aVar = new a(this.f17434y, typefaceCreateFromFile, RealFontDownloader.this, this.f17433x, null);
                this.f17429t = C10350l.m39676a(fileM20932m);
                this.f17430u = C10350l.m39676a(typefaceCreateFromFile);
                this.f17431v = 2;
            } catch (Exception unused) {
                RealFontDownloader.this.fontCache.put(this.f17433x, null);
                List list = RealFontDownloader.this.onFontDownloadedCallbacks;
                final String str3 = this.f17433x;
                C7708u.m31925F(list, new Function1() { // from class: kr.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(RealFontDownloader.C4096d.m20940r(str3, (RealFontDownloader.C4094b) obj2));
                    }
                });
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C4096d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$e */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader", m39664f = "RealFontDownloader.kt", m39665l = {138}, m39666m = "downloadFontFile")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4097e extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f17440t;

        /* JADX INFO: renamed from: u */
        public Object f17441u;

        /* JADX INFO: renamed from: v */
        public Object f17442v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f17443w;

        /* JADX INFO: renamed from: y */
        public int f17445y;

        public C4097e(InterfaceC9557b<? super C4097e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17443w = obj;
            this.f17445y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RealFontDownloader.this.m20931k(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$f */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4098f<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(Boolean.valueOf(((C7819f) t10).m32435d()), Boolean.valueOf(((C7819f) t8).m32435d()));
        }
    }

    public RealFontDownloader(@NotNull OkHttpClient okHttpClient, @NotNull Application context, @NotNull InterfaceC7906p0 coroutineScope) {
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

    /* JADX INFO: renamed from: l */
    public static final Response m20925l(RealFontDownloader realFontDownloader, Request request) {
        return realFontDownloader.okHttpClient.newCall(request).execute();
    }

    @Override // kr.InterfaceC7814a
    /* JADX INFO: renamed from: a */
    public void mo20926a(@NotNull String fontUrl, @NotNull Function1<? super Typeface, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(fontUrl, "fontUrl");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        InterfaceC4095c interfaceC4095c = this.fontCache.get(fontUrl);
        if (interfaceC4095c instanceof InterfaceC4095c.Cached) {
            onSuccess.invoke(((InterfaceC4095c.Cached) interfaceC4095c).getTypeface());
            return;
        }
        InterfaceC4095c.b bVar = InterfaceC4095c.b.f17428a;
        if (Intrinsics.m31980c(interfaceC4095c, bVar)) {
            this.onFontDownloadedCallbacks.add(new C4094b(fontUrl, onSuccess));
        } else {
            if (interfaceC4095c != null) {
                throw new C7345l();
            }
            this.fontCache.put(fontUrl, bVar);
            C7882k.m32780d(this.coroutineScope, null, null, new C4096d(fontUrl, onSuccess, null), 3, null);
        }
    }

    @Override // kr.InterfaceC7814a
    /* JADX INFO: renamed from: b */
    public void mo20927b(@Nullable Bundle inState) {
        Map<String, Map<StyleElements.FontWeight, String>> linkedHashMap;
        FontDownloaderState fontDownloaderState;
        if (inState == null || (fontDownloaderState = (FontDownloaderState) C11774c.m44055a(inState, "font_downloader_mapping", FontDownloaderState.class)) == null || (linkedHashMap = fontDownloaderState.m20933a()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.fontDownloaderMapping = linkedHashMap;
    }

    @Override // kr.InterfaceC7814a
    /* JADX INFO: renamed from: c */
    public void mo20928c(@Nullable List<C7819f> remoteFonts) {
        if (remoteFonts == null) {
            remoteFonts = C7699p.m31892k();
        }
        for (C7819f c7819f : CollectionsKt.m31680F0(remoteFonts, new C4098f())) {
            String fontFamilyName = c7819f.getFontFamilyName();
            String url = c7819f.getUrl();
            StyleElements.FontWeight fontWeight = c7819f.getFontWeight();
            if (fontFamilyName != null && url != null && fontWeight != null) {
                Map<String, Map<StyleElements.FontWeight, String>> mapMo20929d = mo20929d();
                Map<StyleElements.FontWeight, String> linkedHashMap = mapMo20929d.get(fontFamilyName);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    mapMo20929d.put(fontFamilyName, linkedHashMap);
                }
                linkedHashMap.put(fontWeight, url);
            }
        }
    }

    @Override // kr.InterfaceC7814a
    @NotNull
    /* JADX INFO: renamed from: d */
    public Map<String, Map<StyleElements.FontWeight, String>> mo20929d() {
        return this.fontDownloaderMapping;
    }

    @Override // kr.InterfaceC7814a
    /* JADX INFO: renamed from: e */
    public void mo20930e(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("font_downloader_mapping", new FontDownloaderState(mo20929d()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m20931k(String str, File file, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C4097e c4097e;
        if (interfaceC9557b instanceof C4097e) {
            c4097e = (C4097e) interfaceC9557b;
            int i10 = c4097e.f17445y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c4097e.f17445y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c4097e = new C4097e(interfaceC9557b);
            }
        } else {
            c4097e = new C4097e(interfaceC9557b);
        }
        Object objM32562b = c4097e.f17443w;
        Object objM38805e = C10047c.m38805e();
        int i11 = c4097e.f17445y;
        if (i11 == 0) {
            C7348o.m30470b(objM32562b);
            final Request requestBuild = new Request.Builder().url(str).build();
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            Function0 function0 = new Function0() { // from class: kr.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealFontDownloader.m20925l(this.f29622a, requestBuild);
                }
            };
            c4097e.f17440t = C10350l.m39676a(str);
            c4097e.f17441u = file;
            c4097e.f17442v = C10350l.m39676a(requestBuild);
            c4097e.f17445y = 1;
            objM32562b = C7835a2.m32562b(abstractC7888l0M32644b, function0, c4097e);
            if (objM32562b == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) c4097e.f17441u;
            C7348o.m30470b(objM32562b);
        }
        Response response = (Response) objM32562b;
        try {
            ResponseBody responseBodyBody = response.body();
            InputStream inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (inputStreamByteStream != null) {
                    try {
                        C10340b.m39662e(C11957b.m44627b(inputStreamByteStream, fileOutputStream, 0, 2, null));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C11958c.m44629a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                C11958c.m44629a(fileOutputStream, null);
                C11958c.m44629a(inputStreamByteStream, null);
                C11958c.m44629a(response, null);
                return Unit.f29331a;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    C11958c.m44629a(inputStreamByteStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                C11958c.m44629a(response, th6);
                throw th7;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final File m20932m() {
        File file = new File(new File(this.context.getCacheDir(), ".com.withpersona.sdk2.inquiry"), "fonts");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, UUID.randomUUID().toString());
    }
}
