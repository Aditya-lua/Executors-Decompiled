.class public final Lcom/roblox/client/db/RobloxDatabase_Impl;
.super Lcom/roblox/client/db/RobloxDatabase;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\r\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b0\u000c0\nH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J1\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000c2\u001a\u0010\u0013\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lcom/roblox/client/db/RobloxDatabase_Impl;",
        "Lcom/roblox/client/db/RobloxDatabase;",
        "<init>",
        "()V",
        "Ly4/a0;",
        "e0",
        "()Ly4/a0;",
        "Landroidx/room/c;",
        "m",
        "()Landroidx/room/c;",
        "",
        "Lxu/c;",
        "",
        "y",
        "()Ljava/util/Map;",
        "",
        "Lb5/a;",
        "w",
        "()Ljava/util/Set;",
        "autoMigrationSpecs",
        "Lb5/b;",
        "j",
        "(Ljava/util/Map;)Ljava/util/List;",
        "Luh/a;",
        "X",
        "()Luh/a;",
        "Luh/i;",
        "Y",
        "()Luh/i;",
        "Lzt/h;",
        "o",
        "Lzt/h;",
        "_analyticEventDao",
        "p",
        "_notificationIdDao",
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
.field public final o:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Luh/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Lzt/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/h<",
            "Luh/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/client/db/RobloxDatabase;-><init>()V

    new-instance v0, Lth/h;

    invoke-direct {v0, p0}, Lth/h;-><init>(Lcom/roblox/client/db/RobloxDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/db/RobloxDatabase_Impl;->o:Lzt/h;

    new-instance v0, Lth/i;

    invoke-direct {v0, p0}, Lth/i;-><init>(Lcom/roblox/client/db/RobloxDatabase_Impl;)V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/db/RobloxDatabase_Impl;->p:Lzt/h;

    return-void
.end method

.method public static synthetic Z(Lcom/roblox/client/db/RobloxDatabase_Impl;)Luh/m;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/db/RobloxDatabase_Impl;->c0(Lcom/roblox/client/db/RobloxDatabase_Impl;)Luh/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lcom/roblox/client/db/RobloxDatabase_Impl;)Luh/g;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/db/RobloxDatabase_Impl;->b0(Lcom/roblox/client/db/RobloxDatabase_Impl;)Luh/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b0(Lcom/roblox/client/db/RobloxDatabase_Impl;)Luh/g;
    .locals 1

    new-instance v0, Luh/g;

    invoke-direct {v0, p0}, Luh/g;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final c0(Lcom/roblox/client/db/RobloxDatabase_Impl;)Luh/m;
    .locals 1

    new-instance v0, Luh/m;

    invoke-direct {v0, p0}, Luh/m;-><init>(Ly4/u;)V

    return-object v0
.end method

.method public static final synthetic d0(Lcom/roblox/client/db/RobloxDatabase_Impl;Lg5/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly4/u;->K(Lg5/b;)V

    return-void
.end method


# virtual methods
.method public X()Luh/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/db/RobloxDatabase_Impl;->o:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh/a;

    return-object v0
.end method

.method public Y()Luh/i;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/db/RobloxDatabase_Impl;->p:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh/i;

    return-object v0
.end method

.method public e0()Ly4/a0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/roblox/client/db/RobloxDatabase_Impl$a;

    invoke-direct {v0, p0}, Lcom/roblox/client/db/RobloxDatabase_Impl$a;-><init>(Lcom/roblox/client/db/RobloxDatabase_Impl;)V

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
            "Lxu/c<",
            "+",
            "Lb5/a;",
            ">;+",
            "Lb5/a;",
            ">;)",
            "Ljava/util/List<",
            "Lb5/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lth/d;

    invoke-direct {v0}, Lth/d;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lth/e;

    invoke-direct {v0}, Lth/e;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lth/f;

    invoke-direct {v0}, Lth/f;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lth/g;

    invoke-direct {v0}, Lth/g;-><init>()V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public m()Landroidx/room/c;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Landroidx/room/c;

    const-string v3, "analytic_event"

    const-string v4, "notification_id"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/room/c;-><init>(Ly4/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v2
.end method

.method public bridge synthetic n()Ly4/b0;
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/db/RobloxDatabase_Impl;->e0()Ly4/a0;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lxu/c<",
            "+",
            "Lb5/a;",
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
            "Lxu/c<",
            "*>;",
            "Ljava/util/List<",
            "Lxu/c<",
            "*>;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-class v1, Luh/a;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Luh/g;->f:Luh/g$d;

    invoke-virtual {v2}, Luh/g$d;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Luh/i;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    sget-object v2, Luh/m;->d:Luh/m$b;

    invoke-virtual {v2}, Luh/m$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
