.class public final Lfn/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lfn/x;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lnu/b0<",
            "Ljt/n<",
            "Lfn/j0;",
            ">;>;>;"
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
            "Lnu/b0<",
            "Ljt/n<",
            "Lfn/j0;",
            ">;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/y;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lfn/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lnu/b0<",
            "Ljt/n<",
            "Lfn/j0;",
            ">;>;>;)",
            "Lfn/y;"
        }
    .end annotation

    new-instance v0, Lfn/y;

    invoke-direct {v0, p0}, Lfn/y;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Lnu/b0;)Lfn/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/b0<",
            "Ljt/n<",
            "Lfn/j0;",
            ">;>;)",
            "Lfn/x;"
        }
    .end annotation

    new-instance v0, Lfn/x;

    invoke-direct {v0, p0}, Lfn/x;-><init>(Lnu/b0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfn/x;
    .locals 1

    iget-object v0, p0, Lfn/y;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnu/b0;

    invoke-static {v0}, Lfn/y;->c(Lnu/b0;)Lfn/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfn/y;->b()Lfn/x;

    move-result-object v0

    return-object v0
.end method
