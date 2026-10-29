/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3a440..0xb3a8b4 (1140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3a440_1 {
    char padding_0[8];
    struct st_b3a440_0 *field_8;
    struct st_b3a440_0 *field_10;
    struct st_b3a440_0 *field_18;
    struct st_b3a440_0 *field_20;
    struct st_b3a440_0 *field_28;
    struct st_b3a440_0 *field_30;
    struct st_b3a440_0 *field_38;
    struct st_b3a440_0 *field_40;
    struct st_b3a440_0 *field_48;
    struct st_b3a440_0 *field_50;
    struct st_b3a440_0 *field_58;
    struct st_b3a440_0 *field_60;
    long long field_68;
    long long field_70;
    char padding_78[16];
    struct st_b3a440_0 *field_88;
    long long field_90;
} st_b3a440_1;

typedef struct st_b3a440_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
} st_b3a440_0;


st_b3a440_0 * sub_b3a440(st_b3a440_1 *a0, long long a1)
{
    st_b3a440_0 *v2;  // x0
    st_b3a440_0 *v3;  // x0
    st_b3a440_0 *v12;  // x0
    st_b3a440_1 *v13;  // x21
    st_b3a440_0 *v14;  // x8
    st_b3a440_0 *v15;  // x0
    st_b3a440_1 *v16;  // x21
    st_b3a440_0 *v17;  // x8
    st_b3a440_0 *v18;  // x0
    st_b3a440_1 *v19;  // x21
    st_b3a440_0 *v20;  // x8
    st_b3a440_0 *v21;  // x0
    st_b3a440_0 *v4;  // x0
    st_b3a440_1 *v22;  // x21
    st_b3a440_0 *v23;  // x8
    st_b3a440_0 *v24;  // x0
    st_b3a440_1 *v25;  // x21
    st_b3a440_0 *v26;  // x8
    st_b3a440_0 *v27;  // x0
    st_b3a440_0 *v28;  // x0
    st_b3a440_0 *v29;  // x22
    long long v30;  // x0
    long long v31;  // x1
    st_b3a440_0 *v5;  // x0
    st_b3a440_0 *v32;  // x0
    st_b3a440_0 *v33;  // x0
    st_b3a440_0 *v34;  // x22
    long long v35;  // x0
    long long v36;  // x1
    st_b3a440_0 *v37;  // x0
    st_b3a440_0 *v38;  // x0
    st_b3a440_0 *v39;  // x21
    long long v40;  // x0
    long long v41;  // x1
    st_b3a440_0 *v6;  // x0
    st_b3a440_0 *v42;  // x0
    st_b3a440_0 *v7;  // x0
    st_b3a440_0 *v8;  // x0
    st_b3a440_0 *v9;  // x0
    st_b3a440_0 *v10;  // x0
    st_b3a440_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "use-cofactor-flag"))
    {
        v2 = sub_a6fc2c();
        if (!(unsigned int)v2)
            return v2;
    }
    v3 = sub_a6fbc4(a1, "group");
    if (!v3)
    {
LABEL_b3a4d0:
        v5 = sub_a6fbc4(a1, "field-type");
        if (v5)
        {
            if (v5->field_8 == 4)
            {
                sub_a6c2e4(a0->field_28, "providers/implementations/keymgmt/ec_kmgmt.c", 1088);
                v6 = sub_a6d9b4(v5->field_10, "providers/implementations/keymgmt/ec_kmgmt.c", 1088);
                a0->field_28 = v6;
                if (!v6)
                    return v6;
                goto LABEL_b3a528;
            }
        }
        else
        {
LABEL_b3a528:
            v7 = sub_a6fbc4(a1, "encoding");
            if (v7)
            {
                if (v7->field_8 == 4)
                {
                    sub_a6c2e4(a0->field_10, "providers/implementations/keymgmt/ec_kmgmt.c", 1089);
                    v8 = sub_a6d9b4(v7->field_10, "providers/implementations/keymgmt/ec_kmgmt.c", 1089);
                    a0->field_10 = v8;
                    if (!v8)
                        return v8;
                    goto LABEL_b3a580;
                }
            }
            else
            {
LABEL_b3a580:
                v9 = sub_a6fbc4(a1, "point-format");
                if (v9)
                {
                    if (v9->field_8 == 4)
                    {
                        sub_a6c2e4(a0->field_18, "providers/implementations/keymgmt/ec_kmgmt.c", 1090);
                        v10 = sub_a6d9b4(v9->field_10, "providers/implementations/keymgmt/ec_kmgmt.c", 1090);
                        a0->field_18 = v10;
                        if (!v10)
                            return v10;
                        goto LABEL_b3a5d8;
                    }
                }
                else
                {
LABEL_b3a5d8:
                    v11 = sub_a6fbc4(a1, "group-check");
                    if (v11)
                    {
                        if (v11->field_8 == 4)
                        {
                            sub_a6c2e4(a0->field_20, "providers/implementations/keymgmt/ec_kmgmt.c", 1091);
                            v12 = sub_a6d9b4(v11->field_10, "providers/implementations/keymgmt/ec_kmgmt.c", 1091);
                            a0->field_20 = v12;
                            if (!v12)
                                return v12;
                            goto LABEL_b3a630;
                        }
                    }
                    else
                    {
LABEL_b3a630:
                        if (sub_a6fbc4(a1, L"pg汴彳档潯敳獟杩污g䵈䍁吀卌䜭佒偕琀獬札潲灵渭浡e摡彤牰癯摩牥束潲灵s汴\u2d73牧畯⵰慮敭椭瑮牥慮l汴\u2d73牧畯⵰摩琀獬札潲灵愭杬琀獬札潲灵猭捥戭瑩s汴\u2d73牧畯⵰獩欭浥琀獬洭湩琭獬琀獬洭硡琭獬琀獬洭湩搭汴s汴\u2d73慭\u2d78瑤獬吀卌匭䝉䱁G汴\u2d73楳慧杬渭浡e摡彤牰癯摩牥獟杩污獧琀獬猭杩污ⵧ慩慮渭浡e汴\u2d73楳慧杬挭摯ⵥ潰湩t汴\u2d73楳慧杬猭捥戭瑩s汴\u2d73楳慧杬漭摩琀獬猭杩污ⵧ楳ⵧ慮敭琀獬猭杩污ⵧ楳ⵧ楯d汴\u2d73楳慧杬栭獡\u2d68慮敭琀獬猭杩污ⵧ慨桳漭摩琀獬猭杩污ⵧ敫瑹灹e汴\u2d73楳慧杬欭祥祴数漭摩琀灵敬损b楧彤扣䐀䐀䙅啁呌卟䥕䕔䉟㼀敳灣㔲父㨱猿捥㍰㐸ㅲ䜀㉃㘵A䍇㔲䈶䜀㉃㘵C䍇㔲䐶䜀㕃㈱A䍇ㄵ䈲䜀㕃㈱C捥獤彡敳灣㔲父弱桳㉡㘵䔀䑃䅓匫䅈㔲6捥獤彡敳灣㠳爴弱桳㍡㐸䔀䑃䅓匫䅈㠳4捥獤彡敳灣㈵爱弱桳㕡㈱䔀䑃䅓匫䅈ㄵ2摥㔲ㄵ9摥㐴8捥獤彡桳㉡㐲䔀䑃䅓匫䅈㈲4捥獤彡桳ㅡ䔀䑃䅓匫䅈1捥獤彡牢楡灮潯偬㔲父琱獬㌱獟慨㔲6捥獤彡牢楡灮潯偬㔲父弱桳㉡㘵攀摣慳扟慲湩潰汯㍐㐸ㅲ汴ㅳ弳桳㍡㐸攀摣慳扟慲湩潰汯㍐㐸ㅲ獟慨㠳4捥獤彡牢楡灮潯偬ㄵ爲琱獬㌱獟慨ㄵ2捥獤彡牢楡灮潯偬ㄵ爲弱桳㕡㈱爀慳灟獳牟慳彥桳㉡㘵倀卓匫䅈㔲6獲彡獰彳獲敡獟慨㠳4卐⭓䡓㍁㐸爀慳灟獳牟慳彥桳㕡㈱倀卓匫䅈ㄵ2獲彡獰彳"))
                        {
                            v13 = a0;
                            if (v13->field_30 || (v14 = sub_9e4958(), v13->field_30 = v14, v14))
                            {
                                v15 = sub_a70f20();
                                if (!(unsigned int)v15)
                                    return v15;
                                goto LABEL_b3a674;
                            }
                        }
                        else
                        {
LABEL_b3a674:
                            if (sub_a6fbc4(a1, L"ar⭲眀+⭡眀b扡爀b⭲b⭷b⭡b佐呓匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩瀠灩⡥\u2029慣汬\u2000›匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202c彏低䉎佌䭃\u2029慣汬匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202e彆䕓乔协䝉䥐䕐\u2029慣汬匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202c彆䕓乔协䝉䥐䕐\u2029慣汬匀捯敫⁴獩甠楮楮楴污穩摥䌀湡潮⁴牣慥整愠猠捯敫t慃据汥敬d潃湮捥⁴牥潲㩲 䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䍅䡄ⵅ䍅卄ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲匭䅈䔠䑃䕈䔭䑃䅓䄭卅㔲ⴶ䡓⁁䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲匭䅈㔲‶䍅䡄ⵅ䍅卄ⵁ䕁㉓㘵匭䅈㠳‴䍅䡄ⵅ卒ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䍅䡄ⵅ卒ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䍅䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈䔠䑃䕈刭䅓䄭卅㔲ⴶ䡓⁁䍅䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈㔲‶䍅䡄ⵅ卒ⵁ䕁㉓㘵匭䅈㠳‴䡄ⵅ卒ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䡄ⵅ卒ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈䐠䕈刭䅓䄭卅㔲ⴶ䡓⁁䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈㔲‶䡄ⵅ卒ⵁ䕁㉓㘵匭䅈㔲‶䕁ㅓ㠲匭䅈伀数卮䱓映楡敬\u2064\u202d潣湮捥楴湯映楡畬敲伀数卮䱓映楡敬\u2064\u202d㕸㤰攠牲牯伀数卮䱓映楡敬\u2064\u202d伀数卮䱓映楡敬\u2064\u202d敲散癩摥攠牡祬䔠䙏伀数卮䱓映楡敬\u2064\u202d湵敤汲楹杮䈠佉爠灥牯整\u2064湡䤠伯攠牲牯伀数卮䱓映楡敬\u2064\u202d牥\u2072潮敮伀数"))
                            {
                                v16 = a0;
                                if (v16->field_38 || (v17 = sub_9e4958(), v16->field_38 = v17, v17))
                                {
                                    v18 = sub_a70f20();
                                    if (!(unsigned int)v18)
                                        return v18;
                                    goto LABEL_b3a6b8;
                                }
                            }
                            else
                            {
LABEL_b3a6b8:
                                if (sub_a6fbc4(a1, "b"))
                                {
                                    v19 = a0;
                                    if (v19->field_40 || (v20 = sub_9e4958(), v19->field_40 = v20, v20))
                                    {
                                        v21 = sub_a70f20();
                                        if (!(unsigned int)v21)
                                            return v21;
                                        goto LABEL_b3a6fc;
                                    }
                                }
                                else
                                {
LABEL_b3a6fc:
                                    if (sub_a6fbc4(a1, "order"))
                                    {
                                        v22 = a0;
                                        if (v22->field_48 || (v23 = sub_9e4958(), v22->field_48 = v23, v23))
                                        {
                                            v24 = sub_a70f20();
                                            if (!(unsigned int)v24)
                                                return v24;
                                            goto LABEL_b3a740;
                                        }
                                    }
                                    else
                                    {
LABEL_b3a740:
                                        if (sub_a6fbc4(a1, "cofactor"))
                                        {
                                            v25 = a0;
                                            if (v25->field_50 || (v26 = sub_9e4958(), v25->field_50 = v26, v26))
                                            {
                                                v27 = sub_a70f20();
                                                if (!(unsigned int)v27)
                                                    return v27;
                                                goto LABEL_b3a784;
                                            }
                                        }
                                        else
                                        {
LABEL_b3a784:
                                            v28 = sub_a6fbc4(a1, "seed");
                                            if (v28)
                                            {
                                                if (v28->field_8 == 5)
                                                {
                                                    v29 = v28;
                                                    sub_a6c2e4(a0->field_60, "providers/implementations/keymgmt/ec_kmgmt.c", 1099);
                                                    v30 = v29->field_10;
                                                    v31 = v29->field_18;
                                                    a0->field_70 = v31;
                                                    v32 = sub_a6dac4(v30, v31, "providers/implementations/keymgmt/ec_kmgmt.c", 1099);
                                                    a0->field_60 = v32;
                                                    if (!v32)
                                                        return v32;
                                                    goto LABEL_b3a7e0;
                                                }
                                            }
                                            else
                                            {
LABEL_b3a7e0:
                                                v33 = sub_a6fbc4(a1, "generator");
                                                if (v33)
                                                {
                                                    if (v33->field_8 == 5)
                                                    {
                                                        v34 = v33;
                                                        sub_a6c2e4(a0->field_58, "providers/implementations/keymgmt/ec_kmgmt.c", 1101);
                                                        v35 = v34->field_10;
                                                        v36 = v34->field_18;
                                                        a0->field_68 = v36;
                                                        v37 = sub_a6dac4(v35, v36, "providers/implementations/keymgmt/ec_kmgmt.c", 1101);
                                                        a0->field_58 = v37;
                                                        if (!v37)
                                                            return v37;
                                                        goto LABEL_b3a83c;
                                                    }
                                                }
                                                else
                                                {
LABEL_b3a83c:
                                                    v38 = sub_a6fbc4(a1, "dhkem-ikm");
                                                    if (!v38)
                                                    {
LABEL_b3a898:
                                                        return 1;
                                                    }
                                                    if (v38->field_8 == 5)
                                                    {
                                                        v39 = v38;
                                                        sub_a6c2e4(a0->field_88, "providers/implementations/keymgmt/ec_kmgmt.c", 1104);
                                                        v40 = v39->field_10;
                                                        v41 = v39->field_18;
                                                        a0->field_90 = v41;
                                                        v42 = sub_a6dac4(v40, v41, "providers/implementations/keymgmt/ec_kmgmt.c", 1104);
                                                        a0->field_88 = v42;
                                                        if (!v42)
                                                            return v42;
                                                        goto LABEL_b3a898;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    else if (v3->field_8 == 4)
    {
        sub_a6c2e4(a0->field_8, "providers/implementations/keymgmt/ec_kmgmt.c", 1087);
        v4 = sub_a6d9b4(v3->field_10, "providers/implementations/keymgmt/ec_kmgmt.c", 1087);
        a0->field_8 = v4;
        if (!v4)
            return v4;
        goto LABEL_b3a4d0;
    }
    return 0;
}
