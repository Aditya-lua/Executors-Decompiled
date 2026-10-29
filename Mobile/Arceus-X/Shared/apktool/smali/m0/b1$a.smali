.class public abstract Lm0/b1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/b1;
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

.method public static c(ILg0/h1;)Lm0/b1$a;
    .locals 1

    new-instance v0, Lm0/i;

    invoke-direct {v0, p0, p1}, Lm0/i;-><init>(ILg0/h1;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lg0/h1;
.end method

.method public abstract b()I
.end method
