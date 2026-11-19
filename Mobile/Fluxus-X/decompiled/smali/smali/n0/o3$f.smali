.class public abstract Ln0/o3$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/o3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/o3$f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ln0/u1;)Ln0/o3$f$a;
    .locals 1

    new-instance v0, Ln0/q$b;

    invoke-direct {v0}, Ln0/q$b;-><init>()V

    invoke-virtual {v0, p0}, Ln0/q$b;->g(Ln0/u1;)Ln0/o3$f$a;

    move-result-object p0

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p0, v0}, Ln0/o3$f$a;->e(Ljava/util/List;)Ln0/o3$f$a;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ln0/o3$f$a;->d(Ljava/lang/String;)Ln0/o3$f$a;

    move-result-object p0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Ln0/o3$f$a;->c(I)Ln0/o3$f$a;

    move-result-object p0

    invoke-virtual {p0, v0}, Ln0/o3$f$a;->f(I)Ln0/o3$f$a;

    move-result-object p0

    sget-object v0, Lg0/k0;->d:Lg0/k0;

    invoke-virtual {p0, v0}, Ln0/o3$f$a;->b(Lg0/k0;)Ln0/o3$f$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lg0/k0;
.end method

.method public abstract c()I
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()Ln0/u1;
.end method

.method public abstract g()I
.end method
