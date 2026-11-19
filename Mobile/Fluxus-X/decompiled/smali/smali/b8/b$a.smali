.class public final Lb8/b$a;
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
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltf/e<",
        "Lb8/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lb8/b$a;

.field public static final b:Ltf/d;

.field public static final c:Ltf/d;

.field public static final d:Ltf/d;

.field public static final e:Ltf/d;

.field public static final f:Ltf/d;

.field public static final g:Ltf/d;

.field public static final h:Ltf/d;

.field public static final i:Ltf/d;

.field public static final j:Ltf/d;

.field public static final k:Ltf/d;

.field public static final l:Ltf/d;

.field public static final m:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb8/b$a;

    invoke-direct {v0}, Lb8/b$a;-><init>()V

    sput-object v0, Lb8/b$a;->a:Lb8/b$a;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->b:Ltf/d;

    const-string v0, "model"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->c:Ltf/d;

    const-string v0, "hardware"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->d:Ltf/d;

    const-string v0, "device"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->e:Ltf/d;

    const-string v0, "product"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->f:Ltf/d;

    const-string v0, "osBuild"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->g:Ltf/d;

    const-string v0, "manufacturer"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->h:Ltf/d;

    const-string v0, "fingerprint"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->i:Ltf/d;

    const-string v0, "locale"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->j:Ltf/d;

    const-string v0, "country"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->k:Ltf/d;

    const-string v0, "mccMnc"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->l:Ltf/d;

    const-string v0, "applicationBuild"

    invoke-static {v0}, Ltf/d;->d(Ljava/lang/String;)Ltf/d;

    move-result-object v0

    sput-object v0, Lb8/b$a;->m:Ltf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb8/a;Ltf/f;)V
    .locals 2

    sget-object v0, Lb8/b$a;->b:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->c:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->d:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->e:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->f:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->g:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->h:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->i:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->j:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->k:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->l:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lb8/b$a;->m:Ltf/d;

    invoke-virtual {p1}, Lb8/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb8/a;

    check-cast p2, Ltf/f;

    invoke-virtual {p0, p1, p2}, Lb8/b$a;->a(Lb8/a;Ltf/f;)V

    return-void
.end method
