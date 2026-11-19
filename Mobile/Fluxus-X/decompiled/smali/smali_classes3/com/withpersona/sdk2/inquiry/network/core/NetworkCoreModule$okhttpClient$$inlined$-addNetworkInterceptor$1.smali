.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->okhttpClient(Ljava/util/Set;Ljava/util/Map;Landroid/content/Context;Lmo/k;Lmo/b;Lbq/e$a;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lmv/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $context$inlined:Landroid/content/Context;

.field final synthetic $deviceInfoProvider$inlined:Lmo/b;

.field final synthetic $deviceVendorIDProvider$inlined:Lmo/k;

.field final synthetic $headers$inlined:Ljava/util/Map;

.field final synthetic $loggerFactory$inlined:Lbq/e$a;

.field final synthetic $networkStateManager$inlined:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

.field final synthetic this$0:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;


# direct methods
.method public constructor <init>(Lmo/b;Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Landroid/content/Context;Lmo/k;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;Ljava/util/Map;Lbq/e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$deviceInfoProvider$inlined:Lmo/b;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->this$0:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$context$inlined:Landroid/content/Context;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$deviceVendorIDProvider$inlined:Lmo/k;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$networkStateManager$inlined:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$headers$inlined:Ljava/util/Map;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$loggerFactory$inlined:Lbq/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final intercept(Lmv/a0$a;)Lmv/h0;
    .locals 10
    .param p1    # Lmv/a0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0;->j()Lmv/f0$a;

    move-result-object v0

    invoke-interface {p1}, Lmv/a0$a;->h()Lmv/f0;

    move-result-object v1

    invoke-virtual {v1}, Lmv/f0;->g()Lmv/y;

    move-result-object v1

    invoke-virtual {v1}, Lmv/y;->d()Ljava/util/Set;

    move-result-object v1

    const-string v2, "Accept"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "application/json"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    :goto_0
    const-string v1, "Persona-Version"

    const-string v2, "2025-11-18"

    invoke-virtual {v0, v1, v2}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$deviceInfoProvider$inlined:Lmo/b;

    invoke-interface {v1}, Lmo/b;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Persona-Device-Manufacturer"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$deviceInfoProvider$inlined:Lmo/b;

    invoke-interface {v1}, Lmo/b;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Persona-Device-Model"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    const-string v1, "Persona-Device-OS"

    const-string v2, "Android"

    invoke-virtual {v0, v1, v2}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$deviceInfoProvider$inlined:Lmo/b;

    invoke-interface {v1}, Lmo/b;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Persona-Device-OS-Version"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$deviceInfoProvider$inlined:Lmo/b;

    invoke-interface {v1}, Lmo/b;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "VTDGJLGG"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->this$0:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->access$getStyleVariant$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$context$inlined:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v1, v1, 0x30

    const/16 v2, 0x20

    if-ne v1, v2, :cond_1

    const-string v1, "dark"

    goto :goto_1

    :cond_1
    const-string v1, "light"

    :cond_2
    :goto_1
    const-string v2, "Persona-Style-Variant"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->this$0:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->access$getLocale$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    const-string v2, "Persona-Device-Locale"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->this$0:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->access$getRedactAppIdentifyingInformation$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$context$inlined:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Persona-App-Bundle"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$deviceVendorIDProvider$inlined:Lmo/k;

    invoke-interface {v1}, Lmo/k;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Persona-Device-Vendor-Id"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    :cond_4
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$networkStateManager$inlined:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;->getOrganizationId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "Persona-Organization-Id"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    :cond_5
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->this$0:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->access$getEnvironmentId$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v2, "Persona-Environment-Id"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    :cond_6
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$headers$inlined:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    goto :goto_2

    :cond_7
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->this$0:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->access$getCertificateFingerprint$p(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    const-string v2, "BMRWJMTB"

    invoke-virtual {v0, v2, v1}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    :cond_8
    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/core/a;->a:Lcom/withpersona/sdk2/inquiry/network/core/a;

    invoke-virtual {v0}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object v4

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1;->$loggerFactory$inlined:Lbq/e$a;

    const-string v1, "com.withpersona.sdk2.inquiry.network"

    invoke-interface {v0, v1}, Lbq/e$a;->create(Ljava/lang/String;)Lbq/e;

    move-result-object v5

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v3 .. v9}, Lcom/withpersona/sdk2/inquiry/network/core/a;->a(Lcom/withpersona/sdk2/inquiry/network/core/a;Lmv/f0;Lbq/e;JILjava/lang/Object;)Lmv/f0;

    move-result-object v0

    invoke-interface {p1, v0}, Lmv/a0$a;->a(Lmv/f0;)Lmv/h0;

    move-result-object p1

    return-object p1
.end method
