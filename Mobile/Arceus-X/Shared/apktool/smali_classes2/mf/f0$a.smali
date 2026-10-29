.class public Lmf/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvf/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmf/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Lvf/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lvf/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Lvf/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/f0$a;->a:Ljava/util/Set;

    iput-object p2, p0, Lmf/f0$a;->b:Lvf/c;

    return-void
.end method
