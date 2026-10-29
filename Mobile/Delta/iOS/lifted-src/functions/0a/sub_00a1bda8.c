/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1bda8..0xa1c534 (1932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1bda8_0 {
    struct st_a1bda8_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_a1bda8_0 *field_10;
    struct st_a1bda8_0 *field_18;
    char padding_20[4];
    struct st_a1bda8_0 *field_24;
    struct st_a1bda8_0 *field_28;
    unsigned int field_2c;
    char padding_30[40];
    struct st_a1bda8_0 *field_58;
} st_a1bda8_0;


st_a1bda8_0 * sub_a1bda8(long long a0, long long a1, long long a2)
{
    st_a1bda8_0 *v9;  // x0
    unsigned long long v10;  // x0
    st_a1bda8_0 *v19;  // x0
    st_a1bda8_0 *v20;  // x23
    unsigned int v21;  // w0
    long long v22;  // x1
    st_a1bda8_0 *v23;  // x0
    st_a1bda8_0 *v24;  // x0
    st_a1bda8_0 *v25;  // x25
    st_a1bda8_0 *v26;  // x0
    st_a1bda8_0 *v27;  // x27
    st_a1bda8_0 *v28;  // x0
    st_a1bda8_0 *v11;  // x0
    long long v29;  // x20
    long long v30;  // x21
    st_a1bda8_0 *v31;  // x0
    long long v32;  // x1
    st_a1bda8_0 *v12;  // x19
    st_a1bda8_0 *v13;  // w8
    st_a1bda8_0 *v14;  // x0
    st_a1bda8_0 *v15;  // x19
    st_a1bda8_0 *v16;  // x0
    st_a1bda8_0 *v17;  // w0
    long long v18;  // x1
    st_a1bda8_0 *v0;  // [bp-0x90]
    st_a1bda8_0 *v1;  // [bp-0x8c]
    st_a1bda8_0 *v2;  // [bp-0x88]
    st_a1bda8_0 *v3;  // [bp-0x80], Other Possible Types: unsigned long
    st_a1bda8_0 *v4;  // [bp-0x78], Other Possible Types: unsigned long
    st_a1bda8_0 *v5;  // [bp-0x70], Other Possible Types: unsigned long
    st_a1bda8_0 *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v1 = 0xffffffff;
    v9 = sub_a6fbc4();
    if (v9)
    {
        v0 = (st_a1bda8_0 *)0;
        v6 = 0;
        if (v9->field_8 != 6)
        {
            if (v9->field_8 == 4 && !(v6 = v9->field_10, !v9->field_10))
                goto LABEL_a1bef4;
        }
        else
        {
            if (sub_a7168c())
            {
LABEL_a1bef4:
                v10 = sub_a4ab98(v6);
                if ((unsigned int)v10)
                {
                    v11 = sub_a18150(a1, a2, v10);
                    if (!v11)
                        return v11;
                    v12 = v11;
                    if (!sub_a1bc24())
                    {
LABEL_a1c138:
                        sub_a1a174(v12);
                        return 0;
                    }
                    if (!sub_a6fbc4(a0, "decoded-from-explicit"))
                    {
                        v13 = (st_a1bda8_0 *)0;
                    }
                    else if (sub_a6fc2c())
                    {
                        v13 = (st_a1bda8_0 *)(v0 > 0);
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_lib.c", 1574, "EC_GROUP_new_from_params");
                        sub_a36abc(16, 145, 0);
                        goto LABEL_a1c138;
                    }
                    *(unsigned int *)&v12->field_24 = (unsigned int)v13;
                    return v12;
                }
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_lib.c", 1495, "group_new_from_name");
                sub_a36abc(16, 141, 0);
            }
        }
        return 0;
    }
    v14 = sub_9dddcc(a1);
    if (!v14)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 1588, "EC_GROUP_new_from_params");
        sub_a36abc(16, 0x80003, 0);
        return 0;
    }
    v15 = v14;
    sub_9de064();
    v5 = sub_9de208(v15);
    v4 = sub_9de208(v15);
    v3 = sub_9de208(v15);
    v6 = sub_9de208(v15);
    if (v6)
    {
        v16 = sub_a6fbc4(a0, "field-type");
        if (v16 && v16->field_8 == 4)
        {
            v17 = (st_a1bda8_0 *)(unsigned int)sub_a6e200(v16->field_10, "prime-field");
            if (v17 && sub_a6e200(v16->field_10, "characteristic-two-field"))
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_lib.c", 1615, "EC_GROUP_new_from_params");
                v18 = 131;
            }
            else if (!sub_a70f20(sub_a6fbc4(a0, L"ar⭲眀+⭡眀b扡爀b⭲b⭷b⭡b佐呓匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩瀠灩⡥\u2029慣汬\u2000›匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202c彏低䉎佌䭃\u2029慣汬匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202e彆䕓乔协䝉䥐䕐\u2029慣汬匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202c彆䕓乔协䝉䥐䕐\u2029慣汬匀捯敫⁴獩甠楮楮楴污穩摥䌀湡潮⁴牣慥整愠猠捯敫t慃据汥敬d潃湮捥⁴牥潲㩲 䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䍅䡄ⵅ䍅卄ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲匭䅈䔠䑃䕈䔭䑃䅓䄭卅㔲ⴶ䡓⁁䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲匭䅈㔲‶䍅䡄ⵅ䍅卄ⵁ䕁㉓㘵匭䅈㠳‴䍅䡄ⵅ卒ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䍅䡄ⵅ卒ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䍅䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈䔠䑃䕈刭䅓䄭卅㔲ⴶ䡓⁁䍅䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈㔲‶䍅䡄ⵅ卒ⵁ䕁㉓㘵匭䅈㠳‴䡄ⵅ卒ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䡄ⵅ卒ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈䐠䕈刭䅓䄭卅㔲ⴶ䡓⁁䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈㔲‶䡄ⵅ卒ⵁ䕁㉓㘵匭䅈㔲‶䕁ㅓ㠲匭䅈伀数卮䱓映楡敬\u2064\u202d潣湮捥楴湯映楡畬敲伀数卮䱓映楡敬\u2064\u202d㕸㤰攠牲牯伀数卮䱓映楡敬\u2064\u202d伀数卮䱓映楡敬\u2064\u202d敲散癩摥攠牡祬䔠䙏伀数卮䱓映楡敬\u2064\u202d湵敤汲楹杮䈠佉爠灥牯整\u2064湡䤠伯攠牲牯伀数卮䱓映楡敬\u2064\u202d牥\u2072潮敮伀数"), &v4))
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_lib.c", 1621, "EC_GROUP_new_from_params");
                v18 = 168;
            }
            else if (sub_a70f20(sub_a6fbc4(a0, "b"), &v3))
            {
                if (!sub_a70f20(sub_a6fbc4(a0, L"pg汴彳档潯敳獟杩污g䵈䍁吀卌䜭佒偕琀獬札潲灵渭浡e摡彤牰癯摩牥束潲灵s汴\u2d73牧畯⵰慮敭椭瑮牥慮l汴\u2d73牧畯⵰摩琀獬札潲灵愭杬琀獬札潲灵猭捥戭瑩s汴\u2d73牧畯⵰獩欭浥琀獬洭湩琭獬琀獬洭硡琭獬琀獬洭湩搭汴s汴\u2d73慭\u2d78瑤獬吀卌匭䝉䱁G汴\u2d73楳慧杬渭浡e摡彤牰癯摩牥獟杩污獧琀獬猭杩污ⵧ慩慮渭浡e汴\u2d73楳慧杬挭摯ⵥ潰湩t汴\u2d73楳慧杬猭捥戭瑩s汴\u2d73楳慧杬漭摩琀獬猭杩污ⵧ楳ⵧ慮敭琀獬猭杩污ⵧ楳ⵧ楯d汴\u2d73楳慧杬栭獡\u2d68慮敭琀獬猭杩污ⵧ慨桳漭摩琀獬猭杩污ⵧ敫瑹灹e汴\u2d73楳慧杬欭祥祴数漭摩琀灵敬损b楧彤扣䐀䐀䙅啁呌卟䥕䕔䉟㼀敳灣㔲父㨱猿捥㍰㐸ㅲ䜀㉃㘵A䍇㔲䈶䜀㉃㘵C䍇㔲䐶䜀㕃㈱A䍇ㄵ䈲䜀㕃㈱C捥獤彡敳灣㔲父弱桳㉡㘵䔀䑃䅓匫䅈㔲6捥獤彡敳灣㠳爴弱桳㍡㐸䔀䑃䅓匫䅈㠳4捥獤彡敳灣㈵爱弱桳㕡㈱䔀䑃䅓匫䅈ㄵ2摥㔲ㄵ9摥㐴8捥獤彡桳㉡㐲䔀䑃䅓匫䅈㈲4捥獤彡桳ㅡ䔀䑃䅓匫䅈1捥獤彡牢楡灮潯偬㔲父琱獬㌱獟慨㔲6捥獤彡牢楡灮潯偬㔲父弱桳㉡㘵攀摣慳扟慲湩潰汯㍐㐸ㅲ汴ㅳ弳桳㍡㐸攀摣慳扟慲湩潰汯㍐㐸ㅲ獟慨㠳4捥獤彡牢楡灮潯偬ㄵ爲琱獬㌱獟慨ㄵ2捥獤彡牢楡灮潯偬ㄵ爲弱桳㕡㈱爀慳灟獳牟慳彥桳㉡㘵倀卓匫䅈㔲6獲彡獰彳獲敡獟慨㠳4卐⭓䡓㍁㐸爀慳灟獳牟慳彥桳㕡㈱倀卓匫䅈ㄵ2獲彡獰彳"), &v5))
                {
                    sub_a368c8();
                    v32 = 1633;
                    goto LABEL_a1c1e0;
                }
                if (v17)
                {
                    v19 = sub_a18ab4(v5, v4, v3, 0);
                    if (!v19)
                        goto LABEL_a1c394;
                    v20 = v19;
                    v21 = sub_a1ad1c();
                    if ((int)v21 >= 662)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_lib.c", 1660, "EC_GROUP_new_from_params");
                        v22 = 143;
                        goto LABEL_a1c32c;
                    }
                    else
                    {
                        goto LABEL_a1c1f4;
                    }
                }
                else if (sub_9e5c94(v5) || sub_9e4828(v5))
                {
                    sub_a368c8();
                    v32 = 1639;
LABEL_a1c1e0:
                    sub_a369bc("crypto/ec/ec_lib.c", v32, "EC_GROUP_new_from_params");
                    v18 = 172;
                }
                else
                {
                    v21 = sub_9e46a8(v5);
                    if ((int)v21 >= 662)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_lib.c", 1644, "EC_GROUP_new_from_params");
                        v18 = 143;
                    }
                    else
                    {
                        v20 = sub_a18a2c(v5, v4, v3, v15);
                        if (v20)
                        {
LABEL_a1c1f4:
                            v23 = sub_a6fbc4(a0, "seed");
                            if (!v23)
                            {
LABEL_a1c224:
                                v24 = sub_a6fbc4(a0, "generator");
                                if (v24 && v24->field_8 == 5 && v24->field_18)
                                {
                                    v25 = v24->field_10;
                                    v26 = sub_a1a56c(v20);
                                    if (v26)
                                    {
                                        v27 = v26;
                                        *(unsigned int *)((char *)&v20->field_24 + 4) = (char)v25->field_0 & 254;
                                        if (!sub_a1dafc(v20, v27, v25, v24->field_18, v15))
                                        {
                                            v29 = 173;
                                            v30 = 1697;
                                            goto LABEL_a1c3cc;
                                        }
                                        if (!sub_a70f20(sub_a6fbc4(a0, "order"), &v6) || sub_9e5c94(v6) || sub_9e4828(v6) || (int)sub_9e46a8(v6) > (int)(v21 + 1))
                                        {
                                            v29 = 122;
                                            v30 = 1706;
                                            goto LABEL_a1c3cc;
                                        }
                                        v28 = sub_a6fbc4(a0, "cofactor");
                                        if (v28)
                                        {
                                            v2 = sub_9de208(v15);
                                            if (v2 && sub_a70f20(v28, &v2))
                                            {
                                                goto LABEL_a1c480;
                                            }
                                            else
                                            {
                                                v29 = 171;
                                                v30 = 1715;
                                                goto LABEL_a1c3cc;
                                            }
                                            goto LABEL_a1c3cc;
                                        }
LABEL_a1c480:
                                        if (!sub_a1a764(v20, v27, v6))
                                        {
                                            v29 = 173;
                                            v30 = 1722;
                                            goto LABEL_a1c3cc;
                                        }
                                        v31 = sub_a1c534(v20, a1, a2, v15);
                                        if (v31)
                                        {
                                            if (v31 != v20)
                                            {
                                                sub_a1a174(v20);
                                                v20 = v31;
                                                goto LABEL_a1c51c;
                                            }
                                            if (sub_a6fbc4(a0, "encoding"))
                                            {
                                                if (sub_a179d4())
                                                {
                                                    if (v1 != 1)
                                                        goto LABEL_a1c518;
                                                    v29 = 0x66;
                                                    v30 = 1743;
                                                }
                                                else
                                                {
                                                    v29 = 0x66;
                                                    v30 = 1739;
                                                }
LABEL_a1c3cc:
                                                sub_a368c8();
                                                sub_a369bc("crypto/ec/ec_lib.c", v30, "EC_GROUP_new_from_params");
                                                sub_a36abc(16, v29, 0);
                                                sub_a1a174(v20);
                                                v20 = 0;
                                            }
                                            else
                                            {
LABEL_a1c518:
                                                *(unsigned int *)(v20->padding_20)[1] = 0;
LABEL_a1c51c:
                                                *(unsigned int *)&v20->field_24 = 1;
                                            }
                                        }
                                        else
                                        {
                                            v29 = 174;
                                            v30 = 1728;
                                            goto LABEL_a1c3cc;
                                        }
                                        if (!*(long long *)&v27->field_0->padding_30[28])
                                        {
                                            sub_a6c2e4(v27, "crypto/ec/ec_lib.c", 754);
                                            sub_9de17c(v15);
                                            sub_9dded4(v15);
                                            return v20;
                                        }
                                        (*(long long *)&v27->field_0->padding_30[28])();
                                    }
                                    goto LABEL_a1c334;
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/ec/ec_lib.c", 1688, "EC_GROUP_new_from_params");
                                    v22 = 173;
                                }
                            }
                            else if (v23->field_8 == 5)
                            {
                                if (sub_a1abf0(v20, v23->field_10, v23->field_18))
                                    goto LABEL_a1c224;
                                goto LABEL_a1c334;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/ec/ec_lib.c", 1676, "EC_GROUP_new_from_params");
                                v22 = 175;
                            }
LABEL_a1c32c:
                            sub_a36abc(16, v22, 0);
LABEL_a1c334:
LABEL_a1c01c:
                            sub_a1a174(v20);
                            sub_9de17c(v15);
                            sub_9dded4(v15);
                            return 0;
                        }
LABEL_a1c394:
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_lib.c", 1668, "EC_GROUP_new_from_params");
                        v18 = 524304;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_lib.c", 1626, "EC_GROUP_new_from_params");
                v18 = 169;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_lib.c", 1604, "EC_GROUP_new_from_params");
            v18 = 103;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_lib.c", 1598, "EC_GROUP_new_from_params");
        v18 = 524291;
    }
    sub_a36abc(16, v18, 0);
    v20 = 0;
    goto LABEL_a1c01c;
}
