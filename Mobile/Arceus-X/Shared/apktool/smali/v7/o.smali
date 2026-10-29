.class public final Lv7/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/o$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z


# direct methods
.method public synthetic constructor <init>(Lv7/o$a;Lv7/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lv7/o$a;->c(Lv7/o$a;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lv7/o;->a:Ljava/lang/String;

    invoke-static {p1}, Lv7/o$a;->d(Lv7/o$a;)Z

    move-result p1

    iput-boolean p1, p0, Lv7/o;->b:Z

    return-void
.end method

.method public static b()Lv7/o$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lv7/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv7/o$a;-><init>(Lv7/z1;)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lv7/o;->b:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lv7/o;->a:Ljava/lang/String;

    return-object v0
.end method
