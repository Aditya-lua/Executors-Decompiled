.class public final Lsw/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsw/w$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/reflect/Method;

.field public final c:Lmv/z;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Lmv/y;

.field public final g:Lmv/b0;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:[Lsw/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lsw/s<",
            "*>;"
        }
    .end annotation
.end field

.field public final l:Z


# direct methods
.method public constructor <init>(Lsw/w$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lsw/w$a;->b:Ljava/lang/Class;

    iput-object v0, p0, Lsw/w;->a:Ljava/lang/Class;

    iget-object v0, p1, Lsw/w$a;->c:Ljava/lang/reflect/Method;

    iput-object v0, p0, Lsw/w;->b:Ljava/lang/reflect/Method;

    iget-object v0, p1, Lsw/w$a;->a:Lsw/y;

    iget-object v0, v0, Lsw/y;->c:Lmv/z;

    iput-object v0, p0, Lsw/w;->c:Lmv/z;

    iget-object v0, p1, Lsw/w$a;->o:Ljava/lang/String;

    iput-object v0, p0, Lsw/w;->d:Ljava/lang/String;

    iget-object v0, p1, Lsw/w$a;->s:Ljava/lang/String;

    iput-object v0, p0, Lsw/w;->e:Ljava/lang/String;

    iget-object v0, p1, Lsw/w$a;->t:Lmv/y;

    iput-object v0, p0, Lsw/w;->f:Lmv/y;

    iget-object v0, p1, Lsw/w$a;->u:Lmv/b0;

    iput-object v0, p0, Lsw/w;->g:Lmv/b0;

    iget-boolean v0, p1, Lsw/w$a;->p:Z

    iput-boolean v0, p0, Lsw/w;->h:Z

    iget-boolean v0, p1, Lsw/w$a;->q:Z

    iput-boolean v0, p0, Lsw/w;->i:Z

    iget-boolean v0, p1, Lsw/w$a;->r:Z

    iput-boolean v0, p0, Lsw/w;->j:Z

    iget-object v0, p1, Lsw/w$a;->w:[Lsw/s;

    iput-object v0, p0, Lsw/w;->k:[Lsw/s;

    iget-boolean p1, p1, Lsw/w$a;->x:Z

    iput-boolean p1, p0, Lsw/w;->l:Z

    return-void
.end method

.method public static b(Lsw/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lsw/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/y;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lsw/w;"
        }
    .end annotation

    new-instance v0, Lsw/w$a;

    invoke-direct {v0, p0, p1, p2}, Lsw/w$a;-><init>(Lsw/y;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    invoke-virtual {v0}, Lsw/w$a;->b()Lsw/w;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;[Ljava/lang/Object;)Lmv/f0;
    .locals 12

    iget-object v0, p0, Lsw/w;->k:[Lsw/s;

    array-length v1, p2

    array-length v2, v0

    if-ne v1, v2, :cond_2

    new-instance v3, Lsw/v;

    iget-object v4, p0, Lsw/w;->d:Ljava/lang/String;

    iget-object v5, p0, Lsw/w;->c:Lmv/z;

    iget-object v6, p0, Lsw/w;->e:Ljava/lang/String;

    iget-object v7, p0, Lsw/w;->f:Lmv/y;

    iget-object v8, p0, Lsw/w;->g:Lmv/b0;

    iget-boolean v9, p0, Lsw/w;->h:Z

    iget-boolean v10, p0, Lsw/w;->i:Z

    iget-boolean v11, p0, Lsw/w;->j:Z

    invoke-direct/range {v3 .. v11}, Lsw/v;-><init>(Ljava/lang/String;Lmv/z;Ljava/lang/String;Lmv/y;Lmv/b0;ZZZ)V

    iget-boolean v2, p0, Lsw/w;->l:Z

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v5, p2, v4

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    aget-object v5, v0, v4

    aget-object v6, p2, v4

    invoke-virtual {v5, v3, v6}, Lsw/s;->a(Lsw/v;Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lsw/v;->k()Lmv/f0$a;

    move-result-object p2

    new-instance v0, Lsw/o;

    iget-object v1, p0, Lsw/w;->a:Ljava/lang/Class;

    iget-object v3, p0, Lsw/w;->b:Ljava/lang/reflect/Method;

    invoke-direct {v0, v1, p1, v3, v2}, Lsw/o;-><init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/List;)V

    const-class p1, Lsw/o;

    invoke-virtual {p2, p1, v0}, Lmv/f0$a;->r(Ljava/lang/Class;Ljava/lang/Object;)Lmv/f0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Argument count ("

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") doesn\'t match expected count ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
