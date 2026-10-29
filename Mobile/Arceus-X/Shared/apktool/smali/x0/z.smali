.class public Lx0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/Surface;",
            "Lz0/g;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/Thread;

.field public d:Landroid/opengl/EGLDisplay;

.field public e:Landroid/opengl/EGLContext;

.field public f:[I

.field public g:Landroid/opengl/EGLConfig;

.field public h:Landroid/opengl/EGLSurface;

.field public i:Landroid/view/Surface;

.field public j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lz0/d$e;",
            "Lz0/d$f;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lz0/d$f;

.field public l:Lz0/d$e;

.field public m:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx0/z;->b:Ljava/util/Map;

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    iput-object v0, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    iput-object v0, p0, Lx0/z;->e:Landroid/opengl/EGLContext;

    sget-object v0, Lz0/d;->a:[I

    iput-object v0, p0, Lx0/z;->f:[I

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    iput-object v0, p0, Lx0/z;->h:Landroid/opengl/EGLSurface;

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Lx0/z;->j:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, Lx0/z;->k:Lz0/d$f;

    sget-object v0, Lz0/d$e;->a:Lz0/d$e;

    iput-object v0, p0, Lx0/z;->l:Lz0/d$e;

    const/4 v0, -0x1

    iput v0, p0, Lx0/z;->m:I

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const-string v0, "glActiveTexture"

    invoke-static {v0}, Lz0/d;->g(Ljava/lang/String;)V

    const v0, 0x8d65

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const-string p1, "glBindTexture"

    invoke-static {p1}, Lz0/d;->g(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lg0/k0;Lz0/e$a;)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v3

    iput-object v3, v0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    const/4 v3, 0x2

    new-array v4, v3, [I

    iget-object v5, v0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    const/4 v6, 0x1

    invoke-static {v5, v4, v2, v4, v6}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v5

    if-eqz v5, :cond_7

    if-eqz v1, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    aget v7, v4, v2

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "."

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v4, v4, v6

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lz0/e$a;->c(Ljava/lang/String;)Lz0/e$a;

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lg0/k0;->d()Z

    move-result v1

    const/16 v4, 0x8

    if-eqz v1, :cond_1

    const/16 v1, 0xa

    move v8, v1

    goto :goto_0

    :cond_1
    move v8, v4

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lg0/k0;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    move v14, v3

    goto :goto_1

    :cond_2
    move v14, v4

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lg0/k0;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x40

    :goto_2
    move/from16 v20, v1

    goto :goto_3

    :cond_3
    const/4 v1, 0x4

    goto :goto_2

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lg0/k0;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    move/from16 v22, v1

    goto :goto_4

    :cond_4
    move/from16 v22, v6

    :goto_4
    const/16 v24, 0x5

    const/16 v25, 0x3038

    const/16 v7, 0x3024

    const/16 v9, 0x3023

    const/16 v11, 0x3022

    const/16 v13, 0x3021

    const/16 v15, 0x3025

    const/16 v16, 0x0

    const/16 v17, 0x3026

    const/16 v18, 0x0

    const/16 v19, 0x3040

    const/16 v21, 0x3142

    const/16 v23, 0x3033

    move v10, v8

    move v12, v8

    filled-new-array/range {v7 .. v25}, [I

    move-result-object v27

    const/4 v1, 0x1

    new-array v4, v1, [Landroid/opengl/EGLConfig;

    new-array v5, v6, [I

    iget-object v7, v0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    const/16 v30, 0x0

    const/16 v33, 0x0

    const/16 v28, 0x0

    move/from16 v31, v1

    move-object/from16 v29, v4

    move-object/from16 v32, v5

    move-object/from16 v26, v7

    invoke-static/range {v26 .. v33}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result v1

    if-eqz v1, :cond_6

    aget-object v1, v29, v2

    invoke-virtual/range {p1 .. p1}, Lg0/k0;->d()Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v3, 0x3

    :cond_5
    const/16 v4, 0x3038

    const/16 v5, 0x3098

    filled-new-array {v5, v3, v4}, [I

    move-result-object v3

    iget-object v4, v0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v4, v1, v7, v3, v2}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v3

    const-string v4, "eglCreateContext"

    invoke-static {v4}, Lz0/d;->f(Ljava/lang/String;)V

    iput-object v1, v0, Lx0/z;->g:Landroid/opengl/EGLConfig;

    iput-object v3, v0, Lx0/z;->e:Landroid/opengl/EGLContext;

    new-array v1, v6, [I

    iget-object v4, v0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    invoke-static {v4, v3, v5, v1, v2}, Landroid/opengl/EGL14;->eglQueryContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;I[II)Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "EGLContext created, client version "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v1, v1, v2

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "OpenGlRenderer"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to find a suitable EGLConfig"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    iput-object v1, v0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to initialize EGL14"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to get EGL14 display"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public c(Landroid/view/Surface;)Lz0/g;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lx0/z;->g:Landroid/opengl/EGLConfig;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lx0/z;->f:[I

    invoke-static {v0, v1, p1, v2}, Lz0/d;->q(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/view/Surface;[I)Landroid/opengl/EGLSurface;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    invoke-static {v0, p1}, Lz0/d;->x(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-static {p1, v1, v0}, Lz0/g;->d(Landroid/opengl/EGLSurface;II)Lz0/g;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to create EGL surface: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OpenGlRenderer"

    invoke-static {v1, v0, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lx0/z;->g:Landroid/opengl/EGLConfig;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v2}, Lz0/d;->n(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;II)Landroid/opengl/EGLSurface;

    move-result-object v0

    iput-object v0, p0, Lx0/z;->h:Landroid/opengl/EGLSurface;

    return-void
.end method

.method public final e(Lg0/k0;)Lx2/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            ")",
            "Lx2/c<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, ""

    iget-object v1, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lz0/d;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v1}, Lx0/z;->b(Lg0/k0;Lz0/e$a;)V

    invoke-virtual {p0}, Lx0/z;->d()V

    iget-object p1, p0, Lx0/z;->h:Landroid/opengl/EGLSurface;

    invoke-virtual {p0, p1}, Lx0/z;->i(Landroid/opengl/EGLSurface;)V

    const/16 p1, 0x1f03

    invoke-static {p1}, Landroid/opengl/GLES20;->glGetString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    const/16 v2, 0x3055

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lx2/c;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    invoke-direct {v2, p1, v1}, Lx2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lx0/z;->l()V

    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "OpenGlRenderer"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to get GL or EGL extensions: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lx2/c;

    invoke-direct {p1, v0, v0}, Lx2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Lx0/z;->l()V

    return-object p1

    :goto_2
    invoke-virtual {p0}, Lx0/z;->l()V

    throw p1
.end method

.method public f(Landroid/view/Surface;)Lz0/g;
    .locals 2

    iget-object v0, p0, Lx0/z;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "The surface is not registered."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Lx0/z;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz0/g;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public g()I
    .locals 2

    iget-object v0, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lz0/d;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    iget-object v0, p0, Lx0/z;->c:Ljava/lang/Thread;

    invoke-static {v0}, Lz0/d;->h(Ljava/lang/Thread;)V

    iget v0, p0, Lx0/z;->m:I

    return v0
.end method

.method public h(Lg0/k0;Ljava/util/Map;)Lz0/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            "Ljava/util/Map<",
            "Lz0/d$e;",
            "Lx0/c0;",
            ">;)",
            "Lz0/e;"
        }
    .end annotation

    iget-object v0, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lz0/d;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    invoke-static {}, Lz0/e;->a()Lz0/e$a;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lg0/k0;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lx0/z;->e(Lg0/k0;)Lx2/c;

    move-result-object v1

    iget-object v2, v1, Lx2/c;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v1, v1, Lx2/c;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "GL_EXT_YUV_target"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string p1, "OpenGlRenderer"

    const-string v3, "Device does not support GL_EXT_YUV_target. Fallback to SDR."

    invoke-static {p1, v3}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lg0/k0;->d:Lg0/k0;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v1, p1}, Lz0/d;->k(Ljava/lang/String;Lg0/k0;)[I

    move-result-object v3

    iput-object v3, p0, Lx0/z;->f:[I

    invoke-virtual {v0, v2}, Lz0/e$a;->d(Ljava/lang/String;)Lz0/e$a;

    invoke-virtual {v0, v1}, Lz0/e$a;->b(Ljava/lang/String;)Lz0/e$a;

    :cond_1
    invoke-virtual {p0, p1, v0}, Lx0/z;->b(Lg0/k0;Lz0/e$a;)V

    invoke-virtual {p0}, Lx0/z;->d()V

    iget-object v1, p0, Lx0/z;->h:Landroid/opengl/EGLSurface;

    invoke-virtual {p0, v1}, Lx0/z;->i(Landroid/opengl/EGLSurface;)V

    invoke-static {}, Lz0/d;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz0/e$a;->e(Ljava/lang/String;)Lz0/e$a;

    invoke-static {p1, p2}, Lz0/d;->o(Lg0/k0;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lx0/z;->j:Ljava/util/Map;

    invoke-static {}, Lz0/d;->p()I

    move-result p1

    iput p1, p0, Lx0/z;->m:I

    invoke-virtual {p0, p1}, Lx0/z;->s(I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iput-object p1, p0, Lx0/z;->c:Ljava/lang/Thread;

    iget-object p1, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v0}, Lz0/e$a;->a()Lz0/e;

    move-result-object p1

    return-object p1

    :goto_1
    invoke-virtual {p0}, Lx0/z;->l()V

    throw p1
.end method

.method public i(Landroid/opengl/EGLSurface;)V
    .locals 2

    iget-object v0, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx0/z;->e:Landroid/opengl/EGLContext;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lx0/z;->e:Landroid/opengl/EGLContext;

    invoke-static {v0, p1, p1, v1}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "eglMakeCurrent failed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lz0/d;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    iget-object v0, p0, Lx0/z;->c:Ljava/lang/Thread;

    invoke-static {v0}, Lz0/d;->h(Ljava/lang/Thread;)V

    iget-object v0, p0, Lx0/z;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lx0/z;->b:Ljava/util/Map;

    sget-object v1, Lz0/d;->l:Lz0/g;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lx0/z;->c:Ljava/lang/Thread;

    invoke-static {v0}, Lz0/d;->h(Ljava/lang/Thread;)V

    invoke-virtual {p0}, Lx0/z;->l()V

    return-void
.end method

.method public final l()V
    .locals 5

    iget-object v0, p0, Lx0/z;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz0/d$f;

    invoke-virtual {v1}, Lz0/d$f;->b()V

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Lx0/z;->j:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, Lx0/z;->k:Lz0/d$f;

    iget-object v1, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v1, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    iget-object v1, p0, Lx0/z;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz0/g;

    invoke-virtual {v2}, Lz0/g;->a()Landroid/opengl/EGLSurface;

    move-result-object v3

    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    invoke-virtual {v2}, Lz0/g;->a()Landroid/opengl/EGLSurface;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "eglDestroySurface"

    invoke-static {v2}, Lz0/d;->e(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lx0/z;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iget-object v1, p0, Lx0/z;->h:Landroid/opengl/EGLSurface;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lx0/z;->h:Landroid/opengl/EGLSurface;

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    iput-object v1, p0, Lx0/z;->h:Landroid/opengl/EGLSurface;

    :cond_3
    iget-object v1, p0, Lx0/z;->e:Landroid/opengl/EGLContext;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lx0/z;->e:Landroid/opengl/EGLContext;

    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    iput-object v1, p0, Lx0/z;->e:Landroid/opengl/EGLContext;

    :cond_4
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    iget-object v1, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    invoke-static {v1}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    iput-object v1, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    :cond_5
    iput-object v0, p0, Lx0/z;->g:Landroid/opengl/EGLConfig;

    const/4 v1, -0x1

    iput v1, p0, Lx0/z;->m:I

    sget-object v1, Lz0/d$e;->a:Lz0/d$e;

    iput-object v1, p0, Lx0/z;->l:Lz0/d$e;

    iput-object v0, p0, Lx0/z;->i:Landroid/view/Surface;

    iput-object v0, p0, Lx0/z;->c:Ljava/lang/Thread;

    return-void
.end method

.method public m(Landroid/view/Surface;Z)V
    .locals 1

    iget-object v0, p0, Lx0/z;->i:Landroid/view/Surface;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lx0/z;->i:Landroid/view/Surface;

    iget-object v0, p0, Lx0/z;->h:Landroid/opengl/EGLSurface;

    invoke-virtual {p0, v0}, Lx0/z;->i(Landroid/opengl/EGLSurface;)V

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lx0/z;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz0/g;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lx0/z;->b:Ljava/util/Map;

    sget-object v0, Lz0/d;->l:Lz0/g;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz0/g;

    :goto_0
    if-eqz p1, :cond_2

    sget-object p2, Lz0/d;->l:Lz0/g;

    if-eq p1, p2, :cond_2

    :try_start_0
    iget-object p2, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    invoke-virtual {p1}, Lz0/g;->a()Landroid/opengl/EGLSurface;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to destroy EGL surface: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "OpenGlRenderer"

    invoke-static {v0, p2, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public n(J[FLandroid/view/Surface;)V
    .locals 4

    iget-object v0, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lz0/d;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    iget-object v0, p0, Lx0/z;->c:Ljava/lang/Thread;

    invoke-static {v0}, Lz0/d;->h(Ljava/lang/Thread;)V

    invoke-virtual {p0, p4}, Lx0/z;->f(Landroid/view/Surface;)Lz0/g;

    move-result-object v0

    sget-object v1, Lz0/d;->l:Lz0/g;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p4}, Lx0/z;->c(Landroid/view/Surface;)Lz0/g;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v1, p0, Lx0/z;->b:Ljava/util/Map;

    invoke-interface {v1, p4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lx0/z;->i:Landroid/view/Surface;

    const/4 v2, 0x0

    if-eq p4, v1, :cond_2

    invoke-virtual {v0}, Lz0/g;->a()Landroid/opengl/EGLSurface;

    move-result-object v1

    invoke-virtual {p0, v1}, Lx0/z;->i(Landroid/opengl/EGLSurface;)V

    iput-object p4, p0, Lx0/z;->i:Landroid/view/Surface;

    invoke-virtual {v0}, Lz0/g;->c()I

    move-result v1

    invoke-virtual {v0}, Lz0/g;->b()I

    move-result v3

    invoke-static {v2, v2, v1, v3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    invoke-virtual {v0}, Lz0/g;->c()I

    move-result v1

    invoke-virtual {v0}, Lz0/g;->b()I

    move-result v3

    invoke-static {v2, v2, v1, v3}, Landroid/opengl/GLES20;->glScissor(IIII)V

    :cond_2
    iget-object v1, p0, Lx0/z;->k:Lz0/d$f;

    invoke-static {v1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz0/d$f;

    instance-of v3, v1, Lz0/d$g;

    if-eqz v3, :cond_3

    check-cast v1, Lz0/d$g;

    invoke-virtual {v1, p3}, Lz0/d$g;->h([F)V

    :cond_3
    const/4 p3, 0x5

    const/4 v1, 0x4

    invoke-static {p3, v2, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    const-string p3, "glDrawArrays"

    invoke-static {p3}, Lz0/d;->g(Ljava/lang/String;)V

    iget-object p3, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    invoke-virtual {v0}, Lz0/g;->a()Landroid/opengl/EGLSurface;

    move-result-object v1

    invoke-static {p3, v1, p1, p2}, Landroid/opengl/EGLExt;->eglPresentationTimeANDROID(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;J)Z

    iget-object p1, p0, Lx0/z;->d:Landroid/opengl/EGLDisplay;

    invoke-virtual {v0}, Lz0/g;->a()Landroid/opengl/EGLSurface;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Failed to swap buffers with EGL error: 0x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "OpenGlRenderer"

    invoke-static {p2, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p4, v2}, Lx0/z;->m(Landroid/view/Surface;Z)V

    :cond_4
    :goto_0
    return-void
.end method

.method public o(Lz0/d$e;)V
    .locals 2

    iget-object v0, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lz0/d;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    iget-object v0, p0, Lx0/z;->c:Ljava/lang/Thread;

    invoke-static {v0}, Lz0/d;->h(Ljava/lang/Thread;)V

    iget-object v0, p0, Lx0/z;->l:Lz0/d$e;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lx0/z;->l:Lz0/d$e;

    iget p1, p0, Lx0/z;->m:I

    invoke-virtual {p0, p1}, Lx0/z;->s(I)V

    :cond_0
    return-void
.end method

.method public p(Landroid/util/Size;[F)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lx0/z;->q(Ljava/nio/ByteBuffer;Landroid/util/Size;[F)V

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    mul-int/lit8 p1, p1, 0x4

    invoke-static {p2, v0, p1}, Landroidx/camera/core/ImageProcessingUtil;->j(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;I)V

    return-object p2
.end method

.method public final q(Ljava/nio/ByteBuffer;Landroid/util/Size;[F)V
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getHeight()I

    move-result v3

    mul-int/2addr v2, v3

    const/4 v3, 0x4

    mul-int/2addr v2, v3

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    const-string v2, "ByteBuffer capacity is not equal to width * height * 4."

    invoke-static {v1, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v1

    const-string v2, "ByteBuffer is not direct."

    invoke-static {v1, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-static {}, Lz0/d;->u()I

    move-result v1

    const v2, 0x84c1

    invoke-static {v2}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const-string v2, "glActiveTexture"

    invoke-static {v2}, Lz0/d;->g(Ljava/lang/String;)V

    const/16 v5, 0xde1

    invoke-static {v5, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const-string v6, "glBindTexture"

    invoke-static {v6}, Lz0/d;->g(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getWidth()I

    move-result v10

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getHeight()I

    move-result v11

    const/16 v14, 0x1401

    const/4 v15, 0x0

    const/16 v7, 0xde1

    const/4 v8, 0x0

    const/16 v9, 0x1907

    const/4 v12, 0x0

    const/16 v13, 0x1907

    invoke-static/range {v7 .. v15}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    const-string v7, "glTexImage2D"

    invoke-static {v7}, Lz0/d;->g(Ljava/lang/String;)V

    const/16 v7, 0x2800

    const/16 v8, 0x2601

    invoke-static {v5, v7, v8}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v7, 0x2801

    invoke-static {v5, v7, v8}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    invoke-static {}, Lz0/d;->t()I

    move-result v7

    const v8, 0x8d40

    invoke-static {v8, v7}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const-string v9, "glBindFramebuffer"

    invoke-static {v9}, Lz0/d;->g(Ljava/lang/String;)V

    const v9, 0x8ce0

    invoke-static {v8, v9, v5, v1, v4}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    const-string v5, "glFramebufferTexture2D"

    invoke-static {v5}, Lz0/d;->g(Ljava/lang/String;)V

    const v5, 0x84c0

    invoke-static {v5}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    invoke-static {v2}, Lz0/d;->g(Ljava/lang/String;)V

    const v2, 0x8d65

    iget v5, v0, Lx0/z;->m:I

    invoke-static {v2, v5}, Landroid/opengl/GLES20;->glBindTexture(II)V

    invoke-static {v6}, Lz0/d;->g(Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, v0, Lx0/z;->i:Landroid/view/Surface;

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-static {v4, v4, v2, v5}, Landroid/opengl/GLES20;->glViewport(IIII)V

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-static {v4, v4, v2, v5}, Landroid/opengl/GLES20;->glScissor(IIII)V

    iget-object v2, v0, Lx0/z;->k:Lz0/d$f;

    invoke-static {v2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz0/d$f;

    instance-of v5, v2, Lz0/d$g;

    if-eqz v5, :cond_1

    check-cast v2, Lz0/d$g;

    move-object/from16 v5, p3

    invoke-virtual {v2, v5}, Lz0/d$g;->h([F)V

    :cond_1
    const/4 v2, 0x5

    invoke-static {v2, v4, v3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    const-string v2, "glDrawArrays"

    invoke-static {v2}, Lz0/d;->g(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getWidth()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, Landroid/util/Size;->getHeight()I

    move-result v12

    const/16 v13, 0x1908

    const/16 v14, 0x1401

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v15, p1

    invoke-static/range {v9 .. v15}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    const-string v2, "glReadPixels"

    invoke-static {v2}, Lz0/d;->g(Ljava/lang/String;)V

    invoke-static {v8, v4}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    invoke-static {v1}, Lz0/d;->s(I)V

    invoke-static {v7}, Lz0/d;->r(I)V

    iget v1, v0, Lx0/z;->m:I

    invoke-virtual {v0, v1}, Lx0/z;->a(I)V

    return-void
.end method

.method public r(Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, Lx0/z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lz0/d;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    iget-object v0, p0, Lx0/z;->c:Ljava/lang/Thread;

    invoke-static {v0}, Lz0/d;->h(Ljava/lang/Thread;)V

    invoke-virtual {p0, p1, v1}, Lx0/z;->m(Landroid/view/Surface;Z)V

    return-void
.end method

.method public s(I)V
    .locals 2

    iget-object v0, p0, Lx0/z;->j:Ljava/util/Map;

    iget-object v1, p0, Lx0/z;->l:Lz0/d$e;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz0/d$f;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lx0/z;->k:Lz0/d$f;

    if-eq v1, v0, :cond_0

    iput-object v0, p0, Lx0/z;->k:Lz0/d$f;

    invoke-virtual {v0}, Lz0/d$f;->f()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Using program for input format "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/z;->l:Lz0/d$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/z;->k:Lz0/d$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OpenGlRenderer"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0, p1}, Lx0/z;->a(I)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to configure program for input format: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/z;->l:Lz0/d$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
