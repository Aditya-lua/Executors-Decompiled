/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc672c8..0xc67460 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c672c8_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[152];
    struct st_c672c8_1 *field_a0;
} st_c672c8_0;

typedef struct st_c672c8_1 {
    unsigned long long field_0;
} st_c672c8_1;


unsigned long long sub_c672c8(st_c672c8_0 **a0, unsigned long a1, unsigned long long a2, unsigned long a3, unsigned long long a4)
{
    st_c672c8_0 *v2;  // x9
    unsigned int v3;  // w10
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    long long v12;  // x0
    long long v13;  // x1
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a4 >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_enc.c", 983, "EVP_EncryptUpdate");
        v12 = 6;
        v13 = 0xdd;
    }
    else if (a2)
    {
        *(unsigned int *)a2 = 0;
        if ((int)a0[2])
        {
            v2 = *a0;
            if (v2)
            {
                v3 = v2->field_4;
                if (v2->field_a0)
                {
                    v4 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
                    v5 = arm64g_calculate_condition(211, (v4 & 1 ? v3 : 0x40000000), 0, 0);
                    if (v5 & 1)
                        goto LABEL_c67444;
LABEL_c67318:
                    v2->field_a0();
                }
                else
                {
                    v8 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
                    v9 = arm64g_calculate_condition(208, (v8 & 1 ? v3 : 0x40000000), 0, 0);
                    if (!(v9 & 1))
                        goto LABEL_c67318;
LABEL_c67444:
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_enc.c", 1011, "EVP_EncryptUpdate");
                    v12 = 6;
                    v13 = 189;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/evp_enc.c", 1001, "EVP_EncryptUpdate");
                v12 = 6;
                v13 = 131;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_enc.c", 996, "EVP_EncryptUpdate");
            v12 = 6;
            v13 = 148;
        }
    }
    else
    {
        sub_a368c8();
        v13 = 990;
        v12 = sub_a4e68c(sub_a369bc("crypto/evp/evp_enc.c", 990, "EVP_EncryptUpdate"), 990, "EVP_EncryptUpdate");
    }
    sub_a36abc(v12, v13, 0);
    return 0;
}
