.class public final Lfn/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lnu/b0<",
        "Lkn/c;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lfn/k;


# direct methods
.method public constructor <init>(Lfn/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/n;->a:Lfn/k;

    return-void
.end method

.method public static a(Lfn/k;)Lfn/n;
    .locals 1

    new-instance v0, Lfn/n;

    invoke-direct {v0, p0}, Lfn/n;-><init>(Lfn/k;)V

    return-object v0
.end method

.method public static c(Lfn/k;)Lnu/b0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/k;",
            ")",
            "Lnu/b0<",
            "Lkn/c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lfn/k;->c()Lnu/b0;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnu/b0;

    return-object p0
.end method


# virtual methods
.method public b()Lnu/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/b0<",
            "Lkn/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfn/n;->a:Lfn/k;

    invoke-static {v0}, Lfn/n;->c(Lfn/k;)Lnu/b0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfn/n;->b()Lnu/b0;

    move-result-object v0

    return-object v0
.end method
