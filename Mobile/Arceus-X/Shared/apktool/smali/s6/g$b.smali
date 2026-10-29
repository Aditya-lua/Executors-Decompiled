.class public final Ls6/g$b;
.super Le7/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls6/g;-><init>(JLs6/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le7/w<",
        "Ls6/d$b;",
        "Ls6/g$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "s6/g$b",
        "Le7/w;",
        "Ls6/d$b;",
        "Ls6/g$a;",
        "key",
        "value",
        "",
        "n",
        "(Ls6/d$b;Ls6/g$a;)J",
        "oldValue",
        "newValue",
        "",
        "m",
        "(Ls6/d$b;Ls6/g$a;Ls6/g$a;)V",
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
.field public final synthetic d:Ls6/g;


# direct methods
.method public constructor <init>(Ls6/g;J)V
    .locals 0

    iput-object p1, p0, Ls6/g$b;->d:Ls6/g;

    invoke-direct {p0, p2, p3}, Le7/w;-><init>(J)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ls6/d$b;

    check-cast p2, Ls6/g$a;

    check-cast p3, Ls6/g$a;

    invoke-virtual {p0, p1, p2, p3}, Ls6/g$b;->m(Ls6/d$b;Ls6/g$a;Ls6/g$a;)V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 0

    check-cast p1, Ls6/d$b;

    check-cast p2, Ls6/g$a;

    invoke-virtual {p0, p1, p2}, Ls6/g$b;->n(Ls6/d$b;Ls6/g$a;)J

    move-result-wide p1

    return-wide p1
.end method

.method public m(Ls6/d$b;Ls6/g$a;Ls6/g$a;)V
    .locals 6

    iget-object p3, p0, Ls6/g$b;->d:Ls6/g;

    invoke-static {p3}, Ls6/g;->h(Ls6/g;)Ls6/j;

    move-result-object v0

    invoke-virtual {p2}, Ls6/g$a;->b()Lk6/n;

    move-result-object v2

    invoke-virtual {p2}, Ls6/g$a;->a()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {p2}, Ls6/g$a;->c()J

    move-result-wide v4

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, Ls6/j;->c(Ls6/d$b;Lk6/n;Ljava/util/Map;J)V

    return-void
.end method

.method public n(Ls6/d$b;Ls6/g$a;)J
    .locals 0

    invoke-virtual {p2}, Ls6/g$a;->c()J

    move-result-wide p1

    return-wide p1
.end method
