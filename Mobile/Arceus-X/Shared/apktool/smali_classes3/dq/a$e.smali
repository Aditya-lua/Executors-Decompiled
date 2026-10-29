.class public final Ldq/a$e;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq/a;->l(ILnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager"
    f = "SelfiePoseManager.kt"
    l = {
        0xcd,
        0xd8
    }
    m = "loadNextPoseAsyncInternal"
.end annotation


# instance fields
.field public t:I

.field public u:I

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ldq/a;

.field public z:I


# direct methods
.method public constructor <init>(Ldq/a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq/a;",
            "Lnt/b<",
            "-",
            "Ldq/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldq/a$e;->y:Ldq/a;

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

    iput-object p1, p0, Ldq/a$e;->x:Ljava/lang/Object;

    iget p1, p0, Ldq/a$e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldq/a$e;->z:I

    iget-object p1, p0, Ldq/a$e;->y:Ldq/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ldq/a;->g(Ldq/a;ILnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
