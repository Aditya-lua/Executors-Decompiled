.class public abstract Ld6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ld6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128$X\u00a4\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Ld6/b;",
        "T",
        "Ld6/e;",
        "Le6/h;",
        "tracker",
        "<init>",
        "(Le6/h;)V",
        "value",
        "",
        "e",
        "(Ljava/lang/Object;)Z",
        "Ly5/d;",
        "constraints",
        "Ldv/h;",
        "Lc6/b;",
        "a",
        "(Ly5/d;)Ldv/h;",
        "Le6/h;",
        "",
        "d",
        "()I",
        "getReason$annotations",
        "()V",
        "reason",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Le6/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le6/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le6/h;)V
    .locals 1
    .param p1    # Le6/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le6/h<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "tracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/b;->a:Le6/h;

    return-void
.end method

.method public static final synthetic c(Ld6/b;)Le6/h;
    .locals 0

    iget-object p0, p0, Ld6/b;->a:Le6/h;

    return-object p0
.end method


# virtual methods
.method public a(Ly5/d;)Ldv/h;
    .locals 1
    .param p1    # Ly5/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/d;",
            ")",
            "Ldv/h<",
            "Lc6/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "constraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ld6/b$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ld6/b$a;-><init>(Ld6/b;Leu/b;)V

    invoke-static {p1}, Ldv/j;->d(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object p1

    return-object p1
.end method

.method public abstract d()I
.end method

.method public abstract e(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method
