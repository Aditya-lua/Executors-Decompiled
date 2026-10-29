.class public final synthetic Lfb/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/u1;


# instance fields
.field public final synthetic a:Lfb/b0;


# direct methods
.method public synthetic constructor <init>(Lfb/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/u;->a:Lfb/b0;

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfb/u;->a:Lfb/b0;

    invoke-virtual {v0}, Lfb/b0;->c()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
