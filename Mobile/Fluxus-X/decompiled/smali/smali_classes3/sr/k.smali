.class public final Lsr/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u0007\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u0010\"\u0004\u0008\u0011\u0010\u0005\u00a8\u0006\u0012"
    }
    d2 = {
        "Lsr/k;",
        "",
        "Lzp/o;",
        "initialValue",
        "<init>",
        "(Lzp/o;)V",
        "Ldv/c0;",
        "a",
        "Ldv/c0;",
        "_scanResult",
        "Ldv/h;",
        "b",
        "Ldv/h;",
        "()Ldv/h;",
        "onChanged",
        "value",
        "()Lzp/o;",
        "c",
        "ui-step-renderer_release"
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
.field public final a:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "Lzp/o;",
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
            "Lzp/o;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzp/o;)V
    .locals 1
    .param p1    # Lzp/o;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ldv/r0;->a(Ljava/lang/Object;)Ldv/c0;

    move-result-object p1

    iput-object p1, p0, Lsr/k;->a:Ldv/c0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ldv/j;->n(Ldv/h;I)Ldv/h;

    move-result-object p1

    iput-object p1, p0, Lsr/k;->b:Ldv/h;

    return-void
.end method


# virtual methods
.method public final a()Ldv/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lzp/o;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lsr/k;->b:Ldv/h;

    return-object v0
.end method

.method public final b()Lzp/o;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lsr/k;->a:Ldv/c0;

    invoke-interface {v0}, Ldv/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzp/o;

    return-object v0
.end method

.method public final c(Lzp/o;)V
    .locals 1
    .param p1    # Lzp/o;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lsr/k;->a:Ldv/c0;

    invoke-interface {v0, p1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
