.class public final Lhp/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhp/s0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0015\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0003\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0008\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0010\u001a\u0004\u0008\u0012\u0010\u0011R#\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0019\u00a8\u0006 "
    }
    d2 = {
        "Lhp/b;",
        "Lhp/s0;",
        "",
        "isEnabled",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
        "props",
        "",
        "key",
        "didGoBack",
        "Lkotlin/Function1;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
        "",
        "handler",
        "<init>",
        "(ZLcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V",
        "a",
        "Z",
        "()Z",
        "b",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
        "d",
        "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
        "c",
        "Ljava/lang/String;",
        "getKey",
        "()Ljava/lang/String;",
        "e",
        "Lkotlin/jvm/functions/Function1;",
        "getHandler",
        "()Lkotlin/jvm/functions/Function1;",
        "getName",
        "name",
        "inquiry-internal_release"
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
.field public final a:Z

.field public final b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Z

.field public final e:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p2    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "props"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lhp/b;->a:Z

    iput-object p2, p0, Lhp/b;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    iput-object p3, p0, Lhp/b;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lhp/b;->d:Z

    iput-object p5, p0, Lhp/b;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lhp/b;->d:Z

    return v0
.end method

.method public final d()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lhp/b;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    return-object v0
.end method

.method public final getHandler()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lhp/b;->e:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lhp/b;->c:Ljava/lang/String;

    return-object v0
.end method
