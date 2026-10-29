.class public Lk1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Ln0/k3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Ln0/i3;->b()Ln0/i3;

    move-result-object v0

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lk1/b;

    invoke-direct {v2}, Lk1/b;-><init>()V

    invoke-virtual {v0, v1, v2}, Ln0/i3;->c(Ljava/util/concurrent/Executor;Lx2/a;)V

    return-void
.end method

.method public static synthetic a(Ln0/h3;)V
    .locals 1

    new-instance v0, Ln0/k3;

    invoke-static {p0}, Lk1/d;->a(Ln0/h3;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln0/k3;-><init>(Ljava/util/List;)V

    sput-object v0, Lk1/c;->a:Ln0/k3;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "video DeviceQuirks = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lk1/c;->a:Ln0/k3;

    invoke-static {v0}, Ln0/k3;->d(Ln0/k3;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "DeviceQuirks"

    invoke-static {v0, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/Class;)Ln0/g3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ln0/g3;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lk1/c;->a:Ln0/k3;

    invoke-virtual {v0, p0}, Ln0/k3;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object p0

    return-object p0
.end method

.method public static c()Ln0/k3;
    .locals 1

    sget-object v0, Lk1/c;->a:Ln0/k3;

    return-object v0
.end method
