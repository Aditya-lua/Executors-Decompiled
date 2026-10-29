/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb64fe4..0xb659ec (2568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_e05f16;
extern unsigned short g_e05f54;
extern unsigned short g_e05f92;
extern unsigned short g_e05fd2;
extern char g_10002b0;

unsigned int sub_b64fe4(unsigned int a0, unsigned short *a1, unsigned int a2, void* *a3, unsigned int *a4, unsigned short *a5)
{
    unsigned short *v27;  // x9
    void* v28;  // x9
    void* v29;  // x9
    unsigned short *v30;  // x12
    unsigned long idx;  // x10
    unsigned int *v32;  // x9
    unsigned int v33;  // x8
    unsigned int v0;  // [bp-0xec]
    unsigned int v1;  // [bp-0xe4]
    unsigned short *v2;  // [bp-0xe0]
    unsigned short *v3;  // [bp-0xd8]
    void* node;  // [bp-0xd0]
    unsigned int v5;  // [bp-0xc4]
    unsigned int v6;  // [bp-0xc0]
    unsigned int v7;  // [bp-0xbc]
    unsigned int m;  // [bp-0xb8]
    unsigned int n;  // [bp-0xb4]
    unsigned int v10;  // [bp-0xb0]
    unsigned int v11;  // [bp-0xac]
    unsigned int i0;  // [bp-0xa8]
    unsigned int v13;  // [bp-0xa4]
    unsigned int v14;  // [bp-0xa0]
    unsigned int v15;  // [bp-0x9c]
    unsigned int k;  // [bp-0x98]
    unsigned int l;  // [bp-0x94]
    unsigned int iter1;  // [bp-0x90]
    unsigned int iter;  // [bp-0x8c]
    unsigned int v20;  // [bp-0x5c]
    char v21;  // [bp-0x58]
    unsigned int v22;  // [bp-0x56]
    char v23;  // [bp-0x38]
    unsigned long v24;  // [bp-0x18]
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v24 = *(long long *)&g_10002b0;
    for (iter = 0; iter <= 15; iter += 1)
    {
        *(unsigned short *)&(&v23)[2 * iter] = 0;
    }
    for (iter1 = 0; iter1 < a2; iter1 += 1)
    {
        v27 = &(&v23)[2 * a1[iter1]];
        *v27 = *v27 + 1;
    }
    v15 = *a4;
    for (k = 15; 1 <= k && !*(short *)&(&v23)[2 * k]; k -= 1);
    if (k < v15)
        v15 = k;
    if (!k)
    {
        *(char *)&v5 = 64;
        *((char *)&v5 + 1) = 1;
        *(unsigned short *)((char *)&v5 + 2) = 0;
        v28 = *a3;
        *a3 = v28 + 4;
        *(unsigned int *)v28 = v5;
        v29 = *a3;
        *a3 = v29 + 4;
        *(unsigned int *)v29 = v5;
        *a4 = 1;
        v20 = 0;
    }
    else
    {
        for (l = 1; l < k && !*(short *)&(&v23)[2 * l]; l += 1);
        if (v15 < l)
            v15 = l;
        i0 = 1;
        iter = 1;
        while (1)
        {
            if (iter <= 15)
            {
                i0 *= 2;
                i0 -= *(short *)&(&v23)[2 * iter];
                if ((int)i0 < 0)
                {
                    v20 = 0xffffffff;
                    break;
                }
                else
                {
                    iter += 1;
                }
            }
            else if (0 < (int)i0 && (!a0 || k != 1))
            {
                v20 = 0xffffffff;
                break;
            }
            else
            {
                v22 = 0;
                for (iter = 1; iter < 15; iter += 1)
                {
                    *(short *)&(&v21)[2 + 2 * iter] = *(short *)&(&v21)[2 * iter] + *(short *)&(&v23)[2 * iter];
                }
                for (iter1 = 0; iter1 < a2; iter1 += 1)
                {
                    if (a1[iter1])
                    {
                        v30 = &(&v21)[2 * a1[iter1]];
                        idx = *v30;
                        *v30 = (unsigned short)idx + 1;
                        a5[idx] = iter1;
                    }
                }
                if (!a0)
                {
                    v2 = a5;
                    v3 = v2;
                    v1 = 20;
                }
                else if (a0 == 1)
                {
                    v3 = &g_e05f16;
                    v2 = &g_e05f54;
                    v1 = 0x101;
                }
                else
                {
                    v3 = &g_e05f92;
                    v2 = &g_e05fd2;
                    v1 = 0;
                }
                v10 = 0;
                iter1 = 0;
                iter = l;
                node = *a3;
                v14 = v15;
                v13 = 0;
                v7 = 0xffffffff;
                v11 = 1 << ((char)v15 & 31);
                v6 = v11 - 1;
                if (a0 == 1 && v11 > 852 || a0 == 2 && 592 < v11)
                {
                    v20 = 1;
                    break;
                }
                else
                {
                    while (1)
                    {
                        *((char *)&v5 + 1) = iter - v13;
                        if (a5[iter1] + 1 < v1)
                        {
                            *(char *)&v5 = 0;
                            *(unsigned short *)((char *)&v5 + 2) = a5[iter1];
                        }
                        else
                        {
                            if (v1 <= a5[iter1])
                            {
                                *(char *)&v5 = v2[a5[iter1] - v1 & 0xffffffff];
                                *(unsigned short *)((char *)&v5 + 2) = v3[a5[iter1] - v1 & 0xffffffff];
                            }
                            else
                            {
                                *(char *)&v5 = 96;
                                *(unsigned short *)((char *)&v5 + 2) = 0;
                            }
                        }
                        n = 1 << ((char)(iter - v13) & 31);
                        m = 1 << ((char)v14 & 31);
                        l = m;
                        do
                        {
                            m -= n;
                            *(unsigned int *)((char *)node + 4 * ((v10 >> ((char)v13 & 31)) + m & 0xffffffff)) = v5;
                        } while (m);
                        for (n = 1 << ((char)(iter - 1) & 31); v10 & n; n >>= 1);
                        if (n)
                        {
                            v10 &= n - 1;
                            v10 += n;
                        }
                        else
                        {
                            v10 = 0;
                        }
                        iter1 += 1;
                        v32 = &(&v23)[2 * iter];
                        v33 = 0xffff + *(short *)v32;
                        *(unsigned short *)v32 = v33;
                        if (!v33)
                        {
                            if (iter != k)
                            {
                                iter = a1[a5[iter1]];
                            }
                            else
                            {
                                if (v10)
                                {
                                    *(char *)&v5 = 64;
                                    *((char *)&v5 + 1) = iter - v13;
                                    *(unsigned short *)((char *)&v5 + 2) = 0;
                                    *(unsigned int *)((char *)node + 4 * v10) = v5;
                                }
                                *a3 = *a3 + v11 * 4;
                                *a4 = v15;
                                v20 = 0;
                                break;
                            }
                        }
                        if (v15 < iter && (v10 & v6) != v7)
                        {
                            if (!v13)
                                v13 = v15;
                            node += l * 4;
                            v14 = iter - v13;
                            for (i0 = 1 << ((char)v14 & 31); v14 + v13 < k && (i0 -= *(short *)&(&v23)[2 * (v14 + v13 & 0xffffffff)], (int)i0 > 0); i0 *= 2)
                            {
                                v14 += 1;
                            }
                            v11 += 1 << ((char)v14 & 31);
                            if (a0 == 1 && v11 > 852 || a0 == 2 && 592 < v11)
                            {
                                v20 = 1;
                                break;
                            }
                            else
                            {
                                v7 = v10 & v6;
                                *((char *)*a3 + 4 * v7) = v14;
                                *((char *)*a3 + 4 * v7 + 1) = v15;
                                *(unsigned short *)((char *)*a3 + 4 * v7 + 2) = (node - *a3) / 4;
                            }
                        }
                    }
                }
            }
        }
    }
    v0 = v20;
    if (*(long long *)&g_10002b0 != v24)
        ___stack_chk_fail();
    return v0;
}
