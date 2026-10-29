/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c91c..0xb5cc38 (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5c91c_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    char padding_34[12];
    char field_40[13];
    unsigned short field_45[4];
    char field_4b;
} st_b5c91c_0;


unsigned long long sub_b5c91c(st_b5c91c_0 *a0, unsigned long a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    long long v19;  // x1
    unsigned long long v20;  // x8
    unsigned long long v21;  // 4113
    unsigned long v23;  // x8
    unsigned long long index;  // x0
    unsigned long long v25;  // w0
    st_b5c91c_0 *v26;  // x8
    unsigned long v27;  // x9
    unsigned long long v10;  // x20
    unsigned long v28;  // x10
    unsigned long long v29;  // x9
    unsigned long long v30;  // x10
    unsigned long long v31;  // x9
    unsigned long long v32;  // x10
    unsigned long long v34;  // x0
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long idx;  // x0
    unsigned long v14;  // x2
    unsigned long long v15;  // 4109
    unsigned long v16;  // x21
    st_b5c91c_0 *v17;  // x8
    unsigned long v0;  // [bp-0x38], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (!a1)
        return 1;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    if (!*(long long *)a1)
        return 1;
    idx = sub_a6fbc4(a1, "tag");
    if (!idx)
    {
LABEL_b5c9fc:
        if (sub_a6fbc4(a1, "ivlen"))
        {
            if (sub_a70ef8())
            {
                v20 = v0;
                v21 = arm64g_calculate_condition(130, v20 - 14, 8, 0);
                if (!(v21 & 1))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 109, "ossl_ccm_set_ctx_params");
                    sub_a36abc(57, 109, 0);
                    return 0;
                }
                v23 = 15 - v20;
                if (a0->field_8 != v23)
                {
                    a0->field_8 = v23;
                    a0->field_0 = a0->field_0 & 0xfffffffb;
                    goto LABEL_b5ca94;
                }
                goto LABEL_b5ca94;
            }
            else
            {
                sub_a368c8();
                v19 = 104;
            }
        }
        else
        {
LABEL_b5ca94:
            index = sub_a6fbc4(a1, "tlsaad");
            if (index)
            {
                if (*(int *)(index + 8) == 5)
                {
                    v25 = (unsigned int)sub_a2f9e0();
                    if (*(long long *)(index + 24) != 13 || !v25)
                    {
LABEL_b5caf4:
                        v0 = 0;
LABEL_b5caf8:
                        sub_a368c8();
                        sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 126, "ossl_ccm_set_ctx_params");
                        sub_a36abc(57, 115, 0);
                        return 0;
                    }
                    v26 = a0;
                    v27 = *(long long *)*(long long *)(index + 16);
                    v28 = *(long long *)(*(long long *)(index + 16) + 5);
                    *(unsigned long *)&a0->field_40[5] = v28;
                    *(unsigned long *)&a0->field_40[0] = v27;
                    a0->field_20 = 13;
                    v29 = (unsigned int)((v28 >> 48 & 0xff00ff00ff00ff00) >> 8) | (unsigned int)(v28 >> 48) * 0x100 & 0xff00ff00;
                    if (8 > (unsigned int)v29 || (v30 = v29 - 8, v31 = v26->field_10, v32 = v30, !(v26->field_0 & 1) && (v32 = v30 - v31, v30 < v31)))
                        goto LABEL_b5caf4;
                    *(unsigned short *)&v26->field_40[11] = (((((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                    v0 = (int)v31;
                    if (!(unsigned int)v31)
                        goto LABEL_b5caf8;
                    v26->field_28 = v0;
                    goto LABEL_b5cb98;
                }
                else
                {
                    sub_a368c8();
                    v19 = 121;
                }
            }
            else
            {
LABEL_b5cb98:
                v34 = sub_a6fbc4(a1, "tlsivfixed");
                if (!v34)
                    return 1;
                if (*(int *)(v34 + 8) == 5)
                {
                    if (*(long long *)(v34 + 24) == 4)
                    {
                        a0->field_30 = *(int *)*(long long *)(v34 + 16);
                        return 1;
                    }
                    sub_a368c8();
                    sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 139, "ossl_ccm_set_ctx_params");
                    sub_a36abc(57, 109, 0);
                    return 0;
                }
                sub_a368c8();
                v19 = 135;
            }
        }
    }
    else if (*(int *)(idx + 8) == 5)
    {
        v14 = *(long long *)(idx + 24);
        if (v14 & 1 || !(v15 = arm64g_calculate_condition(146, v14 - 0x11, 14, 0), !(v15 & 1)))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 84, "ossl_ccm_set_ctx_params");
            sub_a36abc(57, 118, 0);
            return 0;
        }
        if (*(long long *)(idx + 16))
        {
            v16 = a0->field_0;
            if (v16 & 1)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 90, "ossl_ccm_set_ctx_params");
                sub_a36abc(57, 120, 0);
                return 0;
            }
            _memcpy(a0->field_40);
            v17 = a0;
            a0->field_0 = (char)v16 | 8;
            v14 = *(long long *)(idx + 24);
        }
        else
        {
            v17 = a0;
        }
        v17->field_10 = v14;
        goto LABEL_b5c9fc;
    }
    else
    {
        sub_a368c8();
        v19 = 80;
    }
    sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", v19, "ossl_ccm_set_ctx_params");
    sub_a36abc(57, 103, 0);
    return 0;
}
