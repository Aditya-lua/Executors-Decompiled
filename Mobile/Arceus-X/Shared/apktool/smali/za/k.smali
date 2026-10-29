.class public final Lza/k;
.super Lza/g;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Lza/b;Lsb/k;)V
    .locals 0

    iput-object p2, p0, Lza/k;->a:Lsb/k;

    invoke-direct {p0}, Lza/g;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lza/k;->a:Lsb/k;

    invoke-static {p1, v0}, Ll9/v;->b(Lcom/google/android/gms/common/api/Status;Lsb/k;)V

    return-void
.end method
