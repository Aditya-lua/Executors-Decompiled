.class public final Lob/v6;
.super Lw1/i;
.source "SourceFile"


# instance fields
.field public final synthetic j:Lob/c7;


# direct methods
.method public constructor <init>(Lob/c7;I)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/v6;->j:Lob/c7;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lw1/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lob/v6;->j:Lob/c7;

    invoke-virtual {v0, p1}, Lob/c7;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d1;

    move-result-object p1

    return-object p1
.end method
