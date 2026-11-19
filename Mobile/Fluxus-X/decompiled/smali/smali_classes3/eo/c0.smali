.class public Leo/c0;
.super Leo/a;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leo/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Leo/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Leo/d0;->A(Leo/c0;)V

    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Leo/c0;->g:Ljava/lang/String;

    return-void
.end method
