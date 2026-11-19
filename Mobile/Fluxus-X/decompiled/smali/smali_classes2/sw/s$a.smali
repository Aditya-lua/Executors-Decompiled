.class public Lsw/s$a;
.super Lsw/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsw/s;->c()Lsw/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsw/s<",
        "Ljava/lang/Iterable<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lsw/s;


# direct methods
.method public constructor <init>(Lsw/s;)V
    .locals 0

    iput-object p1, p0, Lsw/s$a;->a:Lsw/s;

    invoke-direct {p0}, Lsw/s;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lsw/v;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Iterable;

    invoke-virtual {p0, p1, p2}, Lsw/s$a;->d(Lsw/v;Ljava/lang/Iterable;)V

    return-void
.end method

.method public d(Lsw/v;Ljava/lang/Iterable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/v;",
            "Ljava/lang/Iterable<",
            "TT;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lsw/s$a;->a:Lsw/s;

    invoke-virtual {v1, p1, v0}, Lsw/s;->a(Lsw/v;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
