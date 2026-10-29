.class public final Lt3/k$b$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/k$b;->b(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.datastore.core.DataStoreImpl$InitDataStore"
    f = "DataStoreImpl.kt"
    l = {
        0x1ae,
        0x1b2
    }
    m = "doRun"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lt3/k$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/k<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Lt3/k$b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/k<",
            "TT;>.b;",
            "Lnt/b<",
            "-",
            "Lt3/k$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt3/k$b$a;->v:Lt3/k$b;

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

    iput-object p1, p0, Lt3/k$b$a;->u:Ljava/lang/Object;

    iget p1, p0, Lt3/k$b$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt3/k$b$a;->w:I

    iget-object p1, p0, Lt3/k$b$a;->v:Lt3/k$b;

    invoke-virtual {p1, p0}, Lt3/k$b;->b(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
