.class public final Lun/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lun/b0$a;


# instance fields
.field public final a:Lun/c0;


# direct methods
.method public constructor <init>(Lun/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/d0;->a:Lun/c0;

    return-void
.end method

.method public static b(Lun/c0;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lun/c0;",
            ")",
            "Lwt/i<",
            "Lun/b0$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lun/d0;

    invoke-direct {v0, p0}, Lun/d0;-><init>(Lun/c0;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/b0;
    .locals 7
    .param p5    # Lks/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lun/d0;->a:Lun/c0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lun/c0;->b(Lun/k0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;Z)Lun/b0;

    move-result-object p1

    return-object p1
.end method
