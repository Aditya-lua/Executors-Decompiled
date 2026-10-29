.class public final Lfn/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lln/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lqq/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lln/a;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/t;->a:Lft/i;

    iput-object p2, p0, Lfn/t;->b:Lft/i;

    iput-object p3, p0, Lfn/t;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lfn/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lln/a;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;)",
            "Lfn/t;"
        }
    .end annotation

    new-instance v0, Lfn/t;

    invoke-direct {v0, p0, p1, p2}, Lfn/t;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lln/a;Lqq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)Lcom/withpersona/sdk2/camera/e;
    .locals 8

    new-instance v0, Lcom/withpersona/sdk2/camera/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/withpersona/sdk2/camera/e;-><init>(Landroid/content/Context;Lln/a;Lqq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)Lcom/withpersona/sdk2/camera/e;
    .locals 8

    iget-object v0, p0, Lfn/t;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lfn/t;->b:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lln/a;

    iget-object v0, p0, Lfn/t;->c:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lqq/c;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    invoke-static/range {v1 .. v7}, Lfn/t;->c(Landroid/content/Context;Lln/a;Lqq/c;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)Lcom/withpersona/sdk2/camera/e;

    move-result-object p1

    return-object p1
.end method
