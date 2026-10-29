/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x76ca4..0x76f64 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_76ca4_1 {
    char padding_0[2];
    unsigned long long field_2;
} st_76ca4_1;

typedef struct st_76ca4_0 {
    unsigned short field_0;
    unsigned long long field_2;
    unsigned short field_4;
    char field_6;
    char field_7;
} st_76ca4_0;

typedef struct st_76ca4_2 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_76ca4_2;


unsigned long long sub_76ca4(st_76ca4_0 *a0, short *a1, unsigned int a2, unsigned int a3, unsigned short *a4, unsigned long a5)
{
    unsigned long v0;  // x11
    unsigned long long iter;  // x15
    unsigned long long n;  // w14
    unsigned int v11;  // w5
    unsigned long long v12;  // x15
    unsigned long long v13;  // x16
    unsigned long long v14;  // x17
    unsigned long v15;  // x14
    unsigned long long v16;  // x5
    unsigned long long v17;  // x19
    unsigned long long v18;  // x20
    unsigned long v19;  // x20
    st_76ca4_2 *v2;  // x9
    unsigned long long l;  // x20
    unsigned long long v21;  // x21
    unsigned long long v22;  // x22
    uint128_t v23;  // q0
    uint128_t *iter1;  // x23
    unsigned long long k;  // x24
    unsigned long long v26;  // x24
    unsigned long long *iter2;  // x21
    unsigned long long v29;  // x13
    st_76ca4_1 *v3;  // x12
    unsigned long long i;  // x11
    char *v31;  // x16
    unsigned long long v32;  // x12
    unsigned long long v33;  // w13
    unsigned int v34;  // w16
    unsigned long long m;  // w17
    char *node;  // x10
    unsigned long long j;  // x11
    unsigned long long v38;  // x11
    unsigned long index;  // x12
    unsigned long long v4;  // x8
    unsigned short v40;  // x13
    char v41;  // x12
    char v42;  // x12
    unsigned long v5;  // x10
    unsigned long long v6;  // x16
    unsigned long long v7;  // w14
    unsigned int v8;  // w6
    unsigned long long v9;  // 4120

    if (0xff < a2)
        return 0xffffffffffffffd2;
    v0 = a2 + 1;
    if (a5 < (1 << ((char)a3 & 63)) + (v0 & 0xffffffff) * 2 + 8)
    {
        return 0xffffffffffffffd2;
    }
    else if (a3 > 12)
    {
        return 0xffffffffffffffd4;
    }
    else
    {
        iter = 0;
        v2 = &(&a0->field_0)[2];
        v3 = &a4[a2];
        v4 = 1 << ((char)a3 & 31);
        v5 = (unsigned int)v4 - 1;
        v6 = 1;
        v7 = (unsigned int)v5;
        while (1)
        {
            v8 = a1[iter];
            v9 = arm64g_calculate_condition(0x11, v8, 1, 0);
            if (v9 & 1)
            {
                if ((int)v8 >= (int)(0x8000 << ((char)a3 & 31) >> 16))
                    v6 = 0;
                a4[iter] = v8;
                iter += 1;
                n = v7;
                if (v0 == iter)
                    break;
            }
            else
            {
                n = v7 - 1;
                v2[v7].field_2 = iter;
                a4[iter] = 1;
                iter += 1;
                v7 = n;
                if (v0 == iter)
                    break;
            }
        }
        a0->field_0 = a3;
        (&a0->field_0)[1] = v6;
        v11 = (unsigned int)v4 >> 1;
        if (n == (unsigned int)v5)
        {
            v12 = 0;
            v13 = 0;
            v14 = 0;
            v15 = v11 + ((unsigned int)v4 >> 3) + 3;
            v16 = &a4[a2];
            do
            {
                v17 = a1[v12];
                *(unsigned long long *)&(v3->padding_0)[1 + v14] = v13;
                if ((long long)v17 < 9)
                    continue;
                if (16 < v17)
                    v18 = v17;
                else
                    v18 = 16;
                v19 = v18 - 9;
                if (24 > v19)
                {
                    l = 8;
                }
                else
                {
                    v21 = (v19 >> 3) + 1;
                    v22 = v21 & 0x3ffffffffffffffc;
                    l = (8 | ((v22 >> 2) * 32 | v22 >> 61) & 0x7fffffffffffffe0) & 0x7fffffffffffffff;
                    v23 = CONCAT(v13, v13);
                    iter1 = v16 + 26 + v14;
                    k = v22;
                    do
                    {
                        v26 = k;
                        *(uint128_t *)((char *)iter1 - 16) = v23;
                        *iter1 = v23;
                        iter1 += 2;
                        k = v26 - 4;
                    } while (k);
                    if (v21 == v22)
                        continue;
                }
                iter2 = v16 + 2 + l + v14;
                do
                {
                    *iter2 = v13;
                    iter2 += 1;
                    l += 8;
                } while (l < v17);
            } while ((v12 += 1, v13 += 0x101010101010101, v14 += v17, v12 != v0));
            v29 = 0;
            i = 0;
            do
            {
                v31 = &v3->padding_0[i];
                v2[v29 & v5].field_2 = v31[2];
                v2[v29 + v15 & v5].field_2 = v31[3];
                v29 = v29 + v15 * 2 & v5;
                i += 2;
            } while (i < v4);
        }
        else
        {
            v32 = 0;
            v33 = 0;
            do
            {
                v34 = a1[v32];
                if ((int)v34 >= 1)
                {
                    m = 0;
                    do
                    {
                        v2[v33].field_2 = v32;
                        do
                        {
                            v33 = v11 + ((unsigned int)v4 >> 3) + 3 + v33 & (unsigned int)v5;
                        } while (n < v33);
                        m += 1;
                    } while (m != v34);
                }
            } while ((v32 += 1, v32 != v0));
            if (v33)
                return 0xffffffffffffffff;
        }
        node = (char *)&(&a0->field_0)[3] + 1;
        j = v4;
        do
        {
            v38 = j;
            index = *(node - 1);
            v40 = a4[index];
            a4[index] = v40 + 1;
            if (!(v40 * 0x100000000))
                v41 = 32;
            else
                v41 = Clz(v40 * 0x100000000);
            v42 = (char)(a3 - 31) + v41;
            *node = v42;
            *(unsigned short *)(node - 3) = (v40 << (v42 & 31)) - v4;
            node += 4;
            j = v38 - 1;
        } while (j);
        return 0;
    }
}
