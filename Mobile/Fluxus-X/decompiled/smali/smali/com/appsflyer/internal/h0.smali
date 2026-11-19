.class public final synthetic Lcom/appsflyer/internal/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFe1iSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFe1iSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/h0;->a:Lcom/appsflyer/internal/AFe1iSDK;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/h0;->a:Lcom/appsflyer/internal/AFe1iSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFe1iSDK;->a(Lcom/appsflyer/internal/AFe1iSDK;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
