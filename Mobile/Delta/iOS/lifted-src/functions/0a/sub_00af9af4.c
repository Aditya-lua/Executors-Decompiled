/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf9af4..0xafa0dc (1512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af9af4_2 {
    char padding_0[232];
    unsigned long long field_e8;
    struct st_af9af4_0 *field_f0;
} st_af9af4_2;

typedef struct st_af9af4_0 {
    struct st_af9af4_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_af9af4_0 *field_8;
    struct st_af9af4_0 *field_c;
    struct st_af9af4_0 *field_10;
    struct st_af9af4_0 *field_18;
    struct st_af9af4_0 *field_1c;
    char padding_24[20];
    long long field_38;
    char padding_40[68];
    struct st_af9af4_0 *field_84;
    struct st_af9af4_0 *field_88;
    struct st_af9af4_0 *field_8c;
    struct st_af9af4_0 *field_90;
    struct st_af9af4_0 *field_94;
    struct st_af9af4_0 *field_98;
    unsigned int field_9c;
    struct st_af9af4_0 *field_a0;
    struct st_af9af4_0 *field_a8;
    struct st_af9af4_0 *field_b0;
    char field_b8;
    char padding_b9[23];
    struct st_af9af4_0 *field_d0;
    struct st_af9af4_0 *field_d8;
    char padding_e0[8];
    unsigned long long field_e8;
    struct st_af9af4_0 *field_f0;
} st_af9af4_0;

typedef struct st_af9af4_1 {
    char padding_0[32];
    unsigned long long field_20;
    struct st_af9af4_0 *field_28;
    unsigned int field_30;
} st_af9af4_1;

extern st_af9af4_0 *g_f09cf8;

st_af9af4_0 * sub_af9af4(st_af9af4_0 *a0, st_af9af4_0 **a1, unsigned long a2, st_af9af4_2 *a3)
{
    st_af9af4_0 *v4;  // x19
    st_af9af4_0 *v5;  // x0
    unsigned long long v14;  // 4109
    st_af9af4_0 *v15;  // x9
    st_af9af4_0 *v16;  // w10
    st_af9af4_0 *v17;  // x9
    unsigned int v18;  // w8
    long long v19;  // x0
    st_af9af4_0 *v20;  // w0
    unsigned long long v21;  // 4118
    st_af9af4_0 *v22;  // x0
    unsigned long long v23;  // 4118
    st_af9af4_0 *v6;  // x20
    st_af9af4_0 *v24;  // x0
    unsigned long long v25;  // 4118
    st_af9af4_0 *v26;  // x0
    unsigned long long v27;  // 4118
    long long v28;  // x20
    st_af9af4_0 *v29;  // x21
    st_af9af4_0 *v30;  // x1
    long long v31;  // x0
    long long v32;  // w22
    long long v33;  // x20
    st_af9af4_0 *v7;  // w9
    st_af9af4_0 *v34;  // x21
    st_af9af4_0 *v35;  // x25
    st_af9af4_1 *v36;  // x22
    st_af9af4_0 *v37;  // x23
    unsigned long long v38;  // 4118
    st_af9af4_0 *v39;  // x0
    st_af9af4_0 *v40;  // x0
    unsigned long long v41;  // 4118
    unsigned long v42;  // x22
    unsigned long v43;  // x1
    st_af9af4_0 *v8;  // w8
    long long v44;  // x0
    st_af9af4_0 *v45;  // x20
    st_af9af4_0 *v46;  // x0
    st_af9af4_0 *iter;  // w9
    st_af9af4_0 *v10;  // w10
    unsigned long v11;  // cc_dep1
    st_af9af4_0 *v12;  // w8
    unsigned long long v13;  // 4109
    char v0;  // [bp-0x58], Other Possible Types: unsigned int
    st_af9af4_0 *v1;  // [bp-0x54]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a1;
    if (a0 > 3)
    {
        switch (a0)
        {
        case 15:
            if (v4)
            {
                v45 = a3->field_f0;
                v4->field_b0 = a3->field_e8;
                sub_a6c2e4(*(long long *)&v4->field_b8, "crypto/x509/x_crl.c", 533);
                *(unsigned long long *)&v4->field_b8 = 0;
                if (v45)
                {
                    v46 = sub_a6d9b4(v45, "crypto/x509/x_crl.c", 536);
                    *(st_af9af4_0 **)&v4->field_b8 = v46;
                    return v46 != 0;
                }
            }
            else
            {
                return 1;
            }
        case 5:
            if (!sub_af93bc(v4, sub_a5609c(), &v4->field_90, 0))
                *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 0x100000;
            v5 = sub_af26e0(v4, 770, &v0, 0);
            *(st_af9af4_0 **)&v4->padding_40[56] = v5;
            if (v5)
            {
                v6 = v5;
                v7 = (st_af9af4_0 *)*(int *)&v4->padding_40[64];
                v8 = v7 | 1;
                *(unsigned int *)&v4->padding_40[64] = (unsigned int)v8;
                if (*(int *)&v5->field_1 >= 1)
                {
                    v8 = v7 | 5;
                    *(unsigned int *)&v4->padding_40[64] = (unsigned int)v8;
                    iter = (st_af9af4_0 *)1;
                }
                else
                {
                    iter = (st_af9af4_0 *)0;
                }
                if (*(int *)&v6->padding_2[3] >= 1)
                {
                    iter = (char *)&iter->field_0 + 1;
                    v8 |= 8;
                    *(unsigned int *)&v4->padding_40[64] = (unsigned int)v8;
                }
                v10 = (st_af9af4_0 *)*(int *)((char *)&v6->field_c + 4);
                v11 = v10;
                if (0 < v10)
                {
                    v12 = v8 | 16;
                    v13 = arm64g_calculate_condition(211, v11, 0, 0);
                    if (!(v13 & 1))
                        goto LABEL_af9d26;
LABEL_af9d25:
                }
                else
                {
                    v12 = v8;
                    v14 = arm64g_calculate_condition(211, v11, 0, 0);
                    if (v14 & 1)
                        goto LABEL_af9d25;
LABEL_af9d26:
                    iter = (char *)&iter->field_0 + 1;
                }
                if (1 < iter)
                    v12 |= 2;
                if (0 < v10 || iter >= 2)
                    *(unsigned int *)&v4->padding_40[64] = (unsigned int)v12;
                if ((int)v6->field_c >= 1)
                {
                    v12 |= 32;
                    *(unsigned int *)&v4->padding_40[64] = (unsigned int)v12;
                }
                v15 = v6->field_8;
                if (v15)
                {
                    *(unsigned int *)&v4->padding_40[64] = v12 | 64;
                    v16 = (st_af9af4_0 *)(int)v15->field_0;
                    if (v16 > 0)
                    {
                        v17 = *(long long *)&v15->field_1;
                        v18 = (char)v17->field_0;
                        *(unsigned int *)&(v4->padding_40)[1] = v18;
                        if (v16 != 1)
                            v18 |= *((char *)&v17->field_0 + 1) * 0x100;
                    }
                    else
                    {
                        v18 = *(int *)&(v4->padding_40)[1];
                    }
                    *(unsigned int *)&(v4->padding_40)[1] = v18 & 32895;
                }
                v19 = sub_9ffdd0(v4);
                v20 = (st_af9af4_0 *)(unsigned int)sub_ae65f0(v6->field_0, v19);
                if (*(int *)&v4->padding_40[64] == 1 && !v6->field_0)
                    *(unsigned int *)&v4->padding_40[64] = 3;
                if (!v20)
                    goto LABEL_af9de0;
            }
            else
            {
                v21 = arm64g_calculate_condition(0x11, v0, 1, 0);
                if (v21 & 1)
                {
LABEL_af9de0:
                    *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 128;
                }
            }
            v22 = sub_af26e0(v4, 90, &v0, 0);
            *(st_af9af4_0 **)&v4->padding_40[48] = v22;
            if (!v22)
            {
                v23 = arm64g_calculate_condition(1, v0, 1, 0);
                if (!(v23 & 1))
                    *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 128;
            }
            v24 = sub_af26e0(v4, 88, &v0, 0);
            v4->field_84 = v24;
            if (!v24)
            {
                v25 = arm64g_calculate_condition(1, v0, 1, 0);
                if (!(v25 & 1))
                    *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 128;
            }
            v26 = sub_af26e0(v4, 140, &v0, 0);
            v4->field_88 = v26;
            if (!v26 && !(v27 = arm64g_calculate_condition(1, v0, 1, 0), v27 & 1) || v26 && !v4->field_84)
                *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 128;
            v28 = *(long long *)&v4->padding_24[0];
            if ((int)sub_ad69e4(v28) >= 1)
            {
                v29 = 0;
                do
                {
                    v30 = v29;
                    v31 = sub_ad69f8(v28, v30);
                    v32 = (unsigned int)sub_a99eac(sub_a2d030(v31, v30));
                    if (v32 == 857)
                        *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 0x1000;
                    if (sub_af4068(v31) && v32 != 90 && v32 != 140 && v32 != 770)
                    {
                        *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 0x200;
                        break;
                    }
                } while ((v29 = (unsigned int)v29 + 1, (int)sub_ad69e4(v28) > (int)(unsigned int)v29));
            }
            v33 = sub_97725c(v4);
            if ((int)sub_ad69e4(v33) >= 1)
            {
                v34 = 0;
                v35 = 0;
                do
                {
                    v36 = sub_ad69f8(v33, v34);
                    v37 = sub_a9b424(v36, 0x303, &v1, 0);
                    if (!v37 && (v38 = arm64g_calculate_condition(0x11, (unsigned long long)v1, 1, 0), v38 & 1))
                    {
LABEL_afa07c:
                        *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 128;
                        break;
                    }
                    if (v37)
                    {
                        v39 = v4->field_8c;
                        if (v39 || (v39 = sub_ad61b4(NULL), v4->field_8c = v39, v39))
                        {
                            if (sub_ad68a0(v39, v37))
                            {
                                v35 = v37;
                                goto LABEL_af9fcc;
                            }
                        }
                        sub_ae75d4(v37);
                        return 0;
                    }
                    else
                    {
LABEL_af9fcc:
                        v36->field_28 = v35;
                        v40 = sub_a9b424(v36, 141, &v1, 0);
                        if (!v40 && (v41 = arm64g_calculate_condition(0x11, (unsigned long long)v1, 1, 0), v41 & 1))
                            goto LABEL_afa07c;
                    }
                    if (v40)
                    {
                        v36->field_30 = sub_9c1cd0();
                        sub_9cf0f4(v40);
                    }
                    else
                    {
                        v36->field_30 = 0xffffffff;
                    }
                    v42 = v36->field_20;
                    v1 = (st_af9af4_0 *)0;
                    if (1 <= (int)sub_ad69e4(v42))
                    {
                        do
                        {
                            v43 = v1;
                            v44 = sub_ad69f8(v42, v43);
                            if (sub_af4068(v44, v43) && sub_a99eac(sub_a2d030(v44)) != 0x303)
                            {
                                *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 0x200;
                                break;
                            }
                        } while ((v1 = (char *)&v1->field_0 + 1, (int)sub_ad69e4(v42) > v1));
                    }
                    v34 = (unsigned int)v34 + 1;
                } while ((int)sub_ad69e4(v33) > (int)(unsigned int)v34);
            }
            if (*(long long *)(*(long long *)&v4->field_9c + 8))
                (*(long long *)(*(long long *)&v4->field_9c + 8))();
            *(unsigned int *)&v4->padding_40[44] = *(int *)&v4->padding_40[44] | 0x100;
            break;
        case 4:
            if (*(long long *)(*(long long *)&v4->field_9c + 16))
                (*(long long *)(*(long long *)&v4->field_9c + 16))();
            sub_ae2638(*(long long *)&v4->padding_40[48]);
            sub_ae61a4(*(long long *)&v4->padding_40[56]);
            sub_9cf124(v4->field_84);
            sub_9cf124(v4->field_88);
            sub_ad6958(v4->field_8c, sub_ae75d4);
            goto LABEL_af9bfc;
        default:
            return 1;
        }
    }
    else
    {
        switch (a0)
        {
        case 1:
LABEL_af9bfc:
            *(unsigned long long *)&v4->padding_40[52] = 0;
            *(unsigned long long *)&v4->padding_40[44] = 0;
            *(unsigned long long *)&v4->padding_40[60] = 0;
            *(unsigned int *)&(v4->padding_40)[1] = 32895;
            *(st_af9af4_0 **)&v4->field_9c = g_f09cf8;
            v4->field_a0 = 0;
            memset(&v4->field_84, 0, 24);
            break;
        case 3:
            if (*(long long *)&v4->field_9c && *(long long *)(*(long long *)&v4->field_9c + 16))
                (*(long long *)(*(long long *)&v4->field_9c + 16))();
            sub_ae2638(*(long long *)&v4->padding_40[48]);
            sub_ae61a4(*(long long *)&v4->padding_40[56]);
            sub_9cf124(v4->field_84);
            sub_9cf124(v4->field_88);
            sub_ad6958(v4->field_8c, sub_ae75d4);
            sub_a6c2e4(*(long long *)&v4->field_b8, "crypto/x509/x_crl.c", 269);
            break;
        default:
            return 1;
        }
    }
    return 1;
}
