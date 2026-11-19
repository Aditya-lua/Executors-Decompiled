.class public final Lrp/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lso/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lrp/c;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lrp/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lrp/c;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrp/c;",
            "Lwt/i<",
            "Lrp/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/f;->a:Lrp/c;

    iput-object p2, p0, Lrp/f;->b:Lwt/i;

    return-void
.end method

.method public static a(Lrp/c;Lwt/i;)Lrp/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrp/c;",
            "Lwt/i<",
            "Lrp/i;",
            ">;)",
            "Lrp/f;"
        }
    .end annotation

    new-instance v0, Lrp/f;

    invoke-direct {v0, p0, p1}, Lrp/f;-><init>(Lrp/c;Lwt/i;)V

    return-object v0
.end method

.method public static b(Lrp/c;Lrp/i;)Lso/a;
    .locals 0

    invoke-virtual {p0, p1}, Lrp/c;->c(Lrp/i;)Lso/a;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lso/a;

    return-object p0
.end method


# virtual methods
.method public c()Lso/a;
    .locals 2

    iget-object v0, p0, Lrp/f;->a:Lrp/c;

    iget-object v1, p0, Lrp/f;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrp/i;

    invoke-static {v0, v1}, Lrp/f;->b(Lrp/c;Lrp/i;)Lso/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrp/f;->c()Lso/a;

    move-result-object v0

    return-object v0
.end method
