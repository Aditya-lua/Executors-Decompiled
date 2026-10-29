/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16f40..0x171a0 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16f40_1 {
    char padding_0[128];
    unsigned int field_80;
    uint128_t field_84;
} st_16f40_1;

typedef struct st_16f40_0 {
    char field_0;
} st_16f40_0;

extern char g_cbe7e8;

void sub_16f40(st_16f40_1 *a0)
{
    unsigned int v5;  // w9
    st_16f40_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_16f40_0 *v1;  // [bp-0x70]
    uint128_t v2;  // [bp-0x30]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = a0->field_80;
    v2 = *(int128_t *)&(&a0->field_80)[1];
    if (47 >= v5 - 262)
    {
        goto *((void *)(sub_16f94 + *(&(&g_cbe7e8)[v5] - 262) * 4));
    }
    else if (v5 == 123)
    {
        sub_219fc();
        return;
    }
    else
    {
        sub_efe0();
        return;
    }
}
