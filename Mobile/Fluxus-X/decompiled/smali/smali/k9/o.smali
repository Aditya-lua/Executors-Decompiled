.class public final synthetic Lk9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/j;


# static fields
.field public static final synthetic a:Lk9/o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk9/o;

    invoke-direct {v0}, Lk9/o;-><init>()V

    sput-object v0, Lk9/o;->a:Lk9/o;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, Ljava/util/Map;

    sget p1, Lk9/e;->d:I

    const/4 p1, 0x0

    invoke-static {p1}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
