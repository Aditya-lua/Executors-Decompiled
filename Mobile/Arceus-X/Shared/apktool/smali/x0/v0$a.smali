.class public Lx0/v0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/v0;->d(Lx0/n0;Ljava/util/Map$Entry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Lg0/j2;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lx0/n0;

.field public final synthetic b:Lx0/v0;


# direct methods
.method public constructor <init>(Lx0/v0;Lx0/n0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lx0/v0$a;->b:Lx0/v0;

    iput-object p2, p0, Lx0/v0$a;->a:Lx0/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg0/j2;)V
    .locals 1

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx0/v0$a;->b:Lx0/v0;

    iget-object v0, v0, Lx0/v0;->a:Lx0/r0;

    invoke-interface {v0, p1}, Lg0/k2;->d(Lg0/j2;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lx0/v0$a;->a:Lx0/n0;

    invoke-virtual {v0}, Lx0/n0;->t()I

    move-result v0

    const/4 v1, 0x2

    const-string v2, "SurfaceProcessorNode"

    if-ne v0, v1, :cond_0

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    const-string p1, "Downstream VideoCapture failed to provide Surface."

    invoke-static {v2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Downstream node failed to provide Surface. Target: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/v0$a;->a:Lx0/n0;

    invoke-virtual {v1}, Lx0/n0;->t()I

    move-result v1

    invoke-static {v1}, Lx0/z0;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg0/j2;

    invoke-virtual {p0, p1}, Lx0/v0$a;->a(Lg0/j2;)V

    return-void
.end method
