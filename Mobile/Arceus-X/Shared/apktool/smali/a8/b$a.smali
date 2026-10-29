.class public final La8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "La8/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:La8/b$a;

.field public static final b:Lrf/d;

.field public static final c:Lrf/d;

.field public static final d:Lrf/d;

.field public static final e:Lrf/d;

.field public static final f:Lrf/d;

.field public static final g:Lrf/d;

.field public static final h:Lrf/d;

.field public static final i:Lrf/d;

.field public static final j:Lrf/d;

.field public static final k:Lrf/d;

.field public static final l:Lrf/d;

.field public static final m:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La8/b$a;

    invoke-direct {v0}, La8/b$a;-><init>()V

    sput-object v0, La8/b$a;->a:La8/b$a;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->b:Lrf/d;

    const-string v0, "model"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->c:Lrf/d;

    const-string v0, "hardware"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->d:Lrf/d;

    const-string v0, "device"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->e:Lrf/d;

    const-string v0, "product"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->f:Lrf/d;

    const-string v0, "osBuild"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->g:Lrf/d;

    const-string v0, "manufacturer"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->h:Lrf/d;

    const-string v0, "fingerprint"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->i:Lrf/d;

    const-string v0, "locale"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->j:Lrf/d;

    const-string v0, "country"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->k:Lrf/d;

    const-string v0, "mccMnc"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->l:Lrf/d;

    const-string v0, "applicationBuild"

    invoke-static {v0}, Lrf/d;->d(Ljava/lang/String;)Lrf/d;

    move-result-object v0

    sput-object v0, La8/b$a;->m:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La8/a;Lrf/f;)V
    .locals 2

    sget-object v0, La8/b$a;->b:Lrf/d;

    invoke-virtual {p1}, La8/a;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->c:Lrf/d;

    invoke-virtual {p1}, La8/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->d:Lrf/d;

    invoke-virtual {p1}, La8/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->e:Lrf/d;

    invoke-virtual {p1}, La8/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->f:Lrf/d;

    invoke-virtual {p1}, La8/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->g:Lrf/d;

    invoke-virtual {p1}, La8/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->h:Lrf/d;

    invoke-virtual {p1}, La8/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->i:Lrf/d;

    invoke-virtual {p1}, La8/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->j:Lrf/d;

    invoke-virtual {p1}, La8/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->k:Lrf/d;

    invoke-virtual {p1}, La8/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->l:Lrf/d;

    invoke-virtual {p1}, La8/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, La8/b$a;->m:Lrf/d;

    invoke-virtual {p1}, La8/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La8/a;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, La8/b$a;->a(La8/a;Lrf/f;)V

    return-void
.end method
