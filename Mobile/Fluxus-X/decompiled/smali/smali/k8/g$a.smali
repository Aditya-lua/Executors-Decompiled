.class public final Lk8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lk8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk8/g;

    invoke-direct {v0}, Lk8/g;-><init>()V

    sput-object v0, Lk8/g$a;->a:Lk8/g;

    return-void
.end method

.method public static synthetic a()Lk8/g;
    .locals 1

    sget-object v0, Lk8/g$a;->a:Lk8/g;

    return-object v0
.end method
