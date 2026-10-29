.class public final synthetic Lbk/a$b;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbk/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
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
.field public static final a:Lbk/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbk/a$b;

    invoke-direct {v0}, Lbk/a$b;-><init>()V

    sput-object v0, Lbk/a$b;->a:Lbk/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "setEnableConnectivityV2ForAndroid(Z)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lcom/roblox/engine/jni/NativeAppBridgeInterface;

    const-string v3, "setEnableConnectivityV2ForAndroid"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d(Z)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->setEnableConnectivityV2ForAndroid(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lbk/a$b;->d(Z)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
