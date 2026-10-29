/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81a90..0x81b5c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_81a90_1 {
    char padding_0[16];
    char field_10;
    char padding_11[767];
    int field_310;
    char padding_314[108];
    uint128_t field_380;
    unsigned long long field_390;
    char padding_398[2720];
    int field_e38;
    char padding_e3c[44];
    long long field_e68;
    char padding_e70[24];
    long long field_e88;
    char padding_e90[24];
    int field_ea8;
} st_81a90_1;

typedef struct st_81a90_0 {
    char field_0;
} st_81a90_0;


unsigned long long sub_81a90(st_81a90_1 *a0, unsigned int a1)
{
    st_81a90_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_81a90_0 *v1;  // [bp-0x48]
    uint128_t v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if ((a1 & 0xfffffffd) == 1)
    {
        a0->field_e38 = 0;
        *(unsigned long long *)&a0->field_310 = 0;
    }
    if ((a1 >> 1 & 0x7fffffff) != 1)
    {
        return 0;
    }
    else if (a0->field_e38)
    {
        return 0xffffffffffffffc4;
    }
    else
    {
        v2 = a0->field_380;
        v3 = a0->field_390;
        sub_80164(a0->field_e68, &v2);
        sub_7dfec(a0->field_e88);
        memset(&a0->field_e68, 0, 64);
        *(unsigned long long *)&a0->field_ea8 = 0;
        return sub_80188(&a0->field_10, 3);
    }
}
