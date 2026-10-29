.class final Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory$InstanceHolder;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_Companion_UserAgentFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
