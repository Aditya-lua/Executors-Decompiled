.class public Li8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/e;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lj8/x;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ld8/e;

.field public final d:Lk8/d;

.field public final e:Ll8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lc8/t;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Li8/c;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Ld8/e;Lj8/x;Lk8/d;Ll8/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/c;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Li8/c;->c:Ld8/e;

    iput-object p3, p0, Li8/c;->a:Lj8/x;

    iput-object p4, p0, Li8/c;->d:Lk8/d;

    iput-object p5, p0, Li8/c;->e:Ll8/b;

    return-void
.end method

.method public static synthetic b(Li8/c;Lc8/o;Lc8/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li8/c;->d:Lk8/d;

    invoke-interface {v0, p1, p2}, Lk8/d;->S1(Lc8/o;Lc8/i;)Lk8/k;

    iget-object p0, p0, Li8/c;->a:Lj8/x;

    const/4 p2, 0x1

    invoke-interface {p0, p1, p2}, Lj8/x;->b(Lc8/o;I)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic c(Li8/c;Lc8/o;Lz7/j;Lc8/i;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Li8/c;->c:Ld8/e;

    invoke-virtual {p1}, Lc8/o;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ld8/e;->a(Ljava/lang/String;)Ld8/m;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p0, "Transport backend \'%s\' is not registered"

    invoke-virtual {p1}, Lc8/o;->b()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Li8/c;->f:Ljava/util/logging/Logger;

    invoke-virtual {p1, p0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lz7/j;->a(Ljava/lang/Exception;)V

    return-void

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p3}, Ld8/m;->b(Lc8/i;)Lc8/i;

    move-result-object p3

    iget-object v0, p0, Li8/c;->e:Ll8/b;

    new-instance v1, Li8/b;

    invoke-direct {v1, p0, p1, p3}, Li8/b;-><init>(Li8/c;Lc8/o;Lc8/i;)V

    invoke-interface {v0, v1}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-interface {p2, p0}, Lz7/j;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    sget-object p1, Li8/c;->f:Ljava/util/logging/Logger;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error scheduling event "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lz7/j;->a(Ljava/lang/Exception;)V

    return-void
.end method


# virtual methods
.method public a(Lc8/o;Lc8/i;Lz7/j;)V
    .locals 2

    iget-object v0, p0, Li8/c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Li8/a;

    invoke-direct {v1, p0, p1, p3, p2}, Li8/a;-><init>(Li8/c;Lc8/o;Lz7/j;Lc8/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
