.class public final Lzm/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lzm/e$a<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000*\u000e\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lzm/a;",
        "Lzm/e$a;",
        "T",
        "",
        "<init>",
        "()V",
        "Lzm/e;",
        "a",
        "Lzm/e;",
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
.field public a:Lzm/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzm/e<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lzm/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzm/e<",
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

    new-instance v0, Lzm/e;

    invoke-direct {v0}, Lzm/e;-><init>()V

    iput-object v0, p0, Lzm/a;->a:Lzm/e;

    new-instance v0, Lzm/e;

    invoke-direct {v0}, Lzm/e;-><init>()V

    iput-object v0, p0, Lzm/a;->b:Lzm/e;

    return-void
.end method

.method public static final synthetic a(Lzm/a;)Lzm/e;
    .locals 0

    iget-object p0, p0, Lzm/a;->a:Lzm/e;

    return-object p0
.end method

.method public static final synthetic b(Lzm/a;)Lzm/e;
    .locals 0

    iget-object p0, p0, Lzm/a;->b:Lzm/e;

    return-object p0
.end method

.method public static final synthetic c(Lzm/a;Lzm/e;)V
    .locals 0

    iput-object p1, p0, Lzm/a;->a:Lzm/e;

    return-void
.end method

.method public static final synthetic d(Lzm/a;Lzm/e;)V
    .locals 0

    iput-object p1, p0, Lzm/a;->b:Lzm/e;

    return-void
.end method
