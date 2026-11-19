.class public final Lkotlin/collections/o0$a;
.super Lkotlin/collections/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/collections/o0;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/collections/c<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0016\u0010\u0008\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "kotlin/collections/o0$a",
        "Lkotlin/collections/c;",
        "",
        "b",
        "()V",
        "",
        "c",
        "I",
        "count",
        "d",
        "index",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public c:I

.field public d:I

.field public final synthetic e:Lkotlin/collections/o0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/collections/o0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/collections/o0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/collections/o0<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlin/collections/o0$a;->e:Lkotlin/collections/o0;

    invoke-direct {p0}, Lkotlin/collections/c;-><init>()V

    invoke-virtual {p1}, Lkotlin/collections/b;->size()I

    move-result v0

    iput v0, p0, Lkotlin/collections/o0$a;->c:I

    invoke-static {p1}, Lkotlin/collections/o0;->f(Lkotlin/collections/o0;)I

    move-result p1

    iput p1, p0, Lkotlin/collections/o0$a;->d:I

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    iget v0, p0, Lkotlin/collections/o0$a;->c:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlin/collections/c;->d()V

    return-void

    :cond_0
    iget-object v0, p0, Lkotlin/collections/o0$a;->e:Lkotlin/collections/o0;

    invoke-static {v0}, Lkotlin/collections/o0;->d(Lkotlin/collections/o0;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lkotlin/collections/o0$a;->d:I

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lkotlin/collections/c;->e(Ljava/lang/Object;)V

    iget-object v0, p0, Lkotlin/collections/o0$a;->e:Lkotlin/collections/o0;

    iget v1, p0, Lkotlin/collections/o0$a;->d:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0}, Lkotlin/collections/o0;->e(Lkotlin/collections/o0;)I

    move-result v0

    rem-int/2addr v1, v0

    iput v1, p0, Lkotlin/collections/o0$a;->d:I

    iget v0, p0, Lkotlin/collections/o0$a;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkotlin/collections/o0$a;->c:I

    return-void
.end method
