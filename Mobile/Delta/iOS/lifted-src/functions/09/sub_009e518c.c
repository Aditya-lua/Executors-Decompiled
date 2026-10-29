/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e518c..0x9e5350 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e518c(void* a0, char *a1, unsigned long long a2, unsigned int a3, unsigned int a4)
{
    unsigned long long v5;  // x19
    char *iter;  // x21
    unsigned long v15;  // x8
    unsigned long v16;  // x8
    unsigned long long *v17;  // x9
    unsigned long long *v18;  // x9
    unsigned int v19;  // w0
    unsigned long long v20;  // 4162
    unsigned long v21;  // x12
    unsigned long v22;  // x8
    unsigned long v23;  // x9
    unsigned long i;  // x10
    unsigned int v7;  // w0
    char *v25;  // x11
    long long v26;  // x13
    unsigned long v27;  // x10
    char v28;  // x14
    char v29;  // x14
    unsigned long long v8;  // 4125
    unsigned long long v9;  // x8
    char v10;  // x23
    unsigned int v11;  // w24
    unsigned long v12;  // x25
    unsigned long long v13;  // x8
    unsigned long long v14;  // 4121
    unsigned long long *v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x60], Other Possible Types: unsigned long
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    iter = a1;
    v7 = sub_9e46a8();
    v8 = arm64g_calculate_condition(177, v7, 7, 0);
    v9 = (int)((v8 & 1 ? v7 + 14 : v7 + 7)) >> 3;
    if (a4)
    {
        v10 = 0;
        v11 = 0;
        v12 = 0;
    }
    else
    {
        v11 = (int)a0[16];
        if (!v11)
            v10 = 0;
        else
            v10 = 0xff;
        if (v7 == (unsigned int)v9 * 8)
            v12 = !v11;
        else
            v12 = v11;
    }
    v13 = v12 + v9;
    v14 = arm64g_calculate_condition(1, v5 & 0xffffffff, 1, 0);
    if (v14 & 1)
    {
        v5 = v13;
    }
    else if ((int)v13 > (int)v5)
    {
        v0 = (unsigned long long *)*(int128_t *)a0;
        v2 = (long long)a0[16];
        v15 = *(unsigned int *)((void*)&v0 + 8);
        v16 = v15;
        if ((int)v16 >= 1)
        {
            v17 = (unsigned long long)v0 + v15 * 8 - 8;
            while (1)
            {
                v16 = v15;
                v18 = (char *)v17 - 8;
                if (*v17)
                    break;
                v15 = (unsigned int)v16 - 1;
                v17 = v18;
                if (1 >= (int)v16)
                {
                    v16 = 0;
                    break;
                }
            }
            v1 = v16;
        }
        if (!(unsigned int)v16)
            v2 = 0;
        v19 = sub_9e46a8(&v0);
        v20 = arm64g_calculate_condition(177, v19, 7, 0);
        if ((int)((unsigned int)v12 + ((int)((v20 & 1 ? v19 + 14 : v19 + 7)) >> 3)) > (int)v5)
            return 0xffffffff;
    }
    v21 = (int)a0[12];
    if ((unsigned int)v21)
    {
        v22 = 1;
        if (a3 != 1)
            v22 = 0xfffffffffffffffe;
        if (!(unsigned int)v5)
            return v5;
        v23 = 0;
        i = (int)v5;
        v25 = &iter[i] - 1;
        if (a3 != 1)
            iter = v25;
        v26 = -((int)a0[8] * 8);
        do
        {
            v27 = i;
            v28 = (char)(v26 >> 63) & (char)((unsigned long long)(*(long long *)(*(long long *)a0 + (v23 & 0xfffffffffffffff8))) >> (((char)v23 * 8 | (char)(v23 >> 61)) & 56 & 63)) ^ v10;
            v29 = v28 + (char)v11;
            *iter = v29;
            v11 = v28 > v29;
            iter = &iter[v22];
            v23 += v23 - v21 * 8 + 1 >> 63;
            v26 += 1;
            i = v27 - 1;
        } while (i);
        return v5;
    }
    else
    {
        if (!(unsigned int)v5)
            return v5;
        _bzero(iter, (int)v5);
        return v5;
    }
}
