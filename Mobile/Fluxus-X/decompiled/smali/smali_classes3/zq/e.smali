.class public final Lzq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lav/l0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lzq/c;


# direct methods
.method public constructor <init>(Lzq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq/e;->a:Lzq/c;

    return-void
.end method

.method public static a(Lzq/c;)Lzq/e;
    .locals 1

    new-instance v0, Lzq/e;

    invoke-direct {v0, p0}, Lzq/e;-><init>(Lzq/c;)V

    return-object v0
.end method

.method public static c(Lzq/c;)Lav/l0;
    .locals 0

    invoke-virtual {p0}, Lzq/c;->b()Lav/l0;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lav/l0;

    return-object p0
.end method


# virtual methods
.method public b()Lav/l0;
    .locals 1

    iget-object v0, p0, Lzq/e;->a:Lzq/c;

    invoke-static {v0}, Lzq/e;->c(Lzq/c;)Lav/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzq/e;->b()Lav/l0;

    move-result-object v0

    return-object v0
.end method
