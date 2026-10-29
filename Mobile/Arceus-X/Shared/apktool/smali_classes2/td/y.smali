.class public final synthetic Ltd/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/j;


# instance fields
.field public final synthetic a:Ltd/z;

.field public final synthetic b:Ltd/c$a;


# direct methods
.method public synthetic constructor <init>(Ltd/z;Ltd/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/y;->a:Ltd/z;

    iput-object p2, p0, Ltd/y;->b:Ltd/c$a;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    iget-object v0, p0, Ltd/y;->a:Ltd/z;

    iget-object v1, p0, Ltd/y;->b:Ltd/c$a;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {v0, v1, p1}, Ltd/z;->b(Ltd/c$a;Ljava/lang/Long;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
