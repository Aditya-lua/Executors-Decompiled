.class public final Lgp/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgp/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lgp/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgp/o;

    invoke-direct {v0}, Lgp/o;-><init>()V

    sput-object v0, Lgp/o$a;->a:Lgp/o;

    return-void
.end method
