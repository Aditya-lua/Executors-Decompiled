.class public abstract Lne/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lne/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lne/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lne/h;Ljava/util/Set;Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/h<",
            "*>;",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract b(Lne/h;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/h<",
            "*>;)I"
        }
    .end annotation
.end method
