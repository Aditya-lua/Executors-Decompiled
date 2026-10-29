.class public Lcom/google/androidgamesdk/GameActivity$d;
.super Landroid/view/SurfaceView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/androidgamesdk/GameActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

.field public final synthetic b:Lcom/google/androidgamesdk/GameActivity;


# direct methods
.method public constructor <init>(Lcom/google/androidgamesdk/GameActivity;Lcom/google/androidgamesdk/GameActivity;)V
    .locals 3

    iput-object p1, p0, Lcom/google/androidgamesdk/GameActivity$d;->b:Lcom/google/androidgamesdk/GameActivity;

    invoke-direct {p0, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/google/androidgamesdk/GameActivity;->G1()Landroid/view/inputmethod/EditorInfo;

    move-result-object p1

    new-instance v0, Lcom/google/androidgamesdk/gametextinput/InputConnection;

    new-instance v1, Lge/b;

    iget v2, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v1, p1, v2}, Lge/b;-><init>(Landroid/view/inputmethod/EditorInfo;Z)V

    invoke-direct {v0, p2, p0, v1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;-><init>(Landroid/content/Context;Landroid/view/View;Lge/b;)V

    invoke-virtual {v0, p2}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setListener(Lge/a;)Lcom/google/androidgamesdk/gametextinput/InputConnection;

    move-result-object p1

    iput-object p1, p0, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/inputmethod/EditorInfo;)Lcom/google/androidgamesdk/gametextinput/InputConnection;
    .locals 1

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    invoke-virtual {v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getSoftKeyboardActive()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    invoke-virtual {v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getEditorInfo()Landroid/view/inputmethod/EditorInfo;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/androidgamesdk/gametextinput/a;->a(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/EditorInfo;)V

    :cond_1
    iget-object p1, p0, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    return-object p1
.end method

.method public getEditorInfo()Landroid/view/inputmethod/EditorInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    invoke-virtual {v0}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->getEditorInfo()Landroid/view/inputmethod/EditorInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/androidgamesdk/GameActivity$d;->a(Landroid/view/inputmethod/EditorInfo;)Lcom/google/androidgamesdk/gametextinput/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public setEditorInfo(Landroid/view/inputmethod/EditorInfo;)V
    .locals 1

    iget-object v0, p0, Lcom/google/androidgamesdk/GameActivity$d;->a:Lcom/google/androidgamesdk/gametextinput/InputConnection;

    invoke-virtual {v0, p1}, Lcom/google/androidgamesdk/gametextinput/InputConnection;->setEditorInfo(Landroid/view/inputmethod/EditorInfo;)V

    return-void
.end method
