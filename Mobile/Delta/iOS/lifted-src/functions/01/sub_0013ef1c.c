/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13ef1c..0x13f05c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13ef1c_0 {
    char field_0;
} st_13ef1c_0;

extern unsigned long long g_e6f1a0;

long long sub_13ef1c(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v13;  // x26
    unsigned long long v14;  // x25
    unsigned long long v15;  // x24
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    unsigned long long v22;  // x8
    st_13ef1c_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_13ef1c_0 *v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = &v12;
    v11 = v21;
    v1 = &v0;
    v0 = &v1;
    v22 = ((!a3) * 8 | (char)(!a3) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (a3 == 1)
        v22 = 32;
    if (a3 == 2)
        v22 = 48;
    goto *((void *)(*(long long *)((char *)&g_e6f1a0 + v22)));
}
