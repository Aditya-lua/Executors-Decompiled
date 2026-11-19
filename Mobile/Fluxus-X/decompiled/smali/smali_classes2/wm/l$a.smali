.class public Lwm/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwm/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lwm/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwm/l;

    invoke-direct {v0}, Lwm/l;-><init>()V

    sput-object v0, Lwm/l$a;->a:Lwm/l;

    return-void
.end method

.method public static bridge synthetic a()Lwm/l;
    .locals 1

    sget-object v0, Lwm/l$a;->a:Lwm/l;

    return-object v0
.end method
