.class public final synthetic Ljr/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput p2, p0, Ljr/x;->b:I

    iput p3, p0, Ljr/x;->c:I

    iput p4, p0, Ljr/x;->d:I

    iput p5, p0, Ljr/x;->e:I

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 14

    iget-object v0, p0, Ljr/x;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget v1, p0, Ljr/x;->b:I

    iget v2, p0, Ljr/x;->c:I

    iget v3, p0, Ljr/x;->d:I

    iget v4, p0, Ljr/x;->e:I

    move-object v5, p1

    move/from16 v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    move/from16 v11, p7

    move/from16 v12, p8

    move/from16 v13, p9

    invoke-static/range {v0 .. v13}, Ljr/d0;->b(Lcom/google/android/material/textfield/TextInputLayout;IIIILandroid/view/View;IIIIIIII)V

    return-void
.end method
