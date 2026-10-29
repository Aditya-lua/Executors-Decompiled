.class public final Lzm/b$c$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzm/b$c;->a(Ljava/lang/Object;Ljava/lang/Object;Lym/t$b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lzt/n<",
        "TP;TS;",
        "Lym/t$b<",
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
        "p",
        "s",
        "Lym/t$b;",
        "innerContextInterceptor",
        "a",
        "(Ljava/lang/Object;Ljava/lang/Object;Lym/t$b;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lzm/b;

.field public final synthetic j:Lym/t$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/t$b<",
            "TP;TS;TO;>;"
        }
    .end annotation
.end field

.field public final synthetic k:Lzt/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/n<",
            "TP;TS;",
            "Lym/t$b<",
            "TP;TS;TO;>;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzm/b;Lym/t$b;Lzt/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzm/b;",
            "Lym/t$b<",
            "TP;TS;TO;>;",
            "Lzt/n<",
            "-TP;-TS;-",
            "Lym/t$b<",
            "TP;TS;TO;>;+TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lzm/b$c$a;->i:Lzm/b;

    iput-object p2, p0, Lzm/b$c$a;->j:Lym/t$b;

    iput-object p3, p0, Lzm/b$c$a;->k:Lzt/n;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Lym/t$b;)Ljava/lang/Object;
    .locals 2
    .param p3    # Lym/t$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TS;",
            "Lym/t$b<",
            "TP;TS;TO;>;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lzm/b$c$a;->i:Lzm/b;

    iget-object v1, p0, Lzm/b$c$a;->j:Lym/t$b;

    invoke-static {v0, v1, p3}, Lzm/b;->f(Lzm/b;Lym/t$b;Lym/t$b;)Lym/t$b;

    move-result-object p3

    iget-object v0, p0, Lzm/b$c$a;->k:Lzt/n;

    invoke-interface {v0, p1, p2, p3}, Lzt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p3, Lym/t$b;

    invoke-virtual {p0, p1, p2, p3}, Lzm/b$c$a;->a(Ljava/lang/Object;Ljava/lang/Object;Lym/t$b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
