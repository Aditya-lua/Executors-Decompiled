.class public final Lcom/withpersona/sdk2/inquiry/ui/network/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lgs/c;",
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
            "Lgs/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/network/c;->a:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;)Lcom/withpersona/sdk2/inquiry/ui/network/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lgs/c;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/ui/network/c;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/ui/network/c;-><init>(Lwt/i;)V

    return-object v0
.end method

.method public static c(Lgs/c;)Lcom/withpersona/sdk2/inquiry/ui/network/b$a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/ui/network/b$a;-><init>(Lgs/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/ui/network/b$a;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/c;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgs/c;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/ui/network/c;->c(Lgs/c;)Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/c;->b()Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    move-result-object v0

    return-object v0
.end method
