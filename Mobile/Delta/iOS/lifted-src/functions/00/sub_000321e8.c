/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x321e8..0x335e8 (5120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_321e8_0 {
    char field_0;
} st_321e8_0;

extern unsigned long long g_e63cc8;
extern char g_10002b0;

long long sub_321e8(unsigned long a0, unsigned int a1)
{
    unsigned long long v10;  // d9
    unsigned long long v11;  // d8
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    unsigned long long v15;  // x9
    unsigned long long v16;  // 4105
    st_321e8_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_321e8_0 *v1;  // [bp-0xc8]
    unsigned long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v15 = 128;
    if (a1 == 2)
        v15 = 992;
    if (a1 == 3)
        v15 = 168;
    if (a1 == 4)
        v15 = 392;
    if (a1 == 5)
        v15 = 2344;
    if (a1 == 6)
        v15 = 840;
    if (a1 == 7)
        v15 = 1648;
    if (a1 == 8)
        v15 = 624;
    if (a1 == 9)
        v15 = 1288;
    if (a1 == 10)
        v15 = 832;
    if (a1 == 11)
        v15 = 472;
    if (a1 == 12)
        v15 = 1448;
    if (a1 == 13)
        v15 = 1464;
    if (a1 == 15)
        v15 = 360;
    if (a1 == 16)
        v15 = 1624;
    if (a1 == 0x11)
        v15 = 968;
    if (a1 == 18)
        v15 = 1520;
    if (a1 == 19)
        v15 = 1720;
    if (a1 == 21)
        v15 = 1672;
    if (a1 == 22)
        v15 = 1008;
    if (a1 == 23)
        v15 = 2240;
    if (a1 == 24)
        v15 = 1680;
    if (a1 == 25)
        v15 = 2400;
    if (a1 == 26)
        v15 = 400;
    if (a1 == 27)
        v15 = 1872;
    if (a1 == 28)
        v15 = 2136;
    if (a1 == 29)
        v15 = 1232;
    if (a1 == 30)
        v15 = 568;
    if (a1 == 31)
        v15 = 0;
    v16 = arm64g_calculate_condition(3, a1, 32, 0);
    if (v16 & 1)
        v15 = 2000;
    if (a1 == 33)
        v15 = 1480;
    if (a1 == 0x22)
        v15 = 2192;
    if (a1 == 35)
        v15 = 496;
    if (a1 == 36)
        v15 = 2216;
    if (a1 == 37)
        v15 = 2512;
    if (a1 == 38)
        v15 = 2432;
    if (a1 == 39)
        v15 = 848;
    if (a1 == 40)
        v15 = 896;
    if (a1 == 41)
        v15 = 2480;
    if (a1 == 42)
        v15 = 1904;
    if (a1 == 43)
        v15 = 1888;
    if (a1 == 44)
        v15 = 440;
    if (a1 == 45)
        v15 = 1560;
    if (a1 == 46)
        v15 = 1808;
    if (a1 == 47)
        v15 = 1592;
    if (a1 == 48)
        v15 = 1984;
    if (a1 == 54)
        v15 = 1112;
    if (a1 == 89)
        v15 = 1144;
    if (a1 == 91)
        v15 = 1368;
    if (a1 == 92)
        v15 = 760;
    if (a1 == 93)
        v15 = 2080;
    goto *((void *)(*(long long *)((char *)&g_e63cc8 + v15)));
}
