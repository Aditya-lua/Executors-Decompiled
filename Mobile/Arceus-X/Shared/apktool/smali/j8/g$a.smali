.class public final Lj8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lj8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj8/g;

    invoke-direct {v0}, Lj8/g;-><init>()V

    sput-object v0, Lj8/g$a;->a:Lj8/g;

    return-void
.end method

.method public static synthetic a()Lj8/g;
    .locals 1

    sget-object v0, Lj8/g$a;->a:Lj8/g;

    return-object v0
.end method
