.class public final Lnu/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lku/i1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnu/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\r\u0008\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lnu/h0$a;",
        "Lku/i1;",
        "Lnu/h0;",
        "flow",
        "",
        "index",
        "",
        "value",
        "Lnt/b;",
        "",
        "cont",
        "<init>",
        "(Lnu/h0;JLjava/lang/Object;Lnt/b;)V",
        "a",
        "()V",
        "Lnu/h0;",
        "b",
        "J",
        "c",
        "Ljava/lang/Object;",
        "d",
        "Lnt/b;",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lnu/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h0<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:J

.field public final c:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lnt/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnu/h0;JLjava/lang/Object;Lnt/b;)V
    .locals 0
    .param p1    # Lnu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/h0<",
            "*>;J",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnu/h0$a;->a:Lnu/h0;

    iput-wide p2, p0, Lnu/h0$a;->b:J

    iput-object p4, p0, Lnu/h0$a;->c:Ljava/lang/Object;

    iput-object p5, p0, Lnu/h0$a;->d:Lnt/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lnu/h0$a;->a:Lnu/h0;

    invoke-static {v0, p0}, Lnu/h0;->n(Lnu/h0;Lnu/h0$a;)V

    return-void
.end method
