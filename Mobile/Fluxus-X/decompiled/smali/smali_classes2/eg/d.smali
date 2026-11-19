.class public abstract Leg/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leg/d$a;,
        Leg/d$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Leg/d$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Leg/a$b;

    invoke-direct {v0}, Leg/a$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Leg/f;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Leg/d$b;
.end method

.method public abstract f()Ljava/lang/String;
.end method
