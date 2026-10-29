.class public final Lhn/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhn/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lhn/c;


# direct methods
.method public constructor <init>(Lhn/c;)V
    .locals 0

    iput-object p1, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lhn/c;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lhn/c$c$a;->d(Lhn/c;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lhn/c;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lhn/c;->p(Lhn/c;)Lhn/s;

    move-result-object p0

    invoke-virtual {p0}, Lhn/s;->b0()Lhn/h0;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "First frame received for camera choice "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Lhn/s$d;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/s$d;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lhn/s$d$a;->a:Lhn/s$d$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    instance-of p2, p1, Lhn/s$d$d;

    if-eqz p2, :cond_1

    check-cast p1, Lhn/s$d$d;

    invoke-virtual {p1}, Lhn/s$d$d;->a()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-static {p2}, Lhn/c;->r(Lhn/c;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v0

    iget-object p2, p0, Lhn/c$c$a;->a:Lhn/c;

    new-instance v2, Lhn/d;

    invoke-direct {v2, p2}, Lhn/d;-><init>(Lhn/c;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "camera"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logDebugLogEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZILjava/lang/Object;)V

    :cond_0
    iget-object p2, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-static {p2}, Lhn/c;->s(Lhn/c;)Lnu/c0;

    move-result-object p2

    new-instance v0, Lcom/withpersona/sdk2/camera/d$e;

    invoke-virtual {p1}, Lhn/s$d$d;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/camera/d$e;-><init>(Z)V

    invoke-interface {p2, v0}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p2, Lhn/s$d$b;->a:Lhn/s$d$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-static {p1}, Lhn/c;->s(Lhn/c;)Lnu/c0;

    move-result-object p1

    new-instance p2, Lcom/withpersona/sdk2/camera/d$a;

    iget-object v0, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-static {v0}, Lhn/c;->q(Lhn/c;)Z

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lcom/withpersona/sdk2/camera/d$a;-><init>(ZZ)V

    invoke-interface {p1, p2}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-static {p1}, Lhn/c;->o(Lhn/c;)Lhn/b0;

    move-result-object p2

    invoke-virtual {p2}, Lhn/b0;->h()Lhn/s;

    move-result-object p2

    invoke-static {p1, p2}, Lhn/c;->t(Lhn/c;Lhn/s;)V

    iget-object p1, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-static {p1, v1}, Lhn/c;->u(Lhn/c;Z)V

    goto :goto_0

    :cond_2
    instance-of p2, p1, Lhn/s$d$c;

    if-eqz p2, :cond_5

    check-cast p1, Lhn/s$d$c;

    invoke-virtual {p1}, Lhn/s$d$c;->a()Lhn/s$c;

    move-result-object p1

    instance-of p2, p1, Lhn/s$c$a;

    if-eqz p2, :cond_3

    iget-object p1, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-static {p1}, Lhn/c;->v(Lhn/c;)V

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lhn/s$c$b;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lhn/c$c$a;->a:Lhn/c;

    invoke-static {p1}, Lhn/c;->s(Lhn/c;)Lnu/c0;

    move-result-object p1

    sget-object p2, Lcom/withpersona/sdk2/camera/d$c;->a:Lcom/withpersona/sdk2/camera/d$c;

    invoke-interface {p1, p2}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_6
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhn/s$d;

    invoke-virtual {p0, p1, p2}, Lhn/c$c$a;->c(Lhn/s$d;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
