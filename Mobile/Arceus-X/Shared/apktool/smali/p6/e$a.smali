.class public final Lp6/e$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/e;->g(Lnt/b;)Ljava/lang/Object;
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
    c = "coil3.intercept.RealInterceptorChain"
    f = "RealInterceptorChain.kt"
    l = {
        0x1f
    }
    m = "proceed"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lp6/e;

.field public x:I


# direct methods
.method public constructor <init>(Lp6/e;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp6/e;",
            "Lnt/b<",
            "-",
            "Lp6/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp6/e$a;->w:Lp6/e;

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

    iput-object p1, p0, Lp6/e$a;->v:Ljava/lang/Object;

    iget p1, p0, Lp6/e$a;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp6/e$a;->x:I

    iget-object p1, p0, Lp6/e$a;->w:Lp6/e;

    invoke-virtual {p1, p0}, Lp6/e;->g(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
