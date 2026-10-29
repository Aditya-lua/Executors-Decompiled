package com.roblox.client.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.shortcuts.PinShortcutHandler;
import jt.o;
import k6.d0;
import k6.s;
import k6.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pt.l;
import pt.m;
import qt.b;
import sg.k0;
import sg.m0;
import sg.n0;
import sg.q0;
import x6.ErrorResult;
import x6.ImageRequest;
import x6.SuccessResult;
import x6.i;
import x6.j;
import x6.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u000245B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\"\u0010#J0\u0010&\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/J,\u00102\u001a\u000600j\u0002`12\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\bH\u0082@¢\u0006\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/roblox/client/widgets/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "options", "", "variant", "Lcom/roblox/client/widgets/a$b;", "i", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;)Lcom/roblox/client/widgets/a$b;", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetId", "config", "", "o", "(Landroid/appwidget/AppWidgetManager;Landroid/content/Context;ILcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;", PinShortcutHandler.EXTRA_PLACE_ID, "thumbnailUrl", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "recentlyPlayedData", "m", "(Ljava/lang/String;Landroid/content/Context;Lcom/roblox/client/widgets/a$b;Landroid/appwidget/AppWidgetManager;ILnt/b;)Ljava/lang/Object;", "k", "(Landroid/content/Context;Lcom/roblox/client/widgets/a$b;Landroid/appwidget/AppWidgetManager;I)V", "Lorg/json/JSONObject;", "experience", "Landroid/widget/RemoteViews;", "remoteViews", "n", "(Lorg/json/JSONObject;Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "jsonArray", "l", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/roblox/client/widgets/a$b;Lorg/json/JSONArray;Lnt/b;)Ljava/lang/Object;", "", "sizeName", "Landroid/app/PendingIntent;", "h", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)Landroid/app/PendingIntent;", "entryPoint", "g", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "f", "(Landroid/content/Context;JLjava/lang/String;Lnt/b;)Ljava/lang/Object;", "b", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f9563a = new a();

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0150a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9564a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9564a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#\"\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, d2 = {"Lcom/roblox/client/widgets/a$b;", "", "", "layoutId", "itemLayoutId", "emptyLayoutId", "totalItems", "", "showRating", "", "typeName", "Lcom/roblox/client/widgets/a$c;", "size", "<init>", "(IIIIZLjava/lang/String;Lcom/roblox/client/widgets/a$c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "setLayoutId", "(I)V", "b", "setItemLayoutId", "setEmptyLayoutId", "d", "f", "setTotalItems", "e", "Z", "()Z", "setShowRating", "(Z)V", "Ljava/lang/String;", "g", "Lcom/roblox/client/widgets/a$c;", "()Lcom/roblox/client/widgets/a$c;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WidgetLayoutConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public int layoutId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public int itemLayoutId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public int emptyLayoutId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public int totalItems;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean showRating;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String typeName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final c size;

        public WidgetLayoutConfig(int i10, int i11, int i12, int i13, boolean z10, @NotNull String typeName, @NotNull c size) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(size, "size");
            this.layoutId = i10;
            this.itemLayoutId = i11;
            this.emptyLayoutId = i12;
            this.totalItems = i13;
            this.showRating = z10;
            this.typeName = typeName;
            this.size = size;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getEmptyLayoutId() {
            return this.emptyLayoutId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getItemLayoutId() {
            return this.itemLayoutId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getLayoutId() {
            return this.layoutId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowRating() {
            return this.showRating;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final c getSize() {
            return this.size;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetLayoutConfig)) {
                return false;
            }
            WidgetLayoutConfig widgetLayoutConfig = (WidgetLayoutConfig) other;
            return this.layoutId == widgetLayoutConfig.layoutId && this.itemLayoutId == widgetLayoutConfig.itemLayoutId && this.emptyLayoutId == widgetLayoutConfig.emptyLayoutId && this.totalItems == widgetLayoutConfig.totalItems && this.showRating == widgetLayoutConfig.showRating && Intrinsics.c(this.typeName, widgetLayoutConfig.typeName) && this.size == widgetLayoutConfig.size;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getTotalItems() {
            return this.totalItems;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTypeName() {
            return this.typeName;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.layoutId) * 31) + Integer.hashCode(this.itemLayoutId)) * 31) + Integer.hashCode(this.emptyLayoutId)) * 31) + Integer.hashCode(this.totalItems)) * 31) + Boolean.hashCode(this.showRating)) * 31) + this.typeName.hashCode()) * 31) + this.size.hashCode();
        }

        @NotNull
        public String toString() {
            return "WidgetLayoutConfig(layoutId=" + this.layoutId + ", itemLayoutId=" + this.itemLayoutId + ", emptyLayoutId=" + this.emptyLayoutId + ", totalItems=" + this.totalItems + ", showRating=" + this.showRating + ", typeName=" + this.typeName + ", size=" + this.size + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/roblox/client/widgets/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        SMALL,
        MEDIUM,
        LARGE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f9574e = b.a(a());
    }

    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", f = "RecentlyPlayedWidgetUpdater.kt", l = {431}, m = "fetchThumbnail", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9575t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9576u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9577v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9578w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9579x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9580y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public long f9581z;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return a.this.f(null, 0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Landroid/widget/RemoteViews;", "<anonymous>", "(Lku/p0;)Landroid/widget/RemoteViews;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater$renderMedLargeLayout$2", f = "RecentlyPlayedWidgetUpdater.kt", l = {290}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, nt.b<? super RemoteViews>, Object> {
        public final /* synthetic */ RemoteViews A;
        public final /* synthetic */ JSONArray B;
        public final /* synthetic */ WidgetLayoutConfig C;
        public final /* synthetic */ Context D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9582t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9583u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9584v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9585w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9586x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public long f9587y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9588z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RemoteViews remoteViews, JSONArray jSONArray, WidgetLayoutConfig widgetLayoutConfig, Context context, nt.b<? super e> bVar) {
            super(2, bVar);
            this.A = remoteViews;
            this.B = jSONArray;
            this.C = widgetLayoutConfig;
            this.D = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.A, this.B, this.C, this.D, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0048  */
        /* JADX WARN: Code duplicated, block: B:12:0x0080 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:13:0x0081  */
        /* JADX WARN: Code duplicated, block: B:16:0x00c3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0081 -> B:14:0x0082). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super RemoteViews> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", f = "RecentlyPlayedWidgetUpdater.kt", l = {MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 209}, m = "renderRecentlyPlayed", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends pt.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9589t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9590u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9591v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9592w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9593x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9594y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9595z;

        public f(nt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return a.this.m(null, null, null, null, 0, this);
        }
    }

    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", f = "RecentlyPlayedWidgetUpdater.kt", l = {251}, m = "renderSmallLayout", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends pt.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9596t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9597u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9598v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9599w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9600x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9601y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public long f9602z;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return a.this.n(null, null, null, null, this);
        }
    }

    @pt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", f = "RecentlyPlayedWidgetUpdater.kt", l = {147, 165}, m = "updateRecentlyPlayedWidget", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h extends pt.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9603t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9604u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9605v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9606w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9607x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f9608y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f9609z;

        public h(nt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9609z = obj;
            this.B |= Integer.MIN_VALUE;
            return a.this.o(null, null, 0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Context context, long j10, String str, nt.b<? super Bitmap> bVar) throws Throwable {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.C = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objD = dVar.A;
        Object objE = ot.c.e();
        int i11 = dVar.C;
        if (i11 == 0) {
            o.b(objD);
            s sVarA = d0.a(context);
            RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            String cachedWidgetVariant = recentlyPlayedWidgetHandler.getCachedWidgetVariant(applicationContext);
            String strJ = j(String.valueOf(j10), str, cachedWidgetVariant);
            ImageRequest.a aVarJ = new ImageRequest.a(context).c(str).f(strJ).j(strJ);
            x6.c cVar = x6.c.READ_ONLY;
            ImageRequest imageRequestB = i.j(j.a(j.b(aVarJ.l(cVar).g(cVar).m(x6.c.DISABLED), Bitmap.Config.RGB_565), false), new c7.b(16.0f)).b();
            dVar.f9575t = l.a(context);
            dVar.f9576u = l.a(str);
            dVar.f9577v = l.a(sVarA);
            dVar.f9578w = l.a(cachedWidgetVariant);
            dVar.f9579x = l.a(strJ);
            dVar.f9580y = l.a(imageRequestB);
            dVar.f9581z = j10;
            dVar.C = 1;
            objD = sVarA.d(imageRequestB, dVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objD);
        }
        k kVar = (k) objD;
        if (kVar instanceof ErrorResult) {
            throw ((ErrorResult) kVar).getThrowable();
        }
        Intrinsics.d(kVar, "null cannot be cast to non-null type coil3.request.SuccessResult");
        return v.g(((SuccessResult) kVar).getImage(), 0, 0, 3, null);
    }

    public final PendingIntent g(Context context, String entryPoint, String sizeName) {
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("roblox").authority("open").appendPath("widget").appendQueryParameter("entry_point", entryPoint).appendQueryParameter("joinAttemptOrigin", "RecentsWidget" + sizeName).build());
        intent.setPackage(context.getPackageName());
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, entryPoint.hashCode(), intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public final PendingIntent h(Context context, Long placeId, String sizeName) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("roblox").authority("experiences").appendPath("start").appendQueryParameter("joinAttemptOrigin", "RecentsWidget" + sizeName);
        if (placeId != null) {
            builderAppendQueryParameter.appendQueryParameter(PinShortcutHandler.EXTRA_PLACE_ID, String.valueOf(placeId.longValue()));
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setPackage(context.getPackageName());
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, placeId != null ? (int) placeId.longValue() : 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @NotNull
    public final WidgetLayoutConfig i(@NotNull Context context, @NotNull Bundle options, @NotNull String variant) {
        WidgetLayoutConfig widgetLayoutConfig;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(variant, "variant");
        float f10 = options.getInt("appWidgetMinWidth") * context.getResources().getDisplayMetrics().density;
        float f11 = options.getInt("appWidgetMinHeight") * context.getResources().getDisplayMetrics().density;
        float dimension = context.getResources().getDimension(k0.f30794e);
        float dimension2 = context.getResources().getDimension(k0.f30793d);
        RecentlyPlayedWidgetHandler.a aVar = RecentlyPlayedWidgetHandler.a.V2;
        if (Intrinsics.c(variant, aVar.getValue())) {
            int i10 = n0.D;
            widgetLayoutConfig = new WidgetLayoutConfig(i10, i10, n0.f30894t, 1, true, "Small_V2", c.SMALL);
        } else {
            int i11 = n0.C;
            widgetLayoutConfig = new WidgetLayoutConfig(i11, i11, n0.f30894t, 1, true, "Small_V1", c.SMALL);
        }
        WidgetLayoutConfig widgetLayoutConfig2 = Intrinsics.c(variant, aVar.getValue()) ? new WidgetLayoutConfig(n0.B, n0.A, n0.f30893s, 4, true, "Medium_V2", c.MEDIUM) : new WidgetLayoutConfig(n0.f30899y, n0.f30900z, n0.f30893s, 3, true, "Medium_V1", c.MEDIUM);
        WidgetLayoutConfig widgetLayoutConfig3 = Intrinsics.c(variant, aVar.getValue()) ? new WidgetLayoutConfig(n0.f30898x, n0.f30897w, n0.f30893s, 12, false, "Large_V2", c.LARGE) : new WidgetLayoutConfig(n0.f30895u, n0.f30896v, n0.f30893s, 5, true, "Large_V1", c.LARGE);
        if (f10 <= dimension || f11 <= dimension2) {
            return f10 > dimension ? widgetLayoutConfig2 : widgetLayoutConfig;
        }
        return widgetLayoutConfig3;
    }

    @NotNull
    public final String j(@NotNull String placeId, @NotNull String thumbnailUrl, @NotNull String variant) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(variant, "variant");
        if (!Intrinsics.c(variant, RecentlyPlayedWidgetHandler.a.V2.getValue())) {
            return "thumb_" + placeId;
        }
        return "thumb_" + placeId + "_" + thumbnailUrl.hashCode();
    }

    public final void k(Context context, WidgetLayoutConfig config, AppWidgetManager appWidgetManager, int appWidgetId) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), config.getEmptyLayoutId());
        remoteViews.setOnClickPendingIntent(m0.f30869x, th.h.a().x() ? f9563a.g(context, "empty", config.getTypeName()) : f9563a.h(context, null, config.getTypeName()));
        int i10 = C0150a.f9564a[config.getSize().ordinal()];
        if (i10 == 1) {
            remoteViews.setViewVisibility(m0.f30868w, 0);
        } else if (i10 == 2) {
            remoteViews.setViewVisibility(m0.f30868w, 8);
        } else if (i10 != 3) {
            throw new jt.l();
        }
        appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
    }

    public final Object l(Context context, RemoteViews remoteViews, WidgetLayoutConfig widgetLayoutConfig, JSONArray jSONArray, nt.b<? super RemoteViews> bVar) {
        return ku.i.g(g1.b(), new e(remoteViews, jSONArray, widgetLayoutConfig, context, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object m(String str, Context context, WidgetLayoutConfig widgetLayoutConfig, AppWidgetManager appWidgetManager, int i10, nt.b<? super Unit> bVar) throws JSONException {
        f fVar;
        RemoteViews remoteViews;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i11 = fVar.C;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.C = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.A;
        Object objE = ot.c.e();
        int i12 = fVar2.C;
        if (i12 == 0) {
            o.b(obj);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), widgetLayoutConfig.getLayoutId());
            JSONArray jSONArray = new JSONArray(str);
            if (widgetLayoutConfig.getSize() == c.SMALL) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                fVar2.f9589t = l.a(str);
                fVar2.f9590u = l.a(context);
                fVar2.f9591v = l.a(widgetLayoutConfig);
                fVar2.f9592w = appWidgetManager;
                fVar2.f9593x = remoteViews2;
                fVar2.f9594y = l.a(jSONArray);
                fVar2.f9595z = i10;
                fVar2.C = 1;
                if (n(jSONObject, context, remoteViews2, widgetLayoutConfig, fVar2) != objE) {
                    remoteViews = remoteViews2;
                    Unit unit = Unit.f22483a;
                }
            } else {
                fVar2.f9589t = l.a(str);
                fVar2.f9590u = l.a(context);
                fVar2.f9591v = l.a(widgetLayoutConfig);
                fVar2.f9592w = appWidgetManager;
                fVar2.f9593x = remoteViews2;
                fVar2.f9594y = l.a(jSONArray);
                fVar2.f9595z = i10;
                fVar2.C = 2;
                if (l(context, remoteViews2, widgetLayoutConfig, jSONArray, fVar2) != objE) {
                    remoteViews = remoteViews2;
                }
            }
            return objE;
        }
        if (i12 == 1) {
            i10 = fVar2.f9595z;
            remoteViews = (RemoteViews) fVar2.f9593x;
            appWidgetManager = (AppWidgetManager) fVar2.f9592w;
            o.b(obj);
            Unit unit2 = Unit.f22483a;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = fVar2.f9595z;
            remoteViews = (RemoteViews) fVar2.f9593x;
            appWidgetManager = (AppWidgetManager) fVar2.f9592w;
            o.b(obj);
        }
        appWidgetManager.updateAppWidget(i10, remoteViews);
        return Unit.f22483a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object n(JSONObject jSONObject, Context context, RemoteViews remoteViews, WidgetLayoutConfig widgetLayoutConfig, nt.b<? super Unit> bVar) throws Throwable {
        g gVar;
        String strOptString;
        Object obj;
        Context context2;
        JSONObject jSONObject2;
        long j10;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.C = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        g gVar2 = gVar;
        Object obj2 = gVar2.A;
        Object objE = ot.c.e();
        int i11 = gVar2.C;
        if (i11 == 0) {
            o.b(obj2);
            long jOptLong = jSONObject.optLong(PinShortcutHandler.EXTRA_PLACE_ID);
            String strOptString2 = jSONObject.optString("thumbnailUrl");
            strOptString = jSONObject.optString("name");
            Intrinsics.checkNotNull(strOptString2);
            gVar2.f9596t = jSONObject;
            gVar2.f9597u = context;
            gVar2.f9598v = remoteViews;
            gVar2.f9599w = widgetLayoutConfig;
            gVar2.f9600x = l.a(strOptString2);
            gVar2.f9601y = strOptString;
            gVar2.f9602z = jOptLong;
            gVar2.C = 1;
            Object objF = f(context, jOptLong, strOptString2, gVar2);
            if (objF == objE) {
                return objE;
            }
            obj = objF;
            context2 = context;
            jSONObject2 = jSONObject;
            j10 = jOptLong;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = gVar2.f9602z;
            String str = (String) gVar2.f9601y;
            widgetLayoutConfig = (WidgetLayoutConfig) gVar2.f9599w;
            RemoteViews remoteViews2 = (RemoteViews) gVar2.f9598v;
            context2 = (Context) gVar2.f9597u;
            jSONObject2 = (JSONObject) gVar2.f9596t;
            o.b(obj2);
            strOptString = str;
            remoteViews = remoteViews2;
            obj = obj2;
        }
        remoteViews.setTextViewText(m0.A, strOptString);
        remoteViews.setImageViewBitmap(m0.f30870y, (Bitmap) obj);
        remoteViews.setOnClickPendingIntent(m0.f30871z, f9563a.h(context2, pt.b.e(j10), widgetLayoutConfig.getTypeName()));
        if (widgetLayoutConfig.getShowRating()) {
            remoteViews.setTextViewText(m0.B, context2.getString(q0.D1, jSONObject2.optString("rating")));
        }
        return Unit.f22483a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        if (r1.m(r14, r3, r4, r5, r6, r7) == r0) goto L40;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@org.jetbrains.annotations.NotNull android.appwidget.AppWidgetManager r10, @org.jetbrains.annotations.NotNull android.content.Context r11, int r12, @org.jetbrains.annotations.NotNull com.roblox.client.widgets.a.WidgetLayoutConfig r13, @org.jetbrains.annotations.NotNull nt.b<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.a.o(android.appwidget.AppWidgetManager, android.content.Context, int, com.roblox.client.widgets.a$b, nt.b):java.lang.Object");
    }
}
