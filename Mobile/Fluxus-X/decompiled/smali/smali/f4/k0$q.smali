.class public Lf4/k0$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/k0$p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "q"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final synthetic d:Lf4/k0;


# direct methods
.method public constructor <init>(Lf4/k0;Ljava/lang/String;II)V
    .locals 0

    iput-object p1, p0, Lf4/k0$q;->d:Lf4/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf4/k0$q;->a:Ljava/lang/String;

    iput p3, p0, Lf4/k0$q;->b:I

    iput p4, p0, Lf4/k0$q;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 6
    .param p1    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lf4/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lf4/k0$q;->d:Lf4/k0;

    iget-object v0, v0, Lf4/k0;->A:Lf4/q;

    if-eqz v0, :cond_0

    iget v1, p0, Lf4/k0$q;->b:I

    if-gez v1, :cond_0

    iget-object v1, p0, Lf4/k0$q;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lf4/q;->u()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->d1()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lf4/k0$q;->d:Lf4/k0;

    iget-object v3, p0, Lf4/k0$q;->a:Ljava/lang/String;

    iget v4, p0, Lf4/k0$q;->b:I

    iget v5, p0, Lf4/k0$q;->c:I

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lf4/k0;->g1(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p1

    return p1
.end method
