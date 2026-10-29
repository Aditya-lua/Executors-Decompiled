.class public Lqi/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lqi/f;",
            ">;"
        }
    .end annotation
.end field

.field public static d:Lqi/f;

.field public static e:Lqi/f;

.field public static f:Lqi/f;

.field public static g:Lqi/f;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lqi/f;

    const-string v1, "en_us"

    const-string v2, "en"

    invoke-direct {v0, v1, v2}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lqi/f;->d:Lqi/f;

    new-instance v0, Lqi/f;

    const-string v1, "es_es"

    const-string v2, "es"

    invoke-direct {v0, v1, v2}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lqi/f;->e:Lqi/f;

    new-instance v0, Lqi/f;

    const-string v1, "fr_fr"

    const-string v2, "fr"

    invoke-direct {v0, v1, v2}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lqi/f;->f:Lqi/f;

    new-instance v0, Lqi/f;

    const-string v1, "it_it"

    const-string v2, "it"

    invoke-direct {v0, v1, v2}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lqi/f;->g:Lqi/f;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    sget-object v1, Lqi/f;->d:Lqi/f;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    sget-object v1, Lqi/f;->e:Lqi/f;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    sget-object v1, Lqi/f;->f:Lqi/f;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    sget-object v1, Lqi/f;->g:Lqi/f;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "de_de"

    const-string v3, "de"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "id_id"

    const-string v3, "id"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "ja_jp"

    const-string v3, "ja"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "ko_kr"

    const-string v3, "ko"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "pt_br"

    const-string v3, "pt"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "ru_ru"

    const-string v3, "ru"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "th_th"

    const-string v3, "th"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "tr_tr"

    const-string v3, "tr"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "vi_vn"

    const-string v3, "vi"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v1, Lqi/f;

    const-string v2, "zh_tw"

    const-string v3, "zh_TW"

    invoke-direct {v1, v2, v3}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    const-string v1, "zh_CN"

    if-eqz v0, :cond_0

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v2, Lqi/f;

    const-string v3, "zh_cjv"

    invoke-direct {v2, v3, v1}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    new-instance v2, Lqi/f;

    const-string v3, "zh_cn"

    invoke-direct {v2, v3, v1}, Lqi/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi/f;->a:Ljava/lang/String;

    iput-object p2, p0, Lqi/f;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lqi/f;
    .locals 7

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    if-ge v3, v1, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lqi/f;

    invoke-virtual {v4}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v4}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v5

    const-string v6, "_"

    invoke-virtual {p0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    aget-object v6, v6, v2

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    :cond_1
    return-object v4

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Lqi/f;
    .locals 5

    sget-object v0, Lqi/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :cond_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Lqi/f;

    invoke-virtual {v3}, Lqi/f;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqi/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqi/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LocaleValue{\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqi/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\',\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqi/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
