.class public final Laq/t;
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
.field public final a:Laq/q;


# direct methods
.method public constructor <init>(Laq/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq/t;->a:Laq/q;

    return-void
.end method

.method public static a(Laq/q;)Laq/t;
    .locals 1

    new-instance v0, Laq/t;

    invoke-direct {v0, p0}, Laq/t;-><init>(Laq/q;)V

    return-object v0
.end method

.method public static c(Laq/q;)Lg/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/q;",
            ")",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Laq/q;->a()Lg/d;

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

    iget-object v0, p0, Laq/t;->a:Laq/q;

    invoke-static {v0}, Laq/t;->c(Laq/q;)Lg/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laq/t;->b()Lg/d;

    move-result-object v0

    return-object v0
.end method
