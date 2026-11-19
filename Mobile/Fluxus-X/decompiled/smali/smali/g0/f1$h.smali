.class public final Lg0/f1$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/f1$h$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Landroid/content/ContentResolver;

.field public final c:Landroid/net/Uri;

.field public final d:Landroid/content/ContentValues;

.field public final e:Ljava/io/OutputStream;

.field public final f:Lg0/f1$e;


# direct methods
.method public constructor <init>(Ljava/io/File;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/io/OutputStream;Lg0/f1$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/f1$h;->a:Ljava/io/File;

    iput-object p2, p0, Lg0/f1$h;->b:Landroid/content/ContentResolver;

    iput-object p3, p0, Lg0/f1$h;->c:Landroid/net/Uri;

    iput-object p4, p0, Lg0/f1$h;->d:Landroid/content/ContentValues;

    iput-object p5, p0, Lg0/f1$h;->e:Ljava/io/OutputStream;

    if-nez p6, :cond_0

    new-instance p6, Lg0/f1$e;

    invoke-direct {p6}, Lg0/f1$e;-><init>()V

    :cond_0
    iput-object p6, p0, Lg0/f1$h;->f:Lg0/f1$e;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/ContentResolver;
    .locals 1

    iget-object v0, p0, Lg0/f1$h;->b:Landroid/content/ContentResolver;

    return-object v0
.end method

.method public b()Landroid/content/ContentValues;
    .locals 1

    iget-object v0, p0, Lg0/f1$h;->d:Landroid/content/ContentValues;

    return-object v0
.end method

.method public c()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lg0/f1$h;->a:Ljava/io/File;

    return-object v0
.end method

.method public d()Lg0/f1$e;
    .locals 1

    iget-object v0, p0, Lg0/f1$h;->f:Lg0/f1$e;

    return-object v0
.end method

.method public e()Ljava/io/OutputStream;
    .locals 1

    iget-object v0, p0, Lg0/f1$h;->e:Ljava/io/OutputStream;

    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lg0/f1$h;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OutputFileOptions{mFile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/f1$h;->a:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mContentResolver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/f1$h;->b:Landroid/content/ContentResolver;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSaveCollection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/f1$h;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mContentValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/f1$h;->d:Landroid/content/ContentValues;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mOutputStream="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/f1$h;->e:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/f1$h;->f:Lg0/f1$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
