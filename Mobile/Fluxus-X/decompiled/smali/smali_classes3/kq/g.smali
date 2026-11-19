.class public final Lkq/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmv/a0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lkq/f;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lkq/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkq/f;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkq/f;",
            "Lwt/i<",
            "Lkq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq/g;->a:Lkq/f;

    iput-object p2, p0, Lkq/g;->b:Lwt/i;

    return-void
.end method

.method public static a(Lkq/f;Lwt/i;)Lkq/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkq/f;",
            "Lwt/i<",
            "Lkq/c;",
            ">;)",
            "Lkq/g;"
        }
    .end annotation

    new-instance v0, Lkq/g;

    invoke-direct {v0, p0, p1}, Lkq/g;-><init>(Lkq/f;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lkq/f;Lkq/c;)Lmv/a0;
    .locals 0

    invoke-virtual {p0, p1}, Lkq/f;->b(Lkq/c;)Lmv/a0;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmv/a0;

    return-object p0
.end method


# virtual methods
.method public b()Lmv/a0;
    .locals 2

    iget-object v0, p0, Lkq/g;->a:Lkq/f;

    iget-object v1, p0, Lkq/g;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkq/c;

    invoke-static {v0, v1}, Lkq/g;->c(Lkq/f;Lkq/c;)Lmv/a0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkq/g;->b()Lmv/a0;

    move-result-object v0

    return-object v0
.end method
