.class public final synthetic Ln0/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/g1$b;


# direct methods
.method public synthetic constructor <init>(Ln0/g1$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/f1;->a:Ln0/g1$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln0/f1;->a:Ln0/g1$b;

    invoke-interface {v0}, Ln0/g1$b;->a()V

    return-void
.end method
