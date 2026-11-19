.class public final Lnn/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/s;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u0007\u0010\rR$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u0010\"\u0004\u0008\u0011\u0010\u0005\u00a8\u0006\u0013"
    }
    d2 = {
        "Lnn/u;",
        "Lnn/s;",
        "",
        "initialValue",
        "<init>",
        "(Ljava/lang/String;)V",
        "Ldv/c0;",
        "a",
        "Ldv/c0;",
        "_textValue",
        "Ldv/h;",
        "b",
        "Ldv/h;",
        "()Ldv/h;",
        "onTextChanged",
        "value",
        "()Ljava/lang/String;",
        "c",
        "textValue",
        "wf1-core-common"
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
.field public final a:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ldv/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "initialValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object p1

    iput-object p1, p0, Lnn/u;->a:Ldv/c0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ldv/j;->n(Ldv/h;I)Ldv/h;

    move-result-object p1

    iput-object p1, p0, Lnn/u;->b:Ldv/h;

    return-void
.end method


# virtual methods
.method public a()Ldv/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lnn/u;->b:Ldv/h;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lnn/u;->a:Ldv/c0;

    invoke-interface {v0}, Ldv/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnn/u;->a:Ldv/c0;

    invoke-interface {v0, p1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
