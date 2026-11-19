.class public final synthetic Ll3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le3/p;

.field public final synthetic c:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Le3/p;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/d;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll3/d;->b:Le3/p;

    iput-object p3, p0, Ll3/d;->c:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ll3/d;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Ll3/d;->b:Le3/p;

    iget-object v2, p0, Ll3/d;->c:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;->$r8$lambda$zpwR-bI_yeldhlG7ygJcF2M8QvI(Ljava/util/concurrent/Executor;Le3/p;Ljava/lang/Exception;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
