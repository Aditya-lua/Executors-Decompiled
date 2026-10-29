.class public final synthetic Ln0/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lne/x;


# direct methods
.method public synthetic constructor <init>(Lne/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/w1;->a:Lne/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln0/w1;->a:Lne/x;

    invoke-static {v0}, Ln0/x1;->b(Lne/x;)V

    return-void
.end method
