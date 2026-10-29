/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf65fc..0xaf71a4 (2984 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af65fc_1 {
    char padding_0[32];
    struct st_af65fc_0 *field_20;
    char padding_28[16];
    struct st_af65fc_2 *field_38;
    char padding_40[16];
    struct st_af65fc_2 *field_50;
    char padding_58[64];
    long long field_98;
    char padding_a0[12];
    unsigned int field_ac;
    char padding_b0[8];
    unsigned int field_b8;
} st_af65fc_1;

typedef struct st_af65fc_0 {
    char padding_0[24];
    char field_18;
    char padding_19[11];
    unsigned int field_24;
    char padding_28[4];
    unsigned int field_2c;
} st_af65fc_0;

typedef struct st_af65fc_2 {
    unsigned long long field_0;
} st_af65fc_2;


unsigned long long sub_af65fc(st_af65fc_1 *a0)
{
    unsigned long long v4;  // x0
    unsigned int v5;  // w20
    unsigned long long v14;  // 4112
    unsigned int v15;  // x0
    unsigned long long v16;  // 4110
    unsigned long v17;  // x8
    unsigned int v18;  // w0
    unsigned int v19;  // w0
    unsigned long long v20;  // 4110
    unsigned long v21;  // x8
    unsigned long v22;  // x8
    unsigned long long v23;  // 4110
    unsigned int v6;  // w26
    unsigned int v25;  // w8
    unsigned int v26;  // w8
    unsigned int v27;  // w0
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long v31;  // cc_ndep
    unsigned long long v32;  // 4112
    unsigned long long v33;  // 4102
    unsigned long long v7;  // x21
    unsigned long long v34;  // 4112
    unsigned long long v35;  // 4102
    unsigned int v8;  // w23
    unsigned int v36;  // x21
    unsigned int v37;  // x22
    unsigned int v38;  // x0
    unsigned int v39;  // w8
    unsigned int v40;  // w0
    unsigned int v41;  // w25
    unsigned int v9;  // x22
    unsigned long long v42;  // x0
    unsigned int v10;  // x27
    unsigned int v11;  // w28
    unsigned int v12;  // x24
    unsigned int v13;  // w0
    char v0;  // [bp-0x68]
    unsigned int v1;  // [bp-0x64]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_af5e90();
    if ((int)v4 < 1)
        return v4;
    v5 = sub_ad69e4(a0->field_98);
    if (*(long long *)&a0[1].padding_0[28])
    {
        v6 = 1;
        v7 = 6;
        if (1 <= (int)v5)
            goto LABEL_af6670;
    }
    else
    {
        v7 = *(int *)&a0->field_20->padding_19[7];
        v6 = !(a0->field_20->field_18 & 64);
        if ((int)v5 >= 1)
        {
LABEL_af6670:
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v11 = 0xffffffff;
            do
            {
                v12 = sub_ad69f8(a0->field_98, v9);
                if (!(a0->field_20->field_18 >> 4 & 1) && (char)(*(char *)(v12 + 233)) >> 1 & 1)
                {
                    *(unsigned long long *)&a0->field_b8 = v12;
                    a0->field_ac = v9;
                    *(unsigned int *)&a0->padding_b0[0] = 0x22;
                    a0->field_38();
                }
                if (v6 && (char)(*(char *)(v12 + 233)) >> 2 & 1)
                {
                    *(unsigned long long *)&a0->field_b8 = v12;
                    a0->field_ac = v9;
                    *(unsigned int *)&a0->padding_b0[0] = 40;
                    a0->field_38();
                }
                v13 = sub_aeb2f8(v12);
                if (v11)
                {
                    v14 = arm64g_calculate_condition(0x11, v11, 1, 0);
                    if (!(v14 & 1))
                    {
                        if (!(a0->field_20->field_18 >> 5 & 1) || 2 > v13)
                            goto LABEL_af67b8;
                    }
                    else
                    {
                        if (v13 && ((int)(v9 + 1) >= (int)v5 && !(a0->field_20->field_18 >> 5 & 1) || v13 == 1))
                            goto LABEL_af67b8;
                    }
                    a0->field_ac = v9;
                    if (!v12)
                        v12 = sub_ad69f8(a0->field_98, v9);
                    *(unsigned long long *)&a0->field_b8 = v12;
                    *(unsigned int *)&a0->padding_b0[0] = 79;
                    a0->field_38();
                }
                else
                {
                    if (v13)
                    {
                        a0->field_ac = v9;
                        if (!v12)
                            v12 = sub_ad69f8(a0->field_98, v9);
                        *(unsigned long long *)&a0->field_b8 = v12;
                        *(unsigned int *)&a0->padding_b0[0] = 37;
                        a0->field_38();
                    }
LABEL_af67b8:
                    if (v5 != 1)
                    {
                        v15 = sub_af1e94(v12);
                        if (!v15)
                        {
LABEL_af682c:
                            a0->field_ac = v9;
                            if (!v12)
                                v12 = sub_ad69f8(a0->field_98, v9);
                            *(unsigned long long *)&a0->field_b8 = v12;
                            *(unsigned int *)&a0->padding_b0[0] = 1;
                            a0->field_38();
                        }
                        if (sub_9c7b68() == 408)
                        {
                            if (sub_a5c03c(v15, "decoded-from-explicit", &v0) != 1)
                                goto LABEL_af682c;
                            if (v0)
                            {
                                a0->field_ac = v9;
                                if (!v12)
                                    v12 = sub_ad69f8(a0->field_98, v9);
                                *(unsigned long long *)&a0->field_b8 = v12;
                                *(unsigned int *)&a0->padding_b0[0] = 94;
                                a0->field_38();
                            }
                        }
                        if (!(a0->field_20->field_18 >> 5 & 1))
                            goto LABEL_af6b38;
                        v16 = arm64g_calculate_condition(2, *(long long *)(v12 + 216), 1, 0);
                        if (!(v16 & 1))
                        {
                            if (!((char)(*(char *)(v12 + 232)) >> 4 & 1))
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 80;
                                a0->field_38();
                            }
                            else if (!((char)(*(char *)(v12 + 236)) >> 2 & 1))
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 81;
                                a0->field_38();
                            }
                        }
                        v17 = *(int *)(v12 + 232);
                        if (((unsigned int)v17 & 65553) == 0x11)
                        {
                            *(unsigned long long *)&a0->field_b8 = v12;
                            a0->field_ac = v9;
                            *(unsigned int *)&a0->padding_b0[0] = 89;
                            a0->field_38();
                        }
                        if (!(v17 >> 4 & 1))
                        {
                            if (!((char)(*(char *)(v12 + 236)) >> 2 & 1))
                                goto LABEL_af6950;
                            *(unsigned long long *)&a0->field_b8 = v12;
                            a0->field_ac = v9;
                            v25 = 82;
                        }
                        else if (!(v17 >> 1 & 1))
                        {
                            *(unsigned long long *)&a0->field_b8 = v12;
                            a0->field_ac = v9;
                            v25 = 92;
                        }
                        else
                        {
LABEL_af6950:
                            if (!sub_af8d44(sub_97725c(v12)))
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 83;
                                a0->field_38();
                            }
                            if (((char)(*(char *)(v12 + 232)) >> 4 & 1 || (char)(*(char *)(v12 + 236)) >> 1 & 1 || !*(long long *)(v12 + 280)) && !sub_af8d44(sub_ab1c50(v12)))
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 84;
                                a0->field_38();
                            }
                            if (!sub_af8d44(sub_ab1c50(v12)) && *(long long *)(v12 + 280) && !((char)(*(char *)(v12 + 234)) >> 3 & 1))
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 88;
                                a0->field_38();
                            }
                            if (*(long long *)(v12 + 280) && 0 >= (int)sub_ad69e4(*(long long *)(v12 + 280)))
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 87;
                                a0->field_38();
                            }
                            if (sub_9cf86c(v12 + 0x88, v12 + 32))
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 78;
                                a0->field_38();
                            }
                            if (*(long long *)(v12 + 0x100) && (char)(*(char *)(v12 + 234)) >> 1 & 1)
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 90;
                                a0->field_38();
                            }
                            if (*(long long *)(v12 + 248) && (char)(*(char *)(v12 + 234)) >> 2 & 1)
                            {
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                *(unsigned int *)&a0->padding_b0[0] = 91;
                                a0->field_38();
                            }
                            if (sub_af3ae0(v12) >= 2)
                            {
                                if ((int)v5 > (int)(v9 + 1) && (!*(long long *)(v12 + 0x100) || !*(long long *)*(long long *)(v12 + 0x100)))
                                {
                                    *(unsigned long long *)&a0->field_b8 = v12;
                                    a0->field_ac = v9;
                                    *(unsigned int *)&a0->padding_b0[0] = 0x55;
                                    a0->field_38();
                                }
                                if (!((char)(*(char *)(v12 + 232)) >> 4 & 1) || *(long long *)(v12 + 248))
                                    goto LABEL_af6b38;
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                v26 = 86;
                            }
                            else
                            {
                                if ((int)sub_ad69e4(sub_a0212c(v12)) < 1)
                                    goto LABEL_af6b38;
                                *(unsigned long long *)&a0->field_b8 = v12;
                                a0->field_ac = v9;
                                v26 = 93;
                            }
                            *(unsigned int *)&a0->padding_b0[0] = v26;
                            a0->field_38();
                        }
                        *(unsigned int *)&a0->padding_b0[0] = v25;
                        a0->field_38();
                    }
                    else
                    {
LABEL_af6b38:
                        if ((int)v7 >= 1)
                        {
                            if ((int)v9 >= *(int *)&a0->padding_58[60] && *(int *)&a0->field_20->padding_19[7] == (unsigned int)v7)
                            {
                                v18 = sub_af3da0(v12, a0->field_20->field_24, 4);
                                if (v18 == 1)
                                    goto LABEL_af6be0;
                                if (v18 == 2)
                                    goto LABEL_af6ba8;
                            }
                            v19 = sub_aea738(v12, v7, (int)v11 > 0);
                            if (v19 && (v19 == 1 || !(a0->field_20->field_18 >> 5 & 1)))
                                goto LABEL_af6be0;
LABEL_af6ba8:
                            a0->field_ac = v9;
                            if (!v12)
                                v12 = sub_ad69f8(a0->field_98, v9);
                            *(unsigned long long *)&a0->field_b8 = v12;
                            *(unsigned int *)&a0->padding_b0[0] = 26;
                            a0->field_38();
                        }
                        else
                        {
LABEL_af6be0:
                            if (v9 >= 2)
                            {
                                v20 = arm64g_calculate_condition(2, *(long long *)(v12 + 216), 1, 0);
                                if (!(v20 & 1) && v10 > *(long long *)(v12 + 216) + v8)
                                {
                                    *(unsigned long long *)&a0->field_b8 = v12;
                                    a0->field_ac = v9;
                                    *(unsigned int *)&a0->padding_b0[0] = 25;
                                    a0->field_38();
                                }
                                goto LABEL_af6c28;
                            }
                            else if (v9)
                            {
LABEL_af6c28:
                                v21 = *(int *)(v12 + 232);
                                v10 += 1 & ~((unsigned int)v21 >> 5);
                                if (v21 >> 10 & 1)
                                    goto LABEL_af6c38;
                                goto LABEL_af6688;
                            }
                            else if (!((unsigned int)(*(int *)(v12 + 232)) >> 10 & 1))
                            {
LABEL_af6688:
                                v11 = 1;
                                continue;
                            }
                            else
                            {
LABEL_af6c38:
                                v22 = *(long long *)(v12 + 224);
                                v23 = arm64g_calculate_condition(2, v22, 1, 0);
                                if (!(v23 & 1))
                                {
                                    if (v8 > (long long)v22)
                                    {
                                        *(unsigned long long *)&a0->field_b8 = v12;
                                        a0->field_ac = v9;
                                        *(unsigned int *)&a0->padding_b0[0] = 38;
                                        a0->field_38();
                                    }
                                    v8 = v22;
                                }
                                v11 = 0;
                                v8 += 1;
                            }
                        }
                    }
                }
            } while ((v9 += 1, v5 != v9));
        }
    }
    v27 = sub_ad69e4(a0->field_98);
    if (1 <= (int)a0->field_20->field_2c)
    {
        v32 = arm64g_calculate_condition(v28 | 160, v29, v30, v31);
        v33 = arm64g_calculate_condition(163, (v32 & 1 ? v27 : 0x80000000), v32 & 1, 0);
        if (v33 & 1)
            goto LABEL_af6d68;
    }
    else
    {
        v34 = arm64g_calculate_condition(v28 | 160, v29, v30, v31);
        v35 = arm64g_calculate_condition(160, (v34 & 1 ? v27 : 0x80000000), v34 & 1, 0);
        if (v35 & 1)
        {
LABEL_af6d68:
            v36 = 0;
            do
            {
                v37 = sub_ad69f8(a0->field_98, v36);
                if (v36 && (v38 = sub_af1e94(v37), v39 = a0->field_20->field_2c, (int)v39 >= 1))
                {
                    if (sub_af1e94(v37))
                    {
                        if (v39 >= 5)
                            v39 = 5;
                        v40 = sub_a59d18();
                        if (*(int *)(4 * v39 + 14671044) <= (int)v40)
                            goto LABEL_af6e40;
                    }
                    a0->field_ac = v36;
                    if (!v37)
                        v37 = sub_ad69f8(a0->field_98, v36);
                    *(unsigned long long *)&a0->field_b8 = v37;
                    *(unsigned int *)&a0->padding_b0[0] = 67;
                    a0->field_38();
                }
                else
                {
LABEL_af6e40:
                    if ((int)(v27 - 1) <= (int)v36 || !(v1 = 0xffffffff, v41 = a0->field_20->field_2c, (int)v41 > 0))
                        continue;
                    if (!sub_af3b48(v37, 0, 0, &v1, 0))
                    {
LABEL_af6d8c:
                        a0->field_ac = v36;
                        if (!v37)
                            v37 = sub_ad69f8(a0->field_98, v36);
                        *(unsigned long long *)&a0->field_b8 = v37;
                        *(unsigned int *)&a0->padding_b0[0] = 0x44;
                        a0->field_38();
                    }
                    else
                    {
                        if (v41 >= 5)
                            v41 = 5;
                        if ((int)v1 < *(int *)(4 * v41 + 14671044))
                            goto LABEL_af6d8c;
                    }
                }
            } while ((v36 += 1, v27 != v36));
        }
    }
    v42 = sub_af74ac(a0);
    if (!(unsigned int)v42)
    {
        return v42;
    }
    else if (sub_af4e7c(0, a0->field_98))
    {
        a0->field_50();
    }
    else
    {
        return 0xffffffff;
    }
}
