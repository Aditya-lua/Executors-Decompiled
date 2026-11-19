.class public abstract Lvd/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvd/c$a$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lvd/c$a$a;
    .locals 2

    new-instance v0, Lvd/v0;

    invoke-direct {v0}, Lvd/v0;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lvd/v0;->c(I)Lvd/c$a$a;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()J
.end method
