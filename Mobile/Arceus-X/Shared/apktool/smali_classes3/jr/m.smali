.class public final synthetic Ljr/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic b:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/m;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Ljr/m;->b:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, Ljr/m;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Ljr/m;->b:Lkotlin/jvm/internal/c0;

    invoke-static {v0, v1, p1, p2}, Ljr/o;->e(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;Landroid/view/View;Z)V

    return-void
.end method
