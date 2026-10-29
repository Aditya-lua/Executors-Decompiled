.class public abstract Lcg/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcg/d$a;,
        Lcg/d$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcg/d$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcg/a$b;

    invoke-direct {v0}, Lcg/a$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcg/f;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Lcg/d$b;
.end method

.method public abstract f()Ljava/lang/String;
.end method
