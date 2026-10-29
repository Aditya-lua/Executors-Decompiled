/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7b10c..0xb7ba70 (2404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7b10c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_b7b10c_0;

typedef struct st_b7b10c_1 {
    unsigned long long field_0;
    struct st_b7b10c_0 *field_8;
} st_b7b10c_1;

typedef struct st_b7b10c_5 {
    struct st_b7b10c_1 *field_0;
    long long field_8;
    char field_10;
    char field_11;
} st_b7b10c_5;

typedef struct st_b7b10c_2 {
    char padding_0[8];
    char *field_8;
    unsigned long long field_10;
} st_b7b10c_2;

extern unsigned long long g_b7a7fc;
extern st_b7b10c_0 *g_b7e1e8;
extern unsigned long long g_b86e9c;
extern long long g_cb89ed;
extern long long g_cb89f9;
extern long long g_cba67f;
extern long long g_ef8020;

unsigned long long sub_b7b10c(st_b7b10c_5 *a0, st_b7b10c_2 *a1)
{
    unsigned long v12;  // x26
    unsigned long long v13;  // x27
    char *node;  // x8
    unsigned long long i;  // x10
    unsigned long long v24;  // x9
    unsigned long long v25;  // x10
    char *v26;  // x11
    unsigned long v27;  // x10
    unsigned long long *v28;  // x10
    unsigned long long j;  // x11
    unsigned long iter;  // x10
    unsigned long v31;  // cc_dep1
    char *v14;  // x8
    unsigned long long v32;  // 4110
    unsigned long long v33;  // 4102
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long long v36;  // x10
    unsigned long v38;  // cc_dep2
    unsigned long long v39;  // x9
    st_b7b10c_0 *v40;  // x8
    unsigned long long v41;  // x9
    char *iter1;  // x28
    unsigned long long v42;  // 4110
    unsigned long long v43;  // 4102
    unsigned long long v44;  // 4110
    unsigned long long v45;  // 4102
    st_b7b10c_0 *v46;  // x26
    unsigned long long v47;  // x8
    unsigned long long v48;  // x9
    unsigned long long *v49;  // x10
    st_b7b10c_0 *v50;  // x22
    unsigned long long ptr;  // x0
    char *v16;  // x24
    st_b7b10c_0 **ptr1;  // x20
    unsigned long long index;  // x21
    unsigned long long v54;  // x22
    unsigned long long v55;  // x21
    unsigned long long v17;  // x25
    st_b7b10c_1 *v18;  // x20
    char *v19;  // x23
    unsigned long long v20;  // x9
    unsigned long v0;  // [bp-0xc0]
    char *v1;  // [bp-0xb8]
    char *v2;  // [bp-0xb0]
    st_b7b10c_1 *v3;  // [bp-0xa8]
    unsigned long long v4;  // [bp-0xa0]
    unsigned long long *v5;  // [bp-0x98]
    unsigned long long v6;  // [bp-0x90]
    unsigned long v7;  // [bp-0x88], Other Possible Types: unsigned long long
    st_b7b10c_0 **ptr2;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0x78]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a1->field_10;
    if (!v12)
        return 0;
    v13 = 0;
    v14 = v12 * 264;
    iter1 = a1->field_8;
    v1 = iter1 + v14;
    v16 = iter1 - 264;
    v17 = v14 - 264;
    while (1)
    {
        v18 = a0->field_0;
        if (v13)
            v18->field_8[1].field_8();
        v2 = iter1;
        if (sub_b7ba70(a0->field_10, a0->field_11, v18, a0->field_8) & 1)
            return 1;
        v19 = v2;
        v20 = *(long long *)&v19[24] - 12;
        if (11 >= (unsigned long long)*(long long *)&v19[24])
            v20 = 9;
        if ((long long)v20 > 6)
        {
            if ((long long)v20 > 10)
            {
                if (v20 == 11)
                {
                    v7 = v19 + 224;
                    ptr2 = &g_b86e9c;
                    if (sub_be769c(v18->field_0, v18->field_8, &g_cb89f9, &v7))
                        return 1;
                    if (!(sub_b79024(a0, v19 + 32) & 1))
                        a0->field_0->field_8[1].field_8();
                    return 1;
                }
                if (v20 != 14)
                {
                    if (v20 == 15)
                        v18->field_8[1].field_8();
                }
                else
                {
                    v3 = *(long long *)&v19[40];
                    v4 = *(long long *)&v19[40] + *(long long *)&v19[48] * 8;
                    sub_b9475c(&v7, &v3, 0x202c);
                    v5 = &v7;
                    v6 = &g_b7a7fc;
                    if (!(sub_be769c(v18->field_0, v18->field_8, &g_cb89ed, &v5) & 1))
                    {
                        v0 = v12;
                        if (v7)
                            _free(ptr2);
                        v46 = *(long long *)&v19[64];
                        v47 = *(long long *)&v19[72] - 1;
                        v48 = *(long long *)&v19[72] * 64;
                        do
                        {
                            if (!v48)
                                a0->field_0->field_8[1].field_8();
                        } while ((v49 = &v46->padding_0[v48], v47 && *(long long *)((char *)v49 - 64) == 6 && (v49 = &v46->padding_0[v48], v47 -= 1, v48 -= 64, *(long long *)((char *)v49 - 56) == 0x8000000000000000)));
                        v50 = (char *)v49 - 64;
                        ptr = _malloc(32);
                        if (!ptr)
                        {
                            sub_c6b970(8, 32);
                            sub_c73c94(0, 0, &g_ef8020);
                            /* unsupported instruction */;
                            sub_c75418(v18);
                            return 1;
                        }
                        ptr1 = ptr;
                        *(st_b7b10c_0 **)ptr = v50;
                        v7 = 4;
                        ptr2 = ptr;
                        v9 = 1;
                        if (v46 != v50)
                        {
                            index = 1;
                            do
                            {
                                if (index == v7)
                                {
                                    sub_c6c0cc(&v7, index, 1, 8, 8);
                                    ptr1 = ptr2;
                                }
                            } while ((v50 = (char *)v50 - 64, ptr1[index] = v50, index += 1, v9 = index, v46 != v50));
                            ptr1 = ptr2;
                            v54 = index * 8;
                            v55 = !v7;
                        }
                        else
                        {
                            v55 = 0;
                            v54 = 8;
                        }
                        if (!(sub_b79024(a0, *(long long *)((char *)ptr1 + v54 - 8)) & 1))
                        {
                            if (v54 != 8)
                                a0->field_0->field_8[1].field_8();
                            if (!(v55 & 1))
                            {
                                _free(ptr1);
                                a0->field_0->field_8[1].field_8();
                            }
                            a0->field_0->field_8[1].field_8();
                        }
                        else
                        {
                            if (v55 & 1)
                                return 1;
                        }
                    }
                    else
                    {
                        if (!v7)
                            return 1;
                        ptr1 = ptr2;
                    }
                    _free(ptr1);
                    break;
                }
                goto LABEL_b7b5d0;
            }
            if (v20 != 7)
            {
                if (v20 == 8)
                {
                    if (sub_b7c54c(a0, v19 + 32) & 1)
                        return 1;
                }
                else
                {
LABEL_b7b5d0:
                    v7 = &v2;
                    ptr2 = &g_b7e1e8;
                    if (sub_be769c(v18->field_0, v18->field_8, &g_cba67f, &v7) & 1)
                        return 1;
                }
            }
            else
            {
                if (sub_b7c398(a0, v19 + 32) & 1)
                    return 1;
            }
        }
        else if (2 >= (long long)v20)
        {
            if (v20 != 1)
            {
                if (v20 != 2)
                    goto LABEL_b7b5d0;
                if (sub_b79ed4(a0, v19 + 32) & 1)
                    return 1;
            }
            else if (sub_b78f10(a0, v19 + 32) & 1)
            {
                return 1;
            }
        }
        else
        {
            if (v20 != 3)
            {
                if (v20 != 4)
                    goto LABEL_b7b5d0;
                if (sub_b7c04c(a0, v19 + 32) & 1)
                    return 1;
            }
            else if (sub_b7bbb4(a0, v19 + 32) & 1)
            {
                return 1;
            }
        }
        if (v12 > 0)
        {
            node = v16;
            i = v17;
            while (i)
            {
                v24 = *(long long *)&node[552];
                node += 264;
                i -= 264;
                if (v24 != 32)
                {
                    v25 = 9;
                    if (11 < (unsigned long long)*(long long *)&iter1[24])
                        v25 = *(long long *)&iter1[24] - 12;
                    if (7 >= (long long)v25)
                    {
                        if (v25 - 1 < 2)
                            goto LABEL_b7b840;
                        switch (v25)
                        {
                        case 3:
                            v26 = iter1 + 56;
                            v27 = *(long long *)&v26[16];
                            if (!*(long long *)&v26[16])
                                goto LABEL_b7b188;
                            else
                                break;
                        case 5:
LABEL_b7b840:
                            v36 = v24 - 12;
                            if (11 >= v24)
                                v36 = 9;
                            v38 = 1;
                            if (v36 == 1)
                            {
                                v39 = 320;
                            }
                            else if (v36 != 3)
                            {
                                v38 = 2;
                                if (v36 != 2)
                                    goto LABEL_b7b188;
                                v39 = 344;
                            }
                            else
                            {
                                if (node[344] & 1)
                                    goto LABEL_b7b188;
                                if (!*(long long *)&node[312])
                                {
                                    sub_c73c94(0, 0, &g_ef8020);
                                    /* unsupported instruction */;
                                    sub_c75418(v18);
                                    return 1;
                                }
                                v36 = *(long long *)*(long long *)&node[304];
                                v38 = 9223372036854775810;
                                if (*(long long *)*(long long *)&node[304] != 9223372036854775810)
                                    goto LABEL_b7b188;
                                v40 = *(long long *)(*(long long *)&node[304] + 8);
                                goto LABEL_b7b8a8;
                            }
                            v40 = *(long long *)&node[v39];
LABEL_b7b8a8:
                            v41 = (unsigned long long)v40->padding_0;
                            if (2 <= v41)
                            {
                                v42 = arm64g_calculate_condition(36, v36, v38, 0);
                                v43 = arm64g_calculate_condition(4, (v42 & 1 ? v41 : 0x40000000), (v42 & 1 ? 7 : 0), 0);
                                if (v43 & 1)
                                    goto LABEL_b7b188;
                            }
                            else
                            {
                                v44 = arm64g_calculate_condition(36, v36, v38, 0);
                                v45 = arm64g_calculate_condition(0, (v44 & 1 ? v41 : 0x40000000), (v44 & 1 ? 7 : 0), 0);
                                if (v45 & 1)
                                    goto LABEL_b7b188;
                            }
                            if (v41 == 11 && v40->field_8 != 0x8000000000000000)
                                goto LABEL_b7b188;
                            a0->field_0->field_8[1].field_8();
                        default:
                            goto LABEL_b7b188;
                        }
                    }
                    else
                    {
                        if (v25 - 16 < 2)
                            goto LABEL_b7b840;
                        if (v25 != 8)
                        {
                            v26 = iter1;
                            if (v25 != 15 || !(v27 = *(long long *)&v26[16], *(long long *)&v26[16]))
                                break;
                        }
                        else
                        {
                            iter = iter1 + 32;
                            j = *(long long *)iter;
                            if (j == 9)
                            {
                                do
                                {
                                    iter = *(long long *)(iter + 16);
                                    j = *(long long *)iter;
                                } while (j == 9);
                            }
LABEL_b7b834:
                            v31 = j;
                            if (4 <= j)
                            {
                                v32 = arm64g_calculate_condition(36, v31, 9, 0);
                                v33 = arm64g_calculate_condition(20, (v32 & 1 ? j : 0x40000000), (v32 & 1 ? 7 : 0), 0);
                                if (v33 & 1)
                                    goto LABEL_b7b8d4;
                                else
                                    goto LABEL_b7b840;
                            }
                            else
                            {
                                v34 = arm64g_calculate_condition(36, v31, 9, 0);
                                v35 = arm64g_calculate_condition(16, (v34 & 1 ? j : 0x40000000), (v34 & 1 ? 7 : 0), 0);
                                if (v35 & 1)
                                    goto LABEL_b7b8d4;
                                else
                                    goto LABEL_b7b840;
                            }
LABEL_b7b8d4:
                            if (j != 11 || *(long long *)(iter + 8) == 0x8000000000000000)
                                break;
                            else
                                goto LABEL_b7b840;
                        }
                    }
                    v28 = *(long long *)&v26[8] + v27 * 64;
                    j = *(long long *)((char *)v28 - 64);
                    iter = (char *)v28 - 64;
                    if (j == 9)
                    {
                        do
                        {
                            iter = *(long long *)(iter + 16);
                            j = *(long long *)iter;
                        } while (j == 9);
                    }
                    goto LABEL_b7b834;
                }
            }
        }
LABEL_b7b188:
        iter1 += 264;
        v13 = 1;
        v16 += 264;
        v17 -= 264;
        if (iter1 == v1)
            return 0;
    }
    return 1;
}
