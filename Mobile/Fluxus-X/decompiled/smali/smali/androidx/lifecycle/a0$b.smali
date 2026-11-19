.class public Landroidx/lifecycle/a0$b;
.super Landroidx/lifecycle/a0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/a0<",
        "TT;>.d;"
    }
.end annotation


# instance fields
.field public final synthetic e:Landroidx/lifecycle/a0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/e0<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/lifecycle/a0$b;->e:Landroidx/lifecycle/a0;

    invoke-direct {p0, p1, p2}, Landroidx/lifecycle/a0$d;-><init>(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V

    return-void
.end method


# virtual methods
.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
