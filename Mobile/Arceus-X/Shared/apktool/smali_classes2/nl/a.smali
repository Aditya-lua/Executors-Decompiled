.class public Lnl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/Boolean;

.field public f:Ljava/lang/Boolean;

.field public g:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lnl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lnl/a;->g:Ljava/lang/Boolean;

    .line 4
    iput-object p1, p0, Lnl/a;->a:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lnl/a;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lnl/a;->g:Ljava/lang/Boolean;

    .line 8
    iput-object p1, p0, Lnl/a;->a:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lnl/a;->b:Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lnl/a;->c:Ljava/lang/Boolean;

    .line 11
    iput-object p4, p0, Lnl/a;->d:Ljava/lang/Boolean;

    .line 12
    iput-object p5, p0, Lnl/a;->e:Ljava/lang/Boolean;

    .line 13
    iput-object p6, p0, Lnl/a;->f:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lnl/a;->a:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lnl/a;->b:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lnl/a;->c:Ljava/lang/Boolean;

    .line 18
    iput-object p4, p0, Lnl/a;->d:Ljava/lang/Boolean;

    .line 19
    iput-object p5, p0, Lnl/a;->e:Ljava/lang/Boolean;

    .line 20
    iput-object p6, p0, Lnl/a;->f:Ljava/lang/Boolean;

    .line 21
    iput-object p7, p0, Lnl/a;->g:Ljava/lang/Boolean;

    return-void
.end method
