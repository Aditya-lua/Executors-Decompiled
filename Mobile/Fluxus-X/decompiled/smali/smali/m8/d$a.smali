.class public final Lm8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lm8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/d;

    invoke-direct {v0}, Lm8/d;-><init>()V

    sput-object v0, Lm8/d$a;->a:Lm8/d;

    return-void
.end method

.method public static synthetic a()Lm8/d;
    .locals 1

    sget-object v0, Lm8/d$a;->a:Lm8/d;

    return-object v0
.end method
