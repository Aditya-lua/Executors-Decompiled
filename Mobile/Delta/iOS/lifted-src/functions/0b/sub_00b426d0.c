/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb426d0..0xb427a0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b426d0_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_b426d0_0 *field_10;
    char field_18;
    char padding_19[95];
    struct st_b426d0_0 *field_78;
} st_b426d0_0;

typedef struct st_b426d0_1 {
    char padding_0[96];
    struct st_b426d0_0 *field_60;
} st_b426d0_1;


st_b426d0_0 * sub_b426d0(st_b426d0_0 *a0, long long a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_b426d0_0 *v13;  // x0
    st_b426d0_0 *v14;  // x0
    st_b426d0_1 *v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (!a0)
        return a0;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    if (!sub_a6fbc4(a1, "seed") || (v0 = &a0->field_18, v13 = sub_a71440(), (unsigned int)v13))
    {
        v14 = sub_a6fbc4(a1, "properties");
        if (!v14)
        {
LABEL_b42778:
            v13 = 1;
        }
        else if (v14->field_8 == 4)
        {
            sub_a6c2e4(a0->field_10, "providers/implementations/keymgmt/slh_dsa_kmgmt.c", 409);
            v13 = sub_a6d9b4(v14->field_10, "providers/implementations/keymgmt/slh_dsa_kmgmt.c", 410);
            a0->field_10 = v13;
            if (v13)
                goto LABEL_b42778;
        }
        else
        {
            v13 = 0;
        }
    }
    else
    {
        a0->field_78 = 0;
    }
    return v13;
}
