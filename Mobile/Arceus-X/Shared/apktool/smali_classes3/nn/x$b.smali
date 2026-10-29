.class public Lnn/x$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lqn/q;

.field public final b:I


# direct methods
.method public constructor <init>(Lqn/q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnn/x$b;->a:Lqn/q;

    iput p2, p0, Lnn/x$b;->b:I

    return-void
.end method
