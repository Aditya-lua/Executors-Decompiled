.class public final Lt6/m$f;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt6/m;->n(Lt6/r;Lnt/b;)Ljava/lang/Object;
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
    c = "coil3.network.NetworkFetcher"
    f = "NetworkFetcher.kt"
    l = {
        0xf5
    }
    m = "toImageSource"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lt6/m;

.field public x:I


# direct methods
.method public constructor <init>(Lt6/m;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/m;",
            "Lnt/b<",
            "-",
            "Lt6/m$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt6/m$f;->w:Lt6/m;

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

    iput-object p1, p0, Lt6/m$f;->v:Ljava/lang/Object;

    iget p1, p0, Lt6/m$f;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt6/m$f;->x:I

    iget-object p1, p0, Lt6/m$f;->w:Lt6/m;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lt6/m;->c(Lt6/m;Lt6/r;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
