.class public final Lm9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Ll9/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ll9/a;

.field public final c:Ll9/a$d;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll9/a;Ll9/a$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/b;->b:Ll9/a;

    iput-object p2, p0, Lm9/b;->c:Ll9/a$d;

    iput-object p3, p0, Lm9/b;->d:Ljava/lang/String;

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lo9/q;->c([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lm9/b;->a:I

    return-void
.end method

.method public static a(Ll9/a;Ll9/a$d;Ljava/lang/String;)Lm9/b;
    .locals 1
    .param p0    # Ll9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O::",
            "Ll9/a$d;",
            ">(",
            "Ll9/a<",
            "TO;>;TO;",
            "Ljava/lang/String;",
            ")",
            "Lm9/b<",
            "TO;>;"
        }
    .end annotation

    new-instance v0, Lm9/b;

    invoke-direct {v0, p0, p1, p2}, Lm9/b;-><init>(Ll9/a;Ll9/a$d;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lm9/b;->b:Ll9/a;

    invoke-virtual {v0}, Ll9/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

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
    instance-of v2, p1, Lm9/b;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lm9/b;

    iget-object v2, p0, Lm9/b;->b:Ll9/a;

    iget-object v3, p1, Lm9/b;->b:Ll9/a;

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lm9/b;->c:Ll9/a$d;

    iget-object v3, p1, Lm9/b;->c:Ll9/a$d;

    invoke-static {v2, v3}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lm9/b;->d:Ljava/lang/String;

    iget-object p1, p1, Lm9/b;->d:Ljava/lang/String;

    invoke-static {v2, p1}, Lo9/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lm9/b;->a:I

    return v0
.end method
