/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x414044..0x414180 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_414044_0 {
    char field_0;
} st_414044_0;

extern unsigned long long g_e802c8;

long long sub_414044(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned int v10;  // w8
    unsigned int v11;  // w9
    char v20;  // x8
    unsigned int v12;  // w10
    unsigned int v13;  // w8
    unsigned int v14;  // w11
    unsigned int v15;  // w9
    unsigned int v16;  // w10
    unsigned int v17;  // w9
    unsigned int v18;  // w11
    unsigned int v19;  // w12
    unsigned long v0;  // [bp-0x70]
    char *v1;  // [bp-0x68]
    char *v2;  // [bp-0x60]
    char v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x48]
    st_414044_0 **v6;  // [bp-0x40], Other Possible Types: char
    st_414044_0 *v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v7 = &v6;
    v6 = &v7;
    v10 = (char)v7;
    v11 = (char)v6;
    v12 = v10 - v11 + (v11 & ~v10) * 2;
    v13 = (v12 | v10) - (v12 & v10);
    v14 = v12 | v11;
    v15 = -(v12 & v11);
    v16 = v14 ^ v15;
    v17 = v14 & v15;
    v18 = v16 + v17 * 2;
    v19 = v13 - v18 + (v18 & ~v13) * 2;
    v20 = v13 - (v16 + ((v13 & ~v18) + v17) * 2);
    v3 = (v20 ^ (char)v19) + ((char)v19 + (v20 | (char)~v19)) * 2 + 2;
    if (a1 == a2)
    {
        v6 = (char)&v7;
        v3 = 1;
        sub_2ac4e4(&v0);
        return a3;
    }
    (g_e802c8 - 0xcf447100)();
}
