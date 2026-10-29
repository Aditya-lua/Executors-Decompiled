.class public final synthetic Lbk/d$c;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbk/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/roblox/engine/jni/model/DeviceParams;",
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
.field public static final a:Lbk/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbk/d$c;

    invoke-direct {v0}, Lbk/d$c;-><init>()V

    sput-object v0, Lbk/d$c;->a:Lbk/d$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "nativeSetDeviceInfo(Lcom/roblox/engine/jni/model/DeviceParams;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lcom/roblox/engine/jni/NativeSettingsInterface;

    const-string v3, "nativeSetDeviceInfo"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final d(Lcom/roblox/engine/jni/model/DeviceParams;)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetDeviceInfo(Lcom/roblox/engine/jni/model/DeviceParams;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/roblox/engine/jni/model/DeviceParams;

    invoke-virtual {p0, p1}, Lbk/d$c;->d(Lcom/roblox/engine/jni/model/DeviceParams;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
