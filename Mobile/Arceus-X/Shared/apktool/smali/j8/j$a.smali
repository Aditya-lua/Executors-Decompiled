.class public final Lj8/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lj8/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj8/j;

    invoke-direct {v0}, Lj8/j;-><init>()V

    sput-object v0, Lj8/j$a;->a:Lj8/j;

    return-void
.end method

.method public static synthetic a()Lj8/j;
    .locals 1

    sget-object v0, Lj8/j$a;->a:Lj8/j;

    return-object v0
.end method
