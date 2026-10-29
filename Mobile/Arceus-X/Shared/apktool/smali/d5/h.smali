.class public final Ld5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld5/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0010B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\tj\u0002`\nH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Ld5/h;",
        "",
        "Le5/b;",
        "impl",
        "<init>",
        "(Le5/b;)V",
        "",
        "c",
        "()V",
        "Landroid/os/Bundle;",
        "Landroidx/savedstate/SavedState;",
        "savedState",
        "d",
        "(Landroid/os/Bundle;)V",
        "outBundle",
        "e",
        "a",
        "Le5/b;",
        "Ld5/f;",
        "b",
        "Ld5/f;",
        "()Ld5/f;",
        "savedStateRegistry",
        "savedstate"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Ld5/h$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Le5/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ld5/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld5/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld5/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ld5/h;->c:Ld5/h$a;

    return-void
.end method

.method public constructor <init>(Le5/b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/h;->a:Le5/b;

    .line 3
    new-instance v0, Ld5/f;

    invoke-direct {v0, p1}, Ld5/f;-><init>(Le5/b;)V

    iput-object v0, p0, Ld5/h;->b:Ld5/f;

    return-void
.end method

.method public synthetic constructor <init>(Le5/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ld5/h;-><init>(Le5/b;)V

    return-void
.end method

.method public static final a(Ld5/i;)Ld5/h;
    .locals 1
    .param p0    # Ld5/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Ld5/h;->c:Ld5/h$a;

    invoke-virtual {v0, p0}, Ld5/h$a;->b(Ld5/i;)Ld5/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Ld5/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ld5/h;->b:Ld5/f;

    return-object v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ld5/h;->a:Le5/b;

    invoke-virtual {v0}, Le5/b;->f()V

    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Ld5/h;->a:Le5/b;

    invoke-virtual {v0, p1}, Le5/b;->h(Landroid/os/Bundle;)V

    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "outBundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld5/h;->a:Le5/b;

    invoke-virtual {v0, p1}, Le5/b;->i(Landroid/os/Bundle;)V

    return-void
.end method
