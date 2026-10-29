.class public final Ln9/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/accounts/Account;

.field public b:Lw1/b;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public final e:Lpb/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lpb/a;->j:Lpb/a;

    iput-object v0, p0, Ln9/d$a;->e:Lpb/a;

    return-void
.end method


# virtual methods
.method public a()Ln9/d;
    .locals 10
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ln9/d;

    iget-object v1, p0, Ln9/d$a;->a:Landroid/accounts/Account;

    iget-object v2, p0, Ln9/d$a;->b:Lw1/b;

    iget-object v6, p0, Ln9/d$a;->c:Ljava/lang/String;

    iget-object v7, p0, Ln9/d$a;->d:Ljava/lang/String;

    iget-object v8, p0, Ln9/d$a;->e:Lpb/a;

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v9}, Ln9/d;-><init>(Landroid/accounts/Account;Ljava/util/Set;Ljava/util/Map;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Lpb/a;Z)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ln9/d$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Ln9/d$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/util/Collection;)Ln9/d$a;
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ln9/d$a;->b:Lw1/b;

    if-nez v0, :cond_0

    new-instance v0, Lw1/b;

    invoke-direct {v0}, Lw1/b;-><init>()V

    iput-object v0, p0, Ln9/d$a;->b:Lw1/b;

    :cond_0
    iget-object v0, p0, Ln9/d$a;->b:Lw1/b;

    invoke-virtual {v0, p1}, Lw1/b;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final d(Landroid/accounts/Account;)Ln9/d$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Ln9/d$a;->a:Landroid/accounts/Account;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Ln9/d$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Ln9/d$a;->d:Ljava/lang/String;

    return-object p0
.end method
