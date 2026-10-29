.class public Lnn/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lun/a;


# instance fields
.field public final a:C

.field public b:I

.field public c:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lun/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(C)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lnn/a0;->b:I

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lnn/a0;->c:Ljava/util/LinkedList;

    iput-char p1, p0, Lnn/a0;->a:C

    return-void
.end method


# virtual methods
.method public a(Lun/b;Lun/b;)I
    .locals 1

    invoke-interface {p1}, Lun/b;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lnn/a0;->f(I)Lun/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lun/a;->a(Lun/b;Lun/b;)I

    move-result p1

    return p1
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Lnn/a0;->a:C

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lnn/a0;->b:I

    return v0
.end method

.method public d()C
    .locals 1

    iget-char v0, p0, Lnn/a0;->a:C

    return v0
.end method

.method public e(Lun/a;)V
    .locals 5

    invoke-interface {p1}, Lun/a;->c()I

    move-result v0

    iget-object v1, p0, Lnn/a0;->c:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lun/a;

    invoke-interface {v2}, Lun/a;->c()I

    move-result v3

    if-le v0, v3, :cond_0

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    invoke-interface {v1, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eq v0, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot add two delimiter processors for char \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-char v4, p0, Lnn/a0;->a:C

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, "\' and minimum length "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "; conflicting processors: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, p0, Lnn/a0;->c:Ljava/util/LinkedList;

    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iput v0, p0, Lnn/a0;->b:I

    return-void
.end method

.method public final f(I)Lun/a;
    .locals 3

    iget-object v0, p0, Lnn/a0;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lun/a;

    invoke-interface {v1}, Lun/a;->c()I

    move-result v2

    if-gt v2, p1, :cond_0

    return-object v1

    :cond_1
    iget-object p1, p0, Lnn/a0;->c:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lun/a;

    return-object p1
.end method
