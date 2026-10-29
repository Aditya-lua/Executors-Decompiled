/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad98a0..0xad9918 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad98a0_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    long long field_18;
    char padding_20[48];
    long long field_50;
} st_ad98a0_0;


st_ad98a0_0 * sub_ad98a0(st_ad98a0_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_ad98a0_0 *v12;  // x0
    st_ad98a0_0 *v13;  // x19
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = sub_a6820c(a0->field_50, 19);
    if (v12)
    {
        v13 = v12;
        v12 = sub_ad95f8(a0, a1);
        if ((unsigned int)v12)
        {
            sub_ad9384(v13->field_10);
            v13->field_8 = v13->field_8 - 1;
            sub_ad94e8(v13->field_18);
            sub_ad93b4(v13->field_10);
            v12 = 1;
        }
    }
    return v12;
}
