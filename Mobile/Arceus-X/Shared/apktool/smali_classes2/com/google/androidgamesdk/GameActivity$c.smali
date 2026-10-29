.class public Lcom/google/androidgamesdk/GameActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/androidgamesdk/GameActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/androidgamesdk/GameActivity;


# direct methods
.method public constructor <init>(Lcom/google/androidgamesdk/GameActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/androidgamesdk/GameActivity$c;->a:Lcom/google/androidgamesdk/GameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p1, p0, Lcom/google/androidgamesdk/GameActivity$c;->a:Lcom/google/androidgamesdk/GameActivity;

    invoke-virtual {p1, p2}, Lcom/google/androidgamesdk/GameActivity;->N1(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
