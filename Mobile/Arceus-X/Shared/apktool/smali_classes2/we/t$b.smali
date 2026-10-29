.class public final Lwe/t$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lwe/t$c;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lwe/r;

.field public c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwe/t$b;->a:Ljava/util/ArrayList;

    sget-object v0, Lwe/r;->b:Lwe/r;

    iput-object v0, p0, Lwe/t$b;->b:Lwe/r;

    const/4 v0, 0x0

    iput-object v0, p0, Lwe/t$b;->c:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public a(Lpe/n;ILjava/lang/String;Ljava/lang/String;)Lwe/t$b;
    .locals 7

    iget-object v0, p0, Lwe/t$b;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    new-instance v1, Lwe/t$c;

    const/4 v6, 0x0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lwe/t$c;-><init>(Lpe/n;ILjava/lang/String;Ljava/lang/String;Lwe/t$a;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "addEntry cannot be called after build()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Lwe/t;
    .locals 5

    iget-object v0, p0, Lwe/t$b;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lwe/t$b;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lwe/t$b;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "primary key ID is not present in entries"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lwe/t;

    iget-object v1, p0, Lwe/t$b;->b:Lwe/r;

    iget-object v2, p0, Lwe/t$b;->a:Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lwe/t$b;->c:Ljava/lang/Integer;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lwe/t;-><init>(Lwe/r;Ljava/util/List;Ljava/lang/Integer;Lwe/t$a;)V

    iput-object v4, p0, Lwe/t$b;->a:Ljava/util/ArrayList;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot call build() twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(I)Z
    .locals 5

    iget-object v0, p0, Lwe/t$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lwe/t$c;

    invoke-virtual {v4}, Lwe/t$c;->a()I

    move-result v4

    if-ne v4, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method

.method public d(Lwe/r;)Lwe/t$b;
    .locals 1

    iget-object v0, p0, Lwe/t$b;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lwe/t$b;->b:Lwe/r;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setAnnotations cannot be called after build()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(I)Lwe/t$b;
    .locals 1

    iget-object v0, p0, Lwe/t$b;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lwe/t$b;->c:Ljava/lang/Integer;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setPrimaryKeyId cannot be called after build()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
