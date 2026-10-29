.class public Lqn/n;
.super Lqn/a;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lqn/d0;->b(Lqn/n;)V

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqn/n;->g:Ljava/lang/String;

    return-object v0
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lqn/n;->g:Ljava/lang/String;

    return-void
.end method
