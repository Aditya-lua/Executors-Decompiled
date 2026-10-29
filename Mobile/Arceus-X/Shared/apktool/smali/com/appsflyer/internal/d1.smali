.class public final synthetic Lcom/appsflyer/internal/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFi1gSDK$2;

.field public final synthetic b:Lcom/android/installreferrer/api/InstallReferrerClient;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFi1gSDK$2;Lcom/android/installreferrer/api/InstallReferrerClient;Landroid/content/Context;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/d1;->a:Lcom/appsflyer/internal/AFi1gSDK$2;

    iput-object p2, p0, Lcom/appsflyer/internal/d1;->b:Lcom/android/installreferrer/api/InstallReferrerClient;

    iput-object p3, p0, Lcom/appsflyer/internal/d1;->c:Landroid/content/Context;

    iput p4, p0, Lcom/appsflyer/internal/d1;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/internal/d1;->a:Lcom/appsflyer/internal/AFi1gSDK$2;

    iget-object v1, p0, Lcom/appsflyer/internal/d1;->b:Lcom/android/installreferrer/api/InstallReferrerClient;

    iget-object v2, p0, Lcom/appsflyer/internal/d1;->c:Landroid/content/Context;

    iget v3, p0, Lcom/appsflyer/internal/d1;->d:I

    invoke-static {v0, v1, v2, v3}, Lcom/appsflyer/internal/AFi1gSDK$2;->a(Lcom/appsflyer/internal/AFi1gSDK$2;Lcom/android/installreferrer/api/InstallReferrerClient;Landroid/content/Context;I)V

    return-void
.end method
