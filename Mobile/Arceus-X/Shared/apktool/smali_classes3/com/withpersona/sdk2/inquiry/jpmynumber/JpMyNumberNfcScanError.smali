.class public abstract Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$ChipLocked;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$a;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordUnlimitedRetries;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$InvalidPasswordFormat;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcDisabled;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcError;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$Timeout;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnknownError;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnsupportedVersion;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UserCancelled;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00062\u00020\u0001:\u000b\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0006B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "",
        "",
        "a",
        "()Ljava/util/Map;",
        "ChipLocked",
        "IncorrectPasswordLimitedRetries",
        "IncorrectPasswordUnlimitedRetries",
        "InvalidPasswordFormat",
        "UnsupportedVersion",
        "NfcDisabled",
        "NfcError",
        "Timeout",
        "UserCancelled",
        "UnknownError",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$ChipLocked;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordUnlimitedRetries;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$InvalidPasswordFormat;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcDisabled;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcError;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$Timeout;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnknownError;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnsupportedVersion;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UserCancelled;",
        "jp-my-number_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;->a:Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$ChipLocked;

    const-string v1, "details"

    const-string v2, "error"

    if-eqz v0, :cond_0

    const-string v0, "chipLocked"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$ChipLocked;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$ChipLocked;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries;

    if-eqz v0, :cond_1

    const-string v0, "incorrectPasswordLimitedRetries"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordLimitedRetries;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "retriesRemaining"

    invoke-static {v3, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordUnlimitedRetries;

    if-eqz v0, :cond_2

    const-string v0, "incorrectPasswordUnlimitedRetries"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordUnlimitedRetries;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$IncorrectPasswordUnlimitedRetries;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$InvalidPasswordFormat;

    if-eqz v0, :cond_3

    const-string v0, "invalidPasswordFormat"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$InvalidPasswordFormat;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$InvalidPasswordFormat;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnsupportedVersion;

    if-eqz v0, :cond_4

    const-string v0, "unsupportedVersion"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnsupportedVersion;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnsupportedVersion;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_4
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcDisabled;

    if-eqz v0, :cond_5

    const-string v0, "nfcDisabled"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcDisabled;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcDisabled;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_5
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcError;

    if-eqz v0, :cond_6

    const-string v0, "nfcError"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcError;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$NfcError;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_6
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$Timeout;

    if-eqz v0, :cond_7

    const-string v0, "timeout"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$Timeout;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$Timeout;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_7
    sget-object v0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UserCancelled;->b:Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UserCancelled;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "userCancelled"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/j0;->g(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnknownError;

    if-eqz v0, :cond_9

    const-string v0, "unknownError"

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    move-object v2, p0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnknownError;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError$UnknownError;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_9
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method
