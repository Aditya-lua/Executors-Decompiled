.class public final Lhn/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/c$a;


# instance fields
.field public final a:Lhn/e;


# direct methods
.method public constructor <init>(Lhn/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/f;->a:Lhn/e;

    return-void
.end method

.method public static b(Lhn/e;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/e;",
            ")",
            "Lft/i<",
            "Lhn/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhn/f;

    invoke-direct {v0, p0}, Lhn/f;-><init>(Lhn/e;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/c;
    .locals 7
    .param p5    # Lur/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lhn/f;->a:Lhn/e;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lhn/e;->b(Lhn/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;Z)Lhn/c;

    move-result-object p1

    return-object p1
.end method
