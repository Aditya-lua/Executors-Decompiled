.class public final Lcom/squareup/workflow1/ui/WorkflowLayout$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/workflow1/ui/WorkflowLayout$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnu/i<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0006"
    }
    d2 = {
        "com/squareup/workflow1/ui/WorkflowLayout$a$a$a",
        "Lnu/i;",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
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
.field public final synthetic a:Lcom/squareup/workflow1/ui/WorkflowLayout;

.field public final synthetic b:Lan/y;


# direct methods
.method public constructor <init>(Lcom/squareup/workflow1/ui/WorkflowLayout;Lan/y;)V
    .locals 0

    iput-object p1, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a$a$a;->a:Lcom/squareup/workflow1/ui/WorkflowLayout;

    iput-object p2, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a$a$a;->b:Lan/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p2, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a$a$a;->a:Lcom/squareup/workflow1/ui/WorkflowLayout;

    iget-object v0, p0, Lcom/squareup/workflow1/ui/WorkflowLayout$a$a$a;->b:Lan/y;

    invoke-virtual {p2, p1, v0}, Lcom/squareup/workflow1/ui/WorkflowLayout;->c(Ljava/lang/Object;Lan/y;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
