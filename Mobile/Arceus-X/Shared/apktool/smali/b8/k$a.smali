.class public final Lb8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lb8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/k;

    invoke-direct {v0}, Lb8/k;-><init>()V

    sput-object v0, Lb8/k$a;->a:Lb8/k;

    return-void
.end method

.method public static synthetic a()Lb8/k;
    .locals 1

    sget-object v0, Lb8/k$a;->a:Lb8/k;

    return-object v0
.end method
