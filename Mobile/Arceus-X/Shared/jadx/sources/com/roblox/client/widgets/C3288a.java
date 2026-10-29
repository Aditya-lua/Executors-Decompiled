package com.roblox.client.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.shortcuts.PinShortcutHandler;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lk.C8156c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p043c7.C1552b;
import p151gk.C6124q;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p239k6.C7458d0;
import p239k6.C7482v;
import p239k6.InterfaceC7479s;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p443t6.C11537g;
import p537x6.C12748i;
import p537x6.C12749j;
import p537x6.EnumC12742c;
import p537x6.ErrorResult;
import p537x6.ImageRequest;
import p537x6.InterfaceC12750k;
import p537x6.SuccessResult;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11329k0;
import sg.C11335m0;
import sg.C11338n0;
import sg.C11347q0;
import th.C11659h;

/* JADX INFO: renamed from: com.roblox.client.widgets.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u000245B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\"\u0010#J0\u0010&\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/J,\u00102\u001a\u000600j\u0002`12\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\bH\u0082@¢\u0006\u0004\b2\u00103¨\u00066"}, m31665d2 = {"Lcom/roblox/client/widgets/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "options", "", "variant", "Lcom/roblox/client/widgets/a$b;", "i", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;)Lcom/roblox/client/widgets/a$b;", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetId", "config", "", "o", "(Landroid/appwidget/AppWidgetManager;Landroid/content/Context;ILcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;", PinShortcutHandler.EXTRA_PLACE_ID, "thumbnailUrl", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "recentlyPlayedData", "m", "(Ljava/lang/String;Landroid/content/Context;Lcom/roblox/client/widgets/a$b;Landroid/appwidget/AppWidgetManager;ILnt/b;)Ljava/lang/Object;", "k", "(Landroid/content/Context;Lcom/roblox/client/widgets/a$b;Landroid/appwidget/AppWidgetManager;I)V", "Lorg/json/JSONObject;", "experience", "Landroid/widget/RemoteViews;", "remoteViews", "n", "(Lorg/json/JSONObject;Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "jsonArray", "l", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/roblox/client/widgets/a$b;Lorg/json/JSONArray;Lnt/b;)Ljava/lang/Object;", "", "sizeName", "Landroid/app/PendingIntent;", "h", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)Landroid/app/PendingIntent;", "entryPoint", "g", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "f", "(Landroid/content/Context;JLjava/lang/String;Lnt/b;)Ljava/lang/Object;", "b", "c", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3288a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C3288a f12466a = new C3288a();

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12467a;

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
            f12467a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#\"\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b!\u0010)¨\u0006*"}, m31665d2 = {"Lcom/roblox/client/widgets/a$b;", "", "", "layoutId", "itemLayoutId", "emptyLayoutId", "totalItems", "", "showRating", "", "typeName", "Lcom/roblox/client/widgets/a$c;", "size", "<init>", "(IIIIZLjava/lang/String;Lcom/roblox/client/widgets/a$c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "setLayoutId", "(I)V", "b", "setItemLayoutId", "setEmptyLayoutId", "d", "f", "setTotalItems", "e", "Z", "()Z", "setShowRating", "(Z)V", "Ljava/lang/String;", "g", "Lcom/roblox/client/widgets/a$c;", "()Lcom/roblox/client/widgets/a$c;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class WidgetLayoutConfig {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public int layoutId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public int itemLayoutId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public int emptyLayoutId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public int totalItems;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        public boolean showRating;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @NotNull
        public final String typeName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
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
            return this.layoutId == widgetLayoutConfig.layoutId && this.itemLayoutId == widgetLayoutConfig.itemLayoutId && this.emptyLayoutId == widgetLayoutConfig.emptyLayoutId && this.totalItems == widgetLayoutConfig.totalItems && this.showRating == widgetLayoutConfig.showRating && Intrinsics.m31980c(this.typeName, widgetLayoutConfig.typeName) && this.size == widgetLayoutConfig.size;
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

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/roblox/client/widgets/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum c {
        SMALL,
        MEDIUM,
        LARGE;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f12479e = C10708b.m40805a(m15781a());
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$d */
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", m39664f = "RecentlyPlayedWidgetUpdater.kt", m39665l = {431}, m39666m = "fetchThumbnail", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f12480A;

        /* JADX INFO: renamed from: C */
        public int f12482C;

        /* JADX INFO: renamed from: t */
        public Object f12483t;

        /* JADX INFO: renamed from: u */
        public Object f12484u;

        /* JADX INFO: renamed from: v */
        public Object f12485v;

        /* JADX INFO: renamed from: w */
        public Object f12486w;

        /* JADX INFO: renamed from: x */
        public Object f12487x;

        /* JADX INFO: renamed from: y */
        public Object f12488y;

        /* JADX INFO: renamed from: z */
        public long f12489z;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12480A = obj;
            this.f12482C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3288a.this.m15764f(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Landroid/widget/RemoteViews;", "<anonymous>", "(Lku/p0;)Landroid/widget/RemoteViews;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater$renderMedLargeLayout$2", m39664f = "RecentlyPlayedWidgetUpdater.kt", m39665l = {290}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super RemoteViews>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ RemoteViews f12490A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ JSONArray f12491B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ WidgetLayoutConfig f12492C;

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ Context f12493D;

        /* JADX INFO: renamed from: t */
        public int f12494t;

        /* JADX INFO: renamed from: u */
        public int f12495u;

        /* JADX INFO: renamed from: v */
        public Object f12496v;

        /* JADX INFO: renamed from: w */
        public Object f12497w;

        /* JADX INFO: renamed from: x */
        public Object f12498x;

        /* JADX INFO: renamed from: y */
        public long f12499y;

        /* JADX INFO: renamed from: z */
        public int f12500z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RemoteViews remoteViews, JSONArray jSONArray, WidgetLayoutConfig widgetLayoutConfig, Context context, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12490A = remoteViews;
            this.f12491B = jSONArray;
            this.f12492C = widgetLayoutConfig;
            this.f12493D = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f12490A, this.f12491B, this.f12492C, this.f12493D, interfaceC9557b);
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
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r14.f12500z
                r2 = 1
                if (r1 == 0) goto L2a
                if (r1 != r2) goto L22
                long r3 = r14.f12499y
                int r1 = r14.f12495u
                int r5 = r14.f12494t
                java.lang.Object r6 = r14.f12498x
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r6 = r14.f12497w
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r14.f12496v
                org.json.JSONObject r7 = (org.json.JSONObject) r7
                p229jt.C7348o.m30470b(r15)
                r13 = r14
                goto L82
            L22:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L2a:
                p229jt.C7348o.m30470b(r15)
                android.widget.RemoteViews r15 = r14.f12490A
                int r1 = sg.C11335m0.f39771C
                r15.removeAllViews(r1)
                org.json.JSONArray r15 = r14.f12491B
                int r15 = r15.length()
                com.roblox.client.widgets.a$b r1 = r14.f12492C
                int r1 = r1.getTotalItems()
                int r15 = java.lang.Math.min(r15, r1)
                r1 = 0
                r5 = r15
            L46:
                if (r1 >= r5) goto Ldb
                org.json.JSONArray r15 = r14.f12491B
                org.json.JSONObject r7 = r15.getJSONObject(r1)
                java.lang.String r15 = "placeId"
                long r10 = r7.optLong(r15)
                java.lang.String r15 = "name"
                java.lang.String r6 = r7.optString(r15)
                java.lang.String r15 = "thumbnailUrl"
                java.lang.String r12 = r7.optString(r15)
                com.roblox.client.widgets.a r8 = com.roblox.client.widgets.C3288a.f12466a
                android.content.Context r9 = r14.f12493D
                kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
                r14.f12496v = r7
                r14.f12497w = r6
                java.lang.Object r15 = pt.C10350l.m39676a(r12)
                r14.f12498x = r15
                r14.f12494t = r5
                r14.f12495u = r1
                r14.f12499y = r10
                r14.f12500z = r2
                r13 = r14
                java.lang.Object r15 = com.roblox.client.widgets.C3288a.m15759a(r8, r9, r10, r12, r13)
                if (r15 != r0) goto L81
                return r0
            L81:
                r3 = r10
            L82:
                android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                android.content.Context r9 = r13.f12493D
                java.lang.String r9 = r9.getPackageName()
                com.roblox.client.widgets.a$b r10 = r13.f12492C
                int r10 = r10.getItemLayoutId()
                r8.<init>(r9, r10)
                android.content.Context r9 = r13.f12493D
                com.roblox.client.widgets.a$b r10 = r13.f12492C
                android.widget.RemoteViews r11 = r13.f12490A
                int r12 = sg.C11335m0.f39769A
                r8.setTextViewText(r12, r6)
                int r6 = sg.C11335m0.f39841y
                r8.setImageViewBitmap(r6, r15)
                int r15 = sg.C11335m0.f39842z
                com.roblox.client.widgets.a r6 = com.roblox.client.widgets.C3288a.f12466a
                java.lang.Long r3 = pt.C10340b.m39662e(r3)
                java.lang.String r4 = r10.getTypeName()
                android.app.PendingIntent r3 = com.roblox.client.widgets.C3288a.m15761c(r6, r9, r3, r4)
                r8.setOnClickPendingIntent(r15, r3)
                int r15 = sg.C11335m0.f39771C
                r11.addView(r15, r8)
                boolean r15 = r10.getShowRating()
                if (r15 == 0) goto Ld8
                java.lang.String r15 = "rating"
                java.lang.String r15 = r7.optString(r15)
                int r3 = sg.C11335m0.f39770B
                int r4 = sg.C11347q0.f39907D1
                java.lang.Object[] r15 = new java.lang.Object[]{r15}
                java.lang.String r15 = r9.getString(r4, r15)
                r8.setTextViewText(r3, r15)
            Ld8:
                int r1 = r1 + r2
                goto L46
            Ldb:
                r13 = r14
                android.widget.RemoteViews r15 = r13.f12490A
                android.content.Context r0 = r13.f12493D
                com.roblox.client.widgets.a$b r1 = r13.f12492C
                int r2 = sg.C11335m0.f39800c0
                th.i r3 = th.C11659h.m43403a()
                boolean r3 = r3.mo43764z()
                if (r3 == 0) goto Lfb
                com.roblox.client.widgets.a r3 = com.roblox.client.widgets.C3288a.f12466a
                java.lang.String r4 = "container"
                java.lang.String r1 = r1.getTypeName()
                android.app.PendingIntent r0 = com.roblox.client.widgets.C3288a.m15760b(r3, r0, r4, r1)
                goto L106
            Lfb:
                com.roblox.client.widgets.a r3 = com.roblox.client.widgets.C3288a.f12466a
                r4 = 0
                java.lang.String r1 = r1.getTypeName()
                android.app.PendingIntent r0 = com.roblox.client.widgets.C3288a.m15761c(r3, r0, r4, r1)
            L106:
                r15.setOnClickPendingIntent(r2, r0)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.C3288a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super RemoteViews> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$f */
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", m39664f = "RecentlyPlayedWidgetUpdater.kt", m39665l = {MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, 209}, m39666m = "renderRecentlyPlayed", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f12501A;

        /* JADX INFO: renamed from: C */
        public int f12503C;

        /* JADX INFO: renamed from: t */
        public Object f12504t;

        /* JADX INFO: renamed from: u */
        public Object f12505u;

        /* JADX INFO: renamed from: v */
        public Object f12506v;

        /* JADX INFO: renamed from: w */
        public Object f12507w;

        /* JADX INFO: renamed from: x */
        public Object f12508x;

        /* JADX INFO: renamed from: y */
        public Object f12509y;

        /* JADX INFO: renamed from: z */
        public int f12510z;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12501A = obj;
            this.f12503C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3288a.this.m15771m(null, null, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$g */
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", m39664f = "RecentlyPlayedWidgetUpdater.kt", m39665l = {251}, m39666m = "renderSmallLayout", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f12511A;

        /* JADX INFO: renamed from: C */
        public int f12513C;

        /* JADX INFO: renamed from: t */
        public Object f12514t;

        /* JADX INFO: renamed from: u */
        public Object f12515u;

        /* JADX INFO: renamed from: v */
        public Object f12516v;

        /* JADX INFO: renamed from: w */
        public Object f12517w;

        /* JADX INFO: renamed from: x */
        public Object f12518x;

        /* JADX INFO: renamed from: y */
        public Object f12519y;

        /* JADX INFO: renamed from: z */
        public long f12520z;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12511A = obj;
            this.f12513C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3288a.this.m15772n(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.a$h */
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater", m39664f = "RecentlyPlayedWidgetUpdater.kt", m39665l = {147, 165}, m39666m = "updateRecentlyPlayedWidget", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class h extends AbstractC10342d {

        /* JADX INFO: renamed from: B */
        public int f12522B;

        /* JADX INFO: renamed from: t */
        public Object f12523t;

        /* JADX INFO: renamed from: u */
        public Object f12524u;

        /* JADX INFO: renamed from: v */
        public Object f12525v;

        /* JADX INFO: renamed from: w */
        public Object f12526w;

        /* JADX INFO: renamed from: x */
        public int f12527x;

        /* JADX INFO: renamed from: y */
        public int f12528y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f12529z;

        public h(InterfaceC9557b<? super h> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12529z = obj;
            this.f12522B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3288a.this.m15773o(null, null, 0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m15764f(Context context, long j10, String str, InterfaceC9557b<? super Bitmap> interfaceC9557b) throws Throwable {
        d dVar;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f12482C;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f12482C = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object objMo31068d = dVar.f12480A;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f12482C;
        if (i11 == 0) {
            C7348o.m30470b(objMo31068d);
            InterfaceC7479s interfaceC7479sM30978a = C7458d0.m30978a(context);
            RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            String cachedWidgetVariant = recentlyPlayedWidgetHandler.getCachedWidgetVariant(applicationContext);
            String strM15768j = m15768j(String.valueOf(j10), str, cachedWidgetVariant);
            ImageRequest.a aVarM47532j = new ImageRequest.a(context).m47525c(str).m47528f(strM15768j).m47532j(strM15768j);
            EnumC12742c enumC12742c = EnumC12742c.READ_ONLY;
            ImageRequest imageRequestM47524b = C12748i.m47582j(C12749j.m47584a(C12749j.m47585b(aVarM47532j.m47534l(enumC12742c).m47529g(enumC12742c).m47535m(EnumC12742c.DISABLED), Bitmap.Config.RGB_565), false), new C1552b(16.0f)).m47524b();
            dVar.f12483t = C10350l.m39676a(context);
            dVar.f12484u = C10350l.m39676a(str);
            dVar.f12485v = C10350l.m39676a(interfaceC7479sM30978a);
            dVar.f12486w = C10350l.m39676a(cachedWidgetVariant);
            dVar.f12487x = C10350l.m39676a(strM15768j);
            dVar.f12488y = C10350l.m39676a(imageRequestM47524b);
            dVar.f12489z = j10;
            dVar.f12482C = 1;
            objMo31068d = interfaceC7479sM30978a.mo31068d(imageRequestM47524b, dVar);
            if (objMo31068d == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objMo31068d);
        }
        InterfaceC12750k interfaceC12750k = (InterfaceC12750k) objMo31068d;
        if (interfaceC12750k instanceof ErrorResult) {
            throw ((ErrorResult) interfaceC12750k).getThrowable();
        }
        Intrinsics.m31981d(interfaceC12750k, "null cannot be cast to non-null type coil3.request.SuccessResult");
        return C7482v.m31092g(((SuccessResult) interfaceC12750k).getImage(), 0, 0, 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final PendingIntent m15765g(Context context, String entryPoint, String sizeName) {
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("roblox").authority("open").appendPath("widget").appendQueryParameter("entry_point", entryPoint).appendQueryParameter("joinAttemptOrigin", "RecentsWidget" + sizeName).build());
        intent.setPackage(context.getPackageName());
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, entryPoint.hashCode(), intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: renamed from: h */
    public final PendingIntent m15766h(Context context, Long placeId, String sizeName) {
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
    /* JADX INFO: renamed from: i */
    public final WidgetLayoutConfig m15767i(@NotNull Context context, @NotNull Bundle options, @NotNull String variant) {
        WidgetLayoutConfig widgetLayoutConfig;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(variant, "variant");
        float f10 = options.getInt("appWidgetMinWidth") * context.getResources().getDisplayMetrics().density;
        float f11 = options.getInt("appWidgetMinHeight") * context.getResources().getDisplayMetrics().density;
        float dimension = context.getResources().getDimension(C11329k0.f39734e);
        float dimension2 = context.getResources().getDimension(C11329k0.f39733d);
        RecentlyPlayedWidgetHandler.EnumC3276a enumC3276a = RecentlyPlayedWidgetHandler.EnumC3276a.V2;
        if (Intrinsics.m31980c(variant, enumC3276a.getValue())) {
            int i10 = C11338n0.f39851D;
            widgetLayoutConfig = new WidgetLayoutConfig(i10, i10, C11338n0.f39873t, 1, true, "Small_V2", c.SMALL);
        } else {
            int i11 = C11338n0.f39850C;
            widgetLayoutConfig = new WidgetLayoutConfig(i11, i11, C11338n0.f39873t, 1, true, "Small_V1", c.SMALL);
        }
        WidgetLayoutConfig widgetLayoutConfig2 = Intrinsics.m31980c(variant, enumC3276a.getValue()) ? new WidgetLayoutConfig(C11338n0.f39849B, C11338n0.f39848A, C11338n0.f39872s, 4, true, "Medium_V2", c.MEDIUM) : new WidgetLayoutConfig(C11338n0.f39878y, C11338n0.f39879z, C11338n0.f39872s, 3, true, "Medium_V1", c.MEDIUM);
        WidgetLayoutConfig widgetLayoutConfig3 = Intrinsics.m31980c(variant, enumC3276a.getValue()) ? new WidgetLayoutConfig(C11338n0.f39877x, C11338n0.f39876w, C11338n0.f39872s, 12, false, "Large_V2", c.LARGE) : new WidgetLayoutConfig(C11338n0.f39874u, C11338n0.f39875v, C11338n0.f39872s, 5, true, "Large_V1", c.LARGE);
        if (f10 <= dimension || f11 <= dimension2) {
            return f10 > dimension ? widgetLayoutConfig2 : widgetLayoutConfig;
        }
        return widgetLayoutConfig3;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m15768j(@NotNull String placeId, @NotNull String thumbnailUrl, @NotNull String variant) {
        Intrinsics.checkNotNullParameter(placeId, "placeId");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(variant, "variant");
        if (!Intrinsics.m31980c(variant, RecentlyPlayedWidgetHandler.EnumC3276a.V2.getValue())) {
            return "thumb_" + placeId;
        }
        return "thumb_" + placeId + "_" + thumbnailUrl.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final void m15769k(Context context, WidgetLayoutConfig config, AppWidgetManager appWidgetManager, int appWidgetId) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), config.getEmptyLayoutId());
        remoteViews.setOnClickPendingIntent(C11335m0.f39840x, C11659h.m43403a().mo43764z() ? f12466a.m15765g(context, "empty", config.getTypeName()) : f12466a.m15766h(context, null, config.getTypeName()));
        int i10 = a.f12467a[config.getSize().ordinal()];
        if (i10 == 1) {
            remoteViews.setViewVisibility(C11335m0.f39839w, 0);
        } else if (i10 == 2) {
            remoteViews.setViewVisibility(C11335m0.f39839w, 8);
        } else if (i10 != 3) {
            throw new C7345l();
        }
        appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
    }

    /* JADX INFO: renamed from: l */
    public final Object m15770l(Context context, RemoteViews remoteViews, WidgetLayoutConfig widgetLayoutConfig, JSONArray jSONArray, InterfaceC9557b<? super RemoteViews> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new e(remoteViews, jSONArray, widgetLayoutConfig, context, null), interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m15771m(String str, Context context, WidgetLayoutConfig widgetLayoutConfig, AppWidgetManager appWidgetManager, int i10, InterfaceC9557b<? super Unit> interfaceC9557b) throws JSONException {
        f fVar;
        RemoteViews remoteViews;
        if (interfaceC9557b instanceof f) {
            fVar = (f) interfaceC9557b;
            int i11 = fVar.f12503C;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                fVar.f12503C = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                fVar = new f(interfaceC9557b);
            }
        } else {
            fVar = new f(interfaceC9557b);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f12501A;
        Object objM38805e = C10047c.m38805e();
        int i12 = fVar2.f12503C;
        if (i12 == 0) {
            C7348o.m30470b(obj);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), widgetLayoutConfig.getLayoutId());
            JSONArray jSONArray = new JSONArray(str);
            if (widgetLayoutConfig.getSize() == c.SMALL) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                fVar2.f12504t = C10350l.m39676a(str);
                fVar2.f12505u = C10350l.m39676a(context);
                fVar2.f12506v = C10350l.m39676a(widgetLayoutConfig);
                fVar2.f12507w = appWidgetManager;
                fVar2.f12508x = remoteViews2;
                fVar2.f12509y = C10350l.m39676a(jSONArray);
                fVar2.f12510z = i10;
                fVar2.f12503C = 1;
                if (m15772n(jSONObject, context, remoteViews2, widgetLayoutConfig, fVar2) != objM38805e) {
                    remoteViews = remoteViews2;
                    Unit unit = Unit.f29331a;
                }
            } else {
                fVar2.f12504t = C10350l.m39676a(str);
                fVar2.f12505u = C10350l.m39676a(context);
                fVar2.f12506v = C10350l.m39676a(widgetLayoutConfig);
                fVar2.f12507w = appWidgetManager;
                fVar2.f12508x = remoteViews2;
                fVar2.f12509y = C10350l.m39676a(jSONArray);
                fVar2.f12510z = i10;
                fVar2.f12503C = 2;
                if (m15770l(context, remoteViews2, widgetLayoutConfig, jSONArray, fVar2) != objM38805e) {
                    remoteViews = remoteViews2;
                }
            }
            return objM38805e;
        }
        if (i12 == 1) {
            i10 = fVar2.f12510z;
            remoteViews = (RemoteViews) fVar2.f12508x;
            appWidgetManager = (AppWidgetManager) fVar2.f12507w;
            C7348o.m30470b(obj);
            Unit unit2 = Unit.f29331a;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = fVar2.f12510z;
            remoteViews = (RemoteViews) fVar2.f12508x;
            appWidgetManager = (AppWidgetManager) fVar2.f12507w;
            C7348o.m30470b(obj);
        }
        appWidgetManager.updateAppWidget(i10, remoteViews);
        return Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m15772n(JSONObject jSONObject, Context context, RemoteViews remoteViews, WidgetLayoutConfig widgetLayoutConfig, InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        g gVar;
        String strOptString;
        Object obj;
        Context context2;
        JSONObject jSONObject2;
        long j10;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f12513C;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f12513C = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        g gVar2 = gVar;
        Object obj2 = gVar2.f12511A;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar2.f12513C;
        if (i11 == 0) {
            C7348o.m30470b(obj2);
            long jOptLong = jSONObject.optLong(PinShortcutHandler.EXTRA_PLACE_ID);
            String strOptString2 = jSONObject.optString("thumbnailUrl");
            strOptString = jSONObject.optString("name");
            Intrinsics.checkNotNull(strOptString2);
            gVar2.f12514t = jSONObject;
            gVar2.f12515u = context;
            gVar2.f12516v = remoteViews;
            gVar2.f12517w = widgetLayoutConfig;
            gVar2.f12518x = C10350l.m39676a(strOptString2);
            gVar2.f12519y = strOptString;
            gVar2.f12520z = jOptLong;
            gVar2.f12513C = 1;
            Object objM15764f = m15764f(context, jOptLong, strOptString2, gVar2);
            if (objM15764f == objM38805e) {
                return objM38805e;
            }
            obj = objM15764f;
            context2 = context;
            jSONObject2 = jSONObject;
            j10 = jOptLong;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = gVar2.f12520z;
            String str = (String) gVar2.f12519y;
            widgetLayoutConfig = (WidgetLayoutConfig) gVar2.f12517w;
            RemoteViews remoteViews2 = (RemoteViews) gVar2.f12516v;
            context2 = (Context) gVar2.f12515u;
            jSONObject2 = (JSONObject) gVar2.f12514t;
            C7348o.m30470b(obj2);
            strOptString = str;
            remoteViews = remoteViews2;
            obj = obj2;
        }
        remoteViews.setTextViewText(C11335m0.f39769A, strOptString);
        remoteViews.setImageViewBitmap(C11335m0.f39841y, (Bitmap) obj);
        remoteViews.setOnClickPendingIntent(C11335m0.f39842z, f12466a.m15766h(context2, C10340b.m39662e(j10), widgetLayoutConfig.getTypeName()));
        if (widgetLayoutConfig.getShowRating()) {
            remoteViews.setTextViewText(C11335m0.f39770B, context2.getString(C11347q0.f39907D1, jSONObject2.optString("rating")));
        }
        return Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        if (r1.m15771m(r14, r3, r4, r5, r6, r7) == r0) goto L40;
     */
    @Nullable
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m15773o(@NotNull AppWidgetManager appWidgetManager, @NotNull Context context, int i10, @NotNull WidgetLayoutConfig widgetLayoutConfig, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        h hVar;
        Object objM33436d;
        AppWidgetManager appWidgetManager2;
        Context context2;
        int i11;
        WidgetLayoutConfig widgetLayoutConfig2;
        Throwable th2;
        Context context3;
        WidgetLayoutConfig widgetLayoutConfig3;
        AppWidgetManager appWidgetManager3;
        int i12;
        Object objM30460b;
        Throwable thM30463e;
        if (interfaceC9557b instanceof h) {
            hVar = (h) interfaceC9557b;
            int i13 = hVar.f12522B;
            if ((i13 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                hVar.f12522B = i13 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                hVar = new h(interfaceC9557b);
            }
        } else {
            hVar = new h(interfaceC9557b);
        }
        h hVar2 = hVar;
        Object obj = hVar2.f12529z;
        Object objM38805e = C10047c.m38805e();
        int i14 = hVar2.f12522B;
        if (i14 == 0) {
            C7348o.m30470b(obj);
            C8156c c8156c = new C8156c();
            hVar2.f12523t = appWidgetManager;
            hVar2.f12524u = context;
            hVar2.f12525v = widgetLayoutConfig;
            hVar2.f12527x = i10;
            hVar2.f12522B = 1;
            objM33436d = c8156c.m33436d(context, hVar2);
            if (objM33436d != objM38805e) {
            }
            return objM38805e;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = hVar2.f12527x;
            widgetLayoutConfig3 = (WidgetLayoutConfig) hVar2.f12525v;
            context3 = (Context) hVar2.f12524u;
            appWidgetManager3 = (AppWidgetManager) hVar2.f12523t;
            try {
                C7348o.m30470b(obj);
                objM30460b = C7347n.m30460b(Unit.f29331a);
            } catch (Throwable th3) {
                th2 = th3;
                C7347n.Companion companion = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            i11 = i12;
            widgetLayoutConfig2 = widgetLayoutConfig3;
            context2 = context3;
            appWidgetManager2 = appWidgetManager3;
            thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                if (thM30463e instanceof C11537g) {
                    throw thM30463e;
                }
                C6124q.m27061f("RecentlyPlayedWidgetUpdater", "Failed to load widget thumbnail from cache. Fallback to empty state", thM30463e);
                f12466a.m15769k(context2, widgetLayoutConfig2, appWidgetManager2, i11);
                C7347n.m30460b(Unit.f29331a);
            }
            return Unit.f29331a;
        }
        i10 = hVar2.f12527x;
        widgetLayoutConfig = (WidgetLayoutConfig) hVar2.f12525v;
        context = (Context) hVar2.f12524u;
        appWidgetManager = (AppWidgetManager) hVar2.f12523t;
        C7348o.m30470b(obj);
        objM33436d = ((C7347n) obj).getValue();
        appWidgetManager2 = appWidgetManager;
        context2 = context;
        i11 = i10;
        widgetLayoutConfig2 = widgetLayoutConfig;
        Throwable thM30463e2 = C7347n.m30463e(objM33436d);
        if (thM30463e2 != null) {
            if (!(thM30463e2 instanceof IOException)) {
                throw thM30463e2;
            }
            C6124q.m27061f("RecentlyPlayedWidgetUpdater", "Failed to read recently played data cache", thM30463e2);
            objM33436d = C7347n.m30460b(null);
        }
        if (C7347n.m30466h(objM33436d)) {
            try {
                String str = (String) objM33436d;
                if (str == null || str.length() == 0) {
                    f12466a.m15769k(context2, widgetLayoutConfig2, appWidgetManager2, i11);
                } else {
                    C3288a c3288a = f12466a;
                    hVar2.f12523t = appWidgetManager2;
                    hVar2.f12524u = context2;
                    hVar2.f12525v = widgetLayoutConfig2;
                    hVar2.f12526w = C10350l.m39676a(str);
                    hVar2.f12527x = i11;
                    hVar2.f12528y = 0;
                    hVar2.f12522B = 2;
                }
                context3 = context2;
                widgetLayoutConfig3 = widgetLayoutConfig2;
                appWidgetManager3 = appWidgetManager2;
                i12 = i11;
                objM30460b = C7347n.m30460b(Unit.f29331a);
            } catch (Throwable th4) {
                th2 = th4;
                context3 = context2;
                widgetLayoutConfig3 = widgetLayoutConfig2;
                appWidgetManager3 = appWidgetManager2;
                i12 = i11;
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            i11 = i12;
            widgetLayoutConfig2 = widgetLayoutConfig3;
            context2 = context3;
            appWidgetManager2 = appWidgetManager3;
        } else {
            objM30460b = C7347n.m30460b(objM33436d);
        }
        thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            if (thM30463e instanceof C11537g) {
                throw thM30463e;
            }
            C6124q.m27061f("RecentlyPlayedWidgetUpdater", "Failed to load widget thumbnail from cache. Fallback to empty state", thM30463e);
            f12466a.m15769k(context2, widgetLayoutConfig2, appWidgetManager2, i11);
            C7347n.m30460b(Unit.f29331a);
        }
        return Unit.f29331a;
    }
}
