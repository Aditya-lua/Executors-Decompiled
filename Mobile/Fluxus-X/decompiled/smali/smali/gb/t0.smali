.class public final Lgb/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo9/k;

    const-string v1, "Games"

    invoke-direct {v0, v1}, Lo9/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Lgb/t0;->a:Lo9/k;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lgb/t0;->a:Lo9/k;

    invoke-static {p0}, Lgb/t0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lo9/k;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object p0, Lgb/t0;->a:Lo9/k;

    const-string p1, "GamesApiManager"

    invoke-static {p1}, Lgb/t0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Authentication task failed"

    invoke-virtual {p0, p1, v0, p2}, Lo9/k;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lgb/t0;->a:Lo9/k;

    invoke-static {p0}, Lgb/t0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lo9/k;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lgb/t0;->a:Lo9/k;

    invoke-static {p0}, Lgb/t0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lo9/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lgb/t0;->a:Lo9/k;

    invoke-static {p0}, Lgb/t0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1, p2}, Lo9/k;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lgb/t0;->a:Lo9/k;

    invoke-static {p0}, Lgb/t0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lo9/k;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lgb/t0;->a:Lo9/k;

    invoke-static {p0}, Lgb/t0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1, p2}, Lo9/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "PlayGamesServices"

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%s[%s]"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
