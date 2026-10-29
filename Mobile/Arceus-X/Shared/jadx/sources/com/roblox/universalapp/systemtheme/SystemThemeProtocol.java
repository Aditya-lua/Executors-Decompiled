package com.roblox.universalapp.systemtheme;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.C7864g1;
import p256ku.C7870h2;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7833a0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p493vk.C12220b;
import p493vk.C12225g;
import p520wk.C12488j;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00048;3uB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020'H\u0003¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020'2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0003¢\u0006\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010:\u001a\n 7*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R#\u0010?\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R#\u0010B\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R#\u0010E\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R#\u0010H\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>R#\u0010K\u001a\n 7*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010<\u001a\u0004\bJ\u0010>R\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010Y\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010\u0003R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\\R\u0018\u0010e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010\\R\u0018\u0010j\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010q\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010s¨\u0006v"}, m31665d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "C", "onDestroy", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "listener", "O", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "K", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "H", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V", "Lorg/json/JSONObject;", "jsonObject", "E", "(Lorg/json/JSONObject;)V", "D", "", "isSystemThemeAvailable", "()Z", "", "getSystemTheme", "()I", "F", "G", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "themeValue", "Q", "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;)V", "", "shouldHide", "L", "(Ljava/lang/String;)V", "path", "w", "(Ljava/lang/String;)Ljava/lang/String;", "cookieName", "cookieValue", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lku/p0;", "b", "Lku/p0;", "handlerScope", "Lcom/roblox/universalapp/messagebus/MessageBus;", "kotlin.jvm.PlatformType", "c", "Lcom/roblox/universalapp/messagebus/MessageBus;", "messageBus", "d", "Ljt/h;", "B", "()Ljava/lang/String;", "themeUpdatedMessageId", "e", "z", "setThemeMessageId", "f", "A", "themeParamKey", "g", "y", "setClassicThemeActiveMessageId", "h", "x", "setAppIconMessageId", "Landroid/os/HandlerThread;", "i", "Landroid/os/HandlerThread;", "cookieHandlerThread", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "cookieHandler", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "k", "Ljava/lang/ref/WeakReference;", "getContextRef$annotations", "contextRef", "Lcom/roblox/universalapp/messagebus/Connection;", "l", "Lcom/roblox/universalapp/messagebus/Connection;", "setThemeConn", "m", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "themeListener", "n", "setClassicThemeConn", "o", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "classicThemeListener", "p", "setAppIconConn", "q", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "appIconListener", "Lku/d2;", "r", "Lku/d2;", "handlerJob", "s", "Ljava/lang/Integer;", "lastPublishedSystemTheme", "t", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "lastSetTheme", "a", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SystemThemeProtocol implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SystemThemeProtocol f12789a = new SystemThemeProtocol();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7906p0 handlerScope = C7910q0.m32885a(C7864g1.m32643a());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final MessageBus messageBus = MessageBus.m16016f();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h themeUpdatedMessageId = C7342i.m30456b(new Function0() { // from class: rm.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.m16046U();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setThemeMessageId = C7342i.m30456b(new Function0() { // from class: rm.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.m16042P();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h themeParamKey = C7342i.m30456b(new Function0() { // from class: rm.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.m16045T();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setClassicThemeActiveMessageId = C7342i.m30456b(new Function0() { // from class: rm.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.m16039J();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setAppIconMessageId = C7342i.m30456b(new Function0() { // from class: rm.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SystemThemeProtocol.m16038I();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final HandlerThread cookieHandlerThread;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Handler cookieHandler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public static WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public static Connection setThemeConn;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC3368d themeListener;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public static Connection setClassicThemeConn;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC3366b classicThemeListener;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public static Connection setAppIconConn;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC3365a appIconListener;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC7850d2 handlerJob;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public static Integer lastPublishedSystemTheme;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public static EnumC3367c lastSetTheme;

    /* JADX INFO: renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;", "", "", "name", "", "a", "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3365a {
        /* JADX INFO: renamed from: a */
        void mo15682a(@NotNull String name);
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;", "", "", "active", "", "a", "(Z)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3366b {
        /* JADX INFO: renamed from: a */
        void mo1376a(boolean active);
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$c */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011j\u0002\b\tj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m31665d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "", "", "value", "", "themeName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "", "d", "()Z", "a", "I", "c", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "f", "g", "h", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum EnumC3367c {
        ERROR(0, ""),
        LIGHT(1, "light"),
        DARK(2, "dark"),
        SYSTEM_LIGHT(3, "light"),
        SYSTEM_DARK(4, "dark");


        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String themeName;

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ InterfaceC10707a f12816j = C10708b.m40805a(m16084a());

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$c$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;", "", "<init>", "()V", "", "value", "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "a", "(I)Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.universalapp.systemtheme.SystemThemeProtocol.c.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
            @NotNull
            /* JADX INFO: renamed from: a */
            public final EnumC3367c m16088a(int value) {
                for (EnumC3367c enumC3367c : EnumC3367c.values()) {
                    if (enumC3367c.getValue() == value) {
                        if (enumC3367c == null) {
                            return EnumC3367c.ERROR;
                        }
                        return enumC3367c;
                    }
                }
                enumC3367c = null;
                if (enumC3367c == null) {
                    return EnumC3367c.ERROR;
                }
                return enumC3367c;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        EnumC3367c(int i10, String str) {
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

        /* JADX INFO: renamed from: d */
        public final boolean m16087d() {
            return this == SYSTEM_LIGHT || this == SYSTEM_DARK;
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$d */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;", "", "", "themeName", "", "a", "(Ljava/lang/String;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface InterfaceC3368d {
        /* JADX INFO: renamed from: a */
        void mo1375a(@NotNull String themeName);
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.systemtheme.SystemThemeProtocol$onCreate$2", m39664f = "SystemThemeProtocol.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3369e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12819t;

        public C3369e(InterfaceC9557b<? super C3369e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3369e(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12819t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            MessageBus messageBus = SystemThemeProtocol.messageBus;
            final SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f12789a;
            SystemThemeProtocol.setThemeConn = messageBus.m16030t(systemThemeProtocol.m16083z(), new Callback() { // from class: rm.j
                @Override // com.roblox.universalapp.messagebus.Callback
                /* JADX INFO: renamed from: a */
                public final void mo7492a(JSONObject jSONObject) {
                    systemThemeProtocol.m16074F(jSONObject);
                }
            });
            SystemThemeProtocol.setClassicThemeConn = SystemThemeProtocol.messageBus.m16030t(systemThemeProtocol.m16082y(), new Callback() { // from class: rm.k
                @Override // com.roblox.universalapp.messagebus.Callback
                /* JADX INFO: renamed from: a */
                public final void mo7492a(JSONObject jSONObject) {
                    systemThemeProtocol.m16073E(jSONObject);
                }
            });
            SystemThemeProtocol.setAppIconConn = SystemThemeProtocol.messageBus.m16030t(systemThemeProtocol.m16081x(), new Callback() { // from class: rm.l
                @Override // com.roblox.universalapp.messagebus.Callback
                /* JADX INFO: renamed from: a */
                public final void mo7492a(JSONObject jSONObject) {
                    systemThemeProtocol.m16072D(jSONObject);
                }
            });
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3369e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.systemtheme.SystemThemeProtocol$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.systemtheme.SystemThemeProtocol$publishSystemThemeUpdatedMessage$1$1", m39664f = "SystemThemeProtocol.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3370f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12820t;

        public C3370f(InterfaceC9557b<? super C3370f> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3370f(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12820t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            SystemThemeProtocol.messageBus.m16024l(SystemThemeProtocol.f12789a.m16070B(), new JSONObject());
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3370f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("CookieThread");
        handlerThread.start();
        cookieHandlerThread = handlerThread;
        cookieHandler = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: I */
    public static final String m16038I() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), "systemThemeSetAppIcon");
    }

    /* JADX INFO: renamed from: J */
    public static final String m16039J() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), "systemThemeSetClassicThemeActive");
    }

    /* JADX INFO: renamed from: M */
    public static final void m16040M(String str, String str2) {
        C12488j.m46781c().mo23958g(str, str2, new ValueCallback() { // from class: rm.h
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                SystemThemeProtocol.m16041N((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static final void m16041N(Boolean bool) {
    }

    /* JADX INFO: renamed from: P */
    public static final String m16042P() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), JNISystemThemeProtocol.getSystemThemeSetThemeMessage());
    }

    /* JADX INFO: renamed from: R */
    public static final void m16043R(String str, String str2) {
        C12488j.m46781c().mo23958g(str, str2, new ValueCallback() { // from class: rm.i
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                SystemThemeProtocol.m16044S((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static final void m16044S(Boolean bool) {
    }

    /* JADX INFO: renamed from: T */
    public static final String m16045T() {
        return JNISystemThemeProtocol.getSystemThemeParamKey();
    }

    /* JADX INFO: renamed from: U */
    public static final String m16046U() {
        return MessageBus.getMessageId(JNISystemThemeProtocol.getProtocolName(), JNISystemThemeProtocol.getSystemThemeUpdatedMessage());
    }

    @Keep
    public static final int getSystemTheme() {
        Context context;
        WeakReference<Context> weakReference = contextRef;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return EnumC3367c.ERROR.getValue();
        }
        int i10 = context.getResources().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            return i10 != 32 ? EnumC3367c.ERROR.getValue() : EnumC3367c.SYSTEM_DARK.getValue();
        }
        return EnumC3367c.SYSTEM_LIGHT.getValue();
    }

    @Keep
    public static final boolean isSystemThemeAvailable() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: renamed from: v */
    public static final String m16067v(String cookieName, String cookieValue, String path) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cookieName + "=" + cookieValue);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; Path=");
        sb3.append(path);
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: w */
    public static final String m16068w(String path) {
        String str;
        C12220b c12220bM45325c = C12225g.m45325c();
        if (c12220bM45325c == null || (str = c12220bM45325c.f43087a) == null) {
            return null;
        }
        return "www." + str + path;
    }

    /* JADX INFO: renamed from: A */
    public final String m16069A() {
        return (String) themeParamKey.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final String m16070B() {
        return (String) themeUpdatedMessageId.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final void m16071C() {
        m16075G();
    }

    /* JADX INFO: renamed from: D */
    public final void m16072D(JSONObject jsonObject) {
        InterfaceC3365a interfaceC3365a;
        Object objOpt = jsonObject.opt("AppIconName");
        String str = objOpt instanceof String ? (String) objOpt : null;
        if (str == null || (interfaceC3365a = appIconListener) == null) {
            return;
        }
        interfaceC3365a.mo15682a(str);
    }

    /* JADX INFO: renamed from: E */
    public final void m16073E(JSONObject jsonObject) {
        boolean zOptBoolean = jsonObject.optBoolean("ClassicThemeActive", false);
        InterfaceC3366b interfaceC3366b = classicThemeListener;
        if (interfaceC3366b != null) {
            interfaceC3366b.mo1376a(zOptBoolean);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m16074F(JSONObject jsonObject) {
        String strOptString = jsonObject.optString(m16069A());
        Intrinsics.checkNotNull(strOptString);
        Integer intOrNull = StringsKt.toIntOrNull(strOptString);
        if (intOrNull != null) {
            EnumC3367c enumC3367cM16088a = EnumC3367c.INSTANCE.m16088a(intOrNull.intValue());
            if (enumC3367cM16088a != null) {
                lastSetTheme = enumC3367cM16088a;
                SystemThemeProtocol systemThemeProtocol = f12789a;
                systemThemeProtocol.m16080Q(enumC3367cM16088a);
                systemThemeProtocol.m16078L("True");
                InterfaceC3368d interfaceC3368d = themeListener;
                if (interfaceC3368d != null) {
                    interfaceC3368d.mo1375a(enumC3367cM16088a.getThemeName());
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m16075G() {
        EnumC3367c enumC3367c = lastSetTheme;
        if (enumC3367c == null || enumC3367c.m16087d()) {
            int systemTheme = getSystemTheme();
            Integer num = lastPublishedSystemTheme;
            if (num != null && num.intValue() == systemTheme) {
                return;
            }
            lastPublishedSystemTheme = Integer.valueOf(systemTheme);
            InterfaceC7850d2 interfaceC7850d2 = handlerJob;
            if (interfaceC7850d2 != null) {
                C7882k.m32780d(handlerScope, interfaceC7850d2, null, new C3370f(null), 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m16076H(@NotNull InterfaceC3365a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        appIconListener = listener;
    }

    /* JADX INFO: renamed from: K */
    public final void m16077K(@NotNull InterfaceC3366b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        classicThemeListener = listener;
    }

    /* JADX INFO: renamed from: L */
    public final void m16078L(String shouldHide) {
        final String strM16068w = m16068w("/my/account");
        if (strM16068w == null) {
            return;
        }
        final String strM16067v = m16067v("RBXHideThemeSetting", shouldHide, "/my/account");
        cookieHandler.post(new Runnable() { // from class: rm.g
            @Override // java.lang.Runnable
            public final void run() {
                SystemThemeProtocol.m16040M(strM16068w, strM16067v);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m16079O(@NotNull InterfaceC3368d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        themeListener = listener;
    }

    /* JADX INFO: renamed from: Q */
    public final void m16080Q(EnumC3367c themeValue) {
        final String strM16068w = m16068w("/");
        if (strM16068w == null) {
            return;
        }
        final String strM16067v = m16067v("RBXThemeOverride", themeValue.getThemeName(), "/");
        cookieHandler.post(new Runnable() { // from class: rm.f
            @Override // java.lang.Runnable
            public final void run() {
                SystemThemeProtocol.m16043R(strM16068w, strM16067v);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: androidx.lifecycle.s */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Context context = owner instanceof Context ? (Context) owner : null;
        contextRef = context != null ? new WeakReference<>(context) : null;
        InterfaceC7833a0 interfaceC7833a0M32666b = C7870h2.m32666b(null, 1, null);
        handlerJob = interfaceC7833a0M32666b;
        C7882k.m32780d(handlerScope, interfaceC7833a0M32666b, null, new C3369e(null), 2, null);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        contextRef = null;
        themeListener = null;
        classicThemeListener = null;
        appIconListener = null;
        Connection connection = setThemeConn;
        if (connection != null) {
            connection.m16010a();
        }
        Connection connection2 = setClassicThemeConn;
        if (connection2 != null) {
            connection2.m16010a();
        }
        Connection connection3 = setAppIconConn;
        if (connection3 != null) {
            connection3.m16010a();
        }
        InterfaceC7850d2 interfaceC7850d2 = handlerJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        handlerJob = null;
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onResume(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        m16075G();
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStop(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStop(interfaceC0980s);
    }

    /* JADX INFO: renamed from: x */
    public final String m16081x() {
        return (String) setAppIconMessageId.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final String m16082y() {
        return (String) setClassicThemeActiveMessageId.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final String m16083z() {
        return (String) setThemeMessageId.getValue();
    }
}
