.class public final Lmp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lg/c<",
        "Lmp/b;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lmp/d;


# direct methods
.method public constructor <init>(Lmp/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/g;->a:Lmp/d;

    return-void
.end method

.method public static a(Lmp/d;)Lmp/g;
    .locals 1

    new-instance v0, Lmp/g;

    invoke-direct {v0, p0}, Lmp/g;-><init>(Lmp/d;)V

    return-object v0
.end method

.method public static b(Lmp/d;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp/d;",
            ")",
            "Lg/c<",
            "Lmp/b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lmp/d;->a()Lg/c;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/c;

    return-object p0
.end method


# virtual methods
.method public c()Lg/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/c<",
            "Lmp/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lmp/g;->a:Lmp/d;

    invoke-static {v0}, Lmp/g;->b(Lmp/d;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmp/g;->c()Lg/c;

    move-result-object v0

    return-object v0
.end method
