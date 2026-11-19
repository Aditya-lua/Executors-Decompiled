.class public final Laq/g;
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
        "Laq/b;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Laq/d;


# direct methods
.method public constructor <init>(Laq/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq/g;->a:Laq/d;

    return-void
.end method

.method public static a(Laq/d;)Laq/g;
    .locals 1

    new-instance v0, Laq/g;

    invoke-direct {v0, p0}, Laq/g;-><init>(Laq/d;)V

    return-object v0
.end method

.method public static b(Laq/d;)Lg/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/d;",
            ")",
            "Lg/d<",
            "Laq/b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Laq/d;->a()Lg/d;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/d;

    return-object p0
.end method


# virtual methods
.method public c()Lg/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/d<",
            "Laq/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Laq/g;->a:Laq/d;

    invoke-static {v0}, Laq/g;->b(Laq/d;)Lg/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laq/g;->c()Lg/d;

    move-result-object v0

    return-object v0
.end method
