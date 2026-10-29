.class public Lcom/axjava/JNIFunctions/CustomGLSurfaceView;
.super Landroid/opengl/GLSurfaceView;
.source ""


# instance fields
.field private inputConnection:Landroid/view/inputmethod/BaseInputConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .line 15
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 16
    const-string v0, "sss"

    const-string v1, "dieieuer3 "

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    return-void
.end method


# virtual methods
.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3
    .param p1, "outAttrs"    # Landroid/view/inputmethod/EditorInfo;

    .line 21
    iget-object v0, p0, Lcom/axjava/JNIFunctions/CustomGLSurfaceView;->inputConnection:Landroid/view/inputmethod/BaseInputConnection;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lcom/axjava/JNIFunctions/CustomGLSurfaceView$a;

    invoke-direct {v0, p0, p0, v1}, Lcom/axjava/JNIFunctions/CustomGLSurfaceView$a;-><init>(Lcom/axjava/JNIFunctions/CustomGLSurfaceView;Landroid/view/View;Z)V

    iput-object v0, p0, Lcom/axjava/JNIFunctions/CustomGLSurfaceView;->inputConnection:Landroid/view/inputmethod/BaseInputConnection;

    .line 31
    :cond_0
    const-string v0, "sss"

    const-string v2, "dieieuer"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    const/4 v0, 0x0

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->actionLabel:Ljava/lang/CharSequence;

    .line 33
    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 34
    const/4 v0, 0x6

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 35
    iget-object v0, p0, Lcom/axjava/JNIFunctions/CustomGLSurfaceView;->inputConnection:Landroid/view/inputmethod/BaseInputConnection;

    return-object v0
.end method
