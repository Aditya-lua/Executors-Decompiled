.class public Lcom/google/android/material/progressindicator/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/progressindicator/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/progressindicator/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/progressindicator/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/progressindicator/a$b;->a:Lcom/google/android/material/progressindicator/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/progressindicator/a$b;->a:Lcom/google/android/material/progressindicator/a;

    invoke-static {v0}, Lcom/google/android/material/progressindicator/a;->b(Lcom/google/android/material/progressindicator/a;)V

    iget-object v0, p0, Lcom/google/android/material/progressindicator/a$b;->a:Lcom/google/android/material/progressindicator/a;

    const-wide/16 v1, -0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/material/progressindicator/a;->c(Lcom/google/android/material/progressindicator/a;J)J

    return-void
.end method
