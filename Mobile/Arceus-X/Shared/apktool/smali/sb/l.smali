.class public final Lsb/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsb/l0;

    invoke-direct {v0}, Lsb/l0;-><init>()V

    sput-object v0, Lsb/l;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lsb/k0;

    invoke-direct {v0}, Lsb/k0;-><init>()V

    sput-object v0, Lsb/l;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
