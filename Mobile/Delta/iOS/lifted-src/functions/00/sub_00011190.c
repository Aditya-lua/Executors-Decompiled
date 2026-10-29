/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x11190..0x1184c (1724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_11190_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_11190_1;

typedef struct st_11190_7 {
    char padding_0[7];
    struct st_11190_3 *field_7;
} st_11190_7;

typedef struct st_11190_2 {
    unsigned long long field_0;
    char field_1;
    char padding_2[6];
    struct st_11190_3 *field_8;
    char field_c;
} st_11190_2;

typedef struct st_11190_6 {
    unsigned long long field_0;
    struct st_11190_3 *field_8;
    unsigned long long field_10;
    struct st_11190_3 *field_18;
} st_11190_6;

typedef struct st_11190_5 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[32];
    unsigned long long field_30;
    unsigned long long field_38;
} st_11190_5;

typedef struct st_11190_3 {
    struct st_11190_1 *field_0;
} st_11190_3;

typedef struct st_11190_4 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    long long field_20;
    char padding_28[32];
    unsigned long long field_48;
    long long field_50;
} st_11190_4;

typedef struct st_11190_0 {
    char field_0;
} st_11190_0;

extern unsigned long long g_e628d0;
extern unsigned long long g_e629e0;

long long sub_11190(void* a0, st_11190_2 *a1, st_11190_2 *a2, st_11190_2 *a3, unsigned long long a4)
{
    unsigned long v20;  // x8
    st_11190_2 *v21;  // x24
    st_11190_2 *v30;  // x0
    long long v31;  // x0
    long long v32;  // x0
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4102
    unsigned long long v35;  // 4112
    unsigned long long v36;  // 4102
    long long v37;  // x0
    long long v38;  // x0
    long long v39;  // x0
    unsigned long long v40;  // x0
    unsigned long long v41;  // x0
    st_11190_6 *v42;  // x8
    st_11190_2 *v23;  // x1
    long long v24;  // x25
    unsigned int v25;  // w8
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // x22
    long long v28;  // x0
    long long v29;  // x0
    unsigned long long v0;  // [bp-0x120]
    unsigned long long v1;  // [bp-0x118]
    unsigned long v2;  // [bp-0x110]
    st_11190_0 **v3;  // [bp-0x100], Other Possible Types: char
    st_11190_0 *v4;  // [bp-0xf8]
    unsigned long v5;  // [bp-0xf0]
    st_11190_3 **v6;  // [bp-0xe8], Other Possible Types: st_11190_0 *, long long, unsigned long
    uint128_t v7;  // [bp-0xd0]
    st_11190_1 *v8;  // [bp-0xb8]
    long long v9;  // [bp-0xb0]
    st_11190_2 *v10;  // [bp-0xa8], Other Possible Types: st_11190_7 *
    st_11190_5 *v11;  // [bp-0xa0]
    long long v12;  // [bp-0x98]
    st_11190_2 *iter;  // [bp-0x90], Other Possible Types: st_11190_7 *
    st_11190_4 *v14;  // [bp-0x88]
    long long v15;  // [bp-0x80]
    st_11190_2 *node;  // [bp-0x78], Other Possible Types: st_11190_7 *
    st_11190_0 **v17;  // [bp-0x70], Other Possible Types: st_11190_3 **, char
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v4 = &v3;
    v3 = &v4;
    v14 = a0 + 1016;
    v15 = (long long)a0[0x400] - (long long)a0[1016] >> 3;
    node = 0;
    v11 = a0 + 1040;
    v12 = (long long)a0[1048] - (long long)a0[1040] >> 3;
    iter = 0;
    v8 = a0 + 1088;
    v9 = (long long)a0[1096] - (long long)a0[1088] >> 3;
    v10 = 0;
    if ((int)a0[128] == 60)
    {
        v20 = (long long)a0[132];
        v21 = a0 + 132;
        if (a2)
            a2->field_0 = v20;
        v1 = v42;
        v2 = v20;
        v0 = a4;
        sub_f8d0(a0);
        v7 = *(int128_t *)&v21->field_0;
        v23 = 0;
        sub_1f174(a0, 0);
        v24 = v6;
        v25 = (int)a0[128];
        v26 = v25;
        switch (v25)
        {
        case 262:
            v27 = (long long)a0[132];
            sub_f8d0(a0);
            if (a1)
            {
                if ((int)a0[128] != 61)
                    goto LABEL_11438;
                sub_f8d0(a0);
                if (sub_19920(a0 + 96))
                {
                    v28 = sub_223d4(a0);
                    v5 = sub_6878(sub_404c((long long)a0[216], 48), &v7, v24, v28);
                    if ((char)a0[88] == 1)
                    {
                        v29 = sub_404c((long long)a0[216], 20);
                        sub_84bc(v29, v27, (long long)a0[132]);
                        v6 = v5;
                        sub_1c9f0(a0 + 1184, &v6);
                        *(long long *)(sub_12484(a0 + 1184, &v6) + 8) = v29;
                    }
                    v6 = &v17;
                    v17 = &v6;
                    sub_103a8(v11, &v5);
                }
                else
                {
                    v30 = sub_f234(a0);
                    if (v30)
                        sub_1db64(a0, &v30->padding_2[3], "Expected type pack after '=', got type");
                    v5 = sub_6878(sub_404c((long long)a0[216], 48), &v7, v24, v23);
                    if ((char)a0[88] == 1)
                    {
                        v31 = sub_404c((long long)a0[216], 20);
                        sub_84bc(v31, v27, (long long)a0[132]);
                        v6 = v5;
                        sub_1c9f0(a0 + 1184, &v6);
                        *(long long *)(sub_12484(a0 + 1184, &v6) + 8) = v31;
                    }
                    v6 = &v17;
                    v17 = &v6;
                    sub_103a8(v11, &v5);
                }
                iter = (char *)&iter->field_0 + 1;
                if ((int)a0[128] == 44)
                    goto LABEL_115a0;
                break;
            }
            else
            {
LABEL_11438:
                v5 = sub_6878(sub_404c((long long)a0[216], 48), &v7, v24, 0);
                if ((char)a0[88] == 1)
                {
                    v32 = sub_404c((long long)a0[216], 20);
                    sub_84bc(v32, v27, -0x1);
                    v6 = v5;
                    sub_1c9f0(a0 + 1184, &v6);
                    *(long long *)(sub_12484(a0 + 1184, &v6) + 8) = v32;
                }
                v6 = &v17;
                v17 = &v6;
                sub_103a8(v11, &v5);
                iter = (char *)&iter->field_0 + 1;
                if ((int)a0[128] == 44)
                    goto LABEL_115a0;
                break;
            }
        case 61:
            v33 = arm64g_calculate_condition(3, v26, 262, 0);
            v34 = arm64g_calculate_condition(19, (v33 & 1 ? (unsigned long long)a1 : 0x40000000), 0, 0);
            if (v34 & 1)
                goto LABEL_114ec;
            goto LABEL_112b8;
        default:
            v35 = arm64g_calculate_condition(3, v26, 262, 0);
            v36 = arm64g_calculate_condition(16, (v35 & 1 ? (unsigned long long)a1 : 0x40000000), 0, 0);
            if (!(v36 & 1))
            {
LABEL_112b8:
                v5 = sub_7448(sub_404c((long long)a0[216], 48), &v7, v24, 0);
                if ((char)a0[88] == 1)
                {
                    v37 = sub_404c((long long)a0[216], 12);
                    sub_8690(v37, -0x1);
                    v6 = v5;
                    sub_1c9f0(a0 + 1184, &v6);
                    *(long long *)(sub_12484(a0 + 1184, &v6) + 8) = v37;
                }
                v6 = &v17;
                v17 = &v6;
                sub_103a8(v14, &v5);
                node = (char *)&node->field_0 + 1;
                if ((int)a0[128] == 44)
                    goto LABEL_115a0;
                break;
            }
            else
            {
LABEL_114ec:
                sub_f8d0(a0);
                v38 = sub_12740(a0, 0);
                v5 = sub_7448(sub_404c((long long)a0[216], 48), &v7, v24, v38);
                if ((char)a0[88] == 1)
                {
                    v39 = sub_404c((long long)a0[216], 12);
                    sub_8690(v39, (long long)a0[132]);
                    v6 = v5;
                    sub_1c9f0(a0 + 1184, &v6);
                    *(long long *)(sub_12484(a0 + 1184, &v6) + 8) = v39;
                }
                v6 = &v17;
                v17 = &v6;
                sub_103a8(v14, &v5);
                node = (char *)&node->field_0 + 1;
                if ((int)a0[128] == 44)
                {
LABEL_115a0:
                    if (a3)
                    {
                        v6 = &v17;
                        v17 = &v6;
                        sub_f2b8(v8, v21);
                        v10 = (char *)&v10->field_0 + 1;
                    }
                    sub_f8d0(a0);
                    if ((int)a0[128] == 62)
                    {
                        sub_1db64(a0, v21, "Expected type after ',' but got '>' instead");
                        break;
                    }
                    else
                    {
                        goto *((void *)(g_e628d0));
                    }
                }
            }
        }
        goto *((void *)(g_e629e0));
    }
    else
    {
        if (a3)
        {
            a3->field_0 = sub_ef54(a0, &v8);
            *(st_11190_1 ***)&a3->field_1 = &v8;
        }
        v40 = sub_ef54(a0, &v14);
        v41 = sub_ef54(a0, &v11);
        v42->field_0 = v40;
        v42->field_8 = &v14;
        v42->field_10 = v41;
        v42->field_18 = &v11;
        sub_dd88(v8, v8->field_0 + v9 * 8, v8->field_8);
        sub_dd88(v11, v11->field_0 + v12 * 8, v11->field_8);
        return sub_dd88(v14, v14->field_0 + v15 * 8, v14->field_8);
    }
}
