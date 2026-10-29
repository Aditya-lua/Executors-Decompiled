/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31b78..0x31c68 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31b78_0 {
    char field_0;
} st_31b78_0;

extern unsigned long long g_e635e8;
extern unsigned long long g_e635f0;

void sub_31b78(long long a0, unsigned int a1)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_31b78_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_31b78_0 *v1;  // [bp-0x40]
    unsigned int v2;  // [bp-0x34]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    if (sub_2c278(a0 + 616, &v2))
        goto *((void *)(g_e635e8));
    else
        goto *((void *)(g_e635f0));
}
