.class public Lcj/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public final synthetic c:Lcj/a;


# direct methods
.method public constructor <init>(Lcj/a;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcj/a$b;->c:Lcj/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcj/a$b;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcj/a$b;->b:J

    return-void
.end method


# virtual methods
.method public start()V
    .locals 5

    iget-object v0, p0, Lcj/a$b;->c:Lcj/a;

    invoke-static {v0}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lok/t;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L1()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcj/a$b;->c:Lcj/a;

    invoke-static {v0}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v0

    iget-wide v2, p0, Lcj/a$b;->b:J

    invoke-virtual {v0, v2, v3, v1}, Lnj/a0;->K(JZ)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcj/a$b;->c:Lcj/a;

    invoke-static {v0}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->t3()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->q()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lcj/a$b;->b:J

    iget-object v4, p0, Lcj/a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v4, v1}, Lnj/m;->m1(JLjava/lang/String;Z)V

    goto :goto_0

    :cond_1
    iget-wide v2, p0, Lcj/a$b;->b:J

    iget-object v4, p0, Lcj/a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v4, v1}, Lnj/m;->A0(JLjava/lang/String;Z)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lok/t;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L5()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcj/a$b;->c:Lcj/a;

    invoke-static {v0}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcj/a$b;->c:Lcj/a;

    invoke-static {v0}, Lcj/a;->f(Lcj/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    const/4 v0, 0x0

    throw v0

    :cond_4
    :goto_0
    iget-object v0, p0, Lcj/a$b;->c:Lcj/a;

    const-string v1, "GrantPendingPurchases"

    invoke-virtual {v0, v1}, Lnh/d;->d(Ljava/lang/String;)V

    return-void
.end method
