/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3c560..0xa3c8d4 (884 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3c560_4 {
    char padding_0[40];
    long long field_28;
} st_a3c560_4;

typedef struct st_a3c560_1 {
    uint128_t field_0;
    struct st_a3c560_0 *field_8;
    uint128_t field_10;
    unsigned long long field_20;
} st_a3c560_1;

typedef struct st_a3c560_2 {
    char padding_0[8];
    struct st_a3c560_0 *field_8;
    char padding_10[12];
    struct st_a3c560_0 *field_1c;
    struct st_a3c560_0 *field_20;
    char padding_28[8];
    struct st_a3c560_1 *field_30;
    struct st_a3c560_0 *field_38;
} st_a3c560_2;

typedef struct st_a3c560_0 {
    struct st_a3c560_0 *field_0;
} st_a3c560_0;

typedef struct st_a3c560_3 {
    struct st_a3c560_0 *field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_a3c560_3;

extern st_a3c560_3 g_e929e8;

double sub_a3c560(unsigned long long a0, st_a3c560_4 *a1, st_a3c560_2 *a2)
{
    st_a3c560_1 *v8;  // x20
    uint128_t v9;  // q0
    st_a3c560_0 **v10;  // w8
    st_a3c560_0 **v11;  // x8
    unsigned long v15;  // x0
    st_a3c560_0 **v16;  // x21
    st_a3c560_0 **v17;  // x8
    unsigned long v0;  // [bp-0x70]
    st_a3c560_0 **v1;  // [bp-0x68], Other Possible Types: unsigned long long
    st_a3c560_0 **v2;  // [bp-0x60], Other Possible Types: unsigned long
    uint128_t v3;  // [bp-0x58]
    uint128_t v4;  // [bp-0x48]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if ((int)sub_a3bbe8() >= 1)
    {
        if ((unsigned int)a0 != 8)
        {
            if ((unsigned int)a0 == 1)
            {
                if ((int)a2->field_8 == 2)
                {
                    v8 = (st_a3c560_1 *)a2->padding_28;
                    sub_a6ffac(a1->field_28, (a2->padding_10)[1]);
                    *(unsigned long *)&v8->field_10 = v5;
                    v8->field_0 = v3;
                    *(uint128_t *)&v8->field_8 = v4;
                    return (unsigned long long)v3;
                }
                else if ((int)a2->field_8 == 1)
                {
                    a2->field_30 = a2->field_1c;
                    a2->field_1c = &a2->field_38;
                    *(unsigned int *)&(a2->padding_10)[1] = 50;
                }
            }
        }
        else
        {
            if ((int)a2->field_8 == 1 && *(int *)&a2->padding_28[8] != 1 && *(int *)&a2->padding_28[8] != 2)
            {
                v10 = (st_a3c560_0 **)*(int *)&(a2->padding_10)[1];
                if (4 >= v10)
                {
                    switch (v10)
                    {
                    case 1:
                        v11 = 0;
                        break;
                    case 3:
                        v11 = 1;
                        break;
                    case 4:
                        v11 = 2;
                        break;
                    default:
                        goto LABEL_a3c6d0;
                    }
                }
                else if (v10 != 5)
                {
                    if (v10 != 6)
                    {
                        if (v10 == 7)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/evp/ctrl_params_translate.c", 1336, "fix_rsa_padding_mode");
                            sub_a36abc(6, 147, 0);
                            return (unsigned long long)v9;
                        }
LABEL_a3c6d0:
                        sub_a368c8();
                        sub_a369bc("crypto/evp/ctrl_params_translate.c", 1326, "fix_rsa_padding_mode");
                        v2 = *(int *)&(a2->padding_10)[1];
                        v0 = (int)a2->field_8;
                        v1 = 8;
                        sub_a36abc(4, 118, "[action:%d, state:%d] padding number %d");
                        return (unsigned long long)v9;
                    }
                    v11 = 5;
                }
                else
                {
                    v11 = 4;
                }
                v15 = *(long long *)((char *)&g_e929e8.field_0 + 0x10 * v11 + 8);
                a2->field_1c = v15;
                *(unsigned int *)&(a2->padding_10)[1] = _strlen(v15);
            }
        }
        if ((int)sub_a3aef4(a0, a1, a2) >= 1 && ((unsigned int)a0 == 7 && (int)a2->field_8 == 2 || (unsigned int)a0 == 2 && (int)a2->field_8 == 1))
        {
            v16 = a2->field_1c;
            if (!_strcmp(v16, "pkcs1"))
            {
                v17 = 0;
            }
            else if (!_strcmp(v16, "none"))
            {
                v17 = 1;
            }
            else if (!_strcmp(v16, "oaep"))
            {
                v17 = 2;
            }
            else if (!_strcmp(v16, "oeap"))
            {
                v17 = 3;
            }
            else if (!_strcmp(v16, "x931"))
            {
                v17 = 4;
            }
            else if (_strcmp(v16, "pss"))
            {
                if (_strcmp(v16, 0))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/ctrl_params_translate.c", 1356, "fix_rsa_padding_mode");
                    v1 = a0;
                    v2 = a2->field_1c;
                    v0 = (int)a2->field_8;
                    sub_a36abc(4, 118, "[action:%d, state:%d] padding name %s");
                    *(unsigned int *)&(a2->padding_10)[1] = (unsigned int)0xfffffffe;
                    a2->field_1c = 0;
                    return (unsigned long long)v9;
                }
                v17 = 6;
            }
            else
            {
                v17 = 5;
            }
            if ((unsigned int)a0 != 2)
            {
                *(int *)&(a2->padding_10)[1] = *(int *)((char *)&g_e929e8.field_0 + 0x10 * v17);
                a2->field_1c = 0;
                return (unsigned long long)v9;
            }
            *(int *)&a2->field_30->field_0 = *(int *)((char *)&g_e929e8.field_0 + 0x10 * v17);
            a2->field_1c = 0;
            return (unsigned long long)v9;
        }
    }
    return (unsigned long long)v9;
}
