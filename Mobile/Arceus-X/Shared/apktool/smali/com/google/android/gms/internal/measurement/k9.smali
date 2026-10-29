.class public final synthetic Lcom/google/android/gms/internal/measurement/k9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhe/s;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/k9;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/l9;->g:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k9;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/x8;->a(Landroid/content/Context;)Lhe/k;

    move-result-object v0

    return-object v0
.end method
