.class public final Laq/p;
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
        "Landroid/net/Uri;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Laq/i;


# direct methods
.method public constructor <init>(Laq/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq/p;->a:Laq/i;

    return-void
.end method

.method public static a(Laq/i;)Laq/p;
    .locals 1

    new-instance v0, Laq/p;

    invoke-direct {v0, p0}, Laq/p;-><init>(Laq/i;)V

    return-object v0
.end method

.method public static c(Laq/i;)Lg/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/i;",
            ")",
            "Lg/d<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Laq/i;->c()Lg/d;

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
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Laq/p;->a:Laq/i;

    invoke-static {v0}, Laq/p;->c(Laq/i;)Lg/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laq/p;->b()Lg/d;

    move-result-object v0

    return-object v0
.end method
