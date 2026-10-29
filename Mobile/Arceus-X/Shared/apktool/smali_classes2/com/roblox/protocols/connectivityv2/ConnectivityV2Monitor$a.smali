.class public final Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;",
        "Landroid/content/BroadcastReceiver;",
        "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;",
        "monitor",
        "<init>",
        "(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "a",
        "Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V
    .locals 1
    .param p1    # Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "monitor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;->a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;->a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;

    invoke-static {p1}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->access$reportCurrentNetwork(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;)V

    return-void
.end method
