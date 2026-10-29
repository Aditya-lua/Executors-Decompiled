.class public final Lc1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J


# direct methods
.method public constructor <init>(IIJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc1/d$a;->a:I

    iput p2, p0, Lc1/d$a;->b:I

    iput-wide p3, p0, Lc1/d$a;->c:J

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lc1/d$a;->a:I

    return v0
.end method
