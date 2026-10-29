.class public final Lwe/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/t$b;,
        Lwe/t$c;
    }
.end annotation


# instance fields
.field public final a:Lwe/r;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lwe/t$c;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lwe/r;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe/r;",
            "Ljava/util/List<",
            "Lwe/t$c;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/t;->a:Lwe/r;

    .line 4
    iput-object p2, p0, Lwe/t;->b:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lwe/t;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lwe/r;Ljava/util/List;Ljava/lang/Integer;Lwe/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lwe/t;-><init>(Lwe/r;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method public static a()Lwe/t$b;
    .locals 1

    new-instance v0, Lwe/t$b;

    invoke-direct {v0}, Lwe/t$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lwe/t;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lwe/t;

    iget-object v0, p0, Lwe/t;->a:Lwe/r;

    iget-object v2, p1, Lwe/t;->a:Lwe/r;

    invoke-virtual {v0, v2}, Lwe/r;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwe/t;->b:Ljava/util/List;

    iget-object v2, p1, Lwe/t;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwe/t;->c:Ljava/lang/Integer;

    iget-object p1, p1, Lwe/t;->c:Ljava/lang/Integer;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lwe/t;->a:Lwe/r;

    iget-object v1, p0, Lwe/t;->b:Ljava/util/List;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lwe/t;->a:Lwe/r;

    iget-object v1, p0, Lwe/t;->b:Ljava/util/List;

    iget-object v2, p0, Lwe/t;->c:Ljava/lang/Integer;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "(annotations=%s, entries=%s, primaryKeyId=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
