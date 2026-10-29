/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x105a0..0x10714 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_105a0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_105a0_1;

typedef struct st_105a0_0 {
    char field_0;
} st_105a0_0;


unsigned long long sub_105a0(void* a0, long long a1)
{
    void* v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v0;  // [bp-0xa0]
    st_105a0_0 **v1;  // [bp-0x90], Other Possible Types: char
    st_105a0_0 *v2;  // [bp-0x88]
    uint128_t v3;  // [bp-0x80]
    uint128_t v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x58]
    unsigned long v6;  // [bp-0x50]
    st_105a0_1 *v7;  // [bp-0x48]
    long long v8;  // [bp-0x40]
    unsigned long v9;  // [bp-0x38]
    unsigned long v10;  // [bp-0x30]
    st_105a0_1 **v11;  // [bp-0x28], Other Possible Types: unsigned long
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v2 = &v1;
    v1 = &v2;
    v10 = 0;
    v11 = 0;
    v7 = a0 + 1136;
    v8 = (long long)a0[1144] - (long long)a0[1136] >> 3;
    v9 = 0;
    v10 = sub_237f0();
    v11 = &v7;
    v14 = a0 + 128;
    if ((int)a0[128] == 299)
    {
        v3 = *(int128_t *)v14;
        v4 = (int128_t)v14[16];
        sub_f8d0(a0);
        v5 = 0;
        v15 = sub_e5f4(a0, 0, &v3, &v5, 0, &v10, 0, &v7);
    }
    else
    {
        v5 = 0;
        v6 = 0;
        sub_b814(v14);
        v0 = sub_a0c8(&v3);
        v15 = sub_11094(a0, a1, &v5, "Expected 'function' declaration after attribute, but got %s instead");
    }
    sub_dd88(v7, v7->field_0 + v8 * 8, v7->field_8);
    return v15;
}
