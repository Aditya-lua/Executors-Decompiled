.class public final Ly5/q1$d;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly5/q1;->x(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.work.impl.WorkerWrapper"
    f = "WorkerWrapper.kt"
    l = {
        0x128
    }
    m = "runWorker"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ly5/q1;

.field public w:I


# direct methods
.method public constructor <init>(Ly5/q1;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/q1;",
            "Lnt/b<",
            "-",
            "Ly5/q1$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly5/q1$d;->v:Ly5/q1;

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

    iput-object p1, p0, Ly5/q1$d;->u:Ljava/lang/Object;

    iget p1, p0, Ly5/q1$d;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly5/q1$d;->w:I

    iget-object p1, p0, Ly5/q1$d;->v:Ly5/q1;

    invoke-static {p1, p0}, Ly5/q1;->k(Ly5/q1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
