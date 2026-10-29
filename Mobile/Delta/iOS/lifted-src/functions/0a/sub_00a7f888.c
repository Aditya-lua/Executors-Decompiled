/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f888..0xa7f9e4 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7f888_1 {
    char padding_0[8];
    struct st_a7f888_0 *field_8;
    char padding_10[144];
    struct st_a7f888_1 *field_a0;
    struct st_a7f888_1 *field_a8;
    struct st_a7f888_1 *field_b0;
    unsigned int field_b8;
} st_a7f888_1;

typedef struct st_a7f888_2 {
    struct st_a7f888_1 *field_0;
    struct st_a7f888_1 *field_8;
    unsigned int field_10;
} st_a7f888_2;

typedef struct st_a7f888_0 {
    char padding_0[64];
    long long field_40;
} st_a7f888_0;


st_a7f888_1 * sub_a7f888(st_a7f888_1 *a0, unsigned long long a1, unsigned long long a2, st_a7f888_1 *a3, long long a4, st_a7f888_1 *a5, unsigned long a6)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    st_a7f888_1 *v19;  // x0
    st_a7f888_1 *v20;  // x8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_a7f888_2 *v16;  // x20
    st_a7f888_1 *v17;  // x0
    st_a7f888_1 *v18;  // x8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a0)
    {
        if (a0->field_a0)
        {
            a0 = 0;
        }
        else
        {
            v0 = v9;
            v1 = v10;
            v2 = v11;
            v3 = v12;
            v4 = v13;
            v5 = v14;
            v6 = &v8;
            v7 = v15;
            v16 = &a0->field_a8;
            if (a0->field_a8 || a5 && a0->field_8->field_40 != a6 || a3 && a4 != 32 || a0->field_b0)
                return 0;
            v17 = a0;
            if (a5)
            {
                v18 = sub_a6dac4(a5, a6, "crypto/ml_dsa/ml_dsa_key.c", 52);
                v17 = a0;
                v16->field_0 = v18;
                if (v18)
                    goto LABEL_a7f950;
                v19 = 0;
            }
            else
            {
LABEL_a7f950:
                if (!a3 || !(v20 = sub_a6dac4(a3, a4, "crypto/ml_dsa/ml_dsa_key.c", 55), v17 = a0, a0->field_b0 = v20, !v20))
                {
                    v17->field_b8 = (v17->field_b8 | (unsigned int)a1) & ~(unsigned int)a2;
                    return 1;
                }
                v19 = v16->field_0;
            }
            sub_a6c2e4(v19, "crypto/ml_dsa/ml_dsa_key.c", 63);
            sub_a6c2e4(a0->field_b0, "crypto/ml_dsa/ml_dsa_key.c", 64);
            v16->field_0 = 0;
            v16->field_8 = 0;
            return 0;
            return 0;
        }
    }
    return (unsigned int)a0;
}
