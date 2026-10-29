/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97d854..0x97dc3c (1000 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97d854_2 {
    char padding_0[184];
    unsigned int field_b8;
} st_97d854_2;

typedef struct st_97d854_1 {
    char padding_0[88];
    long long field_58;
    char padding_60[24];
    long long field_78;
    char padding_80[32];
    long long field_a0;
    char padding_a8[16];
    char field_b8;
    char padding_b9[111];
    char field_128;
    char padding_129[39];
    unsigned short field_150;
    char padding_152[38];
    unsigned int field_178;
} st_97d854_1;

typedef struct st_97d854_3 {
    struct st_97d854_0 *field_0;
    char padding_8[16];
    struct st_97d854_1 *field_18;
    struct st_97d854_2 *field_20;
    unsigned int field_28;
} st_97d854_3;

typedef struct st_97d854_0 {
    char padding_0[96];
    long long field_60;
} st_97d854_0;

extern long long g_97fd74;

long long sub_97d854(st_97d854_3 *a0)
{
    unsigned int v3;  // x20
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long v5;  // x21
    unsigned int v16;  // x21
    unsigned long v17;  // x8
    unsigned int v19;  // w0
    unsigned int v20;  // w8
    unsigned int v6;  // x0
    unsigned int v21;  // w0
    long long v7;  // x0
    unsigned long long v8;  // 4110
    unsigned int v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (unsigned int)a0->field_18;
    if (sub_977384(*(long long *)(v3 + 160)))
        return 1;
    if (!((unsigned short)(*(short *)(v3 + 336)) >> 5 & 1) && !sub_977368(*(long long *)(v3 + 160)))
    {
        if (!((unsigned short)(*(short *)(v3 + 336)) >> 1 & 1 ^ (unsigned short)(*(short *)(v3 + 336)) >> 2 & 1))
        {
            v5 = a0->field_0->field_60;
            v6 = sub_97725c(v5);
            v7 = sub_975fec(v5);
            if (v6)
            {
                v8 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
                v9 = arm64g_calculate_condition(20, (v8 & 1 ? v7 : 0x40000000), 0, 0);
                if (v9 & 1)
                    goto LABEL_97d944;
                goto LABEL_97d904;
            }
            v14 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
            v15 = arm64g_calculate_condition(16, (v14 & 1 ? v7 : 0x40000000), 0, 0);
            if (!(v15 & 1))
            {
LABEL_97d904:
            }
            else
            {
LABEL_97d944:
                if (!(*(short *)(v3 + 336) & 1) && sub_981378(v5) && !sub_717b8(v3 + 184))
                {
                    if ((int)sub_9d46fc(v7, 93, 0, v3 + 184) > 0)
                        sub_9771bc(*(long long *)(v3 + 160), v3 + 184);
                    else
                        sub_9d353c(v3 + 184);
                }
                if (*(short *)(v3 + 336) & 1 || !sub_981378(v5) || sub_717b8(v3 + 184))
                {
                    v16 = (unsigned int)a0->field_18;
                    v17 = *(short *)(v16 + 336);
                    if (!(v17 & 1))
                    {
                        if (sub_9771bc(*(long long *)(v16 + 160), v16 + 184))
                        {
                            if (sub_978518(*(long long *)(v16 + 160)))
                            {
                                v17 = *(short *)(v16 + 336);
                                if (!(v17 >> 3 & 1))
                                    goto LABEL_97da00;
                                if (sub_989ea4(v16 + 296, *(long long *)(v16 + 160)))
                                {
                                    v17 = *(short *)(v16 + 336);
                                    goto LABEL_97da00;
                                }
                            }
                            else
                            {
                                sub_9796e0(*(long long *)(v16 + 160));
                            }
                        }
LABEL_97dbc0:
                        sub_97c738();
LABEL_97d93c:
                        return -0x1;
                    }
                    else
                    {
LABEL_97da00:
                        *(unsigned short *)(v16 + 336) = (unsigned short)v17 | 1;
                        if (sub_977384(*(long long *)(v3 + 160)))
                            return 1;
                        if (!sub_980e14(a0->field_0))
                        {
                            sub_97d424(a0);
                            if (sub_977384(*(long long *)(v3 + 160)))
                            {
                                return 1;
                            }
                            else if (sub_977368(*(long long *)(v3 + 160)))
                            {
                                sub_97c738(a0);
                                return 0;
                            }
                            else if (sub_980df4(v3))
                            {
                                sub_97b8f0(*(long long *)(v3 + 88), 1);
                            }
                        }
                        if (sub_980e14(a0->field_0))
                        {
                            v0 = v3;
                            v19 = sub_97d380(a0, &g_97fd74, &v0);
                            if (!sub_97e438(v3, 1))
                            {
                                sub_97c738(a0);
                                return 0;
                            }
                            if ((int)v19 > 0)
                            {
                                v20 = sub_962858(*(long long *)(v3 + 120));
                                if (8 < v20)
                                    return 1;
                                if (!(1 << ((char)v20 & 31) & 400))
                                    return 1;
                                v21 = sub_9625a4(*(long long *)(v3 + 120), 0);
                                if (*(int *)&a0[1].padding_8[0])
                                {
                                    if (a0->field_28)
                                        goto LABEL_97db84;
                                    goto LABEL_97daa4;
                                }
                                goto LABEL_97d93c;
                            }
                        }
                        else
                        {
                            if (8 >= sub_962858(*(long long *)(v3 + 120)) && 1 << ((char)sub_962858(*(long long *)(v3 + 120)) & 31) & 400)
                            {
                                v21 = sub_9625a4(*(long long *)(v3 + 120), 0);
                                if (*(int *)&a0[1].padding_8[0])
                                {
                                    if (a0->field_28)
                                    {
LABEL_97db84:
                                        if (!a0->field_20)
                                            return -0x1;
                                        a0->field_20->field_b8 = v21;
                                        return -0x1;
                                    }
LABEL_97daa4:
                                    if (!a0->field_18)
                                        return -0x1;
                                    a0->field_18->field_178 = v21;
                                    return -0x1;
                                }
                            }
                            else if (*(int *)&a0[1].padding_8[0])
                            {
                                if (a0->field_28)
                                {
                                    if (!a0->field_20)
                                        return -0x1;
                                    a0->field_20->field_b8 = 2;
                                    return -0x1;
                                }
                                else
                                {
                                    if (a0->field_18)
                                    {
                                        a0->field_18->field_178 = 2;
                                        return -0x1;
                                    }
                                }
                            }
                            goto LABEL_97d93c;
                        }
                    }
                }
            }
        }
        goto LABEL_97dbc0;
    }
    sub_97c738(a0);
    return 0;
}
