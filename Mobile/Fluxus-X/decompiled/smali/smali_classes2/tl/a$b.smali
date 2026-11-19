.class public Ltl/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltl/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Ltl/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltl/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltl/a;-><init>(Ltl/b;)V

    sput-object v0, Ltl/a$b;->a:Ltl/a;

    return-void
.end method

.method public static bridge synthetic a()Ltl/a;
    .locals 1

    sget-object v0, Ltl/a$b;->a:Ltl/a;

    return-object v0
.end method
