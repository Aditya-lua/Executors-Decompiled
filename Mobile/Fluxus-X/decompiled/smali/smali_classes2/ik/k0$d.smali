.class public Lik/k0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/h$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lik/k0;->H(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lik/k0;


# direct methods
.method public constructor <init>(Lik/k0;)V
    .locals 0

    iput-object p1, p0, Lik/k0$d;->a:Lik/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "InitHelper"

    const-string v1, "onDidLoginEventFromLua: ... onPostLoginCompleted."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lik/k0$d;->a:Lik/k0;

    invoke-static {v0}, Lik/k0;->j(Lik/k0;)Lik/n0;

    move-result-object v0

    invoke-interface {v0}, Lik/n0;->k0()V

    iget-object v0, p0, Lik/k0$d;->a:Lik/k0;

    invoke-static {v0}, Lik/k0;->h(Lik/k0;)V

    return-void
.end method
