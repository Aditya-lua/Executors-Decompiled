/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1140b4..0x114214 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1140b4_0 {
    char field_0;
} st_1140b4_0;

extern unsigned long long g_9d5018;

long long sub_1140b4(long long a0)
{
    long long v9;  // x0
    long long v10;  // x0
    unsigned long long v11;  // x20
    long long v13;  // x8
    st_1140b4_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1140b4_0 *v1;  // [bp-0x68]
    char v2;  // [bp-0x60]
    long long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    char *v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_9d3c1c(sub_a38690());
    v5 = &g_9d5018;
    sub_9d3d74(v4, 0x100);
    v9 = sub_a0c8(a0);
    v10 = sub_9d885c(v9, sub_6b08(a0));
    sub_9d4ec8(v4, v10);
    v11 = (unsigned int)(sub_6b08(a0) >> 2) * 3 + 1;
    sub_122cb4(&v2, (int)v11);
    sub_31ef8(&v2, sub_9d3d84(v4, v2, v11));
    sub_64b60(v13, v2, v3, v3 - v2);
    v6 = &v2;
    sub_30030(&v6);
    return sub_1219cc(&v4, 0);
}
