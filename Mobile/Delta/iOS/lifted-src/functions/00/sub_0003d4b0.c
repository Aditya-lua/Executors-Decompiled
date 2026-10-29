/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d4b0..0x3df74 (2756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d4b0_2 {
    struct st_3d4b0_1 *field_0;
    char padding_8[96];
    char field_68;
    char padding_69[119];
    char field_e0;
    char padding_e1[199];
    char field_1a8;
    char padding_1a9[1107];
    unsigned int field_5fc;
    char padding_600[24];
    unsigned long long field_618;
    char padding_620[8];
    char field_628;
} st_3d4b0_2;

typedef struct st_3d4b0_1 {
    char padding_0[928];
    char field_3a0;
} st_3d4b0_1;

typedef struct st_3d4b0_0 {
    char field_0;
} st_3d4b0_0;

extern unsigned long long g_c7c2eb;
extern unsigned long long g_e65cb0;
extern unsigned long long g_e65ff8;
extern unsigned int g_f00b80;
extern char g_f0cc58;
extern unsigned int g_f0cd78;
extern unsigned int g_f0cd98;
extern unsigned int g_f0cdb8;

unsigned long long sub_3d4b0(st_3d4b0_2 *a0, void* a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long long v17;  // x26
    unsigned long long v18;  // x0
    unsigned long long v26;  // x26
    unsigned long long v27;  // w0
    unsigned long long v28;  // x10
    unsigned long long v29;  // x10
    long long v30;  // x27, Other Possible Types: unsigned int, unsigned long long
    unsigned long long v31;  // w10
    unsigned long long v32;  // x0
    unsigned long long v33;  // x8
    unsigned long long v34;  // w9
    unsigned long long v35;  // x0
    unsigned int v19;  // w23
    void* v36;  // x8
    unsigned long long v37;  // x9
    unsigned long long v38;  // x22
    unsigned int v39;  // w0
    void* v40;  // x8
    unsigned long long v41;  // x21
    unsigned long long v42;  // x0
    unsigned long long v43;  // x27
    void* v44;  // x8
    unsigned long long v45;  // x10
    char v20;  // x24
    unsigned long v46;  // x1
    unsigned long v47;  // x2
    unsigned int v48;  // w22
    unsigned long long v49;  // x1
    unsigned long v50;  // x2
    unsigned int v51;  // w22
    unsigned long long idx;  // x9
    unsigned long long v53;  // x26
    char v54;  // x23
    unsigned long long v55;  // x22
    unsigned long long v21;  // x0
    unsigned long v56;  // x1
    unsigned long long v57;  // x2
    unsigned int v58;  // w21
    unsigned long long v59;  // x22
    unsigned long v60;  // x23
    long long len;  // x21
    unsigned long long v62;  // x0
    char v63;  // x0
    long long v64;  // x0
    long long v65;  // x0
    unsigned long long v22;  // x7
    long long v66;  // x0
    unsigned int v67;  // w22
    unsigned long v68;  // x21
    unsigned long long i;  // x21
    unsigned long long v23;  // x21
    unsigned long long v24;  // x28
    unsigned long long v25;  // x1
    unsigned long long v0;  // [bp-0x108]
    unsigned long long v1;  // [bp-0x100]
    unsigned long long v2;  // [bp-0xf8]
    unsigned long long v3;  // [bp-0xe8]
    unsigned long long v4;  // [bp-0xe4]
    unsigned int v5;  // [bp-0xe0]
    unsigned long long v6;  // [bp-0xdc]
    unsigned int v7;  // [bp-0xd8]
    st_3d4b0_0 **v8;  // [bp-0xd0], Other Possible Types: char
    st_3d4b0_0 *v9;  // [bp-0xc8]
    unsigned long long v10;  // [bp-0xc0]
    double v11;  // [bp-0xb8]
    unsigned long long *v12;  // [bp-0x98], Other Possible Types: st_3d4b0_0 *, unsigned long long
    double v13;  // [bp-0x90]
    void* v14;  // [bp-0x70]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = a3;
    v9 = &v8;
    v8 = &v9;
    v14 = a1;
    sub_395b0();
    if (*(int *)&a0->padding_8[0] >= 2 && !((char)a1[72] & 1))
    {
        v12 = sub_3e034(a0, (long long)a1[32]);
        if (v12)
        {
            v18 = sub_3b040(&a0->field_68, &v12);
            if (v18)
            {
                if (*(char *)(v18 + 52) == 1)
                {
                    *(unsigned int *)&v30 = g_f0cdb8;
                    if (sub_3cc04(a0, v14, v12, a2, v17, a5, g_f0cd78, g_f0cd98, v30) & 1)
                        goto *((void *)(g_e65cb0));
                }
                if (v12 && !(*(char *)(v18 + 52) & 1))
                {
                    if (*(char *)(v12 + 112) & 1)
                    {
                        goto LABEL_3dd98;
                    }
                    else
                    {
                        if (a0->field_628 & 1 || (char)a0[1].field_0 == 1)
                        {
LABEL_3dd98:
                            sub_300cc(a0->field_0);
                        }
                    }
                }
            }
            else if (v12)
            {
                if (*(char *)(v12 + 112))
                    goto LABEL_3dd98;
                else
                    goto LABEL_3dd98;
            }
        }
        goto *((void *)(g_e65ff8));
    }
    v19 = a0->field_5fc;
    v7 = v19;
    if ((unsigned int)a4)
    {
        v20 = sub_3b87c(a0) - v17;
        if (1 <= *(int *)&a0->padding_8[0])
            goto LABEL_3d65c;
    }
    else
    {
        v20 = sub_3b87c(a0);
        if (*(int *)&a0->padding_8[0] >= 1)
        {
LABEL_3d65c:
            if (!((char)v14[72] & 1) && !(v21 = sub_158b8(&a0->field_1a8, &v14), !v21 || (v22 = *(int *)(v21 + 8), !(unsigned int)v22)))
            {
                if (!(v22 >> 31 & 1))
                {
                    v23 = v17;
                    v24 = v22;
                    if (a0->field_0->field_3a0 >> 4 & 1)
                    {
                        v25 = &a0->padding_69[79];
                        v30 = sub_36d28((long long)v14[32], v25, &a0->field_e0);
                        v26 = v25;
                        if ((long long)v14[64])
                            v27 = (unsigned int)sub_4489c(a0, *(long long *)((long long)v14[56] + (long long)v14[64] * 8 - 8));
                        else
                            v27 = 0;
                        if (v30)
                        {
                            v28 = &g_c7c2eb;
                            if (v27)
                                v28 = L"+*/⼯愀摮漀r攼景>㴧✽✀㴼'㸧✽✀㵾'⸧✮✀⸮✮✀㸭'㨧✺✀⼯'⬧✽✀㴭'⨧✽✀㴯'⼧㴯'┧✽✀㵞'⸧㴮'┢⨮≳猀牴湩g╠⨮筳琀敨戠来湩楮杮漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪{桴\u2065業摤敬漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪`桴\u2065湥\u2064景愠\u206e湩整灲汯瑡摥猠牴湩g╠⨮恳椀瑮牥潰慬整\u2064瑳楲杮✀⸥猪'畮扭牥✀猥'摩湥楴楦牥挀浯敭瑮愀瑴楲畢整✀孀'慭晬牯敭\u2064瑳楲杮甀普湩獩敨\u2064潣浭湥t笧❻\u202c桷捩\u2068獩椠癮污摩⠠楤\u2064潹⁵敭湡✠筜㼧)湕捩摯\u2065档牡捡整\u2072⭕砥⠠楤\u2064潹⁵敭湡✠猥㼧)湕捩摯\u2065档牡捡整\u2072⭕砥椀癮污摩唠䙔㠭猠煥敵据e┧❣㰀湵湫睯㹮戀敲歡搀o汥敳攀獬楥f湥d慦獬e潦r畦据楴湯椀f湩氀捯污渀汩爀灥慥t敲畴湲琀敨n牴敵甀瑮汩眀楨敬瘀捥潴r界畡敒畣獲潩䱮浩瑩䰀慵呵灹䱥湥瑧䱨浩瑩䰀慵偵牡敳牅潲䱲浩瑩䰀慵卵汯敶噲2敄畢䱧慵創灥牯剴瑥牵呮灹噥牡慩楤坣瑩周灹卥晵楦x界畡湉整敧呲灹㉥䰀慵䕵灸牯噴污敵祓瑮硡䐀扥杵界畡潎湉楬敮䐀扥杵界畡獕牥敄楦敮䍤慬獳獥䰀慵䅵汬睯汇扯污敄汣牡瑡潩呮䉯䍥污敬䍤慬獳䰀慵䑵獩污潬䕷瑸牥䍮慬獳湉祔数敄楦楮楴湯s界畡瑓牯䍥湯瑳敋睹牯䉤来湩䰀慵呵慲正牐晥硩潌慣l界畡潎畄汰捩瑡䉥湩牡偹敲楦x摀灥敲慣整\u2064慣\u206e敢瀠牡浡瑥楲敺\u2064湯";
                            v1 = (long long)v14[64];
                            v2 = v28;
                            v0 = v26;
                            sub_300cc();
                            v22 = v24;
                        }
                        else
                        {
                            v22 = v24;
                            if (v26)
                            {
                                v29 = &g_c7c2eb;
                                if (v27)
                                    v29 = L"+*/⼯愀摮漀r攼景>㴧✽✀㴼'㸧✽✀㵾'⸧✮✀⸮✮✀㸭'㨧✺✀⼯'⬧✽✀㴭'⨧✽✀㴯'⼧㴯'┧✽✀㵞'⸧㴮'┢⨮≳猀牴湩g╠⨮筳琀敨戠来湩楮杮漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪{桴\u2065業摤敬漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪`桴\u2065湥\u2064景愠\u206e湩整灲汯瑡摥猠牴湩g╠⨮恳椀瑮牥潰慬整\u2064瑳楲杮✀⸥猪'畮扭牥✀猥'摩湥楴楦牥挀浯敭瑮愀瑴楲畢整✀孀'慭晬牯敭\u2064瑳楲杮甀普湩獩敨\u2064潣浭湥t笧❻\u202c桷捩\u2068獩椠癮污摩⠠楤\u2064潹⁵敭湡✠筜㼧)湕捩摯\u2065档牡捡整\u2072⭕砥⠠楤\u2064潹⁵敭湡✠猥㼧)湕捩摯\u2065档牡捡整\u2072⭕砥椀癮污摩唠䙔㠭猠煥敵据e┧❣㰀湵湫睯㹮戀敲歡搀o汥敳攀獬楥f湥d慦獬e潦r畦据楴湯椀f湩氀捯污渀汩爀灥慥t敲畴湲琀敨n牴敵甀瑮汩眀楨敬瘀捥潴r界畡敒畣獲潩䱮浩瑩䰀慵呵灹䱥湥瑧䱨浩瑩䰀慵偵牡敳牅潲䱲浩瑩䰀慵卵汯敶噲2敄畢䱧慵創灥牯剴瑥牵呮灹噥牡慩楤坣瑩周灹卥晵楦x界畡湉整敧呲灹㉥䰀慵䕵灸牯噴污敵祓瑮硡䐀扥杵界畡潎湉楬敮䐀扥杵界畡獕牥敄楦敮䍤慬獳獥䰀慵䅵汬睯汇扯污敄汣牡瑡潩呮䉯䍥污敬䍤慬獳䰀慵䑵獩污潬䕷瑸牥䍮慬獳湉祔数敄楦楮楴湯s界畡瑓牯䍥湯瑳敋睹牯䉤来湩䰀慵呵慲正牐晥硩潌慣l界畡潎畄汰捩瑡䉥湩牡偹敲楦x摀灥敲慣整\u2064慣\u206e敢瀠牡浡瑥楲敺\u2064湯";
                                v0 = (long long)v14[64];
                                v1 = v29;
                                v30 = v26;
                                sub_300cc();
                                v30 = v26;
                                v22 = v24;
                            }
                        }
                    }
                    if ((unsigned int)v22 != 0x22)
                    {
                        v17 = v23;
                        if ((unsigned int)v22 != 57)
                            goto LABEL_3dcb8;
                        v31 = 0;
                        v22 = 0xffffffff;
                        if ((unsigned int)v17 == 1 && !(a5 & 1))
                        {
                            v32 = sub_3a088(a0, v14, a2, 1, a4, 0, v20);
                            a0->field_5fc = v19;
                            return v32;
                        }
                    }
                    else
                    {
                        v17 = v23;
                        if ((long long)v14[64] == 3 && sub_4663c(a0, *(long long *)((long long)v14[56] + 8)) && sub_4663c(a0, *(long long *)((long long)v14[56] + 16)))
                        {
                            sub_46ce0(a0, *(long long *)((long long)v14[56] + 8));
                            sub_46ce0(a0, *(long long *)((long long)v14[56] + 16));
                            if (v12 == 3)
                                v33 = (int)v13;
                            else
                                v33 = 0xffffffff;
                            if (v10 == 3)
                                v34 = (int)v11;
                            else
                                v34 = 0xffffffff;
                            if (!(v33 >> 31 & 1) && v34 >= 1 && 33 > v34 + (unsigned int)v33)
                            {
                                v35 = sub_2d54c(a0->field_0);
                                if (!(v35 >> 31 & 1))
                                {
                                    *(unsigned int *)&v30 = v35;
                                    v32 = sub_40e80(a0, v14, a2, v17, a4, a5, v20, 59, v30);
                                    a0->field_5fc = v19;
                                    return v32;
                                }
                                sub_45808(v14 + 12, "Exceeded constant limit; simplify the code to compile");
                                __debugbreak();
                            }
                        }
LABEL_3dcb8:
                        v36 = v14;
                        v37 = (long long)v36[64];
                        if ((long long)v36[64] == 3)
                        {
                            v38 = 0;
                            do
                            {
                                if (!(sub_42480(a0, *(long long *)((long long)v36[56] + v38 * 8)) >> 31 & 1))
                                {
                                    v36 = v14;
                                    v37 = (long long)v36[64];
                                    if ((unsigned long long)((long long)v36[64] - 1) >= 3)
                                        goto LABEL_3ddbc;
                                    goto LABEL_3dd0c;
                                }
                            } while ((v38 += 1, v36 = v14, v37 = (long long)v36[64], v38 < (unsigned long long)(long long)v36[64]));
                        }
                        if (2 > v37 - 1)
                        {
LABEL_3dd0c:
                            v22 = v24;
                            if (!(sub_4489c(a0, *(long long *)((long long)v36[56] + v37 * 8 - 8)) & 1))
                            {
                                v30 = 0xffffffff;
                                v32 = sub_40e80(a0, v14, a2, v17, a4, a5, v20);
LABEL_3da18:
                                a0->field_5fc = v19;
                                return v32;
                            }
                            else if (*(int *)&a0->padding_8[0] >= 2)
                            {
                                v39 = sub_36550(v22);
                                v31 = 1;
                                v22 = v24;
                                if ((int)v14[64] == v39)
                                {
                                    v22 = v24;
                                    if (*(long long *)((long long)v36[56] + v37 * 8 - 8) & 1)
                                    {
                                        v30 = 0xffffffff;
                                        v32 = sub_40e80(a0);
                                        a0->field_5fc = v19;
                                        return v32;
                                    }
                                }
                            }
                            else
                            {
                                v31 = 1;
                                goto LABEL_3d6e0;
                            }
                        }
                        else
                        {
LABEL_3ddbc:
                            v31 = 1;
                            v22 = v24;
                            goto LABEL_3d6e0;
                        }
                    }
                }
                else
                {
                    v31 = 0;
                    goto LABEL_3d6e0;
                }
                goto LABEL_3d6e0;
            }
        }
    }
    v31 = 0;
    v22 = 0xffffffff;
LABEL_3d6e0:
    v40 = v14;
    v3 = v31;
    v4 = (unsigned int)v22;
    if ((char)v40[72] == 1)
    {
        if (*(int *)((long long)v40[32] + 8) == g_f00b80)
            v41 = (long long)v40[32];
        else
            v41 = 0;
        v42 = sub_42480();
        v43 = (char)v42;
        if (!(v42 >> 31 & 1))
        {
            v5 = v17;
            v6 = (unsigned int)a4;
            v44 = v14;
            v45 = (long long)v44[64];
            if (!v45)
                goto LABEL_3d7ec;
            goto LABEL_3d730;
        }
        else
        {
            v46 = *(long long *)(v41 + 32);
            v12 = &v10;
            v10 = &v12;
            v47 = v20;
            v48 = a0->field_5fc;
            a0->field_5fc = (unsigned int)v47 + 1;
            sub_47e48(a0, v46, v47, 1);
            a0->field_5fc = v48;
            v43 = v20;
            v5 = v17;
            v6 = (unsigned int)a4;
            v44 = v14;
            v45 = (long long)v44[64];
            if (!v45)
                goto LABEL_3d7ec;
            goto LABEL_3d730;
        }
    }
    else if (!(v22 >> 31 & 1))
    {
        v43 = 0;
        v5 = v17;
        v6 = (unsigned int)a4;
        v44 = v14;
        v45 = (long long)v44[64];
        if (!v45)
            goto LABEL_3d7ec;
LABEL_3d730:
        idx = 0;
        v53 = 0;
        v54 = v20 + 1;
        do
        {
            v55 = idx + 1;
            if (v55 == v45)
            {
                v53 = sub_46138(a0, *(long long *)((long long)v44[56] + idx * 8), (char)v44[72] + v54 + (unsigned int)idx & 0xff);
            }
            else
            {
                v56 = *(long long *)((long long)v44[56] + idx * 8);
                v12 = &v10;
                v10 = &v12;
                v57 = v54 + (unsigned int)idx + (char)v44[72] & 0xff;
                v58 = a0->field_5fc;
                a0->field_5fc = (unsigned int)v57 + 1;
                sub_47e48(a0, v56, v57, 1);
                a0->field_5fc = v58;
            }
        } while ((v44 = v14, v45 = (long long)v44[64], idx = v55, v45 > v55));
    }
    else
    {
        v49 = (long long)v40[32];
        v12 = &v10;
        v10 = &v12;
        v50 = v20;
        v51 = a0->field_5fc;
        a0->field_5fc = (unsigned int)v50 + 1;
        sub_47e48(a0, v49, v50, 1);
        v43 = 0;
        a0->field_5fc = v51;
        v5 = v17;
        v6 = (unsigned int)a4;
        v44 = v14;
        v45 = (long long)v44[64];
        if (v45)
            goto LABEL_3d730;
LABEL_3d7ec:
        v53 = 0;
    }
    sub_439a4(a0, (long long)v44[32]);
    if ((char)v14[72] == 1)
    {
        if (*(int *)((long long)v14[32] + 8) == g_f00b80)
            v59 = (long long)v14[32];
        else
            v59 = 0;
        sub_38fe4();
        v60 = *(long long *)(v59 + 40);
        len = _strlen(v60);
        v62 = sub_2df40(a0->field_0, v60, len);
        if (v62 >> 31 & 1)
        {
            sub_45808(v59 + 12, "Exceeded constant limit; simplify the code to compile");
            __debugbreak();
        }
        v63 = sub_2ffe8(v60, len);
        sub_2ad10(a0->field_0, 20, v20, v43, v63);
        sub_31514(a0->field_0, v62);
        sub_46e8c(a0, *(long long *)(v59 + 32), v43, 4, 2);
    }
    else if (v3)
    {
        v64 = sub_2bc4c(a0->field_0);
        sub_2ad10(a0->field_0, 0x44, v4 & 0xff, 0, 0);
        sub_47e48(a0, (long long)v14[32], v20, 1);
        v65 = sub_2bc4c(a0->field_0);
        if (!(sub_290e4(a0->field_0, v64, v65) & 1))
        {
            sub_45808((long long)v14[32] + 12, "Exceeded jump distance limit; simplify the code to compile");
            __debugbreak();
        }
    }
    if (*(long long *)(a0->field_618 + 152) && v4 < 0 && g_f0cc58 & 1 && !(v53 & 1) && !(a5 & 1))
    {
        v66 = sub_30d24(a0->field_0, 0);
        v67 = v5;
        v68 = v6;
        sub_2ad10(a0->field_0, 87, v20, (char)v14[72] + (char)v14[64] + 1, (char)v67 + 1);
        v32 = sub_31514(a0->field_0, v66);
    }
    else
    {
        v68 = v6;
        v67 = v5;
        v32 = sub_2ad10();
    }
    v19 = v7;
    if (!(v68 & 1))
    {
        v19 = v7;
        if (v67)
        {
            i = 0;
            do
            {
                v32 = sub_2ad10(a0->field_0, 6, (unsigned int)i + (unsigned int)a2 & 0xff, v20 + (unsigned int)i & 0xff, 0);
                i += 1;
                v19 = v7;
            } while (v67 != i);
        }
    }
    goto LABEL_3da18;
}
