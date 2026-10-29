/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49524..0xb497e0 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b49524_2 {
    char padding_0[221];
    char field_dd;
} st_b49524_2;

typedef struct st_b49524_1 {
    char padding_0[184];
    unsigned int field_b8;
    char padding_bc[36];
    unsigned long long field_e0;
    char padding_e8[8];
    struct st_b49524_0 *field_f0;
} st_b49524_1;

typedef struct st_b49524_0 {
    char padding_0[261];
    char field_105;
} st_b49524_0;


unsigned long long sub_b49524(st_b49524_1 *a0, long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4)
{
    st_b49524_0 *v2;  // x25
    unsigned long long n;  // x20
    unsigned long long v12;  // x0
    unsigned long long v13;  // x8
    unsigned long long v14;  // x20
    unsigned long v15;  // x9
    unsigned long v16;  // x10
    unsigned long v17;  // x10
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep2
    unsigned long long *iter;  // x9
    unsigned long iter1;  // x10
    long long iter2;  // x21
    unsigned long long v22;  // x11
    unsigned long v23;  // 4110
    unsigned long long v24;  // 4105
    unsigned long v25;  // 4110
    unsigned long long v26;  // 4105
    long long v27;  // x0
    unsigned long long v28;  // x0
    unsigned long long v29;  // x0
    unsigned long long v30;  // x0
    st_b49524_2 *v31;  // x9
    unsigned int v5;  // w24
    unsigned long v32;  // x11
    unsigned long long v33;  // w12
    char *v34;  // x10
    unsigned long i;  // x13
    unsigned int v36;  // w14
    unsigned long v37;  // x13
    unsigned long long v38;  // x12
    unsigned long v39;  // cc_op
    unsigned long v40;  // cc_dep1
    unsigned long v41;  // cc_dep2
    st_b49524_0 *v6;  // x22
    unsigned long v42;  // cc_ndep
    unsigned long v43;  // 4110
    unsigned long v44;  // cc_op
    unsigned long v45;  // cc_dep1
    unsigned long long v46;  // 4102
    unsigned long v47;  // 4110
    unsigned long long v7;  // x0
    unsigned long long v48;  // 4102
    unsigned long v49;  // cc_dep2
    unsigned long long v50;  // x12
    unsigned long long v51;  // x11
    unsigned long long v52;  // x13
    unsigned long v53;  // 4110
    long long v8;  // x0
    unsigned long long v54;  // 4105
    unsigned long v55;  // 4110
    unsigned long long v56;  // 4105
    void* v57;  // x9
    unsigned int v58;  // w12
    unsigned int v59;  // w10
    unsigned long long v9;  // x0
    unsigned int v60;  // w10
    unsigned int v61;  // w8
    unsigned long v62;  // x10
    unsigned long v63;  // cc_op
    unsigned long v64;  // cc_dep2
    char *node;  // x8
    unsigned long v66;  // x9
    unsigned long long v67;  // x10
    unsigned long v68;  // 4110
    unsigned long long v69;  // 4105
    char *v10;  // x26
    unsigned long v70;  // 4110
    unsigned long long v71;  // 4105
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_f0;
    if (!*(long long *)&v2->padding_0[24])
        return 0;
    n = a2;
    iter2 = a1;
    v5 = a0->field_b8;
    v6 = v2;
    if (a3)
    {
        v6 = v2;
        if (a4)
        {
            v7 = sub_b4998c(a0, 2, a3, a4);
            if (!(unsigned int)v7)
                return v7;
            v6 = a0->field_f0;
        }
    }
    if (n)
    {
        _memcpy(v6 + 1, &v6->padding_0[40], a0->field_e0);
        v8 = sub_954340(v6);
        v9 = sub_a3fe04(*(long long *)&v6->padding_0[24], v8, 0);
        if (!(unsigned int)v9)
            return v9;
        v10 = &v6->field_105;
        while (1)
        {
            v11 = sub_a3fe10(*(long long *)&v6->padding_0[24], v6 + 1, a0->field_e0);
            if (!(unsigned int)v11)
                return v11;
            if (n >= (unsigned long long)*(long long *)&v6->padding_0[32])
            {
                v12 = sub_a3ff18(*(long long *)&v6->padding_0[24], iter2, 0);
                if (!(unsigned int)v12)
                    return v12;
                v13 = *(long long *)&v6->padding_0[32];
                v14 = n - v13;
                if (n == v13)
                    break;
                v15 = a0->field_e0;
                v16 = v10[v15] + 1;
                v10[v15] = v16;
                if (v16 >> 8 & 1)
                {
                    v17 = a0->field_e0;
                    v18 = 4;
                    v19 = 1;
                    if (v17 != 1)
                    {
                        iter = &v6->padding_0[260 + v15];
                        iter1 = v17 - 2;
                        while (1)
                        {
                            v22 = *(char *)iter + 1;
                            *(char *)iter = v22;
                            iter = (char *)iter - 1;
                            if (!v22)
                            {
                                v23 = arm64g_calculate_condition(v18, v17, v19, 0);
                                v18 = 4;
                                v17 = (v23 & 1 ? iter1 : 0x40000000);
                                v19 = 0;
                                iter1 -= 1;
                                v24 = arm64g_calculate_condition(20, v17, 0, 0);
                                if (!(v24 & 1))
                                    break;
                            }
                            else
                            {
                                v25 = arm64g_calculate_condition(v18, v17, v19, 0);
                                v18 = 0;
                                v17 = (v25 & 1 ? iter1 : 0x40000000);
                                v19 = 0;
                                iter1 -= 1;
                                v26 = arm64g_calculate_condition(16, v17, 0, 0);
                                if (!(v26 & 1))
                                    break;
                            }
                        }
                    }
                }
                iter2 += v13;
                v27 = sub_954340(v6);
                v28 = sub_a3fe04(*(long long *)&v6->padding_0[24], v27, 0);
                n = v14;
                if (!(unsigned int)v28)
                    return v28;
            }
            else
            {
                v29 = sub_a3ff18(*(long long *)&v6->padding_0[24], v6 + 1, 0);
                if (!(unsigned int)v29)
                    return v29;
                _memcpy(iter2, v6 + 1, n);
                break;
            }
        }
    }
    v30 = sub_b4998c(a0, 3, 0, 0);
    if (!(unsigned int)v30)
        return v30;
    v31 = &v2->padding_0[40];
    v32 = a0->field_e0;
    if (v32)
    {
        v33 = 0;
        v34 = &v31->padding_0[v32] - 1;
        i = v32;
        do
        {
            v36 = v33 + *v34 + v34[111];
            v33 = v36 >> 8;
            *v34 = v36;
            v34 -= 1;
            i -= 1;
        } while (i);
        v37 = a0->field_e0;
        v38 = v37 - v32;
        if (0x100 <= v36)
        {
            v43 = arm64g_calculate_condition(v39 | 32, v40, v41, v42);
            v44 = 4;
            v45 = (v43 & 1 ? v38 : 0x40000000);
            v46 = arm64g_calculate_condition(4, v45, 0, 0);
            if (!(v46 & 1))
                goto LABEL_b49704;
        }
        else
        {
            v47 = arm64g_calculate_condition(v39 | 32, v40, v41, v42);
            v44 = 0;
            v45 = (v47 & 1 ? v38 : 0x40000000);
            v48 = arm64g_calculate_condition(0, v45, 0, 0);
            if (!(v48 & 1))
            {
                v49 = 0;
LABEL_b49704:
                v50 = 0;
                v51 = v32 - v37 + 1;
                while (1)
                {
                    v52 = v34[v50] + 1;
                    v34[v50] = v52;
                    if (!v52)
                    {
                        v53 = arm64g_calculate_condition(v44, v45, v49, 0);
                        v44 = 4;
                        v45 = (v53 & 1 ? v51 : 0x40000000);
                        v49 = (v53 & 1 ? v50 : 0);
                        v50 -= 1;
                        v54 = arm64g_calculate_condition(20, v45, v49, 0);
                        if (!(v54 & 1))
                            break;
                    }
                    else
                    {
                        v55 = arm64g_calculate_condition(v44, v45, v49, 0);
                        v44 = 0;
                        v45 = (v55 & 1 ? v51 : 0x40000000);
                        v49 = (v55 & 1 ? v50 : 0);
                        v50 -= 1;
                        v56 = arm64g_calculate_condition(16, v45, v49, 0);
                        if (!(v56 & 1))
                            break;
                    }
                }
                v37 = a0->field_e0;
            }
        }
    }
    else
    {
        v37 = 0;
    }
    v57 = &v31->padding_0[v37];
    v58 = *((char *)v57 - 1) + (v5 & 0xff);
    *((char *)v57 - 1) = v58;
    v59 = *((char *)v57 - 2) + (v58 >> 8) + (v5 >> 8 & 0xff);
    *((char *)v57 - 2) = v59;
    v60 = *((char *)v57 - 3) + (v59 >> 8) + (v5 >> 16 & 0xff);
    *((char *)v57 - 3) = v60;
    v61 = *((char *)v57 - 4) + (v60 >> 8) + (v5 >> 24);
    *((char *)v57 - 4) = v61;
    if (v61 < 0x100)
        return 1;
    v62 = a0->field_e0;
    v63 = 4;
    v64 = 4;
    if (v62 != 4)
    {
        node = v57 - 5;
        v66 = v62 - 5;
        while (1)
        {
            v67 = *node + 1;
            *node = v67;
            node -= 1;
            if (!v67)
            {
                v68 = arm64g_calculate_condition(v63, v62, v64, 0);
                v63 = 4;
                v62 = (v68 & 1 ? v66 : 0x40000000);
                v64 = 0;
                v66 -= 1;
                v69 = arm64g_calculate_condition(20, v62, 0, 0);
                if (!(v69 & 1))
                    break;
            }
            else
            {
                v70 = arm64g_calculate_condition(v63, v62, v64, 0);
                v63 = 0;
                v62 = (v70 & 1 ? v66 : 0x40000000);
                v64 = 0;
                v66 -= 1;
                v71 = arm64g_calculate_condition(16, v62, 0, 0);
                if (!(v71 & 1))
                    break;
            }
        }
    }
    return 1;
}
