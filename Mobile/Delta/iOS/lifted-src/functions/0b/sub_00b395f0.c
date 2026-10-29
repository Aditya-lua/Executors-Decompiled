/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb395f0..0xb39874 (644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b395f0_0 {
    struct st_b395f0_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
    char padding_20[28];
    unsigned int field_3c;
    char padding_40[8];
    struct st_b395f0_0 *field_48;
    struct st_b395f0_0 *field_50;
} st_b395f0_0;

typedef struct st_b395f0_1 {
    char padding_0[8];
    unsigned int field_8;
} st_b395f0_1;

extern st_b395f0_1 g_ee6168;
extern st_b395f0_1 g_ee6178;
extern st_b395f0_1 g_ee6188;

st_b395f0_0 * sub_b395f0(st_b395f0_0 *a0, st_b395f0_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_b395f0_0 *v17;  // x0
    st_b395f0_0 *v18;  // x0
    st_b395f0_0 *v19;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b395f0_0 *v12;  // x0
    long long v13;  // x21
    st_b395f0_1 *v14;  // x8
    unsigned long long v15;  // 4118
    st_b395f0_0 *v16;  // x0
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
    if (a1 && a1->field_0)
    {
        v12 = sub_a6fbc4(a1, "type");
        if (v12)
        {
            if (v12->field_8 == 4)
            {
                v13 = v12->field_10;
                if (!sub_a6e200("default", v13))
                {
                    v14 = &g_ee6168.padding_0[0];
                }
                else if (sub_a6e200("fips186_4", v13))
                {
                    if (sub_a6e200("fips186_2", v13))
                        goto LABEL_b39830;
                    v14 = &g_ee6188.padding_0[0];
                }
                else
                {
                    v14 = &g_ee6178.padding_0[0];
                }
                v15 = arm64g_calculate_condition(1, v14->field_8, 1, 0);
                if (!(v15 & 1))
                {
                    a0->field_3c = v14->field_8;
                    goto LABEL_b396a8;
                }
            }
LABEL_b39830:
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/dsa_kmgmt.c", 482, "dsa_gen_set_params");
            sub_a36abc(57, 0x80106, 0);
            goto LABEL_b39860;
        }
LABEL_b396a8:
        if ((!sub_a6fbc4(a1, "gindex") || (v16 = sub_a6fc2c(), (unsigned int)v16)) && (!sub_a6fbc4(a1, "pcounter") || (v16 = sub_a6fc2c(), (unsigned int)v16)) && (!sub_a6fbc4(a1, "hindex") || !(v16 = sub_a6fc2c(), !(unsigned int)v16)))
        {
            v17 = sub_a6fbc4(a1, "seed");
            if (v17)
            {
                if (v17->field_8 != 5)
                    goto LABEL_b39860;
                v16 = sub_b3a1a4(a0, v17->field_10, v17->field_18);
                if ((unsigned int)v16)
                    goto LABEL_b39738;
            }
            else
            {
LABEL_b39738:
                if ((!sub_a6fbc4(a1, "pbits") || (v16 = sub_a70ef8(), (unsigned int)v16)) && (!sub_a6fbc4(a1, "qbits") || !(v16 = sub_a70ef8(), !(unsigned int)v16)))
                {
                    v18 = sub_a6fbc4(a1, "digest");
                    if (v18)
                    {
                        if (v18->field_8 != 4)
                            goto LABEL_b39860;
                        sub_a6c2e4(a0->field_48, "providers/implementations/keymgmt/dsa_kmgmt.c", 521);
                        v16 = sub_a6d9b4(v18->field_10, "providers/implementations/keymgmt/dsa_kmgmt.c", 522);
                        a0->field_48 = v16;
                        if (v16)
                            goto LABEL_b397d0;
                    }
                    else
                    {
LABEL_b397d0:
                        v19 = sub_a6fbc4(a1, "properties");
                        if (!v19)
                            goto LABEL_b39828;
                        if (v19->field_8 == 4)
                        {
                            sub_a6c2e4(a0->field_50, "providers/implementations/keymgmt/dsa_kmgmt.c", 530);
                            v16 = sub_a6d9b4(v19->field_10, "providers/implementations/keymgmt/dsa_kmgmt.c", 531);
                            a0->field_50 = v16;
                            if (v16)
                                goto LABEL_b39828;
                        }
                        else
                        {
LABEL_b39860:
                            v16 = 0;
                        }
                    }
                }
            }
        }
    }
    else
    {
LABEL_b39828:
        v16 = 1;
    }
    return v16;
}
