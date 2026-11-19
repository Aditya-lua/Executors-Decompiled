.class public Lf4/q$a;
.super Lg/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/q;->F1(Lh/a;Lt/a;Lg/b;)Lg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg/d<",
        "TI;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Lh/a;

.field public final synthetic c:Lf4/q;


# direct methods
.method public constructor <init>(Lf4/q;Ljava/util/concurrent/atomic/AtomicReference;Lh/a;)V
    .locals 0

    iput-object p1, p0, Lf4/q$a;->c:Lf4/q;

    iput-object p2, p0, Lf4/q$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lf4/q$a;->b:Lh/a;

    invoke-direct {p0}, Lg/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lh/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh/a<",
            "TI;*>;"
        }
    .end annotation

    iget-object v0, p0, Lf4/q$a;->b:Lh/a;

    return-object v0
.end method

.method public c(Ljava/lang/Object;Lk2/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;",
            "Lk2/c;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lf4/q$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lg/d;->c(Ljava/lang/Object;Lk2/c;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Operation cannot be started before fragment is in created state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lf4/q$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg/d;->d()V

    :cond_0
    return-void
.end method
