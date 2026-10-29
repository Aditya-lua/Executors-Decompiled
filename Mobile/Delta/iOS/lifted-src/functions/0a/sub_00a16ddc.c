/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16ddc..0xa172fc (1312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a16ddc_0 {
    char padding_0[40];
    unsigned int field_28;
} st_a16ddc_0;

extern char g_e8ef78;
extern char g_e8ef88;
extern char g_e8ef98;

unsigned long long sub_a16ddc(st_a16ddc_0 *a0, unsigned int a1, long long a2, unsigned long a3, unsigned long a4, long long a5, long long *a6)
{
    unsigned int v3;  // w0
    unsigned long long v4;  // x0
    long long v13;  // x26
    unsigned int v14;  // x0
    long long v15;  // x25
    unsigned int v16;  // x0
    unsigned int v17;  // x24
    long long v18;  // x0
    unsigned int v19;  // x0
    unsigned int v20;  // x0
    unsigned int v21;  // x22
    unsigned int v22;  // x0
    unsigned int v5;  // w0
    unsigned int v23;  // x0
    unsigned int v6;  // w0
    long long v7;  // x24
    long long v8;  // x19
    unsigned int v9;  // x0
    unsigned int v10;  // x0
    long long v12;  // x27
    unsigned int v0;  // [bp-0x64]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_backend.c", 298, "ossl_ec_group_todata");
        sub_a36abc(16);
        return 0;
    }
    sub_a1abe8();
    switch (v3)
    {
    case 6:
        if (*(long long *)&g_e8ef98)
        {
LABEL_a16e8c:
            if (sub_a6f90c(a1, a2, "point-format"))
            {
                if (sub_a6f90c())
                {
                    v4 = sub_a6f85c(a1, a2, "decoded-from-explicit", a0->field_28);
                    if (!(unsigned int)v4)
                        return v4;
                    v5 = sub_a1abcc(a0);
                    if (a1 && v5)
                    {
LABEL_a16f08:
                        v23 = sub_a4ab5c();
                        if (v23 && sub_a6f90c(a1, a2, "group", v23))
                            return 1;
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_backend.c", 345, "ossl_ec_group_todata");
                        sub_a36abc(16);
                        return 0;
                    }
                    v0 = v5;
                    v6 = sub_a1abd4(a0);
                    if (v6 != 406)
                    {
                        if (v6 == 407)
                        {
                            v7 = "characteristic-two-field";
LABEL_a16ffc:
                            v9 = sub_a6fbc4(a2, L"pg汴彳档潯敳獟杩污g䵈䍁吀卌䜭佒偕琀獬札潲灵渭浡e摡彤牰癯摩牥束潲灵s汴\u2d73牧畯⵰慮敭椭瑮牥慮l汴\u2d73牧畯⵰摩琀獬札潲灵愭杬琀獬札潲灵猭捥戭瑩s汴\u2d73牧畯⵰獩欭浥琀獬洭湩琭獬琀獬洭硡琭獬琀獬洭湩搭汴s汴\u2d73慭\u2d78瑤獬吀卌匭䝉䱁G汴\u2d73楳慧杬渭浡e摡彤牰癯摩牥獟杩污獧琀獬猭杩污ⵧ慩慮渭浡e汴\u2d73楳慧杬挭摯ⵥ潰湩t汴\u2d73楳慧杬猭捥戭瑩s汴\u2d73楳慧杬漭摩琀獬猭杩污ⵧ楳ⵧ慮敭琀獬猭杩污ⵧ楳ⵧ楯d汴\u2d73楳慧杬栭獡\u2d68慮敭琀獬猭杩污ⵧ慨桳漭摩琀獬猭杩污ⵧ敫瑹灹e汴\u2d73楳慧杬欭祥祴数漭摩琀灵敬损b楧彤扣䐀䐀䙅啁呌卟䥕䕔䉟㼀敳灣㔲父㨱猿捥㍰㐸ㅲ䜀㉃㘵A䍇㔲䈶䜀㉃㘵C䍇㔲䐶䜀㕃㈱A䍇ㄵ䈲䜀㕃㈱C捥獤彡敳灣㔲父弱桳㉡㘵䔀䑃䅓匫䅈㔲6捥獤彡敳灣㠳爴弱桳㍡㐸䔀䑃䅓匫䅈㠳4捥獤彡敳灣㈵爱弱桳㕡㈱䔀䑃䅓匫䅈ㄵ2摥㔲ㄵ9摥㐴8捥獤彡桳㉡㐲䔀䑃䅓匫䅈㈲4捥獤彡桳ㅡ䔀䑃䅓匫䅈1捥獤彡牢楡灮潯偬㔲父琱獬㌱獟慨㔲6捥獤彡牢楡灮潯偬㔲父弱桳㉡㘵攀摣慳扟慲湩潰汯㍐㐸ㅲ汴ㅳ弳桳㍡㐸攀摣慳扟慲湩潰汯㍐㐸ㅲ獟慨㠳4捥獤彡牢楡灮潯偬ㄵ爲琱獬㌱獟慨ㄵ2捥獤彡牢楡灮潯偬ㄵ爲弱桳㕡㈱爀慳灟獳牟慳彥桳㉡㘵倀卓匫䅈㔲6獲彡獰彳獲敡獟慨㠳4卐⭓䡓㍁㐸爀慳灟獳牟慳彥桳㕡㈱倀卓匫䅈ㄵ2獲彡獰彳");
                            v10 = sub_a6fbc4(a2, L"ar⭲眀+⭡眀b扡爀b⭲b⭷b⭡b佐呓匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩瀠灩⡥\u2029慣汬\u2000›匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202c彏低䉎佌䭃\u2029慣汬匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202e彆䕓乔协䝉䥐䕐\u2029慣汬匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202c彆䕓乔协䝉䥐䕐\u2029慣汬匀捯敫⁴獩甠楮楮楴污穩摥䌀湡潮⁴牣慥整愠猠捯敫t慃据汥敬d潃湮捥⁴牥潲㩲 䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䍅䡄ⵅ䍅卄ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲匭䅈䔠䑃䕈䔭䑃䅓䄭卅㔲ⴶ䡓⁁䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲匭䅈㔲‶䍅䡄ⵅ䍅卄ⵁ䕁㉓㘵匭䅈㠳‴䍅䡄ⵅ卒ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䍅䡄ⵅ卒ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䍅䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈䔠䑃䕈刭䅓䄭卅㔲ⴶ䡓⁁䍅䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈㔲‶䍅䡄ⵅ卒ⵁ䕁㉓㘵匭䅈㠳‴䡄ⵅ卒ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䡄ⵅ卒ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈䐠䕈刭䅓䄭卅㔲ⴶ䡓⁁䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈㔲‶䡄ⵅ卒ⵁ䕁㉓㘵匭䅈㔲‶䕁ㅓ㠲匭䅈伀数卮䱓映楡敬\u2064\u202d潣湮捥楴湯映楡畬敲伀数卮䱓映楡敬\u2064\u202d㕸㤰攠牲牯伀数卮䱓映楡敬\u2064\u202d伀数卮䱓映楡敬\u2064\u202d敲散癩摥攠牡祬䔠䙏伀数卮䱓映楡敬\u2064\u202d湵敤汲楹杮䈠佉爠灥牯整\u2064湡䤠伯攠牲牯伀数卮䱓映楡敬\u2064\u202d牥\u2072潮敮伀数");
                            if (!a1 && !v9 && !v10 && !sub_a6fbc4(a2, "b"))
                            {
LABEL_a1704c:
                                if (a1 || sub_a6fbc4(a2, "order"))
                                {
                                    v16 = sub_c4ba8(a0);
                                    if (v16)
                                    {
                                        if (sub_a6fa7c(a1, a2, "order", v16))
                                            goto LABEL_a1708c;
                                        v8 = 219;
                                    }
                                    else
                                    {
                                        v8 = 214;
                                    }
                                }
                                else
                                {
LABEL_a1708c:
                                    if ((a1 || sub_a6fbc4(a2, "field-type")) && !sub_a6f90c(a1, a2, "field-type", v7))
                                    {
                                        v8 = 229;
                                    }
                                    else if (a1 || sub_a6fbc4(a2, "generator"))
                                    {
                                        v17 = sub_c4c40(a0);
                                        v18 = sub_a1abe8(a0);
                                        if (v17)
                                        {
                                            v19 = sub_a1dbcc(a0, v17, v18, a6, a5);
                                            if (v19)
                                            {
                                                if (sub_a6f968(a1, a2, "generator", *a6, v19))
                                                    goto LABEL_a1712c;
                                                v8 = 252;
                                            }
                                            else
                                            {
                                                v8 = 246;
                                            }
                                        }
                                        else
                                        {
                                            v8 = 241;
                                        }
                                    }
                                    else
                                    {
LABEL_a1712c:
                                        if ((a1 || sub_a6fbc4(a2, "cofactor")) && (v20 = sub_9ffdd0(a0), v20 && !sub_a6fa7c(a1, a2, "cofactor", v20)))
                                        {
                                            v8 = 264;
                                        }
                                        else if (a1 || sub_a6fbc4(a2, "seed"))
                                        {
                                            v21 = sub_97725c(a0);
                                            v22 = sub_975fec(a0);
                                            if (!v21 || !v22 || sub_a6f968(a1, a2, "seed", v21))
                                                goto LABEL_a171c0;
                                            v8 = 279;
                                        }
                                        else
                                        {
LABEL_a171c0:
                                            if (!v0)
                                                return 1;
                                            goto LABEL_a16f08;
                                        }
                                    }
                                }
                            }
                            else
                            {
                                v12 = sub_9de208(a5);
                                v13 = sub_9de208(a5);
                                v14 = sub_9de208(a5);
                                if (v14)
                                {
                                    v15 = v14;
                                    if (sub_a1acc8(a0, v12, v13, v15, a5))
                                    {
                                        if (sub_a6fa7c(a1, a2, L"pg汴彳档潯敳獟杩污g䵈䍁吀卌䜭佒偕琀獬札潲灵渭浡e摡彤牰癯摩牥束潲灵s汴\u2d73牧畯⵰慮敭椭瑮牥慮l汴\u2d73牧畯⵰摩琀獬札潲灵愭杬琀獬札潲灵猭捥戭瑩s汴\u2d73牧畯⵰獩欭浥琀獬洭湩琭獬琀獬洭硡琭獬琀獬洭湩搭汴s汴\u2d73慭\u2d78瑤獬吀卌匭䝉䱁G汴\u2d73楳慧杬渭浡e摡彤牰癯摩牥獟杩污獧琀獬猭杩污ⵧ慩慮渭浡e汴\u2d73楳慧杬挭摯ⵥ潰湩t汴\u2d73楳慧杬猭捥戭瑩s汴\u2d73楳慧杬漭摩琀獬猭杩污ⵧ楳ⵧ慮敭琀獬猭杩污ⵧ楳ⵧ楯d汴\u2d73楳慧杬栭獡\u2d68慮敭琀獬猭杩污ⵧ慨桳漭摩琀獬猭杩污ⵧ敫瑹灹e汴\u2d73楳慧杬欭祥祴数漭摩琀灵敬损b楧彤扣䐀䐀䙅啁呌卟䥕䕔䉟㼀敳灣㔲父㨱猿捥㍰㐸ㅲ䜀㉃㘵A䍇㔲䈶䜀㉃㘵C䍇㔲䐶䜀㕃㈱A䍇ㄵ䈲䜀㕃㈱C捥獤彡敳灣㔲父弱桳㉡㘵䔀䑃䅓匫䅈㔲6捥獤彡敳灣㠳爴弱桳㍡㐸䔀䑃䅓匫䅈㠳4捥獤彡敳灣㈵爱弱桳㕡㈱䔀䑃䅓匫䅈ㄵ2摥㔲ㄵ9摥㐴8捥獤彡桳㉡㐲䔀䑃䅓匫䅈㈲4捥獤彡桳ㅡ䔀䑃䅓匫䅈1捥獤彡牢楡灮潯偬㔲父琱獬㌱獟慨㔲6捥獤彡牢楡灮潯偬㔲父弱桳㉡㘵攀摣慳扟慲湩潰汯㍐㐸ㅲ汴ㅳ弳桳㍡㐸攀摣慳扟慲湩潰汯㍐㐸ㅲ獟慨㠳4捥獤彡牢楡灮潯偬ㄵ爲琱獬㌱獟慨ㄵ2捥獤彡牢楡灮潯偬ㄵ爲弱桳㕡㈱爀慳灟獳牟慳彥桳㉡㘵倀卓匫䅈㔲6獲彡獰彳獲敡獟慨㠳4卐⭓䡓㍁㐸爀慳灟獳牟慳彥桳㕡㈱倀卓匫䅈ㄵ2獲彡獰彳", v12) && sub_a6fa7c(a1, a2, L"ar⭲眀+⭡眀b扡爀b⭲b⭷b⭡b佐呓匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩瀠灩⡥\u2029慣汬\u2000›匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202c彏低䉎佌䭃\u2029慣汬匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202e彆䕓乔协䝉䥐䕐\u2029慣汬匀汥捥䥴瑮牥畲瑰楐数㨺湩瑩⤨映楡敬\u2064湩映湣汴⸨⸮\u202c彆䕓乔协䝉䥐䕐\u2029慣汬匀捯敫⁴獩甠楮楮楴污穩摥䌀湡潮⁴牣慥整愠猠捯敫t慃据汥敬d潃湮捥⁴牥潲㩲 䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䍅䡄ⵅ䍅卄ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲匭䅈䔠䑃䕈䔭䑃䅓䄭卅㔲ⴶ䡓⁁䍅䡄ⵅ䍅卄ⵁ䕁ㅓ㠲匭䅈㔲‶䍅䡄ⵅ䍅卄ⵁ䕁㉓㘵匭䅈㠳‴䍅䡄ⵅ卒ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䍅䡄ⵅ卒ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䍅䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈䔠䑃䕈刭䅓䄭卅㔲ⴶ䡓⁁䍅䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈㔲‶䍅䡄ⵅ卒ⵁ䕁㉓㘵匭䅈㠳‴䡄ⵅ卒ⵁ䕁ㅓ㠲䜭䵃匭䅈㔲‶䡄ⵅ卒ⵁ䕁㉓㘵䜭䵃匭䅈㠳‴䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈䐠䕈刭䅓䄭卅㔲ⴶ䡓⁁䡄ⵅ卒ⵁ䕁ㅓ㠲匭䅈㔲‶䡄ⵅ卒ⵁ䕁㉓㘵匭䅈㔲‶䕁ㅓ㠲匭䅈伀数卮䱓映楡敬\u2064\u202d潣湮捥楴湯映楡畬敲伀数卮䱓映楡敬\u2064\u202d㕸㤰攠牲牯伀数卮䱓映楡敬\u2064\u202d伀数卮䱓映楡敬\u2064\u202d敲散癩摥攠牡祬䔠䙏伀数卮䱓映楡敬\u2064\u202d湵敤汲楹杮䈠佉爠灥牯整\u2064湡䤠伯攠牲牯伀数卮䱓映楡敬\u2064\u202d牥\u2072潮敮伀数", v13) && sub_a6fa7c(a1, a2, "b", v15))
                                            goto LABEL_a1704c;
                                        v8 = 0xcc;
                                    }
                                    else
                                    {
                                        v8 = 198;
                                    }
                                }
                                else
                                {
                                    v8 = 193;
                                }
                            }
                        }
                        else
                        {
                            v8 = 180;
                        }
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_backend.c", v8, "ec_group_explicit_todata");
                        sub_a36abc(16);
                        return 0;
                    }
                    v7 = "prime-field";
                    goto LABEL_a16ffc;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_backend.c", 317, "ossl_ec_group_todata");
                    sub_a36abc(16);
                    return 0;
                }
            }
        }
        break;
    case 4:
        if (*(long long *)&g_e8ef78)
            goto LABEL_a16e8c;
        break;
    case 2:
        if (*(long long *)&g_e8ef88)
            goto LABEL_a16e8c;
        break;
    default:
        break;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_backend.c", 308, "ossl_ec_group_todata");
    sub_a36abc(16);
    return 0;
}
