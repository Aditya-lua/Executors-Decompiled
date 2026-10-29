/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab2314..0xab243c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab2314_0 {
    char padding_0[1];
    char field_1;
} st_ab2314_0;

extern long long g_c7c2eb;
extern char g_10002b0;

unsigned long long sub_ab2314(st_ab2314_0 *a0, long long a1, char a2)
{
    long long v10;  // x19
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4108
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    long long v20;  // x1
    unsigned long long v22;  // x0
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4108
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x90]
    char v3;  // [bp-0x88]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (a0 && a0->field_1 & 6)
    {
        v10 = a1;
        if (sub_a5dadc())
        {
            if (!a2)
            {
                v12 = arm64g_calculate_condition(v18, v19, v14, v15);
                v13 = arm64g_calculate_condition(4, (v12 & 1 ? v10 : 0), 0, 0);
                if (!(v13 & 1))
                    goto LABEL_ab2376;
LABEL_ab2375:
                v20 = &g_c7c2eb;
            }
            else
            {
                v16 = arm64g_calculate_condition(v18, v19, v14, v15);
                v17 = arm64g_calculate_condition(0, (v16 & 1 ? v10 : 0), 0, 0);
                if (v17 & 1)
                    goto LABEL_ab2375;
LABEL_ab2376:
                v20 = v10;
            }
            sub_a71bbc(sub_a71670(), v20, a2);
            v4 = v0;
            v5 = v1;
            v6 = v2;
            v22 = sub_a5df54(a0, &v3);
            if ((int)v22 >= 1)
            {
                sub_a6c2e4(v10, "crypto/rsa/rsa_lib.c", 1207);
                v22 = 1;
            }
        }
        else
        {
            v22 = 0xffffffff;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_lib.c", 1184, "EVP_PKEY_CTX_set0_rsa_oaep_label");
        sub_a36abc(6, 147, 0);
        v22 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v22;
    ___stack_chk_fail();
}
