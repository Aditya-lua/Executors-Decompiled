.class public Lze/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lze/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lze/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lye/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/j0<",
            "Lze/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lye/j0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lye/j0<",
            "Lze/g;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lze/h$b;->a:Lye/j0;

    return-void
.end method

.method public synthetic constructor <init>(Lye/j0;Lze/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lze/h$b;-><init>(Lye/j0;)V

    return-void
.end method
