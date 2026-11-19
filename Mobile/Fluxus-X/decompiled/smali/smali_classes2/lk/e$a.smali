.class public Llk/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llk/e;->b(Landroidx/lifecycle/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/e0<",
        "Lcm/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Llk/e;


# direct methods
.method public constructor <init>(Llk/e;)V
    .locals 0

    iput-object p1, p0, Llk/e$a;->a:Llk/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcm/a;

    invoke-virtual {p0, p1}, Llk/e$a;->b(Lcm/a;)V

    return-void
.end method

.method public b(Lcm/a;)V
    .locals 1

    iget-object v0, p0, Llk/e$a;->a:Llk/e;

    invoke-static {v0}, Llk/e;->a(Llk/e;)Llk/e$b;

    move-result-object v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lnk/c;->k:Lcm/a;

    :goto_0
    invoke-interface {v0, p1}, Llk/e$b;->g0(Lcm/a;)V

    return-void
.end method
