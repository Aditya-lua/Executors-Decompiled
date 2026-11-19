.class public final synthetic Landroidx/credentials/playservices/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le3/p;

.field public final synthetic c:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Le3/p;Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/p;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/credentials/playservices/p;->b:Le3/p;

    iput-object p3, p0, Landroidx/credentials/playservices/p;->c:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/credentials/playservices/p;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/credentials/playservices/p;->b:Le3/p;

    iget-object v2, p0, Landroidx/credentials/playservices/p;->c:Lkotlin/jvm/internal/c0;

    invoke-static {v0, v1, v2}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$Jp6F_38VqvEs6gDaslAQ8y_YdwY(Ljava/util/concurrent/Executor;Le3/p;Lkotlin/jvm/internal/c0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
