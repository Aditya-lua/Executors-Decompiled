/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3fdcc..0xc40110 (836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3fdcc_4 {
    char padding_0[1];
    char field_1;
} st_c3fdcc_4;

typedef struct st_c3fdcc_3 {
    char padding_0[2];
    char field_2;
} st_c3fdcc_3;

typedef struct st_c3fdcc_0 {
    char padding_0[40];
    struct st_c3fdcc_1 *field_28;
} st_c3fdcc_0;

typedef struct st_c3fdcc_1 {
    unsigned long long field_0;
} st_c3fdcc_1;

typedef struct st_c3fdcc_2 {
    struct st_c3fdcc_2 *field_0;
} st_c3fdcc_2;

extern st_c3fdcc_0 g_efd578;
extern st_c3fdcc_0 g_efd5a8;

unsigned int sub_c3fdcc(unsigned int a0, unsigned long long a1, unsigned long a2, long long a3, unsigned long a4)
{
    unsigned int v8;  // x24
    unsigned long long v9;  // x0
    st_c3fdcc_4 *v18;  // x8
    st_c3fdcc_4 *v19;  // x8
    st_c3fdcc_4 *v20;  // x8
    unsigned int v21;  // x10
    unsigned int v22;  // x9
    unsigned long long v23;  // x28
    unsigned int v24;  // x23
    char *iter;  // x8
    unsigned long v26;  // x11
    char *v27;  // x26
    unsigned long long v10;  // x0
    unsigned int v28;  // x27
    unsigned int v29;  // x1
    unsigned int v30;  // x1
    unsigned int v31;  // x1
    unsigned int v32;  // x10
    unsigned int v33;  // x9
    unsigned long v34;  // x11
    unsigned long long v35;  // x10
    unsigned long long i;  // x10
    unsigned long v37;  // cc_dep1
    unsigned int v11;  // x22
    unsigned long v38;  // cc_dep2
    unsigned int v39;  // x8
    unsigned int v40;  // w10
    char *v41;  // x9
    unsigned long v42;  // x11
    unsigned long long v43;  // 4112
    unsigned int v44;  // x9
    unsigned long long v45;  // 4111
    unsigned long long v46;  // 4112
    unsigned long long v47;  // 4111
    unsigned long v12;  // x28
    unsigned int v48;  // x8
    unsigned long v49;  // cc_dep1
    unsigned long long v50;  // 4105
    unsigned long long v51;  // 4105
    st_c3fdcc_3 *v13;  // x24
    unsigned int v14;  // w8
    st_c3fdcc_0 *v15;  // x8
    long long v16;  // x1
    st_c3fdcc_2 **v17;  // x8
    st_c3fdcc_2 **v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x88]
    unsigned int v2;  // [bp-0x7c]
    char *v3;  // [bp-0x78]
    char *v4;  // [bp-0x70]
    st_c3fdcc_3 *v5;  // [bp-0x68], Other Possible Types: char *
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a0 != 1)
    {
LABEL_c400c8:
        return 3;
    }
    v1 = a4;
    v8 = __Unwind_GetLanguageSpecificData(a4);
    v2 = 0;
    v9 = __Unwind_GetIPInfo(a4, &v2);
    v10 = __Unwind_GetRegionStart(a4);
    v3 = &v1;
    v4 = &v1;
    if (v8)
    {
        v11 = v10;
        v12 = *(char *)v8;
        v13 = v8 + 1;
        v5 = v13;
        if ((unsigned int)v12 == 0xff)
        {
            v17 = (st_c3fdcc_2 **)v11;
            goto LABEL_c3fe8c;
        }
        v14 = ((unsigned int)v12 * 0x10000000 | (unsigned int)v12 >> 4) & 4026531847 & 7;
        if (2 >= (int)v14)
        {
            if (!v14)
                goto LABEL_c400c0;
            if (v14 == 1)
            {
                v16 = (unsigned int)v12 & 15;
                if (!(sub_c5ef98(&v5, v16) & 1))
                    goto LABEL_c400ac;
                goto LABEL_c400c8;
            }
            else if (v14 == 2)
            {
                v15 = &g_efd578.padding_0[0];
                goto LABEL_c40074;
            }
        }
        else
        {
            if (v14 == 3)
            {
                v15 = &g_efd5a8.padding_0[0];
LABEL_c40074:
                v15->field_28();
            }
            if (v14 == 5)
            {
                v13 = &v13[2].padding_0[1] & 0xfffffffffffffff8;
LABEL_c400c0:
                if (!(v12 & 15))
                {
                    v17 = *(long long *)v13;
                    v5 = &v13[2].field_2;
                    if (v12 >> 7 & 1)
                    {
LABEL_c400f8:
                        v17 = *v17;
                    }
LABEL_c3fe8c:
                    v0 = v17;
                    v18 = &v5->padding_0[1];
                    v19 = v18;
                    if (v5->padding_0[0] != 0xff)
                    {
                        do
                        {
                            v20 = v18;
                            v19 = &v20->field_1;
                            v18 = v19;
                        } while (v20->padding_0 < 0);
                    }
                    v21 = 0;
                    v22 = 0;
                    v23 = v9 - (!v2);
                    v24 = (unsigned long long)v19->padding_0;
                    iter = &v19->field_1;
                    v5 = iter;
                    do
                    {
                        v26 = *iter;
                        iter += 1;
                        v22 |= (v26 & 127) << ((char)v21 & 63);
                        v21 += 7;
                    } while (v26 >> 7 & 1);
                    v5 = iter;
                    v27 = &iter[v22];
                    v28 = 4;
                    do
                    {
                        if (v27 <= iter)
                            goto LABEL_c3ffdc;
                        v29 = v24;
                        if (!!(sub_c5ef98(&v5, v29) & 1) || !(v30 = v24, !(sub_c5ef98(&v5, v30) & 1) && (v31 = v24, !(sub_c5ef98(&v5, v31) & 1))))
                            goto LABEL_c400c8;
                        v32 = 0;
                        v33 = 0;
                        iter = v5;
                        do
                        {
                            v34 = *iter;
                            iter += 1;
                            v33 |= (v34 & 127) << ((char)v32 & 63);
                            v32 += 7;
                        } while (v34 >> 7 & 1);
                        v5 = iter;
                        v35 = v11 + v29;
                        if (v23 < v35)
                            goto LABEL_c3ffdc;
                        i = v35 + v30;
                        v37 = v23;
                        v38 = i;
                    } while (i <= v23);
                    if (!v31)
                        goto LABEL_c3ffd8;
                    v11 = (unsigned int)(st_c3fdcc_2 **)((char *)v0 + v31);
                    if (!v33)
                    {
                        v28 = 1;
                        if (!(a1 & 1))
                            goto LABEL_c3ffe0;
                    }
                    v39 = 0;
                    v40 = 0;
                    v41 = &v27[v33] - 1;
                    do
                    {
                        v42 = *v41;
                        v41 += 1;
                        v39 |= (v42 & 127) << ((char)v40 & 63);
                        v40 += 7;
                    } while (v42 >> 7 & 1);
                    if (64 <= (unsigned int)v42)
                    {
                        v43 = arm64g_calculate_condition(36, v37, v38, 0);
                        v44 = 0xffffffffffffffff << ((char)v40 & 63);
                        v45 = arm64g_calculate_condition(131, (v43 & 1 ? v40 : 0x20000000), (v43 & 1 ? 63 : 0), 0);
                        if (!(v45 & 1))
                            goto LABEL_c3ffae;
                    }
                    else
                    {
                        v46 = arm64g_calculate_condition(36, v37, v38, 0);
                        v44 = 0xffffffffffffffff << ((char)v40 & 63);
                        v47 = arm64g_calculate_condition(128, (v46 & 1 ? v40 : 0x20000000), (v46 & 1 ? 63 : 0), 0);
                        if (!(v47 & 1))
                        {
LABEL_c3ffae:
LABEL_c3ffb0:
                            v48 = v39 | v44;
                            v49 = v48;
                            if (0 < v48)
                            {
                                v28 = 2;
                                v50 = arm64g_calculate_condition(20, v49, 0, 0);
                                if (!(v50 & 1))
                                    goto LABEL_c3ffc2;
                            }
                            else
                            {
                                v28 = 3;
                                v51 = arm64g_calculate_condition(20, v49, 0, 0);
                                if (!(v51 & 1))
                                {
LABEL_c3ffc2:
                                    v28 = 1;
LABEL_c3ffc4:
                                    if (!(a1 & 1))
                                        goto LABEL_c3ffe0;
                                }
                            }
                            goto LABEL_c3ffc4;
                        }
                    }
                    v44 = 0;
                    goto LABEL_c3ffb0;
                }
            }
            else if (v14 == 4 && v11 && (v16 = (unsigned int)v12 & 15, v13 = (st_c3fdcc_3 *)v11, !(sub_c5ef98(&v5, v16) & 1)))
            {
LABEL_c400ac:
                v17 = &v13->padding_0[v16];
                if (v12 >> 7 & 1)
                    goto LABEL_c400f8;
                goto LABEL_c3fe8c;
            }
        }
        goto LABEL_c400c8;
    }
    else
    {
LABEL_c3ffd8:
        v28 = 0;
LABEL_c3ffdc:
        if (!(a1 & 1))
        {
LABEL_c3ffe0:
            if (2 < v28)
            {
                if (v28 != 3)
                    return 2;
                if (a1 >> 3 & 1)
                {
LABEL_c40058:
                    return 8;
                }
            }
            else if (2 <= v28 - 1)
            {
                goto LABEL_c40058;
            }
            __Unwind_SetGR(a4, 0, a3);
            __Unwind_SetGR(a4, 1, 0);
            __Unwind_SetIP(a4, v11);
            return 7;
        }
    }
}
