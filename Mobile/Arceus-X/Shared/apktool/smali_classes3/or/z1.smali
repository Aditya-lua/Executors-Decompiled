.class public final synthetic Lor/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lor/a2;

.field public final synthetic b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public synthetic constructor <init>(Lor/a2;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/z1;->a:Lor/a2;

    iput-object p2, p0, Lor/z1;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lor/z1;->a:Lor/a2;

    iget-object v1, p0, Lor/z1;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v0, v1, p1}, Lor/a2;->a(Lor/a2;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V

    return-void
.end method
