package com.roblox.universalapp.systemtheme;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import androidx.p000lifecycle.s;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import java.lang.ref.WeakReference;
import jt.h;
import jt.i;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ku.a0;
import ku.d2;
import ku.g1;
import ku.h2;
import ku.k;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pt.m;
import vk.g;
import wk.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00048;3uB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020'H\u0003¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020'2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0003¢\u0006\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010:\u001a\n 7*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R#\u0010?\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R#\u0010B\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R#\u0010E\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R#\u0010H\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>R#\u0010K\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010<\u001a\u0004\bJ\u0010>R\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010Y\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010\u0003R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\\R\u0018\u0010e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010\\R\u0018\u0010j\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010q\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010s¨\u0006v"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "C", "onDestroy", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "listener", "O", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "K", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "H", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V", "Lorg/json/JSONObject;", "jsonObject", "E", "(Lorg/json/JSONObject;)V", "D", "", "isSystemThemeAvailable", "()Z", "", "getSystemTheme", "()I", "F", "G", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "themeValue", "Q", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;)V", "", "shouldHide", "L", "(Ljava/lang/String;)V", "path", "w", "(Ljava/lang/String;)Ljava/lang/String;", "cookieName", "cookieValue", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lku/p0;", "b", "Lku/p0;", "handlerScope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "kotlin.jvm.PlatformType", "c", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", "d", "Ljt/h;", "B", "()Ljava/lang/String;", "themeUpdatedMessageId", "e", "z", "setThemeMessageId", "f", "A", "themeParamKey", "g", "y", "setClassicThemeActiveMessageId", "h", "x", "setAppIconMessageId", "Landroid/os/HandlerThread;", "i", "Landroid/os/HandlerThread;", "cookieHandlerThread", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "cookieHandler", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "k", "Ljava/lang/ref/WeakReference;", "getContextRef$annotations", "contextRef", "Lcom/roblox/universalapp/messagebus/Connection;", "l", "Lcom/roblox/universalapp/messagebus/Connection;", "setThemeConn", "m", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "themeListener", "n", "setClassicThemeConn", "o", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "classicThemeListener", "p", "setAppIconConn", "q", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "appIconListener", "Lku/d2;", "r", "Lku/d2;", "handlerJob", "s", "Ljava/lang/Integer;", "lastPublishedSystemTheme", "t", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "lastSetTheme", "a", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SystemThemeProtocol implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SystemThemeProtocol f9821a = new SystemThemeProtocol();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 handlerScope = q0.a(g1.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final MessageBus messageBus = MessageBus.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h themeUpdatedMessageId = i.b(new Function0() { // from class: rm.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.U();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h setThemeMessageId = i.b(new Function0() { // from class: rm.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.P();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h themeParamKey = i.b(new Function0() { // from class: rm.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.T();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h setClassicThemeActiveMessageId = i.b(new Function0() { // from class: rm.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.J();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h setAppIconMessageId = i.b(new Function0() { // from class: rm.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.I();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final HandlerThread cookieHandlerThread;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Handler cookieHandler;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Connection setThemeConn;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static d themeListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Connection setClassicThemeConn;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static b classicThemeListener;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Connection setAppIconConn;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static a appIconListener;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static d2 handlerJob;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Integer lastPublishedSystemTheme;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static c lastSetTheme;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "", "", "name", "", "a", "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull String name);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "", "", "active", "", "a", "(Z)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        void a(boolean active);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011j\u0002\b\tj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "", "", "value", "", "themeName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "", "d", "()Z", "a", "I", "c", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "f", "g", "h", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        ERROR(0, ""),
        LIGHT(1, "light"),
        DARK(2, "dark"),
        SYSTEM_LIGHT(3, "light"),
        SYSTEM_DARK(4, "dark");


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String themeName;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ qt.a f9847j = qt.b.a(a());

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;", "", "<init>", "()V", "", "value", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "a", "(I)Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
            @NotNull
            public final c a(int value) {
                for (c cVar : c.values()) {
                    if (cVar.getValue() == value) {
                        if (cVar == null) {
                            return c.ERROR;
                        }
                        return cVar;
                    }
                }
                cVar = null;
                if (cVar == null) {
                    return c.ERROR;
                }
                return cVar;
            }

            public Companion() {
            }
        }

        c(int i10, String str) {
            this.value = i10;
            this.themeName = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getThemeName() {
            return this.themeName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final boolean d() {
            return this == SYSTEM_LIGHT || this == SYSTEM_DARK;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "", "", "themeName", "", "a", "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        void a(@NotNull String themeName);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.systemtheme.SystemThemeProtocol$onCreate$2", f = "SystemThemeProtocol.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9849t;

        public e(nt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9849t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            MessageBus messageBus = SystemThemeProtocol.messageBus;
            final SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f9821a;
            SystemThemeProtocol.setThemeConn = messageBus.t(systemThemeProtocol.z(), new Callback() { // from class: rm.j
                @Override // com.roblox.universalapp.messagebus.Callback
                public final void a(JSONObject jSONObject) {
                    systemThemeProtocol.F(jSONObject);
                }
            });
            SystemThemeProtocol.setClassicThemeConn = SystemThemeProtocol.messageBus.t(systemThemeProtocol.y(), new Callback() { // from class: rm.k
                @Override // com.roblox.universalapp.messagebus.Callback
                public final void a(JSONObject jSONObject) {
                    systemThemeProtocol.E(jSONObject);
                }
            });
            SystemThemeProtocol.setAppIconConn = SystemThemeProtocol.messageBus.t(systemThemeProtocol.x(), new Callback() { // from class: rm.l
                @Override // com.roblox.universalapp.messagebus.Callback
                public final void a(JSONObject jSONObject) {
                    systemThemeProtocol.D(jSONObject);
                }
            });
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.systemtheme.SystemThemeProtocol$publishSystemThemeUpdatedMessage$1$1", f = "SystemThemeProtocol.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9850t;

        public f(nt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new f(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9850t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            SystemThemeProtocol.messageBus.l(SystemThemeProtocol.f9821a.B(), new JSONObject());
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("CookieThread");
        handlerThread.start();
        cookieHandlerThread = handlerThread;
        cookieHandler = new Handler(handlerThread.getLooper());
    }

    public static final String I() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), "systemThemeSetAppIcon");
    }

    public static final String J() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), "systemThemeSetClassicThemeActive");
    }

    public static final void M(String str, String str2) {
        j.c().g(str, str2, new ValueCallback() { // from class: rm.h
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                SystemThemeProtocol.N((Boolean) obj);
            }
        });
    }

    public static final void N(Boolean bool) {
    }

    public static final String P() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), JNISystemThemeProtocol.getSystemThemeSetThemeMessage());
    }

    public static final void R(String str, String str2) {
        j.c().g(str, str2, new ValueCallback() { // from class: rm.i
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                SystemThemeProtocol.S((Boolean) obj);
            }
        });
    }

    public static final void S(Boolean bool) {
    }

    public static final String T() {
        return JNISystemThemeProtocol.getSystemThemeParamKey();
    }

    public static final String U() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), JNISystemThemeProtocol.getSystemThemeUpdatedMessage());
    }

    @Keep
    public static final int getSystemTheme() {
        Context context;
        WeakReference<Context> weakReference = contextRef;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return c.ERROR.getValue();
        }
        int i10 = context.getResources().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            return i10 != 32 ? c.ERROR.getValue() : c.SYSTEM_DARK.getValue();
        }
        return c.SYSTEM_LIGHT.getValue();
    }

    @Keep
    public static final boolean isSystemThemeAvailable() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final String v(String cookieName, String cookieValue, String path) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cookieName + "=" + cookieValue);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; Path=");
        sb3.append(path);
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static final String w(String path) {
        String str;
        vk.b bVarC = g.c();
        if (bVarC == null || (str = bVarC.f33272a) == null) {
            return null;
        }
        return "www." + str + path;
    }

    public final String A() {
        return (String) themeParamKey.getValue();
    }

    public final String B() {
        return (String) themeUpdatedMessageId.getValue();
    }

    public final void C() {
        G();
    }

    public final void D(JSONObject jsonObject) {
        a aVar;
        Object objOpt = jsonObject.opt("AppIconName");
        String str = objOpt instanceof String ? (String) objOpt : null;
        if (str == null || (aVar = appIconListener) == null) {
            return;
        }
        aVar.a(str);
    }

    public final void E(JSONObject jsonObject) {
        boolean zOptBoolean = jsonObject.optBoolean("ClassicThemeActive", false);
        b bVar = classicThemeListener;
        if (bVar != null) {
            bVar.a(zOptBoolean);
        }
    }

    public final void F(JSONObject jsonObject) {
        String strOptString = jsonObject.optString(A());
        Intrinsics.checkNotNull(strOptString);
        Integer intOrNull = StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            c cVarA = c.INSTANCE.a(intOrNull.intValue());
            if (cVarA != null) {
                lastSetTheme = cVarA;
                SystemThemeProtocol systemThemeProtocol = f9821a;
                systemThemeProtocol.Q(cVarA);
                systemThemeProtocol.L("True");
                d dVar = themeListener;
                if (dVar != null) {
                    dVar.a(cVarA.getThemeName());
                }
            }
        }
    }

    public final void G() {
        c cVar = lastSetTheme;
        if (cVar == null || cVar.d()) {
            int systemTheme = getSystemTheme();
            Integer num = lastPublishedSystemTheme;
            if (num != null && num.intValue() == systemTheme) {
                return;
            }
            lastPublishedSystemTheme = Integer.valueOf(systemTheme);
            d2 d2Var = handlerJob;
            if (d2Var != null) {
                k.d(handlerScope, d2Var, null, new f(null), 2, null);
            }
        }
    }

    public final void H(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        appIconListener = listener;
    }

    public final void K(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        classicThemeListener = listener;
    }

    public final void L(String shouldHide) {
        final String strW = w("/my/account");
        if (strW == null) {
            return;
        }
        final String strV = v("RBXHideThemeSetting", shouldHide, "/my/account");
        cookieHandler.post(new Runnable() { // from class: rm.g
            @Override // java.lang.Runnable
            public final void run() {
                SystemThemeProtocol.M(strW, strV);
            }
        });
    }

    public final void O(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        themeListener = listener;
    }

    public final void Q(c themeValue) {
        final String strW = w("/");
        if (strW == null) {
            return;
        }
        final String strV = v("RBXThemeOverride", themeValue.getThemeName(), "/");
        cookieHandler.post(new Runnable() { // from class: rm.f
            @Override // java.lang.Runnable
            public final void run() {
                SystemThemeProtocol.R(strW, strV);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Context context = owner instanceof Context ? (Context) owner : null;
        contextRef = context != null ? new WeakReference<>(context) : null;
        a0 a0VarB = h2.b(null, 1, null);
        handlerJob = a0VarB;
        k.d(handlerScope, a0VarB, null, new e(null), 2, null);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        contextRef = null;
        themeListener = null;
        classicThemeListener = null;
        appIconListener = null;
        Connection connection = setThemeConn;
        if (connection != null) {
            connection.a();
        }
        Connection connection2 = setClassicThemeConn;
        if (connection2 != null) {
            connection2.a();
        }
        Connection connection3 = setAppIconConn;
        if (connection3 != null) {
            connection3.a();
        }
        d2 d2Var = handlerJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        handlerJob = null;
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public void onResume(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        G();
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }

    public final String x() {
        return (String) setAppIconMessageId.getValue();
    }

    public final String y() {
        return (String) setClassicThemeActiveMessageId.getValue();
    }

    public final String z() {
        return (String) setThemeMessageId.getValue();
    }
}
