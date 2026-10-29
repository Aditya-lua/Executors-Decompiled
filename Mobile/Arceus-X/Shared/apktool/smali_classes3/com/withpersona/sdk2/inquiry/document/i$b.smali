.class public final Lcom/withpersona/sdk2/inquiry/document/i$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/document/i;
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
        "Lcom/withpersona/sdk2/inquiry/document/i$b;",
        "",
        "Lg/c;",
        "",
        "",
        "openDocumentLauncher",
        "Lg/h;",
        "selectFromPhotoLibraryLauncher",
        "Landroid/content/Context;",
        "context",
        "Lqq/c;",
        "sdkFilesManager",
        "<init>",
        "(Lg/c;Lg/c;Landroid/content/Context;Lqq/c;)V",
        "Lcom/withpersona/sdk2/inquiry/document/i;",
        "c",
        "()Lcom/withpersona/sdk2/inquiry/document/i;",
        "e",
        "a",
        "Lg/c;",
        "b",
        "Landroid/content/Context;",
        "d",
        "Lqq/c;",
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
.field public final a:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Lg/h;",
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

.field public final d:Lqq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg/c;Lg/c;Landroid/content/Context;Lqq/c;)V
    .locals 1
    .param p1    # Lg/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lg/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lqq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Lg/c<",
            "Lg/h;",
            ">;",
            "Landroid/content/Context;",
            "Lqq/c;",
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

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->a:Lg/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->b:Lg/c;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->d:Lqq/c;

    return-void
.end method

.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/document/i$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/i$b;->f(Lcom/withpersona/sdk2/inquiry/document/i$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/document/i$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/i$b;->d(Lcom/withpersona/sdk2/inquiry/document/i$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/withpersona/sdk2/inquiry/document/i$b;)Lkotlin/Unit;
    .locals 2

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->a:Lg/c;

    const-string v0, "image/*"

    const-string v1, "application/pdf"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg/c;->b(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f(Lcom/withpersona/sdk2/inquiry/document/i$b;)Lkotlin/Unit;
    .locals 6

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->b:Lg/c;

    sget-object v0, Lh/f$d;->a:Lh/f$d;

    const/16 v4, 0xe

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lg/i;->b(Lh/f$h;IZLh/f$b;ILjava/lang/Object;)Lg/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg/c;->b(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final c()Lcom/withpersona/sdk2/inquiry/document/i;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->d:Lqq/c;

    new-instance v3, Lzn/l2;

    invoke-direct {v3, p0}, Lzn/l2;-><init>(Lcom/withpersona/sdk2/inquiry/document/i$b;)V

    const-string v4, "DocumentPicker"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/document/i;-><init>(Ljava/lang/String;Landroid/content/Context;Lqq/c;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public final e()Lcom/withpersona/sdk2/inquiry/document/i;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/i$b;->d:Lqq/c;

    new-instance v3, Lzn/m2;

    invoke-direct {v3, p0}, Lzn/m2;-><init>(Lcom/withpersona/sdk2/inquiry/document/i$b;)V

    const-string v4, "PhotoLibraryPicker"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/document/i;-><init>(Ljava/lang/String;Landroid/content/Context;Lqq/c;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method
