.class public final Ld9/i;
.super Ld9/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ld9/j;


# direct methods
.method public constructor <init>(Ld9/j;)V
    .locals 0

    iput-object p1, p0, Ld9/i;->a:Ld9/j;

    invoke-direct {p0}, Ld9/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final z1(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Ld9/i;->a:Ld9/j;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h(Lk9/n;)V

    return-void
.end method
