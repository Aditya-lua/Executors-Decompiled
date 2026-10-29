.class public final Lcr/y3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;",
        "config",
        "Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;)Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;",
        "ui-step-renderer_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;Lgr/u;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/y3;->c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;Lgr/u;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;)Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;
    .locals 3
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "uiComponentHelper"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "config"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcr/y4;->b()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-static {p0}, Lgr/u;->c(Landroid/view/LayoutInflater;)Lgr/u;

    move-result-object p0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy$Attributes;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lgr/u;->b:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;

    const-string v2, "textView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy$Attributes;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ler/h;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    new-instance v0, Lcr/x3;

    invoke-direct {v0, p2, p0}, Lcr/x3;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;Lgr/u;)V

    invoke-virtual {p1, v0}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    :cond_0
    invoke-virtual {p0}, Lgr/u;->b()Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;Lgr/u;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/PrivacyPolicy;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p1, p1, Lgr/u;->b:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextView;

    const-string v0, "textView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p0, v1, v0, v1}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
