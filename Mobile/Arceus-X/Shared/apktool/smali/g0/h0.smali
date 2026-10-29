.class public final Lg0/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/h0$a;
    }
.end annotation


# direct methods
.method public static varargs a([Ln0/m1;)Ln0/k1;
    .locals 1

    new-instance v0, Lg0/h0$a;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lg0/h0$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Ln0/k1;
    .locals 3

    new-instance v0, Ln0/m1$a;

    invoke-direct {v0}, Ln0/m1$a;-><init>()V

    const/4 v1, 0x1

    new-array v1, v1, [Ln0/m1;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Lg0/h0;->a([Ln0/m1;)Ln0/k1;

    move-result-object v0

    return-object v0
.end method
