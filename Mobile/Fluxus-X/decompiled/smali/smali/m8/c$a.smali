.class public final Lm8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lm8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/c;

    invoke-direct {v0}, Lm8/c;-><init>()V

    sput-object v0, Lm8/c$a;->a:Lm8/c;

    return-void
.end method

.method public static synthetic a()Lm8/c;
    .locals 1

    sget-object v0, Lm8/c$a;->a:Lm8/c;

    return-object v0
.end method
