.class public final Lrq/b$g;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq/b;->m(ILeu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager"
    f = "SelfiePoseManager.kt"
    l = {
        0x7b,
        0x7b
    }
    m = "loadNextPoseInternal-gIAlu-s"
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
.field public t:I

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lrq/b;

.field public y:I


# direct methods
.method public constructor <init>(Lrq/b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq/b;",
            "Leu/b<",
            "-",
            "Lrq/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq/b$g;->x:Lrq/b;

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

    iput-object p1, p0, Lrq/b$g;->w:Ljava/lang/Object;

    iget p1, p0, Lrq/b$g;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrq/b$g;->y:I

    iget-object p1, p0, Lrq/b$g;->x:Lrq/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lrq/b;->h(Lrq/b;ILeu/b;)Ljava/lang/Object;

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
