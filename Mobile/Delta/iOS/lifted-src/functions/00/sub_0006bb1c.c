/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6bb1c..0x6bb94 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6bb1c_0 {
    char field_0;
} st_6bb1c_0;


long long sub_6bb1c(long long a0)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned int v17;  // w0
    st_6bb1c_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_6bb1c_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
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
    v2 = 0;
    v0 = &v1;
    v15 = sub_a0c8();
    v16 = sub_a0c8(a0);
    v17 = sub_6b904(&v2, v15, v16 + sub_6b08(a0));
    if (!(unsigned int)v2)
        return v17;
    return 0;
}
