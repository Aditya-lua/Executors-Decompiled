.class public Lon/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lon/j$a;
    }
.end annotation


# static fields
.field public static final a:Lvn/a;

.field public static final b:Lvn/a;

.field public static final c:Lvn/a;

.field public static final d:Lvn/a;

.field public static final e:Lvn/a;

.field public static final f:Lvn/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Lvn/a;->b()Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x41

    const/16 v2, 0x5a

    invoke-virtual {v0, v1, v2}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x61

    const/16 v2, 0x7a

    invoke-virtual {v0, v1, v2}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvn/a$a;->b()Lvn/a;

    move-result-object v0

    sput-object v0, Lon/j;->a:Lvn/a;

    sput-object v0, Lon/j;->b:Lvn/a;

    invoke-virtual {v0}, Lvn/a;->c()Lvn/a$a;

    move-result-object v1

    const/16 v2, 0x30

    const/16 v3, 0x39

    invoke-virtual {v1, v2, v3}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v1

    const/16 v4, 0x2d

    invoke-virtual {v1, v4}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lvn/a$a;->b()Lvn/a;

    move-result-object v1

    sput-object v1, Lon/j;->c:Lvn/a;

    invoke-virtual {v0}, Lvn/a;->c()Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvn/a$a;->b()Lvn/a;

    move-result-object v0

    sput-object v0, Lon/j;->d:Lvn/a;

    invoke-virtual {v0}, Lvn/a;->c()Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lvn/a$a;->d(CC)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvn/a$a;->b()Lvn/a;

    move-result-object v0

    sput-object v0, Lon/j;->e:Lvn/a;

    invoke-static {}, Lvn/a;->b()Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    const/16 v1, 0x60

    invoke-virtual {v0, v1}, Lvn/a$a;->c(C)Lvn/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvn/a$a;->b()Lvn/a;

    move-result-object v0

    sput-object v0, Lon/j;->f:Lvn/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lsn/h;Lsn/i;)Lsn/g;
    .locals 1

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p0

    invoke-virtual {p0}, Lrn/j;->c()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lqn/l;

    invoke-direct {v0}, Lqn/l;-><init>()V

    invoke-virtual {v0, p0}, Lqn/l;->o(Ljava/lang/String;)V

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object p0

    invoke-static {v0, p0}, Lsn/g;->b(Lqn/s;Lsn/h;)Lsn/g;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lsn/i;)Z
    .locals 1

    invoke-virtual {p0}, Lsn/i;->h()V

    const-string v0, "CDATA["

    invoke-virtual {p0, v0}, Lsn/i;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Lsn/i;->b(C)I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "]]>"

    invoke-virtual {p0, v0}, Lsn/i;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static d(Lsn/i;)Z
    .locals 2

    invoke-virtual {p0}, Lsn/i;->h()V

    sget-object v0, Lon/j;->b:Lvn/a;

    invoke-virtual {p0, v0}, Lsn/i;->f(Lvn/c;)I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    sget-object v0, Lon/j;->c:Lvn/a;

    invoke-virtual {p0, v0}, Lsn/i;->f(Lvn/c;)I

    invoke-virtual {p0}, Lsn/i;->r()I

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lsn/i;->i(C)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Lsn/i;)Z
    .locals 4

    invoke-virtual {p0}, Lsn/i;->h()V

    const/16 v0, 0x2d

    invoke-virtual {p0, v0}, Lsn/i;->i(C)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/16 v1, 0x3e

    invoke-virtual {p0, v1}, Lsn/i;->i(C)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_4

    const-string v1, "->"

    invoke-virtual {p0, v1}, Lsn/i;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lsn/i;->b(C)I

    move-result v1

    if-ltz v1, :cond_3

    const-string v1, "-->"

    invoke-virtual {p0, v1}, Lsn/i;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v3

    :cond_2
    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_1
    return v3
.end method

