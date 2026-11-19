.class public final Lmi/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmi/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lmi/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmi/k;

    invoke-direct {v0}, Lmi/k;-><init>()V

    sput-object v0, Lmi/k$a;->a:Lmi/k;

    return-void
.end method

.method public static bridge synthetic a()Lmi/k;
    .locals 1

    sget-object v0, Lmi/k$a;->a:Lmi/k;

    return-object v0
.end method
