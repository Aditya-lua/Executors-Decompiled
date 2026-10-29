/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1da31c..0x1da3a0 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1da31c_1 {
    char padding_0[16];
    struct st_1da31c_1 *field_10;
    char padding_18[64];
    unsigned long long field_58;
} st_1da31c_1;

typedef struct st_1da31c_0 {
    char field_0;
} st_1da31c_0;

extern long long g_f02738;

st_1da31c_1 * sub_1da31c(unsigned long a0, unsigned long a1)
{
    st_1da31c_1 *v5;  // x0
    st_1da31c_1 *v6;  // x19
    st_1da31c_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_1da31c_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a0;
    v5 = sub_1e56ec(std::__1::mutex::lock(&g_f02738), &v2);
    if (v5 && v5->field_10)
        v6 = v5->field_10->field_58 == a1;
    else
        v6 = 0;
    std::__1::mutex::unlock(&g_f02738);
    return v6;
}
