.class public final synthetic Lhl/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhl/f;->a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhl/f;->a:Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;

    invoke-static {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->g(Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
