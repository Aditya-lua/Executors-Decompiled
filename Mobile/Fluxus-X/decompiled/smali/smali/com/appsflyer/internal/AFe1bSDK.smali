.class public final Lcom/appsflyer/internal/AFe1bSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:Lkotlin/text/Regex;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\p{C}"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFe1bSDK;->AFKeystoreWrapper:Lkotlin/text/Regex;

    return-void
.end method

.method public static final synthetic AFKeystoreWrapper()Lkotlin/text/Regex;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFe1bSDK;->AFKeystoreWrapper:Lkotlin/text/Regex;

    return-object v0
.end method
