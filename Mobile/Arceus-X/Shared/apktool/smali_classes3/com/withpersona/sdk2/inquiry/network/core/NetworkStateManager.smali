.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private organizationId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOrganizationId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;->organizationId:Ljava/lang/String;

    return-object v0
.end method

.method public final setOrganizationId(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;->organizationId:Ljava/lang/String;

    return-void
.end method
