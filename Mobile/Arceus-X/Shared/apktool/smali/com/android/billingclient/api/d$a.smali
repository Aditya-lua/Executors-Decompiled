.class public Lcom/android/billingclient/api/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv7/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/d$a;->b:I

    const-string p1, ""

    iput-object p1, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/d;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/android/billingclient/api/d;

    invoke-direct {v0}, Lcom/android/billingclient/api/d;-><init>()V

    iget v1, p0, Lcom/android/billingclient/api/d$a;->a:I

    invoke-static {v0, v1}, Lcom/android/billingclient/api/d;->g(Lcom/android/billingclient/api/d;I)V

    iget v1, p0, Lcom/android/billingclient/api/d$a;->b:I

    invoke-static {v0, v1}, Lcom/android/billingclient/api/d;->f(Lcom/android/billingclient/api/d;I)V

    iget-object v1, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/d;->e(Lcom/android/billingclient/api/d;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/d$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/android/billingclient/api/d$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(I)Lcom/android/billingclient/api/d$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Lcom/android/billingclient/api/d$a;->b:I

    return-object p0
.end method

.method public d(I)Lcom/android/billingclient/api/d$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Lcom/android/billingclient/api/d$a;->a:I

    return-object p0
.end method
