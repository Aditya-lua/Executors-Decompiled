.class public Luk/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luk/d$a;
    }
.end annotation


# static fields
.field public static a:Luk/d$a;


# direct methods
.method public static a()Z
    .locals 1

    sget-object v0, Luk/d;->a:Luk/d$a;

    invoke-interface {v0}, Luk/d$a;->b()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Luk/d;->a:Luk/d$a;

    invoke-interface {v0}, Luk/d$a;->a()Z

    move-result v0

    return v0
.end method

.method public static c(Luk/d$a;)V
    .locals 0

    sput-object p0, Luk/d;->a:Luk/d$a;

    return-void
.end method
