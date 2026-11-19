.class public final Lu3/z$a;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu3/z;->c(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.datastore.core.RunOnce"
    f = "DataStoreImpl.kt"
    l = {
        0x220,
        0x1f1
    }
    m = "runIfNeeded"
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
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lu3/z;

.field public x:I


# direct methods
.method public constructor <init>(Lu3/z;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/z;",
            "Leu/b<",
            "-",
            "Lu3/z$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu3/z$a;->w:Lu3/z;

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

    iput-object p1, p0, Lu3/z$a;->v:Ljava/lang/Object;

    iget p1, p0, Lu3/z$a;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu3/z$a;->x:I

    iget-object p1, p0, Lu3/z$a;->w:Lu3/z;

    invoke-virtual {p1, p0}, Lu3/z;->c(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
