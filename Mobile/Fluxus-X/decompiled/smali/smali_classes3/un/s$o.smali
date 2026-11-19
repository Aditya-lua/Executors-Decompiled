.class public final Lun/s$o;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lun/s;->s0(Lun/s;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.camera.camera2.Camera2Manager"
    f = "Camera2Manager.kt"
    l = {
        0xda
    }
    m = "start$initializeCameraAndSetState"
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


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public v:I


# direct methods
.method public constructor <init>(Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lun/s$o;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lgu/d;-><init>(Leu/b;)V

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

    iput-object p1, p0, Lun/s$o;->u:Ljava/lang/Object;

    iget p1, p0, Lun/s$o;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lun/s$o;->v:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lun/s;->U(Lun/s;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
