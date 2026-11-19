.class public final Lmn/b$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmn/b;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lln/t$c;)Lln/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1<",
        "TS;",
        "Lln/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "S",
        "state",
        "Lln/i;",
        "a",
        "(Ljava/lang/Object;)Lln/i;"
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

.field public final synthetic j:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TS;",
            "Lln/i;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:Lln/t$c;


# direct methods
.method public constructor <init>(Lln/t;Lkotlin/jvm/functions/Function1;Lln/t$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/t;",
            "Lkotlin/jvm/functions/Function1<",
            "-TS;",
            "Lln/i;",
            ">;",
            "Lln/t$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lmn/b$d;->i:Lln/t;

    iput-object p2, p0, Lmn/b$d;->j:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lmn/b$d;->k:Lln/t$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lln/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)",
            "Lln/i;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lmn/b$d;->i:Lln/t;

    iget-object v1, p0, Lmn/b$d;->j:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lmn/b$d;->k:Lln/t$c;

    invoke-interface {v0, p1, v1, v2}, Lln/t;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lln/t$c;)Lln/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmn/b$d;->a(Ljava/lang/Object;)Lln/i;

    move-result-object p1

    return-object p1
.end method
