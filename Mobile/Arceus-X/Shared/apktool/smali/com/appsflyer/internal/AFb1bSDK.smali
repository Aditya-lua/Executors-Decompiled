.class public interface abstract Lcom/appsflyer/internal/AFb1bSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;,
        Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008f\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\u000cJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFb1bSDK;",
        "",
        "Landroid/content/Context;",
        "p0",
        "Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;",
        "p1",
        "",
        "unregisterClient",
        "(Landroid/content/Context;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;)V",
        "AFKeystoreWrapper",
        "()V",
        "AFa1tSDK",
        "AFa1zSDK"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AFa1tSDK:Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;

    sput-object v0, Lcom/appsflyer/internal/AFb1bSDK;->AFa1tSDK:Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;

    return-void
.end method


# virtual methods
.method public abstract AFKeystoreWrapper()V
.end method

.method public abstract unregisterClient(Landroid/content/Context;Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFb1bSDK$AFa1zSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
