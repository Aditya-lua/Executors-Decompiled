.class public final synthetic Lsl/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl/i;->a:Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsl/i;->a:Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;

    invoke-static {v0}, Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;->a0(Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;)Lcom/roblox/universalapp/achievement/a;

    move-result-object v0

    return-object v0
.end method
