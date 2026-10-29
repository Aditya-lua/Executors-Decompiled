/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54cb0..0xa54e48 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54cb0_0 {
    char padding_0[96];
    struct st_a54cb0_0 *field_60;
    struct st_a54cb0_0 *field_68;
    char padding_70[80];
    struct st_a54cb0_0 *field_c0;
} st_a54cb0_0;


st_a54cb0_0 * sub_a54cb0(st_a54cb0_0 *a0, st_a54cb0_0 *a1, long long a2)
{
    st_a54cb0_0 *v2;  // x20
    st_a54cb0_0 *v3;  // x19
    unsigned long v12;  // cc_dep1
    unsigned long long v13;  // 4105
    unsigned long long v14;  // 4105
    st_a54cb0_0 *v4;  // x22
    st_a54cb0_0 *v5;  // x21
    st_a54cb0_0 *v6;  // x0
    unsigned long v7;  // cc_dep1
    st_a54cb0_0 *v8;  // w8
    unsigned long long v9;  // 4105
    unsigned long long v10;  // 4105
    st_a54cb0_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !a1)
        return !a0 && !a1;
    v2 = a0->field_60;
    v3 = a0->field_68;
    v4 = a1->field_60;
    v5 = a1->field_68;
    if (v2 != v4)
    {
        if (v2 && v4)
        {
            a1 = a1;
            if (!sub_a558b4(v2, sub_c4ba8(v4)))
            {
                sub_a368c8(a0, a1, a2);
                sub_a369bc("crypto/evp/keymgmt_lib.c", 384, "evp_keymgmt_util_match");
                sub_a36abc(6, 101, 0);
                return 0xffffffff;
            }
        }
        else if (!v4)
        {
            goto LABEL_a54d78;
        }
        if (!v4->field_c0)
        {
LABEL_a54d78:
            v8 = (st_a54cb0_0 *)1;
            if (v2)
                goto LABEL_a54d80;
            goto LABEL_a54de0;
        }
        else if (v3)
        {
            v6 = sub_c67654();
            v7 = v6;
            v8 = (st_a54cb0_0 *)(!v6);
            if (!v6)
            {
                v2 = v2;
                v9 = arm64g_calculate_condition(4, v7, 0, 0);
                if (!(v9 & 1))
                    goto LABEL_a54dda;
LABEL_a54dd9:
            }
            else
            {
                v2 = v4;
                v10 = arm64g_calculate_condition(4, v7, 0, 0);
                if (v10 & 1)
                    goto LABEL_a54dd9;
LABEL_a54dda:
                v3 = v6;
            }
            if (v2)
            {
LABEL_a54d80:
                if (v8 && v2->field_c0)
                {
                    if (!v5)
                        goto LABEL_a54df0;
                    v11 = sub_c67654(a1, v2);
                    v12 = v11;
                    if (!v11)
                    {
                        v4 = v4;
                        v13 = arm64g_calculate_condition(4, v12, 0, 0);
                        if (!(v13 & 1))
                            goto LABEL_a54dae;
LABEL_a54dad:
                    }
                    else
                    {
                        v4 = v2;
                        v14 = arm64g_calculate_condition(4, v12, 0, 0);
                        if (v14 & 1)
                            goto LABEL_a54dad;
LABEL_a54dae:
                        v5 = v11;
                    }
                }
            }
LABEL_a54de0:
            if (v2 != v4)
                return 0xfffffffe;
        }
    }
LABEL_a54df0:
    if (!v3 && !v5)
    {
        return 1;
    }
    else if (!v3)
    {
        return 0;
    }
    else if (!v5)
    {
        return 0;
    }
    return !a0 && !a1;
}
