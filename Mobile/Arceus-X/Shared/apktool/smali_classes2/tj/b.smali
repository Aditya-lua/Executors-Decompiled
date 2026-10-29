.class public Ltj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-RouteHandledByLua"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-RouteHandledNatively"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-ErrorIncorrectParamName"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Event:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". URL:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "appRouter"

    const-string v0, "incorrectParamName"

    invoke-static {p2, v0, p1}, Lsg/t0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-ErrorIncorrectParamValue"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Event:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". URL:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "appRouter"

    const-string v0, "incorrectParamValue"

    invoke-static {p2, v0, p1}, Lsg/t0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-ErrorInvalidJson"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    const-string v0, "appRouter"

    const-string v1, "invalidJson"

    invoke-static {v0, v1, p1}, Lsg/t0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-ErrorNoParamsFoundForEvent"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Event:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". URL:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "appRouter"

    const-string v0, "noParamsFoundForEvent"

    invoke-static {p2, v0, p1}, Lsg/t0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-ErrorNoRoutesParsed"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    const-string v0, "appRouter"

    const-string v1, "noRoutesParsed"

    invoke-static {v0, v1, p1}, Lsg/t0;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public h()V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-ParseRouteCalled"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public i()V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-PostEventWithParams"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public j()V
    .locals 2

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    const-string v1, "Android-AppRouter-PostEventWithoutParams"

    invoke-virtual {v0, v1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method
