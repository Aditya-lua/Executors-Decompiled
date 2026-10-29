/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x999918..0x999c70 (856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_999918_2 {
    char padding_0[1584];
    unsigned long long field_630;
} st_999918_2;

typedef struct st_999918_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[68];
    char field_58;
    char padding_59[7];
    char field_60;
    char padding_61[1583];
    char field_690;
} st_999918_0;

typedef struct st_999918_1 {
    char field_0;
    char padding_1[23];
    unsigned long long field_18;
    char field_20;
} st_999918_1;


unsigned long long sub_999918(st_999918_0 *a0)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    st_999918_1 *v21;  // x23
    st_999918_1 *v22;  // x22
    char v23;  // x20
    unsigned long long *v24;  // x22
    char v25;  // x0
    unsigned long long v26;  // x0
    char v27;  // w21
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long long v13;  // x24
    unsigned long v31;  // cc_ndep
    unsigned long long v32;  // 4110
    unsigned long long v33;  // 4102
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long long v14;  // x23
    char v36;  // x8
    char v37;  // x0
    unsigned long long v15;  // x22
    char v38;  // x8
    char v39;  // x21
    unsigned long long v16;  // x21
    st_999918_1 *v40;  // x22
    unsigned int *v41;  // x0
    unsigned long long v42;  // 4102
    unsigned long long *iter;  // x22
    unsigned long long v17;  // x20
    char v44;  // x24
    char v45;  // x0
    char v46;  // x8
    char v47;  // x21
    unsigned long long *node;  // x22
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_999918_2 *v20;  // x24
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if ((unsigned long long)*(long long *)&a0[1].padding_0[7] <= (unsigned long long)*(long long *)&a0->field_690)
        return 1;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = &a0->field_60;
    v21 = &v20->padding_0[48 * *(long long *)&a0->field_690];
    v22 = v21;
    v23 = *(long long *)&v22->field_20;
    v24 = &v22->field_20;
    *(unsigned int *)___error() = 0;
    v25 = *(long long *)&a0->padding_14[44];
    if (!v25)
    {
LABEL_999a64:
        sub_a368c8(v25);
        sub_a369bc("ssl/record/methods/tls_common.c", 1967, "tls_retry_write_records");
        sub_996e84(a0, 80, 128, 0);
        goto LABEL_999a94;
    }
    while (1)
    {
        if (*(long long *)(*(long long *)&a0[2].padding_61[957] + 0x88))
            (*(long long *)(*(long long *)&a0[2].padding_61[957] + 0x88))();
        v26 = sub_9d3fec();
        if (v26 >> 31 & 1)
        {
            if (sub_9d3d68(*(long long *)&a0->padding_14[44], 8))
            {
                v37 = 0;
                break;
            }
            else
            {
                sub_a368c8();
                v41 = ___error(sub_a369bc("ssl/record/methods/tls_common.c", 1961, "tls_retry_write_records"), 1961, "tls_retry_write_records");
                sub_a36abc(2, *v41, "tls_retry_write_records failure");
LABEL_999a94:
                v37 = 0xfffffffe;
                break;
            }
        }
        v27 = v26;
        if (!(unsigned int)v26)
        {
            v32 = arm64g_calculate_condition(v28, v29, v30, v31);
            v33 = arm64g_calculate_condition(20, (v32 & 1 ? v23 : 0x40000000), 0, 0);
            if (v33 & 1)
                goto LABEL_999a18;
            goto LABEL_999a04;
        }
        else
        {
            v34 = arm64g_calculate_condition(v28, v29, v30, v31);
            v35 = arm64g_calculate_condition(16, (v34 & 1 ? v23 : 0x40000000), 0, 0);
            if (!(v35 & 1))
            {
LABEL_999a04:
                v36 = v27;
                v37 = 1;
                if (v36 != v23)
                    goto LABEL_999a38;
LABEL_999974:
                *v24 = 0;
                v21->field_18 = v21->field_18 + v23;
                v38 = *(long long *)&a0->field_690;
                v39 = v38 + 1;
                *(unsigned long long *)&a0->field_690 = v39;
                if ((unsigned long long)*(long long *)&a0[1].padding_0[7] <= v39)
                {
                    v42 = arm64g_calculate_condition(20, v39, *(long long *)&a0[1].padding_0[7], 0);
                    if (v42 & 1 || !(a0->field_58 >> 4 & 1))
                        return 1;
                    if (v39)
                    {
                        iter = &(a0->padding_0)[3 * v38 + 96];
                        do
                        {
                            if ((int)iter[5])
                                *(unsigned int *)&iter[5] = 0;
                            else
                                sub_a6c2e4(*iter, "ssl/record/methods/tls_common.c", 0x88);
                        } while ((*iter = 0, iter = (char *)iter - 48, v39 -= 1, v39));
                    }
                    *(unsigned long long *)&a0[1].padding_0[7] = 0;
                    return 1;
                }
                goto LABEL_99999c;
            }
            else
            {
LABEL_999a18:
                v36 = 0;
                if (!sub_9d3d68(*(long long *)&a0->padding_14[44], 8))
                    v37 = 0xfffffffe;
                else
                    v37 = 0;
                if (0 == v23)
                    goto LABEL_999974;
LABEL_999a38:
                if (!v27)
                    break;
                v21->field_18 = v21->field_18 + v36;
                *v24 = *v24 - v36;
                v39 = *(long long *)&a0->field_690;
LABEL_99999c:
                v21 = &v20->padding_0[48 * v39];
                v40 = v21;
                v23 = *(long long *)&v40->field_20;
                v24 = &v40->field_20;
                *(unsigned int *)___error() = 0;
                v25 = *(long long *)&a0->padding_14[44];
                if (!v25)
                    goto LABEL_999a64;
            }
        }
    }
    v44 = v37;
    if (*(int *)&v21[1].padding_1[6] && a0->field_58 >> 1 & 1)
    {
        v45 = sub_a6bf4c(*v24, "ssl/record/methods/tls_common.c", 2000);
        if (!v45)
        {
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls_common.c", 2002, "tls_retry_write_records");
            sub_996e84(a0, 80, 0xc0103, 0);
            return 0xfffffffe;
        }
        _memcpy();
        *(unsigned long long *)&v21->field_0 = v45;
        v21->field_18 = 0;
        *(unsigned int *)&v21[1].padding_1[6] = 0;
        v37 = v44;
    }
    if (!a0->field_10)
        return v37;
    *v24 = 0;
    v46 = *(long long *)&a0->field_690;
    v47 = v46 + 1;
    *(unsigned long long *)&a0->field_690 = v47;
    if (v47 != *(long long *)&a0[1].padding_0[7])
    {
        return v37;
    }
    else if (a0->field_58 >> 4 & 1)
    {
        if (v47)
        {
            node = &(a0->padding_0)[3 * v46 + 96];
            do
            {
                if ((int)node[5])
                {
                    *(unsigned int *)&node[5] = 0;
                }
                else
                {
                    sub_a6c2e4(*node, "ssl/record/methods/tls_common.c", 0x88);
                    v37 = v44;
                }
            } while ((*node = 0, node = (char *)node - 48, v47 -= 1, v47));
        }
        *(unsigned long long *)&a0[1].padding_0[7] = 0;
        return v37;
    }
    else
    {
        return v37;
    }
}
