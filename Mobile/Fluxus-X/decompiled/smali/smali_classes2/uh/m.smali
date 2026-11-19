.class public final Luh/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luh/m$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\u0008\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0015R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Luh/m;",
        "Luh/i;",
        "Ly4/u;",
        "__db",
        "<init>",
        "(Ly4/u;)V",
        "",
        "Lvh/b;",
        "notificationIds",
        "",
        "b",
        "([Lvh/b;Leu/b;)Ljava/lang/Object;",
        "",
        "notificationId",
        "",
        "c",
        "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;",
        "",
        "maxRowsCount",
        "a",
        "(ILeu/b;)Ljava/lang/Object;",
        "Ly4/u;",
        "Ly4/f;",
        "Ly4/f;",
        "__insertAdapterOfNotificationId",
        "d",
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


# static fields
.field public static final d:Luh/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Ly4/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ly4/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly4/f<",
            "Lvh/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Luh/m$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luh/m$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Luh/m;->d:Luh/m$b;

    return-void
.end method

.method public constructor <init>(Ly4/u;)V
    .locals 1
    .param p1    # Ly4/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/m;->b:Ly4/u;

    new-instance p1, Luh/m$a;

    invoke-direct {p1}, Luh/m$a;-><init>()V

    iput-object p1, p0, Luh/m;->c:Ly4/f;

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/lang/String;Lg5/b;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Luh/m;->j(Ljava/lang/String;Ljava/lang/String;Lg5/b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Ljava/lang/String;ILg5/b;)I
    .locals 0

    invoke-static {p0, p1, p2}, Luh/m;->i(Ljava/lang/String;ILg5/b;)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Luh/m;[Lvh/b;Lg5/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Luh/m;->k(Luh/m;[Lvh/b;Lg5/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/lang/String;ILg5/b;)I
    .locals 3

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lg5/b;->w3(Ljava/lang/String;)Lg5/d;

    move-result-object p0

    const/4 v0, 0x1

    int-to-long v1, p1

    :try_start_0
    invoke-interface {p0, v0, v1, v2}, Lg5/d;->B(IJ)V

    invoke-interface {p0}, Lg5/d;->n3()Z

    invoke-static {p2}, Ld5/i;->b(Lg5/b;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Lg5/d;->close()V

    return p1

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Lg5/d;->close()V

    throw p1
.end method

.method public static final j(Ljava/lang/String;Ljava/lang/String;Lg5/b;)Z
    .locals 3

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lg5/b;->w3(Ljava/lang/String;)Lg5/d;

    move-result-object p0

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p0, p2, p1}, Lg5/d;->m0(ILjava/lang/String;)V

    invoke-interface {p0}, Lg5/d;->n3()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p0, v0}, Lg5/d;->getLong(I)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int p1, v1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    move v0, p2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-interface {p0}, Lg5/d;->close()V

    return v0

    :goto_2
    invoke-interface {p0}, Lg5/d;->close()V

    throw p1
.end method

.method public static final k(Luh/m;[Lvh/b;Lg5/b;)Lkotlin/Unit;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Luh/m;->c:Ly4/f;

    invoke-virtual {p0, p2, p1}, Ly4/f;->e(Lg5/b;[Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public a(ILeu/b;)Ljava/lang/Object;
    .locals 3
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Leu/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Luh/m;->b:Ly4/u;

    new-instance v1, Luh/k;

    const-string v2, "\n        DELETE FROM notification_id\n        WHERE notification_id IN (\n            SELECT notification_id\n            FROM notification_id\n            ORDER BY last_received_timestamp_ms DESC\n            LIMIT -1 OFFSET ?\n        )\n    "

    invoke-direct {v1, v2, p1}, Luh/k;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Ld5/a;->e(Ly4/u;ZZLkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b([Lvh/b;Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p1    # [Lvh/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lvh/b;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Luh/m;->b:Ly4/u;

    new-instance v1, Luh/l;

    invoke-direct {v1, p0, p1}, Luh/l;-><init>(Luh/m;[Lvh/b;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Ld5/a;->e(Ly4/u;ZZLkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public c(Ljava/lang/String;Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Luh/m;->b:Ly4/u;

    new-instance v1, Luh/j;

    const-string v2, "SELECT COUNT(*) > 0 FROM notification_id WHERE notification_id = ?"

    invoke-direct {v1, v2, p1}, Luh/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Ld5/a;->e(Ly4/u;ZZLkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge e([Lvh/b;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # [Lvh/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lvh/b;",
            "Leu/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-super {p0, p1, p2}, Luh/i;->e([Lvh/b;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
