/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x78ce8..0x79064 (892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e6ae30;

unsigned long long sub_78ce8(unsigned short *a0, unsigned short *a1, unsigned int a2, unsigned int a3, unsigned short *a4, unsigned long a5)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // x6
    unsigned int v10;  // w7
    unsigned long long v11;  // x16
    unsigned long long v12;  // x17
    unsigned long long v13;  // x0
    unsigned long long v14;  // x6
    unsigned long long v15;  // x21
    unsigned long long v16;  // x22
    unsigned long v17;  // x22
    unsigned long long v18;  // x22
    unsigned long v19;  // x23
    unsigned long v2;  // x13
    unsigned long long v20;  // x24
    uint128_t v21;  // q0
    uint128_t *iter;  // x25
    unsigned long long k;  // x26
    unsigned long long v24;  // x26
    unsigned long long *v26;  // x23
    unsigned long long l;  // x22
    unsigned long long *node;  // x23
    unsigned long long v29;  // x15
    unsigned long v3;  // x14
    unsigned long long v30;  // x17
    unsigned long long v31;  // w0
    unsigned int v32;  // w5
    unsigned long long m;  // w6
    unsigned long long v34;  // x17
    unsigned long long i;  // x16
    unsigned long long v36;  // x7
    unsigned long long v37;  // x20
    unsigned long long v38;  // x20
    char *v4;  // x10
    unsigned long long v40;  // x11
    unsigned long index;  // x14
    unsigned long idx;  // x15
    unsigned int v44;  // w15
    unsigned long v45;  // cc_dep1
    unsigned long long v46;  // x14
    unsigned long long v47;  // 4122
    unsigned long long v48;  // 4122
    unsigned long long v49;  // 4112
    unsigned long long j;  // x11
    unsigned long long v50;  // 4106
    unsigned long long v51;  // 4112
    unsigned long long v52;  // 4106
    unsigned long long v53;  // x16
    unsigned long long v6;  // x15
    unsigned long long iter1;  // w17
    unsigned long long n;  // w16
    unsigned long idx1;  // x5

    v0 = 1 << ((char)a3 & 63);
    v1 = a2 + 2;
    if (((v0 + v1) * 2 & 0xfffffffffffffffc) + 8 > a5)
        return 0xffffffffffffffd4;
    v2 = (unsigned int)v0 - 1;
    v3 = (((unsigned int)v0 * 0 | (unsigned int)(v0 >> 1)) & 0x7fffffff) + ((unsigned int)v0 >> 3) + 3;
    v4 = &a4[v1 & 0xffffffff];
    *a0 = a3;
    a0[1] = a2;
    *a4 = 0;
    j = v0 & 0xffffffff;
    v6 = a2 + 1;
    if ((unsigned int)v6)
    {
        iter1 = 1;
        n = (unsigned int)v2;
        while (1)
        {
            idx1 = iter1 - 1;
            v10 = a1[idx1 & 0xffffffff];
            if (v10 != 0xffff)
            {
                a4[iter1] = a4[idx1] + (unsigned short)v10;
                iter1 += 1;
                if ((unsigned int)v6 < iter1)
                    break;
            }
            else
            {
                a4[iter1] = a4[idx1] + 1;
                v4[n] = idx1;
                n -= 1;
                iter1 += 1;
                if (iter1 > (unsigned int)v6)
                    break;
            }
        }
        a4[v6 & 0xffffffff] = (unsigned short)v0 + 1;
        if (n == (unsigned int)v2)
        {
            v11 = 0;
            v12 = 0;
            v13 = 0;
            v14 = (char *)a4 + v0 + 2 * v1;
            do
            {
                v15 = a1[v11];
                *(unsigned long long *)&v4[v13 + v0] = v12;
                if ((long long)v15 < 9)
                    continue;
                if (16 < v15)
                    v16 = v15;
                else
                    v16 = 16;
                v17 = v16 - 9;
                if (24 > v17)
                {
                    v18 = 8;
                }
                else
                {
                    v19 = (v17 >> 3) + 1;
                    v20 = v19 & 0x3ffffffffffffffc;
                    v18 = (8 | ((v20 >> 2) * 32 | v20 >> 61) & 0x7fffffffffffffe0) & 0x7fffffffffffffff;
                    v21 = CONCAT(v12, v12);
                    iter = v14 + 24 + v13;
                    k = v20;
                    do
                    {
                        v24 = k;
                        *(uint128_t *)((char *)iter - 16) = v21;
                        *iter = v21;
                        iter += 2;
                        k = v24 - 4;
                    } while (k);
                    if (v19 == v20)
                        continue;
                }
                v26 = v14 + v13 + v18;
                *v26 = v12;
                l = v18 + 8;
                node = v26 + 1;
                if (v15 > l)
                {
                    do
                    {
                        *node = v12;
                        node += 1;
                        l += 8;
                    } while (l < v15);
                }
            } while ((v11 += 1, v12 += 0x101010101010101, v13 += v15, v11 != v6));
            v29 = v0;
LABEL_78f08:
            v34 = 0;
            i = 0;
            do
            {
                v36 = 0;
                v37 = 1;
                do
                {
                    v38 = v37;
                    v4[(unsigned int)v34 + (unsigned int)v3 * (unsigned int)v36 & v2] = v4[v36 + i + v29];
                    v36 = 1;
                    v37 = 0;
                } while (v38 & 1);
                v34 = v34 + ((v3 * 2 | v3 >> 63) & 0x1fffffffe & 0x1ffffffff) & v2;
                i += 2;
            } while (i < v29);
        }
        else
        {
            v30 = 0;
            v31 = 0;
            do
            {
                v32 = a1[v30];
                if ((int)v32 >= 1)
                {
                    m = 0;
                    do
                    {
                        v4[v31] = v30;
                        do
                        {
                            v31 = v31 + (unsigned int)v3 & (unsigned int)v2;
                        } while (n < v31);
                        m += 1;
                    } while (m != v32);
                }
            } while ((v30 += 1, v30 != v6));
        }
    }
    else
    {
        a4[v6 & 0xffffffff] = (unsigned short)v0 + 1;
        v29 = j;
        goto LABEL_78f08;
    }
    do
    {
        v40 = j;
        index = *v4;
        v4 += 1;
        idx = a4[index];
        a4[index] = (unsigned short)idx + 1;
        a0[2 + idx] = v0;
        v0 = (unsigned int)v0 + 1;
        j = v40 - 1;
    } while (j);
    v44 = *a1;
    v45 = v44;
    if (!v44)
    {
        v46 = 120;
        v47 = arm64g_calculate_condition(0x11, v44, 1, 0);
        if (!(v47 & 1))
            goto LABEL_78fb2;
LABEL_78fb1:
        v49 = arm64g_calculate_condition(19, v45, 0, 0);
        v50 = arm64g_calculate_condition(3, (v49 & 1 ? v44 : 0x40000000), v49 & 1, 0);
        if (!(v50 & 1))
            goto LABEL_78fba;
        v53 = 240;
LABEL_78fb9:
    }
    else
    {
        v46 = 112;
        v48 = arm64g_calculate_condition(0x11, v44, 1, 0);
        if (v48 & 1)
            goto LABEL_78fb1;
LABEL_78fb2:
        v51 = arm64g_calculate_condition(19, v45, 0, 0);
        v52 = arm64g_calculate_condition(0, (v51 & 1 ? v44 : 0x40000000), v51 & 1, 0);
        if (v52 & 1)
            goto LABEL_78fb9;
LABEL_78fba:
        v53 = v46;
    }
    goto *((void *)(*(long long *)((char *)&g_e6ae30 + v53)));
}
