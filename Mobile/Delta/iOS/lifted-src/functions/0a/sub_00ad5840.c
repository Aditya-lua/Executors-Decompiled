/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad5840..0xad5a5c (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_ad5840(unsigned long long a0, unsigned long long a1, unsigned long long a2, long long a3, long long a4)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x19
    unsigned int v6;  // w0
    unsigned long long v7;  // 4135
    unsigned long v8;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x21
    unsigned int v11;  // w0
    unsigned long long v12;  // 4140
    unsigned long v13;  // x8
    char v0;  // [bp-0x6c]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = 0;
    v1 = *(long long *)&g_10002b0;
    if (a0 && a1 && a2)
    {
        v4 = sub_a3f728();
        if (v4)
        {
            v5 = v4;
            v6 = sub_9e46a8(a0);
            v7 = arm64g_calculate_condition(177, v6, 7, 0);
            v8 = (v7 & 1 ? v6 + 14 : v6 + 7);
            v9 = sub_a6bf4c((long long)(v8 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v8, 61) & 0xe00000001fffffff & 0x1fffffff, "crypto/srp/srp_lib.c", 157);
            if (v9)
            {
                v10 = sub_a40ca8(a3, "SHA1", a4);
                if (v10 && sub_a3fe04(v5, v10, 0) && sub_a3fe10(v5, a1, _strlen(a1)) && sub_a3fe10(v5, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺)\n潢汯慥n湩整敧r慴汢e桴敲摡甀敳摲瑡a畢晦牥愀祮䐀扥杵界畡楔敭牔捡湩g楰栀杵e慮ne桰i煳瑲2慴u界畡湉整敧䙲獡捴污獬䰀慵䥵瑮来牥畂晦牥慆瑳慣汬s獡敳瑲爀睡敳t慲杷瑥爀睡煥慵l慲汷湥甀灮捡k敳敬瑣最瑥敭慴慴汢e敳浴瑥瑡扡敬琀湯浵敢r潴瑳楲杮洀瑡h扡s捡獯愀楳n瑡湡2瑡湡挀楥l潣桳挀獯搀来攀灸昀潬牯昀潭d牦硥p摬硥p潬ㅧ0潬g慭x業n潭晤瀀睯爀摡猀湩h楳n煳瑲琀湡h慴n汣浡p楳湧爀畯摮氀牥p獩慮n獩湩f獩楦楮整戀瑩㈳愀獲楨瑦戀湡d湢瑯戀牯戀潸r瑢獥t硥牴捡t牬瑯瑡e獬楨瑦爀灥慬散爀潲慴整爀桳晩t潣湵汴z潣湵牴z祢整睳灡戀瑹e档牡氀湥猀扵椀獮牥t敲摡㡩爀慥畤8牷瑩楥8牷瑩略8敲摡ㅩ6敲摡ㅵ6牷瑩楥㘱眀楲整ㅵ6敲摡㍩2敲摡㍵2牷瑩楥㈳眀楲整㍵2敲摡㍦2牷瑩晥㈳爀慥晤㐶眀楲整㙦4敲摡湩整敧r牷瑩", 1) && sub_a3fe10(v5, a2, _strlen(a2)) && sub_a3ff7c(v5, &v0, 0) && sub_a3fe04(v5, v10, 0) && !(sub_9e5350(a0, v9) >> 31 & 1) && !(v11 = sub_9e46a8(a0), v12 = arm64g_calculate_condition(177, v11, 7, 0), v13 = (v12 & 1 ? v11 + 14 : v11 + 7), !sub_a3fe10(v5, v9, (long long)(v13 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v13, 61) & 0xe00000001fffffff & 0x1fffffff) || !sub_a3fe10(v5, &v0, 20) || !sub_a3ff7c(v5, &v0, 0)))
                    v4 = sub_9e4db0(&v0, 20, 0);
                else
                    v4 = 0;
            }
            else
            {
                v4 = 0;
                v10 = 0;
            }
            sub_a3f52c(v10);
            sub_a6c2e4(v9, "crypto/srp/srp_lib.c", 184);
            sub_a3f73c(v5);
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
