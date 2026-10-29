.class public Lqn/c;
.super Lqn/q;
.source "SourceFile"


# instance fields
.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lqn/d0;->q(Lqn/c;)V

    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqn/c;->h:Ljava/lang/String;

    return-object v0
.end method

.method public s(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lqn/c;->h:Ljava/lang/String;

    return-void
.end method
