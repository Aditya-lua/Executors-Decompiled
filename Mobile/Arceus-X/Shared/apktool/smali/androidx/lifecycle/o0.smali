.class public final Landroidx/lifecycle/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\u000c\u0008\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00082\u000e\u0010\u000c\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0014\"\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0014\"\u001e\u0010\u0017\u001a\u000c\u0012\u0008\u0012\u00060\nj\u0002`\u000b0\u00138\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0014\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Ld5/i;",
        "Landroidx/lifecycle/c1;",
        "T",
        "",
        "c",
        "(Ld5/i;)V",
        "savedStateRegistryOwner",
        "viewModelStoreOwner",
        "",
        "key",
        "Landroid/os/Bundle;",
        "Landroidx/savedstate/SavedState;",
        "defaultArgs",
        "Landroidx/lifecycle/l0;",
        "a",
        "(Ld5/i;Landroidx/lifecycle/c1;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/l0;",
        "Lk4/a;",
        "b",
        "(Lk4/a;)Landroidx/lifecycle/l0;",
        "Lk4/a$c;",
        "Lk4/a$c;",
        "SAVED_STATE_REGISTRY_OWNER_KEY",
        "VIEW_MODEL_STORE_OWNER_KEY",
        "DEFAULT_ARGS_KEY",
        "Landroidx/lifecycle/s0;",
        "e",
        "(Landroidx/lifecycle/c1;)Landroidx/lifecycle/s0;",
        "savedStateHandlesVM",
        "Landroidx/lifecycle/r0;",
        "d",
        "(Ld5/i;)Landroidx/lifecycle/r0;",
        "savedStateHandlesProvider",
        "lifecycle-viewmodel-savedstate"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lk4/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk4/a$c<",
            "Ld5/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lk4/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk4/a$c<",
            "Landroidx/lifecycle/c1;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lk4/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk4/a$c<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lk4/a;->b:Lk4/a$a;

    new-instance v0, Landroidx/lifecycle/o0$b;

    invoke-direct {v0}, Landroidx/lifecycle/o0$b;-><init>()V

    sput-object v0, Landroidx/lifecycle/o0;->a:Lk4/a$c;

    new-instance v0, Landroidx/lifecycle/o0$c;

    invoke-direct {v0}, Landroidx/lifecycle/o0$c;-><init>()V

    sput-object v0, Landroidx/lifecycle/o0;->b:Lk4/a$c;

    new-instance v0, Landroidx/lifecycle/o0$d;

    invoke-direct {v0}, Landroidx/lifecycle/o0$d;-><init>()V

    sput-object v0, Landroidx/lifecycle/o0;->c:Lk4/a$c;

    return-void
.end method

.method public static final a(Ld5/i;Landroidx/lifecycle/c1;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/l0;
    .locals 1

    invoke-static {p0}, Landroidx/lifecycle/o0;->d(Ld5/i;)Landroidx/lifecycle/r0;

    move-result-object p0

    invoke-static {p1}, Landroidx/lifecycle/o0;->e(Landroidx/lifecycle/c1;)Landroidx/lifecycle/s0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/s0;->e()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/l0;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/lifecycle/l0;->c:Landroidx/lifecycle/l0$a;

    invoke-virtual {p0, p2}, Landroidx/lifecycle/r0;->c(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0, p3}, Landroidx/lifecycle/l0$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/l0;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/lifecycle/s0;->e()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static final b(Lk4/a;)Landroidx/lifecycle/l0;
    .locals 4
    .param p0    # Lk4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/o0;->a:Lk4/a$c;

    invoke-virtual {p0, v0}, Lk4/a;->a(Lk4/a$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld5/i;

    if-eqz v0, :cond_2

    sget-object v1, Landroidx/lifecycle/o0;->b:Lk4/a$c;

    invoke-virtual {p0, v1}, Lk4/a;->a(Lk4/a$c;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/c1;

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/lifecycle/o0;->c:Lk4/a$c;

    invoke-virtual {p0, v2}, Lk4/a;->a(Lk4/a$c;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Landroidx/lifecycle/a1;->c:Lk4/a$c;

    invoke-virtual {p0, v3}, Lk4/a;->a(Lk4/a$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-static {v0, v1, p0, v2}, Landroidx/lifecycle/o0;->a(Ld5/i;Landroidx/lifecycle/c1;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/l0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Ld5/i;)V
    .locals 4
    .param p0    # Ld5/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ld5/i;",
            ":",
            "Landroidx/lifecycle/c1;",
            ">(TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l$b;->b:Landroidx/lifecycle/l$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/l$b;->c:Landroidx/lifecycle/l$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ld5/i;->A()Ld5/f;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Ld5/f;->b(Ljava/lang/String;)Ld5/f$b;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroidx/lifecycle/r0;

    invoke-interface {p0}, Ld5/i;->A()Ld5/f;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Landroidx/lifecycle/c1;

    invoke-direct {v0, v2, v3}, Landroidx/lifecycle/r0;-><init>(Ld5/f;Landroidx/lifecycle/c1;)V

    invoke-interface {p0}, Ld5/i;->A()Ld5/f;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Ld5/f;->c(Ljava/lang/String;Ld5/f$b;)V

    invoke-interface {p0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/m0;

    invoke-direct {v1, v0}, Landroidx/lifecycle/m0;-><init>(Landroidx/lifecycle/r0;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_2
    return-void
.end method

.method public static final d(Ld5/i;)Landroidx/lifecycle/r0;
    .locals 1
    .param p0    # Ld5/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ld5/i;->A()Ld5/f;

    move-result-object p0

    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {p0, v0}, Ld5/f;->b(Ljava/lang/String;)Ld5/f$b;

    move-result-object p0

    instance-of v0, p0, Landroidx/lifecycle/r0;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/lifecycle/r0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(Landroidx/lifecycle/c1;)Landroidx/lifecycle/s0;
    .locals 7
    .param p0    # Landroidx/lifecycle/c1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroidx/lifecycle/a1;->b:Landroidx/lifecycle/a1$b;

    new-instance v3, Landroidx/lifecycle/o0$a;

    invoke-direct {v3}, Landroidx/lifecycle/o0$a;-><init>()V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/a1$b;->c(Landroidx/lifecycle/a1$b;Landroidx/lifecycle/c1;Landroidx/lifecycle/a1$c;Lk4/a;ILjava/lang/Object;)Landroidx/lifecycle/a1;

    move-result-object p0

    const-class v0, Landroidx/lifecycle/s0;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {p0, v1, v0}, Landroidx/lifecycle/a1;->c(Ljava/lang/String;Lhu/c;)Landroidx/lifecycle/x0;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/s0;

    return-object p0
.end method
