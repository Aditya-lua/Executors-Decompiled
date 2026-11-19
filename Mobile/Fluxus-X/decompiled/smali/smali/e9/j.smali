.class public final Le9/j;
.super Le9/e;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le9/k;


# direct methods
.method public constructor <init>(Le9/k;)V
    .locals 0

    iput-object p1, p0, Le9/j;->a:Le9/k;

    invoke-direct {p0}, Le9/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final C1(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Le9/j;->a:Le9/k;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h(Ll9/p;)V

    return-void
.end method
