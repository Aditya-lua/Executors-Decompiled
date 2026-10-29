/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7c358..0x7c704 (940 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7c358_0 {
    char padding_0[7];
    char field_7;
} st_7c358_0;

extern unsigned long long g_1;
extern unsigned long long g_e6b1f0;
extern unsigned long long g_e6b2f8;
extern char g_10002b0;

long long sub_7c358(unsigned int *a0, unsigned long long a1, unsigned long a2)
{
    unsigned long v7;  // x8
    char v8;  // x9
    unsigned long long v18;  // x8
    uint128_t v19;  // q0
    unsigned long long v20;  // x9
    char *v21;  // x10
    unsigned int v22;  // w12
    unsigned int v23;  // w13
    unsigned long long v24;  // 4109
    unsigned long long v25;  // x16
    unsigned long long v26;  // x17
    unsigned long v9;  // x13
    unsigned long long v27;  // x17
    unsigned long long v28;  // w16
    unsigned long long v29;  // w3
    unsigned long idx;  // x17
    unsigned long v31;  // x16
    unsigned int v32;  // w4
    unsigned int v33;  // w3
    unsigned int v34;  // w16
    unsigned long v35;  // x3
    unsigned long v36;  // x4
    char *v10;  // x12
    unsigned long v37;  // x13
    unsigned long long v38;  // w12
    unsigned long long v39;  // x12
    unsigned int v40;  // w14
    unsigned long v41;  // cc_dep1
    unsigned int v42;  // w16
    unsigned long long v43;  // x3
    unsigned long long v44;  // x15
    unsigned long long v45;  // 4110
    unsigned long long v46;  // 4102
    unsigned int i;  // w11
    unsigned long long v47;  // 4110
    unsigned long long v48;  // 4102
    unsigned long long v49;  // x12
    unsigned int v50;  // w13
    unsigned long long v51;  // x12
    unsigned long long v52;  // x12
    st_7c358_0 *v53;  // x15
    st_7c358_0 *v54;  // x16
    char v55;  // x3
    char *iter;  // x12
    unsigned int v57;  // w13
    unsigned long long j;  // w14
    unsigned int v59;  // w12
    unsigned long long v61;  // 4149
    char *v62;  // x8
    char *v63;  // x8
    unsigned long long v65;  // 4145
    unsigned long long v13;  // x10
    unsigned long long v14;  // x14
    char *v15;  // x8
    char *v16;  // x8
    uint128_t v0;  // [bp-0x50]
    uint128_t v1;  // [bp-0x40]
    uint128_t v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x20]
    unsigned long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = *((char *)&a0[1 + 2 * (a1 & 0xffffffff)] + 3);
    v8 = v7 - a2;
    if ((unsigned int)v7 > (unsigned int)a2)
    {
        v9 = (int)a1;
        v10 = &a0[2 * (int)a1];
        i = v10[7];
        iter = v10 + 7;
        if (i > (unsigned int)a2)
        {
            v13 = 0;
            v14 = v9 * 0x100000000;
            do
            {
                *iter = a2;
                v13 = v13 + (1 << (v8 & 31)) + (0xffffffff << ((char)(v7 - i) & 31));
                i = *(iter - 8);
                iter -= 8;
                v14 += 0xffffffff00000000;
                a1 = (unsigned int)a1 - 1;
            } while ((unsigned int)a2 < i);
            v9 = (long long)(v14) >> 32;
            if (*((char *)a0 + ((long long)(v14) >> 29) + 7) == (unsigned int)a2)
                goto LABEL_7c3fc;
        }
        else
        {
            v13 = 0;
            if (i == (unsigned int)a2)
            {
LABEL_7c3fc:
                v15 = (char *)&a0[2 * v9] - 1;
                do
                {
                    v16 = v15;
                    v9 = (unsigned int)v9 - 1;
                    v15 = v16 - 8;
                    a1 = v9;
                } while (*v16 == (unsigned int)a2);
            }
        }
        v18 = (int)((unsigned int)v13) >> (v8 & 31);
        v3 = 0xf0f0f0f0f0f0f0f0;
        v19 = CONCAT(0xf0f0f0f0f0f0f0f0, 0xf0f0f0f0f0f0f0f0);
        v1 = v19;
        v2 = v19;
        v0 = v19;
        if (!(a1 >> 31 & 1))
        {
            v20 = a1 & 0xffffffff;
            v21 = (char *)&a0[2 * (a1 & 0xffffffff) + 1] + 3;
            v22 = a2;
            do
            {
                v23 = *v21;
                v21 -= 8;
                if (v22 > v23)
                {
                    *(unsigned int *)((char *)&v0 + 4 * (a2 - v23 & 0xffffffff)) = v20;
                    v22 = v23;
                }
            } while ((v20 -= 1, v24 = arm64g_calculate_condition(2, v20, 1, 0), !(v24 & 1)));
        }
        if ((int)v18 >= 1)
        {
            do
            {
                if (!((v18 & 0xffffffff) * 0x100000000))
                    v25 = 32;
                else
                    v25 = Clz((v18 & 0xffffffff) * 0x100000000) & 0xffffffff;
                v26 = 32 - v25;
                if (v26 >= 2)
                {
                    v35 = *(int *)((char *)&v0 + 4 * v26);
                    if ((unsigned int)v35 != 0xf0f0f0f0)
                    {
                        v36 = *(int *)((char *)&v0 + 4 * v26 - 4);
                        if ((unsigned int)v36 == 0xf0f0f0f0)
                        {
                            goto *((void *)(g_e6b2f8));
                        }
                        else if (a0[2 * v36] * 2 >= a0[2 * v35])
                        {
                            goto *((void *)(g_e6b2f8));
                        }
                    }
                    goto *((void *)(g_e6b1f0));
                }
                v27 = 1;
                do
                {
                    if (*(int *)((char *)&v0 + 4 * v27) != 0xf0f0f0f0)
                    {
                        v28 = (unsigned int)v27;
                        goto LABEL_7c558;
                    }
                } while ((v27 += 1, v27 != 13));
                v28 = 13;
LABEL_7c558:
                v29 = v28 - 1;
                v18 += 0xffffffff << ((char)v29 & 31);
                idx = v28;
                v31 = *(int *)((char *)&v0 + 4 * v28);
                *((char *)&a0[1 + 2 * v31] + 3) = *((char *)&a0[1 + 2 * v31] + 3) + 1;
                v32 = *(int *)((char *)&v0 + 4 * v29);
                if (*(int *)((char *)&v0 + 4 * v29) == 0xf0f0f0f0)
                    v32 = v31;
                *(unsigned int *)((char *)&v0 + 4 * v29) = v32;
                v33 = 0xf0f0f0f0;
                if ((unsigned int)v31)
                {
                    v34 = (unsigned int)v31 - 1;
                    if ((unsigned int)(a2 - idx) == *((char *)&a0[1 + 2 * v34] + 3))
                        v33 = v34;
                    else
                        v33 = 0xf0f0f0f0;
                }
                *(unsigned int *)((char *)&v0 + 4 * idx) = v33;
            } while (0 < (int)v18);
        }
        if (v18 >> 31 & 1)
        {
            v37 = *(unsigned int *)((void*)&v0 + 4);
            do
            {
                v38 = (unsigned int)v37 + 0xf0f0f0f;
                if (v38 < (unsigned int)v18)
                    v39 = v18 & 0xffffffff;
                else
                    v39 = v38;
                v40 = -(unsigned int)v39;
                v41 = v40;
                if (v40 < 3)
                    continue;
                v42 = (unsigned int)v37 + 1;
                v43 = (char *)&a0[1 + 2 * v42] + 3;
                v44 = v43 + ~(unsigned int)v39 * 8;
                if (v42 <= (unsigned int)(v37 - v39))
                {
                    v45 = arm64g_calculate_condition(35, v41, 3, 0);
                    v46 = arm64g_calculate_condition(52, (v45 & 1 ? v44 : 0), (v45 & 1 ? v43 : 0), 0);
                    if (v46 & 1)
                        continue;
                }
                else
                {
                    v47 = arm64g_calculate_condition(35, v41, 3, 0);
                    v48 = arm64g_calculate_condition(48, (v47 & 1 ? v44 : 0), (v47 & 1 ? v43 : 0), 0);
                    if (v48 & 1)
                        continue;
                }
                v49 = (v40 | 0xfffffffe) - v39;
                v18 += v49;
                v50 = (unsigned int)v37 + 2;
                v51 = v49;
                do
                {
                    v52 = v51;
                    v53 = (char *)a0 + 8 * v50 - 8;
                    v54 = &a0[2 * v50];
                    v55 = v54->field_7;
                    v53->field_7 = v53->field_7 - 1;
                    v54->field_7 = v55 - 1;
                    v50 += 2;
                    v51 = (unsigned int)v52 - 2;
                } while ((unsigned int)v52 != 2);
                v37 += v49;
                j = v37 + (char *)&g_1;
                v59 = v18;
                while (j)
                {
                    *((char *)&a0[1 + 2 * v57] + 3) = *((char *)&a0[1 + 2 * v57] + 3) - 1;
                    j += 1;
                    v57 += 1;
                    v61 = arm64g_calculate_condition(49, v59, 1, 0);
                    v59 += 1;
                    if (!(v61 & 1))
                        goto LABEL_7c5bc;
                }
                if (*((char *)&a0[1 + 2 * (int)a1] + 3) == (unsigned int)a2)
                {
                    v62 = (char *)a0 + 8 * (unsigned int)a1 - 1;
                    do
                    {
                        v63 = v62;
                        a1 = (unsigned int)a1 - 1;
                        v62 = v63 - 8;
                    } while (*v63 == (unsigned int)a2);
                }
                v37 = (unsigned int)a1 + 1;
                *((char *)&a0[1 + 2 * v37] + 3) = *((char *)&a0[1 + 2 * v37] + 3) - 1;
                v18 = v59 + 1;
                v65 = arm64g_calculate_condition(209, v59, 2, 0);
            } while (v65 & 1);
        }
LABEL_7c5bc:
        v7 = a2;
    }
    if (*(long long *)&g_10002b0 == v4)
        return v7;
    ___stack_chk_fail();
    __debugbreak();
}
