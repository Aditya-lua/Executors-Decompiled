.class public final Lmp/z;
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
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lmp/w;


# direct methods
.method public constructor <init>(Lmp/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/z;->a:Lmp/w;

    return-void
.end method

.method public static a(Lmp/w;)Lmp/z;
    .locals 1

    new-instance v0, Lmp/z;

    invoke-direct {v0, p0}, Lmp/z;-><init>(Lmp/w;)V

    return-object v0
.end method

.method public static c(Lmp/w;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp/w;",
            ")",
            "Lg/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lmp/w;->a()Lg/c;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/c;

    return-object p0
.end method


# virtual methods
.method public b()Lg/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lmp/z;->a:Lmp/w;

    invoke-static {v0}, Lmp/z;->c(Lmp/w;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmp/z;->b()Lg/c;

    move-result-object v0

    return-object v0
.end method
