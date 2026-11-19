.class public final Ldr/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ldr/c;",
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
            "Lav/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ldr/e;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldr/d;->a:Lwt/i;

    iput-object p2, p0, Ldr/d;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Ldr/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ldr/e;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)",
            "Ldr/d;"
        }
    .end annotation

    new-instance v0, Ldr/d;

    invoke-direct {v0, p0, p1}, Ldr/d;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Ldr/e;Lav/p0;)Ldr/c;
    .locals 1

    new-instance v0, Ldr/c;

    invoke-direct {v0, p0, p1}, Ldr/c;-><init>(Ldr/e;Lav/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Ldr/c;
    .locals 2

    iget-object v0, p0, Ldr/d;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr/e;

    iget-object v1, p0, Ldr/d;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lav/p0;

    invoke-static {v0, v1}, Ldr/d;->c(Ldr/e;Lav/p0;)Ldr/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldr/d;->b()Ldr/c;

    move-result-object v0

    return-object v0
.end method
