.class public final Ltw/a;
.super Lsw/h$a;
.source "SourceFile"


# instance fields
.field public final a:Llg/f;

.field public final b:Z


# direct methods
.method public constructor <init>(Llg/f;Z)V
    .locals 0

    invoke-direct {p0}, Lsw/h$a;-><init>()V

    iput-object p1, p0, Ltw/a;->a:Llg/f;

    iput-boolean p2, p0, Ltw/a;->b:Z

    return-void
.end method

.method public static f()Ltw/a;
    .locals 1

    new-instance v0, Llg/f;

    invoke-direct {v0}, Llg/f;-><init>()V

    invoke-static {v0}, Ltw/a;->g(Llg/f;)Ltw/a;

    move-result-object v0

    return-object v0
.end method

.method public static g(Llg/f;)Ltw/a;
    .locals 2

    if-eqz p0, :cond_0

    new-instance v0, Ltw/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ltw/a;-><init>(Llg/f;Z)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "gson == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lsw/y;)Lsw/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lsw/y;",
            ")",
            "Lsw/h<",
            "*",
            "Lmv/g0;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Ltw/a;->a:Llg/f;

    invoke-static {p1}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object p1

    new-instance p2, Ltw/b;

    iget-object p3, p0, Ltw/a;->a:Llg/f;

    iget-boolean p4, p0, Ltw/a;->b:Z

    invoke-direct {p2, p3, p1, p4}, Ltw/b;-><init>(Llg/f;Llg/a0;Z)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lsw/y;)Lsw/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lsw/y;",
            ")",
            "Lsw/h<",
            "Lmv/i0;",
            "*>;"
        }
    .end annotation

    iget-object p2, p0, Ltw/a;->a:Llg/f;

    invoke-static {p1}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Llg/f;->m(Lsg/a;)Llg/a0;

    move-result-object p1

    new-instance p2, Ltw/c;

    iget-object p3, p0, Ltw/a;->a:Llg/f;

    invoke-direct {p2, p3, p1}, Ltw/c;-><init>(Llg/f;Llg/a0;)V

    return-object p2
.end method
