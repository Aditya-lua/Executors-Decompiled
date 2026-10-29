/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb39248..0xb393bc (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b39248_0 {
    struct st_b39248_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_b39248_0 *field_10;
    struct st_b39248_0 *field_14;
    char padding_1c[32];
    unsigned int field_3c;
    char padding_40[48];
    unsigned int field_70;
} st_b39248_0;


st_b39248_0 * sub_b39248(st_b39248_0 *a0, st_b39248_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_b39248_0 *v17;  // x0
    st_b39248_0 *v18;  // w0
    st_b39248_0 *v19;  // w0
    st_b39248_0 *v20;  // w0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b39248_0 *v12;  // x0
    unsigned long v13;  // x20
    unsigned int v14;  // w0
    unsigned long long v15;  // 4112
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        if (a1 && a1->field_0)
        {
            v0 = v7;
            v1 = v8;
            v2 = v9;
            v3 = v10;
            v4 = &v6;
            v5 = v11;
            v12 = sub_a6fbc4(a1, "type");
            if (v12)
            {
                if (v12->field_8 == 4)
                {
                    v13 = *(int *)&a0->padding_40[44];
                    if (_strcmp(v12->field_10, "default"))
                    {
                        v14 = sub_a3f310(v12->field_10, v13);
                        v15 = arm64g_calculate_condition(0x11, v14, 1, 0);
                        if (!(v15 & 1))
                            goto LABEL_b392c4;
                    }
                    else
                    {
                        v14 = (unsigned int)v13 == 0x1000;
                    }
                    *(unsigned int *)&a0->padding_1c[28] = v14;
                }
                else
                {
LABEL_b392c4:
                    sub_a368c8();
                    sub_a369bc("providers/implementations/keymgmt/dh_kmgmt.c", 540, "dh_gen_common_set_params");
                    sub_a36abc(57, 0x80106, 0);
                    return 0;
                }
            }
            v17 = sub_a6fbc4(a1, "group");
            if (v17 && (v17->field_8 != 4 || !v17->field_10 || !sub_a6047c(v17->field_10) || !(v18 = (st_b39248_0 *)(unsigned int)sub_a60850(), *(unsigned int *)((char *)&a0->field_10 + 4) = (unsigned int)v18, v18)))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/dh_kmgmt.c", 554, "dh_gen_common_set_params");
                sub_a36abc(57, 0x80106, 0);
                return 0;
            }
            if (sub_a6fbc4(a1, "pbits"))
            {
                v19 = (st_b39248_0 *)(unsigned int)sub_a70ef8();
                if (!v19)
                    return v19;
            }
            if (!sub_a6fbc4(a1, "priv_len"))
                return 1;
            v20 = (st_b39248_0 *)(unsigned int)sub_a6fc2c();
            if (!v20)
                return v20;
            return 1;
        }
        a0 = 1;
    }
    return (unsigned int)a0;
}
