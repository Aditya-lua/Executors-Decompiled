.class public final Lgp/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgp/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lgp/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgp/k;

    invoke-direct {v0}, Lgp/k;-><init>()V

    sput-object v0, Lgp/k$a;->a:Lgp/k;

    return-void
.end method
