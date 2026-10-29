/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a304..0x2a360 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a304_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_2a304_1;

typedef struct st_2a304_0 {
    char field_0;
} st_2a304_0;


long long sub_2a304(st_2a304_1 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x20
    unsigned int v11;  // w0
    unsigned long v12;  // cc_dep1
    unsigned int v13;  // w8
    unsigned long long v14;  // 4106
    unsigned long long v15;  // 4106
    st_2a304_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2a304_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = a0->field_8;
    v11 = _memcmp();
    v12 = v10;
    if (v10 < a2)
    {
        v13 = 0xffffffff;
        v14 = arm64g_calculate_condition(4, v12, a2, 0);
        if (!(v14 & 1))
            goto LABEL_2a346;
LABEL_2a345:
        v13 = 0;
    }
    else
    {
        v13 = 0;
        v15 = arm64g_calculate_condition(4, v12, a2, 0);
        if (v15 & 1)
            goto LABEL_2a345;
LABEL_2a346:
    }
    if (!v11)
        return v13;
    return v11;
}
