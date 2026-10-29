/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a23b8..0x1a26b0 (760 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a23b8_3 {
    struct st_1a23b8_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    uint128_t field_28;
    unsigned int field_38;
    char padding_3c[84];
    unsigned long long field_90;
    uint128_t field_98;
    uint128_t field_a8;
    uint128_t field_b8;
    uint128_t field_c8;
    uint128_t field_d8;
    uint128_t field_e8;
    uint128_t field_f8;
    uint128_t field_108;
    uint128_t field_118;
    char field_128[26];
    char field_132;
    char padding_133[15];
    char field_142;
    char padding_143[1];
    unsigned int field_144;
    unsigned short field_148;
    char padding_14a[30];
    unsigned long long field_168;
    unsigned short field_170;
    char padding_172[6];
    uint128_t field_178;
    uint128_t field_188;
    uint128_t field_198;
    unsigned int field_1a8;
    char padding_1ac[180];
    unsigned short field_260;
    char padding_262[30];
    unsigned long long field_280;
    char padding_288[24];
    unsigned long long field_2a0;
} st_1a23b8_3;

typedef struct st_1a23b8_1 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    unsigned int field_20;
    char padding_24[4];
    char field_28;
    char padding_29[23];
    unsigned int field_40;
    char padding_44[4];
    int field_48;
    char padding_4c[4];
    unsigned long long field_50;
    char field_58;
    char padding_59[55];
    char field_90;
    char padding_91[63];
    char field_d0;
    char padding_d1[23];
    struct st_1a23b8_1 *field_e8;
    int field_f0;
    char padding_f4[4];
    int field_f8;
    char padding_fc[4];
    int field_100;
    char padding_104[12];
    int field_110;
    char padding_114[12];
    unsigned int field_120;
    char padding_124[4];
    char field_128;
    char padding_129[31];
    char field_148;
    char padding_149[23];
    char field_160;
    char padding_161[23];
    unsigned long long field_178;
    uint128_t field_180;
    uint128_t field_190;
    int field_1a0;
    char padding_1a4[12];
    int field_1b0;
    char padding_1b4[12];
    int field_1c0;
    char padding_1c4[12];
    int field_1d0;
    char padding_1d4[12];
    int field_1e0;
    char padding_1e4[12];
    int field_1f0;
    char padding_1f4[12];
    int field_200;
    char padding_204[12];
    int field_210;
    char padding_214[6];
    int field_21a;
    char padding_21e[12];
    long long field_22a;
    int field_22c;
    int field_230;
    char padding_234[28];
    int field_250;
    char padding_254[4];
    unsigned short field_258;
    char padding_25a[6];
    int field_260;
    char padding_264[12];
    int field_270;
    char padding_274[12];
    int field_280;
    char padding_284[12];
    unsigned int field_290;
    char padding_294[4];
    char field_298;
    char padding_299[175];
    unsigned short field_348;
    char padding_34a[30];
    int field_368;
    char padding_36c[28];
    int field_388;
} st_1a23b8_1;

typedef struct st_1a23b8_2 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    unsigned int field_20;
    char padding_24[4];
    char field_28;
    char padding_29[23];
    unsigned int field_40;
    char padding_44[4];
    unsigned long long field_48;
    unsigned long long field_50;
    char field_58;
    char padding_59[55];
    char field_90;
    char padding_91[63];
    char field_d0;
    char padding_d1[23];
    struct st_1a23b8_2 *field_e8;
    unsigned long long field_f0;
    unsigned long long field_f8;
    uint128_t field_100;
    uint128_t field_110;
    unsigned int field_120;
    char padding_124[4];
    char field_128;
    char padding_129[31];
    char field_148;
    char padding_149[23];
    char field_160;
    char padding_161[23];
    unsigned long long field_178;
    uint128_t field_180;
    uint128_t field_190;
    uint128_t field_1a0;
    uint128_t field_1b0;
    uint128_t field_1c0;
    uint128_t field_1d0;
    uint128_t field_1e0;
    uint128_t field_1f0;
    uint128_t field_200;
    char field_210[26];
    char field_21a;
    char padding_21b[15];
    char field_22a;
    char padding_22b[1];
    unsigned int field_22c;
    unsigned short field_230;
    char padding_232[30];
    unsigned long long field_250;
    unsigned short field_258;
    char padding_25a[6];
    uint128_t field_260;
    uint128_t field_270;
    uint128_t field_280;
    unsigned int field_290;
    char padding_294[4];
    char field_298;
    char padding_299[175];
    unsigned short field_348;
    char padding_34a[30];
    unsigned long long field_368;
    char padding_370[24];
    unsigned long long field_388;
} st_1a23b8_2;

typedef struct st_1a23b8_0 {
    char field_0;
} st_1a23b8_0;

extern char g_e6fed0;

