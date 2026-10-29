.class public final Lqp/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lmp/h0;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
        "b",
        "()Lmp/h0;",
        "nfc_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;)V
    .locals 0

    invoke-static {p0}, Lqp/g;->c(Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;)V

    return-void
.end method

.method public static final b()Lmp/h0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmp/h0<",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lmp/h0;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/nfc/a;

    invoke-direct {v1}, Lcom/withpersona/sdk2/inquiry/nfc/a;-><init>()V

    new-instance v2, Lqp/f;

    invoke-direct {v2}, Lqp/f;-><init>()V

    invoke-direct {v0, v1, v2}, Lmp/h0;-><init>(Lh/a;Lg/a;)V

    return-object v0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqp/i;

    invoke-direct {v0}, Lqp/i;-><init>()V

    invoke-virtual {v0, p0}, Lqp/i;->b(Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;)Z

    return-void
.end method
