.class public final Les/i2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/i2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Les/i2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Les/i2;

    invoke-direct {v0}, Les/i2;-><init>()V

    sput-object v0, Les/i2$a;->a:Les/i2;

    return-void
.end method
