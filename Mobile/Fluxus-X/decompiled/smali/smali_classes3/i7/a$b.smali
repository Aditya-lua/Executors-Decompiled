.class public final Li7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li7/m;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Li7/u;


# direct methods
.method public constructor <init>(Li7/u;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li7/a$b;->a:Ljava/util/List;

    .line 4
    iput-object p1, p0, Li7/a$b;->b:Li7/u;

    return-void
.end method

.method public synthetic constructor <init>(Li7/u;Li7/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Li7/a$b;-><init>(Li7/u;)V

    return-void
.end method

.method public static synthetic a(Li7/a$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li7/a$b;->a:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic b(Li7/a$b;)Li7/u;
    .locals 0

    iget-object p0, p0, Li7/a$b;->b:Li7/u;

    return-object p0
.end method
