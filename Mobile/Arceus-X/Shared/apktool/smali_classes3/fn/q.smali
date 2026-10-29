.class public final Lfn/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/camera/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lqq/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lqq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/q;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lfn/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lqq/c;",
            ">;)",
            "Lfn/q;"
        }
    .end annotation

    new-instance v0, Lfn/q;

    invoke-direct {v0, p0}, Lfn/q;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Lqq/c;)Lcom/withpersona/sdk2/camera/b;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/camera/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/camera/b;-><init>(Lqq/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/camera/b;
    .locals 1

    iget-object v0, p0, Lfn/q;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqq/c;

    invoke-static {v0}, Lfn/q;->c(Lqq/c;)Lcom/withpersona/sdk2/camera/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfn/q;->b()Lcom/withpersona/sdk2/camera/b;

    move-result-object v0

    return-object v0
.end method
