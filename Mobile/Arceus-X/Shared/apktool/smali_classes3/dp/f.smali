.class public final Ldp/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lfo/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ldp/c;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ldp/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldp/c;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp/c;",
            "Lft/i<",
            "Ldp/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/f;->a:Ldp/c;

    iput-object p2, p0, Ldp/f;->b:Lft/i;

    return-void
.end method

.method public static a(Ldp/c;Lft/i;)Ldp/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp/c;",
            "Lft/i<",
            "Ldp/i;",
            ">;)",
            "Ldp/f;"
        }
    .end annotation

    new-instance v0, Ldp/f;

    invoke-direct {v0, p0, p1}, Ldp/f;-><init>(Ldp/c;Lft/i;)V

    return-object v0
.end method

.method public static b(Ldp/c;Ldp/i;)Lfo/a;
    .locals 0

    invoke-virtual {p0, p1}, Ldp/c;->c(Ldp/i;)Lfo/a;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfo/a;

    return-object p0
.end method


# virtual methods
.method public c()Lfo/a;
    .locals 2

    iget-object v0, p0, Ldp/f;->a:Ldp/c;

    iget-object v1, p0, Ldp/f;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldp/i;

    invoke-static {v0, v1}, Ldp/f;->b(Ldp/c;Ldp/i;)Lfo/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldp/f;->c()Lfo/a;

    move-result-object v0

    return-object v0
.end method
