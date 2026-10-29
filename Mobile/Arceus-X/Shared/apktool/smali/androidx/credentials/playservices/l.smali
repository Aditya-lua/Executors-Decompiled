.class public final synthetic Landroidx/credentials/playservices/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le3/p;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/l;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/credentials/playservices/l;->b:Le3/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/credentials/playservices/l;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/credentials/playservices/l;->b:Le3/p;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$MiksCaiwjpjIlIYDBOYHqFL7e0U(Ljava/util/concurrent/Executor;Le3/p;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
