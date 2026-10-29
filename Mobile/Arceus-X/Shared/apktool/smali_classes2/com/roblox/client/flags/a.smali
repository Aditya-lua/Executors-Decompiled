.class public Lcom/roblox/client/flags/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/flags/a$h;,
        Lcom/roblox/client/flags/a$g;,
        Lcom/roblox/client/flags/a$f;,
        Lcom/roblox/client/flags/a$d;,
        Lcom/roblox/client/flags/a$e;,
        Lcom/roblox/client/flags/a$i;,
        Lcom/roblox/client/flags/a$c;,
        Lcom/roblox/client/flags/a$b;,
        Lcom/roblox/client/flags/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field public c:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/roblox/client/flags/a$h;->a()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/roblox/client/flags/a;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 4
    aput-object p2, v0, v1

    .line 5
    iput v1, p0, Lcom/roblox/client/flags/a;->a:I

    if-eqz p3, :cond_0

    .line 6
    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/flags/a;->c:Ljava/util/Optional;

    return-void

    .line 7
    :cond_0
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/flags/a;->c:Ljava/util/Optional;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;ZLth/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/client/flags/a;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/flags/a;->c:Ljava/util/Optional;

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/flags/a;->c:Ljava/util/Optional;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/flags/a;->f(Ljava/lang/Object;I)V

    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/flags/a;->j(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/roblox/client/flags/a;->a:I

    return v0
.end method

.method public f(Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/flags/a;->b:[Ljava/lang/Object;

    aput-object p1, v0, p2

    iget v0, p0, Lcom/roblox/client/flags/a;->a:I

    if-lt p2, v0, :cond_2

    if-nez p1, :cond_1

    invoke-virtual {p0, v0}, Lcom/roblox/client/flags/a;->h(I)V

    return-void

    :cond_1
    iput p2, p0, Lcom/roblox/client/flags/a;->a:I

    :cond_2
    :goto_0
    return-void
.end method

.method public g(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/flags/a;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public final h(I)V
    .locals 1

    :goto_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/roblox/client/flags/a;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/roblox/client/flags/a;->a:I

    return-void

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/flags/a;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/roblox/client/flags/a;->a:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public j(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/flags/a;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method
