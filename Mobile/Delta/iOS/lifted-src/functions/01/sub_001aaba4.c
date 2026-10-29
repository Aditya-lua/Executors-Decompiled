/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aaba4..0x1ac03c (5272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aaba4_0 {
    char field_0;
} st_1aaba4_0;

extern char g_e69a98;
extern unsigned long long g_e69ac0;
extern unsigned long long g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

void sub_1aaba4(long long a0, long long a1, long long a2, unsigned long a3, long long a4, long long a5, unsigned int a6)
{
    unsigned long long v35;  // x28
    unsigned long long v36;  // x27
    unsigned long long v45;  // x30
    unsigned int *v46;  // x8
    long long v48;  // x28
    long long v50;  // x0
    long long v51;  // x26
    unsigned long long v52;  // 4106
    long long v53;  // x0
    unsigned long long v54;  // 4106
    unsigned long long v37;  // x26
    unsigned long long *v56;  // x20
    long long v57;  // x26
    long long v58;  // x27
    long long v60;  // x26
    long long v61;  // x0
    long long v62;  // x0
    long long v63;  // x0
    unsigned long long v38;  // x25
    long long v65;  // x0
    long long v66;  // x0
    long long v67;  // x25
    long long v68;  // x26
    long long v70;  // x25
    long long v71;  // x0
    long long v72;  // x0
    unsigned long long v39;  // x24
    unsigned long long v40;  // x23
    unsigned long long v41;  // x22
    unsigned long long v42;  // x21
    unsigned long long v43;  // x20
    unsigned long long v44;  // x19
    unsigned int v0;  // [bp-0x43c]
    st_1aaba4_0 **v1;  // [bp-0x438], Other Possible Types: char
    st_1aaba4_0 *v2;  // [bp-0x430]
    char v3;  // [bp-0x248], Other Possible Types: unsigned long long
    st_1aaba4_0 **v4;  // [bp-0x230], Other Possible Types: char, unsigned long long
    unsigned long long *v5;  // [bp-0x218], Other Possible Types: char
    char v6;  // [bp-0x200]
    unsigned long long v7;  // [bp-0x1e8]
    unsigned long long v8;  // [bp-0x1e0]
    unsigned long long v9;  // [bp-0x1d8]
    char v10;  // [bp-0x1d0]
    char v11;  // [bp-0x1b8], Other Possible Types: unsigned long long
    unsigned long long v12;  // [bp-0x1b0]
    unsigned long long v13;  // [bp-0x1a8]
    char v14;  // [bp-0x1a0], Other Possible Types: unsigned long
    unsigned int v15[3];  // [bp-0x190]
    char v16;  // [bp-0x188], Other Possible Types: unsigned long long
    char v17;  // [bp-0x178]
    unsigned long long v18;  // [bp-0x120]
    unsigned long long v19;  // [bp-0x88]
    unsigned long long v20;  // [bp-0x80]
    unsigned long long v21;  // [bp-0x78]
    unsigned long long v22;  // [bp-0x60]
    unsigned long long v23;  // [bp-0x58]
    unsigned long long v24;  // [bp-0x50]
    unsigned long long v25;  // [bp-0x48]
    unsigned long long v26;  // [bp-0x40]
    unsigned long long v27;  // [bp-0x38]
    unsigned long long v28;  // [bp-0x30]
    unsigned long long v29;  // [bp-0x28]
    unsigned long long v30;  // [bp-0x20]
    unsigned long long v31;  // [bp-0x18]
    char *v32;  // [bp-0x10]
    unsigned long long v33;  // [bp-0x8]
    char v34;  // [bp+0x0]

    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = v38;
    v26 = v39;
    v27 = v40;
    v28 = v41;
    v29 = v42;
    v30 = v43;
    v31 = v44;
    v32 = &v34;
    v33 = v45;
    v0 = a6;
    v2 = &v1;
    v1 = &v2;
    v19 = 0;
    v20 = 0;
    v21 = 0;
    sub_62748(&v14);
    sub_63720((char *)v15 + *(long long *)(v15 - 24), 48);
    *(unsigned long long *)&(&v17)[*(long long *)(v15 - 24)] = 8;
    v46 = (char *)v15 + *(long long *)(v15 - 24);
    v46[2] = v46[2] & 0xffffffb5 | 8;
    std::__1::basic_ostream<char, std::__1::char_traits<char>>::operator<<(v15, a2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v11, sub_62368(&v16), a2, a2);
    sub_5ccc(&v19, &v11);
    v14 = &g_e69a98;
    v15 = (unsigned int (32 bits)[3])&g_e69ac0;
    v18 = &g_e69ae8;
    v16 = &g_e69c70;
    v16 = &g_10001c8;
    v12 = 0;
    v11 = 0;
    v13 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v14, "qop", 3);
    v48 = a1 + 8;
    if (v48 != sub_71aac(a1, &v14))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v14, "qop", 3);
        v11 = sub_1b2aa8(a1, &v14);
        v50 = sub_a0c8(&v11);
        v51 = "auth-int";
        v52 = arm64g_calculate_condition(18, sub_6516c(v50, sub_6b08(&v11), "auth-int", 0, 8), 1, 0);
        if (!(v52 & 1))
        {
            v53 = sub_a0c8(&v11);
            v51 = "auth";
            v54 = arm64g_calculate_condition(2, sub_6516c(v53, sub_6b08(&v11), "auth", 0, 4), 1, 0);
            if (!(v54 & 1))
                goto LABEL_1aadf0;
            sub_30d84(&v11);
        }
        else
        {
LABEL_1aadf0:
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v11, v51);
        }
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v10, "MD5", 3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v14, "algorithm", 9);
    if (v48 != sub_71aac(a1, &v14))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v14, "algorithm", 9);
        v10 = sub_1b2aa8(a1, &v14);
    }
    v8 = 0;
    v7 = 0;
    v9 = 0;
    if (sub_9fd8(&v10, "SHA-256") & 1)
    {
        v56 = 1713028;
    }
    else if (sub_9fd8(&v10, "SHA-512"))
    {
        v56 = 1783744;
    }
    else
    {
        v56 = 1723632;
    }
    v57 = sub_6b08(a4);
    sub_64128(&v4, v57 + 1, &v3);
    v58 = sub_a0c8(&v4);
    sub_12478(v58, sub_a0c8(a4), v57);
    v60 = v58 + v57;
    sub_12478(v60, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺)\n潢汯慥n湩整敧r慴汢e桴敲摡甀敳摲瑡a畢晦牥愀祮䐀扥杵界畡楔敭牔捡湩g楰栀杵e慮ne桰i煳瑲2慴u界畡湉整敧䙲獡捴污獬䰀慵䥵瑮来牥畂晦牥慆瑳慣汬s獡敳瑲爀睡敳t慲杷瑥爀睡煥慵l慲汷湥甀灮捡k敳敬瑣最瑥敭慴慴汢e敳浴瑥瑡扡敬琀湯浵敢r潴瑳楲杮洀瑡h扡s捡獯愀楳n瑡湡2瑡湡挀楥l潣桳挀獯搀来攀灸昀潬牯昀潭d牦硥p摬硥p潬ㅧ0潬g慭x業n潭晤瀀睯爀摡猀湩h楳n煳瑲琀湡h慴n汣浡p楳湧爀畯摮氀牥p獩慮n獩湩f獩楦楮整戀瑩㈳愀獲楨瑦戀湡d湢瑯戀牯戀潸r瑢獥t硥牴捡t牬瑯瑡e獬楨瑦爀灥慬散爀潲慴整爀桳晩t潣湵汴z潣湵牴z祢整睳灡戀瑹e档牡氀湥猀扵椀獮牥t敲摡㡩爀慥畤8牷瑩楥8牷瑩略8敲摡ㅩ6敲摡ㅵ6牷瑩楥㘱眀楲整ㅵ6敲摡㍩2敲摡㍵2牷瑩楥㈳眀楲整㍵2敲摡㍦2牷瑩晥㈳爀慥晤㐶眀楲整㙦4敲摡湩整敧r牷瑩", 1);
    v3 = 0;
    sub_348a4(v60 + 1, 1, &v3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "realm", 5);
    v61 = sub_1b2aa8(a1, &v3);
    v62 = sub_a0c8(v61, &v3);
    v63 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v4, v62, sub_6b08(v61));
    sub_5c38(&v5, v63);
    sub_5c38(&v6, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺)\n潢汯慥n湩整敧r慴汢e桴敲摡甀敳摲瑡a畢晦牥愀祮䐀扥杵界畡楔敭牔捡湩g楰栀杵e慮ne桰i煳瑲2慴u界畡湉整敧䙲獡捴污獬䰀慵䥵瑮来牥畂晦牥慆瑳慣汬s獡敳瑲爀睡敳t慲杷瑥爀睡煥慵l慲汷湥甀灮捡k敳敬瑣最瑥敭慴慴汢e敳浴瑥瑡扡敬琀湯浵敢r潴瑳楲杮洀瑡h扡s捡獯愀楳n瑡湡2瑡湡挀楥l潣桳挀獯搀来攀灸昀潬牯昀潭d牦硥p摬硥p潬ㅧ0潬g慭x業n潭晤瀀睯爀摡猀湩h楳n煳瑲琀湡h慴n汣浡p楳湧爀畯摮氀牥p獩慮n獩湩f獩楦楮整戀瑩㈳愀獲楨瑦戀湡d湢瑯戀牯戀潸r瑢獥t硥牴捡t牬瑯瑡e獬楨瑦爀灥慬散爀潲慴整爀桳晩t潣湵汴z潣湵牴z祢整睳灡戀瑹e档牡氀湥猀扵椀獮牥t敲摡㡩爀慥畤8牷瑩楥8牷瑩略8敲摡ㅩ6敲摡ㅵ6牷瑩楥㘱眀楲整ㅵ6敲摡㍩2敲摡㍵2牷瑩楥㈳眀楲整㍵2敲摡㍦2牷瑩晥㈳爀慥晤㐶眀楲整㙦4敲摡湩整敧r牷瑩", 1));
    v65 = sub_a0c8(a5);
    v66 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v6, v65, sub_6b08(a5));
    sub_5c38(&v14, v66);
    v67 = sub_6b08(a0);
    sub_64128(&v5, v67 + 1, &v4);
    v68 = sub_a0c8(&v5);
    sub_12478(v68, sub_a0c8(a0), v67);
    v70 = v68 + v67;
    sub_12478(v70, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺)\n潢汯慥n湩整敧r慴汢e桴敲摡甀敳摲瑡a畢晦牥愀祮䐀扥杵界畡楔敭牔捡湩g楰栀杵e慮ne桰i煳瑲2慴u界畡湉整敧䙲獡捴污獬䰀慵䥵瑮来牥畂晦牥慆瑳慣汬s獡敳瑲爀睡敳t慲杷瑥爀睡煥慵l慲汷湥甀灮捡k敳敬瑣最瑥敭慴慴汢e敳浴瑥瑡扡敬琀湯浵敢r潴瑳楲杮洀瑡h扡s捡獯愀楳n瑡湡2瑡湡挀楥l潣桳挀獯搀来攀灸昀潬牯昀潭d牦硥p摬硥p潬ㅧ0潬g慭x業n潭晤瀀睯爀摡猀湩h楳n煳瑲琀湡h慴n汣浡p楳湧爀畯摮氀牥p獩慮n獩湩f獩楦楮整戀瑩㈳愀獲楨瑦戀湡d湢瑯戀牯戀潸r瑢獥t硥牴捡t牬瑯瑡e獬楨瑦爀灥慬散爀潲慴整爀桳晩t潣湵汴z潣湵牴z祢整睳灡戀瑹e档牡氀湥猀扵椀獮牥t敲摡㡩爀慥畤8牷瑩楥8牷瑩略8敲摡ㅩ6敲摡ㅵ6牷瑩楥㘱眀楲整ㅵ6敲摡㍩2敲摡㍵2牷瑩楥㈳眀楲整㍵2敲摡㍦2牷瑩晥㈳爀慥晤㐶眀楲整㙦4敲摡湩整敧r牷瑩", 1);
    v4 = 0;
    sub_348a4(v70 + 1, 1, &v4);
    v71 = sub_a0c8(a0 + 24);
    v72 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, v71, sub_6b08(a0 + 24));
    sub_5c38(&v6, v72);
    if (sub_9fd8(&v11, "auth-int"))
        v56();
    v5 = &v4;
    v4 = &v5;
    if (!sub_6b08(&v11))
        v56();
    v56();
}
