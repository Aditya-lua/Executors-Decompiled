.class public Lxe/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxe/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lwe/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/j0<",
            "Lxe/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwe/j0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe/j0<",
            "Lxe/g;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lxe/h$b;->a:Lwe/j0;

    return-void
.end method

.method public synthetic constructor <init>(Lwe/j0;Lxe/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxe/h$b;-><init>(Lwe/j0;)V

    return-void
.end method
