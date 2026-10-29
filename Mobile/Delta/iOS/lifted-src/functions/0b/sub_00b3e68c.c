/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e68c..0xb3e738 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3e68c_1 {
    char padding_0[32];
    struct st_b3e68c_0 *field_20;
} st_b3e68c_1;

typedef struct st_b3e68c_0 {
    char padding_0[8];
    struct st_b3e68c_0 *field_8;
    char field_10;
    char padding_11[31];
    struct st_b3e68c_0 *field_30;
} st_b3e68c_0;


st_b3e68c_0 * sub_b3e68c(st_b3e68c_0 *a0, long long a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_b3e68c_0 *v9;  // x0
    st_b3e68c_0 *v10;  // x0
    st_b3e68c_0 **v11;  // x19
    st_b3e68c_1 *v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a0)
        return a0;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    if (sub_a6fbc4(a1, "seed"))
    {
        v0 = &a0->field_10;
        v9 = sub_a71440();
        if (!(unsigned int)v9)
        {
            a0->field_30 = 0;
            return v9;
        }
    }
    v10 = sub_a6fbc4(a1, "properties");
    if (!v10)
        return 1;
    v11 = &a0->field_8;
    sub_a6c2e4(a0->field_8, "providers/implementations/keymgmt/ml_dsa_kmgmt.c", 515);
    *v11 = 0;
    v9 = sub_a71220(v10, v11, 0);
    if (!(unsigned int)v9)
        return v9;
    return 1;
}
