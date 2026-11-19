.class public final Lir/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lir/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ldr/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lto/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ldr/e;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lir/c;->a:Lwt/i;

    iput-object p2, p0, Lir/c;->b:Lwt/i;

    iput-object p3, p0, Lir/c;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lir/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ldr/e;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)",
            "Lir/c;"
        }
    .end annotation

    new-instance v0, Lir/c;

    invoke-direct {v0, p0, p1, p2}, Lir/c;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Ldr/e;Lto/e;Lav/p0;)Lir/b;
    .locals 1

    new-instance v0, Lir/b;

    invoke-direct {v0, p0, p1, p2}, Lir/b;-><init>(Ldr/e;Lto/e;Lav/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lir/b;
    .locals 3

    iget-object v0, p0, Lir/c;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr/e;

    iget-object v1, p0, Lir/c;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lto/e;

    iget-object v2, p0, Lir/c;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lav/p0;

    invoke-static {v0, v1, v2}, Lir/c;->c(Ldr/e;Lto/e;Lav/p0;)Lir/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lir/c;->b()Lir/b;

    move-result-object v0

    return-object v0
.end method
