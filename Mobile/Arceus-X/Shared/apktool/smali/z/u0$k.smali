.class public abstract Lz/u0$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "k"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Class;Ln0/o3;Ln0/i4;Landroid/util/Size;Ln0/t3;Ljava/util/List;)Lz/u0$k;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ln0/o3;",
            "Ln0/i4<",
            "*>;",
            "Landroid/util/Size;",
            "Ln0/t3;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;)",
            "Lz/u0$k;"
        }
    .end annotation

    new-instance v0, Lz/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lz/d;-><init>(Ljava/lang/String;Ljava/lang/Class;Ln0/o3;Ln0/i4;Landroid/util/Size;Ln0/t3;Ljava/util/List;)V

    return-object v0
.end method

.method public static b(Lg0/w2;Z)Lz/u0$k;
    .locals 7

    invoke-static {p0}, Lz/u0;->j0(Lg0/w2;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lg0/w2;->z()Ln0/o3;

    move-result-object p1

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->x()Ln0/o3;

    move-result-object p1

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v3

    invoke-virtual {p0}, Lg0/w2;->h()Landroid/util/Size;

    move-result-object v4

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object v5

    invoke-static {p0}, Lz/u0;->f0(Lg0/w2;)Ljava/util/List;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lz/u0$k;->a(Ljava/lang/String;Ljava/lang/Class;Ln0/o3;Ln0/i4;Landroid/util/Size;Ln0/t3;Ljava/util/List;)Lz/u0$k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Ln0/o3;
.end method

.method public abstract e()Ln0/t3;
.end method

.method public abstract f()Landroid/util/Size;
.end method

.method public abstract g()Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method
