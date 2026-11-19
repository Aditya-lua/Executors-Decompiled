.class public final Lup/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsw/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/f;",
            "Lwt/i<",
            "Lsw/y;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/i;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iput-object p2, p0, Lup/i;->b:Lwt/i;

    return-void
.end method

.method public static a(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lwt/i;)Lup/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/f;",
            "Lwt/i<",
            "Lsw/y;",
            ">;)",
            "Lup/i;"
        }
    .end annotation

    new-instance v0, Lup/i;

    invoke-direct {v0, p0, p1}, Lup/i;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lsw/y;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/f;->d(Lsw/y;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    move-result-object p0

    invoke-static {p0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/governmentid/network/b;
    .locals 2

    iget-object v0, p0, Lup/i;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iget-object v1, p0, Lup/i;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsw/y;

    invoke-static {v0, v1}, Lup/i;->c(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lsw/y;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lup/i;->b()Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    move-result-object v0

    return-object v0
.end method
