.class public abstract Lb4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lb4/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lb4/d;
    .locals 1

    sget-object v0, Lb4/d;->a:Lb4/d;

    if-nez v0, :cond_0

    new-instance v0, Lb4/e;

    invoke-direct {v0}, Lb4/e;-><init>()V

    sput-object v0, Lb4/d;->a:Lb4/d;

    :cond_0
    sget-object v0, Lb4/d;->a:Lb4/d;

    return-object v0
.end method
