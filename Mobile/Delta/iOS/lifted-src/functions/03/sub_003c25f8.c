/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c25f8..0x3c26c4 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c25f8_1 {
    char padding_0[24];
    unsigned int field_18;
} st_3c25f8_1;

typedef struct st_3c25f8_0 {
    char field_0;
} st_3c25f8_0;

extern long long g_cbed28;

st_3c25f8_1 * sub_3c25f8(unsigned long long *a0, st_3c25f8_1 *a1)
{
    st_3c25f8_1 *v7;  // x0
    unsigned long long v8;  // x9
    unsigned long long v9;  // x8
    st_3c25f8_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_3c25f8_0 *v1;  // [bp-0x50]
    st_3c25f8_1 *v2;  // [bp-0x48]
    char v3;  // [bp-0x39]
    st_3c25f8_1 **v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    if (!a1)
        return 0;
    v7 = sub_3c23b0(a0 + 11, &v2);
    if (!v7)
    {
        sub_103a8(a0 + 8, &v2);
        v8 = a0[8];
        v9 = a0[9];
        v4 = &v2;
        *(unsigned int *)(sub_3c1638(a0 + 11, &v2, &g_cbed28, &v4, &v3) + 24) = v9 - v8 >> 3;
        return v9 - v8 >> 3;
    }
    return v7->field_18;
}
