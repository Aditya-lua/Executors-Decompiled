/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e7168..0x9e7384 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e7168(unsigned long long a0, unsigned long long a1, unsigned long long *a2, int a3, unsigned long long a4)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x21
    unsigned long long v12;  // x11
    unsigned long long v13;  // x11
    unsigned long long v14;  // x10
    unsigned long long i;  // x9
    unsigned long v16;  // x19
    unsigned long long *v17;  // x9
    unsigned long long *iter;  // x8
    unsigned long long *v19;  // x9
    unsigned long v20;  // x19
    unsigned long long *v21;  // x9
    unsigned long long v4;  // x20
    unsigned long long v22;  // x10
    unsigned long long v23;  // 4112
    unsigned long long v24;  // x9
    unsigned long long *node;  // x8
    unsigned long iter1;  // x9
    unsigned long long v27;  // x10
    unsigned long long v28;  // 4112
    unsigned long long v29;  // x10
    unsigned long long v30;  // 4112
    unsigned long long v31;  // x10
    unsigned long long v5;  // x0
    unsigned long long v32;  // 4112
    unsigned long long v33;  // x10
    unsigned long long v34;  // 4115
    unsigned long index;  // x9
    unsigned long long *v7;  // x8
    unsigned long long v8;  // x8
    unsigned long idx;  // x10
    unsigned long long *v10;  // x9
    unsigned long long v11;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a4;
    v3 = a1;
    v4 = a0;
    v5 = sub_9dbbc8();
    if (!(unsigned int)v2)
        return v5;
    index = a3;
    v7 = v4 + a3 * 8;
    if (!(v2 >> 31 & 1))
    {
        if (v5)
        {
            v8 = index * 8;
            do
            {
                idx = v3 + v8;
                v10 = v4 + v8;
                v11 = *(long long *)idx;
                *v10 = v11 - v5;
                if (v11)
                    v5 = 0;
                if ((int)v2 < 2)
                    return v5;
                v12 = *(long long *)(idx + 8);
                v10[1] = v12 - v5;
                if (v12)
                    v5 = 0;
                if ((unsigned int)v2 == 2)
                    return v5;
                v13 = *(long long *)(idx + 16);
                v10[2] = v13 - v5;
                if (v13)
                    v5 = 0;
                if ((unsigned int)v2 < 4)
                    return v5;
                v14 = *(long long *)(idx + 24);
                v10[3] = v14 - v5;
                if (!v14)
                    i = v5;
                else
                    i = 0;
                v16 = (unsigned int)v2 - 4;
                if ((unsigned int)v2 == 4)
                    return i;
                v3 += 32;
                v4 += 32;
                v2 = v16;
            } while (i);
            v17 = v3 + v8;
            v7 = v4 + v8;
            v2 = v16;
        }
        else
        {
            v17 = v3 + index * 8;
        }
        *v7 = *v17;
        if ((unsigned int)v2 == 1)
            return 0;
        iter = v7 + 2;
        v19 = v17 + 4;
        while (1)
        {
            *(long long *)((char *)iter - 8) = *(long long *)((char *)v19 - 24);
            if ((unsigned int)v2 == 2 || !(*iter = *(long long *)((char *)v19 - 16), (unsigned int)v2 >= 4))
                break;
            iter[1] = *(long long *)((char *)v19 - 8);
            v20 = (unsigned int)v2 - 4;
            if ((unsigned int)v2 == 4)
                return 0;
            v21 = v19 + 4;
            iter[2] = *v19;
            iter += 4;
            v2 = v20;
            v19 = v21;
            if (1 >= (unsigned int)v2)
                return 0;
        }
        return 0;
    }
    else
    {
        v22 = a2[index];
        *v7 = -v5 - v22;
        if (v22)
            v5 = 1;
        v23 = arm64g_calculate_condition(1, v2 & 0xffffffff, 1, 0);
        if (v23 & 1)
            return v5;
        v24 = index * 8;
        node = v24 + v4 + 16;
        iter1 = v24 + (char *)a2 + 32;
        while (1)
        {
            v27 = *(long long *)(iter1 - 24);
            *(unsigned long long *)((char *)node - 8) = -v5 - v27;
            if (v27)
                v5 = 1;
            v28 = arm64g_calculate_condition(1, v2 & 0xffffffff, 2, 0);
            if (v28 & 1)
                return v5;
            v29 = *(long long *)(iter1 - 16);
            *node = -v29 - v5;
            if (v29)
                v5 = 1;
            v30 = arm64g_calculate_condition(129, v2 & 0xffffffff, 4, 0);
            if (v30 & 1)
                return v5;
            v31 = *(long long *)(iter1 - 8);
            node[1] = -v31 - v5;
            if (v31)
                v5 = 1;
            v32 = arm64g_calculate_condition(1, v2 & 0xffffffff, 4, 0);
            if (v32 & 1)
                return v5;
            v2 = (unsigned int)v2 + 4;
            v33 = *(long long *)iter1;
            iter1 += 32;
            node[2] = -v33 - v5;
            if (v33)
                v5 = 1;
            node += 4;
            v34 = arm64g_calculate_condition(0x11, v2 & 0xffffffff, 1, 0);
            if (!(v34 & 1))
                return v5;
        }
    }
}
