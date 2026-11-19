.class public final synthetic Lj9/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/j;


# static fields
.field public static final synthetic a:Lj9/f0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj9/f0;

    invoke-direct {v0}, Lj9/f0;-><init>()V

    sput-object v0, Lj9/f0;->a:Lj9/f0;

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

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p1}, Lj9/c;->e(Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
