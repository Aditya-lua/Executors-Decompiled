.class public final Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR$\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0006\u0010\u000e\"\u0004\u0008\n\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "<init>",
        "(Landroidx/lifecycle/l0;)V",
        "a",
        "Landroidx/lifecycle/l0;",
        "Lnu/c0;",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;",
        "b",
        "Lnu/c0;",
        "themeFlow",
        "value",
        "()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;",
        "(Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;)V",
        "theme",
        "shared_release"
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
.field public final a:Landroidx/lifecycle/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l0;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;->a:Landroidx/lifecycle/l0;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;

    move-result-object v0

    const-string v1, "inquiry_theme"

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/l0;->e(Ljava/lang/String;Ljava/lang/Object;)Lnu/c0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;->b:Lnu/c0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;->b:Lnu/c0;

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;

    return-object v0
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;->b:Lnu/c0;

    invoke-interface {v0, p1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
