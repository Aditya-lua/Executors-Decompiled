.class public final Lhn/s$i;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/s;->l0(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.camera.camera2.Camera2Manager"
    f = "Camera2Manager.kt"
    l = {
        0x2f8,
        0x247
    }
    m = "openCamera"
.end annotation


# instance fields
.field public final synthetic A:Lhn/s;

.field public B:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhn/s;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/s;",
            "Lnt/b<",
            "-",
            "Lhn/s$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhn/s$i;->A:Lhn/s;

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

    iput-object p1, p0, Lhn/s$i;->z:Ljava/lang/Object;

    iget p1, p0, Lhn/s$i;->B:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhn/s$i;->B:I

    iget-object p1, p0, Lhn/s$i;->A:Lhn/s;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lhn/s;->L(Lhn/s;Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
