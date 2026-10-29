.class public final Lcom/google/firebase/messaging/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/messaging/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrf/e<",
        "Lfg/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/firebase/messaging/a$a;

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

.field public static final n:Lrf/d;

.field public static final o:Lrf/d;

.field public static final p:Lrf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/messaging/a$a;

    invoke-direct {v0}, Lcom/google/firebase/messaging/a$a;-><init>()V

    sput-object v0, Lcom/google/firebase/messaging/a$a;->a:Lcom/google/firebase/messaging/a$a;

    const-string v0, "projectNumber"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->b:Lrf/d;

    const-string v0, "messageId"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->c:Lrf/d;

    const-string v0, "instanceId"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->d:Lrf/d;

    const-string v0, "messageType"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->e:Lrf/d;

    const-string v0, "sdkPlatform"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->f:Lrf/d;

    const-string v0, "packageName"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->g:Lrf/d;

    const-string v0, "collapseKey"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->h:Lrf/d;

    const-string v0, "priority"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->i:Lrf/d;

    const-string v0, "ttl"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->j:Lrf/d;

    const-string v0, "topic"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->k:Lrf/d;

    const-string v0, "bulkId"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->l:Lrf/d;

    const-string v0, "event"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->m:Lrf/d;

    const-string v0, "analyticsLabel"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->n:Lrf/d;

    const-string v0, "campaignId"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->o:Lrf/d;

    const-string v0, "composerLabel"

    invoke-static {v0}, Lrf/d;->a(Ljava/lang/String;)Lrf/d$b;

    move-result-object v0

    invoke-static {}, Luf/a;->b()Luf/a;

    move-result-object v1

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Luf/a;->c(I)Luf/a;

    move-result-object v1

    invoke-virtual {v1}, Luf/a;->a()Luf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrf/d$b;->b(Ljava/lang/annotation/Annotation;)Lrf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lrf/d$b;->a()Lrf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->p:Lrf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfg/a;Lrf/f;)V
    .locals 3

    sget-object v0, Lcom/google/firebase/messaging/a$a;->b:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->c:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->d:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->e:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->i()Lfg/a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->f:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->m()Lfg/a$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->g:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->h:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->i:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->k()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;I)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->j:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->o()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;I)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->k:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->n()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->l:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->m:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->f()Lfg/a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->n:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->o:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lrf/f;->add(Lrf/d;J)Lrf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->p:Lrf/d;

    invoke-virtual {p1}, Lfg/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lrf/f;->add(Lrf/d;Ljava/lang/Object;)Lrf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lfg/a;

    check-cast p2, Lrf/f;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/messaging/a$a;->a(Lfg/a;Lrf/f;)V

    return-void
.end method
