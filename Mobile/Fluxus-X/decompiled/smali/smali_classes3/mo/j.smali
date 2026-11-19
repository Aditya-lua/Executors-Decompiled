.class public final Lmo/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmo/m;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lmo/e;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/b0;",
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
            "Lmo/b0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/j;->a:Lmo/e;

    iput-object p2, p0, Lmo/j;->b:Lwt/i;

    return-void
.end method

.method public static a(Lmo/e;Lwt/i;)Lmo/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmo/e;",
            "Lwt/i<",
            "Lmo/b0;",
            ">;)",
            "Lmo/j;"
        }
    .end annotation

    new-instance v0, Lmo/j;

    invoke-direct {v0, p0, p1}, Lmo/j;-><init>(Lmo/e;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lmo/e;Lmo/b0;)Lmo/m;
    .locals 0

    invoke-virtual {p0, p1}, Lmo/e;->e(Lmo/b0;)Lmo/m;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmo/m;

    return-object p0
.end method


# virtual methods
.method public b()Lmo/m;
    .locals 2

    iget-object v0, p0, Lmo/j;->a:Lmo/e;

    iget-object v1, p0, Lmo/j;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmo/b0;

    invoke-static {v0, v1}, Lmo/j;->c(Lmo/e;Lmo/b0;)Lmo/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmo/j;->b()Lmo/m;

    move-result-object v0

    return-object v0
.end method
