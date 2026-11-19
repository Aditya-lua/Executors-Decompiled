.class public final Lvo/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/o;
.implements Lls/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvo/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lln/o<",
        "Lvo/j$a;",
        ">;",
        "Lls/j<",
        "Lvo/j$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001eB/\u0008\u0007\u0012\u0014\u0008\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lvo/j;",
        "Lln/o;",
        "Lvo/j$a;",
        "Lls/j;",
        "Lg/d;",
        "",
        "",
        "openDocumentLauncher",
        "Landroid/content/Context;",
        "context",
        "Ler/c;",
        "sdkFilesManager",
        "<init>",
        "(Lg/d;Landroid/content/Context;Ler/c;)V",
        "",
        "g",
        "()V",
        "Landroid/net/Uri;",
        "file",
        "f",
        "(Landroid/net/Uri;)Ljava/lang/String;",
        "Ldv/h;",
        "run",
        "()Ldv/h;",
        "b",
        "Lg/d;",
        "c",
        "Landroid/content/Context;",
        "d",
        "Ler/c;",
        "a",
        "government-id_release"
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
.field public final b:Lg/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ler/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg/d;Landroid/content/Context;Ler/c;)V
    .locals 1
    .param p1    # Lg/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ler/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Ler/c;",
            ")V"
        }
    .end annotation

    const-string v0, "openDocumentLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkFilesManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/j;->b:Lg/d;

    iput-object p2, p0, Lvo/j;->c:Landroid/content/Context;

    iput-object p3, p0, Lvo/j;->d:Ler/c;

    return-void
.end method

.method public static final synthetic d(Lvo/j;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lvo/j;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lvo/j;)Ler/c;
    .locals 0

    iget-object p0, p0, Lvo/j;->d:Ler/c;

    return-object p0
.end method


# virtual methods
.method public a(Lln/o;)Z
    .locals 0
    .param p1    # Lln/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/o<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Lln/o$b;->a(Lln/o;Lln/o;)Z

    move-result p1

    return p1
.end method

.method public b(Lls/j;)Z
    .locals 0
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lls/j;->b(Lls/j;)Z

    move-result p1

    return p1
.end method

.method public c(Lls/j;)Z
    .locals 0
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lls/j;->c(Lls/j;)Z

    move-result p1

    return p1
.end method

.method public final f(Landroid/net/Uri;)Ljava/lang/String;
    .locals 7
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvo/j;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    :cond_0
    if-eqz p1, :cond_1

    const-string v0, "_display_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_2
    return-object v0
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lvo/j;->b:Lg/d;

    const-string v1, "image/*"

    const-string v2, "application/pdf"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg/d;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public run()Ldv/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lvo/j$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Laq/u;

    invoke-direct {v0}, Laq/u;-><init>()V

    new-instance v1, Lvo/j$b;

    invoke-direct {v1, v0, p0}, Lvo/j$b;-><init>(Ldv/h;Lvo/j;)V

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v0

    invoke-static {v1, v0}, Ldv/j;->y(Ldv/h;Lkotlin/coroutines/CoroutineContext;)Ldv/h;

    move-result-object v0

    return-object v0
.end method
