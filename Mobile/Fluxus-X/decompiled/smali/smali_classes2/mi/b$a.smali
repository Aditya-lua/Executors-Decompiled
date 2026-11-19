.class public Lmi/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lmi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmi/b;

    invoke-direct {v0}, Lmi/b;-><init>()V

    sput-object v0, Lmi/b$a;->a:Lmi/b;

    return-void
.end method

.method public static bridge synthetic a()Lmi/b;
    .locals 1

    sget-object v0, Lmi/b$a;->a:Lmi/b;

    return-object v0
.end method
