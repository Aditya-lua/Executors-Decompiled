.class public final synthetic Lka/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/c;


# instance fields
.field public final synthetic a:Lfb/n1;

.field public final synthetic b:Lfb/n1;


# direct methods
.method public synthetic constructor <init>(Lfb/n1;Lfb/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/b;->a:Lfb/n1;

    iput-object p2, p0, Lka/b;->b:Lfb/n1;

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lka/b;->a:Lfb/n1;

    iget-object v1, p0, Lka/b;->b:Lfb/n1;

    invoke-static {v0, v1, p1}, Lka/d;->d(Lfb/n1;Lfb/n1;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;

    move-result-object p1

    return-object p1
.end method
