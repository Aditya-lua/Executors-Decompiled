.class public Landroidx/lifecycle/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroidx/lifecycle/d$a;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/i0;->a:Ljava/lang/Object;

    sget-object v0, Landroidx/lifecycle/d;->c:Landroidx/lifecycle/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/d;->c(Ljava/lang/Class;)Landroidx/lifecycle/d$a;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/i0;->b:Landroidx/lifecycle/d$a;

    return-void
.end method


# virtual methods
.method public g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/i0;->b:Landroidx/lifecycle/d$a;

    iget-object v1, p0, Landroidx/lifecycle/i0;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2, v1}, Landroidx/lifecycle/d$a;->a(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;Ljava/lang/Object;)V

    return-void
.end method
