.class public Lr7/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr7/n0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr7/n0<",
        "Lu7/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lr7/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr7/g0;

    invoke-direct {v0}, Lr7/g0;-><init>()V

    sput-object v0, Lr7/g0;->a:Lr7/g0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ls7/c;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr7/g0;->b(Ls7/c;F)Lu7/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Ls7/c;F)Lu7/d;
    .locals 4

    invoke-virtual {p1}, Ls7/c;->p()Ls7/c$b;

    move-result-object v0

    sget-object v1, Ls7/c$b;->a:Ls7/c$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ls7/c;->b()V

    :cond_1
    invoke-virtual {p1}, Ls7/c;->h()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {p1}, Ls7/c;->h()D

    move-result-wide v2

    double-to-float v2, v2

    :goto_1
    invoke-virtual {p1}, Ls7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Ls7/c;->w()V

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ls7/c;->d()V

    :cond_3
    new-instance p1, Lu7/d;

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr v1, v0

    mul-float/2addr v1, p2

    div-float/2addr v2, v0

    mul-float/2addr v2, p2

    invoke-direct {p1, v1, v2}, Lu7/d;-><init>(FF)V

    return-object p1
.end method
