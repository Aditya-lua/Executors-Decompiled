.class public final synthetic Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le3/p;

.field public final synthetic c:Lf3/n;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Le3/p;Lf3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/d;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/d;->b:Le3/p;

    iput-object p3, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/d;->c:Lf3/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/d;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/d;->b:Le3/p;

    iget-object v2, p0, Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/d;->c:Lf3/n;

    invoke-static {v0, v1, v2}, Landroidx/credentials/playservices/controllers/identitycredentials/getdigitalcredential/CredentialProviderGetDigitalCredentialController;->$r8$lambda$DZrKHrlNOV6-KssX_lDQis_nRXs(Ljava/util/concurrent/Executor;Le3/p;Lf3/n;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
