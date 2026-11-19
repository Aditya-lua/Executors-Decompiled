.class public final synthetic Lik/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lik/x;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lik/x;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lik/n;->a:Lik/x;

    iput-object p2, p0, Lik/n;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lik/n;->a:Lik/x;

    iget-object v1, p0, Lik/n;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lik/x;->j(Lik/x;Ljava/lang/String;)V

    return-void
.end method
