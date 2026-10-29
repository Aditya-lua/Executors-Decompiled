/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3864..0x9c3c64 (1024 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_600000;
extern char g_c7c2eb;
extern char g_1000000;
extern char g_10002b0;

unsigned long long sub_9c3864(unsigned long long *a0, unsigned long a1, unsigned long long a2, int a3, unsigned long long a4)
{
    unsigned long long v16;  // x20
    unsigned long long v17;  // x8
    unsigned long long v26;  // w28
    unsigned int v27;  // w23
    long long v28;  // x24
    unsigned long long v29;  // 4116
    long long v30;  // x20
    unsigned long long v31;  // x0
    unsigned long long v32;  // x25
    unsigned long v33;  // cc_dep1
    unsigned long long v34;  // x8
    unsigned long long v35;  // 4110
    unsigned long long v18;  // x26
    unsigned long long v36;  // 4105
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4105
    unsigned long long v39;  // x0
    unsigned long long v19;  // w23
    unsigned long long v20;  // w24
    unsigned long long v21;  // x8
    unsigned long long v22;  // x8
    unsigned long long v23;  // 4112
    unsigned long long v24;  // w25
    unsigned long long v25;  // w0
    unsigned int v0;  // [bp-0x108]
    unsigned long long v1;  // [bp-0x104]
    unsigned long long v2;  // [bp-0x100]
    unsigned long long v3;  // [bp-0xfc]
    unsigned long long v4;  // [bp-0xf8]
    unsigned long long v5;  // [bp-0xf0]
    unsigned long long v6;  // [bp-0xe8]
    unsigned long long v7;  // [bp-0xdc]
    unsigned long long v8;  // [bp-0xd8]
    unsigned long long v9;  // [bp-0xd0]
    unsigned long long v10;  // [bp-0xc8]
    unsigned long long v11;  // [bp-0xc4]
    unsigned long v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    if (a3 >= 1)
        a0();
    v16 = a3 & ~(a3 >> 31);
    v17 = (a4 & 0xf0000) - 0x10000 >> 16;
    if (1 >= (long long)v17)
    {
        if (!v17)
        {
            v19 = 0;
            v20 = 1;
            v6 = L"+*/⼯愀摮漀r攼景>㴧✽✀㴼'㸧✽✀㵾'⸧✮✀⸮✮✀㸭'㨧✺✀⼯'⬧✽✀㴭'⨧✽✀㴯'⼧㴯'┧✽✀㵞'⸧㴮'┢⨮≳猀牴湩g╠⨮筳琀敨戠来湩楮杮漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪{桴\u2065業摤敬漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪`桴\u2065湥\u2064景愠\u206e湩整灲汯瑡摥猠牴湩g╠⨮恳椀瑮牥潰慬整\u2064瑳楲杮✀⸥猪'畮扭牥✀猥'摩湥楴楦牥挀浯敭瑮愀瑴楲畢整✀孀'慭晬牯敭\u2064瑳楲杮甀普湩獩敨\u2064潣浭湥t笧❻\u202c桷捩\u2068獩椠癮污摩⠠楤\u2064潹⁵敭湡✠筜㼧)湕捩摯\u2065档牡捡整\u2072⭕砥⠠楤\u2064潹⁵敭湡✠猥㼧)湕捩摯\u2065档牡捡整\u2072⭕砥椀癮污摩唠䙔㠭猠煥敵据e┧❣㰀湵湫睯㹮戀敲歡搀o汥敳攀獬楥f湥d慦獬e潦r畦据楴湯椀f湩氀捯污渀汩爀灥慥t敲畴湲琀敨n牴敵甀瑮汩眀楨敬瘀捥潴r界畡敒畣獲潩䱮浩瑩䰀慵呵灹䱥湥瑧䱨浩瑩䰀慵偵牡敳牅潲䱲浩瑩䰀慵卵汯敶噲2敄畢䱧慵創灥牯剴瑥牵呮灹噥牡慩楤坣瑩周灹卥晵楦x界畡湉整敧呲灹㉥䰀慵䕵灸牯噴污敵祓瑮硡䐀扥杵界畡潎湉楬敮䐀扥杵界畡獕牥敄楦敮䍤慬獳獥䰀慵䅵汬睯汇扯污敄汣牡瑡潩呮䉯䍥污敬䍤慬獳䰀慵䑵獩污潬䕷瑸牥䍮慬獳湉祔数敄楦楮楴湯s界畡瑓牯䍥湯瑳敋睹牯䉤来湩䰀慵呵慲正牐晥硩潌慣l界畡潎畄汰捩瑡䉥湩牡偹敲楦x摀灥敲慣整\u2064慣\u206e敢瀠牡浡瑥楲敺\u2064湯";
            v7 = 1;
            v21 = ",";
        }
        else if (v17 == 1)
        {
            v19 = 0;
            v7 = 3;
            v20 = 2;
            v6 = " + ";
            v21 = ", ";
        }
        else
        {
            if (*(long long *)&g_10002b0 == v13)
                return 0xffffffff;
            ___stack_chk_fail();
        }
    }
    else
    {
        if (v17 == 2)
        {
            v19 = 0;
            v7 = 3;
            v20 = 2;
            v6 = " + ";
            v21 = "; ";
        }
        else if (v17 == 3)
        {
            v7 = 3;
            v20 = 1;
            v6 = " + ";
            v19 = (unsigned int)v16;
            v21 = "\n";
        }
        else
        {
            if (*(long long *)&g_10002b0 == v13)
                return 0xffffffff;
            ___stack_chk_fail();
        }
    }
    v5 = v21;
    v22 = " = ";
    if (!(a4 & 0x800000))
        v22 = "=";
    v8 = v22;
    v23 = arm64g_calculate_condition(26, a4 & 0x800000, 0, 0);
    if (v23 & 1)
        v24 = 3;
    else
        v24 = 1;
    v25 = (unsigned int)sub_af8d44();
    if (v25 >= 1)
    {
        v2 = v19;
        v3 = v24;
        v26 = 0;
        v10 = v25;
        v11 = (unsigned int)a4 & 0x600000;
        v0 = v20 + v19;
        v1 = v20;
        v27 = 0xffffffff;
        v4 = a2;
        while (1)
        {
            v28 = sub_af8cf4();
            v29 = arm64g_calculate_condition(1, v27, 1, 0);
            if (!(v29 & 1))
            {
                if (v27 == sub_a50720(v28))
                    a0();
                a0();
            }
            v27 = sub_a50720(v28);
            v30 = sub_a2d030(v28);
            v31 = sub_9f2aec(v28);
            v32 = sub_a99eac(v30);
            v33 = v11;
            switch (v11)
            {
            case 6291456:
                v34 = a4 & &g_1000000;
                if (!(unsigned int)v32)
                {
                    v35 = arm64g_calculate_condition(3, v33, &g_600000, 0);
                    v36 = arm64g_calculate_condition(4, (v35 & 1 ? v34 : 0x40000000), 0, 0);
                    if (!(v36 & 1))
                        goto LABEL_9c3be6;
                    goto LABEL_9c3be5;
                }
                else
                {
                    v37 = arm64g_calculate_condition(3, v33, &g_600000, 0);
                    v38 = arm64g_calculate_condition(0, (v37 & 1 ? v34 : 0x40000000), 0, 0);
                    if (v38 & 1)
                    {
LABEL_9c3be5:
                        goto LABEL_9c3be6;
                    }
                    else
                    {
LABEL_9c3be6:
                        v39 = sub_9c3cac();
                        if (!(v39 >> 31 & 1))
                        {
                            v16 += v39;
                            v26 += 1;
                            v18 = v16;
                            if (v26 == v10)
                            {
                                if (*(long long *)&g_10002b0 == v13)
                                    return v18;
                                ___stack_chk_fail();
                            }
                            continue;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v13)
                                return 0xffffffff;
                            ___stack_chk_fail();
                        }
                    }
                }
            case 4194304:
                v9 = v31;
                if ((unsigned int)v32)
                {
                    switch (v11)
                    {
                    case 2097152:
                        _strlen(sub_a99788(v32));
                        a0();
                    case 0:
                        _strlen(sub_a9976c(v32));
                        a0();
                    default:
                        _strlen(&g_c7c2eb);
                        a0();
                    }
                }
                break;
            default:
                v9 = v31;
                if ((unsigned int)v32)
                {
                    switch (v11)
                    {
                    case 2097152:
                        _strlen(sub_a99788(v32));
                        a0();
                    case 0:
                        _strlen(sub_a9976c(v32));
                        a0();
                    default:
                        _strlen(&g_c7c2eb);
                        a0();
                    }
                }
                break;
            }
        }
    }
    else
    {
        v18 = v16;
        if (*(long long *)&g_10002b0 == v13)
            return v18;
        ___stack_chk_fail();
    }
}
