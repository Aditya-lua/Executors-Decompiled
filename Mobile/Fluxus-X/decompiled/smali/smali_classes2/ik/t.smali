.class public final synthetic Lik/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lik/x;


# direct methods
.method public synthetic constructor <init>(Lik/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lik/t;->a:Lik/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lik/t;->a:Lik/x;

    invoke-static {v0}, Lik/x;->i(Lik/x;)V

    return-void
.end method
