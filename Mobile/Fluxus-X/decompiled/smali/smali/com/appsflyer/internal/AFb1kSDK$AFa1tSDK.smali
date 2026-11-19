.class public final Lcom/appsflyer/internal/AFb1kSDK$AFa1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFb1kSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AFa1tSDK"
.end annotation


# instance fields
.field public final AFLogger:Z

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1kSDK$AFa1tSDK;->d:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/appsflyer/internal/AFb1kSDK$AFa1tSDK;->AFLogger:Z

    return-void
.end method
