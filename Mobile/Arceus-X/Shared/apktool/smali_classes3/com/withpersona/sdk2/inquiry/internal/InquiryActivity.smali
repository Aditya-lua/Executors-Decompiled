.class public final Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;
.super Lj/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000cJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;",
        "Lj/b;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "base",
        "",
        "attachBaseContext",
        "(Landroid/content/Context;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onPause",
        "onResume",
        "J1",
        "",
        "L1",
        "()Z",
        "Lcom/withpersona/sdk2/inquiry/internal/h;",
        "E",
        "Ljt/h;",
        "H1",
        "()Lcom/withpersona/sdk2/inquiry/internal/h;",
        "args",
        "Lzo/x;",
        "F",
        "I1",
        "()Lzo/x;",
        "viewModel",
        "inquiry-internal_release"
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
.field public final E:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final F:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lj/b;-><init>()V

    new-instance v0, Lzo/l;

    invoke-direct {v0, p0}, Lzo/l;-><init>(Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;)V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->E:Ljt/h;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity$a;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity$a;-><init>(Le/p;)V

    new-instance v1, Landroidx/lifecycle/z0;

    const-class v2, Lzo/x;

    invoke-static {v2}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity$b;

    invoke-direct {v3, p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity$b;-><init>(Le/p;)V

    new-instance v4, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity$c;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity$c;-><init>(Lkotlin/jvm/functions/Function0;Le/p;)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/z0;-><init>(Lhu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->F:Ljt/h;

    return-void
.end method

.method public static synthetic E1(Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;)Lcom/withpersona/sdk2/inquiry/internal/h;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->G1(Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;)Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F1(Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->K1(Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static final G1(Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;)Lcom/withpersona/sdk2/inquiry/internal/h;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/h;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/h;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final K1(Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bundle"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    const/4 p2, -0x1

    invoke-virtual {p0, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public final H1()Lcom/withpersona/sdk2/inquiry/internal/h;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->E:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/h;

    return-object v0
.end method

.method public final I1()Lzo/x;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->F:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzo/x;

    return-object v0
.end method

.method public final J1(Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->L1()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "PERSONA_ACTIVITY_RESULT"

    const-string v2, "INQUIRY_CANCELED"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->H1()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/internal/h;->m()Ljava/lang/String;

    move-result-object v1

    const-string v2, "INQUIRY_ID_KEY"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->H1()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/internal/h;->w()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v2, Lcom/withpersona/sdk2/inquiry/internal/h;->b:Lcom/withpersona/sdk2/inquiry/internal/h$a;

    invoke-virtual {v2, v1}, Lcom/withpersona/sdk2/inquiry/internal/h$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-string v2, "SESSION_TOKEN_KEY"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->H1()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->C()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lj/b;->setTheme(I)V

    :cond_2
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lbp/e;->c(Landroid/view/LayoutInflater;)Lbp/e;

    move-result-object v0

    const-string v1, "inflate(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lbp/e;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj/b;->setContentView(Landroid/view/View;)V

    if-nez p1, :cond_3

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "getSupportFragmentManager(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    sget v0, Lzo/e0;->f:I

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/i;

    invoke-direct {v1}, Lcom/withpersona/sdk2/inquiry/internal/i;-><init>()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/h;->n(ILandroidx/fragment/app/c;)Landroidx/fragment/app/h;

    invoke-virtual {p1}, Landroidx/fragment/app/h;->g()I

    :cond_3
    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->H1()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->t()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lzo/m;

    invoke-direct {v1, p0}, Lzo/m;-><init>(Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;)V

    invoke-virtual {p1, v0, p0, v1}, Landroidx/fragment/app/FragmentManager;->t1(Ljava/lang/String;Landroidx/lifecycle/s;Le4/f0;)V

    return-void
.end method

.method public final L1()Z
    .locals 5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->H1()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->w()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0xa

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lkotlin/text/StringsKt;->Z(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "PERSONA_ACTIVITY_RESULT"

    const-string v2, "INQUIRY_ERROR"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "ERROR_DEBUG_MESSAGE_KEY"

    const-string v2, "Invalid session token."

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->f:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    const-string v2, "null cannot be cast to non-null type android.os.Parcelable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "ERROR_CODE_KEY"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p0, v4, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return v4

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lj/b;->attachBaseContext(Landroid/content/Context;)V

    invoke-static {p0}, Lyq/b;->a(Landroid/content/Context;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, v0, v1, v0}, Le/x;->c(Le/p;Le/u0;Le/u0;ILjava/lang/Object;)V

    invoke-super {p0, p1}, Le4/q;->onCreate(Landroid/os/Bundle;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->J1(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->H1()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->H1()Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcp/c;->c(Landroid/content/Context;)Lcp/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcp/b;->c(Ljava/lang/Throwable;)V

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "PERSONA_ACTIVITY_RESULT"

    const-string v1, "INQUIRY_ERROR"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "ERROR_DEBUG_MESSAGE_KEY"

    const-string v1, "A fatal exception occurred."

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->l:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    const-string v1, "null cannot be cast to non-null type android.os.Parcelable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ERROR_CODE_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    throw p1
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Le4/q;->onPause()V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcp/c;->e(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Le4/q;->onResume()V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryActivity;->I1()Lzo/x;

    move-result-object v0

    invoke-virtual {v0}, Lzo/x;->F()V

    return-void
.end method
