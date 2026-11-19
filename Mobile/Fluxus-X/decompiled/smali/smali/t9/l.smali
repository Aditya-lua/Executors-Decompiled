.class public final synthetic Lt9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lt9/v;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Ls9/a;

.field public final synthetic d:Lt9/a;

.field public final synthetic e:Lt9/d;


# direct methods
.method public synthetic constructor <init>(Lt9/v;Ljava/util/concurrent/atomic/AtomicReference;Ls9/a;Lt9/a;Lt9/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt9/l;->a:Lt9/v;

    iput-object p2, p0, Lt9/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lt9/l;->c:Ls9/a;

    iput-object p4, p0, Lt9/l;->d:Lt9/a;

    iput-object p5, p0, Lt9/l;->e:Lt9/d;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lt9/w;

    check-cast p2, Ltb/k;

    new-instance v0, Lt9/t;

    iget-object v1, p0, Lt9/l;->a:Lt9/v;

    iget-object v2, p0, Lt9/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lt9/l;->c:Ls9/a;

    invoke-direct {v0, v1, v2, p2, v3}, Lt9/t;-><init>(Lt9/v;Ljava/util/concurrent/atomic/AtomicReference;Ltb/k;Ls9/a;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lt9/i;

    iget-object p2, p0, Lt9/l;->d:Lt9/a;

    iget-object v1, p0, Lt9/l;->e:Lt9/d;

    invoke-virtual {p1, v0, p2, v1}, Lt9/i;->v2(Lt9/h;Lt9/a;Lt9/k;)V

    return-void
.end method
