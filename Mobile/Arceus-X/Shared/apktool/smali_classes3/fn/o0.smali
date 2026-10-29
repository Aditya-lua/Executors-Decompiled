.class public final Lfn/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lfn/n0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lfn/r0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lnu/b0<",
            "Lkn/c;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lfn/r0;",
            ">;",
            "Lft/i<",
            "Lnu/b0<",
            "Lkn/c;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/o0;->a:Lft/i;

    iput-object p2, p0, Lfn/o0;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lfn/o0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lfn/r0;",
            ">;",
            "Lft/i<",
            "Lnu/b0<",
            "Lkn/c;",
            ">;>;)",
            "Lfn/o0;"
        }
    .end annotation

    new-instance v0, Lfn/o0;

    invoke-direct {v0, p0, p1}, Lfn/o0;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lfn/r0;Lnu/b0;)Lfn/n0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/r0;",
            "Lnu/b0<",
            "Lkn/c;",
            ">;)",
            "Lfn/n0;"
        }
    .end annotation

    new-instance v0, Lfn/n0;

    invoke-direct {v0, p0, p1}, Lfn/n0;-><init>(Lfn/r0;Lnu/b0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfn/n0;
    .locals 2

    iget-object v0, p0, Lfn/o0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfn/r0;

    iget-object v1, p0, Lfn/o0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnu/b0;

    invoke-static {v0, v1}, Lfn/o0;->c(Lfn/r0;Lnu/b0;)Lfn/n0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfn/o0;->b()Lfn/n0;

    move-result-object v0

    return-object v0
.end method
