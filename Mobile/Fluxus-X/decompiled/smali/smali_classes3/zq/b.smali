.class public final Lzq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lzq/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lav/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq/b;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lzq/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lav/l0;",
            ">;)",
            "Lzq/b;"
        }
    .end annotation

    new-instance v0, Lzq/b;

    invoke-direct {v0, p0}, Lzq/b;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lav/l0;)Lzq/a;
    .locals 1

    new-instance v0, Lzq/a;

    invoke-direct {v0, p0}, Lzq/a;-><init>(Lav/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzq/a;
    .locals 1

    iget-object v0, p0, Lzq/b;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lav/l0;

    invoke-static {v0}, Lzq/b;->c(Lav/l0;)Lzq/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzq/b;->b()Lzq/a;

    move-result-object v0

    return-object v0
.end method
