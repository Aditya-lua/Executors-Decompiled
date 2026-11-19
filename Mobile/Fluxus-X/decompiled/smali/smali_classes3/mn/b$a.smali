.class public final Lmn/b$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmn/b;->a(Ljava/lang/Object;Lln/i;Lkotlin/jvm/functions/Function2;Lln/t$c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function2<",
        "TP;",
        "Lln/i;",
        "TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00028\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "P",
        "S",
        "props",
        "Lln/i;",
        "snapshot",
        "a",
        "(Ljava/lang/Object;Lln/i;)Ljava/lang/Object;"
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

.field public final synthetic j:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TP;",
            "Lln/i;",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lln/t$c;


# direct methods
.method public constructor <init>(Lln/t;Lkotlin/jvm/functions/Function2;Lln/t$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/t;",
            "Lkotlin/jvm/functions/Function2<",
            "-TP;-",
            "Lln/i;",
            "+TS;>;",
            "Lln/t$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmn/b$a;->i:Lln/t;

    iput-object p2, p0, Lmn/b$a;->j:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lmn/b$a;->k:Lln/t$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lln/i;)Ljava/lang/Object;
    .locals 3
    .param p2    # Lln/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lln/i;",
            ")TS;"
        }
    .end annotation

    iget-object v0, p0, Lmn/b$a;->i:Lln/t;

    iget-object v1, p0, Lmn/b$a;->j:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lmn/b$a;->k:Lln/t$c;

    invoke-interface {v0, p1, p2, v1, v2}, Lln/t;->a(Ljava/lang/Object;Lln/i;Lkotlin/jvm/functions/Function2;Lln/t$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lln/i;

    invoke-virtual {p0, p1, p2}, Lmn/b$a;->a(Ljava/lang/Object;Lln/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
