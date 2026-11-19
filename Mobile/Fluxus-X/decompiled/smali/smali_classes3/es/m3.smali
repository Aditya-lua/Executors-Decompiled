.class public final synthetic Les/m3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Les/h4;

.field public final synthetic b:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic c:Lqr/i2;

.field public final synthetic d:Lqr/k4;


# direct methods
.method public synthetic constructor <init>(Les/h4;Lcom/google/android/material/textfield/TextInputLayout;Lqr/i2;Lqr/k4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/m3;->a:Les/h4;

    iput-object p2, p0, Les/m3;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p3, p0, Les/m3;->c:Lqr/i2;

    iput-object p4, p0, Les/m3;->d:Lqr/k4;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Les/m3;->a:Les/h4;

    iget-object v1, p0, Les/m3;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, Les/m3;->c:Lqr/i2;

    iget-object v3, p0, Les/m3;->d:Lqr/k4;

    invoke-static {v0, v1, v2, v3, p1}, Les/h4;->C(Les/h4;Lcom/google/android/material/textfield/TextInputLayout;Lqr/i2;Lqr/k4;Landroid/view/View;)V

    return-void
.end method
