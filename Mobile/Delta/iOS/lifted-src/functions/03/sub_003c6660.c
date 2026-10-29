/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6660..0x3c6790 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c6660_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[55];
    unsigned long long field_40;
} st_3c6660_0;

typedef struct st_3c6660_1 {
    char field_0;
} st_3c6660_1;

extern unsigned long long g_f11d40;
extern char g_f11d48;

long long sub_3c6660(void)
{
    st_3c6660_0 *v7;  // x0
    st_3c6660_1 **v0;  // [bp-0x58], Other Possible Types: char
    st_3c6660_1 *v1;  // [bp-0x50]
    st_3c6660_1 **v2;  // [bp-0x48], Other Possible Types: char
    st_3c6660_1 *v3;  // [bp-0x40]
    st_3c6660_0 *v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    /* unsupported instruction */;
    if (g_f11d48 & 1 || !___cxa_guard_acquire(&g_f11d48))
        return g_f11d40;
    v7 = operatornew(176);
    v3 = &v2;
    v2 = &v3;
    v7->field_0 = 850045863;
    memset(&v7->field_8, 0, 56);
    v7->field_40 = 1018212795;
    *(uint128_t *)&v7[1].field_0 = 0;
    *(uint128_t *)&v7[1].padding_9[7] = 0;
    *(uint128_t *)&v7[1].padding_9[23] = 0;
    *(uint128_t *)&v7[1].padding_9[39] = 0;
    *(uint128_t *)&v7[1].field_40 = 0;
    *(uint128_t *)((char *)&v7[2].field_0 + 1) = 0;
    v4 = v7;
    sub_3c6440(&v4[2].padding_9[15], &v4);
    g_f11d40 = v4;
    ___cxa_guard_release(&g_f11d48);
    return g_f11d40;
}
