.class public final Lj8/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lj8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj8/i;

    invoke-direct {v0}, Lj8/i;-><init>()V

    sput-object v0, Lj8/i$a;->a:Lj8/i;

    return-void
.end method

.method public static synthetic a()Lj8/i;
    .locals 1

    sget-object v0, Lj8/i$a;->a:Lj8/i;

    return-object v0
.end method
