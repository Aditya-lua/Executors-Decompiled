.class public final Lb8/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltf/e<",
        "Lb8/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lb8/b$f;

.field public static final b:Ltf/d;

.field public static final c:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/b$f;

    invoke-direct {v0}, Lb8/b$f;-><init>()V

    sput-object v0, Lb8/b$f;->a:Lb8/b$f;

    const-string v0, "networkType"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$f;->b:Ltf/d;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$f;->c:Ltf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb8/o;Ltf/f;)V
    .locals 2

    sget-object v0, Lb8/b$f;->b:Ltf/d;

    invoke-virtual {p1}, Lb8/o;->c()Lb8/o$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$f;->c:Ltf/d;

    invoke-virtual {p1}, Lb8/o;->b()Lb8/o$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb8/o;

    check-cast p2, Ltf/f;

    invoke-virtual {p0, p1, p2}, Lb8/b$f;->a(Lb8/o;Ltf/f;)V

    return-void
.end method
