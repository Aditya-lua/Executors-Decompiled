.class public abstract Landroidx/lifecycle/a0$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "d"
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/e0<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:I

.field public final synthetic d:Landroidx/lifecycle/a0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/e0<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/lifecycle/a0$d;->d:Landroidx/lifecycle/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/lifecycle/a0$d;->c:I

    iput-object p2, p0, Landroidx/lifecycle/a0$d;->a:Landroidx/lifecycle/e0;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/lifecycle/a0$d;->b:Z

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iput-boolean p1, p0, Landroidx/lifecycle/a0$d;->b:Z

    iget-object v0, p0, Landroidx/lifecycle/a0$d;->d:Landroidx/lifecycle/a0;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    invoke-virtual {v0, p1}, Landroidx/lifecycle/a0;->c(I)V

    iget-boolean p1, p0, Landroidx/lifecycle/a0$d;->b:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/lifecycle/a0$d;->d:Landroidx/lifecycle/a0;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/a0;->e(Landroidx/lifecycle/a0$d;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Landroidx/lifecycle/s;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract d()Z
.end method
