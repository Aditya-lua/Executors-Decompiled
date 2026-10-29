.class public final synthetic Lkh/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/roblox/client/db/RobloxDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/db/RobloxDatabase_Impl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkh/h;->a:Lcom/roblox/client/db/RobloxDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkh/h;->a:Lcom/roblox/client/db/RobloxDatabase_Impl;

    invoke-static {v0}, Lcom/roblox/client/db/RobloxDatabase_Impl;->a0(Lcom/roblox/client/db/RobloxDatabase_Impl;)Llh/g;

    move-result-object v0

    return-object v0
.end method
