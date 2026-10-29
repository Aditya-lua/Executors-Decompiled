.class public abstract Lz0/d$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v0, "glAttachShader"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, -0x1

    iput v1, p0, Lz0/d$f;->b:I

    iput v1, p0, Lz0/d$f;->c:I

    iput v1, p0, Lz0/d$f;->d:I

    const v2, 0x8b31

    :try_start_0
    invoke-static {v2, p1}, Lz0/d;->y(ILjava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_6

    const v2, 0x8b30

    :try_start_1
    invoke-static {v2, p2}, Lz0/d;->y(ILjava/lang/String;)I

    move-result p2
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4

    :try_start_2
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v2
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    const-string v3, "glCreateProgram"

    invoke-static {v3}, Lz0/d;->g(Ljava/lang/String;)V

    invoke-static {v2, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {v0}, Lz0/d;->g(Ljava/lang/String;)V

    invoke-static {v2, p2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {v0}, Lz0/d;->g(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 v0, 0x1

    new-array v3, v0, [I

    const v4, 0x8b82

    const/4 v5, 0x0

    invoke-static {v2, v4, v3, v5}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v3, v3, v5

    if-ne v3, v0, :cond_0

    iput v2, p0, Lz0/d$f;->a:I
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    invoke-direct {p0}, Lz0/d$f;->c()V

    return-void

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_4

    :cond_0
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not link program: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_2
    move-exception v0

    :goto_0
    move v2, v1

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_0

    :catch_4
    move-exception v0

    :goto_1
    move p2, v1

    :goto_2
    move v2, p2

    goto :goto_4

    :catch_5
    move-exception v0

    goto :goto_1

    :catch_6
    move-exception v0

    :goto_3
    move p1, v1

    move p2, p1

    goto :goto_2

    :catch_7
    move-exception v0

    goto :goto_3

    :goto_4
    if-eq p1, v1, :cond_1

    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    :cond_1
    if-eq p2, v1, :cond_2

    invoke-static {p2}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    :cond_2
    if-eq v2, v1, :cond_3

    invoke-static {v2}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    :cond_3
    throw v0
.end method

.method public static synthetic a(Lz0/d$f;)V
    .locals 0

    invoke-direct {p0}, Lz0/d$f;->c()V

    return-void
.end method

.method private c()V
    .locals 2

    iget v0, p0, Lz0/d$f;->a:I

    const-string v1, "aPosition"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lz0/d$f;->d:I

    invoke-static {v0, v1}, Lz0/d;->j(ILjava/lang/String;)V

    iget v0, p0, Lz0/d$f;->a:I

    const-string v1, "uTransMatrix"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lz0/d$f;->b:I

    invoke-static {v0, v1}, Lz0/d;->j(ILjava/lang/String;)V

    iget v0, p0, Lz0/d$f;->a:I

    const-string v1, "uAlphaScale"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lz0/d$f;->c:I

    invoke-static {v0, v1}, Lz0/d;->j(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget v0, p0, Lz0/d$f;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    return-void
.end method

.method public d(F)V
    .locals 1

    iget v0, p0, Lz0/d$f;->c:I

    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    const-string p1, "glUniform1f"

    invoke-static {p1}, Lz0/d;->g(Ljava/lang/String;)V

    return-void
.end method

.method public e([F)V
    .locals 3

    iget v0, p0, Lz0/d$f;->b:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const-string p1, "glUniformMatrix4fv"

    invoke-static {p1}, Lz0/d;->g(Ljava/lang/String;)V

    return-void
.end method

.method public f()V
    .locals 7

    iget v0, p0, Lz0/d$f;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    const-string v0, "glUseProgram"

    invoke-static {v0}, Lz0/d;->g(Ljava/lang/String;)V

    iget v0, p0, Lz0/d$f;->d:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    const-string v0, "glEnableVertexAttribArray"

    invoke-static {v0}, Lz0/d;->g(Ljava/lang/String;)V

    iget v1, p0, Lz0/d$f;->d:I

    const/4 v4, 0x0

    sget-object v6, Lz0/d;->i:Ljava/nio/FloatBuffer;

    const/4 v2, 0x2

    const/16 v3, 0x1406

    const/4 v5, 0x0

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    const-string v0, "glVertexAttribPointer"

    invoke-static {v0}, Lz0/d;->g(Ljava/lang/String;)V

    invoke-static {}, Lz0/d;->l()[F

    move-result-object v0

    invoke-virtual {p0, v0}, Lz0/d$f;->e([F)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lz0/d$f;->d(F)V

    return-void
.end method
