.class public Lmk/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmk/d$a;
    }
.end annotation


# static fields
.field public static a:Lmk/d$a;


# direct methods
.method public static a()Z
    .locals 1

    sget-object v0, Lmk/d;->a:Lmk/d$a;

    invoke-interface {v0}, Lmk/d$a;->b()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lmk/d;->a:Lmk/d$a;

    invoke-interface {v0}, Lmk/d$a;->a()Z

    move-result v0

    return v0
.end method

.method public static c(Lmk/d$a;)V
    .locals 0

    sput-object p0, Lmk/d;->a:Lmk/d$a;

    return-void
.end method
