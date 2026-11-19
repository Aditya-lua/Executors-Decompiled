.class public final Ltw/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lsw/h<",
        "TT;",
        "Lmv/g0;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lmv/b0;


# instance fields
.field public final a:Llg/f;

.field public final b:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lmv/b0;->e(Ljava/lang/String;)Lmv/b0;

    move-result-object v0

    sput-object v0, Ltw/b;->d:Lmv/b0;

    return-void
.end method

.method public constructor <init>(Llg/f;Llg/a0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/f;",
            "Llg/a0<",
            "TT;>;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltw/b;->a:Llg/f;

    iput-object p2, p0, Ltw/b;->b:Llg/a0;

    iput-boolean p3, p0, Ltw/b;->c:Z

    return-void
.end method

.method public static c(Lew/f;Llg/f;Llg/a0;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lew/f;",
            "Llg/f;",
            "Llg/a0<",
            "TT;>;TT;)V"
        }
    .end annotation

    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-interface {p0}, Lew/f;->q3()Ljava/io/OutputStream;

    move-result-object p0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-virtual {p1, v0}, Llg/f;->q(Ljava/io/Writer;)Ltg/c;

    move-result-object p0

    invoke-virtual {p2, p0, p3}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ltg/c;->close()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ltw/b;->b(Ljava/lang/Object;)Lmv/g0;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Lmv/g0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lmv/g0;"
        }
    .end annotation

    iget-boolean v0, p0, Ltw/b;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ltw/d;

    iget-object v1, p0, Ltw/b;->a:Llg/f;

    iget-object v2, p0, Ltw/b;->b:Llg/a0;

    invoke-direct {v0, v1, v2, p1}, Ltw/d;-><init>(Llg/f;Llg/a0;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Lew/e;

    invoke-direct {v0}, Lew/e;-><init>()V

    iget-object v1, p0, Ltw/b;->a:Llg/f;

    iget-object v2, p0, Ltw/b;->b:Llg/a0;

    invoke-static {v0, v1, v2, p1}, Ltw/b;->c(Lew/f;Llg/f;Llg/a0;Ljava/lang/Object;)V

    sget-object p1, Ltw/b;->d:Lmv/b0;

    invoke-virtual {v0}, Lew/e;->J2()Lew/h;

    move-result-object v0

    invoke-static {p1, v0}, Lmv/g0;->c(Lmv/b0;Lew/h;)Lmv/g0;

    move-result-object p1

    return-object p1
.end method
