.class public abstract Lb8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb8/k$a;,
        Lb8/k$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lb8/k$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lb8/e$b;

    invoke-direct {v0}, Lb8/e$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lb8/a;
.end method

.method public abstract c()Lb8/k$b;
.end method
