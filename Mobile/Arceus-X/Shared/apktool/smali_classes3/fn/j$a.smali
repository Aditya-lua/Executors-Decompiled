.class public final Lfn/j$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn/j;->b(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.camera.CameraHelper"
    f = "CameraHelper.kt"
    l = {
        0xd,
        0x10,
        0x14
    }
    m = "unbind"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lfn/j;

.field public y:I


# direct methods
.method public constructor <init>(Lfn/j;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/j;",
            "Lnt/b<",
            "-",
            "Lfn/j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfn/j$a;->x:Lfn/j;

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

    iput-object p1, p0, Lfn/j$a;->w:Ljava/lang/Object;

    iget p1, p0, Lfn/j$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfn/j$a;->y:I

    iget-object p1, p0, Lfn/j$a;->x:Lfn/j;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfn/j;->b(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
