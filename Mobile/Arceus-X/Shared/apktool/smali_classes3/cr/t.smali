.class public final synthetic Lcr/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic b:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic c:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final synthetic d:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/t;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Lcr/t;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p3, p0, Lcr/t;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p4, p0, Lcr/t;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcr/t;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcr/t;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, Lcr/t;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v3, p0, Lcr/t;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v0, v1, v2, v3}, Lcr/v;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
