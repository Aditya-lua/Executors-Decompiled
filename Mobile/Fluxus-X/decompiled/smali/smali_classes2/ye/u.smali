.class public final Lye/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/u$b;
    }
.end annotation


# static fields
.field public static final a:Lye/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lye/u$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lye/u$b;-><init>(Lye/u$a;)V

    sput-object v0, Lye/u;->a:Lye/s$a;

    return-void
.end method

.method public static a(Lye/j0;)Lye/t;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lye/j0<",
            "TP;>;)",
            "Lye/t;"
        }
    .end annotation

    invoke-static {}, Lye/t;->a()Lye/t$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/j0;->c()Lye/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/t$b;->d(Lye/r;)Lye/t$b;

    invoke-virtual {p0}, Lye/j0;->b()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lye/j0$c;

    invoke-virtual {v3}, Lye/j0$c;->g()Lcf/g0;

    move-result-object v4

    invoke-static {v4}, Lye/u;->c(Lcf/g0;)Lre/n;

    move-result-object v4

    invoke-virtual {v3}, Lye/j0$c;->c()I

    move-result v5

    invoke-virtual {v3}, Lye/j0$c;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lye/u;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lye/j0$c;->f()Lcf/p0;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v5, v6, v3}, Lye/t$b;->a(Lre/n;ILjava/lang/String;Ljava/lang/String;)Lye/t$b;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lye/j0;->d()Lye/j0$c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lye/j0;->d()Lye/j0$c;

    move-result-object p0

    invoke-virtual {p0}, Lye/j0$c;->c()I

    move-result p0

    invoke-virtual {v0, p0}, Lye/t$b;->e(I)Lye/t$b;

    :cond_2
    :try_start_0
    invoke-virtual {v0}, Lye/t$b;->b()Lye/t;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto."

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lcf/g0;)Lre/n;
    .locals 1

    sget-object v0, Lye/u$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lre/n;->d:Lre/n;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lre/n;->c:Lre/n;

    return-object p0

    :cond_2
    sget-object p0, Lre/n;->b:Lre/n;

    return-object p0
.end method
