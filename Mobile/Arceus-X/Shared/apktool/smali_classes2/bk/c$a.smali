.class public final synthetic Lbk/c$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lbk/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbk/c$a;

    invoke-direct {v0}, Lbk/c$a;-><init>()V

    sput-object v0, Lbk/c$a;->a:Lbk/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "setAppBridgeNotificationListener(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lcom/roblox/engine/jni/NativeGLJavaInterface;

    const-string v3, "setAppBridgeNotificationListener"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppBridgeNotificationListener(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    invoke-virtual {p0, p1}, Lbk/c$a;->d(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