st_1a23b8_1 * sub_1a23b8(st_1a23b8_1 *a0, long long a1, unsigned long long a2, long long a3, long long a4)
{
    long long v8;  // x0
    long long v9;  // x0
    st_1a23b8_1 *v10;  // x22
    st_1a23b8_1 *v11;  // x22
    st_1a23b8_1 *v12;  // x25
    st_1a23b8_1 *v13;  // x23
    st_1a23b8_3 *v14;  // x23
    st_1a23b8_0 **v0;  // [bp-0xa8], Other Possible Types: char
    st_1a23b8_0 *v1;  // [bp-0xa0]
    char v2;  // [bp-0x98]
    char v3;  // [bp-0x80]
    char v4;  // [bp-0x68], Other Possible Types: unsigned long
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = &g_e6fed0;
    sub_1bc870(a1);
    a0->field_20 = a2;
    sub_1a4478(a0, &a0->field_8);
    sub_5c38(&v4, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺)\n潢汯慥n湩整敧r慴汢e桴敲摡甀敳摲瑡a畢晦牥愀祮䐀扥杵界畡楔敭牔捡湩g楰栀杵e慮ne桰i煳瑲2慴u界畡湉整敧䙲獡捴污獬䰀慵䥵瑮来牥畂晦牥慆瑳慣汬s獡敳瑲爀睡敳t慲杷瑥爀睡煥慵l慲汷湥甀灮捡k敳敬瑣最瑥敭慴慴汢e敳浴瑥瑡扡敬琀湯浵敢r潴瑳楲杮洀瑡h扡s捡獯愀楳n瑡湡2瑡湡挀楥l潣桳挀獯搀来攀灸昀潬牯昀潭d牦硥p摬硥p潬ㅧ0潬g慭x業n潭晤瀀睯爀摡猀湩h楳n煳瑲琀湡h慴n汣浡p楳湧爀畯摮氀牥p獩慮n獩湩f獩楦楮整戀瑩㈳愀獲楨瑦戀湡d湢瑯戀牯戀潸r瑢獥t硥牴捡t牬瑯瑡e獬楨瑦爀灥慬散爀潲慴整爀桳晩t潣湵汴z潣湵牴z祢整睳灡戀瑹e档牡氀湥猀扵椀獮牥t敲摡㡩爀慥畤8牷瑩楥8牷瑩略8敲摡ㅩ6敲摡ㅵ6牷瑩楥㘱眀楲整ㅵ6敲摡㍩2敲摡㍵2牷瑩楥㈳眀楲整㍵2敲摡㍦2牷瑩晥㈳爀慥晤㐶眀楲整㙦4敲摡湩整敧r牷瑩", 1));
    std::__1::to_string(a2);
    v8 = sub_a0c8(&v2);
    v9 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v4, v8, sub_6b08(&v2));
    sub_5c38(&a0->field_28, v9);
    v10 = a0;
    v10->field_50 = 850045863;
    v11 = &v10->field_50;
    *(unsigned int *)((char *)v11 - 16) = 0xffffffff;
    *(unsigned long long *)((char *)v11 - 8) = 0;
    memset(&v11->field_8, 0, 56);
    std::__1::recursive_mutex::recursive_mutex(&v11->field_40);
    v12 = a0;
    *(unsigned long long *)&v12->field_f0 = 0;
    v13 = a0;
    v13->field_e8 = &v12->field_f0;
    v14 = &v13->field_e8;
    v14->field_10 = 0;
    memset((char *)v14 - 24, 0, 0x11);
    *(uint128_t *)&(&v14->field_10)[1] = 0;
    *(uint128_t *)((char *)&v14->field_18 + 8) = 0;
    *(unsigned int *)((char *)&v14->field_28 + 8) = 0x3f800000;
    v4 = 1848300;
    sub_1a48ec(&v14->field_38, &v4, &v3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_148, a3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&a0->field_160, a4);
    a0->field_178 = 300;
    a0->field_180 = 0x12c0000000000000000;
    a0->field_190 = 0x50000000000000000;
    *(uint128_t *)&a0->field_1a0 = 0;
    *(uint128_t *)&a0->field_1b0 = 0;
    *(uint128_t *)&a0->field_1c0 = 0;
    *(uint128_t *)&a0->field_1d0 = 0;
    *(uint128_t *)&a0->field_1e0 = 0;
    *(uint128_t *)&a0->field_1f0 = 0;
    *(uint128_t *)&a0->field_200 = 0;
    *(uint128_t *)&a0->field_210 = 0;
    *(uint128_t *)(a0->padding_214)[1] = 0;
    a0->padding_21e[10] = 1;
    *(unsigned int *)&(a0->padding_21e)[1] = 0;
    *(unsigned short *)&a0->field_22a = 0;
    *(unsigned long long *)&a0->padding_234[16] = 0;
    *(unsigned short *)&a0->padding_234[24] = 0x100;
    *(uint128_t *)a0->padding_254 = 0;
    *(uint128_t *)a0->padding_264 = 0;
    *(uint128_t *)a0->padding_274 = 0;
    *(unsigned int *)&a0->padding_284[0] = 0xffffffff;
    memset(&a0->padding_284[8], 0, 176);
    *(unsigned short *)&a0->padding_299[163] = 0x101;
    *(unsigned long long *)&a0->padding_34a[18] = 0;
    *(unsigned long long *)&a0->padding_36c[16] = 0;
    return a0;
}
