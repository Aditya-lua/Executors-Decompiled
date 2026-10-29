.class public Ldk/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldk/e;->b(Landroidx/lifecycle/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/e0<",
        "Lol/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ldk/e;


# direct methods
.method public constructor <init>(Ldk/e;)V
    .locals 0

    iput-object p1, p0, Ldk/e$a;->a:Ldk/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lol/a;

    invoke-virtual {p0, p1}, Ldk/e$a;->b(Lol/a;)V

    return-void
.end method

.method public b(Lol/a;)V
    .locals 1

    iget-object v0, p0, Ldk/e$a;->a:Ldk/e;

    invoke-static {v0}, Ldk/e;->a(Ldk/e;)Ldk/e$b;

    move-result-object v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lfk/c;->k:Lol/a;

    :goto_0
    invoke-interface {v0, p1}, Ldk/e$b;->u(Lol/a;)V

    return-void
.end method
