.class public abstract La4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:La4/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()La4/d;
    .locals 1

    sget-object v0, La4/d;->a:La4/d;

    if-nez v0, :cond_0

    new-instance v0, La4/e;

    invoke-direct {v0}, La4/e;-><init>()V

    sput-object v0, La4/d;->a:La4/d;

    :cond_0
    sget-object v0, La4/d;->a:La4/d;

    return-object v0
.end method
