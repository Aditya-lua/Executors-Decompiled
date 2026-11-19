.class public final Lu3/k$n;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu3/k;->y(ZLeu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.datastore.core.DataStoreImpl"
    f = "DataStoreImpl.kt"
    l = {
        0x16d,
        0x16e,
        0x170,
        0x171,
        0x17c,
        0x180
    }
    m = "readDataOrHandleCorruption"
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


# instance fields
.field public final synthetic A:Lu3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public B:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Z

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu3/k;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/k<",
            "TT;>;",
            "Leu/b<",
            "-",
            "Lu3/k$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu3/k$n;->A:Lu3/k;

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

    iput-object p1, p0, Lu3/k$n;->z:Ljava/lang/Object;

    iget p1, p0, Lu3/k$n;->B:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu3/k$n;->B:I

    iget-object p1, p0, Lu3/k$n;->A:Lu3/k;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lu3/k;->n(Lu3/k;ZLeu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
