/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979174..0x979348 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979174_0 {
    char padding_0[1568];
    unsigned long long field_620;
    char field_624;
    char padding_625[3];
    char field_628;
} st_979174_0;

extern unsigned long long g_c7c2eb;

char sub_979174(st_979174_0 *a0, unsigned long a1, char a2, long long a3, char a4, char a5, unsigned int a6, unsigned long long a7)
{
    long long v21;  // x26
    char v22;  // x0
    char v31;  // x0
    unsigned long v32;  // cc_dep1
    unsigned long long v33;  // x27
    unsigned long long v34;  // 4105
    unsigned long long v35;  // 4105
    unsigned long long v36;  // x28
    unsigned long long v37;  // 4105
    unsigned long long v38;  // 4105
    char v39;  // x0
    unsigned long long v23;  // x23
    unsigned long v24;  // cc_dep1
    unsigned long long v25;  // x9
    unsigned long long v26;  // 4108
    unsigned long long v27;  // 4108
    unsigned long long v28;  // x8
    unsigned long long v29;  // 4116
    unsigned long long v30;  // x8
    unsigned long v0;  // [bp-0x100]
    unsigned long long v1;  // [bp-0xf8]
    unsigned long long v2;  // [bp-0xf0]
    unsigned long long v3;  // [bp-0xe8]
    long long v4;  // [bp-0xe0], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0xd8]
    unsigned long long v6;  // [bp-0xd0]
    unsigned long long v7;  // [bp-0xc8]
    long long v8;  // [bp-0xc0]
    unsigned long long v9;  // [bp-0xb8]
    unsigned long long v10;  // [bp-0xb0]
    unsigned long long v11;  // [bp-0xa8]
    unsigned int v12;  // [bp-0x9c]
    unsigned long long v13;  // [bp-0x98]
    char v14;  // [bp-0x90], Other Possible Types: unsigned long
    unsigned long long v15;  // [bp-0x88]
    char v16;  // [bp-0x80], Other Possible Types: long long
    unsigned long long len;  // [bp-0x78]
    char v18;  // [bp-0x70]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v18 = 0;
    v14 = 0;
    v16 = 0;
    if (a1 == 1)
        v21 = 786691;
    else
        v21 = 382;
    v22 = sub_990768();
    if ((char)(*((char *)&a0->field_620 + 4)) >> 6 & 1)
        return v22;
    v12 = a6;
    v13 = a7;
    v23 = &g_c7c2eb;
    v24 = v22;
    if (!v22)
    {
        v25 = &g_c7c2eb;
        v26 = arm64g_calculate_condition(4, v24, 0, 0);
        if (!(v26 & 1))
            goto LABEL_979206;
LABEL_979205:
        v28 = &g_c7c2eb;
    }
    else
    {
        v25 = v22;
        v27 = arm64g_calculate_condition(4, v24, 0, 0);
        if (v27 & 1)
            goto LABEL_979205;
LABEL_979206:
        v28 = " (";
    }
    v10 = v28;
    v11 = v25;
    v29 = arm64g_calculate_condition(4, v24, 0, 0);
    if (v29 & 1)
        v30 = &g_c7c2eb;
    else
        v30 = L"):]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺)\n潢汯慥n湩整敧r慴汢e桴敲摡甀敳摲瑡a畢晦牥愀祮䐀扥杵界畡楔敭牔捡湩g楰栀杵e慮ne桰i煳瑲2慴u界畡湉整敧䙲獡捴污獬䰀慵䥵瑮来牥畂晦牥慆瑳慣汬s獡敳瑲爀睡敳t慲杷瑥爀睡煥慵l慲汷湥甀灮捡k敳敬瑣最瑥敭慴慴汢e敳浴瑥瑡扡敬琀湯浵敢r潴瑳楲杮洀瑡h扡s捡獯愀楳n瑡湡2瑡湡挀楥l潣桳挀獯搀来攀灸昀潬牯昀潭d牦硥p摬硥p潬ㅧ0潬g慭x業n潭晤瀀睯爀摡猀湩h楳n煳瑲琀湡h慴n汣浡p楳湧爀畯摮氀牥p獩慮n獩湩f獩楦楮整戀瑩㈳愀獲楨瑦戀湡d湢瑯戀牯戀潸r瑢獥t硥牴捡t牬瑯瑡e獬楨瑦爀灥慬散爀潲慴整爀桳晩t潣湵汴z潣湵牴z祢整睳灡戀瑹e档牡氀湥猀扵椀獮牥t敲摡㡩爀慥畤8牷瑩楥8牷瑩略8敲摡ㅩ6敲摡ㅵ6牷瑩楥㘱眀楲整ㅵ6敲摡㍩2敲摡㍵2牷瑩楥㈳眀楲整㍵2敲摡㍦2牷瑩晥㈳爀慥晤㐶眀楲整㙦4敲摡湩整敧r牷";
    v9 = v30;
    if (a4)
        sub_a374ac(a4);
    if (a2)
    {
        v31 = sub_990748(a2);
        v32 = v31;
        if (!v31)
        {
            v33 = &g_c7c2eb;
            v34 = arm64g_calculate_condition(4, v32, 0, 0);
            if (!(v34 & 1))
                goto LABEL_97923e;
LABEL_97923d:
            v36 = &g_c7c2eb;
            v37 = arm64g_calculate_condition(4, v32, 0, 0);
            if (!(v37 & 1))
                goto LABEL_979242;
LABEL_979241:
        }
        else
        {
            v33 = v31;
            v35 = arm64g_calculate_condition(4, v32, 0, 0);
            if (v35 & 1)
                goto LABEL_97923d;
LABEL_97923e:
            v36 = " (";
            v38 = arm64g_calculate_condition(4, v32, 0, 0);
            if (v38 & 1)
                goto LABEL_979241;
LABEL_979242:
            v23 = L"):]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺)\n潢汯慥n湩整敧r慴汢e桴敲摡甀敳摲瑡a畢晦牥愀祮䐀扥杵界畡楔敭牔捡湩g楰栀杵e慮ne桰i煳瑲2慴u界畡湉整敧䙲獡捴污獬䰀慵䥵瑮来牥畂晦牥慆瑳慣汬s獡敳瑲爀睡敳t慲杷瑥爀睡煥慵l慲汷湥甀灮捡k敳敬瑣最瑥敭慴慴汢e敳浴瑥瑡扡敬琀湯浵敢r潴瑳楲杮洀瑡h扡s捡獯愀楳n瑡湡2瑡湡挀楥l潣桳挀獯搀来攀灸昀潬牯昀潭d牦硥p摬硥p潬ㅧ0潬g慭x業n潭晤瀀睯爀摡猀湩h楳n煳瑲琀湡h慴n汣浡p楳湧爀畯摮氀牥p獩慮n獩湩f獩楦楮整戀瑩㈳愀獲楨瑦戀湡d湢瑯戀牯戀潸r瑢獥t硥牴捡t牬瑯瑡e獬楨瑦爀灥慬散爀潲慴整爀桳晩t潣湵汴z潣湵牴z祢整睳灡戀瑹e档牡氀湥猀扵椀獮牥t敲摡㡩爀慥畤8牷瑩楥8牷瑩略8敲摡ㅩ6敲摡ㅵ6牷瑩楥㘱眀楲整ㅵ6敲摡㍩2敲摡㍵2牷瑩楥㈳眀楲整㍵2敲摡㍦2牷瑩晥㈳爀慥晤㐶眀楲整㙦4敲摡湩整敧r牷";
        }
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_channel.c", 3500, "ossl_quic_channel_raise_protocol_error_loc");
        v7 = v23;
        v8 = a3;
        v5 = v36;
        v6 = v33;
        v3 = v9;
        v4 = a2;
        v1 = v10;
        v2 = v11;
        v0 = a1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_channel.c", 3509, "ossl_quic_channel_raise_protocol_error_loc");
        v3 = v9;
        v4 = a3;
        v1 = v10;
        v2 = v11;
        v0 = a1;
    }
    sub_a36abc(20, v21);
    if (a5)
        sub_a369bc(a5);
    v39 = *(long long *)&a0->field_624;
    if (v39 || (v39 = sub_a3708c(0), *(unsigned long long *)&a0->field_624 = v39, v39))
        sub_a3709c(v39);
    v14 = a1;
    v15 = a2;
    v16 = a3;
    len = _strlen(a3);
    a0->field_620 = a0->field_620 | 0x4000000000;
    return sub_978d84(a0, &v14, 0);
}
