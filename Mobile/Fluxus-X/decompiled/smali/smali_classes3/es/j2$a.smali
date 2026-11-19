.class public final Les/j2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/j2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Les/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Les/j2;

    invoke-direct {v0}, Les/j2;-><init>()V

    sput-object v0, Les/j2$a;->a:Les/j2;

    return-void
.end method
