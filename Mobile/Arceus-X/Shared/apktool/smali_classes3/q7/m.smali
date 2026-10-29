.class public Lq7/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;

.field public static final b:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v4, "fFamily"

    const-string v5, "data"

    const-string v0, "ch"

    const-string v1, "size"

    const-string v2, "w"

    const-string v3, "style"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/m;->a:Lr7/c$a;

    const-string v0, "shapes"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/m;->b:Lr7/c$a;

    return-void
.end method

.method public static a(Lr7/c;Lf7/i;)Ll7/d;
    .locals 11

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lr7/c;->c()V

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-wide v5, v2

    move-object v7, v4

    move-object v8, v7

    move v2, v0

    move-wide v3, v5

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v9

    if-eqz v9, :cond_9

    sget-object v9, Lq7/m;->a:Lr7/c$a;

    invoke-virtual {p0, v9}, Lr7/c;->r(Lr7/c$a;)I

    move-result v9

    if-eqz v9, :cond_8

    const/4 v10, 0x1

    if-eq v9, v10, :cond_7

    const/4 v10, 0x2

    if-eq v9, v10, :cond_6

    const/4 v10, 0x3

    if-eq v9, v10, :cond_5

    const/4 v10, 0x4

    if-eq v9, v10, :cond_4

    const/4 v10, 0x5

    if-eq v9, v10, :cond_0

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr7/c;->c()V

    :goto_1
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v9

    if-eqz v9, :cond_3

    sget-object v9, Lq7/m;->b:Lr7/c$a;

    invoke-virtual {p0, v9}, Lr7/c;->r(Lr7/c$a;)I

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lr7/c;->b()V

    :goto_2
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-static {p0, p1}, Lq7/h;->a(Lr7/c;Lf7/i;)Ln7/c;

    move-result-object v9

    check-cast v9, Ln7/q;

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lr7/c;->d()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lr7/c;->e()V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lr7/c;->h()D

    move-result-wide v5

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lr7/c;->h()D

    move-result-wide v3

    goto :goto_0

    :cond_8
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    goto :goto_0

    :cond_9
    invoke-virtual {p0}, Lr7/c;->e()V

    new-instance v0, Ll7/d;

    invoke-direct/range {v0 .. v8}, Ll7/d;-><init>(Ljava/util/List;CDDLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
