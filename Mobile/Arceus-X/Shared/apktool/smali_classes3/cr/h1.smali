.class public final synthetic Lcr/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/h1;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Lcr/h1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcr/h1;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Lcr/h1;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcr/i1;->b(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method
