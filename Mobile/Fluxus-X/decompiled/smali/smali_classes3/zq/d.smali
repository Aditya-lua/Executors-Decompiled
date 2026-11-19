.class public final Lzq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lav/p0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lzq/c;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lzq/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzq/c;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzq/c;",
            "Lwt/i<",
            "Lzq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq/d;->a:Lzq/c;

    iput-object p2, p0, Lzq/d;->b:Lwt/i;

    return-void
.end method

.method public static a(Lzq/c;Lzq/a;)Lav/p0;
    .locals 0

    invoke-virtual {p0, p1}, Lzq/c;->a(Lzq/a;)Lav/p0;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lav/p0;

    return-object p0
.end method

.method public static b(Lzq/c;Lwt/i;)Lzq/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzq/c;",
            "Lwt/i<",
            "Lzq/a;",
            ">;)",
            "Lzq/d;"
        }
    .end annotation

    new-instance v0, Lzq/d;

    invoke-direct {v0, p0, p1}, Lzq/d;-><init>(Lzq/c;Lwt/i;)V

    return-object v0
.end method


# virtual methods
.method public c()Lav/p0;
    .locals 2

    iget-object v0, p0, Lzq/d;->a:Lzq/c;

    iget-object v1, p0, Lzq/d;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzq/a;

    invoke-static {v0, v1}, Lzq/d;->a(Lzq/c;Lzq/a;)Lav/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzq/d;->c()Lav/p0;

    move-result-object v0

    return-object v0
.end method
