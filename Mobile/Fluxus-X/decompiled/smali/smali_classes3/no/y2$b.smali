.class public final Lno/y2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/y2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B?\u0008\u0007\u0012\u0014\u0008\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\u0008\u0001\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lno/y2$b;",
        "",
        "Lg/d;",
        "",
        "",
        "openDocumentLauncher",
        "Lg/j;",
        "selectFromPhotoLibraryLauncher",
        "Landroid/content/Context;",
        "context",
        "Ler/c;",
        "sdkFilesManager",
        "<init>",
        "(Lg/d;Lg/d;Landroid/content/Context;Ler/c;)V",
        "Lno/y2;",
        "c",
        "()Lno/y2;",
        "e",
        "a",
        "Lg/d;",
        "b",
        "Landroid/content/Context;",
        "d",
        "Ler/c;",
        "document_release"
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
.field public final a:Lg/d;
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

.field public final b:Lg/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/d<",
            "Lg/j;",
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
.method public constructor <init>(Lg/d;Lg/d;Landroid/content/Context;Ler/c;)V
    .locals 1
    .param p1    # Lg/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lg/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ler/c;
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
            "Lg/d<",
            "Lg/j;",
            ">;",
            "Landroid/content/Context;",
            "Ler/c;",
            ")V"
        }
    .end annotation

    const-string v0, "openDocumentLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectFromPhotoLibraryLauncher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkFilesManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno/y2$b;->a:Lg/d;

    iput-object p2, p0, Lno/y2$b;->b:Lg/d;

    iput-object p3, p0, Lno/y2$b;->c:Landroid/content/Context;

    iput-object p4, p0, Lno/y2$b;->d:Ler/c;

    return-void
.end method

.method public static synthetic a(Lno/y2$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lno/y2$b;->f(Lno/y2$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lno/y2$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lno/y2$b;->d(Lno/y2$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lno/y2$b;)Lkotlin/Unit;
    .locals 2

    iget-object p0, p0, Lno/y2$b;->a:Lg/d;

    const-string v0, "image/*"

    const-string v1, "application/pdf"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg/d;->b(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f(Lno/y2$b;)Lkotlin/Unit;
    .locals 6

    iget-object p0, p0, Lno/y2$b;->b:Lg/d;

    sget-object v0, Lh/f$d;->a:Lh/f$d;

    const/16 v4, 0xe

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lg/k;->b(Lh/f$h;IZLh/f$b;ILjava/lang/Object;)Lg/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg/d;->b(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final c()Lno/y2;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lno/y2;

    iget-object v1, p0, Lno/y2$b;->c:Landroid/content/Context;

    iget-object v2, p0, Lno/y2$b;->d:Ler/c;

    new-instance v3, Lno/z2;

    invoke-direct {v3, p0}, Lno/z2;-><init>(Lno/y2$b;)V

    const-string v4, "DocumentPicker"

    invoke-direct {v0, v4, v1, v2, v3}, Lno/y2;-><init>(Ljava/lang/String;Landroid/content/Context;Ler/c;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public final e()Lno/y2;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lno/y2;

    iget-object v1, p0, Lno/y2$b;->c:Landroid/content/Context;

    iget-object v2, p0, Lno/y2$b;->d:Ler/c;

    new-instance v3, Lno/a3;

    invoke-direct {v3, p0}, Lno/a3;-><init>(Lno/y2$b;)V

    const-string v4, "PhotoLibraryPicker"

    invoke-direct {v0, v4, v1, v2, v3}, Lno/y2;-><init>(Ljava/lang/String;Landroid/content/Context;Ler/c;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method
