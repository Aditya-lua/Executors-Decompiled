.class public final synthetic Lm3/f;
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

    iput-object p1, p0, Lm3/f;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lm3/f;->b:Le3/p;

    iput-object p3, p0, Lm3/f;->c:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lm3/f;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lm3/f;->b:Le3/p;

    iget-object v2, p0, Lm3/f;->c:Lkotlin/jvm/internal/c0;

    invoke-static {v0, v1, v2}, Landroidx/credentials/playservices/controllers/blockstore/getrestorecredential/CredentialProviderGetRestoreCredentialController;->$r8$lambda$On8hKTPH9xV1oQ4RoMZSgwzfGx0(Ljava/util/concurrent/Executor;Le3/p;Lkotlin/jvm/internal/c0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
