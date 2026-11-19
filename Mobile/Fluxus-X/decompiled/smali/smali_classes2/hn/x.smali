.class public final Lhn/x;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lhn/h<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final a:Lhn/h$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhn/x$a;

    invoke-direct {v0}, Lhn/x$a;-><init>()V

    sput-object v0, Lhn/x;->a:Lhn/h$e;

    return-void
.end method
