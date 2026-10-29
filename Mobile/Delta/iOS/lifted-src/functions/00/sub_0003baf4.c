/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3baf4..0x3bba4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3baf4_0 {
    char field_0;
} st_3baf4_0;

extern unsigned long long g_e66258;
extern unsigned long long g_e66260;

void sub_3baf4(unsigned long a0, unsigned long a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned int v14;  // w0
    unsigned long long *v15;  // x8
    unsigned long v16;  // cc_dep1
    unsigned long long v17;  // 4105
    unsigned long long v18;  // 4105
    st_3baf4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3baf4_0 *v1;  // [bp-0x38]
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
    v14 = sub_46ddc();
    v15 = &g_e66260;
    v16 = v14 & 0x80000000;
    if (v14 & 0x80000000)
    {
        v17 = arm64g_calculate_condition(25, v16, 0, 0);
        if (!(v17 & 1))
            goto LABEL_3bb42;
LABEL_3bb41:
    }
    else
    {
        v18 = arm64g_calculate_condition(25, v16, 0, 0);
        if (v18 & 1)
            goto LABEL_3bb41;
LABEL_3bb42:
        v15 = &g_e66258;
    }
    goto *((void *)(*v15));
}
