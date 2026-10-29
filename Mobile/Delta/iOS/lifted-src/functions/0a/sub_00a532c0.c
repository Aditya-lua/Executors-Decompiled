/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa532c0..0xa53488 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a532c0_2 {
    char padding_0[1];
    char field_1;
    char padding_2[38];
    struct st_a532c0_1 *field_28;
    char padding_30[72];
    struct st_a532c0_0 *field_78;
    char padding_80[8];
    long long field_88;
} st_a532c0_2;

typedef struct st_a532c0_0 {
    char padding_0[4];
    char field_4;
} st_a532c0_0;

typedef struct st_a532c0_1 {
    char padding_0[64];
    unsigned long long field_40;
} st_a532c0_1;


unsigned int sub_a532c0(st_a532c0_2 *a0, char a1, char a2)
{
    long long v2;  // x1
    st_a532c0_0 *v3;  // x8
    char v4;  // x3
    char v5;  // w0
    unsigned long v6;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/exchange.c", 521, "EVP_PKEY_derive");
        v2 = 786690;
    }
    else if (!(a0->field_1 >> 3 & 1))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/exchange.c", 526, "EVP_PKEY_derive");
        v2 = 151;
    }
    else if (*(long long *)&a0->padding_30[0])
    {
        goto *((void *)(a0->field_28->field_40));
    }
    else
    {
        v3 = a0->field_78;
        if (v3)
        {
            v4 = *(long long *)&v3[36].field_4;
            if (*(long long *)&v3[36].field_4)
            {
                if (v3->field_4 >> 1 & 1)
                {
                    v5 = sub_a5bdac(a0->field_88);
                    if (!v5)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/evp/exchange.c", 543, "EVP_PKEY_derive");
                        sub_a36abc(6, 163, 0);
                        return 0;
                    }
                    v6 = v5;
                    if (!a1)
                    {
                        *(unsigned long *)a2 = v6;
                        return 1;
                    }
                    if (v6 > (unsigned long long)*(long long *)a2)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/evp/exchange.c", 543, "EVP_PKEY_derive");
                        sub_a36abc(6, 155, 0);
                        return 0;
                    }
                    v4 = *(long long *)&a0->field_78[36].field_4;
                }
                goto *((void *)(v4));
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/exchange.c", 539, "EVP_PKEY_derive");
        sub_a36abc(6, 150, 0);
        return 0xfffffffe;
    }
    sub_a36abc(6, v2, 0);
    return 0xffffffff;
}
