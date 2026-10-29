.class public final Lym/a0$a$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lym/a0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1<",
        "TOutputT;",
        "Lym/r<",
        "-",
        "Lym/o<",
        "+TOutputT;>;",
        "Ljava/lang/Integer;",
        "+TOutputT;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0005\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "OutputT",
        "output",
        "Lym/r;",
        "Lym/o;",
        "",
        "a",
        "(Ljava/lang/Object;)Lym/r;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lym/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/o<",
            "TOutputT;>;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lym/o;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/o<",
            "+TOutputT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lym/a0$a$a;->i:Lym/o;

    iput-object p2, p0, Lym/a0$a$a;->j:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lym/r;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOutputT;)",
            "Lym/r<",
            "Lym/o<",
            "+TOutputT;>;",
            "Ljava/lang/Integer;",
            "TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lym/b;

    iget-object v1, p0, Lym/a0$a$a;->i:Lym/o;

    iget-object v2, p0, Lym/a0$a$a;->j:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lym/b;-><init>(Lym/o;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lym/a0$a$a;->a(Ljava/lang/Object;)Lym/r;

    move-result-object p1

    return-object p1
.end method
