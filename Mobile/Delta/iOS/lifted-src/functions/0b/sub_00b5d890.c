/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d890..0xb5dc14 (900 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5d890_0 {
    char padding_0[8];
    struct st_b5d890_1 *field_8;
} st_b5d890_0;

typedef struct st_b5d890_4 {
    char padding_0[155];
    struct st_b5d890_0 *field_9b;
} st_b5d890_4;

typedef struct st_b5d890_2 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    long long field_20;
    char padding_28[44];
    char field_54;
    char field_55;
    char padding_56[127];
    char field_d5;
    char padding_d6[26];
    struct st_b5d890_0 *field_f0;
} st_b5d890_2;

typedef struct st_b5d890_3 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[12];
    long long field_18;
} st_b5d890_3;

typedef struct st_b5d890_1 {
    unsigned long long field_0;
} st_b5d890_1;


unsigned long long sub_b5d890(st_b5d890_2 *a0, st_b5d890_3 *a1)
{
    st_b5d890_4 *v2;  // x21
    st_b5d890_3 *v3;  // x19
    unsigned int v4;  // w0
    unsigned long long v5;  // x0
    unsigned long long v6;  // 4113
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4113
    long long v9;  // x19
    long long v10;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1->field_0)
        return 1;
    v2 = &a0->field_55;
    do
    {
        v3 = a1;
        v4 = sub_a722b0();
        if ((int)v4 > 40)
        {
            if ((int)v4 > 52)
            {
                if (v4 == 75)
                {
                    if (!*(int *)&a0->padding_28[40])
                        return 0;
                    if ((unsigned long long)v3->field_18 >= (unsigned long long)a0->field_10)
                    {
                        if (sub_a715c0(v3, v2) || sub_a71800(v3, v2, a0->field_10))
                            continue;
                        v9 = 104;
                        v10 = 203;
                        goto LABEL_b5dbc8;
                    }
                    else
                    {
                        v9 = 109;
                        v10 = 198;
                        goto LABEL_b5dbc8;
                    }
                }
                else if (v4 != 54)
                {
                    if (v4 != 53 || sub_a70efc(v3, a0->field_10))
                        continue;
                    v9 = 104;
                    v10 = 159;
                    goto LABEL_b5dbc8;
                }
                else
                {
                    if (sub_a70efc(v3, a0->field_8))
                        continue;
                    v9 = 104;
                    v10 = 166;
                    goto LABEL_b5dbc8;
                }
            }
            else
            {
                if (v4 != 41)
                {
                    if (v4 != 52)
                        continue;
                    if (!*(int *)&a0->padding_28[40])
                        return 0;
                    if ((unsigned long long)v3->field_18 >= (unsigned long long)a0->field_10)
                    {
                        if (sub_a715c0(v3, v2) || sub_a71800(v3, v2, a0->field_10))
                            continue;
                        v9 = 104;
                        v10 = 189;
                        goto LABEL_b5dbc8;
                    }
                    else
                    {
                        v9 = 109;
                        v10 = 184;
                        goto LABEL_b5dbc8;
                    }
                }
                else
                {
                    if (!*(long long *)&v3->padding_c[4])
                    {
                        return 0;
                    }
                    else if (v3->field_8 == 5 && !(~a0->field_54 & 20))
                    {
                        a0->field_f0->field_8();
                    }
                    goto LABEL_b5dbf4;
                }
            }
        }
        if (37 >= (int)v4)
        {
            if (v4 == 35)
            {
                v5 = sub_a70210(v3, __ROL__(a0->field_54, 29) & 3758096385 & 1);
                if (!(unsigned int)v5)
                    return v5;
            }
            else
            {
                if (v4 != 37)
                    continue;
                v6 = arm64g_calculate_condition(50, v3->field_18 - 0x11, 16, 0);
                if (!(v6 & 1) && a0->field_54 & 1 && !(v7 = arm64g_calculate_condition(2, a0->field_18, 1, 0), v7 & 1))
                {
                    if (sub_a715c0(v3, &a0->field_d5))
                        continue;
                    v9 = 104;
                    v10 = 225;
                    goto LABEL_b5dbc8;
                }
                else
                {
                    v9 = 110;
                    v10 = 0xdd;
                    goto LABEL_b5dbc8;
                }
            }
            goto LABEL_b5dbc8;
        }
        switch (v4)
        {
        case 38:
            v8 = arm64g_calculate_condition(2, a0->field_18, 1, 0);
            if (!sub_a70efc())
            {
                v9 = 104;
                v10 = 175;
LABEL_b5dbc8:
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/ciphercommon_gcm.c", v10, "ossl_gcm_get_ctx_params");
                sub_a36abc(57, v9, 0);
LABEL_b5dbf4:
                return 0;
            }
            break;
        default:
            if (v4 != 40 || sub_a70efc(v3, a0->field_20))
                continue;
            v9 = 104;
            v10 = 210;
            goto LABEL_b5dbc8;
        }
    } while ((a1 = &v3[1].field_8, *(long long *)&v3[1].field_8));
    return 1;
}
