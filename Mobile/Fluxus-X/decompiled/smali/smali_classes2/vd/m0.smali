.class public abstract Lvd/m0;
.super Lge/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lvd/n0;


# direct methods
.method public constructor <init>(Lvd/n0;Ltb/k;)V
    .locals 0

    iput-object p1, p0, Lvd/m0;->b:Lvd/n0;

    invoke-direct {p0, p2}, Lge/u0;-><init>(Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p1, Lge/g;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lge/u0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v0, p0, Lvd/m0;->b:Lvd/n0;

    invoke-static {v0}, Lvd/n0;->j(Lvd/n0;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lvd/b;

    const/4 v1, -0x2

    invoke-direct {v0, v1, p1}, Lvd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Lge/u0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    new-instance v0, Lvd/b;

    const/16 v1, -0x9

    invoke-direct {v0, v1, p1}, Lvd/b;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Lge/u0;->a(Ljava/lang/Exception;)V

    return-void
.end method
