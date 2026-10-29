/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf11a4..0xf1278 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f11a4_0 {
    char field_0;
} st_f11a4_0;

extern unsigned long long g_e6e878;

void sub_f11a4(unsigned long a0, uint128_t *a1)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    unsigned long long v15;  // x8
    st_f11a4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_f11a4_0 *v1;  // [bp-0x48]
    uint128_t v2;  // [bp-0x40]
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
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    sub_106fdc();
    v15 = (((unsigned int)&v2 == 1) * 32 | (char)((unsigned int)&v2 == 1) >> 59) & 0x1fffffffe0 & 0x1fffffffff;
    if ((unsigned int)&v2 == 2)
        v15 = 24;
    if ((unsigned int)&v2 == 3)
        v15 = 8;
    if (!(unsigned int)&v2)
        v15 = 16;
    goto *((void *)(*(long long *)((char *)&g_e6e878 + v15)));
}
