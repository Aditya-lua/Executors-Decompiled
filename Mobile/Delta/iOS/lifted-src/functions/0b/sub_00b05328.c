/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb05328..0xb053ac (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b05328_0 {
    char padding_0[16];
    struct st_b05328_1 *field_10;
} st_b05328_0;

typedef struct st_b05328_2 {
    char padding_0[248];
    struct st_b05328_2 *field_f8;
    struct st_b05328_2 *field_100;
} st_b05328_2;

typedef struct st_b05328_3 {
    char padding_0[168];
    struct st_b05328_0 *field_a8;
    char padding_b0[16];
    char field_c0;
    char padding_c1[247];
    char field_1b8;
    char padding_1b9[247];
    struct st_b05328_2 *field_2b0;
    struct st_b05328_2 *field_2b8;
} st_b05328_3;

typedef struct st_b05328_1 {
    unsigned long long field_0;
} st_b05328_1;


int sub_b05328(st_b05328_3 *a0)
{
    st_b05328_2 **v3;  // x9
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    st_b05328_2 *v12;  // x0
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v3 = &a0->field_c0;
    if (a0->field_2b0)
    {
        v4 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v5 = arm64g_calculate_condition(20, (v4 & 1 ? a0->field_2b0 : 0x40000000), (v4 & 1 ? v3 : 0), 0);
        if (!(v5 & 1))
            goto LABEL_b05354;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? 0 : 0x40000000), (v8 & 1 ? v3 : 0), 0);
        if (!(v9 & 1))
        {
LABEL_b05354:
            if (!a0->field_2b8 || a0->field_2b8 == &a0->field_1b8)
            {
                v12 = sub_a6bf4c(736, "providers/implementations/ciphers/cipher_aes_xts.c", 169);
                if (!v12)
                    return (unsigned int)v12;
                a0->field_a8->field_10();
            }
        }
    }
    return 0;
}
