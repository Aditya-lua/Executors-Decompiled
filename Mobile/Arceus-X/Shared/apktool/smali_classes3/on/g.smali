.class public Lon/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lsn/d;Lsn/i;Ljava/lang/String;Ljava/lang/String;)Lsn/f;
    .locals 1

    invoke-interface {p0}, Lsn/d;->a()Lqn/b0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lsn/d;->a()Lqn/b0;

    move-result-object p0

    invoke-virtual {p0}, Lqn/b0;->o()Ljava/lang/String;

    move-result-object p0

    const-string v0, "!"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lqn/m;

    invoke-direct {p0, p2, p3}, Lqn/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object p1

    invoke-static {p0, p1}, Lsn/f;->c(Lqn/s;Lsn/h;)Lsn/f;

    move-result-object p0

    invoke-interface {p0}, Lsn/f;->b()Lsn/f;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lqn/o;

    invoke-direct {p0, p2, p3}, Lqn/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object p1

    invoke-static {p0, p1}, Lsn/f;->c(Lqn/s;Lsn/h;)Lsn/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lsn/d;Lsn/i;Lrn/c;)Lsn/f;
    .locals 2

    invoke-interface {p1}, Lsn/d;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lsn/d;->e()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1}, Lsn/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lon/g;->b(Lsn/d;Lsn/i;Ljava/lang/String;Ljava/lang/String;)Lsn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lsn/d;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lsn/d;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-class v1, Lqn/p;

    invoke-interface {p3, v1, v0}, Lrn/c;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lqn/p;

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lqn/p;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lqn/p;->r()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p2, v0, p3}, Lon/g;->b(Lsn/d;Lsn/i;Ljava/lang/String;Ljava/lang/String;)Lsn/f;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lsn/f;->a()Lsn/f;

    move-result-object p1

    return-object p1
.end method
