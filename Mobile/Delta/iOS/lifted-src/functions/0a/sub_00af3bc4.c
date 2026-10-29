/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3bc4..0xaf3da0 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_af3bc4(void* a0)
{
    unsigned int v4;  // x20
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long v14;  // cc_op
    long long v15;  // x1
    unsigned int v6;  // w1
    unsigned int v16;  // w0
    unsigned int v17;  // x0
    unsigned int v18;  // w0
    unsigned int v19;  // w0
    unsigned int v20;  // w8
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    char v0;  // [bp-0x38]
    char v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_afb440((long long)a0[80]);
    *(uint128_t *)&a0[176] = 0xffffffff0000000000000000;
    v6 = v1;
    if (sub_a9ae64(sub_a99eac((long long)a0[0x88]), &v0, &v1))
    {
        v7 = arm64g_calculate_condition(v14 | 16, v9, v10, v11);
        v8 = arm64g_calculate_condition(19, (v7 & 1 ? v6 : 0x40000000), 0, 0);
        if (v8 & 1)
            goto LABEL_af3c54;
LABEL_af3c20:
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_set.c", 225, "x509_sig_info_init");
        v15 = 144;
    }
    else
    {
        v12 = arm64g_calculate_condition(v14 | 16, v9, v10, v11);
        v13 = arm64g_calculate_condition(16, (v12 & 1 ? v6 : 0x40000000), 0, 0);
        if (!(v13 & 1))
            goto LABEL_af3c20;
LABEL_af3c54:
        v16 = v0;
        *(unsigned int *)&a0[176] = v16;
        *(unsigned int *)&a0[180] = v6;
        if (63 >= (int)v16)
        {
            switch (v16)
            {
            case 0:
                v17 = sub_9c5df4(0);
                if (v17 && *(long long *)(v17 + 216))
                    (*(long long *)(v17 + 216))();
                if (v4 && !(v18 = sub_a59d18(v4), !v18))
                {
LABEL_af3cf0:
                    *(unsigned int *)&a0[184] = v18;
                    v20 = v0;
                    if (v20 - 672 < 3)
                    {
                        *(unsigned int *)&a0[188] = (int)a0[188] | 2;
                        *(unsigned int *)&a0[188] = (int)a0[188] | 1;
                        return 1;
                    }
                    else if (v20 == 64)
                    {
                        *(unsigned int *)&a0[188] = (int)a0[188] | 2;
                        *(unsigned int *)&a0[188] = (int)a0[188] | 1;
                        return 1;
                    }
                    else
                    {
                        *(unsigned int *)&a0[188] = (int)a0[188] | 1;
                        return 1;
                    }
                }
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_set.c", 247, "x509_sig_info_init");
                v15 = 142;
                break;
            case 4:
                *(unsigned int *)&a0[184] = 39;
                *(unsigned int *)&a0[188] = (int)a0[188] | 1;
                return 1;
            default:
LABEL_af3c9c:
                if (sub_a58d60(sub_a9976c()))
                {
                    v19 = sub_a50ac8();
                    if ((int)v19 < 1)
                        return 0;
                    v18 = v19 * 4;
                    goto LABEL_af3cf0;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/x509_set.c", 279, "x509_sig_info_init");
                    v15 = 141;
                    break;
                }
            }
        }
        else
        {
            switch (v16)
            {
            case 64:
                *(unsigned int *)&a0[184] = 63;
                *(unsigned int *)&a0[188] = (int)a0[188] | 2;
                *(unsigned int *)&a0[188] = (int)a0[188] | 1;
                return 1;
            case 809:
                *(unsigned int *)&a0[184] = 105;
                *(unsigned int *)&a0[188] = (int)a0[188] | 1;
                return 1;
            }
            goto LABEL_af3c9c;
        }
    }
    sub_a36abc(11, v15, 0);
    return 0;
}
