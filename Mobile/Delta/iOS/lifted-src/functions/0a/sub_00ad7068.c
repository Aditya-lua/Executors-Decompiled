/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7068..0xad733c (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad7068_0 {
    char padding_0[48];
    void* field_30;
} st_ad7068_0;

typedef struct st_ad7068_1 {
    struct st_ad7068_0 *field_0;
    void* field_8;
    char padding_10[40];
    void* field_38;
} st_ad7068_1;


void* sub_ad7068(st_ad7068_1 *a0, void* a1)
{
    long long v3;  // x1
    void* v4;  // x0
    void* v5;  // x19
    void* v6;  // x20
    unsigned int v7;  // w9
    unsigned int v8;  // w0
    long long v9;  // x20
    void* v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if ((int)a0->field_38)
    {
        sub_a368c8();
        sub_a369bc("crypto/store/store_lib.c", 329, "OSSL_STORE_find");
        v3 = 117;
    }
    else if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/store/store_lib.c", 333, "OSSL_STORE_find");
        v3 = 786690;
    }
    else if (a0->field_8)
    {
        v0 = 0;
        if ((long long)a0->field_8[160])
        {
            v4 = sub_a6ee78();
            if (v4)
            {
                v5 = v4;
                v6 = 0;
                v7 = *(int *)a1;
                if (2 >= (int)v7)
                {
                    if (v7 != 1)
                    {
                        if (v7 != 2)
                            goto LABEL_ad7310;
                        v8 = sub_afa378((long long)a1[8], &v0);
                        if ((int)v8 < 1)
                            goto LABEL_ad7308;
                        v6 = sub_9c1c08((long long)a1[16], 0);
                        if (v6 && sub_a6f460(v5, "name", v0, v8) && sub_a6f188(v5, "serial", v6))
                        {
                            sub_a6f570(v5);
                            (long long)a0->field_8[160]();
                        }
                    }
                    else
                    {
                        if ((int)sub_afa378((long long)a1[8], &v0) >= 1)
                            goto LABEL_ad72cc;
LABEL_ad7308:
                        v6 = 0;
                    }
                }
                else
                {
                    if (v7 != 3)
                    {
                        if (v7 != 4)
                            goto LABEL_ad7310;
                        v6 = 0;
                        if (sub_a6f344(v5, "alias", (long long)a1[32], (long long)a1[40]))
                        {
                            sub_a6f570(v5);
                            (long long)a0->field_8[160]();
                        }
                    }
                    else
                    {
                        if (!sub_a6f344(v5, "digest", sub_a50a58((long long)a1[24]), 0))
                            goto LABEL_ad7308;
LABEL_ad72cc:
                        v6 = 0;
                        if (sub_a6f460(v5))
                        {
                            sub_a6f570(v5);
                            (long long)a0->field_8[160]();
                        }
                    }
                }
LABEL_ad7310:
                sub_a6eed4(v5);
                sub_a6c2e4(v0, "crypto/store/store_lib.c", 404);
                sub_9e48d4(v6);
                return 0;
            }
            v3 = 524303;
            v9 = 352;
        }
        else
        {
            v3 = 118;
            v9 = 347;
        }
        sub_a368c8();
        sub_a369bc("crypto/store/store_lib.c", v9, "OSSL_STORE_find");
    }
    else if (a0->field_0->field_30)
    {
        goto *((void *)(a0->field_0->field_30));
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/store/store_lib.c", 410, "OSSL_STORE_find");
        v3 = 118;
    }
    sub_a36abc(44, v3, 0);
    return 0;
}
