.class public final Lzm/b$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzm/b;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lym/t$c;)Lym/i;
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
        "Lym/i;",
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
        "Lym/i;",
        "a",
        "(Ljava/lang/Object;)Lym/i;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lym/t;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TS;",
            "Lym/i;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:Lym/t$c;


# direct methods
.method public constructor <init>(Lym/t;Lkotlin/jvm/functions/Function1;Lym/t$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/t;",
            "Lkotlin/jvm/functions/Function1<",
            "-TS;",
            "Lym/i;",
            ">;",
            "Lym/t$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lzm/b$d;->i:Lym/t;

    iput-object p2, p0, Lzm/b$d;->j:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lzm/b$d;->k:Lym/t$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lym/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)",
            "Lym/i;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lzm/b$d;->i:Lym/t;

    iget-object v1, p0, Lzm/b$d;->j:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lzm/b$d;->k:Lym/t$c;

    invoke-interface {v0, p1, v1, v2}, Lym/t;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lym/t$c;)Lym/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lzm/b$d;->a(Ljava/lang/Object;)Lym/i;

    move-result-object p1

    return-object p1
.end method
