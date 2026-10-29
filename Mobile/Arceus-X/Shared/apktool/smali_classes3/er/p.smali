.class public final Ler/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u0007\u0010\rR$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u0010\"\u0004\u0008\u0011\u0010\u0005\u00a8\u0006\u0012"
    }
    d2 = {
        "Ler/p;",
        "",
        "",
        "initialValue",
        "<init>",
        "(Z)V",
        "Lnu/c0;",
        "a",
        "Lnu/c0;",
        "_boolValue",
        "Lnu/h;",
        "b",
        "Lnu/h;",
        "()Lnu/h;",
        "onChanged",
        "value",
        "()Z",
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
.field public final a:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lnu/r0;->a(Ljava/lang/Object;)Lnu/c0;

    move-result-object p1

    iput-object p1, p0, Ler/p;->a:Lnu/c0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lnu/j;->n(Lnu/h;I)Lnu/h;

    move-result-object p1

    iput-object p1, p0, Ler/p;->b:Lnu/h;

    return-void
.end method


# virtual methods
.method public final a()Lnu/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ler/p;->b:Lnu/h;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Ler/p;->a:Lnu/c0;

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c(Z)V
    .locals 1

    iget-object v0, p0, Ler/p;->a:Lnu/c0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
