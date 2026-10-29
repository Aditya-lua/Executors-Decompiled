.class public final synthetic Ln3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;

.field public final synthetic b:Lh3/f;


# direct methods
.method public synthetic constructor <init>(Le3/p;Lh3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/d;->a:Le3/p;

    iput-object p2, p0, Ln3/d;->b:Lh3/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln3/d;->a:Le3/p;

    iget-object v1, p0, Ln3/d;->b:Lh3/f;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;->$r8$lambda$3IC1EYs9Ov-yyEaKpI5mGVp9EFo(Le3/p;Lh3/f;)V

    return-void
.end method
