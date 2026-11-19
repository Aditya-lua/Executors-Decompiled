.class public abstract Ldg/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg/d$a;
    }
.end annotation


# static fields
.field public static a:Ldg/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ldg/d;->a()Ldg/d$a;

    move-result-object v0

    invoke-virtual {v0}, Ldg/d$a;->a()Ldg/d;

    move-result-object v0

    sput-object v0, Ldg/d;->a:Ldg/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ldg/d$a;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ldg/a$b;

    invoke-direct {v0}, Ldg/a$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ldg/a$b;->h(J)Ldg/d$a;

    move-result-object v0

    sget-object v3, Ldg/c$a;->a:Ldg/c$a;

    invoke-virtual {v0, v3}, Ldg/d$a;->g(Ldg/c$a;)Ldg/d$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ldg/d$a;->c(J)Ldg/d$a;

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

.method public abstract g()Ldg/c$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract h()J
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, Ldg/d;->g()Ldg/c$a;

    move-result-object v0

    sget-object v1, Ldg/c$a;->e:Ldg/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j()Z
    .locals 2

    invoke-virtual {p0}, Ldg/d;->g()Ldg/c$a;

    move-result-object v0

    sget-object v1, Ldg/c$a;->b:Ldg/c$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Ldg/d;->g()Ldg/c$a;

    move-result-object v0

    sget-object v1, Ldg/c$a;->a:Ldg/c$a;

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

    invoke-virtual {p0}, Ldg/d;->g()Ldg/c$a;

    move-result-object v0

    sget-object v1, Ldg/c$a;->d:Ldg/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, Ldg/d;->g()Ldg/c$a;

    move-result-object v0

    sget-object v1, Ldg/c$a;->c:Ldg/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Ldg/d;->g()Ldg/c$a;

    move-result-object v0

    sget-object v1, Ldg/c$a;->a:Ldg/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract n()Ldg/d$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public o(Ljava/lang/String;JJ)Ldg/d;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Ldg/d;->n()Ldg/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldg/d$a;->b(Ljava/lang/String;)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Ldg/d$a;->c(J)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, Ldg/d$a;->h(J)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Ldg/d$a;->a()Ldg/d;

    move-result-object p1

    return-object p1
.end method

.method public p()Ldg/d;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Ldg/d;->n()Ldg/d$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ldg/d$a;->b(Ljava/lang/String;)Ldg/d$a;

    move-result-object v0

    invoke-virtual {v0}, Ldg/d$a;->a()Ldg/d;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)Ldg/d;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Ldg/d;->n()Ldg/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldg/d$a;->e(Ljava/lang/String;)Ldg/d$a;

    move-result-object p1

    sget-object v0, Ldg/c$a;->e:Ldg/c$a;

    invoke-virtual {p1, v0}, Ldg/d$a;->g(Ldg/c$a;)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Ldg/d$a;->a()Ldg/d;

    move-result-object p1

    return-object p1
.end method

.method public r()Ldg/d;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Ldg/d;->n()Ldg/d$a;

    move-result-object v0

    sget-object v1, Ldg/c$a;->b:Ldg/c$a;

    invoke-virtual {v0, v1}, Ldg/d$a;->g(Ldg/c$a;)Ldg/d$a;

    move-result-object v0

    invoke-virtual {v0}, Ldg/d$a;->a()Ldg/d;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Ldg/d;
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

    invoke-virtual {p0}, Ldg/d;->n()Ldg/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldg/d$a;->d(Ljava/lang/String;)Ldg/d$a;

    move-result-object p1

    sget-object v0, Ldg/c$a;->d:Ldg/c$a;

    invoke-virtual {p1, v0}, Ldg/d$a;->g(Ldg/c$a;)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1, p5}, Ldg/d$a;->b(Ljava/lang/String;)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Ldg/d$a;->f(Ljava/lang/String;)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1, p6, p7}, Ldg/d$a;->c(J)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Ldg/d$a;->h(J)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Ldg/d$a;->a()Ldg/d;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Ldg/d;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Ldg/d;->n()Ldg/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldg/d$a;->d(Ljava/lang/String;)Ldg/d$a;

    move-result-object p1

    sget-object v0, Ldg/c$a;->c:Ldg/c$a;

    invoke-virtual {p1, v0}, Ldg/d$a;->g(Ldg/c$a;)Ldg/d$a;

    move-result-object p1

    invoke-virtual {p1}, Ldg/d$a;->a()Ldg/d;

    move-result-object p1

    return-object p1
.end method
