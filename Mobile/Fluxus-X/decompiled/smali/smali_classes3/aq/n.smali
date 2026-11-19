.class public final Laq/n;
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
        "[",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Laq/i;


# direct methods
.method public constructor <init>(Laq/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq/n;->a:Laq/i;

    return-void
.end method

.method public static a(Laq/i;)Laq/n;
    .locals 1

    new-instance v0, Laq/n;

    invoke-direct {v0, p0}, Laq/n;-><init>(Laq/i;)V

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
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Laq/i;->a()Lg/d;

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
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Laq/n;->a:Laq/i;

    invoke-static {v0}, Laq/n;->c(Laq/i;)Lg/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laq/n;->b()Lg/d;

    move-result-object v0

    return-object v0
.end method
