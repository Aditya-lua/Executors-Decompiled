.class public Lcl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcl/d;
    .locals 3

    new-instance v0, Lcl/h;

    invoke-static {}, Lcl/g;->b()Lmv/d0;

    move-result-object v1

    invoke-static {}, Lel/c;->e()Lel/c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcl/h;-><init>(Lmv/d0;Lsw/e$a;)V

    invoke-static {}, Lcl/g;->c()Lcl/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcl/h;->i(Lcl/b;)Lcl/d;

    move-result-object v0

    return-object v0
.end method
