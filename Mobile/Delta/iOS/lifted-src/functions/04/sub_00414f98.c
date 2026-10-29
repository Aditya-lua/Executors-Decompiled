/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x414f98..0x415124 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_414f98_0 {
    char field_0;
} st_414f98_0;

extern unsigned long long g_e7fc00;

void sub_414f98(unsigned long long *a0, unsigned long a1)
{
    st_414f98_0 *v4;  // x9
    unsigned long long v5;  // x11
    unsigned long long v6;  // x9
    unsigned long v7;  // x10
    st_414f98_0 *v0;  // [bp-0x50], Other Possible Types: unsigned long long
    st_414f98_0 **v1;  // [bp-0x28], Other Possible Types: char, unsigned long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = &v1;
    v1 = &v0;
    v4 = v0;
    v5 = (char *)v4 + 0x2 * ~v4 + 1;
    v6 = (v4 ^ -v1) - (v1 ^ -v4) + (v5 + (v4 & -v1) - (v1 & -v4 | v4 & ~v1) + (v1 | ~v5)) * 2;
    v7 = (((v6 + 2) * 2 | v6 + 2 >> 63) & 14 & 15) + (v6 + 2 ^ 7);
    v1 = ~v7 + v7 * 2;
    v0 = v6 + 4;
    if (a1 <= (a0[2] + *a0 + ~*a0 * 2 + 2) / (v1 + (v0 | ~v1) + (v0 | v1) + 1))
        return;
    v0 = 0x1fffffffffffffff;
    v1 = 0x7fffffffffffffff;
    (g_e7fc00 - 0x1cb08200)();
}
