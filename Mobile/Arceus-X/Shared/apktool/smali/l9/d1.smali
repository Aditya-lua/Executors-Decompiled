.class public final Ll9/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/signin/internal/zak;

.field public final synthetic b:Ll9/f1;


# direct methods
.method public constructor <init>(Ll9/f1;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 0

    iput-object p1, p0, Ll9/d1;->b:Ll9/f1;

    iput-object p2, p0, Ll9/d1;->a:Lcom/google/android/gms/signin/internal/zak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll9/d1;->b:Ll9/f1;

    iget-object v1, p0, Ll9/d1;->a:Lcom/google/android/gms/signin/internal/zak;

    invoke-static {v0, v1}, Ll9/f1;->t2(Ll9/f1;Lcom/google/android/gms/signin/internal/zak;)V

    return-void
.end method
