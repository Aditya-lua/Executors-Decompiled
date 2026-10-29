.class public final Lfn/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lfn/r0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgo/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lgo/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/s0;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lfn/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lgo/e;",
            ">;)",
            "Lfn/s0;"
        }
    .end annotation

    new-instance v0, Lfn/s0;

    invoke-direct {v0, p0}, Lfn/s0;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Lgo/e;)Lfn/r0;
    .locals 1

    new-instance v0, Lfn/r0;

    invoke-direct {v0, p0}, Lfn/r0;-><init>(Lgo/e;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfn/r0;
    .locals 1

    iget-object v0, p0, Lfn/s0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgo/e;

    invoke-static {v0}, Lfn/s0;->c(Lgo/e;)Lfn/r0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfn/s0;->b()Lfn/r0;

    move-result-object v0

    return-object v0
.end method
