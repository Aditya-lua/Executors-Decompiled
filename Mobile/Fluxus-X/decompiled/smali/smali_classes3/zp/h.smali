.class public final Lzp/h;
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
        "Lzp/c;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lzp/e;


# direct methods
.method public constructor <init>(Lzp/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/h;->a:Lzp/e;

    return-void
.end method

.method public static a(Lzp/e;)Lzp/h;
    .locals 1

    new-instance v0, Lzp/h;

    invoke-direct {v0, p0}, Lzp/h;-><init>(Lzp/e;)V

    return-object v0
.end method

.method public static c(Lzp/e;)Lg/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzp/e;",
            ")",
            "Lg/d<",
            "Lzp/c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lzp/e;->a()Lg/d;

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
            "Lzp/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzp/h;->a:Lzp/e;

    invoke-static {v0}, Lzp/h;->c(Lzp/e;)Lg/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzp/h;->b()Lg/d;

    move-result-object v0

    return-object v0
.end method
