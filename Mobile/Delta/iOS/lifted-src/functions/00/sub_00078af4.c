/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x78af4..0x78ce8 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_78af4(void* a0, char a1, void* a2, unsigned long a3, unsigned int a4, unsigned short a5)
{
    unsigned long v0;  // x8
    unsigned int v1;  // w13
    void* iter;  // x13
    unsigned long node;  // x3
    unsigned long v12;  // x9
    unsigned long long v13;  // 4117
    unsigned long v14;  // x15
    unsigned int v15;  // w8
    unsigned int v16;  // w10
    unsigned int v17;  // w11
    unsigned int v18;  // w12
    unsigned long v19;  // cc_dep1
    unsigned int v2;  // w10
    unsigned long v20;  // cc_dep2
    unsigned long long v21;  // 4108
    unsigned long long v22;  // 4108
    unsigned int v23;  // w11
    char v24;  // x8
    unsigned long long v25;  // x10
    unsigned long long v26;  // x10
    unsigned long index;  // x12
    unsigned long long v28;  // 4129
    unsigned long long v29;  // x11
    unsigned long v3;  // x3
    unsigned int v30;  // w10
    unsigned int v31;  // w13
    unsigned int v32;  // w10
    unsigned long idx;  // x8
    unsigned int v34;  // w10
    unsigned long v4;  // x14
    unsigned long idx1;  // x13
    unsigned long long v6;  // x11
    unsigned long long v7;  // x9
    unsigned long v8;  // x9
    void* iter1;  // x12

    v0 = 0;
    v1 = 0;
    v2 = a3 * 3 >> (a1 + 1 & 63);
    v3 = a3;
    do
    {
        v4 = *(int *)((char *)a2 + 4 * v1);
        idx1 = v1;
        if (!(unsigned int)v4)
        {
            *(unsigned short *)((char *)a0 + 2 * idx1) = 0;
            continue;
        }
        else
        {
            if ((unsigned int)v4 <= (unsigned int)(a3 >> (a1 & 63)))
            {
                *(unsigned short *)((char *)a0 + 2 * idx1) = a5;
            }
            else if ((unsigned int)v4 > v2)
            {
                *(unsigned short *)((char *)a0 + 2 * idx1) = 0xfffe;
                continue;
            }
            else
            {
                *(unsigned short *)((char *)a0 + 2 * idx1) = 1;
            }
            v0 = (unsigned int)v0 + 1;
            v3 -= v4;
        }
    } while ((v1 = (unsigned int)idx1 + 1, a4 >= v1));
    v6 = 1 << (a1 & 31);
    v7 = v6 - v0;
    if ((unsigned int)v6 == (unsigned int)v0)
        return 0;
    if (v3 / v7 > v2)
    {
        v8 = a4 + 1;
        iter1 = a2;
        iter = a0;
        node = v3;
        do
        {
            v12 = v8;
            v13 = arm64g_calculate_condition(0x11, *(short *)iter, 2, 0);
            if (!(v13 & 1))
            {
                v14 = *(int *)iter1;
                if ((unsigned int)(v3 * 3 / ((unsigned int)v7 * 2)) >= (unsigned int)v14)
                {
                    *(unsigned short *)iter = 1;
                    v0 = (unsigned int)v0 + 1;
                    node -= v14;
                }
            }
        } while ((iter += 2, iter1 += 4, v8 = v12 - 1, v12 != 1));
        v7 = v6 - v0;
        v3 = node;
    }
    if ((unsigned int)v0 == a4 + 1)
    {
        v15 = 0;
        v16 = 0;
        v17 = 0;
        do
        {
            v18 = *(int *)((char *)a2 + 4 * v17);
            v19 = v18;
            v20 = v16;
            if (v16 < v18)
            {
                v15 = v17;
                v21 = arm64g_calculate_condition(131, v19, v20, 0);
                if (!(v21 & 1))
                    goto LABEL_78c06;
                goto LABEL_78c05;
            }
            else
            {
                v15 = v15;
                v22 = arm64g_calculate_condition(131, v19, v20, 0);
                if (v22 & 1)
                {
LABEL_78c05:
                    v16 = v18;
                    continue;
                }
                else
                {
LABEL_78c06:
                }
            }
        } while ((v17 += 1, v17 <= a4));
        *(unsigned short *)((char *)a0 + 2 * v15) = *(short *)((char *)a0 + 2 * v15) + (unsigned short)v7;
        return 0;
    }
    else if (v3)
    {
        v23 = 0;
        v24 = 62 - a1;
        v25 = ~(0xffffffffffffffff << (v24 - 1 & 63));
        v26 = v25;
        while (1)
        {
            index = v23;
            v28 = arm64g_calculate_condition(0x11, *(short *)((char *)a0 + 2 * v23), 2, 0);
            if (!(v28 & 1))
            {
                v29 = v26 + *(int *)((char *)a2 + 4 * index) * (((v7 & 0xffffffff) << (v24 & 63)) + v25) / (v3 & 0xffffffff);
                v30 = v26 >> (v24 & 63);
                v31 = v29 >> (v24 & 63);
                if (v31 == v30)
                    return 0xffffffffffffffff;
                *(unsigned short *)((char *)a0 + 2 * index) = v31 - v30;
                v26 = v29;
            }
            v23 = (unsigned int)index + 1;
            if (a4 < v23)
                return 0;
        }
    }
    else if ((unsigned int)v7)
    {
        v32 = 0;
        do
        {
            idx = v32;
            v34 = *(short *)((char *)a0 + 2 * v32);
            if ((int)v34 >= 1)
            {
                v7 = (unsigned int)v7 - 1;
                *(unsigned short *)((char *)a0 + 2 * idx) = (unsigned short)v34 + 1;
            }
            if ((unsigned int)idx == a4)
                v32 = 0;
            else
                v32 = (unsigned int)idx + 1;
        } while ((unsigned int)v7);
        return 0;
    }
    else
    {
        return 0;
    }
}
