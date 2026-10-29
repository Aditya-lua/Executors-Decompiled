.class public final synthetic Lhl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhl/c;->a:Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhl/c;->a:Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;

    invoke-static {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->h(Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
