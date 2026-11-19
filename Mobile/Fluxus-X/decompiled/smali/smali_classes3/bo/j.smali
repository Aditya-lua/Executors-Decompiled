.class public Lbo/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/j$a;
    }
.end annotation


# static fields
.field public static final a:Ljo/a;

.field public static final b:Ljo/a;

.field public static final c:Ljo/a;

.field public static final d:Ljo/a;

.field public static final e:Ljo/a;

.field public static final f:Ljo/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Ljo/a;->b()Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x41

    const/16 v2, 0x5a

    invoke-virtual {v0, v1, v2}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x61

    const/16 v2, 0x7a

    invoke-virtual {v0, v1, v2}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljo/a$a;->b()Ljo/a;

    move-result-object v0

    sput-object v0, Lbo/j;->a:Ljo/a;

    sput-object v0, Lbo/j;->b:Ljo/a;

    invoke-virtual {v0}, Ljo/a;->c()Ljo/a$a;

    move-result-object v1

    const/16 v2, 0x30

    const/16 v3, 0x39

    invoke-virtual {v1, v2, v3}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v1

    const/16 v4, 0x2d

    invoke-virtual {v1, v4}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v1

    invoke-virtual {v1}, Ljo/a$a;->b()Ljo/a;

    move-result-object v1

    sput-object v1, Lbo/j;->c:Ljo/a;

    invoke-virtual {v0}, Ljo/a;->c()Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljo/a$a;->b()Ljo/a;

    move-result-object v0

    sput-object v0, Lbo/j;->d:Ljo/a;

    invoke-virtual {v0}, Ljo/a;->c()Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljo/a$a;->d(CC)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljo/a$a;->b()Ljo/a;

    move-result-object v0

    sput-object v0, Lbo/j;->e:Ljo/a;

    invoke-static {}, Ljo/a;->b()Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    const/16 v1, 0x60

    invoke-virtual {v0, v1}, Ljo/a$a;->c(C)Ljo/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljo/a$a;->b()Ljo/a;

    move-result-object v0

    sput-object v0, Lbo/j;->f:Ljo/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lgo/h;Lgo/i;)Lgo/g;
    .locals 1

    invoke-virtual {p1}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p0

    invoke-virtual {p0}, Lfo/j;->c()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Leo/l;

    invoke-direct {v0}, Leo/l;-><init>()V

    invoke-virtual {v0, p0}, Leo/l;->o(Ljava/lang/String;)V

    invoke-virtual {p1}, Lgo/i;->o()Lgo/h;

    move-result-object p0

    invoke-static {v0, p0}, Lgo/g;->b(Leo/s;Lgo/h;)Lgo/g;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lgo/i;)Z
    .locals 1

    invoke-virtual {p0}, Lgo/i;->h()V

    const-string v0, "CDATA["

    invoke-virtual {p0, v0}, Lgo/i;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Lgo/i;->b(C)I

    move-result v0

    if-ltz v0, :cond_1

    const-string v0, "]]>"

    invoke-virtual {p0, v0}, Lgo/i;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Lgo/i;->h()V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static d(Lgo/i;)Z
    .locals 2

    invoke-virtual {p0}, Lgo/i;->h()V

    sget-object v0, Lbo/j;->b:Ljo/a;

    invoke-virtual {p0, v0}, Lgo/i;->f(Ljo/c;)I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    sget-object v0, Lbo/j;->c:Ljo/a;

    invoke-virtual {p0, v0}, Lgo/i;->f(Ljo/c;)I

    invoke-virtual {p0}, Lgo/i;->r()I

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lgo/i;->i(C)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Lgo/i;)Z
    .locals 4

    invoke-virtual {p0}, Lgo/i;->h()V

    const/16 v0, 0x2d

    invoke-virtual {p0, v0}, Lgo/i;->i(C)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const/16 v1, 0x3e

    invoke-virtual {p0, v1}, Lgo/i;->i(C)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_4

    const-string v1, "->"

    invoke-virtual {p0, v1}, Lgo/i;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lgo/i;->b(C)I

    move-result v1

    if-ltz v1, :cond_3

    const-string v1, "-->"

    invoke-virtual {p0, v1}, Lgo/i;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v3

    :cond_2
    invoke-virtual {p0}, Lgo/i;->h()V

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_1
    return v3
.end method

