.class public final synthetic Lk3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le3/p;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Le3/p;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/b;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lk3/b;->b:Le3/p;

    iput-object p3, p0, Lk3/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk3/b;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lk3/b;->b:Le3/p;

    iget-object v2, p0, Lk3/b;->c:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->$r8$lambda$n47xgMiG50_l3R9Et58_9VYKO94(Ljava/util/concurrent/Executor;Le3/p;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
