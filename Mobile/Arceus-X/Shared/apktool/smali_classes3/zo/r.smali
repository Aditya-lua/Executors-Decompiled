.class public final Lzo/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lku/p0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lzo/n;


# direct methods
.method public constructor <init>(Lzo/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/r;->a:Lzo/n;

    return-void
.end method

.method public static a(Lzo/n;)Lzo/r;
    .locals 1

    new-instance v0, Lzo/r;

    invoke-direct {v0, p0}, Lzo/r;-><init>(Lzo/n;)V

    return-object v0
.end method

.method public static c(Lzo/n;)Lku/p0;
    .locals 0

    invoke-virtual {p0}, Lzo/n;->d()Lku/p0;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lku/p0;

    return-object p0
.end method


# virtual methods
.method public b()Lku/p0;
    .locals 1

    iget-object v0, p0, Lzo/r;->a:Lzo/n;

    invoke-static {v0}, Lzo/r;->c(Lzo/n;)Lku/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzo/r;->b()Lku/p0;

    move-result-object v0

    return-object v0
.end method