.method public static f(Lgo/i;)Z
    .locals 2

    sget-object v0, Lbo/j;->a:Ljo/a;

    invoke-virtual {p0, v0}, Lgo/i;->f(Ljo/c;)I

    invoke-virtual {p0}, Lgo/i;->r()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lgo/i;->b(C)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lgo/i;->h()V

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public static g(Lgo/i;)Z
    .locals 4

    invoke-virtual {p0}, Lgo/i;->h()V

    sget-object v0, Lbo/j;->c:Ljo/a;

    invoke-virtual {p0, v0}, Lgo/i;->f(Ljo/c;)I

    invoke-virtual {p0}, Lgo/i;->r()I

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

    sget-object v0, Lbo/j;->d:Ljo/a;

    invoke-virtual {p0, v0}, Lgo/i;->f(Ljo/c;)I

    move-result v0

    if-lt v0, v2, :cond_8

    sget-object v0, Lbo/j;->e:Ljo/a;

    invoke-virtual {p0, v0}, Lgo/i;->f(Ljo/c;)I

    invoke-virtual {p0}, Lgo/i;->r()I

    move-result v0

    if-lt v0, v2, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    const/16 v3, 0x3d

    invoke-virtual {p0, v3}, Lgo/i;->i(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lgo/i;->r()I

    invoke-virtual {p0}, Lgo/i;->l()C

    move-result v0

    const/16 v3, 0x27

    if-ne v0, v3, :cond_4

    invoke-virtual {p0}, Lgo/i;->h()V

    invoke-virtual {p0, v3}, Lgo/i;->b(C)I

    move-result v0

    if-gez v0, :cond_3

    return v1

    :cond_3
    invoke-virtual {p0}, Lgo/i;->h()V

    goto :goto_3

    :cond_4
    const/16 v3, 0x22

    if-ne v0, v3, :cond_6

    invoke-virtual {p0}, Lgo/i;->h()V

    invoke-virtual {p0, v3}, Lgo/i;->b(C)I

    move-result v0

    if-gez v0, :cond_5

    return v1

    :cond_5
    invoke-virtual {p0}, Lgo/i;->h()V

    goto :goto_3

    :cond_6
    sget-object v0, Lbo/j;->f:Ljo/a;

    invoke-virtual {p0, v0}, Lgo/i;->c(Ljo/c;)I

    move-result v0

    if-gtz v0, :cond_7

    return v1

    :cond_7
    :goto_3
    invoke-virtual {p0}, Lgo/i;->r()I

    move-result v0

    if-lt v0, v2, :cond_0

    goto :goto_0

    :cond_8
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Lgo/i;->i(C)Z

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lgo/i;->i(C)Z

    move-result p0

    return p0
.end method

.method public static h(Lgo/i;)Z
    .locals 1

    invoke-virtual {p0}, Lgo/i;->h()V

    :cond_0
    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Lgo/i;->b(C)I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lgo/i;->h()V

    const/16 v0, 0x3e

    invoke-virtual {p0, v0}, Lgo/i;->i(C)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Lgo/c;)Lgo/g;
    .locals 3

    invoke-interface {p1}, Lgo/c;->a()Lgo/i;

    move-result-object p1

    invoke-virtual {p1}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    invoke-virtual {p1}, Lgo/i;->h()V

    invoke-virtual {p1}, Lgo/i;->l()C

    move-result v1

    sget-object v2, Lbo/j;->b:Ljo/a;

    invoke-virtual {v2, v1}, Ljo/a;->a(C)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1}, Lbo/j;->g(Lgo/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lbo/j;->b(Lgo/h;Lgo/i;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v2, 0x2f

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lbo/j;->d(Lgo/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lbo/j;->b(Lgo/h;Lgo/i;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v2, 0x3f

    if-ne v1, v2, :cond_2

    invoke-static {p1}, Lbo/j;->h(Lgo/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lbo/j;->b(Lgo/h;Lgo/i;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 v2, 0x21

    if-ne v1, v2, :cond_5

    invoke-virtual {p1}, Lgo/i;->h()V

    invoke-virtual {p1}, Lgo/i;->l()C

    move-result v1

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lbo/j;->e(Lgo/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lbo/j;->b(Lgo/h;Lgo/i;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_3
    const/16 v2, 0x5b

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lbo/j;->c(Lgo/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lbo/j;->b(Lgo/h;Lgo/i;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object v2, Lbo/j;->a:Ljo/a;

    invoke-virtual {v2, v1}, Ljo/a;->a(C)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {p1}, Lbo/j;->f(Lgo/i;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, p1}, Lbo/j;->b(Lgo/h;Lgo/i;)Lgo/g;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {}, Lgo/g;->a()Lgo/g;

    move-result-object p1

    return-object p1
.end method
