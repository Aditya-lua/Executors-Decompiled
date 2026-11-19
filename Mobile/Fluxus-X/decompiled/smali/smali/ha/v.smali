.class public final Lha/v;
.super Lha/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm9/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lha/b;-><init>(Lm9/d;)V

    return-void
.end method


# virtual methods
.method public final e()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lea/y;->a(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p0, v0}, Lha/b;->s2(Ljava/lang/Object;)V

    return-void
.end method
