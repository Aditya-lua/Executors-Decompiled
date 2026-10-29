.class public final Ltr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ltr/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ltr/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Ltr/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltr/c;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Ltr/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Ltr/a;",
            ">;)",
            "Ltr/c;"
        }
    .end annotation

    new-instance v0, Ltr/c;

    invoke-direct {v0, p0}, Ltr/c;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Ltr/a;)Ltr/b$a;
    .locals 1

    new-instance v0, Ltr/b$a;

    invoke-direct {v0, p0}, Ltr/b$a;-><init>(Ltr/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Ltr/b$a;
    .locals 1

    iget-object v0, p0, Ltr/c;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltr/a;

    invoke-static {v0}, Ltr/c;->c(Ltr/a;)Ltr/b$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltr/c;->b()Ltr/b$a;

    move-result-object v0

    return-object v0
.end method
