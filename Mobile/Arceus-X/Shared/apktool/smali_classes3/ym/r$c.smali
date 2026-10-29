.class public final Lym/r$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lym/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00028\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0002\u001a\u00028\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\"\u0010\u0003\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u000b\u001a\u0004\u0008\u000e\u0010\r\"\u0004\u0008\u000f\u0010\tR4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00108\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0012\u001a\u0004\u0008\n\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lym/r$c;",
        "",
        "props",
        "state",
        "<init>",
        "(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)V",
        "output",
        "",
        "d",
        "(Ljava/lang/Object;)V",
        "a",
        "Ljava/lang/Object;",
        "b",
        "()Ljava/lang/Object;",
        "c",
        "e",
        "Lym/v;",
        "<set-?>",
        "Lym/v;",
        "()Lym/v;",
        "maybeOutput",
        "wf1-workflow-core"
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
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TPropsT;"
        }
    .end annotation
.end field

.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TStateT;"
        }
    .end annotation
.end field

.field public c:Lym/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/v<",
            "+TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final synthetic d:Lym/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/r<",
            "TPropsT;TStateT;TOutputT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lym/r;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TPropsT;TStateT;)V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lym/r$c;->d:Lym/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lym/r$c;->a:Ljava/lang/Object;

    iput-object p3, p0, Lym/r$c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lym/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lym/v<",
            "TOutputT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lym/r$c;->c:Lym/v;

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TPropsT;"
        }
    .end annotation

    iget-object v0, p0, Lym/r$c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TStateT;"
        }
    .end annotation

    iget-object v0, p0, Lym/r$c;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOutputT;)V"
        }
    .end annotation

    new-instance v0, Lym/v;

    invoke-direct {v0, p1}, Lym/v;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lym/r$c;->c:Lym/v;

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TStateT;)V"
        }
    .end annotation

    iput-object p1, p0, Lym/r$c;->b:Ljava/lang/Object;

    return-void
.end method
