.class public final Ltu/k$b;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltu/k;->q(Lnt/b;)Ljava/lang/Object;
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
    c = "kotlinx.coroutines.selects.SelectImplementation"
    f = "Select.kt"
    l = {
        0x1c5,
        0x1c8
    }
    m = "doSelectSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ltu/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltu/k<",
            "TR;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Ltu/k;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltu/k<",
            "TR;>;",
            "Lnt/b<",
            "-",
            "Ltu/k$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltu/k$b;->v:Ltu/k;

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

    iput-object p1, p0, Ltu/k$b;->u:Ljava/lang/Object;

    iget p1, p0, Ltu/k$b;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ltu/k$b;->w:I

    iget-object p1, p0, Ltu/k$b;->v:Ltu/k;

    invoke-static {p1, p0}, Ltu/k;->g(Ltu/k;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
