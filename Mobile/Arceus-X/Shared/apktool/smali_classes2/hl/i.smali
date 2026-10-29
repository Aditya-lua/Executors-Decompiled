.class public final synthetic Lhl/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhl/i;->a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhl/i;->a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;

    invoke-static {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->b(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
