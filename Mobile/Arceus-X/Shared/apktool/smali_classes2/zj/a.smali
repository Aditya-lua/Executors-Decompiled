.class public Lzj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;


# direct methods
.method public static a()V
    .locals 2

    sget-object v0, Lzj/a;->b:Ljava/lang/String;

    sget-object v1, Lzj/a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lsg/t0;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    sput-object v0, Lzj/a;->b:Ljava/lang/String;

    sput-object v0, Lzj/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lzj/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lsg/t0;->x(Ljava/lang/String;Ljava/lang/String;)V

    sput-object p0, Lzj/a;->b:Ljava/lang/String;

    return-void
.end method
