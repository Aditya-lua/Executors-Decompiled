/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7644c..0x767b8 (876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7644c_0 {
    char field_0;
} st_7644c_0;

extern char g_10002b0;

long long sub_7644c(unsigned short *a0, unsigned int *a1, unsigned int *a2, void* ptr, long long n)
{
    long long v6;  // x0
    unsigned long v7;  // cc_op
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4105
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // x24
    unsigned int v16;  // w9
    unsigned long long v17;  // x10
    void* v18;  // x13
    unsigned int v19;  // w0
    unsigned int v20;  // w14
    unsigned long long v21;  // x8
    unsigned int v22;  // w15
    void* v23;  // x12
    void* v24;  // x13
    unsigned long long v25;  // x17
    void* iter;  // x9
    unsigned long long v8;  // 4110
    unsigned long v42;  // x17
    unsigned int v44;  // w1
    unsigned int v45;  // w2
    unsigned int v46;  // w3
    unsigned int v47;  // w0
    unsigned long long v48;  // w1
    unsigned long v49;  // cc_dep1
    unsigned long long v9;  // 4105
    unsigned long v50;  // cc_dep2
    unsigned long long v51;  // w0
    unsigned long long v52;  // 4108
    unsigned long long v53;  // 4108
    unsigned long v54;  // x1
    unsigned long long v55;  // w1
    unsigned long long v56;  // x0
    unsigned long v57;  // x1
    unsigned int v58;  // w14
    unsigned long long v59;  // x0
    st_7644c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_7644c_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (7 >= (unsigned long long)n)
    {
        v2 = 0;
        _memcpy(&v2, ptr, n);
        v6 = sub_7644c(a0, a1, a2, &v2, 8);
        if ((unsigned long long)n < (unsigned long long)v6)
        {
            v8 = arm64g_calculate_condition(v7 | 128, v13, v14, v10);
            v9 = arm64g_calculate_condition(52, (v8 & 1 ? v6 : 0x20000000), (v8 & 1 ? 0xffffffffffffff89 : 0), 0);
            if (!(v9 & 1))
                goto LABEL_764de;
LABEL_764dd:
            v6 = -0x14;
        }
        else
        {
            v11 = arm64g_calculate_condition(v7 | 128, v13, v14, v10);
            v12 = arm64g_calculate_condition(48, (v11 & 1 ? v6 : 0x20000000), (v11 & 1 ? 0xffffffffffffff89 : 0), 0);
            if (v12 & 1)
                goto LABEL_764dd;
LABEL_764de:
        }
        if (*(long long *)&g_10002b0 == v3)
            return v6;
    }
    else
    {
        v15 = *a1 + 1;
        _bzero(a0, (v15 * 2 | v15 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v16 = *(int *)ptr & 15;
        if (v16 <= 10)
        {
            v17 = 0;
            v18 = ptr + n;
            v19 = (unsigned int)(*(int *)ptr) >> 4;
            *a2 = v16 + 5;
            v20 = 32 << ((char)v16 & 31);
            v21 = v20 | 1;
            v22 = v16 + 6;
            v23 = v18 - 7;
            v24 = v18 - 4;
            v25 = 4;
            iter = ptr;
            while (1)
            {
                v44 = v20 * 2 - 1;
                v45 = v44 - v21;
                v46 = v19 & v20 - 1;
                v47 = v19 & v44;
                if ((int)v47 < (int)v20)
                    v48 = 0;
                else
                    v48 = v45;
                v49 = v46;
                v50 = v45;
                if (v45 <= v46)
                {
                    v51 = v47 - v48;
                    v52 = arm64g_calculate_condition(35, v49, v50, 0);
                    if (!(v52 & 1))
                        goto LABEL_76676;
                    goto LABEL_76675;
                }
                else
                {
                    v51 = v46;
                    v53 = arm64g_calculate_condition(35, v49, v50, 0);
                    if (v53 & 1)
                    {
LABEL_76675:
                        v54 = v22;
                        goto LABEL_76678;
                    }
                    else
                    {
LABEL_76676:
                        v54 = v22 - 1;
LABEL_76678:
                        v42 = v54 + v25;
                        v55 = v51 - 1;
                        if (0 < v51)
                            v56 = 1 - v51 & 0xffffffff;
                        else
                            v56 = v55;
                        v21 += v56;
                        a0[v17 & 0xffffffff] = v55;
                        v17 = (unsigned int)v17 + 1;
                        v57 = v55 != 0;
                        if ((int)v20 > (int)v21)
                        {
                            if ((int)v21 < 2)
                                break;
                            if (!((v21 & 0xffffffff) * 0x100000000))
                                v58 = 32;
                            else
                                v58 = Clz((v21 & 0xffffffff) * 0x100000000);
                            v22 = 32 - v58;
                            v20 = 1 << (((char)v58 ^ 31) & 31);
                        }
                        if ((unsigned int)v15 <= (unsigned int)v17)
                            break;
                        v59 = (long long)(v42 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v42, 61) & 0xe00000001fffffff & 0x1fffffff;
                        if (v23 >= iter || iter + v59 <= v24)
                        {
                            iter += v59;
                            v25 = (unsigned int)v42 & 7;
                            v19 = (unsigned int)(*(int *)iter) >> ((char)v25 & 31);
                        }
                        else
                        {
                            v25 = (unsigned int)v42 + (unsigned int)(iter - v24) * 8 & 31;
                            iter = v24;
                            v19 = (unsigned int)(*(int *)v24) >> ((char)v25 & 31);
                        }
                    }
                }
            }
            if ((unsigned int)v21 == 1)
            {
                if ((unsigned int)v17 > (unsigned int)v15)
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return -0x30;
                }
                else
                {
                    if ((int)v42 > 32)
                        goto LABEL_76750;
                    *a1 = (unsigned int)v17 - 1;
                    if (*(long long *)&g_10002b0 == v3)
                        return iter + ((int)((unsigned int)v42 + 7) >> 3) - ptr;
                }
            }
            else
            {
LABEL_76750:
                if (*(long long *)&g_10002b0 == v3)
                    return -0x14;
            }
        }
        else if (*(long long *)&g_10002b0 == v3)
        {
            return -0x2c;
        }
    }
    ___stack_chk_fail();
}
