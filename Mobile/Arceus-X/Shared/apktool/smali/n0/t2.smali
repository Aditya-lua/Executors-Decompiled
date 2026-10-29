.class public final synthetic Ln0/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/u2;


# direct methods
.method public synthetic constructor <init>(Ln0/u2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/t2;->a:Ln0/u2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln0/t2;->a:Ln0/u2;

    invoke-static {v0}, Ln0/u2;->i(Ln0/u2;)V

    return-void
.end method
