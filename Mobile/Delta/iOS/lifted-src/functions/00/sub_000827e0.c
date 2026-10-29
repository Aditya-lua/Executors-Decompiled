/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x827e0..0x82890 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_827e0_1 {
    char padding_0[3540];
    unsigned long long field_dd4;
    unsigned long long field_dd8;
} st_827e0_1;

typedef struct st_827e0_0 {
    char field_0;
} st_827e0_0;


unsigned long long sub_827e0(unsigned long long *a0, unsigned long a1, st_827e0_1 *a2, unsigned long a3, unsigned long long *a4, unsigned long a5, unsigned long a6)
{
    unsigned long long v10;  // x8
    unsigned long long v11;  // x0
    unsigned long long v12;  // 4110
    unsigned long long v13;  // d0
    unsigned long long v14;  // w10
    unsigned long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    st_827e0_0 **v2;  // [bp-0x58], Other Possible Types: char
    st_827e0_0 *v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v3 = &v2;
    v2 = &v3;
    v10 = a0[1] - *a0;
    if (a0[1] != *a0)
    {
        v0 = a5 + 212;
        v1 = a6 - 212;
        sub_7c8ac();
        v11 = v6;
        v12 = arm64g_calculate_condition(0x22, v11, 0x77, 0);
        if (v12 & 1)
            return v11;
        v13 = v4;
        v14 = v5;
        v10 = v7;
    }
    else
    {
        v11 = 0;
        v14 = 0;
        *(unsigned int *)&(a2->padding_0)[1] = 0;
        v13 = 0;
        a2->field_dd4 = 0;
    }
    *a4 = v13;
    *(unsigned int *)&a4[1] = v14;
    a4[20] = v10;
    return v11;
}
