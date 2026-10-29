/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5d358..0xc5d6e0 (904 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5d358_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_c5d358_0;

extern long long g_efcef0;

unsigned int sub_c5d358(long long a0, long long a1, long long a2, long long a3)
{
    char node;  // x13
    char *v13;  // x10
    char v22;  // x9
    unsigned long long v23;  // x0
    unsigned long long v24;  // x4
    unsigned long long v25;  // x3
    char iter;  // x0
    unsigned long v28;  // x0
    unsigned long long i;  // x17
    unsigned long long v30;  // x3
    unsigned long long v31;  // x0
    char v14;  // x1
    char v32;  // x2
    char *v33;  // x0
    char v34;  // x1
    unsigned long long v35;  // 4119
    unsigned long long v36;  // 4102
    st_c5d358_0 *v37;  // x10
    unsigned long v38;  // x11
    unsigned int v39;  // w8
    unsigned int v40;  // w12
    unsigned int v41;  // w11
    char v15;  // x8
    unsigned int v42;  // w12
    unsigned int v43;  // w8
    char v44;  // x8
    char v45;  // x2
    unsigned long long v46;  // 4107
    char v47;  // x2
    unsigned long long v48;  // 4119
    unsigned long long v49;  // 4102
    unsigned long v50;  // cc_op
    unsigned long v51;  // cc_dep1
    char v16;  // x12
    unsigned long v52;  // cc_dep2
    unsigned long v53;  // cc_ndep
    unsigned long long v54;  // 4102
    unsigned long long v55;  // 4102
    unsigned long long v17;  // 4129
    char iter1;  // x14
    char v19;  // x0
    unsigned long long v20;  // x17
    char v21;  // x16
    char v0;  // [bp-0x78]
    char v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    char v4;  // [bp-0x50]
    char v5;  // [bp-0x40]
    char *v6;  // [bp-0x30]
    char v7;  // [bp-0x28]
    char *v8;  // [bp-0x20]
    char v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    if ((unsigned long long)a3 > (unsigned long long)a1)
    {
        sub_bea21c(&v0, a2, a3, a0);
        if (!(v0 & 1))
        {
            if (!(*(char *)((void*)&v2 + 2) & 1))
            {
                v32 = v1;
                v33 = v6;
                v34 = v7;
                if (v32)
                {
                    if (v34 > v32)
                    {
                        v35 = arm64g_calculate_condition(161, v33[v32], 64, 0);
                        if (v35 & 1)
                            goto LABEL_c5d5a0;
                    }
                    else
                    {
                        v36 = arm64g_calculate_condition(20, v32, v34, 0);
                        if (!(v36 & 1))
                            goto LABEL_c5d5a0;
                    }
                    do
                    {
LABEL_c5d650:
                        v33 = sub_c73cc8();
                    } while ((v54 = arm64g_calculate_condition(v50 | 16, v51, v52, v53), v47 = v32, v54 & 1));
                }
                else
                {
LABEL_c5d5a0:
                    if (v32 == v34)
                        return (char)v2 & 1;
                    v37 = &v33[v32];
                    v38 = v37->field_0;
                    v39 = (unsigned int)v38 & 0xff;
                    if (v38 >> 31 & 1)
                    {
                        v40 = v37->field_1 & 63;
                        if (v39 >= 224)
                        {
                            v41 = v39 & 31;
                            v42 = v37->field_2 & 63 | v40 * 64;
                            if (v39 >= 240)
                            {
                                v43 = v37->field_3 & 63 | v42 * 64;
                                v39 = v43 & 0xffe00000 | (v43 & 0xffe3ffff | __ROL__(v41, 18) & 0x1c0000) & 0x1fffff;
                            }
                            else
                            {
                                v39 = v42 | v41 * 0x1000;
                            }
                        }
                        else
                        {
                            v39 = (v40 & 63 | __ROL__(v39, 6) & 1984) & 0x7ff;
                        }
                    }
                    if ((char)v2 & 1)
                        return 1;
                    if (128 > v39)
                    {
                        v44 = 1;
                    }
                    else if (0x800 > v39)
                    {
                        v44 = 2;
                    }
                    else
                    {
                        v44 = 3;
                        if (v39 >= 0x10000)
                            v44 = 4;
                    }
                    v45 = v44 + v32;
                    v46 = arm64g_calculate_condition(2, v44, v32, 0);
                    v47 = v45;
                    if (!(v46 & 1))
                    {
                        if (v34 > v45)
                        {
                            v48 = arm64g_calculate_condition(161, v33[v45], 64, 0);
                            v32 = v45;
                            v47 = v45;
                            if (!(v48 & 1))
                                goto LABEL_c5d650;
                        }
                        else
                        {
                            v49 = arm64g_calculate_condition(20, v45, v34, 0);
                            v32 = v45;
                            v47 = v45;
                            if (v49 & 1)
                                goto LABEL_c5d650;
                        }
                    }
                }
                return 1;
            }
            else
            {
                return 0;
            }
        }
        node = v5;
        v13 = v6;
        v14 = v7;
        v15 = v9;
        v16 = v15 - 1;
        v17 = arm64g_calculate_condition(2, node, 1, 0);
        if (!(v17 & 1))
        {
            iter1 = v4;
            v19 = iter1 + v16;
            if (v14 > v19)
            {
                v20 = v2;
                v21 = v1;
                while (1)
                {
                    if (!(v3 >> (v13[v19] & 63) & 1))
                    {
                        node = 0;
                        iter1 += v15;
                        goto LABEL_c5d41c;
                    }
                    else
                    {
                        if (v21 < node)
                            v22 = node;
                        else
                            v22 = v21;
                        if (v15 < v22)
                            v23 = v22;
                        else
                            v23 = v15;
                        v24 = v22;
                    }
                    while (1)
                    {
                        if (v23 != v24)
                        {
                            v25 = v24;
                            if (v14 > iter1 + v24)
                            {
                                v24 = v25 + 1;
                                if (v8[v25] != v13[v25 + iter1])
                                {
                                    node = 0;
                                    iter1 = iter1 - v21 + v25 + 1;
                                    goto LABEL_c5d41c;
                                }
                            }
                            else
                            {
                                v15 = iter1 + v22;
                                iter = sub_c73c94();
                                goto LABEL_c5d6a8;
                            }
                        }
                        else
                        {
                            iter = v21;
                            do
                            {
                                if (iter <= node)
                                    return 1;
                                iter -= 1;
                                if (v15 <= iter)
                                    goto LABEL_c5d6a8;
                                v22 = iter + iter1;
                                if (v14 <= v22)
                                    goto LABEL_c5d6b8;
                                v22 = v13[v22];
                            } while (v8[iter] == v22);
                            iter1 += v20;
                            node = v15 - v20;
LABEL_c5d41c:
                            v19 = iter1 + v16;
                            if (v14 <= v19)
                                return 0;
                            break;
                        }
                    }
                }
            }
        }
        else
        {
            node = v4;
            v28 = node + v16;
            if (v14 > v28)
            {
                iter1 = v1;
                if (v15 < iter1)
                    i = iter1;
                else
                    i = v15;
                while (1)
                {
                    if (!(v3 >> (v13[v28] & 63) & 1))
                    {
                        node += v15;
                        goto LABEL_c5d504;
                    }
                    else
                    {
                        v22 = (char)&v13[node];
                        v30 = iter1;
                    }
                    while (i != v30)
                    {
                        v31 = v30;
                        if (v14 <= node + v30)
                            goto LABEL_c5d6c8;
                        v30 = v31 + 1;
                        if (v8[v31] != *(char *)(v22 + v31))
                        {
                            node = node - iter1 + v31 + 1;
                            goto LABEL_c5d504;
                        }
                    }
                    iter = iter1;
                    do
                    {
                        if (!iter)
                            return 1;
                        iter -= 1;
                        if (v15 <= iter1 - 1)
                        {
LABEL_c5d6a8:
                            v14 = v15;
                            sub_c73c94(iter, v14, &g_efcef0);
LABEL_c5d6b8:
                            sub_c73c94(v22);
LABEL_c5d6c8:
                            sub_c73c94();
                        }
                        v22 = iter + node;
                        if (v14 <= v22)
                            goto LABEL_c5d6b8;
                        v22 = v13[v22];
                    } while (v8[iter] == v22);
                    node += v2;
LABEL_c5d504:
                    v28 = node + v16;
                    if (v14 <= v28)
                        return 0;
                }
            }
        }
    }
    else
    {
        v55 = arm64g_calculate_condition(20, a1, a3, 0);
        if (!(v55 & 1))
            return !_memcmp(a0, a2, a1);
    }
    return 0;
}
