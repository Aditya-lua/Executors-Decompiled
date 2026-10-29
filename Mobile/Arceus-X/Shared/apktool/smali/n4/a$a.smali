.class public final Ln4/a$a;
.super Ln4/c;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln4/c<",
        "TD;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public f:Z

.field public final synthetic g:Ln4/a;


# direct methods
.method public constructor <init>(Ln4/a;)V
    .locals 0

    iput-object p1, p0, Ln4/a$a;->g:Ln4/a;

    invoke-direct {p0}, Ln4/c;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Ln4/a$a;->g:Ln4/a;

    invoke-virtual {v0}, Ln4/a;->E()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lu2/m; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ln4/c;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    throw v0
.end method

.method public g(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    iget-object v0, p0, Ln4/a$a;->g:Ln4/a;

    invoke-virtual {v0, p0, p1}, Ln4/a;->y(Ln4/a$a;Ljava/lang/Object;)V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    iget-object v0, p0, Ln4/a$a;->g:Ln4/a;

    invoke-virtual {v0, p0, p1}, Ln4/a;->z(Ln4/a$a;Ljava/lang/Object;)V

    return-void
.end method

.method public run()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln4/a$a;->f:Z

    iget-object v0, p0, Ln4/a$a;->g:Ln4/a;

    invoke-virtual {v0}, Ln4/a;->A()V

    return-void
.end method
