.class public final Lv7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/i$a;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lv7/i;->a:Z

    iput-boolean p2, p0, Lv7/i;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLv7/q1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lv7/i;-><init>(ZZ)V

    return-void
.end method

.method public static c()Lv7/i$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lv7/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv7/i$a;-><init>(Lv7/q1;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lv7/i;->a:Z

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lv7/i;->b:Z

    return v0
.end method
