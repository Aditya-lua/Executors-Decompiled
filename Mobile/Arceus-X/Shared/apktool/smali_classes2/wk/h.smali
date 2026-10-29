.class public Lwk/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwk/h$c;,
        Lwk/h$d;
    }
.end annotation


# instance fields
.field public a:Lvk/c;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lwk/h$d;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lvk/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lwk/h;->c:Ljava/util/Set;

    new-instance v0, Lwk/h$a;

    invoke-direct {v0, p0}, Lwk/h$a;-><init>(Lwk/h;)V

    iput-object v0, p0, Lwk/h;->d:Ljava/lang/Runnable;

    iput-object p1, p0, Lwk/h;->a:Lvk/c;

    return-void
.end method

.method public static bridge synthetic a(Lwk/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lwk/h;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic b(Lwk/h;)Lvk/c;
    .locals 0

    iget-object p0, p0, Lwk/h;->a:Lvk/c;

    return-object p0
.end method

.method public static bridge synthetic c(Lwk/h;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lwk/h;->d:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static bridge synthetic d(Lwk/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lwk/h;->c:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic e(Lwk/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwk/h;->b:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic f(Lwk/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lwk/h;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h()Lwk/h;
    .locals 1

    invoke-static {}, Lwk/h$c;->a()Lwk/h;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, ".ROBLOSECURITY"

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x3b

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public i(Lwk/h$d;)V
    .locals 2

    const-string v0, "rbx.platform"

    const-string v1, "WebViewCookieHandler.registerCookieObserver()."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwk/h;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j(Lwk/h$d;)V
    .locals 2

    const-string v0, "rbx.platform"

    const-string v1, "WebViewCookieHandler.unregisterCookieObserver()."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwk/h;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lwk/h;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lwk/h;->a:Lvk/c;

    invoke-interface {v0}, Lvk/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lwk/h$b;

    invoke-direct {v1, p0, p1}, Lwk/h$b;-><init>(Lwk/h;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
