/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79ec8..0x7a0a0 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_79ec8(void* a0, unsigned long long a1)
{
    unsigned long v0;  // x8
    unsigned int v1;  // w9
    unsigned long v10;  // x12
    unsigned long v11;  // x13
    unsigned int *iter;  // x14
    unsigned long i;  // x16
    unsigned long v14;  // x16
    void* node;  // x12
    unsigned int j;  // x10
    unsigned int v18;  // x10
    unsigned long v2;  // x10
    unsigned int *iter1;  // x10
    unsigned long v21;  // x13
    unsigned long v22;  // x12
    unsigned int v23;  // w16
    unsigned long idx;  // x14
    unsigned long index;  // x15
    unsigned int v26;  // w17
    unsigned int v27;  // w2
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned long v3;  // x10
    unsigned int v30;  // w16
    unsigned long long v31;  // 4105
    unsigned long long v32;  // 4105
    unsigned long v33;  // x14
    unsigned long long v34;  // 4108
    unsigned long long v35;  // 4108
    unsigned long long v36;  // 4172
    void* v37;  // x15
    char *iter2;  // x9
    unsigned int l;  // x8
    char *v40;  // x9
    unsigned int v41;  // x8
    void* v5;  // x10
    unsigned int k;  // w8
    unsigned long long v7;  // x9
    unsigned long v8;  // x10
    unsigned long v9;  // x11

    v0 = (int)a1;
    v1 = *(int *)((char *)a0 + ((long long)(a1 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(a1, 3) & 0x7fffffff8 & 0x7ffffffff));
    if (!*(int *)((char *)a0 + ((long long)(a1 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(a1, 3) & 0x7fffffff8 & 0x7ffffffff)))
    {
        v2 = a0 + v0 * 8 - 8;
        do
        {
            v3 = v2;
            v0 -= 1;
            v1 = *(int *)v3;
            v2 = v3 - 8;
        } while (!*(int *)v3);
        a1 = v0;
    }
    v5 = a0 + v0 * 8;
    k = (unsigned int)a1 + 0xff;
    *(unsigned int *)&a0[0x800] = *(int *)((char *)v5 - 8) + v1;
    *(unsigned short *)((char *)v5 - 4) = 0x100;
    *(unsigned short *)&v5[4] = 0x100;
    if (1 >= (int)a1)
    {
        *(unsigned int *)((char *)a0 - 8) = 0x80000000;
        *((char *)a0 + 8 * k + 7) = 0;
    }
    else
    {
        v7 = (unsigned int)a1 - 2;
        v8 = 0x101;
        if (0x101 < (int)k)
            v9 = k;
        else
            v9 = 0x101;
        v10 = v9 - 0x100;
        if (v10 >= 2)
        {
            v11 = v10 & 0xfffffffffffffffe;
            v8 = v11 + 0x101;
            iter = a0 + 2064;
            i = v11;
            do
            {
                v14 = i;
                *(unsigned int *)((char *)iter - 8) = 0x40000000;
                *iter = 0x40000000;
                iter += 4;
                i = v14 - 2;
            } while (i);
            if (v10 == v11)
                goto LABEL_79f90;
        }
        node = a0 + v8 * 8;
        j = v9 - v8 + 1;
        do
        {
            v18 = j;
            *(unsigned int *)node = 0x40000000;
            node += 8;
            j = v18 - 1;
        } while (j);
LABEL_79f90:
        *(unsigned int *)((char *)a0 - 8) = 0x80000000;
        iter1 = a0 + 0x808;
        v21 = 0x100;
        v22 = 0x101;
        do
        {
            v23 = *(int *)((char *)a0 + ((long long)(v7 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v7, 3) & 0x7fffffff8 & 0x7ffffffff));
            idx = (int)v7;
            index = (int)v21;
            v26 = *(int *)((char *)a0 + ((long long)(v21 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v21, 3) & 0x7fffffff8 & 0x7ffffffff));
            if ((unsigned int)*(int *)((char *)a0 + ((long long)(v21 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v21, 3) & 0x7fffffff8 & 0x7ffffffff)) <= (unsigned int)*(int *)((char *)a0 + ((long long)(v7 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v7, 3) & 0x7fffffff8 & 0x7ffffffff)))
            {
                index += 1;
                v26 = *(int *)((char *)a0 + 8 * index);
                v27 = v21;
                v21 = index;
            }
            else
            {
                idx -= 1;
                v23 = *(int *)((char *)a0 + 8 * idx);
                v27 = v7;
                v7 = idx;
            }
            v28 = v23;
            v29 = v26;
            if (v26 <= v23)
            {
                v30 = v26;
                v31 = arm64g_calculate_condition(35, v28, v29, 0);
                if (!(v31 & 1))
                    goto LABEL_79fce;
                goto LABEL_79fcd;
            }
            else
            {
                v30 = v23;
                v32 = arm64g_calculate_condition(35, v28, v29, 0);
                if (v32 & 1)
                {
LABEL_79fcd:
                    v33 = index;
                    v34 = arm64g_calculate_condition(35, v28, v29, 0);
                    if (!(v34 & 1))
                        goto LABEL_79fd2;
                    goto LABEL_79fd1;
                }
                else
                {
LABEL_79fce:
                    v33 = idx;
                    v35 = arm64g_calculate_condition(35, v28, v29, 0);
                    if (v35 & 1)
                    {
LABEL_79fd1:
                        v7 &= 0xffffffff;
                        continue;
                    }
                    else
                    {
LABEL_79fd2:
                        v7 = (unsigned int)v7 - 1;
                    }
                }
            }
            v36 = arm64g_calculate_condition(0x33, v28, v29, 0);
            v21 = (v36 & 1 ? (unsigned int)v21 : (unsigned int)v21 + 1);
            v37 = a0 + v27 * 8;
            *iter1 = v30 + *(int *)v37;
            iter1 += 2;
            *(unsigned short *)((char *)a0 + 8 * v33 + 4) = v22;
            *(unsigned short *)&v37[4] = v22;
            v22 += 1;
        } while (0x100 - v9 + v22 != 0x101);
        *((char *)a0 + 8 * k + 7) = 0;
        iter2 = a0 + ((unsigned int)a1 + 254) * 8 + 7;
        do
        {
            *iter2 = *((char *)a0 + 8 * *(short *)(iter2 - 3) + 7) + 1;
            iter2 -= 8;
            k -= 1;
        } while (0x100 < (int)k);
    }
    if (a1 >> 31 & 1)
        return a1;
    l = (unsigned int)a1 + 1;
    v40 = a0 + 7;
    do
    {
        v41 = l;
        *v40 = *((char *)a0 + 8 * *(short *)(v40 - 3) + 7) + 1;
        v40 += 8;
        l = v41 - 1;
    } while (l);
    return a1;
}
