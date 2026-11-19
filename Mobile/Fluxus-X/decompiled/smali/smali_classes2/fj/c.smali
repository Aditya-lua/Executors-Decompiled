.class public Lfj/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfj/c$b;
    }
.end annotation


# instance fields
.field public a:Lbh/x0;


# direct methods
.method public constructor <init>(Lbh/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj/c;->a:Lbh/x0;

    return-void
.end method

.method public static bridge synthetic a(Lfj/c;Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfj/c;->b(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/app/Activity;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object v0

    sget-object v1, Ldj/b$d;->a:Ldj/b$d;

    invoke-virtual {v0, p1, v1}, Ldj/b;->i(Landroid/app/Activity;Ldj/b$d;)V

    :cond_0
    return-void
.end method

.method public c(Landroidx/lifecycle/r;)V
    .locals 4

    iget-object v0, p0, Lfj/c;->a:Lbh/x0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "logout"

    invoke-static {v0}, Lbh/t0;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lfj/c;->a:Lbh/x0;

    invoke-virtual {v0}, Lf4/q;->p()Lf4/v;

    move-result-object v0

    new-instance v1, Lbh/d0;

    invoke-direct {v1}, Lbh/d0;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lf4/o;->r2(II)V

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_1
    new-instance p1, Lfj/c$a;

    invoke-direct {p1, p0, v0}, Lfj/c$a;-><init>(Lfj/c;Lf4/v;)V

    invoke-virtual {v1, p1}, Lbh/d0;->B2(Lbh/d0$d;)V

    invoke-virtual {v0}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    const-string v0, "dialog"

    invoke-virtual {v1, p1, v0}, Lf4/o;->t2(Lf4/k0;Ljava/lang/String;)V

    return-void
.end method
