.class public final synthetic Lvd/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/j;


# instance fields
.field public final synthetic a:Lvd/z;

.field public final synthetic b:Lvd/c$a;


# direct methods
.method public synthetic constructor <init>(Lvd/z;Lvd/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/y;->a:Lvd/z;

    iput-object p2, p0, Lvd/y;->b:Lvd/c$a;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    iget-object v0, p0, Lvd/y;->a:Lvd/z;

    iget-object v1, p0, Lvd/y;->b:Lvd/c$a;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {v0, v1, p1}, Lvd/z;->b(Lvd/c$a;Ljava/lang/Long;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
