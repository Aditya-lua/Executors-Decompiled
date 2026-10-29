.class public final Lmp/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lg/c<",
        "Landroidx/activity/result/IntentSenderRequest;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lmp/c0;


# direct methods
.method public constructor <init>(Lmp/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/f0;->a:Lmp/c0;

    return-void
.end method

.method public static a(Lmp/c0;)Lmp/f0;
    .locals 1

    new-instance v0, Lmp/f0;

    invoke-direct {v0, p0}, Lmp/f0;-><init>(Lmp/c0;)V

    return-object v0
.end method

.method public static c(Lmp/c0;)Lg/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp/c0;",
            ")",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lmp/c0;->a()Lg/c;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg/c;

    return-object p0
.end method


# virtual methods
.method public b()Lg/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lmp/f0;->a:Lmp/c0;

    invoke-static {v0}, Lmp/f0;->c(Lmp/c0;)Lg/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmp/f0;->b()Lg/c;

    move-result-object v0

    return-object v0
.end method
