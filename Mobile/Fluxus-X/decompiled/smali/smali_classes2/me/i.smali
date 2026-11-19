.class public final Lme/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/i$b;,
        Lme/i$c;
    }
.end annotation


# static fields
.field public static final a:Lle/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lle/a<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lme/i$a;

    invoke-direct {v0}, Lme/i$a;-><init>()V

    sput-object v0, Lme/i;->a:Lle/a;

    return-void
.end method

.method public static varargs a(Ljava/io/File;[Lme/g;)Lme/b;
    .locals 2

    new-instance v0, Lme/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lme/i$b;-><init>(Ljava/io/File;[Lme/g;Lme/h;)V

    return-object v0
.end method

.method public static b(Ljava/io/File;)Lme/c;
    .locals 2

    new-instance v0, Lme/i$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lme/i$c;-><init>(Ljava/io/File;Lme/h;)V

    return-object v0
.end method

.method public static c(Ljava/io/File;Ljava/io/File;)V
    .locals 2

    invoke-virtual {p0, p1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Source %s and destination %s must be different"

    invoke-static {v0, v1, p0, p1}, Lje/n;->i(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lme/i;->b(Ljava/io/File;)Lme/c;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Lme/g;

    invoke-static {p1, v0}, Lme/i;->a(Ljava/io/File;[Lme/g;)Lme/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lme/c;->a(Lme/b;)J

    return-void
.end method

.method public static d(Ljava/io/File;)V
    .locals 3

    invoke-static {p0}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x27

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unable to create parent directories of "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(Ljava/io/File;Ljava/io/File;)V
    .locals 3

    invoke-static {p0}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Source %s and destination %s must be different"

    invoke-static {v0, v1, p0, p1}, Lje/n;->i(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0, p1}, Lme/i;->c(Ljava/io/File;Ljava/io/File;)V

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    const-string v1, "Unable to delete "

    if-nez v0, :cond_0

    new-instance p0, Ljava/io/IOException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x11

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x11

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public static f([BLjava/io/File;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lme/g;

    invoke-static {p1, v0}, Lme/i;->a(Ljava/io/File;[Lme/g;)Lme/b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lme/b;->b([B)V

    return-void
.end method
