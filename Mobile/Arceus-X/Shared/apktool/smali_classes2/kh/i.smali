.class public final synthetic Lkh/i;
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

    iput-object p1, p0, Lkh/i;->a:Lcom/roblox/client/db/RobloxDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkh/i;->a:Lcom/roblox/client/db/RobloxDatabase_Impl;

    invoke-static {v0}, Lcom/roblox/client/db/RobloxDatabase_Impl;->Z(Lcom/roblox/client/db/RobloxDatabase_Impl;)Llh/m;

    move-result-object v0

    return-object v0
.end method
