.class public final synthetic Ltl/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lku/p0;

.field public final synthetic b:Lcom/roblox/universalapp/messagebus/MessageBus;


# direct methods
.method public synthetic constructor <init>(Lku/p0;Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltl/l;->a:Lku/p0;

    iput-object p2, p0, Ltl/l;->b:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ltl/l;->a:Lku/p0;

    iget-object v1, p0, Ltl/l;->b:Lcom/roblox/universalapp/messagebus/MessageBus;

    check-cast p1, Lmm/m;

    invoke-static {v0, v1, p1}, Ltl/d0;->o(Lku/p0;Lcom/roblox/universalapp/messagebus/MessageBus;Lmm/m;)Ltl/i0;

    move-result-object p1

    return-object p1
.end method
