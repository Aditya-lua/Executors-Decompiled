.class public final Lnb/q6;
.super Lw1/i;
.source "SourceFile"


# instance fields
.field public final synthetic j:Lnb/x6;


# direct methods
.method public constructor <init>(Lnb/x6;I)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/q6;->j:Lnb/x6;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lw1/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lnb/q6;->j:Lnb/x6;

    invoke-virtual {v0, p1}, Lnb/x6;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d1;

    move-result-object p1

    return-object p1
.end method
