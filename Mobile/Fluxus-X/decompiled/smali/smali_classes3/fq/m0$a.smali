.class public final Lfq/m0$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/m0;-><init>(Lfq/n0;ZLkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Lgq/a;",
        "Lnn/k<",
        "Lfq/m0;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0005\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\n\u0008\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\u0008\u0008\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Ls5/a;",
        "BindingT",
        "",
        "RenderingT",
        "binding",
        "Lnn/k;",
        "a",
        "(Ls5/a;)Lnn/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lfq/m0;


# direct methods
.method public constructor <init>(Lfq/m0;)V
    .locals 0

    iput-object p1, p0, Lfq/m0$a;->i:Lfq/m0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls5/a;)Lnn/k;
    .locals 2
    .param p1    # Ls5/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgq/a;",
            ")",
            "Lnn/k<",
            "Lfq/m0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfq/m0$a$a;

    iget-object v1, p0, Lfq/m0$a;->i:Lfq/m0;

    invoke-direct {v0, p1, v1}, Lfq/m0$a$a;-><init>(Ls5/a;Lfq/m0;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls5/a;

    invoke-virtual {p0, p1}, Lfq/m0$a;->a(Ls5/a;)Lnn/k;

    move-result-object p1

    return-object p1
.end method
