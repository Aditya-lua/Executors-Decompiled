.class public final Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lnq/b;",
        "Lan/k<",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:Z

.field public final synthetic d:Lzt/n;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;ZLzt/n;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->b:Lkotlin/jvm/functions/Function2;

    iput-boolean p3, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->c:Z

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->d:Lzt/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnq/b;)Lan/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnq/b;",
            ")",
            "Lan/k<",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;",
            ">;"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lar/s;->a:Lar/s;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->b:Lkotlin/jvm/functions/Function2;

    iget-boolean v3, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->c:Z

    invoke-virtual {v0, p1, v1, v2, v3}, Lar/s;->l(Lnq/b;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;Z)Lar/g;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->d:Lzt/n;

    invoke-direct {v1, v2, p1, v3, v0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lnq/b;Lzt/n;Lar/g;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnq/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->a(Lnq/b;)Lan/k;

    move-result-object p1

    return-object p1
.end method
