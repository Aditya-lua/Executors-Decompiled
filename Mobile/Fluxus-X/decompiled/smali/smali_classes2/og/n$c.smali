.class public final Log/n$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lsg/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsg/a<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Z

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Llg/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/t<",
            "*>;"
        }
    .end annotation
.end field

.field public final e:Llg/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/k<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lsg/a;ZLjava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lsg/a<",
            "*>;Z",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    instance-of v0, p1, Llg/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llg/t;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Log/n$c;->d:Llg/t;

    instance-of v2, p1, Llg/k;

    if-eqz v2, :cond_1

    move-object v1, p1

    check-cast v1, Llg/k;

    :cond_1
    iput-object v1, p0, Log/n$c;->e:Llg/k;

    if-nez v0, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Type adapter "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must implement JsonSerializer or JsonDeserializer"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    iput-object p2, p0, Log/n$c;->a:Lsg/a;

    iput-boolean p3, p0, Log/n$c;->b:Z

    iput-object p4, p0, Log/n$c;->c:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public create(Llg/f;Lsg/a;)Llg/a0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Llg/f;",
            "Lsg/a<",
            "TT;>;)",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Log/n$c;->a:Lsg/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2}, Lsg/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Log/n$c;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Log/n$c;->a:Lsg/a;

    invoke-virtual {v0}, Lsg/a;->d()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Log/n$c;->c:Ljava/lang/Class;

    invoke-virtual {p2}, Lsg/a;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_3

    new-instance v1, Log/n;

    iget-object v2, p0, Log/n$c;->d:Llg/t;

    iget-object v3, p0, Log/n$c;->e:Llg/k;

    move-object v6, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Log/n;-><init>(Llg/t;Llg/k;Llg/f;Lsg/a;Llg/b0;)V

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
