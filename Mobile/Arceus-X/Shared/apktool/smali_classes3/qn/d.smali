.class public Lqn/d;
.super Lqn/s;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/s;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lqn/d0;->a(Lqn/d;)V

    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqn/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lqn/d;->g:Ljava/lang/String;

    return-void
.end method
