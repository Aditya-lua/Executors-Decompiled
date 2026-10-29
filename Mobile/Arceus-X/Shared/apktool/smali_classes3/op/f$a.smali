.class public final Lop/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lop/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lop/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lop/f;

    invoke-direct {v0}, Lop/f;-><init>()V

    sput-object v0, Lop/f$a;->a:Lop/f;

    return-void
.end method
