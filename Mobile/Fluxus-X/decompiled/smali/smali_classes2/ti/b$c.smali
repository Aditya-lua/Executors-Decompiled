.class public Lti/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lti/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lti/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lti/b;

    invoke-direct {v0}, Lti/b;-><init>()V

    sput-object v0, Lti/b$c;->a:Lti/b;

    return-void
.end method

.method public static bridge synthetic a()Lti/b;
    .locals 1

    sget-object v0, Lti/b$c;->a:Lti/b;

    return-object v0
.end method
