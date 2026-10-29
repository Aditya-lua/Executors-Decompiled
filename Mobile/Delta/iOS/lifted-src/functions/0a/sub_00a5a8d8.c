/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5a8d8..0xa5ab14 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5a8d8_0 {
    struct st_a5a8d8_0 *field_0;
    struct st_a5a8d8_0 *field_4;
    struct st_a5a8d8_0 *field_8;
    struct st_a5a8d8_0 *field_10;
    struct st_a5a8d8_0 *field_18;
    struct st_a5a8d8_0 *field_20;
    char padding_28[56];
    struct st_a5a8d8_0 *field_60;
    struct st_a5a8d8_0 *field_68;
} st_a5a8d8_0;


st_a5a8d8_0 * sub_a5a8d8(st_a5a8d8_0 *a0, st_a5a8d8_0 *a1, unsigned long long a2, st_a5a8d8_0 *a3, long long a4, st_a5a8d8_0 *a5)
{
    st_a5a8d8_0 *v3;  // x25
    unsigned long long v4;  // 4110
    st_a5a8d8_0 *v13;  // x0
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    st_a5a8d8_0 **v8;  // x26
    st_a5a8d8_0 *v9;  // x0
    st_a5a8d8_0 *v10;  // x23
    long long v11;  // x1
    st_a5a8d8_0 *v12;  // w8
    st_a5a8d8_0 *v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    if (!a1)
        v3 = &v0;
    else
        v3 = 0;
    if (!(unsigned int)a2)
    {
        v4 = arm64g_calculate_condition(4, a1, 0, 0);
        v5 = arm64g_calculate_condition(4, (v4 & 1 ? a1 : 0), 0, 0);
        if (!(v5 & 1))
            goto LABEL_a5a928;
    }
    else
    {
        v6 = arm64g_calculate_condition(4, a1, 0, 0);
        v7 = arm64g_calculate_condition(0, (v6 & 1 ? a1 : 0), 0, 0);
        if (!(v7 & 1))
        {
LABEL_a5a928:
            if (a5)
            {
                sub_c67ee0();
                return 0;
            }
        }
    }
    if (a0)
    {
        if (a0->field_18 || a0->field_60)
        {
            sub_a54a84(a0);
            sub_a5bd20(a0);
            v8 = &a0->padding_28[48];
            if (*(long long *)&a0->padding_28[48])
            {
                sub_a55970(*(long long *)&a0->padding_28[48], a0->field_60);
                sub_a55830(*(long long *)&a0->padding_28[48]);
                *v8 = 0;
                v8[1] = 0;
            }
            *(unsigned int *)&a0->field_0 = 0;
        }
        else if ((int)a0->field_0 && *(int *)((char *)&a0->field_0 + 4) == (unsigned int)a2 && a0->field_4)
        {
            return 1;
        }
        sub_a32e7c(a0->field_8);
        a0->field_8 = 0;
        sub_a32e7c(a0->field_10);
        a0->field_10 = 0;
    }
    if (a3)
    {
        v9 = sub_9c5edc(v3, a3, a4);
        goto LABEL_a5a9b4;
    }
    else if ((unsigned int)a2)
    {
        v9 = sub_9c5df4(v3, a2);
LABEL_a5a9b4:
        v10 = v9;
        if (!a0 && !a1)
            goto LABEL_a5a9c0;
    }
    else
    {
        v10 = 0;
        if (!a0 && !a1)
        {
LABEL_a5a9c0:
            sub_a32e7c(v0);
        }
    }
    if (!a5 && !v10)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 1612, "pkey_set_type");
        v11 = 156;
    }
    else
    {
        if (!a0)
            return 1;
        if (!a5)
        {
            *(unsigned long long *)&a0->padding_28[48] = 0;
            *(unsigned int *)&a0->field_0 = a2;
            *(unsigned int *)((char *)&a0->field_0 + 4) = a2;
            a0->field_4 = v10;
            if (v10)
                goto LABEL_a5aa24;
LABEL_a5aa50:
            v12 = 0xffffffff;
            goto LABEL_a5aa54;
        }
        else if (sub_a2d050(a5))
        {
            *(st_a5a8d8_0 **)&a0->padding_28[48] = a5;
            *(unsigned int *)&a0->field_0 = a2;
            *(unsigned int *)((char *)&a0->field_0 + 4) = a2;
            if (!v10)
                goto LABEL_a5aa50;
LABEL_a5aa24:
            if ((unsigned int)a2)
                goto LABEL_a5aa58;
            v12 = (st_a5a8d8_0 *)(int)v10->field_0;
LABEL_a5aa54:
            *(unsigned int *)&a0->field_0 = (unsigned int)v12;
LABEL_a5aa58:
            v13 = v0;
            if (!a1)
            {
                a0->field_8 = v13;
                return 1;
            }
            else if (v13)
            {
                if (sub_a32d54())
                {
                    a0->field_8 = v0;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("crypto/evp/p_lib.c", 1652, "pkey_set_type");
                v11 = 134;
            }
            else
            {
                a0->field_8 = v13;
                return 1;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/p_lib.c", 1618, "pkey_set_type");
            v11 = 786691;
        }
    }
    sub_a36abc(6, v11, 0);
    return 0;
}
