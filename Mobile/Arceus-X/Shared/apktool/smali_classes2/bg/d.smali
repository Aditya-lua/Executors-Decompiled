.class public abstract Lbg/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbg/d$a;
    }
.end annotation


# static fields
.field public static a:Lbg/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lbg/d;->a()Lbg/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lbg/d$a;->a()Lbg/d;

    move-result-object v0

    sput-object v0, Lbg/d;->a:Lbg/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lbg/d$a;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lbg/a$b;

    invoke-direct {v0}, Lbg/a$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lbg/a$b;->h(J)Lbg/d$a;

    move-result-object v0

    sget-object v3, Lbg/c$a;->a:Lbg/c$a;

    invoke-virtual {v0, v3}, Lbg/d$a;->g(Lbg/c$a;)Lbg/d$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lbg/d$a;->c(J)Lbg/d$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Lbg/c$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract h()J
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, Lbg/d;->g()Lbg/c$a;

    move-result-object v0

    sget-object v1, Lbg/c$a;->e:Lbg/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j()Z
    .locals 2

    invoke-virtual {p0}, Lbg/d;->g()Lbg/c$a;

    move-result-object v0

    sget-object v1, Lbg/c$a;->b:Lbg/c$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lbg/d;->g()Lbg/c$a;

    move-result-object v0

    sget-object v1, Lbg/c$a;->a:Lbg/c$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public k()Z
    .locals 2

    invoke-virtual {p0}, Lbg/d;->g()Lbg/c$a;

    move-result-object v0

    sget-object v1, Lbg/c$a;->d:Lbg/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, Lbg/d;->g()Lbg/c$a;

    move-result-object v0

    sget-object v1, Lbg/c$a;->c:Lbg/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Lbg/d;->g()Lbg/c$a;

    move-result-object v0

    sget-object v1, Lbg/c$a;->a:Lbg/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract n()Lbg/d$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public o(Ljava/lang/String;JJ)Lbg/d;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lbg/d;->n()Lbg/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbg/d$a;->b(Ljava/lang/String;)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lbg/d$a;->c(J)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, Lbg/d$a;->h(J)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lbg/d$a;->a()Lbg/d;

    move-result-object p1

    return-object p1
.end method

.method public p()Lbg/d;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lbg/d;->n()Lbg/d$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbg/d$a;->b(Ljava/lang/String;)Lbg/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lbg/d$a;->a()Lbg/d;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)Lbg/d;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lbg/d;->n()Lbg/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbg/d$a;->e(Ljava/lang/String;)Lbg/d$a;

    move-result-object p1

    sget-object v0, Lbg/c$a;->e:Lbg/c$a;

    invoke-virtual {p1, v0}, Lbg/d$a;->g(Lbg/c$a;)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lbg/d$a;->a()Lbg/d;

    move-result-object p1

    return-object p1
.end method

.method public r()Lbg/d;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lbg/d;->n()Lbg/d$a;

    move-result-object v0

    sget-object v1, Lbg/c$a;->b:Lbg/c$a;

    invoke-virtual {v0, v1}, Lbg/d$a;->g(Lbg/c$a;)Lbg/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lbg/d$a;->a()Lbg/d;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lbg/d;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lbg/d;->n()Lbg/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbg/d$a;->d(Ljava/lang/String;)Lbg/d$a;

    move-result-object p1

    sget-object v0, Lbg/c$a;->d:Lbg/c$a;

    invoke-virtual {p1, v0}, Lbg/d$a;->g(Lbg/c$a;)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1, p5}, Lbg/d$a;->b(Ljava/lang/String;)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lbg/d$a;->f(Ljava/lang/String;)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1, p6, p7}, Lbg/d$a;->c(J)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lbg/d$a;->h(J)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lbg/d$a;->a()Lbg/d;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Lbg/d;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lbg/d;->n()Lbg/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbg/d$a;->d(Ljava/lang/String;)Lbg/d$a;

    move-result-object p1

    sget-object v0, Lbg/c$a;->c:Lbg/c$a;

    invoke-virtual {p1, v0}, Lbg/d$a;->g(Lbg/c$a;)Lbg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lbg/d$a;->a()Lbg/d;

    move-result-object p1

    return-object p1
.end method
