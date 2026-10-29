/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ca98..0xa5cd00 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5ca98_3 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    long long field_10;
    char padding_18[80];
    struct st_a5ca98_4 *field_68;
    unsigned int field_70;
    char padding_74[4];
    struct st_a5ca98_5 *field_78;
} st_a5ca98_3;

typedef struct st_a5ca98_0 {
    unsigned int field_0;
} st_a5ca98_0;

typedef struct st_a5ca98_5 {
    char padding_0[40];
    struct st_a5ca98_2 *field_28;
    char padding_30[8];
    struct st_a5ca98_2 *field_38;
} st_a5ca98_5;

typedef struct st_a5ca98_2 {
    unsigned long long field_0;
} st_a5ca98_2;

typedef struct st_a5ca98_4 {
    char field_0;
} st_a5ca98_4;

typedef struct st_a5ca98_1 {
    char padding_0[116];
    unsigned int field_74;
} st_a5ca98_1;

extern char g_10002b0;

char sub_a5ca98(char idx, st_a5ca98_0 **a1)
{
    char v5;  // x20
    st_a5ca98_3 *v6;  // x0
    long long v7;  // x0
    char v8;  // x22
    st_a5ca98_1 *v9;  // x8
    char v10;  // x0
    char v0;  // [bp-0x48]
    char v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (!a1)
    {
LABEL_a5cc70:
        if (*(long long *)&g_10002b0 == v2)
            return 0xffffffff;
        ___stack_chk_fail();
    }
    if (idx)
    {
        if (!(*(char *)idx & 6))
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/pmeth_gn.c", 245, "EVP_PKEY_generate");
            sub_a36abc(6, 151, 0);
            sub_a5a4c8(0);
            if (*(long long *)&g_10002b0 == v2)
                return 0xffffffff;
            ___stack_chk_fail();
        }
        if (*a1)
        {
            v5 = 0;
            v6 = (st_a5ca98_3 *)idx;
        }
        else
        {
            v5 = sub_a5ba1c();
            v6 = (st_a5ca98_3 *)idx;
            *a1 = v5;
            if (!v5)
            {
                sub_a368c8(v6, v5);
                sub_a369bc("crypto/evp/pmeth_gn.c", 146, "EVP_PKEY_generate");
                sub_a36abc(6, 0x80006, 0);
                goto LABEL_a5cc70;
            }
        }
        if (*(long long *)&v6->padding_18[16])
        {
            v6->field_68 = &v1;
            v6->field_70 = 2;
            if (!v6[1].field_8)
            {
LABEL_a5cbd8:
                v10 = sub_a54fa4(*a1, *(long long *)&v6->padding_18[8]);
                *(unsigned long long *)(idx + 104) = 0;
                if (v10)
                {
                    sub_a5bd20(*a1);
                    v9 = (st_a5ca98_1 *)idx;
                    v8 = 1;
                    goto LABEL_a5ccd8;
                }
                else
                {
                    v9 = (st_a5ca98_1 *)idx;
                    v8 = 0;
                    goto LABEL_a5ccd8;
                }
            }
            v0 = *(long long *)&v6->padding_18[8];
            v7 = sub_a5a1f8(v6[1].field_8, v6->field_8, &v0, v6->field_10);
            if (!v0)
                goto LABEL_a5caec;
            if (sub_a559d4(*(long long *)(idx + 32), *(long long *)(idx + 40), v7))
            {
                v6 = (st_a5ca98_3 *)idx;
                goto LABEL_a5cbd8;
            }
            else
            {
                v8 = 0;
                v9 = (st_a5ca98_1 *)idx;
                *(unsigned long long *)(idx + 104) = 0;
LABEL_a5ccd8:
                *(unsigned int *)*a1 = v9->field_74;
                if (0 < v8)
                {
                    if (*(long long *)&g_10002b0 == v2)
                        return v8;
                    ___stack_chk_fail();
                }
            }
        }
        else if (!v6[1].field_8 || !*(long long *)(v6[1].field_8 + 96))
        {
            if (v6->field_0 == 4)
            {
                v6->field_78->field_38();
            }
            else if (v6->field_0 == 2)
            {
                v6->field_78->field_28();
            }
LABEL_a5caec:
            sub_a368c8();
            sub_a369bc("crypto/evp/pmeth_gn.c", 241, "EVP_PKEY_generate");
            sub_a36abc(6, 150, 0);
            v8 = 0xfffffffe;
        }
        else
        {
            sub_c67f1c();
            v8 = 0xffffffff;
        }
        if (v5)
            *a1 = 0;
        sub_a5a4c8(v5);
        if (*(long long *)&g_10002b0 == v2)
            return v8;
        ___stack_chk_fail();
    }
    else
    {
        v5 = 0;
        goto LABEL_a5caec;
    }
}
