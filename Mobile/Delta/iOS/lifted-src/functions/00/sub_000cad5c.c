/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcad5c..0xcb0ac (848 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cad5c_0 {
    char field_0;
} st_cad5c_0;

typedef struct st_cad5c_1 {
    int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_cad5c_1;

extern st_cad5c_1 g_cc1990;
extern st_cad5c_1 g_cc19b0;

double sub_cad5c(void* a0, void* a1, void* iter, unsigned long long a3, unsigned long long a4)
{
    void* v4;  // x10
    void* v5;  // x8
    uint128_t v14;  // q1
    unsigned long long v16;  // x13
    void* v17;  // x10
    void* iter1;  // x11
    void* iter2;  // x14
    void* v20;  // x15
    unsigned long long v21;  // x12
    unsigned long long v23;  // 4112
    void* v6;  // x9
    unsigned long v25;  // x9
    void* v26;  // x10
    void* i;  // x9
    unsigned long long v28;  // x10
    void* v29;  // x8
    void* j;  // x9
    void* v31;  // x10
    void* node;  // x11
    void* v33;  // x10
    unsigned long long v7;  // x9
    void* v34;  // x10
    void* v35;  // x11
    void* k;  // x12
    void* m;  // x11
    void* v39;  // x12
    uint128_t v41;  // q0
    void* v42;  // x13
    unsigned long long v43;  // x12
    unsigned long long v8;  // x12
    unsigned long long v44;  // x14
    void* v45;  // x15
    void* v46;  // x16
    unsigned long long n;  // x17
    unsigned long long v48;  // x17
    uint128_t v49;  // q1
    unsigned long long v51;  // x15
    unsigned long long *v52;  // x13
    void* v53;  // x9
    void* v9;  // x10
    unsigned long long v54;  // x14
    unsigned long long v56;  // 4112
    uint128_t *v10;  // x11
    unsigned long long l;  // x13
    unsigned long long v12;  // x13
    uint128_t v13;  // q0
    st_cad5c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_cad5c_0 *v1;  // [bp-0x18]
    st_cad5c_0 **v2;  // [bp-0x10], Other Possible Types: char
    st_cad5c_0 *v3;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v4 = a0 - iter;
    v5 = a0 + a3;
    if (7 >= (long long)a3)
    {
        if ((long long)a3 >= 1)
        {
            v6 = a0 + a3;
            if (a0 + 1 >= v6)
                v6 = a0 + 1;
            v7 = v6 - a0;
            if (v7 < 8 || v4 < 32)
            {
                v17 = iter;
                iter1 = a0;
            }
            else if (32 > v7)
            {
                v8 = 0;
LABEL_caf50:
                v16 = v7 & 0xfffffffffffffff8;
                v17 = iter + v16;
                iter1 = a0 + v16;
                iter2 = a0 + v8;
                v20 = iter + v8;
                v21 = v8 - v16;
                do
                {
                    v13 = *(unsigned long long *)&*(double *)v20;
                    v20 += 8;
                    *(unsigned long long *)iter2 = *(unsigned long long *)&v13;
                    iter2 += 8;
                    v23 = arm64g_calculate_condition(18, v21, 8, 0);
                    v21 += 8;
                } while (v23 & 1);
                if (v7 == v16)
                    return *(unsigned long long *)&v13;
            }
            else
            {
                v8 = v7 & 0xffffffffffffffe0;
                v9 = a0 + 16;
                v10 = iter + 16;
                l = v8;
                do
                {
                    v12 = l;
                    v13 = *(int128_t *)((char *)v10 - 16);
                    v14 = *v10;
                    *(uint128_t *)((char *)v9 - 16) = v13;
                    *(uint128_t *)v9 = v14;
                    v9 += 32;
                    v10 += 2;
                    l = v12 - 32;
                } while (l);
                if (v7 == v8)
                    return *(unsigned long long *)&v13;
                if (v7 & 24)
                    goto LABEL_caf50;
                iter1 = a0 + v8;
                v17 = iter + v8;
            }
            do
            {
                *(char *)iter1 = *(char *)v17;
                iter1 += 1;
                v17 += 1;
            } while (iter1 < v5);
        }
    }
    else
    {
        if (a4 == 1)
        {
            if (7 >= v4)
            {
                v25 = *(int *)((char *)&g_cc19b0.field_0 + 0x4 * v4);
                *(char *)a0 = *(char *)iter;
                *(char *)&a0[1] = (char)iter[1];
                *(char *)&a0[2] = (char)iter[2];
                *(char *)&a0[3] = (char)iter[3];
                v26 = iter + *(int *)((char *)&g_cc1990.field_0 + 0x4 * v4);
                *(int *)&a0[4] = *(int *)v26;
                iter = v26 - v25;
            }
            else
            {
                v13 = *(unsigned long long *)&*(double *)iter;
                *(unsigned long long *)a0 = *(unsigned long long *)&v13;
            }
            iter += 8;
            i = a0 + 8;
            v28 = a3 - 8;
            if (v5 > a1)
                goto LABEL_caec4;
            goto LABEL_cae28;
        }
        else
        {
            i = a0;
            v28 = a3;
            if (a1 >= v5)
            {
LABEL_cae28:
                v3 = &v2;
                v2 = &v3;
                v29 = i + v28;
                if (a4 == 1 && 15 >= i - iter)
                {
                    do
                    {
                        v13 = *(unsigned long long *)&*(double *)iter;
                        iter += 8;
                        *(unsigned long long *)i = *(unsigned long long *)&v13;
                        i += 8;
                    } while (i < v29);
                }
                else
                {
                    v13 = *(int128_t *)iter;
                    *(uint128_t *)i = v13;
                    if (v28 >= 0x11)
                    {
                        j = i + 16;
                        v31 = iter + 32;
                        do
                        {
                            *(int128_t *)j = *(int128_t *)((char *)v31 - 16);
                            v13 = *(int128_t *)v31;
                            v31 += 32;
                            *(uint128_t *)&j[16] = v13;
                            j += 32;
                        } while (j < v29);
                    }
                }
            }
            else
            {
LABEL_caec4:
                node = i;
                v33 = iter;
                if (a1 >= i)
                {
                    v34 = a1 - i;
                    v3 = &v2;
                    v2 = &v3;
                    if (a4 == 1 && 16 > i - iter)
                    {
                        v35 = iter;
                        k = i;
                        do
                        {
                            *(double *)k = *(double *)v35;
                            k += 8;
                            v35 += 8;
                        } while (k < a1);
                    }
                    else
                    {
                        *(int128_t *)i = *(int128_t *)iter;
                        if (v34 > 16)
                        {
                            m = i + 16;
                            v39 = iter + 32;
                            do
                            {
                                *(int128_t *)m = *(int128_t *)((char *)v39 - 16);
                                *(int128_t *)&m[16] = *(int128_t *)v39;
                                m += 32;
                                v39 += 32;
                            } while (m < a1);
                        }
                    }
                    v33 = iter + v34;
                    node = a1;
                    v13 = v41;
                }
                if (v5 > node)
                {
                    if (a1 < i)
                        v42 = i;
                    else
                        v42 = a1;
                    v43 = a0 + a3 - v42;
                    if (v43 >= 8 && i - iter >= 32)
                    {
                        if (32 > v43)
                        {
                            v44 = 0;
                            goto LABEL_cb038;
                        }
                        else
                        {
                            v44 = v43 & 0xffffffffffffffe0;
                            v45 = v42 + 16;
                            v46 = iter + v45 - i;
                            n = v44;
                            do
                            {
                                v48 = n;
                                v13 = *(int128_t *)((char *)v46 - 16);
                                v49 = *(int128_t *)v46;
                                *(uint128_t *)((char *)v45 - 16) = v13;
                                *(uint128_t *)v45 = v49;
                                v45 += 32;
                                v46 += 32;
                                n = v48 - 32;
                            } while (n);
                            if (v43 == v44)
                                return *(unsigned long long *)&v13;
                            if (v43 & 24)
                            {
LABEL_cb038:
                                v51 = v43 & 0xfffffffffffffff8;
                                v33 += v51;
                                node += v51;
                                v52 = v44 + v42;
                                v53 = iter + v52 - i;
                                v54 = v44 - v51;
                                do
                                {
                                    v13 = *(unsigned long long *)&*(double *)v53;
                                    v53 += 8;
                                    *v52 = *(unsigned long long *)&v13;
                                    v52 += 1;
                                    v56 = arm64g_calculate_condition(18, v54, 8, 0);
                                    v54 += 8;
                                } while (v56 & 1);
                                if (v43 == v51)
                                    return *(unsigned long long *)&v13;
                            }
                            else
                            {
                                node += v44;
                                v33 += v44;
                            }
                        }
                    }
                    do
                    {
                        *(char *)node = *(char *)v33;
                        node += 1;
                        v33 += 1;
                    } while (node < v5);
                }
            }
        }
    }
    return *(unsigned long long *)&v13;
}
