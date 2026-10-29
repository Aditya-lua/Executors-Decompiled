.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$NetworkConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NetworkConstants"
.end annotation


# static fields
.field public static final HEADER_KEY_PERSONA_ENVIRONMENT_ID:Ljava/lang/String; = "Persona-Environment-Id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final HEADER_KEY_PERSONA_ORGANIZATION_ID:Ljava/lang/String; = "Persona-Organization-Id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$NetworkConstants;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$NetworkConstants;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$NetworkConstants;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$NetworkConstants;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$NetworkConstants;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
