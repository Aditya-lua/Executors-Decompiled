.class public final synthetic Ljr/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic b:Landroid/content/res/ColorStateList;

.field public final synthetic c:Landroid/content/res/ColorStateList;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/a0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p2, p0, Ljr/a0;->b:Landroid/content/res/ColorStateList;

    iput-object p3, p0, Ljr/a0;->c:Landroid/content/res/ColorStateList;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 12

    iget-object v0, p0, Ljr/a0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Ljr/a0;->b:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Ljr/a0;->c:Landroid/content/res/ColorStateList;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    invoke-static/range {v0 .. v11}, Ljr/d0;->g(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V

    return-void
.end method
