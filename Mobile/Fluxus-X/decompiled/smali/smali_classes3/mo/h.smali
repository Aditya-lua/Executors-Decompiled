.class public final Lmo/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmo/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lmo/e;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmo/e;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmo/e;",
            "Lwt/i<",
            "Lmo/r;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/h;->a:Lmo/e;

    iput-object p2, p0, Lmo/h;->b:Lwt/i;

    return-void
.end method

.method public static a(Lmo/e;Lwt/i;)Lmo/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmo/e;",
            "Lwt/i<",
            "Lmo/r;",
            ">;)",
            "Lmo/h;"
        }
    .end annotation

    new-instance v0, Lmo/h;

    invoke-direct {v0, p0, p1}, Lmo/h;-><init>(Lmo/e;Lwt/i;)V

    return-object v0
.end method

.method public static b(Lmo/e;Lmo/r;)Lmo/b;
    .locals 0

    invoke-virtual {p0, p1}, Lmo/e;->c(Lmo/r;)Lmo/b;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmo/b;

    return-object p0
.end method


# virtual methods
.method public c()Lmo/b;
    .locals 2

    iget-object v0, p0, Lmo/h;->a:Lmo/e;

    iget-object v1, p0, Lmo/h;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmo/r;

    invoke-static {v0, v1}, Lmo/h;->b(Lmo/e;Lmo/r;)Lmo/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmo/h;->c()Lmo/b;

    move-result-object v0

    return-object v0
.end method
