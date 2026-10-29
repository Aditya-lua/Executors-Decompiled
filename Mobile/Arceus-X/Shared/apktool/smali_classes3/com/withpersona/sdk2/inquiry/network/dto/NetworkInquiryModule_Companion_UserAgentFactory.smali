.class public final Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory$InstanceHolder;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;

    return-object v0
.end method

.method public static userAgent()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule$Companion;->userAgent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;->get()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/String;
    .locals 1

    .line 2
    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;->userAgent()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
