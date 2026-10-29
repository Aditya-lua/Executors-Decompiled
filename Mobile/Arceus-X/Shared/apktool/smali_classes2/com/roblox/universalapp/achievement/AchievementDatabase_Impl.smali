.class public final Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;
.super Lcom/roblox/universalapp/achievement/AchievementDatabase;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\r\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b0\u000c0\nH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J1\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000c2\u001a\u0010\u0013\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;",
        "Lcom/roblox/universalapp/achievement/AchievementDatabase;",
        "<init>",
        "()V",
        "Lx4/a0;",
        "d0",
        "()Lx4/a0;",
        "Landroidx/room/c;",
        "m",
        "()Landroidx/room/c;",
        "",
        "Lhu/c;",
        "",
        "y",
        "()Ljava/util/Map;",
        "",
        "La5/a;",
        "w",
        "()Ljava/util/Set;",
        "autoMigrationSpecs",
        "La5/b;",
        "j",
        "(Ljava/util/Map;)Ljava/util/List;",
        "Lsl/b;",
        "Z",
        "()Lsl/b;",
        "Ljt/h;",
        "q",
        "Ljt/h;",
        "_achievementDao",
        "database_googleProdRelease"
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
.field public final q:Ljt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljt/h<",
            "Lsl/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/universalapp/achievement/AchievementDatabase;-><init>()V

    new-instance v0, Lsl/i;

    invoke-direct {v0, p0}, Lsl/i;-><init>(Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;)V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;->q:Ljt/h;

    return-void
.end method

.method public static synthetic a0(Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;)Lcom/roblox/universalapp/achievement/a;
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;->b0(Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;)Lcom/roblox/universalapp/achievement/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b0(Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;)Lcom/roblox/universalapp/achievement/a;
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/achievement/a;

    invoke-direct {v0, p0}, Lcom/roblox/universalapp/achievement/a;-><init>(Lx4/u;)V

    return-object v0
.end method

.method public static final synthetic c0(Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;Lf5/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lx4/u;->K(Lf5/b;)V

    return-void
.end method


# virtual methods
.method public Z()Lsl/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;->q:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsl/b;

    return-object v0
.end method

.method public d0()Lx4/a0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl$a;

    invoke-direct {v0, p0}, Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl$a;-><init>(Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;)V

    return-object v0
.end method

.method public j(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lhu/c<",
            "+",
            "La5/a;",
            ">;+",
            "La5/a;",
            ">;)",
            "Ljava/util/List<",
            "La5/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public m()Landroidx/room/c;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Landroidx/room/c;

    const-string v3, "achievements"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/room/c;-><init>(Lx4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v2
.end method

.method public bridge synthetic n()Lx4/b0;
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/universalapp/achievement/AchievementDatabase_Impl;->d0()Lx4/a0;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lhu/c<",
            "+",
            "La5/a;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public y()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lhu/c<",
            "*>;",
            "Ljava/util/List<",
            "Lhu/c<",
            "*>;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-class v1, Lsl/b;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    sget-object v2, Lcom/roblox/universalapp/achievement/a;->e:Lcom/roblox/universalapp/achievement/a$c;

    invoke-virtual {v2}, Lcom/roblox/universalapp/achievement/a$c;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
