/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5e6d0..0xa5e960 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5e6d0_0 {
    unsigned int field_0;
    char padding_4[52];
    long long field_38;
    long long field_40;
    unsigned int field_48;
    char padding_4c[4];
    char field_50;
    char padding_51[39];
    struct st_a5e6d0_1 *field_78;
} st_a5e6d0_0;

typedef struct st_a5e6d0_1 {
    unsigned int field_0;
} st_a5e6d0_1;

typedef struct st_a5e6d0_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char field_18;
    char padding_19[39];
    struct st_a5e6d0_1 *field_40;
} st_a5e6d0_2;


unsigned long long sub_a5e6d0(st_a5e6d0_0 *a0, long long a1, unsigned int a2, unsigned int a3, unsigned int a4, long long a5, unsigned int a6)
{
    unsigned long long v2;  // 4112
    unsigned long long v3;  // 4112
    unsigned int v12;  // x0
    unsigned long v4;  // x8
    long long v5;  // x0
    long long v6;  // x1
    unsigned int v8;  // w0
    unsigned long long v9;  // 4112
    st_a5e6d0_2 *v10;  // x24
    unsigned int v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3 != 15)
    {
        v2 = arm64g_calculate_condition(0x11, a3, 1, 0);
        if (v2 & 1 || !a4 || _strcmp(a4, "distid") && _strcmp(a4, "hexdistid"))
        {
            sub_c67fa8();
            return 0xfffffffe;
        }
    }
    v3 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
    if (!(v3 & 1))
    {
        v4 = a0->field_0;
        if ((unsigned int)v4 && (v4 >> 11 & 1 && *(long long *)&a0->padding_4[44] || (unsigned int)v4 & 49648 && *(long long *)&a0->padding_4[44] || (unsigned int)v4 & 0x600 && *(long long *)&a0->padding_4[44] || (unsigned int)v4 & 6 && *(long long *)&a0->padding_4[36] || (unsigned int)v4 & 0x3000 && *(long long *)&a0->padding_4[44]))
        {
            if (!*(long long *)&a0->padding_4[28])
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/pmeth_lib.c", 1468, "evp_pkey_ctx_store_cached_data");
                sub_a36abc(6, 147, 0);
                return 0xfffffffe;
            }
            v5 = sub_a5b298(a1);
            if (sub_a558b4(*(long long *)&a0->padding_4[28], v5))
                goto LABEL_a5e7fc;
            sub_a368c8();
            v6 = 1473;
        }
        else
        {
            if (!a0->field_78)
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/pmeth_lib.c", 1480, "evp_pkey_ctx_store_cached_data");
                sub_a36abc(6, 147, 0);
                return 0xfffffffe;
            }
            v8 = sub_a5ac9c(*(int *)a0->field_78);
            if (v8 == sub_a5ac9c(a1))
                goto LABEL_a5e7fc;
            sub_a368c8();
            v6 = 1484;
        }
    }
    else
    {
LABEL_a5e7fc:
        v9 = arm64g_calculate_condition(1, a2, 1, 0);
        if (v9 & 1 || a0->field_0 & a2)
        {
            sub_a6c2e4(a0->field_40, "crypto/evp/pmeth_lib.c", 1521);
            v10 = &a0->field_38;
            sub_a6c2e4(a0->field_38, "crypto/evp/pmeth_lib.c", 1522);
            a0->field_40 = 0;
            v10->field_0 = 0;
            if (a4)
            {
                v11 = sub_a6d9b4(a4, "crypto/evp/pmeth_lib.c", 1499);
                v10->field_0 = v11;
                if (!v11)
                    return v11;
            }
            if (a6)
            {
                v12 = sub_a6dac4(a5, a6, "crypto/evp/pmeth_lib.c", 1504);
                a0->field_40 = v12;
                if (!v12)
                    return v12;
            }
            a0->field_50 = a0->field_50 | 1;
            *(unsigned long long *)&a0->field_48 = a6;
            return 1;
        }
        sub_a368c8();
        v6 = 1491;
    }
    sub_a369bc("crypto/evp/pmeth_lib.c", v6, "evp_pkey_ctx_store_cached_data");
    sub_a36abc(6, 148, 0);
    return 0xffffffff;
}
