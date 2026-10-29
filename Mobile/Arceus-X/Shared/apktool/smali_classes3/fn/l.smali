.class public final Lfn/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lln/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lfn/k;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lln/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfn/k;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/k;",
            "Lft/i<",
            "Lln/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/l;->a:Lfn/k;

    iput-object p2, p0, Lfn/l;->b:Lft/i;

    return-void
.end method

.method public static a(Lfn/k;Lct/a;)Lln/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/k;",
            "Lct/a<",
            "Lln/b;",
            ">;)",
            "Lln/a;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lfn/k;->a(Lct/a;)Lln/a;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lln/a;

    return-object p0
.end method

.method public static b(Lfn/k;Lft/i;)Lfn/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/k;",
            "Lft/i<",
            "Lln/b;",
            ">;)",
            "Lfn/l;"
        }
    .end annotation

    new-instance v0, Lfn/l;

    invoke-direct {v0, p0, p1}, Lfn/l;-><init>(Lfn/k;Lft/i;)V

    return-object v0
.end method


# virtual methods
.method public c()Lln/a;
    .locals 2

    iget-object v0, p0, Lfn/l;->a:Lfn/k;

    iget-object v1, p0, Lfn/l;->b:Lft/i;

    invoke-static {v1}, Lft/c;->b(Lft/i;)Lct/a;

    move-result-object v1

    invoke-static {v0, v1}, Lfn/l;->a(Lfn/k;Lct/a;)Lln/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfn/l;->c()Lln/a;

    move-result-object v0

    return-object v0
.end method
