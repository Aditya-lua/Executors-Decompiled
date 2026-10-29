.class public Lum/u$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lum/u$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/u$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lum/u$g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lum/u$g<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lum/u$c;->a:Lum/u$g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, v0, Lum/u$g;->a:Lum/u$g;

    iput-object v1, v0, Lum/u$g;->a:Lum/u$g;

    iget-object v1, v0, Lum/u$g;->c:Lum/u$g;

    :goto_0
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    if-eqz v2, :cond_1

    iput-object v1, v2, Lum/u$g;->a:Lum/u$g;

    iget-object v1, v2, Lum/u$g;->b:Lum/u$g;

    goto :goto_0

    :cond_1
    iput-object v1, p0, Lum/u$c;->a:Lum/u$g;

    return-object v0
.end method

.method public b(Lum/u$g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lum/u$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_0

    iput-object v0, p1, Lum/u$g;->a:Lum/u$g;

    iget-object v0, p1, Lum/u$g;->b:Lum/u$g;

    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lum/u$c;->a:Lum/u$g;

    return-void
.end method
