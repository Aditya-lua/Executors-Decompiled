.class public final Lfb/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/a$d;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lfb/p1;->a:I

    iput-object p2, p0, Lfb/p1;->b:Ljava/lang/String;

    return-void
.end method

.method public static a()Lfb/k1;
    .locals 2

    new-instance v0, Lfb/k1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfb/k1;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, p0, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lfb/p1;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lfb/p1;

    iget v2, p0, Lfb/p1;->a:I

    iget v3, p1, Lfb/p1;->a:I

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lfb/p1;->b:Ljava/lang/String;

    iget-object p1, p1, Lfb/p1;->b:Ljava/lang/String;

    invoke-static {v2, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lfb/p1;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lfb/p1;->b:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
