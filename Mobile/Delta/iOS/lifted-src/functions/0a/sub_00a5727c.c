/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5727c..0xa576f0 (1140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5727c_6 {
    char padding_0[120];
    struct st_a5727c_2 *field_78;
} st_a5727c_6;

typedef struct st_a5727c_4 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a5727c_3 *field_28;
    char padding_30[72];
    struct st_a5727c_0 *field_78;
    char padding_80[32];
    char field_a0;
} st_a5727c_4;

typedef struct st_a5727c_3 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[144];
    struct st_a5727c_1 *field_a0;
} st_a5727c_3;

typedef struct st_a5727c_0 {
    char padding_0[4];
    char field_4;
    char padding_5[115];
    struct st_a5727c_1 *field_78;
    char padding_80[120];
    struct st_a5727c_2 *field_f8;
} st_a5727c_0;

typedef struct st_a5727c_7 {
    char padding_0[40];
    struct st_a5727c_6 *field_28;
} st_a5727c_7;

typedef struct st_a5727c_5 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char field_19;
    char padding_1a[14];
    struct st_a5727c_4 *field_28;
} st_a5727c_5;

typedef struct st_a5727c_2 {
    unsigned long long field_0;
} st_a5727c_2;

typedef struct st_a5727c_1 {
    char field_0;
} st_a5727c_1;

extern unsigned long long g_c7c2eb;
extern char g_10002b0;

char sub_a5727c(st_a5727c_5 *a0, char a1, long long a2)
{
    st_a5727c_4 *v7;  // x19
    st_a5727c_3 *v8;  // x21
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4102
    char v25;  // w0
    unsigned long long v9;  // x22
    st_a5727c_0 *v10;  // x8
    unsigned long v11;  // x9
    char *v12;  // x24
    long long v13;  // x20
    long long v14;  // x21
    char v15;  // x0
    st_a5727c_7 *v16;  // x22
    unsigned long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    char v2;  // [bp-0x9c]
    char v3;  // [bp-0x98]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (a0->field_18 >> 11 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 505, "EVP_DigestSignFinal");
        goto LABEL_a57434;
    }
    v7 = *(long long *)&a0->padding_1a[7];
    if (!v7)
    {
LABEL_a57410:
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 545, "EVP_DigestSignFinal");
LABEL_a57434:
        sub_a36abc();
        goto LABEL_a5743c;
    }
    if (v7->field_0 == 128 && *(long long *)&v7->padding_30[0] && (v8 = v7->field_28, v8))
    {
        if (!*(long long *)&v8->padding_10[0])
            v9 = &g_c7c2eb;
        else
            v9 = *(long long *)&v8->padding_10[0];
        if (v8->field_a0)
        {
            sub_a36c8c();
            v8->field_a0();
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 518, "EVP_DigestSignFinal");
        v0 = v8->field_8;
        v1 = v9;
        goto LABEL_a57434;
        goto LABEL_a57434;
    }
    v10 = v7->field_78;
    if (!v10)
        goto LABEL_a57410;
    v11 = v7->field_a0;
    if (v11 & 1)
        v10->field_f8();
    v7->field_a0 = (char)v11 & 254;
    if (!(v10->field_4 >> 2 & 1))
    {
        v12 = v10->field_78;
        if (a1)
        {
            v2 = 0;
            if (!((char)(*((char *)&a0->field_18 + 1)) >> 1 & 1))
            {
                v13 = a2;
                v14 = a1;
                v15 = sub_a3f728();
                if (v15)
                {
                    v16 = (st_a5727c_7 *)v15;
                    if (sub_a40520())
                    {
                        if (v12)
                            (*(long long *)&v16->field_28->field_78[15])();
                        v15 = sub_a3ff7c(v16, &v3, &v2);
                        sub_a3f73c(v16);
                        goto LABEL_a576b8;
                        goto LABEL_a576b8;
                    }
                    else
                    {
                        sub_a3f73c(v16);
                    }
LABEL_a5743c:
                    v15 = 0;
                }
            }
            else
            {
                if (v12)
                    v12();
                v13 = a2;
                v14 = a1;
                v15 = sub_a3ff7c();
LABEL_a576b8:
                if (!v12)
                {
                    v21 = arm64g_calculate_condition(v17, v18, v19, v20);
                    v22 = arm64g_calculate_condition(3, (v21 & 1 ? v15 & 0xffffffff : 0x40000000), 0, 0);
                    if (!(v22 & 1))
                        goto LABEL_a576c4;
                }
                else
                {
                    v23 = arm64g_calculate_condition(v17, v18, v19, v20);
                    v24 = arm64g_calculate_condition(0, (v23 & 1 ? v15 & 0xffffffff : 0x40000000), 0, 0);
                    if (!(v24 & 1))
                    {
LABEL_a576c4:
                        if ((int)sub_a5fd3c(v7, v14, v13, &v3, v2) <= 0)
                            goto LABEL_a5743c;
LABEL_a576e4:
                        v15 = 1;
                    }
                }
            }
        }
        else
        {
            if (v12)
                v12();
            v25 = sub_a50ac8(a0->field_8);
            if (v25 >= 1 && 1 <= (int)sub_a5fd3c(v7, 0, a2, 0, v25))
                goto LABEL_a576e4;
            goto LABEL_a5743c;
        }
    }
    else if (a1)
    {
        if (!((char)(*((char *)&a0->field_18 + 1)) >> 1 & 1))
        {
            v15 = sub_a5d7bc(v7);
            if (v15)
                (*(long long *)(*(long long *)(v15 + 120) + 120))();
        }
        else
        {
            v10->field_78();
        }
    }
    else
    {
        if (*(long long *)&g_10002b0 == v4)
            goto *((void *)(v10->field_78));
        else
            ___stack_chk_fail();
    }
    if (*(long long *)&g_10002b0 == v4)
        return v15;
    ___stack_chk_fail();
}
