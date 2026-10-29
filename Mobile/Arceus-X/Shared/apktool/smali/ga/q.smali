.class public final Lga/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lga/q;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lga/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lga/p;-><init>([B)V

    new-instance v1, Lga/q;

    invoke-direct {v1, v0}, Lga/q;-><init>(Lga/p;)V

    sput-object v1, Lga/q;->d:Lga/q;

    return-void
.end method

.method public constructor <init>(Lga/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lga/p;->e()Z

    move-result v0

    iput-boolean v0, p0, Lga/q;->a:Z

    invoke-virtual {p1}, Lga/p;->f()Z

    move-result v0

    iput-boolean v0, p0, Lga/q;->b:Z

    invoke-virtual {p1}, Lga/p;->g()Z

    move-result p1

    iput-boolean p1, p0, Lga/q;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lga/p;[B)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lga/q;-><init>(Lga/p;)V

    return-void
.end method

.method public static d()Lga/p;
    .locals 2

    new-instance v0, Lga/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lga/p;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lga/q;->a:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lga/q;->b:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lga/q;->c:Z

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lga/q;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lga/q;

    iget-boolean v2, p0, Lga/q;->a:Z

    iget-boolean v3, p1, Lga/q;->a:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lga/q;->b:Z

    iget-boolean v3, p1, Lga/q;->b:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lga/q;->c:Z

    iget-boolean p1, p1, Lga/q;->c:Z

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Lga/q;->a:Z

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lga/q;->b:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lga/q;->c:Z

    add-int/2addr v0, v1

    return v0
.end method
