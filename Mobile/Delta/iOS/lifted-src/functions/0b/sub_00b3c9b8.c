/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3c9b8..0xb3cacc (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3c9b8_0 {
    struct st_b3c9b8_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_b3c9b8_0 *field_10;
    long long field_18;
} st_b3c9b8_0;

typedef struct st_b3c9b8_2 {
    char padding_0[63];
    struct st_b3c9b8_0 *field_3f;
    unsigned long long field_47;
} st_b3c9b8_2;

typedef struct st_b3c9b8_1 {
    char padding_0[8];
    struct st_b3c9b8_0 *field_8;
    char field_10;
    char field_11;
    char padding_12[62];
    struct st_b3c9b8_0 *field_50;
    long long field_58;
} st_b3c9b8_1;


st_b3c9b8_0 * sub_b3c9b8(st_b3c9b8_1 *a0, st_b3c9b8_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_b3c9b8_0 *v9;  // x0
    st_b3c9b8_0 *v10;  // x0
    st_b3c9b8_0 *v11;  // x20
    st_b3c9b8_0 *v12;  // x0
    st_b3c9b8_2 *v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (a1->field_0)
    {
        v1 = v6;
        v2 = v7;
        v3 = &v5;
        v4 = v8;
        v9 = sub_a6fbc4(a1, "encoded-pub-key");
        if (v9)
        {
            v0 = &a0->field_11;
            if (v9->field_18 != a0->field_58)
            {
                return 0;
            }
            else if (sub_a71440())
            {
                sub_a6c4e8(a0->field_50, a0->field_58, "providers/implementations/keymgmt/ecx_kmgmt.c", 437);
                a0->field_50 = 0;
                a0->field_10 = a0->field_10 | 1;
            }
            else
            {
                return 0;
            }
        }
        v10 = sub_a6fbc4(a1, "properties");
        if (!v10)
            return 1;
        if (v10->field_8 == 4)
        {
            v11 = v10->field_10;
            sub_a6c2e4(a0->field_8, "providers/implementations/keymgmt/ecx_kmgmt.c", 411);
            a0->field_8 = 0;
            if (v11)
            {
                v12 = sub_a6d9b4(v11, "providers/implementations/keymgmt/ecx_kmgmt.c", 414);
                a0->field_8 = v12;
                return v12 != 0;
            }
        }
        else
        {
            return 0;
        }
        return 1;
    }
    else
    {
        return 1;
    }
}
