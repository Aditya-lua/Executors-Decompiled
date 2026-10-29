.class public final synthetic Lnb/ye;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/bf;


# direct methods
.method public synthetic constructor <init>(Lnb/bf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/ye;->a:Lnb/bf;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    iget-object v0, p0, Lnb/ye;->a:Lnb/bf;

    invoke-virtual {v0}, Lnb/bf;->a()V

    return-void
.end method
