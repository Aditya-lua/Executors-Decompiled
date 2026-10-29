.class public Lws/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lus/g;Lus/r;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lus/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lus/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lvs/b$a;->a:Lvs/b$a;

    sget-object v1, Lvs/b;->a:Lus/p;

    invoke-virtual {v1, p2}, Lus/p;->c(Lus/r;)Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    new-instance v0, Lxs/b;

    invoke-virtual {p1}, Lus/g;->e()Lvs/c;

    move-result-object p1

    sget-object v1, Lvs/b;->b:Lus/p;

    invoke-virtual {v1, p2}, Lus/p;->c(Lus/r;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lxs/b;-><init>(Lvs/c;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lvs/b;->c:Lus/p;

    invoke-virtual {v1, p2}, Lus/p;->c(Lus/r;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0xa0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lxs/h;

    invoke-virtual {p1}, Lus/g;->e()Lvs/c;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lxs/h;-><init>(Lvs/c;Ljava/lang/String;)V

    return-object v0
.end method
