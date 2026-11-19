.class public final Lyp/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyp/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lyp/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyp/j;

    invoke-direct {v0}, Lyp/j;-><init>()V

    sput-object v0, Lyp/j$a;->a:Lyp/j;

    return-void
.end method
