.class public final Ln9/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/content/ComponentName;

.field public final d:I

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Ln9/e1;->a:Ljava/lang/String;

    invoke-static {p2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p2, p0, Ln9/e1;->b:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Ln9/e1;->c:Landroid/content/ComponentName;

    const/16 p1, 0x1081

    iput p1, p0, Ln9/e1;->d:I

    iput-boolean p4, p0, Ln9/e1;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln9/e1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln9/e1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Ln9/e1;->c:Landroid/content/ComponentName;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Ln9/e1;->e:Z

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln9/e1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ln9/e1;

    iget-object v1, p0, Ln9/e1;->a:Ljava/lang/String;

    iget-object v3, p1, Ln9/e1;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln9/e1;->b:Ljava/lang/String;

    iget-object v3, p1, Ln9/e1;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln9/e1;->c:Landroid/content/ComponentName;

    iget-object v3, p1, Ln9/e1;->c:Landroid/content/ComponentName;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Ln9/e1;->e:Z

    iget-boolean p1, p1, Ln9/e1;->e:Z

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Ln9/e1;->a:Ljava/lang/String;

    iget-object v1, p0, Ln9/e1;->b:Ljava/lang/String;

    iget-object v2, p0, Ln9/e1;->c:Landroid/content/ComponentName;

    const/16 v3, 0x1081

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-boolean v4, p0, Ln9/e1;->e:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln9/e1;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Ln9/e1;->c:Landroid/content/ComponentName;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
