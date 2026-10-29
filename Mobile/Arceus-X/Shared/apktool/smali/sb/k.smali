.class public Lsb/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lsb/n0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsb/n0;

    invoke-direct {v0}, Lsb/n0;-><init>()V

    iput-object v0, p0, Lsb/k;->a:Lsb/n0;

    return-void
.end method

.method public constructor <init>(Lsb/a;)V
    .locals 1
    .param p1    # Lsb/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsb/n0;

    invoke-direct {v0}, Lsb/n0;-><init>()V

    iput-object v0, p0, Lsb/k;->a:Lsb/n0;

    new-instance v0, Lsb/j0;

    invoke-direct {v0, p0}, Lsb/j0;-><init>(Lsb/k;)V

    invoke-virtual {p1, v0}, Lsb/a;->b(Lsb/h;)Lsb/a;

    return-void
.end method

.method public static bridge synthetic f(Lsb/k;)Lsb/n0;
    .locals 0

    iget-object p0, p0, Lsb/k;->a:Lsb/n0;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lsb/k;->a:Lsb/n0;

    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lsb/k;->a:Lsb/n0;

    invoke-virtual {v0, p1}, Lsb/n0;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lsb/k;->a:Lsb/n0;

    invoke-virtual {v0, p1}, Lsb/n0;->q(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lsb/k;->a:Lsb/n0;

    invoke-virtual {v0, p1}, Lsb/n0;->s(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lsb/k;->a:Lsb/n0;

    invoke-virtual {v0, p1}, Lsb/n0;->t(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
