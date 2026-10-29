.class public final Lcom/withpersona/sdk2/inquiry/ui/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/ui/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B=\u0008\u0007\u0012\u0014\u0008\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0014\u0008\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
        "",
        "Lg/c;",
        "",
        "",
        "openMultipleDocumentsLauncher",
        "openSingleDocumentLauncher",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Lg/c;Lg/c;Landroid/content/Context;)V",
        "componentName",
        "allowedFileTypes",
        "",
        "fileUploadLimit",
        "Lcom/withpersona/sdk2/inquiry/ui/h;",
        "b",
        "(Ljava/lang/String;[Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/ui/h;",
        "a",
        "Lg/c;",
        "c",
        "Landroid/content/Context;",
        "ui_release"
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


# direct methods
.method public constructor <init>(Lg/c;Lg/c;Landroid/content/Context;)V
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    const-string v0, "openMultipleDocumentsLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "openSingleDocumentLauncher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a;->a:Lg/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a;->b:Lg/c;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a;->c:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(ILcom/withpersona/sdk2/inquiry/ui/h$a;[Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/h$a;->c(ILcom/withpersona/sdk2/inquiry/ui/h$a;[Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(ILcom/withpersona/sdk2/inquiry/ui/h$a;[Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/ui/h$a;->b:Lg/c;

    invoke-virtual {p0, p2}, Lg/c;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/ui/h$a;->a:Lg/c;

    invoke-virtual {p0, p2}, Lg/c;->b(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;[Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/ui/h;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedFileTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/ui/h;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FileUploadPicker-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/h$a;->c:Landroid/content/Context;

    new-instance v4, Lor/a4;

    invoke-direct {v4, p3, p0, p2}, Lor/a4;-><init>(ILcom/withpersona/sdk2/inquiry/ui/h$a;[Ljava/lang/String;)V

    new-instance v5, Lcom/withpersona/sdk2/inquiry/ui/h$a$a;

    const/4 p1, 0x0

    invoke-direct {v5, p3, p1}, Lcom/withpersona/sdk2/inquiry/ui/h$a$a;-><init>(ILnt/b;)V

    new-instance v6, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;

    invoke-direct {v6, p3, p1}, Lcom/withpersona/sdk2/inquiry/ui/h$a$b;-><init>(ILnt/b;)V

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/ui/h;-><init>(Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method
