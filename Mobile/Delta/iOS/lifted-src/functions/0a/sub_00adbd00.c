/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadbd00..0xadbf8c (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_adbd00(void* a0, char *a1, unsigned long long a2)
{
    unsigned long long node;  // x21
    char *iter;  // x19
    unsigned long long v12;  // 4114
    void* v13;  // x0
    char *v14;  // x22
    unsigned long long v15;  // x26
    unsigned long long v16;  // x8
    unsigned int v17;  // w28
    char *v18;  // x19
    unsigned long long v19;  // w8
    char *v20;  // x19
    char *v21;  // x22
    unsigned long long iter1;  // x24
    unsigned long long v22;  // x23
    void* v23;  // x0
    unsigned long long v24;  // x8
    long long ptr;  // x0
    void* dst;  // x0
    long long n;  // x21
    unsigned long long v5;  // x23
    unsigned long long v6;  // w25
    unsigned long v7;  // x8
    unsigned long long v8;  // 4199
    unsigned long v9;  // x8
    unsigned long long v10;  // 4114
    unsigned long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    node = a2;
    iter = a1;
    iter1 = (int)a0[128];
    v5 = iter1 & 7;
    v6 = -(unsigned int)node & 7;
    v7 = (long long)a0[0x88];
    *(unsigned long long *)&a0[0x88] = v7 + a2;
    v8 = arm64g_calculate_condition(50, v7, a2, 0);
    if (!(v8 & 1))
    {
        v9 = (long long)a0[144];
        *(unsigned long *)&a0[144] = v9 + 1;
        v10 = arm64g_calculate_condition(50, v9, 1, 0);
        if (!(v10 & 1))
        {
            v11 = (long long)a0[152];
            *(unsigned long *)&a0[152] = v11 + 1;
            v12 = arm64g_calculate_condition(50, v11, 1, 0);
            if (!(v12 & 1))
                *(long long *)&a0[160] = (long long)a0[160] + 1;
        }
    }
    v13 = a0;
    if (v6 || (unsigned int)v5)
    {
        if (node)
        {
            v14 = a0 + 64;
            v15 = 8 - v5;
            v13 = a0;
            while (1)
            {
                v16 = (iter1 & 0xffffffff) >> 3;
                if ((unsigned int)v5 == v6)
                    break;
                v17 = *iter << ((char)v6 & 31);
                if (node >= 9)
                {
                    v18 = iter + 1;
                    v17 |= iter[1] >> ((char)(8 - v6) & 31);
                    if ((unsigned int)v5)
                        v14[v16] = v14[v16] | (char)((v17 & 0xff) >> ((char)v5 & 31));
                    else
                        v14[v16] = v17;
                    iter1 = (unsigned int)iter1 + 8;
                    if ((unsigned int)iter1 >= 0x200)
                    {
                        v13 = sub_adb158(a0, v14, 1);
                        v19 = 0;
                        iter1 = (unsigned int)iter1 & 0x1ff;
                    }
                    else
                    {
                        v19 = (unsigned int)v16 + 1;
                    }
                    node -= 8;
                    iter = v18;
                    if (!(unsigned int)v5)
                        goto LABEL_adbd9c;
                }
                else
                {
                    if ((unsigned int)v5)
                        v14[v16] = v14[v16] | (char)((v17 & 0xff) >> ((char)v5 & 31));
                    else
                        v14[v16] = v17;
                    iter1 += node;
                    if ((unsigned int)iter1 == 0x200)
                    {
                        v13 = sub_adb158(a0, v14, 1);
                        iter1 = 0;
                        v19 = 0;
                        node = 0;
                        v18 = iter;
                        if (!(unsigned int)v5)
                            goto LABEL_adbd9c;
                    }
                    else
                    {
                        v19 = (unsigned int)v16 + 1;
                        node = 0;
                        v18 = iter;
                        if (!(unsigned int)v5)
                            goto LABEL_adbd9c;
                    }
                }
                v14[v19] = v17 << ((char)v15 & 31);
                v18 = iter;
LABEL_adbd9c:
                *(unsigned int *)&a0[128] = iter1;
                iter = v18;
                if (!node)
                    return v13;
            }
            v20 = iter + 1;
            v14[v16] = *iter & (char)(0xff >> ((char)v5 & 31)) | v14[v16];
            iter1 += v15;
            node -= v15;
            if ((unsigned int)iter1 == 0x200)
            {
                v13 = sub_adb158(a0, v14, 1);
                iter1 = 0;
            }
            *(unsigned int *)&a0[128] = iter1;
            iter = v20;
        }
        else
        {
            return a0;
        }
    }
    if (!node)
        return v13;
    v21 = a0 + 64;
    while (1)
    {
        if (!(unsigned int)iter1 && 0x200 <= node)
        {
            v22 = node >> 9;
            v23 = sub_adb158(a0, iter, v22);
            iter1 = 0;
            iter = &iter[64 * v22];
            node &= 0x1ff;
            if (!node)
                return v23;
        }
        else
        {
            v24 = 0x200 - iter1;
            ptr = &v21[(unsigned int)iter1 >> 3];
            if (v24 > node)
            {
                dst = _memcpy(ptr, iter, node >> 3);
                iter1 += node;
                node = 0;
            }
            else
            {
                n = ((unsigned int)v24 * 0 | (unsigned int)(v24 >> 3)) & 0x1fffffff;
                _memcpy(ptr, iter, n);
                iter = &iter[n];
                dst = sub_adb158(a0, v21, 1);
                iter1 = 0;
                node -= v24;
            }
            *(unsigned int *)&a0[128] = iter1;
            if (!node)
                return dst;
        }
    }
}
