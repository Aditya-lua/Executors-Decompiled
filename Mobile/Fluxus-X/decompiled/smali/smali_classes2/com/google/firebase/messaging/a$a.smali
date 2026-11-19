.class public final Lcom/google/firebase/messaging/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/e;


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
        "Ltf/e<",
        "Lhg/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/firebase/messaging/a$a;

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

.field public static final n:Ltf/d;

.field public static final o:Ltf/d;

.field public static final p:Ltf/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/messaging/a$a;

    invoke-direct {v0}, Lcom/google/firebase/messaging/a$a;-><init>()V

    sput-object v0, Lcom/google/firebase/messaging/a$a;->a:Lcom/google/firebase/messaging/a$a;

    const-string v0, "projectNumber"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->b:Ltf/d;

    const-string v0, "messageId"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->c:Ltf/d;

    const-string v0, "instanceId"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->d:Ltf/d;

    const-string v0, "messageType"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->e:Ltf/d;

    const-string v0, "sdkPlatform"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->f:Ltf/d;

    const-string v0, "packageName"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->g:Ltf/d;

    const-string v0, "collapseKey"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->h:Ltf/d;

    const-string v0, "priority"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->i:Ltf/d;

    const-string v0, "ttl"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->j:Ltf/d;

    const-string v0, "topic"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->k:Ltf/d;

    const-string v0, "bulkId"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->l:Ltf/d;

    const-string v0, "event"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->m:Ltf/d;

    const-string v0, "analyticsLabel"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->n:Ltf/d;

    const-string v0, "campaignId"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->o:Ltf/d;

    const-string v0, "composerLabel"

    invoke-static {v0}, Ltf/d;->a(Ljava/lang/String;)Ltf/d$b;

    move-result-object v0

    invoke-static {}, Lwf/a;->b()Lwf/a;

    move-result-object v1

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Lwf/a;->c(I)Lwf/a;

    move-result-object v1

    invoke-virtual {v1}, Lwf/a;->a()Lwf/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltf/d$b;->b(Ljava/lang/annotation/Annotation;)Ltf/d$b;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d$b;->a()Ltf/d;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->p:Ltf/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lhg/a;Ltf/f;)V
    .locals 3

    sget-object v0, Lcom/google/firebase/messaging/a$a;->b:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ltf/f;->add(Ltf/d;J)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->c:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->d:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->e:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->i()Lhg/a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->f:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->m()Lhg/a$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->g:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->h:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->i:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->k()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;I)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->j:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->o()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;I)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->k:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->n()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->l:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ltf/f;->add(Ltf/d;J)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->m:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->f()Lhg/a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->n:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->o:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ltf/f;->add(Ltf/d;J)Ltf/f;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->p:Ltf/d;

    invoke-virtual {p1}, Lhg/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ltf/f;->add(Ltf/d;Ljava/lang/Object;)Ltf/f;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/a;

    check-cast p2, Ltf/f;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/messaging/a$a;->a(Lhg/a;Ltf/f;)V

    return-void
.end method
