.class public Leo/a0;
.super Leo/s;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Leo/s;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Leo/s;-><init>()V

    .line 3
    iput-object p1, p0, Leo/a0;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Leo/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Leo/d0;->o(Leo/a0;)V

    return-void
.end method
