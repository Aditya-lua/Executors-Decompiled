.class public Lfj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgi/a;


# instance fields
.field private isInApp:Z

.field private isRetry:Z

.field private orderId:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lv7/k;ZZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lv7/k;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lfj/d;->packageName:Ljava/lang/String;

    invoke-static {p1}, Lfj/b;->j(Lv7/k;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lfj/d;->productId:Ljava/lang/String;

    invoke-virtual {p1}, Lv7/k;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lfj/d;->orderId:Ljava/lang/String;

    iput-boolean p2, p0, Lfj/d;->isRetry:Z

    invoke-virtual {p1}, Lv7/k;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lfj/d;->token:Ljava/lang/String;

    iput-boolean p3, p0, Lfj/d;->isInApp:Z

    return-void
.end method
