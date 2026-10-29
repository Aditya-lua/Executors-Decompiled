.class public final synthetic Lj9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/j;


# static fields
.field public static final synthetic a:Lj9/m;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj9/m;

    invoke-direct {v0}, Lj9/m;-><init>()V

    sput-object v0, Lj9/m;->a:Lj9/m;

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

    sget p1, Lj9/c;->d:I

    const/4 p1, 0x0

    invoke-static {p1}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
