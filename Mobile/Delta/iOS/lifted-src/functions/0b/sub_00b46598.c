/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb46598..0xb468a8 (784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b46598_0 {
    char padding_0[24];
    struct st_b46598_1 *field_18;
    struct st_b46598_1 *field_20;
    char padding_28[80];
    unsigned int field_78;
    char padding_7c[12];
    long long field_88;
    long long field_90;
    char padding_98[24];
    unsigned long long field_b0;
    char padding_b8[24];
    unsigned int field_d0;
    unsigned int field_d4;
    char padding_d8[16];
    unsigned int field_e8;
} st_b46598_0;

typedef struct st_b46598_1 {
    unsigned long long field_0;
} st_b46598_1;


long long sub_b46598(st_b46598_0 *a0, long long a1, unsigned long a2, long long a3, unsigned long a4, unsigned long a5)
{
    unsigned long v3;  // x0
    unsigned int v4;  // w8
    long long v5;  // x1
    long long v6;  // x1
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w8
    long long v10;  // x22
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_a2f9e0();
    if (!(unsigned int)v3)
        return v3;
    v4 = a0->field_e8;
    if (v4 != 1)
    {
        if (v4 == 2)
            a0->field_18();
        if (v4)
        {
LABEL_b46600:
            if (v4 != 2)
                goto LABEL_b46630;
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 497, "ossl_prov_drbg_reseed_unlocked");
            v5 = 192;
        }
        else
        {
            sub_b45dd0(a0, a0->field_78, 0, 0, 0);
            v4 = a0->field_e8;
            if (a0->field_e8)
                goto LABEL_b46600;
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 501, "ossl_prov_drbg_reseed_unlocked");
            v5 = 193;
        }
    }
    else
    {
LABEL_b46630:
        if (a2)
        {
            if ((unsigned long long)a0->field_88 > (unsigned long long)a3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/rands/drbg.c", 508, "ossl_prov_drbg_reseed_unlocked");
                v6 = 124;
            }
            else
            {
                if ((unsigned long long)a3 <= (unsigned long long)a0->field_90)
                    goto LABEL_b466f8;
                sub_a368c8();
                sub_a369bc("providers/implementations/rands/drbg.c", 513, "ossl_prov_drbg_reseed_unlocked");
                v6 = 106;
            }
            sub_a36abc(36, v6, 0);
            a0->field_e8 = 2;
            return 0;
        }
LABEL_b466f8:
        if (a4)
        {
            if (a5 <= a0->field_b0)
                goto LABEL_b46730;
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 522, "ossl_prov_drbg_reseed_unlocked");
            v5 = 184;
        }
        else
        {
LABEL_b46730:
            a0->field_e8 = 2;
            v7 = a0->field_d0;
            if (v7 + 1 <= 1)
                v8 = 1;
            else
                v8 = v7 + 1;
            if (!v7)
                v9 = 0;
            else
                v9 = v8;
            a0->field_d4 = v9;
            if (a2)
                a0->field_20();
            v10 = sub_b462ac(a0, &v0, a0->field_78, a0->field_88, a0->field_90, a1);
            if ((unsigned long long)v10 >= (unsigned long long)a0->field_88 && (unsigned long long)v10 <= (unsigned long long)a0->field_90)
                a0->field_20();
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 565, "ossl_prov_drbg_reseed_unlocked");
            sub_a36abc(57, 189, 0);
            sub_b4643c(a0, v0, v10);
            return a0->field_e8 == 1;
        }
    }
    sub_a36abc(57, v5, 0);
    return 0;
}
