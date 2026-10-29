.class public final Lh8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Li8/f;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lht/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht/a<",
            "Ll8/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lht/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Ll8/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/g;->a:Lht/a;

    return-void
.end method

.method public static a(Ll8/a;)Li8/f;
    .locals 1

    invoke-static {p0}, Lh8/f;->a(Ll8/a;)Li8/f;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Ld8/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li8/f;

    return-object p0
.end method

.method public static b(Lht/a;)Lh8/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht/a<",
            "Ll8/a;",
            ">;)",
            "Lh8/g;"
        }
    .end annotation

    new-instance v0, Lh8/g;

    invoke-direct {v0, p0}, Lh8/g;-><init>(Lht/a;)V

    return-object v0
.end method


# virtual methods
.method public c()Li8/f;
    .locals 1

    iget-object v0, p0, Lh8/g;->a:Lht/a;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll8/a;

    invoke-static {v0}, Lh8/g;->a(Ll8/a;)Li8/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh8/g;->c()Li8/f;

    move-result-object v0

    return-object v0
.end method
