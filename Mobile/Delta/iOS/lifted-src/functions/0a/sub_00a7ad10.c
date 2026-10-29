/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7ad10..0xa7afa0 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a7ad10(char *a0, unsigned long long i, unsigned int *a2, unsigned int *a3)
{
    unsigned long v5;  // x25
    unsigned long long v6;  // x9
    unsigned int v15;  // w27
    unsigned long long v16;  // x22
    unsigned long long v17;  // x15
    unsigned long long v18;  // x13
    unsigned int v19;  // w14
    unsigned long long v20;  // x9
    unsigned int v21;  // w16
    unsigned long v22;  // x15
    unsigned int v23;  // w16
    unsigned long long v24;  // x16
    unsigned long long v7;  // x8
    unsigned long long v25;  // x15
    unsigned long long v26;  // x28
    unsigned long long v27;  // x10
    unsigned long long v28;  // w11
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long long v31;  // w10
    unsigned long long v32;  // w11
    unsigned int j;  // w13
    unsigned long v34;  // x12
    unsigned long long v8;  // x9
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v39;  // x24
    unsigned int *ptr;  // x19
    unsigned int *iter;  // x10
    char *v10;  // x11
    unsigned long long v11;  // x9
    unsigned long v12;  // x12
    unsigned long long v13;  // w21
    unsigned long long v14;  // x10
    unsigned int *v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    char *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *a3;
    if (i)
    {
        v6 = 0;
        v7 = 0;
        do
        {
            if (a0[v6] == 45)
                v7 = v6 & 0xffffffff;
            else
                v7 &= 0xffffffff;
        } while ((v6 += 1, (v6 & 0xffffffff) < i));
        if (!(unsigned int)v7)
            goto LABEL_a7ad6c;
        if ((unsigned int)v7 > (unsigned int)v5)
            return 0;
        v8 = v7;
        iter = a2;
        v10 = a0;
        do
        {
            v11 = v8;
            v12 = *v10;
            v10 += 1;
            if (v12 >> 31 & 1)
                return 0;
        } while ((*iter = v12, iter += 1, v8 = v11 - 1, v11 != 1));
        v13 = (unsigned int)v7 + 1;
    }
    else
    {
LABEL_a7ad6c:
        v13 = 0;
        v7 = 0;
    }
    if (i > v13)
    {
        v14 = 0;
        v15 = 72;
        v16 = 128;
        do
        {
            v17 = v13;
            if (i <= v17)
                return 0;
            v13 = (unsigned int)v17 + 1;
            v18 = 1;
            v19 = 36;
            v20 = v14;
            while (1)
            {
                v21 = a0[v17];
                v22 = v21 - 65;
                if ((unsigned int)v22 > 25)
                {
                    v22 = v21 - 97;
                    if ((unsigned int)v22 > 25)
                    {
                        if (9 < v21 - 48)
                            return 0;
                        v22 = v21 - 22;
                    }
                }
                if (v22 >> 31 & 1)
                    return 0;
                if ((unsigned int)(~(unsigned int)v20 / v18) < (unsigned int)v22)
                    return 0;
                v20 = (unsigned int)v20 + (unsigned int)v18 * (unsigned int)v22;
                if (v19 < v15 + 26)
                    v23 = -v15 + v19;
                else
                    v23 = 26;
                if (v15 < v19)
                    v24 = v23;
                else
                    v24 = 1;
                if ((unsigned int)v22 < (unsigned int)v24)
                    break;
                v25 = 36 - v24;
                if ((unsigned int)v25 * (unsigned int)v18 & 0xffffffff00000000 || !(v18 *= v25, v19 += 36, v17 = v13, v13 += 1, v17 < i))
                    return 0;
            }
            v26 = v7 + 1;
            if ((unsigned int)v14)
                v27 = (unsigned int)(v20 - v14) >> 1;
            else
                v27 = (unsigned int)v20 / 700;
            v28 = (unsigned int)(v27 / v26) + (unsigned int)v27;
            v29 = v28;
            v30 = 456;
            if (v28 >= 456)
            {
                v31 = 0;
                do
                {
                    v32 = (unsigned int)(v28 * 3558687189 >> 32) + ((unsigned int)(v28 - (v28 * 3558687189 >> 32)) >> 1) >> 5;
                    v31 += 36;
                    j = v28 >> 3;
                    v29 = j;
                    v30 = 1994;
                    v28 = v32;
                } while (1994 < j);
            }
            else
            {
                v31 = 0;
                v32 = v28;
            }
            v34 = v20 / v26;
            if (v34 <= ~(unsigned int)v16)
            {
                v35 = arm64g_calculate_condition(147, v29, v30, 0);
                v36 = arm64g_calculate_condition(36, (v35 & 1 ? v7 : 0x20000000), (v35 & 1 ? v5 : 0), 0);
                if (v36 & 1)
                    return 0;
            }
            else
            {
                v37 = arm64g_calculate_condition(147, v29, v30, 0);
                v38 = arm64g_calculate_condition(32, (v37 & 1 ? v7 : 0x20000000), (v37 & 1 ? v5 : 0), 0);
                if (v38 & 1)
                    return 0;
            }
            v15 = v31 + (__ROL__(v32 * 9, 2) & 0xfffc & 0xffff) / (v32 + 38 & 0xffff);
            v39 = v20 - v26 * v34;
            v16 += v34;
            ptr = &a2[v39];
            v1 = i;
            v2 = a0;
            v0 = a2;
            _memmove(ptr + 1, ptr, (v7 - v39) * 4);
            i = v1;
            a0 = v2;
            a2 = v0;
            *ptr = v16;
            v14 = (unsigned int)v39 + 1;
            v7 = v26;
        } while (v13 < i);
    }
    else
    {
        v26 = v7;
    }
    *a3 = v26;
    return 1;
}