.method public static f(Lsn/i;)Z
    .locals 2

    sget-object v0, Lon/j;->a:Lvn/a;

    invoke-virtual {p0, v0}, Lsn/i;->f(Lvn/c;)I

    invoke-virtual {p0}, Lsn/i;->r()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lsn/i;->b(C)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lsn/i;->h()V

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public static g(Lsn/i;)Z
    .locals 4

    invoke-virtual {p0}, Lsn/i;->h()V

    sget-object v0, Lon/j;->c:Lvn/a;

    invoke-virtual {p0, v0}, Lsn/i;->f(Lvn/c;)I

    invoke-virtual {p0}, Lsn/i;->r()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lt v0, v2, :cond_0

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_0
    move v0, v1

    :cond_1
    :goto_1
    if-eqz v0, :cond_8

    sget-object v0, Lon/j;->d:Lvn/a;

    invoke-virtual {p0, v0}, Lsn/i;->f(Lvn/c;)I

    move-result v0

    if-lt v0, v2, :cond_8

    sget-object v0, Lon/j;->e:Lvn/a;

    invoke-virtual {p0, v0}, Lsn/i;->f(Lvn/c;)I

    invoke-virtual {p0}, Lsn/i;->r()I

    move-result v0

    if-lt v0, v2, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    const/16 v3, 0x3d

    invoke-virtual {p0, v3}, Lsn/i;->i(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lsn/i;->r()I

    invoke-virtual {p0}, Lsn/i;->l()C

    move-result v0

    const/16 v3, 0x27

    if-ne v0, v3, :cond_4

    invoke-virtual {p0}, Lsn/i;->h()V

    invoke-virtual {p0, v3}, Lsn/i;->b(C)I

    move-result v0

    if-gez v0, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_3

    :cond_4
    const/16 v3, 0x22

    if-ne v0, v3, :cond_6

    invoke-virtual {p0}, Lsn/i;->h()V

    invoke-virtual {p0, v3}, Lsn/i;->b(C)I

    move-result v0

    if-gez v0, :cond_5

    return v1

    :cond_5
    invoke-virtual {p0}, Lsn/i;->h()V

    goto :goto_3

    :cond_6
    sget-object v0, Lon/j;->f:Lvn/a;

    invoke-virtual {p0, v0}, Lsn/i;->c(Lvn/c;)I

    move-result v0

    if-gtz v0, :cond_7

    return v1

    :cond_7
    :goto_3
    invoke-virtual {p0}, Lsn/i;->r()I

    move-result v0

    if-lt v0, v2, :cond_0

    goto :goto_0

    :cond_8
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Lsn/i;->i(C)Z

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lsn/i;->i(C)Z

    move-result p0

    return p0
.end method

.method public static h(Lsn/i;)Z
    .locals 1

    invoke-virtual {p0}, Lsn/i;->h()V

    :cond_0
    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Lsn/i;->b(C)I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lsn/i;->h()V

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lsn/i;->i(C)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Lsn/c;)Lsn/g;
    .locals 3

    invoke-interface {p1}, Lsn/c;->a()Lsn/i;

    move-result-object p1

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    invoke-virtual {p1}, Lsn/i;->h()V

    invoke-virtual {p1}, Lsn/i;->l()C

    move-result v1

    sget-object v2, Lon/j;->b:Lvn/a;

    invoke-virtual {v2, v1}, Lvn/a;->a(C)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1}, Lon/j;->g(Lsn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lon/j;->b(Lsn/h;Lsn/i;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v2, 0x2f

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lon/j;->d(Lsn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lon/j;->b(Lsn/h;Lsn/i;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v2, 0x3f

    if-ne v1, v2, :cond_2

    invoke-static {p1}, Lon/j;->h(Lsn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lon/j;->b(Lsn/h;Lsn/i;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 v2, 0x21

    if-ne v1, v2, :cond_5

    invoke-virtual {p1}, Lsn/i;->h()V

    invoke-virtual {p1}, Lsn/i;->l()C

    move-result v1

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lon/j;->e(Lsn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lon/j;->b(Lsn/h;Lsn/i;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_3
    const/16 v2, 0x5b

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lon/j;->c(Lsn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lon/j;->b(Lsn/h;Lsn/i;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object v2, Lon/j;->a:Lvn/a;

    invoke-virtual {v2, v1}, Lvn/a;->a(C)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {p1}, Lon/j;->f(Lsn/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lon/j;->b(Lsn/h;Lsn/i;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {}, Lsn/g;->a()Lsn/g;

    move-result-object p1

    return-object p1
.end method
