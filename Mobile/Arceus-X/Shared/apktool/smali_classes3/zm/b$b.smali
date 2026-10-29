.class public final Lzm/b$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzm/b;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lzt/n;Lym/t$c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lzt/n<",
        "TP;TP;TS;TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0004\n\u0002\u0008\u0008\u0010\u0000\u001a\u0002H\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0001H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "<anonymous>",
        "S",
        "P",
        "old",
        "new",
        "state",
        "invoke",
        "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic i:Lym/t;

.field public final synthetic j:Lzt/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/n<",
            "TP;TP;TS;TS;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lym/t$c;


# direct methods
.method public constructor <init>(Lym/t;Lzt/n;Lym/t$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/t;",
            "Lzt/n<",
            "-TP;-TP;-TS;+TS;>;",
            "Lym/t$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lzm/b$b;->i:Lym/t;

    iput-object p2, p0, Lzm/b$b;->j:Lzt/n;

    iput-object p3, p0, Lzm/b$b;->k:Lym/t$c;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;TS;)TS;"
        }
    .end annotation

    iget-object v0, p0, Lzm/b$b;->i:Lym/t;

    iget-object v4, p0, Lzm/b$b;->j:Lzt/n;

    iget-object v5, p0, Lzm/b$b;->k:Lym/t$c;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-interface/range {v0 .. v5}, Lym/t;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lzt/n;Lym/t$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
