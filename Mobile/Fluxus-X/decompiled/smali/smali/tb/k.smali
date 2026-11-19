.class public Ltb/k;
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
.field public final a:Ltb/n0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ltb/n0;

    invoke-direct {v0}, Ltb/n0;-><init>()V

    iput-object v0, p0, Ltb/k;->a:Ltb/n0;

    return-void
.end method

.method public constructor <init>(Ltb/a;)V
    .locals 1
    .param p1    # Ltb/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ltb/n0;

    invoke-direct {v0}, Ltb/n0;-><init>()V

    iput-object v0, p0, Ltb/k;->a:Ltb/n0;

    new-instance v0, Ltb/j0;

    invoke-direct {v0, p0}, Ltb/j0;-><init>(Ltb/k;)V

    invoke-virtual {p1, v0}, Ltb/a;->b(Ltb/h;)Ltb/a;

    return-void
.end method

.method public static bridge synthetic f(Ltb/k;)Ltb/n0;
    .locals 0

    iget-object p0, p0, Ltb/k;->a:Ltb/n0;

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

    iget-object v0, p0, Ltb/k;->a:Ltb/n0;

    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ltb/k;->a:Ltb/n0;

    invoke-virtual {v0, p1}, Ltb/n0;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Ltb/k;->a:Ltb/n0;

    invoke-virtual {v0, p1}, Ltb/n0;->q(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ltb/k;->a:Ltb/n0;

    invoke-virtual {v0, p1}, Ltb/n0;->s(Ljava/lang/Exception;)Z

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

    iget-object v0, p0, Ltb/k;->a:Ltb/n0;

    invoke-virtual {v0, p1}, Ltb/n0;->t(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
