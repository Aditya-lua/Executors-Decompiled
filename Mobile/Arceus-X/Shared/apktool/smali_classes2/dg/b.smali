.class public Ldg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldg/a;


# static fields
.field public static a:Ldg/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Ldg/b;
    .locals 1

    sget-object v0, Ldg/b;->a:Ldg/b;

    if-nez v0, :cond_0

    new-instance v0, Ldg/b;

    invoke-direct {v0}, Ldg/b;-><init>()V

    sput-object v0, Ldg/b;->a:Ldg/b;

    :cond_0
    sget-object v0, Ldg/b;->a:Ldg/b;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
