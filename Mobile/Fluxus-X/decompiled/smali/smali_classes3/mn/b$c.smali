.class public final Lmn/b$c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmn/b;->b(Ljava/lang/Object;Ljava/lang/Object;Lln/a;Lpu/n;Lln/t$c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lpu/n<",
        "TP;TS;",
        "Lln/t$b<",
        "TP;TS;TO;>;TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00028\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002\"\u0004\u0008\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "P",
        "S",
        "O",
        "R",
        "props",
        "state",
        "Lln/t$b;",
        "outerContextInterceptor",
        "a",
        "(Ljava/lang/Object;Ljava/lang/Object;Lln/t$b;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lln/t;

.field public final synthetic j:Lln/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/a<",
            "TP;TS;TO;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lln/t$c;

.field public final synthetic l:Lmn/b;

.field public final synthetic m:Lpu/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpu/n<",
            "TP;TS;",
            "Lln/t$b<",
            "TP;TS;TO;>;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lln/t;Lln/a;Lln/t$c;Lmn/b;Lpu/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/t;",
            "Lln/a<",
            "+TP;TS;-TO;>;",
            "Lln/t$c;",
            "Lmn/b;",
            "Lpu/n<",
            "-TP;-TS;-",
            "Lln/t$b<",
            "TP;TS;TO;>;+TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lmn/b$c;->i:Lln/t;

    iput-object p2, p0, Lmn/b$c;->j:Lln/a;

    iput-object p3, p0, Lmn/b$c;->k:Lln/t$c;

    iput-object p4, p0, Lmn/b$c;->l:Lmn/b;

    iput-object p5, p0, Lmn/b$c;->m:Lpu/n;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Lln/t$b;)Ljava/lang/Object;
    .locals 6
    .param p3    # Lln/t$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TS;",
            "Lln/t$b<",
            "TP;TS;TO;>;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lmn/b$c;->i:Lln/t;

    iget-object v3, p0, Lmn/b$c;->j:Lln/a;

    new-instance v4, Lmn/b$c$a;

    iget-object v1, p0, Lmn/b$c;->l:Lmn/b;

    iget-object v2, p0, Lmn/b$c;->m:Lpu/n;

    invoke-direct {v4, v1, p3, v2}, Lmn/b$c$a;-><init>(Lmn/b;Lln/t$b;Lpu/n;)V

    iget-object v5, p0, Lmn/b$c;->k:Lln/t$c;

    move-object v1, p1

    move-object v2, p2

    invoke-interface/range {v0 .. v5}, Lln/t;->b(Ljava/lang/Object;Ljava/lang/Object;Lln/a;Lpu/n;Lln/t$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lln/t$b;

    invoke-virtual {p0, p1, p2, p3}, Lmn/b$c;->a(Ljava/lang/Object;Ljava/lang/Object;Lln/t$b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
