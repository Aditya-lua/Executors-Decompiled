.class public final Ll8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ll8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll8/c;

    invoke-direct {v0}, Ll8/c;-><init>()V

    sput-object v0, Ll8/c$a;->a:Ll8/c;

    return-void
.end method

.method public static synthetic a()Ll8/c;
    .locals 1

    sget-object v0, Ll8/c$a;->a:Ll8/c;

    return-object v0
.end method
