/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b61b0..0x1b6224 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b61b0_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_1b61b0_1;

typedef struct st_1b61b0_0 {
    char field_0;
} st_1b61b0_0;


long long sub_1b61b0(long long a0, st_1b61b0_1 *a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // 4109
    unsigned int v17;  // w0
    unsigned int v18;  // w8
    st_1b61b0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1b61b0_0 *v1;  // [bp-0x38]
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
    v14 = a1->field_8;
    v15 = sub_6b08();
    sub_a0c8(a0);
    v16 = arm64g_calculate_condition(36, v14, v15, 0);
    v17 = _memcmp();
    if (v14 <= v15)
        v18 = !(v16 & 1);
    else
        v18 = 0xffffffff;
    if (v17)
        return v17;
    return v18;
}
