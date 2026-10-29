.class public Lqn/g;
.super Lqn/s;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqn/s;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lqn/s;-><init>()V

    .line 3
    iput-object p1, p0, Lqn/g;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lqn/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lqn/d0;->g(Lqn/g;)V

    return-void
.end method
