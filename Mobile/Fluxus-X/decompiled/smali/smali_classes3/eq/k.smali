.class public final Leq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lg/d<",
        "Leq/f;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Leq/h;


# direct methods
.method public constructor <init>(Leq/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leq/k;->a:Leq/h;

    return-void
.end method

.method public static a(Leq/h;)Leq/k;
    .locals 1

    new-instance v0, Leq/k;

    invoke-direct {v0, p0}, Leq/k;-><init>(Leq/h;)V

    return-object v0
.end method

.method public static c(Leq/h;)Lg/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leq/h;",
            ")",
            "Lg/d<",
            "Leq/f;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Leq/h;->a()Lg/d;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/d;

    return-object p0
.end method


# virtual methods
.method public b()Lg/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/d<",
            "Leq/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Leq/k;->a:Leq/h;

    invoke-static {v0}, Leq/k;->c(Leq/h;)Lg/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leq/k;->b()Lg/d;

    move-result-object v0

    return-object v0
.end method
