.class public final synthetic Ly5/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ly5/q1;


# direct methods
.method public synthetic constructor <init>(Ly5/q1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/n1;->a:Ly5/q1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly5/n1;->a:Ly5/q1;

    invoke-static {v0}, Ly5/q1;->c(Ly5/q1;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
