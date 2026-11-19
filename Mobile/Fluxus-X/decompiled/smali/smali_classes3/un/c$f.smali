.class public final Lun/c$f;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lun/c;->k(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.camera.camera2.Camera2Controller"
    f = "Camera2Controller.kt"
    l = {
        0xaa
    }
    m = "stopVideo-IoAF18A"
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
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lun/c;

.field public v:I


# direct methods
.method public constructor <init>(Lun/c;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lun/c;",
            "Leu/b<",
            "-",
            "Lun/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lun/c$f;->u:Lun/c;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

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

    iput-object p1, p0, Lun/c$f;->t:Ljava/lang/Object;

    iget p1, p0, Lun/c$f;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lun/c$f;->v:I

    iget-object p1, p0, Lun/c$f;->u:Lun/c;

    invoke-virtual {p1, p0}, Lun/c;->k(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1
.end method
