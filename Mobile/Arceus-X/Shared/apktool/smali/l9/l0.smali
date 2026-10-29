.class public final Ll9/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll9/b;

.field public final b:Lcom/google/android/gms/common/Feature;


# direct methods
.method public synthetic constructor <init>(Ll9/b;Lcom/google/android/gms/common/Feature;Ll9/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/l0;->a:Ll9/b;

    iput-object p2, p0, Ll9/l0;->b:Lcom/google/android/gms/common/Feature;

    return-void
.end method

.method public static bridge synthetic a(Ll9/l0;)Lcom/google/android/gms/common/Feature;
    .locals 0

    iget-object p0, p0, Ll9/l0;->b:Lcom/google/android/gms/common/Feature;

    return-object p0
.end method

.method public static bridge synthetic b(Ll9/l0;)Ll9/b;
    .locals 0

    iget-object p0, p0, Ll9/l0;->a:Ll9/b;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Ll9/l0;

    if-eqz v1, :cond_0

    check-cast p1, Ll9/l0;

    iget-object v1, p0, Ll9/l0;->a:Ll9/b;

    iget-object v2, p1, Ll9/l0;->a:Ll9/b;

    invoke-static {v1, v2}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll9/l0;->b:Lcom/google/android/gms/common/Feature;

    iget-object p1, p1, Ll9/l0;->b:Lcom/google/android/gms/common/Feature;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ll9/l0;->a:Ll9/b;

    iget-object v1, p0, Ll9/l0;->b:Lcom/google/android/gms/common/Feature;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ln9/k;->d(Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "key"

    iget-object v2, p0, Ll9/l0;->a:Ll9/b;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    const-string v1, "feature"

    iget-object v2, p0, Ll9/l0;->b:Lcom/google/android/gms/common/Feature;

    invoke-virtual {v0, v1, v2}, Ln9/k$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ln9/k$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/k$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
