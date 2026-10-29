/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54e48..0xa54fa4 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54e48_0 {
    char padding_0[96];
    struct st_a54e48_0 *field_60;
    struct st_a54e48_0 *field_68;
    char padding_70[136];
    struct st_a54e48_0 *field_f8;
} st_a54e48_0;

extern long long g_a54750;

st_a54e48_0 * sub_a54e48(st_a54e48_0 **a0, st_a54e48_0 *a1, unsigned long long a2)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    st_a54e48_0 *v22;  // x0
    st_a54e48_0 *v23;  // x21
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_ndep
    st_a54e48_0 *v26;  // x20
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    st_a54e48_0 *v31;  // x0
    unsigned long long v14;  // x22
    st_a54e48_0 *v32;  // x8
    unsigned long v33;  // cc_dep1
    st_a54e48_0 *v34;  // x22
    unsigned long long v35;  // 4104
    unsigned long long v36;  // 4104
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    st_a54e48_0 **v19;  // x19
    st_a54e48_0 *v20;  // x20
    st_a54e48_0 *v21;  // x22
    st_a54e48_0 *v0;  // [bp-0x58]
    st_a54e48_0 *v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (!a1)
    {
        return 0;
    }
    else if (a1->field_68)
    {
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = v15;
        v7 = v16;
        v8 = v17;
        v9 = &v11;
        v10 = v18;
        v19 = a0;
        v20 = a0[12];
        v21 = a0[13];
        v22 = a1->field_60;
        v23 = v22;
        if (!v20 || !(v24 = 4, v25 = 0, v23 = v20, v26 = v20, v23 != v22))
        {
            v26 = v23;
            if (v26->field_f8)
            {
                v27 = arm64g_calculate_condition(v24 | 16, v20, v22, v25);
                v28 = arm64g_calculate_condition(4, (v27 & 1 ? v21 : 0), 0, 0);
                if (v28 & 1)
                    goto LABEL_a54f00;
LABEL_a54e9c:
            }
            else
            {
                v29 = arm64g_calculate_condition(v24 | 16, v20, v22, v25);
                v30 = arm64g_calculate_condition(0, (v29 & 1 ? v21 : 0), 0, 0);
                if (!(v30 & 1))
                    goto LABEL_a54e9c;
LABEL_a54f00:
                v34 = sub_a55c40(v26, a1->field_68);
                v32 = v34;
                if (!v32)
                    return v34;
                goto LABEL_a54f18;
            }
        }
        if (sub_a558b4(v26, sub_c4ba8()))
        {
            v0 = v26;
            v1 = v21;
            v2 = a2;
            v31 = sub_a55c1c(a1->field_60, a1->field_68, a2, &g_a54750, &v0);
            v32 = v1;
            v33 = v21;
            if (!v21)
            {
                v34 = v32;
                v35 = arm64g_calculate_condition(4, v33, 0, 0);
                if (!(v35 & 1))
                    goto LABEL_a54eea;
LABEL_a54ee9:
            }
            else
            {
                v34 = v21;
                v36 = arm64g_calculate_condition(4, v33, 0, 0);
                if (v36 & 1)
                    goto LABEL_a54ee9;
LABEL_a54eea:
                v32 = 0;
            }
            if (!(unsigned int)v31)
                return v31;
LABEL_a54f18:
            if (v19[12] || sub_a5a074(v19, v26))
            {
                v19[13] = v34;
                sub_a54814(v19);
                return 1;
            }
            sub_a55970(v26, v32);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/keymgmt_lib.c", 487, "evp_keymgmt_util_copy");
            sub_a36abc(6, 101, 0);
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
