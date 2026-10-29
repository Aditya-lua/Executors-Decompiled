.class public final synthetic Ln3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;

.field public final synthetic c:Le3/p;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/a;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ln3/a;->b:Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;

    iput-object p3, p0, Ln3/a;->c:Le3/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ln3/a;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Ln3/a;->b:Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;

    iget-object v2, p0, Ln3/a;->c:Le3/p;

    check-cast p1, Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;

    invoke-static {v0, v1, v2, p1}, Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;->$r8$lambda$SvlpUGCw7Sf2FZdJz4gwYbpL5Uo(Ljava/util/concurrent/Executor;Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;Le3/p;Lcom/google/android/gms/identitycredentials/SignalCredentialStateResponse;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
