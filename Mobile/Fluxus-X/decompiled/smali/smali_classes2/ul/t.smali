.class public final synthetic Lul/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lul/t;->a:Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lul/t;->a:Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;

    invoke-static {v0}, Lcom/roblox/protocols/calling/CallingHandler;->l(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
