.class public final Lln/u$a;
.super Lln/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln/u;->a(Lln/t;Lln/k;Lln/t$c;)Lln/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lln/k<",
        "TP;TS;TO;TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001J!\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\'\u0010\n\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0008\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJC\u0010\u0010\u001a\u00028\u00032\u0006\u0010\u000c\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\"\u0010\u000f\u001a\u001e0\u000eR\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00028\u0001H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "ln/u$a",
        "Lln/k;",
        "props",
        "Lln/i;",
        "snapshot",
        "d",
        "(Ljava/lang/Object;Lln/i;)Ljava/lang/Object;",
        "old",
        "new",
        "state",
        "e",
        "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "renderProps",
        "renderState",
        "Lln/k$a;",
        "context",
        "f",
        "(Ljava/lang/Object;Ljava/lang/Object;Lln/k$a;)Ljava/lang/Object;",
        "g",
        "(Ljava/lang/Object;)Lln/i;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "wf1-workflow-runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lln/t;

.field public final synthetic b:Lln/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/k<",
            "TP;TS;TO;TR;>;"
        }
    .end annotation
.end field

.field public final synthetic c:Lln/t$c;


# direct methods
.method public constructor <init>(Lln/t;Lln/k;Lln/t$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/t;",
            "Lln/k<",
            "-TP;TS;+TO;+TR;>;",
            "Lln/t$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lln/u$a;->a:Lln/t;

    iput-object p2, p0, Lln/u$a;->b:Lln/k;

    iput-object p3, p0, Lln/u$a;->c:Lln/t$c;

    invoke-direct {p0}, Lln/k;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;Lln/i;)Ljava/lang/Object;
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

    iget-object v0, p0, Lln/u$a;->a:Lln/t;

    new-instance v1, Lln/u$a$a;

    iget-object v2, p0, Lln/u$a;->b:Lln/k;

    invoke-direct {v1, v2}, Lln/u$a$a;-><init>(Ljava/lang/Object;)V

    iget-object v2, p0, Lln/u$a;->c:Lln/t$c;

    invoke-interface {v0, p1, p2, v1, v2}, Lln/t;->a(Ljava/lang/Object;Lln/i;Lkotlin/jvm/functions/Function2;Lln/t$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;TS;)TS;"
        }
    .end annotation

    iget-object v0, p0, Lln/u$a;->a:Lln/t;

    new-instance v4, Lln/u$a$b;

    iget-object v1, p0, Lln/u$a;->b:Lln/k;

    invoke-direct {v4, v1}, Lln/u$a$b;-><init>(Ljava/lang/Object;)V

    iget-object v5, p0, Lln/u$a;->c:Lln/t$c;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-interface/range {v0 .. v5}, Lln/t;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lpu/n;Lln/t$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;Lln/k$a;)Ljava/lang/Object;
    .locals 7
    .param p3    # Lln/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TS;",
            "Lln/k<",
            "-TP;TS;+TO;+TR;>.a;)TR;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lln/u$a;->a:Lln/t;

    new-instance v5, Lln/u$a$c;

    iget-object v0, p0, Lln/u$a;->b:Lln/k;

    invoke-direct {v5, p3, v0, p0}, Lln/u$a$c;-><init>(Lln/k$a;Lln/k;Lln/u$a;)V

    iget-object v6, p0, Lln/u$a;->c:Lln/t$c;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-interface/range {v1 .. v6}, Lln/t;->b(Ljava/lang/Object;Ljava/lang/Object;Lln/a;Lpu/n;Lln/t$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Object;)Lln/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)",
            "Lln/i;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lln/u$a;->a:Lln/t;

    new-instance v1, Lln/u$a$d;

    iget-object v2, p0, Lln/u$a;->b:Lln/k;

    invoke-direct {v1, v2}, Lln/u$a$d;-><init>(Ljava/lang/Object;)V

    iget-object v2, p0, Lln/u$a;->c:Lln/t$c;

    invoke-interface {v0, p1, v1, v2}, Lln/t;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lln/t$c;)Lln/i;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InterceptedWorkflow("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lln/u$a;->b:Lln/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "@intercept)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
