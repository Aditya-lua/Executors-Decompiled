/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf41f8..0xaf44e8 (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af41f8_5 {
    char padding_0[32];
    struct st_af41f8_4 *field_20;
    char padding_28[8];
    struct st_af41f8_0 *field_30;
    struct st_af41f8_6 *field_38;
    char padding_40[88];
    long long field_98;
    char padding_a0[12];
    struct st_af41f8_0 *field_ac;
    struct st_af41f8_0 *field_b0;
    unsigned long long field_b8;
    char padding_c0[48];
    struct st_af41f8_0 *field_f0;
    char padding_f8[8];
    struct st_af41f8_0 *field_100;
} st_af41f8_5;

typedef struct st_af41f8_3 {
    char field_0;
    struct st_af41f8_0 *field_1;
    char field_2;
    char padding_3[5];
    unsigned long long field_8;
    unsigned long long field_10;
} st_af41f8_3;

typedef struct st_af41f8_4 {
    char padding_0[44];
    char *field_2c;
} st_af41f8_4;

typedef struct st_af41f8_0 {
    struct st_af41f8_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_af41f8_3 *field_18;
    char field_20;
    char padding_21[11];
    struct st_af41f8_0 *field_2c;
} st_af41f8_0;

typedef struct st_af41f8_6 {
    unsigned long long field_0;
} st_af41f8_6;

typedef struct st_af41f8_2 {
    struct st_af41f8_0 *field_0;
} st_af41f8_2;

extern char g_10002b0;

unsigned int sub_af41f8(st_af41f8_5 *a0)
{
    char *v6;  // w8
    unsigned int v7;  // w0
    st_af41f8_3 *v16;  // x0
    char *v17;  // w27
    char *v18;  // x22
    char *v19;  // w8
    char *v8;  // x20
    char *v9;  // x25
    char *v10;  // w20
    char *v11;  // w0
    char *v12;  // w21
    char *v13;  // x22
    char *v14;  // x23
    char *v15;  // w26
    char *v0;  // [bp-0xb4]
    char *v1;  // [bp-0xb0]
    st_af41f8_2 **v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = (char *)*(int *)&(a0->field_20->padding_0)[1];
    if (v6 >= 1)
    {
        if (a0->padding_f8)
        {
            if (v6 >= 5)
                v6 = (char *)5;
            v7 = sub_a59d18();
            if (*(int *)(0x4 * v6 + 14671044) <= (int)v7)
                goto LABEL_af429c;
        }
        *(unsigned int *)&(a0->padding_a0)[1] = 0;
        a0->field_b0 = sub_ad69f8(a0->field_98, 0);
        *(unsigned int *)&a0->field_ac = 66;
        a0->field_38();
    }
    else
    {
LABEL_af429c:
        *(unsigned int *)&a0->field_ac = 95;
        if (*(long long *)&a0->padding_c0[40] && (int)sub_ad69e4(*(long long *)(*(long long *)&a0->padding_c0[40] + 8)) >= 1)
        {
            v8 = *(long long *)&a0->padding_c0[40];
            sub_afc404(*(long long *)&v8[32]);
            *(uint128_t *)&v8[24] = __double_as_longlong(0) * 0x10000000000000000;
            *(unsigned long *)&v8[44] = 0xffffffffffffffff;
            v9 = *(long long *)&a0->padding_c0[40];
            v1 = 0;
            v10 = (char *)(unsigned int)sub_ad69e4(*(long long *)&v9[8]);
            v11 = (char *)(unsigned int)sub_afb6e8(a0->padding_f8, &v1);
            if (v11 > 0)
            {
                v12 = v11;
                v0 = v11;
                v13 = v1;
                if (v10 >= 1)
                {
                    v14 = 0;
                    v15 = (char *)0;
                    do
                    {
                        v16 = sub_ad69f8(*(long long *)&v9[8], v14);
                        if (v16->field_0 != 3 || (&v16->field_0)[1] != 1)
                            continue;
                        v17 = (char *)(&v16->field_0)[2];
                        if (v15 != v17)
                        {
                            v18 = v1;
                            v0 = v12;
                            if (*(long long *)(*(long long *)*(long long *)v9 + (v17 & 0xff) * 8))
                            {
                                v13 = &v2;
                                v15 = v17;
                                if (!sub_a40abc(v18, v12, &v2, &v0))
                                {
                                    sub_a6c2e4(v1, "crypto/x509/x509_vfy.c", 3150);
                                    *(unsigned int *)&(a0->padding_a0)[1] = 0;
                                    *(unsigned int *)&a0->field_ac = 1;
                                    if (*(long long *)&g_10002b0 == v3)
                                        return 0xffffffff;
                                    ___stack_chk_fail();
                                }
                            }
                            else
                            {
                                v15 = v17;
                                v13 = v18;
                            }
                        }
                        if (*(long long *)&v16->field_2 == (unsigned long long)v0 && !_memcmp(v13, v16->field_1))
                        {
                            *(unsigned int *)&v9[44] = 0;
                            *(st_af41f8_3 **)&v9[24] = v16;
                            sub_a6c2e4(v1, "crypto/x509/x509_vfy.c", 3150);
                            v19 = (char *)0;
                            goto LABEL_af4440;
                        }
                    } while ((v14 = (unsigned int)v14 + 1, v10 != (unsigned int)v14));
                    v13 = v1;
                }
                sub_a6c2e4(v13, "crypto/x509/x509_vfy.c", 3150);
                v19 = (char *)65;
LABEL_af4440:
                *(unsigned int *)&(a0->padding_a0)[1] = 0;
                *(unsigned int *)&a0->field_ac = (unsigned int)v19;
                if (!a0->field_30)
                    a0->field_38();
                a0->field_30();
            }
            else
            {
                *(unsigned int *)&(a0->padding_a0)[1] = 0;
                *(unsigned int *)&a0->field_ac = 1;
                if (*(long long *)&g_10002b0 == v3)
                    return 0xffffffff;
                ___stack_chk_fail();
            }
        }
        if (a0->field_30)
            a0->field_30();
        a0->field_38();
    }
}
