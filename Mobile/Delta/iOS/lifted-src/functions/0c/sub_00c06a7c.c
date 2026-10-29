/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc06a7c..0xc07440 (2500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c06a7c_0 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_c06a7c_0;

extern st_c06a7c_0 g_e06a24;

long long sub_c06a7c(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    goto *((void *)(sub_c06ab4 + (&g_e06a24.field_0)[*a0] * 4));
}
