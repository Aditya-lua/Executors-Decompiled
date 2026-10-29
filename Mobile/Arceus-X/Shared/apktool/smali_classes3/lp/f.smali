.class public final Llp/f;
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
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Llp/c;


# direct methods
.method public constructor <init>(Llp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/f;->a:Llp/c;

    return-void
.end method

.method public static a(Llp/c;)Llp/f;
    .locals 1

    new-instance v0, Llp/f;

    invoke-direct {v0, p0}, Llp/f;-><init>(Llp/c;)V

    return-object v0
.end method

.method public static c(Llp/c;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llp/c;",
            ")",
            "Lg/c<",
            "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Llp/c;->a()Lg/c;

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
            "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llp/f;->a:Llp/c;

    invoke-static {v0}, Llp/f;->c(Llp/c;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llp/f;->b()Lg/c;

    move-result-object v0

    return-object v0
.end method
