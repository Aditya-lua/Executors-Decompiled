/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59d8c..0xa5a05c (720 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a59d8c_0 {
    struct st_a59d8c_0 *field_0;
    struct st_a59d8c_0 *field_8;
    char padding_10[80];
    struct st_a59d8c_0 *field_60;
    char padding_68[24];
    struct st_a59d8c_0 *field_80;
    struct st_a59d8c_0 *field_88;
    struct st_a59d8c_0 *field_90;
} st_a59d8c_0;


st_a59d8c_0 * sub_a59d8c(st_a59d8c_0 **a0, st_a59d8c_0 *a1)
{
    st_a59d8c_0 *v4;  // x20
    st_a59d8c_0 *v5;  // w8
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long long v18;  // x0
    st_a59d8c_0 *v20;  // w0
    st_a59d8c_0 *v21;  // x8
    st_a59d8c_0 *v22;  // x19
    st_a59d8c_0 *v23;  // x0
    st_a59d8c_0 *v24;  // x0
    long long v7;  // x1
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long v12;  // x2
    st_a59d8c_0 *v13;  // x1
    st_a59d8c_0 *v0;  // [bp-0x30]
    st_a59d8c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1;
    v1 = 0;
    v5 = (st_a59d8c_0 *)*(int *)a0;
    if (*(int *)a0)
    {
        if (a0[12])
            goto LABEL_a59e20;
        if (v4->field_60)
        {
            if (!sub_c678c0(&v1, v4))
            {
                sub_a5a4c8(v1);
                return 0;
            }
            v4 = v1;
            v5 = (st_a59d8c_0 *)*(int *)a0;
            if (!*(int *)a0)
                goto LABEL_a59e18;
        }
        if (a0[12])
            goto LABEL_a59e20;
        if (v5 != (int)v4->field_0)
        {
            sub_a368c8();
            v7 = 175;
            goto LABEL_a59dec;
        }
    }
    else
    {
LABEL_a59e18:
        if (a0[12])
        {
LABEL_a59e20:
            if (!v4)
                goto LABEL_a59e88;
        }
        else
        {
            v12 = (int)v4->field_0;
            v13 = v4->field_60;
            if ((unsigned int)v12)
            {
                v14 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
                v15 = arm64g_calculate_condition(4, (v14 & 1 ? v13 : 0), 0, 0);
                if (v15 & 1)
                    goto LABEL_a59f58;
                goto LABEL_a59f4c;
            }
            else
            {
                v16 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
                v17 = arm64g_calculate_condition(0, (v16 & 1 ? v13 : 0), 0, 0);
                if (!(v17 & 1))
                {
LABEL_a59f4c:
                    if (!sub_a5a074(a0, v13, v12))
                    {
                        sub_a5a4c8(v1);
                        return 0;
                    }
                }
                else
                {
LABEL_a59f58:
                    if (!sub_a5a8d8(a0, 0, v12, 0, 0xffffffff, 0))
                    {
                        sub_a5a4c8(v1);
                        return 0;
                    }
                }
            }
        }
    }
    if (v4->field_60)
    {
        v18 = !sub_a54c94(v4, 4);
        if ((unsigned int)v18)
        {
            sub_a368c8(v18);
            sub_a369bc("crypto/evp/p_lib.c", 182, "EVP_PKEY_copy_parameters");
            sub_a36abc(6, 103, 0);
            sub_a5a4c8(v1);
            return 0;
        }
    }
    else if (v4->field_8 && v4->field_8->field_80)
    {
        v4->field_8->field_80();
    }
LABEL_a59e88:
    if (!a0[12])
    {
        if (a0[1] && a0[1]->field_80)
            a0[1]->field_80();
        goto LABEL_a59ef0;
    }
    v20 = (st_a59d8c_0 *)(unsigned int)sub_a54c94(a0, 4);
    v21 = a0[12];
    if (v20)
    {
        if (v21)
            goto LABEL_a59fa0;
LABEL_a59ef0:
        if (!v4->field_60)
        {
            if (*(int *)a0 == (int)v4->field_0 && a0[1] && a0[1]->field_90)
                a0[1]->field_90();
            goto LABEL_a59fb8;
        }
LABEL_a59fa0:
        if (sub_c67b5c(a0, v4, 4) == 1)
        {
            sub_a5a4c8(v1);
            return 1;
        }
LABEL_a59fb8:
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 190, "EVP_PKEY_copy_parameters");
        sub_a36abc(6, 0x99, 0);
        sub_a5a4c8(v1);
        return 0;
    }
    if (v21)
    {
        if (v4->field_60)
        {
            v22 = sub_a54e48(a0, v4, 4);
            sub_a5a4c8(v1);
            return v22;
        }
        if (a0[13])
            goto LABEL_a59f7c;
        v0 = v21;
        v23 = sub_a5a1f8(v4, 0, &v0, 0);
        if (v23)
        {
            v24 = sub_a55c40(a0[12], v23, 4);
            a0[13] = v24;
            sub_a5a4c8(v1);
            return v24 != 0;
        }
        sub_a368c8();
        v7 = 218;
    }
    else
    {
LABEL_a59f7c:
        if (!v4->field_8)
        {
            sub_a5a4c8(v1);
            return 0;
        }
        else if (v4->field_8->field_88)
        {
            v4->field_8->field_88();
        }
        else
        {
            sub_a5a4c8(v1);
            return 0;
        }
    }
LABEL_a59dec:
    sub_a369bc("crypto/evp/p_lib.c", v7, "EVP_PKEY_copy_parameters");
    sub_a36abc(6, 101, 0);
    sub_a5a4c8(v1);
    return 0;
}
