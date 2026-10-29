.class public Lui/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leh/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lui/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public final synthetic c:Lui/a;


# direct methods
.method public constructor <init>(Lui/a;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lui/a$b;->c:Lui/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lui/a$b;->a:Ljava/lang/String;

    iput-wide p3, p0, Lui/a$b;->b:J

    return-void
.end method


# virtual methods
.method public start()V
    .locals 5

    iget-object v0, p0, Lui/a$b;->c:Lui/a;

    invoke-static {v0}, Lui/a;->f(Lui/a;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H1()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lui/a$b;->c:Lui/a;

    invoke-static {v0}, Lui/a;->f(Lui/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v0

    iget-wide v2, p0, Lui/a$b;->b:J

    invoke-virtual {v0, v2, v3, v1}, Lfj/a0;->K(JZ)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lui/a$b;->c:Lui/a;

    invoke-static {v0}, Lui/a;->f(Lui/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->m3()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->r()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lui/a$b;->b:J

    iget-object v4, p0, Lui/a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v4, v1}, Lfj/m;->m1(JLjava/lang/String;Z)V

    goto :goto_0

    :cond_1
    iget-wide v2, p0, Lui/a$b;->b:J

    iget-object v4, p0, Lui/a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v4, v1}, Lfj/m;->A0(JLjava/lang/String;Z)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->I5()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lui/a$b;->c:Lui/a;

    invoke-static {v0}, Lui/a;->f(Lui/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lui/a$b;->c:Lui/a;

    invoke-static {v0}, Lui/a;->f(Lui/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    const/4 v0, 0x0

    throw v0

    :cond_4
    :goto_0
    iget-object v0, p0, Lui/a$b;->c:Lui/a;

    const-string v1, "GrantPendingPurchases"

    invoke-virtual {v0, v1}, Leh/d;->d(Ljava/lang/String;)V

    return-void
.end method
