.class public final Laq/z;
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
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Laq/w;


# direct methods
.method public constructor <init>(Laq/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq/z;->a:Laq/w;

    return-void
.end method

.method public static a(Laq/w;)Laq/z;
    .locals 1

    new-instance v0, Laq/z;

    invoke-direct {v0, p0}, Laq/z;-><init>(Laq/w;)V

    return-object v0
.end method

.method public static c(Laq/w;)Lg/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/w;",
            ")",
            "Lg/d<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Laq/w;->a()Lg/d;

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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Laq/z;->a:Laq/w;

    invoke-static {v0}, Laq/z;->c(Laq/w;)Lg/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Laq/z;->b()Lg/d;

    move-result-object v0

    return-object v0
.end method
