.class public final Lcom/appsflyer/internal/AFd1lSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFd1iSDK;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/appsflyer/internal/AFd1iSDK<",
        "Lcom/appsflyer/internal/AFh1aSDK;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic registerClient(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/appsflyer/internal/AFh1aSDK;

    invoke-direct {v0, p1}, Lcom/appsflyer/internal/AFh1aSDK;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
