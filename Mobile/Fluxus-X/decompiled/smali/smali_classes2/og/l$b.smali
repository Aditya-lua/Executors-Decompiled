.class public Log/l$b;
.super Log/l$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Log/l;->c(Llg/f;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/String;Lsg/a;ZZ)Log/l$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/reflect/Method;

.field public final synthetic f:Llg/a0;

.field public final synthetic g:Llg/a0;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Log/l;


# direct methods
.method public constructor <init>(Log/l;Ljava/lang/String;Ljava/lang/reflect/Field;ZLjava/lang/reflect/Method;Llg/a0;Llg/a0;ZZ)V
    .locals 0

    iput-object p1, p0, Log/l$b;->j:Log/l;

    iput-boolean p4, p0, Log/l$b;->d:Z

    iput-object p5, p0, Log/l$b;->e:Ljava/lang/reflect/Method;

    iput-object p6, p0, Log/l$b;->f:Llg/a0;

    iput-object p7, p0, Log/l$b;->g:Llg/a0;

    iput-boolean p8, p0, Log/l$b;->h:Z

    iput-boolean p9, p0, Log/l$b;->i:Z

    invoke-direct {p0, p2, p3}, Log/l$d;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-void
.end method


# virtual methods
.method public a(Ltg/a;I[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Log/l$b;->g:Llg/a0;

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-boolean v1, p0, Log/l$b;->h:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Llg/p;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "null is not allowed as value for record component \'"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Log/l$d;->c:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' of primitive type; at path "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ltg/a;->x()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Llg/p;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    aput-object v0, p3, p2

    return-void
.end method

.method public b(Ltg/a;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Log/l$b;->g:Llg/a0;

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    iget-boolean v0, p0, Log/l$b;->h:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-boolean v0, p0, Log/l$b;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Log/l$d;->b:Ljava/lang/reflect/Field;

    invoke-static {p2, v0}, Log/l;->a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_1

    :cond_2
    iget-boolean v0, p0, Log/l$b;->i:Z

    if-nez v0, :cond_3

    :goto_1
    iget-object v0, p0, Log/l$d;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p1, p0, Log/l$d;->b:Ljava/lang/reflect/Field;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lqg/a;->g(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Llg/m;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot set value of \'static final\' "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Llg/m;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public c(Ltg/c;Ljava/lang/Object;)V
    .locals 3

    iget-boolean v0, p0, Log/l$b;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Log/l$b;->e:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    iget-object v0, p0, Log/l$d;->b:Ljava/lang/reflect/Field;

    invoke-static {p2, v0}, Log/l;->a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_0

    :cond_0
    invoke-static {p2, v0}, Log/l;->a(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Log/l$b;->e:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Log/l$b;->e:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lqg/a;->g(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Llg/m;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Accessor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " threw exception"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Llg/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    iget-object v0, p0, Log/l$d;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    if-ne v0, p2, :cond_3

    return-void

    :cond_3
    iget-object p2, p0, Log/l$d;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    iget-object p2, p0, Log/l$b;->f:Llg/a0;

    invoke-virtual {p2, p1, v0}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void
.end method
