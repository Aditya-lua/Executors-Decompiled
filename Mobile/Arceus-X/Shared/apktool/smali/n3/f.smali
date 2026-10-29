.class public final synthetic Ln3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;

.field public final synthetic b:Le3/x0;


# direct methods
.method public synthetic constructor <init>(Le3/p;Le3/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/f;->a:Le3/p;

    iput-object p2, p0, Ln3/f;->b:Le3/x0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln3/f;->a:Le3/p;

    iget-object v1, p0, Ln3/f;->b:Le3/x0;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;->$r8$lambda$U3ILLa3_hc1ZtJAGyY4cPI9wWZM(Le3/p;Le3/x0;)V

    return-void
.end method
