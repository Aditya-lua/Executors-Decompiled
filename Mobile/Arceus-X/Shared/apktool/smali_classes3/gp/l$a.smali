.class public final Lgp/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgp/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lgp/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgp/l;

    invoke-direct {v0}, Lgp/l;-><init>()V

    sput-object v0, Lgp/l$a;->a:Lgp/l;

    return-void
.end method
