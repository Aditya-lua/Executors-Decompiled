.class public final Lx3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u001a5\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a1\u0010\u000e\u001a$\u0008\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a9\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\" \u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "",
        "sharedPreferencesName",
        "",
        "keysToMigrate",
        "Lw3/a;",
        "Ly3/f;",
        "a",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Lw3/a;",
        "Lkotlin/Function3;",
        "Lw3/c;",
        "Leu/b;",
        "",
        "d",
        "()Lpu/n;",
        "Lkotlin/Function2;",
        "",
        "e",
        "(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;",
        "Ljava/util/Set;",
        "c",
        "()Ljava/util/Set;",
        "MIGRATE_ALL_KEYS",
        "datastore-preferences_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Lx3/i;->a:Ljava/util/Set;

    return-void
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Lw3/a;
    .locals 9
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lw3/a<",
            "Ly3/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedPreferencesName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keysToMigrate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lx3/i;->a:Ljava/util/Set;

    if-ne p2, v0, :cond_0

    new-instance v1, Lw3/a;

    invoke-static {p2}, Lx3/i;->e(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {}, Lx3/i;->d()Lpu/n;

    move-result-object v6

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lw3/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lpu/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    move-object v2, p0

    move-object v3, p1

    new-instance p0, Lw3/a;

    invoke-static {p2}, Lx3/i;->e(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {}, Lx3/i;->d()Lpu/n;

    move-result-object v7

    move-object v5, p2

    move-object v4, v3

    move-object v3, v2

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lw3/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lpu/n;)V

    return-object v2
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Lw3/a;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    sget-object p2, Lx3/i;->a:Ljava/util/Set;

    :cond_0
    invoke-static {p0, p1, p2}, Lx3/i;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Lw3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lx3/i;->a:Ljava/util/Set;

    return-object v0
.end method

.method public static final d()Lpu/n;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpu/n<",
            "Lw3/c;",
            "Ly3/f;",
            "Leu/b<",
            "-",
            "Ly3/f;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx3/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx3/i$a;-><init>(Leu/b;)V

    return-object v0
.end method

.method public static final e(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lkotlin/jvm/functions/Function2<",
            "Ly3/f;",
            "Leu/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx3/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx3/i$b;-><init>(Ljava/util/Set;Leu/b;)V

    return-object v0
.end method
