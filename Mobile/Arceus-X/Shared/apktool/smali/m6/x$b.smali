.class public final Lm6/x$b;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm6/x;->a(Lnt/b;)Ljava/lang/Object;
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
    c = "coil3.decode.StaticImageDecoder"
    f = "StaticImageDecoder.kt"
    l = {
        0xa8
    }
    m = "decode"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lm6/x;

.field public x:I


# direct methods
.method public constructor <init>(Lm6/x;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/x;",
            "Lnt/b<",
            "-",
            "Lm6/x$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm6/x$b;->w:Lm6/x;

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

    iput-object p1, p0, Lm6/x$b;->v:Ljava/lang/Object;

    iget p1, p0, Lm6/x$b;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm6/x$b;->x:I

    iget-object p1, p0, Lm6/x$b;->w:Lm6/x;

    invoke-virtual {p1, p0}, Lm6/x;->a(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
