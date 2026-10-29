.class public final Ls6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls6/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0008\u0008*\u0001#\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ;\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010$R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010 R$\u0010)\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020\u00028V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008(\u0010 \"\u0004\u0008!\u0010\u001d\u00a8\u0006*"
    }
    d2 = {
        "Ls6/g;",
        "Ls6/i;",
        "",
        "initialMaxSize",
        "Ls6/j;",
        "weakMemoryCache",
        "<init>",
        "(JLs6/j;)V",
        "Ls6/d$b;",
        "key",
        "Ls6/d$c;",
        "a",
        "(Ls6/d$b;)Ls6/d$c;",
        "Lk6/n;",
        "image",
        "",
        "",
        "",
        "extras",
        "size",
        "",
        "c",
        "(Ls6/d$b;Lk6/n;Ljava/util/Map;J)V",
        "",
        "f",
        "(Ls6/d$b;)Z",
        "clear",
        "()V",
        "g",
        "(J)V",
        "J",
        "d",
        "()J",
        "b",
        "Ls6/j;",
        "s6/g$b",
        "Ls6/g$b;",
        "cache",
        "i",
        "value",
        "e",
        "maxSize",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:J

.field public final b:Ls6/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ls6/g$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLs6/j;)V
    .locals 0
    .param p3    # Ls6/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ls6/g;->a:J

    iput-object p3, p0, Ls6/g;->b:Ls6/j;

    invoke-virtual {p0}, Ls6/g;->d()J

    move-result-wide p1

    new-instance p3, Ls6/g$b;

    invoke-direct {p3, p0, p1, p2}, Ls6/g$b;-><init>(Ls6/g;J)V

    iput-object p3, p0, Ls6/g;->c:Ls6/g$b;

    return-void
.end method

.method public static final synthetic h(Ls6/g;)Ls6/j;
    .locals 0

    iget-object p0, p0, Ls6/g;->b:Ls6/j;

    return-object p0
.end method


# virtual methods
.method public a(Ls6/d$b;)Ls6/d$c;
    .locals 2
    .param p1    # Ls6/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    invoke-virtual {v0, p1}, Le7/w;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls6/g$a;

    if-eqz p1, :cond_0

    new-instance v0, Ls6/d$c;

    invoke-virtual {p1}, Ls6/g$a;->b()Lk6/n;

    move-result-object v1

    invoke-virtual {p1}, Ls6/g$a;->a()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ls6/d$c;-><init>(Lk6/n;Ljava/util/Map;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(J)V
    .locals 1

    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    invoke-virtual {v0, p1, p2}, Le7/w;->j(J)V

    return-void
.end method

.method public c(Ls6/d$b;Lk6/n;Ljava/util/Map;J)V
    .locals 7
    .param p1    # Ls6/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lk6/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls6/d$b;",
            "Lk6/n;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;J)V"
        }
    .end annotation

    invoke-virtual {p0}, Ls6/g;->e()J

    move-result-wide v0

    cmp-long v0, p4, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    new-instance v1, Ls6/g$a;

    invoke-direct {v1, p2, p3, p4, p5}, Ls6/g$a;-><init>(Lk6/n;Ljava/util/Map;J)V

    invoke-virtual {v0, p1, v1}, Le7/w;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    invoke-virtual {v0, p1}, Le7/w;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Ls6/g;->b:Ls6/j;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Ls6/j;->c(Ls6/d$b;Lk6/n;Ljava/util/Map;J)V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    invoke-virtual {v0}, Le7/w;->a()V

    return-void
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Ls6/g;->a:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    invoke-virtual {v0}, Le7/w;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public f(Ls6/d$b;)Z
    .locals 1
    .param p1    # Ls6/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    invoke-virtual {v0, p1}, Le7/w;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    invoke-virtual {v0, p1, p2}, Le7/w;->l(J)V

    return-void
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Ls6/g;->c:Ls6/g$b;

    invoke-virtual {v0}, Le7/w;->e()J

    move-result-wide v0

    return-wide v0
.end method
