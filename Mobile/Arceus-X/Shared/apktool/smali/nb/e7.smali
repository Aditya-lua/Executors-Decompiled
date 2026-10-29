.class public final Lnb/e7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/x8;

.field public final synthetic b:Lnb/g7;


# direct methods
.method public constructor <init>(Lnb/g7;Lnb/x8;)V
    .locals 0

    iput-object p2, p0, Lnb/e7;->a:Lnb/x8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/e7;->b:Lnb/g7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnb/e7;->b:Lnb/g7;

    iget-object v1, p0, Lnb/e7;->a:Lnb/x8;

    invoke-virtual {v0, v1}, Lnb/g7;->p(Lnb/x8;)V

    iget-object v1, v1, Lnb/x8;->d:Lcom/google/android/gms/internal/measurement/zzdd;

    invoke-virtual {v0, v1}, Lnb/g7;->v(Lcom/google/android/gms/internal/measurement/zzdd;)V

    return-void
.end method
