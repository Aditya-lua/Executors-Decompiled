.class public final synthetic Landroidx/credentials/playservices/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/lang/Exception;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Le3/p;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Exception;Ljava/util/concurrent/Executor;Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/f;->a:Ljava/lang/Exception;

    iput-object p2, p0, Landroidx/credentials/playservices/f;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/credentials/playservices/f;->c:Le3/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/credentials/playservices/f;->a:Ljava/lang/Exception;

    iget-object v1, p0, Landroidx/credentials/playservices/f;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/credentials/playservices/f;->c:Le3/p;

    invoke-static {v0, v1, v2}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$ZTOmcSIYlhRw0U7DeRTc4rOhVj0(Ljava/lang/Exception;Ljava/util/concurrent/Executor;Le3/p;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
