.class public final Lhn/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/b0$a;


# instance fields
.field public final a:Lhn/c0;


# direct methods
.method public constructor <init>(Lhn/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/d0;->a:Lhn/c0;

    return-void
.end method

.method public static b(Lhn/c0;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/c0;",
            ")",
            "Lft/i<",
            "Lhn/b0$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhn/d0;

    invoke-direct {v0, p0}, Lhn/d0;-><init>(Lhn/c0;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/b0;
    .locals 7
    .param p5    # Lur/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lhn/d0;->a:Lhn/c0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lhn/c0;->b(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/b0;

    move-result-object p1

    return-object p1
.end method
