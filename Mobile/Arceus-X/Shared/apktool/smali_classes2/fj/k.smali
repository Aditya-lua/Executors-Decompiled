.class public final synthetic Lfj/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/m$q;


# instance fields
.field public final synthetic a:Lfj/m;

.field public final synthetic b:Lfj/c;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lfj/m;Lfj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj/k;->a:Lfj/m;

    iput-object p2, p0, Lfj/k;->b:Lfj/c;

    iput-wide p3, p0, Lfj/k;->c:J

    iput-object p5, p0, Lfj/k;->d:Ljava/lang/String;

    iput-object p6, p0, Lfj/k;->e:Ljava/lang/String;

    iput-object p7, p0, Lfj/k;->f:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 8

    iget-object v0, p0, Lfj/k;->a:Lfj/m;

    iget-object v1, p0, Lfj/k;->b:Lfj/c;

    iget-wide v2, p0, Lfj/k;->c:J

    iget-object v4, p0, Lfj/k;->d:Ljava/lang/String;

    iget-object v5, p0, Lfj/k;->e:Ljava/lang/String;

    iget-object v6, p0, Lfj/k;->f:Landroid/app/Activity;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lfj/m;->t(Lfj/m;Lfj/c;JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ljava/util/List;)V

    return-void
.end method
