/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ae53c..0x2ae7f8 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ae53c_0 {
    char field_0;
} st_2ae53c_0;

extern unsigned long long g_e7bb88;

long long sub_2ae53c(unsigned long a0, unsigned long long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x8
    st_2ae53c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2ae53c_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    v14 = ((a1 != 1) * 64 | (char)(a1 != 1) >> 58) & 0x3fffffffc0 & 0x3fffffffff;
    if (a1 == 2)
        v14 = 8;
    if (a1 == 3)
        v14 = 16;
    if (a1 == 8)
        v14 = 40;
    if (a1 == 4)
        v14 = 96;
    if (a1 == 5)
        v14 = 56;
    if (a1 == 6)
        v14 = 72;
    if (a1 == 7)
        v14 = 88;
    if (!a1)
        v14 = 112;
    goto *((void *)(*(long long *)((char *)&g_e7bb88 + v14)));
}
