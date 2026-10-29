.class public Lon/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lon/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsn/c;)Lsn/g;
    .locals 6

    invoke-interface {p1}, Lsn/c;->a()Lsn/i;

    move-result-object p1

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    const/16 v1, 0x60

    invoke-virtual {p1, v1}, Lsn/i;->g(C)I

    move-result v2

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object v3

    :cond_0
    invoke-virtual {p1, v1}, Lsn/i;->b(C)I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object v4

    invoke-virtual {p1, v1}, Lsn/i;->g(C)I

    move-result v5

    if-ne v5, v2, :cond_0

    new-instance v0, Lqn/d;

    invoke-direct {v0}, Lqn/d;-><init>()V

    invoke-virtual {p1, v3, v4}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v1

    invoke-virtual {v1}, Lrn/j;->c()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    const/16 v3, 0x20

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x3

    if-lt v2, v4, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v3, :cond_1

    invoke-static {v1}, Lvn/d;->c(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v4

    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Lqn/d;->p(Ljava/lang/String;)V

    invoke-virtual {p1}, Lsn/i;->o()Lsn/h;

    move-result-object p1

    invoke-static {v0, p1}, Lsn/g;->b(Lqn/s;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1, v0, v3}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p1

    new-instance v0, Lqn/b0;

    invoke-virtual {p1}, Lrn/j;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lqn/b0;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lsn/g;->b(Lqn/s;Lsn/h;)Lsn/g;

    move-result-object p1

    return-object p1
.end method
