.class public abstract Ld8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lm8/a;Lm8/a;Ljava/lang/String;)Ld8/h;
    .locals 1

    new-instance v0, Ld8/c;

    invoke-direct {v0, p0, p1, p2, p3}, Ld8/c;-><init>(Landroid/content/Context;Lm8/a;Lm8/a;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/content/Context;
.end method

.method public abstract c()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract d()Lm8/a;
.end method

.method public abstract e()Lm8/a;
.end method
