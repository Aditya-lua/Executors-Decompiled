.class public final Lum/x;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lum/h<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final a:Lum/h$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lum/x$a;

    invoke-direct {v0}, Lum/x$a;-><init>()V

    sput-object v0, Lum/x;->a:Lum/h$e;

    return-void
.end method
