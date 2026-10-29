.class public final Leq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lar/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lar/f<",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Leq/a;",
        "Lar/f;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;",
        "wrapped",
        "<init>",
        "(Lar/f;)V",
        "rendering",
        "Lvq/a;",
        "systemUiController",
        "",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;Lvq/a;)V",
        "b",
        "Lar/f;",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lar/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lar/f<",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lar/f;)V
    .locals 1
    .param p1    # Lar/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lar/f<",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "wrapped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leq/a;->b:Lar/f;

    return-void
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;Lvq/a;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvq/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leq/a;->b:Lar/f;

    invoke-interface {v0, p1, p2}, Lar/f;->b(Ljava/lang/Object;Lvq/a;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lvq/a;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;

    invoke-virtual {p0, p1, p2}, Leq/a;->a(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;Lvq/a;)V

    return-void
.end method
