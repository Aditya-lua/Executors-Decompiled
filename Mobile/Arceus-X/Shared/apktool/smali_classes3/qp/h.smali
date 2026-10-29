.class public final Lqp/h;
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
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lqp/e;


# direct methods
.method public constructor <init>(Lqp/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqp/h;->a:Lqp/e;

    return-void
.end method

.method public static a(Lqp/e;)Lqp/h;
    .locals 1

    new-instance v0, Lqp/h;

    invoke-direct {v0, p0}, Lqp/h;-><init>(Lqp/e;)V

    return-object v0
.end method

.method public static c(Lqp/e;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqp/e;",
            ")",
            "Lg/c<",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lqp/e;->a()Lg/c;

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
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqp/h;->a:Lqp/e;

    invoke-static {v0}, Lqp/h;->c(Lqp/e;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqp/h;->b()Lg/c;

    move-result-object v0

    return-object v0
.end method
