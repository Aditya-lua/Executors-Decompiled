.class public final Lhn/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lhn/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhn/j0;

    invoke-direct {v0}, Lhn/j0;-><init>()V

    sput-object v0, Lhn/j0$a;->a:Lhn/j0;

    return-void
.end method
