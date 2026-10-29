.class public final Lcom/withpersona/sdk2/inquiry/nfc/a;
.super Lh/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh/a<",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/nfc/a;",
        "Lh/a;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "input",
        "Landroid/content/Intent;",
        "a",
        "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;)Landroid/content/Intent;",
        "",
        "resultCode",
        "intent",
        "b",
        "(ILandroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
        "nfc_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;)Landroid/content/Intent;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lqp/d;->a:Lqp/d;

    invoke-virtual {v1}, Lqp/d;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "EXTRA_NFC_READER_CONFIG"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public b(ILandroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;
    .locals 1
    .param p2    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p2, "EXTRA_RESULT"

    const-class v0, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;

    invoke-static {p1, p2, v0}, Lu2/c;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    new-instance p1, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Error;

    const-string p2, "Unable to extract output from result intent."

    sget-object v0, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;->b:Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;

    invoke-direct {p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Error;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;)V

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/nfc/a;->a(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/nfc/a;->b(ILandroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;

    move-result-object p1

    return-object p1
.end method
