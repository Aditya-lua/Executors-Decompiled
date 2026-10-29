/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f86c..0xa4f9f0 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4f86c_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[40];
    struct st_a4f86c_1 *field_40;
} st_a4f86c_0;

typedef struct st_a4f86c_1 {
    unsigned long long field_0;
} st_a4f86c_1;


unsigned long long sub_a4f86c(st_a4f86c_0 **a0, unsigned long long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v17;  // w19
    unsigned long long v18;  // x2
    unsigned long long v19;  // 4116
    unsigned long long v9;  // x30
    st_a4f86c_0 *v10;  // x8
    unsigned int v11;  // w9
    unsigned long v12;  // cc_dep1
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    if (!a0 || (v10 = *a0, !v10))
    {
        v17 = 0xffffffff;
        goto LABEL_a4f8d8;
    }
    if (v10->field_40)
        v10->field_40();
    if (!(v10->field_10 >> 24 & 1))
    {
        v11 = (unsigned int)v10->field_10 & 0xfffff & 0xffff0007;
        v12 = v11;
        if ((int)v11 > 0x10000)
        {
            if (v11 != 65537)
            {
                v13 = arm64g_calculate_condition(19, v12, 0x10000, 0);
                v14 = arm64g_calculate_condition(3, (v13 & 1 ? v11 : 0x40000000), (v13 & 1 ? "RL\"" : 0), 0);
                if (!(v14 & 1))
                    goto LABEL_a4f94c;
            }
            else
            {
                v15 = arm64g_calculate_condition(19, v12, 0x10000, 0);
                v16 = arm64g_calculate_condition(0, (v15 & 1 ? v11 : 0x40000000), (v15 & 1 ? "RL\"" : 0), 0);
                if (!(v16 & 1))
                {
LABEL_a4f94c:
                    if (v11 != 65538)
                        goto LABEL_a4f9c0;
                    if (sub_a4fe08(v10, "id-smime-alg-CMS3DESwrap"))
                    {
                        sub_9c536c(a1, 5, 0);
                        v17 = 1;
                    }
                    else
                    {
                        v17 = 1;
                    }
LABEL_a4f904:
                    if (0 > v17)
                        return 0xffffffff;
                    return v17;
                }
            }
        }
        else
        {
            if (v11 != 6)
            {
                if (v11 != 7)
                {
LABEL_a4f9c0:
                    v17 = (unsigned int)sub_a4fd04();
                    goto LABEL_a4f894;
                }
            }
            else
            {
                v17 = 0;
                if (!a1 || !v18)
                {
LABEL_a4f8d8:
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_lib.c", 146, "evp_cipher_param_to_asn1_ex");
                    sub_a36abc(6, 122, 0);
                    goto LABEL_a4f904;
                }
                else
                {
                    v17 = (unsigned int)sub_9c97fc(a1, *(int *)(v18 + 20));
LABEL_a4f894:
                    v19 = arm64g_calculate_condition(0x11, v17, 2, 0);
                    if (v19 & 1)
                        goto LABEL_a4f9a4;
                }
            }
        }
    }
    else if (*(long long *)&v10[1].padding_18[24])
    {
        v0 = 0;
        v1 = a1;
        v17 = (unsigned int)sub_a4fe6c();
LABEL_a4f9a4:
        if (0 >= v17)
            goto LABEL_a4f8d8;
        goto LABEL_a4f904;
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/evp_lib.c", 144, "evp_cipher_param_to_asn1_ex");
    sub_a36abc(6, 107, 0);
    v17 = 0xfffffffe;
    goto LABEL_a4f904;
}
