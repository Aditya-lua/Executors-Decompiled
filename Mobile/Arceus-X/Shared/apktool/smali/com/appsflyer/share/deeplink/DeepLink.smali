.class public Lcom/appsflyer/share/deeplink/DeepLink;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final AFKeystoreWrapper:Lorg/json/JSONObject;


# direct methods
.method private constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    return-void
.end method

.method public static parse(Lorg/json/JSONObject;)Lcom/appsflyer/share/deeplink/DeepLink;
    .locals 4

    const-string v0, "custom_params"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/appsflyer/share/deeplink/DeepLink;

    invoke-direct {v0, p0}, Lcom/appsflyer/share/deeplink/DeepLink;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public static parseFromOaoa(Ljava/util/Map;)Lcom/appsflyer/share/deeplink/DeepLink;
    .locals 99
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/appsflyer/share/deeplink/DeepLink;"
        }
    .end annotation

    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const-string v97, "af_web_id"

    const-string v98, "af_deeplink"

    const-string v1, "install_time"

    const-string v2, "pid"

    const-string v3, "c"

    const-string v4, "af_prt"

    const-string v5, "af_mp"

    const-string v6, "clickid"

    const-string v7, "af_siteid"

    const-string v8, "af_sub_siteid"

    const-string v9, "af_click_lookback"

    const-string v10, "af_viewthrough_lookback"

    const-string v11, "af_keywords"

    const-string v12, "af_cost_model"

    const-string v13, "af_cost_currency"

    const-string v14, "af_cost_value"

    const-string v15, "af_r"

    const-string v16, "af_web_dp"

    const-string v17, "af_force_deeplink"

    const-string v18, "af_ref"

    const-string v19, "is_incentivized"

    const-string v20, "af_param_forwarding"

    const-string v21, "is_retargeting"

    const-string v22, "af_reengagement_window"

    const-string v23, "is_branded_link"

    const-string v24, "is_universal_link"

    const-string v25, "af_generated_clk"

    const-string v26, "transaction_id"

    const-string v27, "af_fp_lookback_window"

    const-string v28, "af_vt_fp_lookback_window"

    const-string v29, "af_fp_priority"

    const-string v30, "af_generate_clk"

    const-string v31, "af_inactivity_window"

    const-string v32, "af_ol_red"

    const-string v33, "af_attr"

    const-string v34, "af_ol_lp"

    const-string v35, "af_blank_red"

    const-string v36, "af_source"

    const-string v37, "af_lp_src"

    const-string v38, "af_src_browser"

    const-string v39, "af_tranid"

    const-string v40, "af_wrt_clk"

    const-string v41, "af_ua"

    const-string v42, "af_ip"

    const-string v43, "af_lang"

    const-string v44, "advertising_id"

    const-string v45, "sha1_advertising_id"

    const-string v46, "md5_advertising_id"

    const-string v47, "android_id"

    const-string v48, "sha1_android_id"

    const-string v49, "md5_android_id"

    const-string v50, "imei"

    const-string v51, "sha1_imei"

    const-string v52, "md5_imei"

    const-string v53, "oaid"

    const-string v54, "sha1_oaid"

    const-string v55, "md5_oaid"

    const-string v56, "af_android_url"

    const-string v57, "sha1_el"

    const-string v58, "fire_advertising_id"

    const-string v59, "sha1_fire_advertising_id"

    const-string v60, "idfa"

    const-string v61, "md5_idfa"

    const-string v62, "af_ios_url"

    const-string v63, "af_ios_fallback"

    const-string v64, "sha1_idfa"

    const-string v65, "mac"

    const-string v66, "sha1_mac"

    const-string v67, "af_banner"

    const-string v68, "af_slk_web_endpoint"

    const-string v69, "af_chrome_lp"

    const-string v70, "af_android_custom_url"

    const-string v71, "af_ios_custom_url"

    const-string v72, "af_enc_data"

    const-string v73, "engmnt_source"

    const-string v74, "redirect_response_data"

    const-string v75, "shortlink"

    const-string v76, "advertiserId"

    const-string v77, "sha1_advertiserId"

    const-string v78, "advertiser_id"

    const-string v79, "sha1_advertiser_id"

    const-string v80, "muid"

    const-string v81, "idfv"

    const-string v82, "md5_idfv"

    const-string v83, "sha1_idfv"

    const-string v84, "af_installpostback"

    const-string v85, "http_referrer"

    const-string v86, "af_model"

    const-string v87, "af_os"

    const-string v88, "md5_advertiserId"

    const-string v89, "af_video_total_length"

    const-string v90, "af_video_played_length"

    const-string v91, "af_playable_played_length"

    const-string v92, "af_ad_time_viewed"

    const-string v93, "af_ad_displayed_percent"

    const-string v94, "af_audio_total_length"

    const-string v95, "af_audio_played_length"

    const-string v96, "af_status"

    filled-new-array/range {v1 .. v98}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v3, p0

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v2, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Lcom/appsflyer/share/deeplink/DeepLink;->parse(Lorg/json/JSONObject;)Lcom/appsflyer/share/deeplink/DeepLink;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getAfSub1()Ljava/lang/String;
    .locals 2

    const-string v0, "af_sub1"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAfSub2()Ljava/lang/String;
    .locals 2

    const-string v0, "af_sub2"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAfSub3()Ljava/lang/String;
    .locals 2

    const-string v0, "af_sub3"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAfSub4()Ljava/lang/String;
    .locals 2

    const-string v0, "af_sub4"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAfSub5()Ljava/lang/String;
    .locals 2

    const-string v0, "af_sub5"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCampaign()Ljava/lang/String;
    .locals 2

    const-string v0, "campaign"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCampaignId()Ljava/lang/String;
    .locals 2

    const-string v0, "campaign_id"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getClickEvent()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getClickHttpReferrer()Ljava/lang/String;
    .locals 2

    const-string v0, "click_http_referrer"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDeepLinkValue()Ljava/lang/String;
    .locals 2

    const-string v0, "deep_link_value"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMatchType()Ljava/lang/String;
    .locals 2

    const-string v0, "match_type"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getMediaSource()Ljava/lang/String;
    .locals 2

    const-string v0, "media_source"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getStringValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    move-object p1, v1

    :cond_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isDeferred()Ljava/lang/Boolean;
    .locals 2

    const-string v0, "is_deferred"

    iget-object v1, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public setDeferred(Z)Lcom/appsflyer/share/deeplink/DeepLink;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    const-string v1, "is_deferred"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/deeplink/DeepLink;->AFKeystoreWrapper:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
