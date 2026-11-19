.class public final synthetic Landroidx/credentials/playservices/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/os/CancellationSignal;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Le3/p;


# direct methods
.method public synthetic constructor <init>(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/h;->a:Landroid/os/CancellationSignal;

    iput-object p2, p0, Landroidx/credentials/playservices/h;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/credentials/playservices/h;->c:Le3/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/credentials/playservices/h;->a:Landroid/os/CancellationSignal;

    iget-object v1, p0, Landroidx/credentials/playservices/h;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Landroidx/credentials/playservices/h;->c:Le3/p;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, v2, p1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$McATJhcckTZ1GXTTotrMY9ugoKk(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Le3/p;Ljava/lang/Void;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
