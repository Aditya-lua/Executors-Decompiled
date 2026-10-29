.class public Lm1/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm1/i0;->b0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Lm1/h1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lm1/i0;


# direct methods
.method public constructor <init>(Lm1/i0;)V
    .locals 0

    iput-object p1, p0, Lm1/i0$a;->a:Lm1/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lm1/h1;)V
    .locals 2

    iget-object v0, p0, Lm1/i0$a;->a:Lm1/i0;

    invoke-virtual {v0}, Lm1/i0;->I()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lm1/h1;->c(J)V

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lm1/h1;->a(Z)V

    invoke-interface {p1}, Lm1/h1;->b()Z

    invoke-interface {p1}, Lm1/h1;->d()Lne/x;

    move-result-object p1

    new-instance v0, Lm1/i0$a$a;

    invoke-direct {v0, p0}, Lm1/i0$a$a;-><init>(Lm1/i0$a;)V

    iget-object v1, p0, Lm1/i0$a;->a:Lm1/i0;

    iget-object v1, v1, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lm1/i0$a;->a:Lm1/i0;

    const/4 v1, 0x0

    const-string v2, "Unable to acquire InputBuffer."

    invoke-virtual {v0, v1, v2, p1}, Lm1/i0;->K(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lm1/h1;

    invoke-virtual {p0, p1}, Lm1/i0$a;->a(Lm1/h1;)V

    return-void
.end method
