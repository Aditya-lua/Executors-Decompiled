.class public final Lmn/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lmn/e$a<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000*\u000e\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lmn/a;",
        "Lmn/e$a;",
        "T",
        "",
        "<init>",
        "()V",
        "Lmn/e;",
        "a",
        "Lmn/e;",
        "active",
        "b",
        "staging",
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
.field public a:Lmn/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmn/e<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lmn/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmn/e<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmn/e;

    invoke-direct {v0}, Lmn/e;-><init>()V

    iput-object v0, p0, Lmn/a;->a:Lmn/e;

    new-instance v0, Lmn/e;

    invoke-direct {v0}, Lmn/e;-><init>()V

    iput-object v0, p0, Lmn/a;->b:Lmn/e;

    return-void
.end method

.method public static final synthetic a(Lmn/a;)Lmn/e;
    .locals 0

    iget-object p0, p0, Lmn/a;->a:Lmn/e;

    return-object p0
.end method

.method public static final synthetic b(Lmn/a;)Lmn/e;
    .locals 0

    iget-object p0, p0, Lmn/a;->b:Lmn/e;

    return-object p0
.end method

.method public static final synthetic c(Lmn/a;Lmn/e;)V
    .locals 0

    iput-object p1, p0, Lmn/a;->a:Lmn/e;

    return-void
.end method

.method public static final synthetic d(Lmn/a;Lmn/e;)V
    .locals 0

    iput-object p1, p0, Lmn/a;->b:Lmn/e;

    return-void
.end method
