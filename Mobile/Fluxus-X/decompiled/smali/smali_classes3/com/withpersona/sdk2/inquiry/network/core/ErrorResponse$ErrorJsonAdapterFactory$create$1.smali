.class public final Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory$create$1;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory;->create(Ljava/lang/reflect/Type;Ljava/util/Set;Lhn/w;)Lhn/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;",
        ">;"
    }
.end annotation


# instance fields
.field private final errorAdapter:Lhn/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/h<",
            "Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhn/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/h<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lhn/h;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory$create$1;->errorAdapter:Lhn/h;

    return-void
.end method

.method public static synthetic getErrorAdapter$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;
    .locals 2

    .line 2
    invoke-virtual {p1}, Lhn/m;->y()Lhn/m;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory;

    invoke-virtual {v1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory;->hasLabel(Lhn/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory$create$1;->errorAdapter:Lhn/h;

    invoke-virtual {v0, p1}, Lhn/h;->fromJson(Lhn/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    return-object p1

    .line 5
    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$UnknownErrorAdapter;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory$create$1;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    move-result-object p1

    return-object p1
.end method

.method public final getErrorAdapter()Lhn/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhn/h<",
            "Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory$create$1;->errorAdapter:Lhn/h;

    return-object v0
.end method

.method public toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory$create$1;->errorAdapter:Lhn/h;

    invoke-virtual {v0, p1, p2}, Lhn/h;->toJson(Lhn/t;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$ErrorJsonAdapterFactory$create$1;->toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;)V

    return-void
.end method
