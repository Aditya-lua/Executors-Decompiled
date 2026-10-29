.class public final synthetic Lwl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lwd/b;

.field public final synthetic b:Lj/b;


# direct methods
.method public synthetic constructor <init>(Lwd/b;Lj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwl/a;->a:Lwd/b;

    iput-object p2, p0, Lwl/a;->b:Lj/b;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lwl/a;->a:Lwd/b;

    iget-object v1, p0, Lwl/a;->b:Lj/b;

    invoke-static {v0, v1, p1}, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->b(Lwd/b;Lj/b;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
