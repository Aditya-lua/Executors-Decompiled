.class public Ldl/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldl/h$c;,
        Ldl/h$d;
    }
.end annotation


# instance fields
.field public a:Lcl/c;

.field public volatile b:Ljava/lang/String;

.field public volatile c:Z

.field public d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ldl/h$d;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcl/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ldl/h;->d:Ljava/util/Set;

    new-instance v0, Ldl/h$a;

    invoke-direct {v0, p0}, Ldl/h$a;-><init>(Ldl/h;)V

    iput-object v0, p0, Ldl/h;->e:Ljava/lang/Runnable;

    iput-object p1, p0, Ldl/h;->a:Lcl/c;

    return-void
.end method

.method public static bridge synthetic a(Ldl/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ldl/h;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic b(Ldl/h;)Lcl/c;
    .locals 0

    iget-object p0, p0, Ldl/h;->a:Lcl/c;

    return-object p0
.end method

.method public static bridge synthetic c(Ldl/h;)Z
    .locals 0

    iget-boolean p0, p0, Ldl/h;->c:Z

    return p0
.end method

.method public static bridge synthetic d(Ldl/h;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Ldl/h;->e:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static bridge synthetic e(Ldl/h;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Ldl/h;->d:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic f(Ldl/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldl/h;->b:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic g(Ldl/h;Z)V
    .locals 0

    iput-boolean p1, p0, Ldl/h;->c:Z

    return-void
.end method

.method public static bridge synthetic h(Ldl/h;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ldl/h;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j()Ldl/h;
    .locals 1

    invoke-static {}, Ldl/h$c;->a()Ldl/h;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final i(Ljava/lang/String;)Ljava/lang/String;
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

.method public k(Ldl/h$d;)V
    .locals 2

    const-string v0, "rbx.platform"

    const-string v1, "WebViewCookieHandler.registerCookieObserver()."

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ldl/h;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Ldl/h;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ldl/h;->b:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ldl/h;->c:Z

    return-void
.end method

.method public m(Ldl/h$d;)V
    .locals 2

    const-string v0, "rbx.platform"

    const-string v1, "WebViewCookieHandler.unregisterCookieObserver()."

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ldl/h;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ldl/h;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ldl/h;->a:Lcl/c;

    invoke-interface {v0}, Lcl/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Ldl/h$b;

    invoke-direct {v1, p0, p1}, Ldl/h$b;-><init>(Ldl/h;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
