.class public final Lk8/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lk8/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk8/j;

    invoke-direct {v0}, Lk8/j;-><init>()V

    sput-object v0, Lk8/j$a;->a:Lk8/j;

    return-void
.end method

.method public static synthetic a()Lk8/j;
    .locals 1

    sget-object v0, Lk8/j$a;->a:Lk8/j;

    return-object v0
.end method
