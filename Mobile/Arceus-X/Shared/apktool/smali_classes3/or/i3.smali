.class public final synthetic Lor/i3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/g;

.field public final synthetic b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/i3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iput-object p2, p0, Lor/i3;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 11

    iget-object v0, p0, Lor/i3;->a:Lcom/withpersona/sdk2/inquiry/ui/g;

    iget-object v1, p0, Lor/i3;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-static/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/ui/g;->e(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;IIIIIIII)V

    return-void
.end method
