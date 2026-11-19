.class public Lye/y$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lye/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lye/y$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lye/y$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lye/t;Ljava/lang/String;Ljava/lang/String;)Lye/s$a;
    .locals 0

    sget-object p1, Lye/u;->a:Lye/s$a;

    return-object p1
.end method
