.class public Ls7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lf7/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls7/d;

    invoke-direct {v0}, Ls7/d;-><init>()V

    sput-object v0, Ls7/e;->a:Lf7/m0;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ls7/e;->a:Lf7/m0;

    invoke-interface {v0, p0}, Lf7/m0;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Ls7/e;->a:Lf7/m0;

    invoke-interface {v0, p0, p1}, Lf7/m0;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ls7/e;->a:Lf7/m0;

    invoke-interface {v0, p0}, Lf7/m0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Ls7/e;->a:Lf7/m0;

    invoke-interface {v0, p0, p1}, Lf7/m0;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
