/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c06b8..0x1c091c (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c06b8_1 {
    char padding_0[8];
    char field_8;
    char padding_9[983];
    unsigned long long field_3e0;
    unsigned long long field_3e8;
} st_1c06b8_1;

typedef struct st_1c06b8_0 {
    char field_0;
} st_1c06b8_0;

extern unsigned long long g_e72e98;
extern unsigned long long g_e72ef0;
extern char g_10002b0;

unsigned long long sub_1c06b8(st_1c06b8_1 *a0, long long a1, unsigned long a2)
{
    unsigned long long v12;  // x19
    unsigned long v13;  // x25
    unsigned long v14;  // x19
    unsigned long long v15;  // x20
    unsigned long long *v16;  // x24
    long long v17;  // x0
    long long v18;  // x0
    long long v19;  // x0
    long long v20;  // x0
    long long v21;  // x0
    st_1c06b8_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_1c06b8_0 *v1;  // [bp-0xc8]
    unsigned long long v2;  // [bp-0xc0]
    unsigned long long v3;  // [bp-0xb8]
    unsigned long long v4;  // [bp-0xb0]
    char v5;  // [bp-0xa1]
    unsigned long long *v6;  // [bp-0xa0]
    char v7;  // [bp-0x98]
    char *v8;  // [bp-0x78]
    unsigned long v9;  // [bp-0x58]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (sub_6b08(&a0->field_8) == a2 && sub_9fd8(&a0->field_8, a1) & 1)
    {
        v12 = 1;
    }
    else
    {
        v2 = 0;
        v3 = 0;
        v4 = 0;
        v8 = &v2;
        sub_1b2064(&v7, &v8, &v5);
        sub_1be4bc(&v8, &v7);
        sub_1a413c(a1, a1 + a2, 46, -0x1, &v8);
        sub_181a8(&v8);
        sub_181a8(&v7);
        v13 = a0->field_3e8;
        v14 = a0->field_3e0;
        v15 = v2;
        if (v13 - v14 == v3 - v15)
        {
            v16 = &g_e72ef0;
            if (v14 != v13)
            {
                do
                {
                    if (sub_20b98(v15, v14) & 1 || sub_9fd8(v15, L"*/⼯愀摮漀r攼景>㴧✽✀㴼'㸧✽✀㵾'⸧✮✀⸮✮✀㸭'㨧✺✀⼯'⬧✽✀㴭'⨧✽✀㴯'⼧㴯'┧✽✀㵞'⸧㴮'┢⨮≳猀牴湩g╠⨮筳琀敨戠来湩楮杮漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪{桴\u2065業摤敬漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪`桴\u2065湥\u2064景愠\u206e湩整灲汯瑡摥猠牴湩g╠⨮恳椀瑮牥潰慬整\u2064瑳楲杮✀⸥猪'畮扭牥✀猥'摩湥楴楦牥挀浯敭瑮愀瑴楲畢整✀孀'慭晬牯敭\u2064瑳楲杮甀普湩獩敨\u2064潣浭湥t笧❻\u202c桷捩\u2068獩椠癮污摩⠠楤\u2064潹⁵敭湡✠筜㼧)湕捩摯\u2065档牡捡整\u2072⭕砥⠠楤\u2064潹⁵敭湡✠猥㼧)湕捩摯\u2065档牡捡整\u2072⭕砥椀癮污摩唠䙔㠭猠煥敵据e┧❣㰀湵湫睯㹮戀敲歡搀o汥敳攀獬楥f湥d慦獬e潦r畦据楴湯椀f湩氀捯污渀汩爀灥慥t敲畴湲琀敨n牴敵甀瑮汩眀楨敬瘀捥潴r界畡敒畣獲潩䱮浩瑩䰀慵呵灹䱥湥瑧䱨浩瑩䰀慵偵牡敳牅潲䱲浩瑩䰀慵卵汯敶噲2敄畢䱧慵創灥牯剴瑥牵呮灹噥牡慩楤坣瑩周灹卥晵楦x界畡湉整敧呲灹㉥䰀慵䕵灸牯噴污敵祓瑮硡䐀扥杵界畡潎湉楬敮䐀扥杵界畡獕牥敄楦敮䍤慬獳獥䰀慵䅵汬睯汇扯污敄汣牡瑡潩呮䉯䍥污敬䍤慬獳䰀慵䑵獩污潬䕷瑸牥䍮慬獳湉祔数敄楦楮楴湯s界畡瑓牯䍥湯瑳敋睹牯䉤来湩䰀慵呵慲正牐晥硩潌慣l界畡潎畄汰捩瑡䉥湩牡偹敲楦x摀灥敲慣整\u2064慣\u206e敢瀠牡浡瑥楲敺\u2064湯祬") & 1)
                        continue;
                    if (sub_6b08(v15) && *(char *)sub_9c78(v15, sub_6b08(v15) - 1) == 42)
                    {
                        v17 = sub_6b08(v15);
                        v18 = sub_a0c8(v14);
                        if (std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::compare(v15, 0, v17 - 1, v18, sub_6b08(v14)))
                            goto LABEL_1c0854;
                    }
                    else
                    {
LABEL_1c0854:
                        v16 = &g_e72e98;
                        break;
                    }
                } while ((v15 += 24, v14 += 24, v14 != v13));
            }
            goto *((void *)(*v16));
        }
        else
        {
            v12 = 0;
            v8 = &v2;
            sub_271a8(&v8);
        }
    }
    if (*(long long *)&g_10002b0 == v9)
        return v12;
    v19 = ___stack_chk_fail();
    sub_181a8(&v8);
    sub_181a8(&v7);
    v6 = &v2;
    sub_271a8(&v6);
    v20 = __Unwind_Resume(v19);
    v6 = &v2;
    sub_271a8(&v6);
    v21 = __Unwind_Resume(v20);
    v6 = &v2;
    sub_271a8(&v6);
    __Unwind_Resume(v21);
}
