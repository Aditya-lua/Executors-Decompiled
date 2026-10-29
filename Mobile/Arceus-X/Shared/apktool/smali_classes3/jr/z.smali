.class public final synthetic Ljr/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic b:I

.field public final synthetic c:Landroid/content/res/ColorStateList;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/z;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput p2, p0, Ljr/z;->b:I

    iput-object p3, p0, Ljr/z;->c:Landroid/content/res/ColorStateList;

    iput p4, p0, Ljr/z;->d:I

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 13

    iget-object v0, p0, Ljr/z;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget v1, p0, Ljr/z;->b:I

    iget-object v2, p0, Ljr/z;->c:Landroid/content/res/ColorStateList;

    iget v3, p0, Ljr/z;->d:I

    move-object v4, p1

    move v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    invoke-static/range {v0 .. v12}, Ljr/d0;->a(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;ILandroid/view/View;IIIIIIII)V

    return-void
.end method
