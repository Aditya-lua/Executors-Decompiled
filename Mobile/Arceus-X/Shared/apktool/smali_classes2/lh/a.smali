.class public interface abstract Llh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llh/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008g\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "Llh/a;",
        "",
        "",
        "f",
        "(Lnt/b;)Ljava/lang/Object;",
        "batchSize",
        "",
        "Lmh/a;",
        "l",
        "(ILnt/b;)Ljava/lang/Object;",
        "a",
        "",
        "events",
        "",
        "g",
        "([Lmh/a;Lnt/b;)Ljava/lang/Object;",
        "",
        "i",
        "m",
        "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;",
        "h",
        "event",
        "k",
        "(Lmh/a;Lnt/b;)Ljava/lang/Object;",
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
.field public static final a:Llh/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Llh/a$a;->a:Llh/a$a;

    sput-object v0, Llh/a;->a:Llh/a$a;

    return-void
.end method

.method public static synthetic b(Llh/a;Lmh/a;Lnt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/a;",
            "Lmh/a;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llh/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llh/a$b;-><init>(Llh/a;Lmh/a;Lnt/b;)V

    const-string p0, "AnalyticEventDao"

    invoke-static {p0, v0, p2}, Llh/h;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic c(Llh/a;[Lmh/a;Lnt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/a;",
            "[",
            "Lmh/a;",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llh/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llh/a$d;-><init>(Llh/a;[Lmh/a;Lnt/b;)V

    const-string p0, "AnalyticEventDao"

    invoke-static {p0, v0, p2}, Llh/h;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llh/a;Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/a;",
            "Ljava/util/List<",
            "Lmh/a;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llh/a$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llh/a$e;-><init>(Llh/a;Ljava/util/List;Lnt/b;)V

    const-string p0, "AnalyticEventDao"

    invoke-static {p0, v0, p2}, Llh/h;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic j(Llh/a;ILnt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/a;",
            "I",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "Lmh/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llh/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llh/a$c;-><init>(Llh/a;ILnt/b;)V

    const-string p0, "AnalyticEventDao"

    invoke-static {p0, v0, p2}, Llh/h;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(ILnt/b;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "Lmh/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Llh/a;->j(Llh/a;ILnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lmh/a;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lmh/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/a;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Llh/a;->b(Llh/a;Lmh/a;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(Lnt/b;)Ljava/lang/Object;
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract g([Lmh/a;Lnt/b;)Ljava/lang/Object;
    .param p1    # [Lmh/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lmh/a;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public h(Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lmh/a;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Llh/a;->e(Llh/a;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i([Lmh/a;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # [Lmh/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lmh/a;",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Llh/a;->c(Llh/a;[Lmh/a;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract k(Lmh/a;Lnt/b;)Ljava/lang/Object;
    .param p1    # Lmh/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/a;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract l(ILnt/b;)Ljava/lang/Object;
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "Lmh/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract m(Ljava/util/List;Lnt/b;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lmh/a;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
