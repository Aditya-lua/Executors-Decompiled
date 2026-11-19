.class public final Ltb/l;
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

    new-instance v0, Ltb/l0;

    invoke-direct {v0}, Ltb/l0;-><init>()V

    sput-object v0, Ltb/l;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Ltb/k0;

    invoke-direct {v0}, Ltb/k0;-><init>()V

    sput-object v0, Ltb/l;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
