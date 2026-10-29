.class public abstract Lm0/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lx0/b0;Lg0/f1$h;)Lm0/f0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "[B>;",
            "Lg0/f1$h;",
            ")",
            "Lm0/f0$a;"
        }
    .end annotation

    new-instance v0, Lm0/e;

    invoke-direct {v0, p0, p1}, Lm0/e;-><init>(Lx0/b0;Lg0/f1$h;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lg0/f1$h;
.end method

.method public abstract b()Lx0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation
.end method
