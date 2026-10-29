.class public final Lua/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Lua/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/g;

    invoke-direct {v0}, Lua/g;-><init>()V

    sput-object v0, Lua/i;->a:Lua/h;

    return-void
.end method

.method public static a()V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1c
    .end annotation

    return-void
.end method

.method public static b(I)V
    .locals 0

    return-void
.end method
