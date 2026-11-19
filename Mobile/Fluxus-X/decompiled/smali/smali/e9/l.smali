.class public final Le9/l;
.super Le9/e;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le9/m;


# direct methods
.method public constructor <init>(Le9/m;)V
    .locals 0

    iput-object p1, p0, Le9/l;->a:Le9/m;

    invoke-direct {p0}, Le9/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final v1(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Le9/l;->a:Le9/m;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h(Ll9/p;)V

    return-void
.end method
