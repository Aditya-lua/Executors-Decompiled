/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2fe08..0x2feb8 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2fe08_0 {
    char field_0;
} st_2fe08_0;

extern char g_7fffff;

unsigned long long sub_2fe08(unsigned long long *a0)
{
    unsigned long long v8;  // x19
    st_2fe08_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2fe08_0 *v1;  // [bp-0x58]
    uint128_t v2;  // [bp-0x50], Other Possible Types: unsigned int
    unsigned int v3;  // [bp-0x48]
    uint128_t v4;  // [bp-0x40]
    uint128_t v5;  // [bp-0x30]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = 3435973837 * (a0[13] - a0[12] >> 3);
    if ((unsigned int)v8 <= &g_7fffff)
    {
        v5 = 0;
        v2 = 0;
        v4 = 0;
        v2 = 10;
        v3 = 3067833783 * (unsigned int)(a0[25] - a0[24] >> 3);
        sub_2feb8(a0 + 24);
        sub_2dcf4(a0 + 12, &v2);
        return v8;
    }
    return 0xffffffff;
}
