.class public final Lib/k;
.super Lib/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/os/IBinder;

.field public final synthetic c:Lib/m;


# direct methods
.method public constructor <init>(Lib/m;Landroid/os/IBinder;)V
    .locals 0

    iput-object p2, p0, Lib/k;->b:Landroid/os/IBinder;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lib/k;->c:Lib/m;

    invoke-direct {p0}, Lib/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lib/k;->b:Landroid/os/IBinder;

    invoke-static {v0}, Lqd/a$a;->s2(Landroid/os/IBinder;)Lqd/a;

    move-result-object v0

    iget-object v1, p0, Lib/k;->c:Lib/m;

    iget-object v1, v1, Lib/m;->a:Lib/o;

    invoke-static {v1, v0}, Lib/o;->n(Lib/o;Landroid/os/IInterface;)V

    invoke-static {v1}, Lib/o;->r(Lib/o;)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lib/o;->m(Lib/o;Z)V

    invoke-static {v1}, Lib/o;->h(Lib/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lib/o;->h(Lib/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
