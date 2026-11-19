.class public Leo/l;
.super Leo/s;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leo/s;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Leo/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Leo/d0;->r(Leo/l;)V

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Leo/l;->g:Ljava/lang/String;

    return-void
.end method
