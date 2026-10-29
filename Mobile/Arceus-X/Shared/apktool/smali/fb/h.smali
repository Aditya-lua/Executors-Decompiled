.class public final Lfb/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lfb/m;


# direct methods
.method public constructor <init>(Lfb/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/h;->a:Lfb/m;

    return-void
.end method

.method public static a(Landroid/app/Application;)Lfb/h;
    .locals 1

    new-instance v0, Lfb/h;

    invoke-static {p0}, Lfb/o;->a(Landroid/app/Application;)Lfb/m;

    move-result-object p0

    invoke-direct {v0, p0}, Lfb/h;-><init>(Lfb/m;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lfb/g;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lfb/f;

    invoke-direct {v0, p1}, Lfb/f;-><init>(Lfb/g;)V

    iget-object p1, p0, Lfb/h;->a:Lfb/m;

    invoke-interface {p1, v0}, Lfb/m;->a(Lfb/l;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
