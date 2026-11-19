.class public final Lzr/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lzr/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmv/d0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/app/Application;",
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
            "Lmv/d0;",
            ">;",
            "Lwt/i<",
            "Landroid/app/Application;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzr/f;->a:Lwt/i;

    iput-object p2, p0, Lzr/f;->b:Lwt/i;

    iput-object p3, p0, Lzr/f;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lzr/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lmv/d0;",
            ">;",
            "Lwt/i<",
            "Landroid/app/Application;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)",
            "Lzr/f;"
        }
    .end annotation

    new-instance v0, Lzr/f;

    invoke-direct {v0, p0, p1, p2}, Lzr/f;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lmv/d0;Landroid/app/Application;Lav/p0;)Lzr/c;
    .locals 1

    new-instance v0, Lzr/c;

    invoke-direct {v0, p0, p1, p2}, Lzr/c;-><init>(Lmv/d0;Landroid/app/Application;Lav/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzr/c;
    .locals 3

    iget-object v0, p0, Lzr/f;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmv/d0;

    iget-object v1, p0, Lzr/f;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lzr/f;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lav/p0;

    invoke-static {v0, v1, v2}, Lzr/f;->c(Lmv/d0;Landroid/app/Application;Lav/p0;)Lzr/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzr/f;->b()Lzr/c;

    move-result-object v0

    return-object v0
.end method
