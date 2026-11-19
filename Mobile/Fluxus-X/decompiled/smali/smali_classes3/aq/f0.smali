.class public final Laq/f0;
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
        "Lg/i;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Laq/c0;


# direct methods
.method public constructor <init>(Laq/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq/f0;->a:Laq/c0;

    return-void
.end method

.method public static a(Laq/c0;)Laq/f0;
    .locals 1

    new-instance v0, Laq/f0;

    invoke-direct {v0, p0}, Laq/f0;-><init>(Laq/c0;)V

    return-object v0
.end method

.method public static c(Laq/c0;)Lg/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/c0;",
            ")",
            "Lg/d<",
            "Lg/i;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Laq/c0;->a()Lg/d;

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
            "Lg/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Laq/f0;->a:Laq/c0;

    invoke-static {v0}, Laq/f0;->c(Laq/c0;)Lg/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laq/f0;->b()Lg/d;

    move-result-object v0

    return-object v0
.end method
