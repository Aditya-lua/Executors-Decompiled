.class public Ld2/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lc2/e;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Lc2/e;Lz1/d;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ld2/o$a;->a:Ljava/lang/ref/WeakReference;

    iget-object v0, p1, Lc2/e;->O:Lc2/d;

    invoke-virtual {p2, v0}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Ld2/o$a;->b:I

    iget-object v0, p1, Lc2/e;->P:Lc2/d;

    invoke-virtual {p2, v0}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Ld2/o$a;->c:I

    iget-object v0, p1, Lc2/e;->Q:Lc2/d;

    invoke-virtual {p2, v0}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Ld2/o$a;->d:I

    iget-object v0, p1, Lc2/e;->R:Lc2/d;

    invoke-virtual {p2, v0}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Ld2/o$a;->e:I

    iget-object p1, p1, Lc2/e;->S:Lc2/d;

    invoke-virtual {p2, p1}, Lz1/d;->y(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Ld2/o$a;->f:I

    iput p3, p0, Ld2/o$a;->g:I

    return-void
.end method
