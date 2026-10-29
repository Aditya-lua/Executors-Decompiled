.class public final Lzo/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lk6/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lzo/n;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzo/n;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo/n;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/q;->a:Lzo/n;

    iput-object p2, p0, Lzo/q;->b:Lft/i;

    return-void
.end method

.method public static a(Lzo/n;Lft/i;)Lzo/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo/n;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lzo/q;"
        }
    .end annotation

    new-instance v0, Lzo/q;

    invoke-direct {v0, p0, p1}, Lzo/q;-><init>(Lzo/n;Lft/i;)V

    return-object v0
.end method

.method public static c(Lzo/n;Landroid/content/Context;)Lk6/s;
    .locals 0

    invoke-virtual {p0, p1}, Lzo/n;->c(Landroid/content/Context;)Lk6/s;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lk6/s;

    return-object p0
.end method


# virtual methods
.method public b()Lk6/s;
    .locals 2

    iget-object v0, p0, Lzo/q;->a:Lzo/n;

    iget-object v1, p0, Lzo/q;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lzo/q;->c(Lzo/n;Landroid/content/Context;)Lk6/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzo/q;->b()Lk6/s;

    move-result-object v0

    return-object v0
.end method
