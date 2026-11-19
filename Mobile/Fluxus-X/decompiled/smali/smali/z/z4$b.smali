.class public Lz/z4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/q3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/z4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u;",
            ">;"
        }
    .end annotation
.end field

.field public final b:I

.field public c:Ln0/e0;


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ln0/u;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lz/z4$b;->c:Ln0/e0;

    .line 4
    iput p1, p0, Lz/z4$b;->b:I

    .line 5
    iput-object p2, p0, Lz/z4$b;->a:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lz/z4$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lz/z4$b;-><init>(ILjava/util/List;)V

    return-void
.end method
