/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61eac..0x62074 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_61eac_2 {
    char padding_0[128];
    unsigned long long field_80;
} st_61eac_2;

typedef struct st_61eac_1 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[12];
    char field_40;
    char padding_41[23];
    unsigned int field_58;
} st_61eac_1;

typedef struct st_61eac_0 {
    char field_0;
} st_61eac_0;

extern unsigned long long g_e69d78;

double sub_61eac(st_61eac_1 *a0, unsigned long a1, unsigned long long a2, unsigned int a3)
{
    unsigned int v4;  // x20
    unsigned int v5;  // x9
    unsigned long long v6;  // x9
    st_61eac_2 *v7;  // x8
    st_61eac_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_61eac_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *(long long *)&a0->field_58;
    v5 = *(long long *)&a0->field_30;
    if (v5 > v4)
    {
        *(unsigned long long *)&a0->field_58 = v5;
        v4 = v5;
    }
    if (a3 & 24 && ((unsigned int)a2 != 1 || (a3 & 24) != 24))
    {
        if (v4)
        {
            sub_a0c8(&a0->field_40);
            a2 = a2;
        }
        v6 = 184;
        if (!(unsigned int)a2)
            v6 = 0x88;
        if ((unsigned int)a2 == 1)
            v6 = 112;
        if ((unsigned int)a2 == 2)
            v6 = 128;
        goto *((void *)(*(long long *)((char *)&g_e69d78 + v6)));
    }
    *(uint128_t *)&v7->padding_0[96] = 0;
    *(uint128_t *)&v7->padding_0[112] = 0;
    *(uint128_t *)&v7->padding_0[64] = 0;
    *(uint128_t *)&v7->padding_0[80] = 0;
    *(uint128_t *)&v7->padding_0[32] = 0;
    *(uint128_t *)&v7->padding_0[48] = 0;
    *(uint128_t *)&v7->padding_0[0] = 0;
    *(uint128_t *)&v7->padding_0[16] = 0;
    v7->field_80 = 0xffffffffffffffff;
    return 0;
}
