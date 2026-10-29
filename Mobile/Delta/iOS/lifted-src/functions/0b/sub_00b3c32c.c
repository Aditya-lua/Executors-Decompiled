/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3c32c..0xb3c49c (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3c32c_0 {
    char padding_0[8];
    struct st_b3c32c_0 *field_8;
    struct st_b3c32c_0 *field_10;
    struct st_b3c32c_0 *field_18;
} st_b3c32c_0;


st_b3c32c_0 * sub_b3c32c(st_b3c32c_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b3c32c_0 *v12;  // x0
    st_b3c32c_0 *v13;  // x0
    st_b3c32c_0 *v14;  // x0
    st_b3c32c_0 *v15;  // x0
    st_b3c32c_0 **v16;  // x19
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = sub_a6fbc4(a1, "group");
    if (v12)
    {
        if ((int)a0->field_10 && (int)a0->field_10 != 1)
            goto LABEL_b3c398;
        if ((int)v12->field_8 == 4 && !sub_a6e200(v12->field_10))
            goto LABEL_b3c3cc;
LABEL_b3c398:
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/ecx_kmgmt.c", 588, "ecx_gen_set_params");
        sub_a36abc(57, 0x80106, 0);
LABEL_b3c488:
        v14 = 0;
    }
    else
    {
LABEL_b3c3cc:
        v13 = sub_a6fbc4(a1, "properties");
        if (v13)
        {
            if ((int)v13->field_8 != 4)
                goto LABEL_b3c488;
            sub_a6c2e4(a0->field_8, "providers/implementations/keymgmt/ecx_kmgmt.c", 596);
            v14 = sub_a6d9b4(v13->field_10, "providers/implementations/keymgmt/ecx_kmgmt.c", 597);
            a0->field_8 = v14;
            if (v14)
                goto LABEL_b3c424;
        }
        else
        {
LABEL_b3c424:
            v15 = sub_a6fbc4(a1, "dhkem-ikm");
            if (v15 && v15->field_18 && v15->field_10)
            {
                v16 = &a0->field_18;
                sub_a6c2e4(a0->field_18, "providers/implementations/keymgmt/ecx_kmgmt.c", 604);
                *v16 = 0;
                v14 = sub_a71440(v15, v16, 0, v16 + 1);
                if (!(unsigned int)v14)
                    return v14;
            }
            v14 = 1;
        }
    }
    return v14;
}
