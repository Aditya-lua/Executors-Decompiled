/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40c7e0..0x40c8ec (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40c7e0_0 {
    char field_0;
} st_40c7e0_0;

extern unsigned long long g_40a43c;

void sub_40c7e0(void)
{
    unsigned long long v7;  // x30
    st_40c7e0_0 *v8;  // x9
    st_40c7e0_0 **v9;  // x10
    unsigned long long v10;  // x11
    unsigned long long v11;  // x9
    unsigned long long v12;  // x10
    unsigned long long v13;  // x8
    unsigned long long v14;  // x9
    st_40c7e0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_40c7e0_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_40a43c;
    v8 = v1;
    v9 = v0;
    v10 = ((v8 | v9) ^ -(v9 & v8)) + ((v8 | v9) & -(v9 & v8)) * 2;
    v11 = v10 - (char *)v8 + 2 * (v8 & ~v10);
    v12 = (v10 ^ -v9) + (v9 & ~v10) * 2 + (v10 & -v9) * 2;
    v13 = ~(v12 + (v11 & ~v12) * 2) + (char *)&g_40a43c + v11 + (v12 ^ v11) + 1;
    v14 = (v0 & v1) - (v0 | v1) + ((v0 | v1) ^ &(~v1)[-1 * (v0 | ~v1)]) + ((v0 | v1) & &(~v1)[-1 * (v0 | ~v1)]) * 2;
    v0 = (v14 ^ 32) + (v14 * 2 & 64) - 1;
    v1 = v14 + 1;
    v3 = (v13 | v1 + v0) + (v13 & v1 + v0);
    v3();
}
