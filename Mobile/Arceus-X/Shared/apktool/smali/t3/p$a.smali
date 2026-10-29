.class public final Lt3/p$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/p;->d(Lzt/n;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lpt/d;"
    }
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
    c = "androidx.datastore.core.FileStorageConnection"
    f = "FileStorage.kt"
    l = {
        0x65
    }
    m = "readScope"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Z

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lt3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/p<",
            "TT;>;"
        }
    .end annotation
.end field

.field public y:I


# direct methods
.method public constructor <init>(Lt3/p;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/p<",
            "TT;>;",
            "Lnt/b<",
            "-",
            "Lt3/p$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt3/p$a;->x:Lt3/p;

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

    iput-object p1, p0, Lt3/p$a;->w:Ljava/lang/Object;

    iget p1, p0, Lt3/p$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt3/p$a;->y:I

    iget-object p1, p0, Lt3/p$a;->x:Lt3/p;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lt3/p;->d(Lzt/n;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
