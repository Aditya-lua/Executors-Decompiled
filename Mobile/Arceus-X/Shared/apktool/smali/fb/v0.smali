.class public final Lfb/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lfb/t0;

.field public static volatile b:Lfb/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfb/u0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfb/u0;-><init>([B)V

    sput-object v0, Lfb/v0;->a:Lfb/t0;

    sput-object v0, Lfb/v0;->b:Lfb/t0;

    return-void
.end method

.method public static a()Lfb/t0;
    .locals 1

    sget-object v0, Lfb/v0;->b:Lfb/t0;

    return-object v0
.end method
