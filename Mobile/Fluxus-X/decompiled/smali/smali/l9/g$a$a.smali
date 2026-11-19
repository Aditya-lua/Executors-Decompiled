.class public Ll9/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lm9/s;

.field public b:Landroid/os/Looper;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ll9/g$a;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/g$a$a;->a:Lm9/s;

    if-nez v0, :cond_0

    new-instance v0, Lm9/a;

    invoke-direct {v0}, Lm9/a;-><init>()V

    iput-object v0, p0, Ll9/g$a$a;->a:Lm9/s;

    :cond_0
    iget-object v0, p0, Ll9/g$a$a;->b:Landroid/os/Looper;

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Ll9/g$a$a;->b:Landroid/os/Looper;

    :cond_1
    new-instance v0, Ll9/g$a;

    iget-object v1, p0, Ll9/g$a$a;->a:Lm9/s;

    iget-object v2, p0, Ll9/g$a$a;->b:Landroid/os/Looper;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Ll9/g$a;-><init>(Lm9/s;Landroid/accounts/Account;Landroid/os/Looper;Ll9/t;)V

    return-object v0
.end method

.method public b(Lm9/s;)Ll9/g$a$a;
    .locals 1
    .param p1    # Lm9/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "StatusExceptionMapper must not be null."

    invoke-static {p1, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll9/g$a$a;->a:Lm9/s;

    return-object p0
.end method
