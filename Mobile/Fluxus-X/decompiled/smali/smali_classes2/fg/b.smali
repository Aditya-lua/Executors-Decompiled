.class public Lfg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg/a;


# static fields
.field public static a:Lfg/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lfg/b;
    .locals 1

    sget-object v0, Lfg/b;->a:Lfg/b;

    if-nez v0, :cond_0

    new-instance v0, Lfg/b;

    invoke-direct {v0}, Lfg/b;-><init>()V

    sput-object v0, Lfg/b;->a:Lfg/b;

    :cond_0
    sget-object v0, Lfg/b;->a:Lfg/b;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
