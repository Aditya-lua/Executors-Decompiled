.class public final Lgp/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgp/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lgp/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgp/m;

    invoke-direct {v0}, Lgp/m;-><init>()V

    sput-object v0, Lgp/m$a;->a:Lgp/m;

    return-void
.end method
