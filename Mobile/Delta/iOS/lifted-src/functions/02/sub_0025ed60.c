/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25ed60..0x2614ac (10060 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25ed60_0 {
    char field_0;
} st_25ed60_0;

extern unsigned long long g_e7b118;

long long sub_25ed60(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x8
    unsigned long long v15;  // 4105
    st_25ed60_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_25ed60_0 *v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    v14 = 200;
    if (a3 == 18230136554814961276)
        v14 = 120;
    if (a3 == 6974186438567738029)
        v14 = 152;
    if (a3 == 0x9febdc9de21cf1e1)
        v14 = 288;
    if (a3 == 14250865991082291991)
        v14 = 104;
    if (a3 == 2953100008825676586)
        v14 = 8;
    if (a3 == 5927197222535402605)
        v14 = 272;
    if (a3 == 15408828977398014050)
        v14 = 312;
    if (a3 == 5390599313167354031)
        v14 = 128;
    if (a3 == 6231157100287312624)
        v14 = 176;
    if (a3 == 7539307733510419537)
        v14 = 248;
    if (a3 == 12931739814901162986)
        v14 = 48;
    if (a3 == 8316625503044913788)
        v14 = 208;
    if (a3 == 0x8bff43e69e268d47)
        v14 = 216;
    if (a3 == 4996303589101480862)
        v14 = 96;
    if (a3 == 8230753149701716978)
        v14 = 232;
    if (a3 == 8055066490769447864)
        v14 = 32;
    if (a3 == 5154399350990768334)
        v14 = 192;
    if (a3 == 0xc5e593e5abfc19cb)
        v14 = 40;
    if (a3 == 9894459306950377774)
        v14 = 296;
    if (a3 == 7881352605582411207)
        v14 = 0;
    if (a3 == 9349952189588861130)
        v14 = 64;
    if (a3 == 0x9115ff2a4a98e311)
        v14 = 264;
    if (a3 == 8061208665323346967)
        v14 = 168;
    if (a3 == 4207397040012534637)
        v14 = 16;
    if (a3 == 17578796067698584705)
        v14 = 224;
    if (a3 == 1017939608188077370)
        v14 = 112;
    v15 = arm64g_calculate_condition(4, a3, 4191915701108389670, 0);
    if (v15 & 1)
        v14 = 56;
    if (a3 == 0xf16eff38fac80cd6)
        v14 = 184;
    if (a3 == 15327378043268611767)
        v14 = 88;
    if (a3 == 2696223683256725509)
        v14 = 144;
    if (a3 == 17239262434573922283)
        v14 = 280;
    if (a3 == 897509555762991599)
        v14 = 24;
    if (a3 == 14654516737389134691)
        v14 = 304;
    if (a3 == 1718916501345219006)
        v14 = 80;
    if (a3 == 12321115619151255337)
        v14 = 160;
    if (a3 == 12601530761652390947)
        v14 = 240;
    if (a3 == 2775594275725782006)
        v14 = 320;
    if (a3 == 5115498603829687666)
        v14 = 0x100;
    if (a3 == 855107886404187299)
        v14 = 72;
    goto *((void *)(*(long long *)((char *)&g_e7b118 + v14)));
}
