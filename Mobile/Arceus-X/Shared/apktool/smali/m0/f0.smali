.class public Lm0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/f0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx0/a0<",
        "Lm0/f0$a;",
        "Lg0/f1$i;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/io/File;[B)V
    .locals 2

    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance p0, Lv0/c;

    invoke-direct {p0}, Lv0/c;-><init>()V

    invoke-virtual {p0, p1}, Lv0/c;->b([B)I

    move-result p0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p0}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p0

    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, Lg0/h1;

    const/4 v0, 0x1

    const-string v1, "Failed to write to temp file"

    invoke-direct {p1, v0, v1, p0}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public a(Lm0/f0$a;)Lg0/f1$i;
    .locals 3

    invoke-virtual {p1}, Lm0/f0$a;->b()Lx0/b0;

    move-result-object v0

    invoke-virtual {p1}, Lm0/f0$a;->a()Lg0/f1$h;

    move-result-object p1

    invoke-static {p1}, Lm0/z;->e(Lg0/f1$h;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v1, v2}, Lm0/f0;->b(Ljava/io/File;[B)V

    invoke-virtual {v0}, Lx0/b0;->d()Lp0/g;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lx0/b0;->f()I

    move-result v0

    invoke-static {v1, v2, p1, v0}, Lm0/z;->l(Ljava/io/File;Lp0/g;Lg0/f1$h;I)V

    invoke-static {v1, p1}, Lm0/z;->j(Ljava/io/File;Lg0/f1$h;)Landroid/net/Uri;

    move-result-object p1

    new-instance v0, Lg0/f1$i;

    const/16 v1, 0x100

    invoke-direct {v0, p1, v1}, Lg0/f1$i;-><init>(Landroid/net/Uri;I)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/f0$a;

    invoke-virtual {p0, p1}, Lm0/f0;->a(Lm0/f0$a;)Lg0/f1$i;

    move-result-object p1

    return-object p1
.end method
