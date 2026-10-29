/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3fac04..0x3facf4 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3fac04_0 {
    char field_0;
} st_3fac04_0;


unsigned long long sub_3fac04(unsigned long long *a0, unsigned long long *a1)
{
    long long v6;  // x0
    unsigned long long v7;  // x8
    unsigned long long v8;  // x10
    st_3fac04_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_3fac04_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48]
    unsigned long long *iter;  // [bp-0x38], Other Possible Types: unsigned long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_41d56c();
    v7 = a0[1];
    v8 = -*a0;
    sub_ec54(&v2, v6, (long long)(*a0 + v7 + (v7 + (v8 | ~v7) + (v8 & ~v7)) * 2 + 2) >> 3, a0);
    *iter = *a1;
    iter += 1;
    sub_40ea8c(a0, &v2);
    sub_3db3b4(&v2);
    return a0[1];
}
