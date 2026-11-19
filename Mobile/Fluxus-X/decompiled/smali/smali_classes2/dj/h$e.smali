.class public Ldj/h$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldj/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# static fields
.field public static final a:Ldj/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldj/h;

    invoke-direct {v0}, Ldj/h;-><init>()V

    sput-object v0, Ldj/h$e;->a:Ldj/h;

    return-void
.end method

.method public static bridge synthetic a()Ldj/h;
    .locals 1

    sget-object v0, Ldj/h$e;->a:Ldj/h;

    return-object v0
.end method
