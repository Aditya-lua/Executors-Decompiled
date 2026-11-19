.class public final Lp0/g$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/g$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lp0/g$d$a;->a:D

    return-void
.end method


# virtual methods
.method public a()D
    .locals 4

    iget-wide v0, p0, Lp0/g$d$a;->a:D

    const-wide v2, 0x4001e540cc78e9f7L    # 2.23694

    div-double/2addr v0, v2

    return-wide v0
.end method
