.class public Ly0/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:Lzt/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/n<",
            "Lg0/k0;",
            "Lg0/i0;",
            "Lg0/i0;",
            "Lx0/r0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly0/n;

    invoke-direct {v0}, Ly0/n;-><init>()V

    sput-object v0, Ly0/o$a;->a:Lzt/n;

    return-void
.end method

.method public static a(Lg0/k0;Lg0/i0;Lg0/i0;)Lx0/r0;
    .locals 1

    sget-object v0, Ly0/o$a;->a:Lzt/n;

    invoke-interface {v0, p0, p1, p2}, Lzt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx0/r0;

    return-object p0
.end method
