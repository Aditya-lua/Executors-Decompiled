.class public final Ljb/k;
.super Ljb/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/os/IBinder;

.field public final synthetic c:Ljb/m;


# direct methods
.method public constructor <init>(Ljb/m;Landroid/os/IBinder;)V
    .locals 0

    iput-object p2, p0, Ljb/k;->b:Landroid/os/IBinder;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ljb/k;->c:Ljb/m;

    invoke-direct {p0}, Ljb/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Ljb/k;->b:Landroid/os/IBinder;

    invoke-static {v0}, Lsd/a$a;->s2(Landroid/os/IBinder;)Lsd/a;

    move-result-object v0

    iget-object v1, p0, Ljb/k;->c:Ljb/m;

    iget-object v1, v1, Ljb/m;->a:Ljb/o;

    invoke-static {v1, v0}, Ljb/o;->n(Ljb/o;Landroid/os/IInterface;)V

    invoke-static {v1}, Ljb/o;->r(Ljb/o;)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Ljb/o;->m(Ljb/o;Z)V

    invoke-static {v1}, Ljb/o;->h(Ljb/o;)Ljava/util/List;

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
    invoke-static {v1}, Ljb/o;->h(Ljb/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
