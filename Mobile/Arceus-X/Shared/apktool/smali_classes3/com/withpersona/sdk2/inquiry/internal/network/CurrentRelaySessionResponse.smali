.class public final Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;,
        Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;",
        "",
        "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;",
        "data",
        "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;",
        "meta",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;",
        "()Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;",
        "()Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;",
        "Data",
        "Metadata",
        "inquiry-internal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lum/i;
    generateAdapter = true
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;->a:Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;->b:Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;->a:Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Data;

    return-object v0
.end method

.method public final b()Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;->b:Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse$Metadata;

    return-object v0
.end method
