.class public Lnt/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llt/g;Llt/r;)Ljava/lang/Object;
    .locals 2
    .param p1    # Llt/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Llt/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lmt/b$a;->a:Lmt/b$a;

    sget-object v1, Lmt/b;->a:Llt/p;

    invoke-virtual {v1, p2}, Llt/p;->c(Llt/r;)Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    new-instance v0, Lot/b;

    invoke-virtual {p1}, Llt/g;->e()Lmt/c;

    move-result-object p1

    sget-object v1, Lmt/b;->b:Llt/p;

    invoke-virtual {v1, p2}, Llt/p;->c(Llt/r;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lot/b;-><init>(Lmt/c;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lmt/b;->c:Llt/p;

    invoke-virtual {v1, p2}, Llt/p;->c(Llt/r;)Ljava/lang/Object;

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

    new-instance v0, Lot/i;

    invoke-virtual {p1}, Llt/g;->e()Lmt/c;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lot/i;-><init>(Lmt/c;Ljava/lang/String;)V

    return-object v0
.end method
