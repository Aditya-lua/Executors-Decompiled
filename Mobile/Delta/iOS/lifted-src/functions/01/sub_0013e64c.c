/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13e64c..0x13e7f4 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13e64c_0 {
    char field_0;
} st_13e64c_0;

extern unsigned int g_743abb;
extern unsigned long long g_e6ef98;

long long sub_13e64c(unsigned long a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x8
    st_13e64c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_13e64c_0 *v1;  // [bp-0x38]
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
    v14 = ((a2 == 5810) * 8 | (char)(a2 == 5810) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (a2 == &g_743abb)
        v14 = 24;
    if (a2 == 4171938584)
        v14 = 16;
    goto *((void *)(*(long long *)((char *)&g_e6ef98 + v14)));
}
