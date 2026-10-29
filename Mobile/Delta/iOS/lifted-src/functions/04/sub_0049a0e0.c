/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49a0e0..0x49a1ec (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_49a0e0_0 {
    long long field_0;
} st_49a0e0_0;

typedef struct st_49a0e0_1 {
    char field_0;
} st_49a0e0_1;

extern unsigned long long g_e801a0;

unsigned long long * sub_49a0e0(st_49a0e0_0 **a0)
{
    long long *v4;  // x0
    st_49a0e0_1 *v5;  // x9
    unsigned long long v6;  // x11
    unsigned long long v7;  // x9
    unsigned long v8;  // x10
    st_49a0e0_1 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_49a0e0_1 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a0;
    if (!*v4)
        return v4;
    sub_c84c(v4, *v4);
    v1 = &v0;
    v0 = &v1;
    v5 = v1;
    v6 = (char *)v5 + 0x2 * ~v5 + 1;
    v7 = (v5 ^ -v0) - (v0 ^ -v5) + (v6 + (v5 & -v0) - (v0 & -v5 | v5 & ~v0) + (v0 | ~v6)) * 2;
    v8 = (((v7 + 2) * 2 | v7 + 2 >> 63) & 14 & 15) + (v7 + 2 ^ 7);
    v0 = ~v8 + v8 * 2;
    v1 = v7 + 4;
    (g_e801a0 - 0x4cb25200)();
}
