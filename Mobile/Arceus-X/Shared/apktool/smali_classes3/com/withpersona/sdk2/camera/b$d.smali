.class public final Lcom/withpersona/sdk2/camera/b$d;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/camera/b;->m(Lqq/c;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.camera.CameraPreview"
    f = "CameraPreview.kt"
    l = {
        0xbd
    }
    m = "takePicture-gIAlu-s"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lcom/withpersona/sdk2/camera/b;

.field public w:I


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/camera/b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/b;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/camera/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/b$d;->v:Lcom/withpersona/sdk2/camera/b;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/b$d;->u:Ljava/lang/Object;

    iget p1, p0, Lcom/withpersona/sdk2/camera/b$d;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/camera/b$d;->w:I

    iget-object p1, p0, Lcom/withpersona/sdk2/camera/b$d;->v:Lcom/withpersona/sdk2/camera/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/withpersona/sdk2/camera/b;->m(Lqq/c;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object p1

    return-object p1
.end method
