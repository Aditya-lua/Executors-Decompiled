.class public Loj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Ljj/x;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p3, p1, p2}, Ljj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljj/x;
    .locals 1

    new-instance v0, Ljj/x;

    invoke-direct {v0}, Ljj/x;-><init>()V

    return-object v0
.end method

.method public d(Landroid/content/Context;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {}, Ljj/t;->g()Ljj/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljj/t;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/b;->l(Landroid/content/Context;)V

    invoke-static {p1}, Lei/c;->e(Landroid/content/Context;)V

    invoke-virtual {p0}, Loj/a;->c()Ljj/x;

    move-result-object v0

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljj/r;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Loj/a;->a(Landroid/content/Context;Ljava/lang/String;Ljj/x;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p1}, Loj/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v0, Loj/l;

    invoke-direct {v0}, Loj/l;-><init>()V

    invoke-virtual {v0, p2}, Loj/l;->a(Ljava/util/Map;)Lpj/f;

    move-result-object p2

    invoke-interface {p2}, Lpj/f;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "foreground"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lpj/f;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Lpj/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2}, Lpj/f;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p2}, Lpj/f;->n()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2}, Lpj/f;->b()Ljava/util/List;

    move-result-object v8

    invoke-static/range {v2 .. v8}, Lsg/t0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->L5()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lpj/f;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lsg/t0;->u(Ljava/lang/String;Lpj/f;Ljava/util/Map;)V

    :cond_3
    new-instance v0, Loj/m;

    invoke-direct {v0}, Loj/m;-><init>()V

    invoke-virtual {v0, p2}, Loj/m;->a(Lpj/f;)Loj/b;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0, p1, p2}, Loj/b;->a(Landroid/content/Context;Lpj/f;)V

    :cond_4
    :goto_0
    return-void
.end method
