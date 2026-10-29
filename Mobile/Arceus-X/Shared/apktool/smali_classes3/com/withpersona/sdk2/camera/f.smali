.class public final Lcom/withpersona/sdk2/camera/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/camera/e$a;


# instance fields
.field public final a:Lfn/t;


# direct methods
.method public constructor <init>(Lfn/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/f;->a:Lfn/t;

    return-void
.end method

.method public static b(Lfn/t;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/t;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/camera/f;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/camera/f;-><init>(Lfn/t;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)Lcom/withpersona/sdk2/camera/e;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/f;->a:Lfn/t;

    invoke-virtual {v0, p1, p2, p3, p4}, Lfn/t;->b(Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/s;Z)Lcom/withpersona/sdk2/camera/e;

    move-result-object p1

    return-object p1
.end method
