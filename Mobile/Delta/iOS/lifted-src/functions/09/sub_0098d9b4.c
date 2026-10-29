/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98d9b4..0x98db68 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98d9b4_0 {
    char padding_0[680];
    struct st_98d9b4_1 *field_2a8;
} st_98d9b4_0;

typedef struct st_98d9b4_1 {
    char field_0;
} st_98d9b4_1;

typedef struct st_98d9b4_2 {
    struct st_98d9b4_0 *field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[8];
    char field_28;
    char padding_29[7];
    unsigned int field_30;
    char field_34;
    char padding_35[3];
    unsigned long long field_38;
    char field_40;
    char padding_41[55];
    char field_78;
} st_98d9b4_2;


char sub_98d9b4(st_98d9b4_2 *a0)
{
    char v6;  // x20
    unsigned long v7;  // x21
    char v16;  // x9
    char v18;  // x8
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long v22;  // cc_ndep
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4110
    st_98d9b4_0 *v8;  // x8
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4110
    unsigned long long *v9;  // x22
    char v10;  // x10
    char v11;  // x9
    char v12;  // x11
    unsigned long long v13;  // x23
    char v14;  // x0
    unsigned long long *v15;  // x10
    unsigned long v0;  // [bp-0x60]
    char v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = 0;
    if (!(a0->field_78 & 1))
        return 0;
    if (sub_c68eb8(&a0->field_40, &v3))
    {
        v6 = v3;
        if (!v6)
        {
            a0->field_18 = a0->field_18;
            sub_a6eaf8(&a0->field_40);
            a0->field_78 = a0->field_78 & 254;
            a0->field_38 = 0;
            return 1;
        }
        if (!(a0->field_34 >> 1 & 1))
        {
            v7 = a0->field_38;
            v8 = a0->field_0;
            v9 = &v8->padding_0[32 * a0->field_30 + 552];
            v10 = *(long long *)&a0->field_28;
            v11 = v10 + 1;
            v12 = v9[3];
            if (v11 > v12)
            {
                if (!v12)
                    v13 = 8;
                else
                    v13 = v12 * 2;
                v14 = sub_a6c1b4();
                if (v14)
                {
                    v9[2] = v14;
                    v9[3] = v13;
                    v10 = *(long long *)&a0->field_28;
                    v11 = *(long long *)&a0->field_28 + 1;
                    v8 = a0->field_0;
LABEL_98da78:
                    v15 = v14 + v10 * 16;
                    *v15 = v7;
                    v15[1] = v6;
                    *(unsigned long long *)&a0->field_28 = v11;
                    a0->field_10 = a0->field_10 + v6;
                    v16 = v3;
                    if (!v8->field_2a8)
                    {
                        a0->field_18 = a0->field_18 + v16;
                        sub_a6eaf8(&a0->field_40);
                        a0->field_78 = a0->field_78 & 254;
                        a0->field_38 = 0;
                        return 1;
                    }
                    else if (!v16)
                    {
                        a0->field_18 = a0->field_18 + v16;
                        sub_a6eaf8(&a0->field_40);
                        a0->field_78 = a0->field_78 & 254;
                        a0->field_38 = 0;
                        return 1;
                    }
                    else if (v16 >= 0)
                    {
                        v0 = a0->field_38;
                        v1 = v16;
                        if (sub_98ec18(&v0, &v2, 0))
                        {
                            v18 = v2;
                            if ((v18 & 0xfffffffffffffff8) != 8)
                            {
                                v23 = arm64g_calculate_condition(v19 | 16, v20, v21, v22);
                                v24 = arm64g_calculate_condition(20, (v23 & 1 ? v18 : 0x40000000), (v23 & 1 ? 6 : 0), 0);
                                if (!(v24 & 1))
                                    goto LABEL_98dada;
LABEL_98dad9:
                            }
                            else
                            {
                                v25 = arm64g_calculate_condition(v19 | 16, v20, v21, v22);
                                v26 = arm64g_calculate_condition(16, (v25 & 1 ? v18 : 0x40000000), (v25 & 1 ? 6 : 0), 0);
                                if (v26 & 1)
                                    goto LABEL_98dad9;
LABEL_98dada:
                            }
                            a0->field_0->field_2a8();
                        }
                    }
                }
            }
            else
            {
                v14 = v9[2];
                goto LABEL_98da78;
            }
        }
    }
    sub_a6ed4c(&a0->field_40);
    a0->field_78 = a0->field_78 & 254;
    a0->field_38 = 0;
    return 0;
}
