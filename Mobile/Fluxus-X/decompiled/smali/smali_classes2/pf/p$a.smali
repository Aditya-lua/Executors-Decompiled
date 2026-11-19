.class public Lpf/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpf/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpf/p;-><init>(Lpf/p$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpf/p$b<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lpf/p;


# direct methods
.method public constructor <init>(Lpf/p;)V
    .locals 0

    iput-object p1, p0, Lpf/p$a;->a:Lpf/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpf/p$a;->a:Lpf/p;

    invoke-static {v0, p1}, Lpf/p;->C(Lpf/p;Ljava/lang/Throwable;)Z

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iget-object v0, p0, Lpf/p$a;->a:Lpf/p;

    invoke-static {v0, p1}, Lpf/p;->B(Lpf/p;Ljava/lang/Object;)Z

    return-void
.end method
