.class public Lz/n5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/n5;->h(Landroid/hardware/camera2/CameraDevice;Lb0/o;Ljava/util/List;)Lne/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lz/n5;


# direct methods
.method public constructor <init>(Lz/n5;)V
    .locals 0

    iput-object p1, p0, Lz/n5$a;->a:Lz/n5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lz/n5$a;->a:Lz/n5;

    invoke-virtual {p1}, Lz/n5;->c()V

    iget-object p1, p0, Lz/n5$a;->a:Lz/n5;

    iget-object v0, p1, Lz/n5;->b:Lz/o3;

    invoke-virtual {v0, p1}, Lz/o3;->i(Lz/h5;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lz/n5$a;->a(Ljava/lang/Void;)V

    return-void
.end method
