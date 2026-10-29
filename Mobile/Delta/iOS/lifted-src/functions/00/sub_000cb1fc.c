/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcb1fc..0xcb470 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cb1fc_0 {
    unsigned long long field_0;
    unsigned int field_4;
    unsigned short field_8;
    char field_a;
    char field_b;
    unsigned int field_c;
} st_cb1fc_0;

typedef struct st_cb1fc_1 {
    unsigned short field_0;
    char field_2;
    char field_3;
    unsigned int field_4;
} st_cb1fc_1;


st_cb1fc_0 * sub_cb1fc(st_cb1fc_0 *a0, short *a1, unsigned int a2, unsigned int *a3, char *a4, unsigned int a5, unsigned short *a6)
{
    st_cb1fc_1 *v0;  // x9
    unsigned long long v1;  // x8
    unsigned long long v10;  // 4120
    unsigned long long n;  // w13
    unsigned int v12;  // w15
    unsigned long long v13;  // x13
    unsigned long long v14;  // x14
    unsigned long long v15;  // x16
    unsigned long long v16;  // x19
    unsigned long long *v17;  // x20
    unsigned long long v18;  // x21
    unsigned long v19;  // x21
    unsigned long v2;  // x10
    unsigned long long l;  // x21
    unsigned long v21;  // x22
    unsigned long long v22;  // x23
    uint128_t v23;  // q0
    uint128_t *node;  // x24
    unsigned long long k;  // x25
    unsigned long long v26;  // x25
    unsigned long long v28;  // x12
    unsigned long long i;  // x11
    unsigned long long v3;  // x11
    char *v30;  // x16
    unsigned long long v31;  // x12
    unsigned long long v32;  // w14
    unsigned int v33;  // w16
    unsigned long long m;  // w17
    unsigned int *iter;  // x10
    unsigned long long j;  // x11
    unsigned long long v37;  // x11
    unsigned long idx;  // x12
    unsigned short v39;  // x13
    unsigned long long v4;  // 4165
    char v40;  // x14
    char v41;  // x14
    unsigned long v5;  // x14
    unsigned long long iter1;  // x14
    unsigned long long v7;  // w16
    unsigned long long v8;  // w13
    unsigned int v9;  // w2

    v0 = &a0->field_4;
    v1 = 1 << ((char)a5 & 31);
    v2 = (unsigned int)v1 - 1;
    v3 = a2 + 1;
    v4 = arm64g_calculate_condition(49, a2, 1, 0);
    if (!(v4 & 1))
    {
        *(unsigned int *)&a0->field_0 = 1;
        *(unsigned int *)((char *)&a0->field_0 + 4) = a5;
        v5 = ((unsigned int)v1 >> 3) + ((unsigned int)v1 >> 1) + 3;
        goto LABEL_cb3c4;
    }
    else
    {
        iter1 = 0;
        v7 = 1;
        v8 = (unsigned int)v2;
        while (1)
        {
            v9 = a1[iter1];
            v10 = arm64g_calculate_condition(0x11, v9, 1, 0);
            if (v10 & 1)
            {
                if ((int)v9 >= (int)((int)(0x10000 << ((char)(a5 - 1) & 31)) >> 16))
                    v7 = 0;
                a6[iter1] = v9;
                iter1 += 1;
                n = v8;
                if (v3 == iter1)
                    break;
            }
            else
            {
                n = v8 - 1;
                v0[v8].field_4 = iter1;
                a6[iter1] = 1;
                iter1 += 1;
                v8 = n;
                if (v3 == iter1)
                    break;
            }
        }
        *(unsigned int *)&a0->field_0 = v7;
        *(unsigned int *)((char *)&a0->field_0 + 4) = a5;
        v12 = (unsigned int)v1 >> 3;
        if (n == (unsigned int)v2)
        {
            v13 = 0;
            v14 = 0;
            v15 = 0;
            do
            {
                v16 = a1[v13];
                v17 = (char *)a6 + v15 + 53;
                *v17 = v14;
                if ((long long)v16 < 9)
                    continue;
                if (16 < v16)
                    v18 = v16;
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
                    v23 = CONCAT(v14, v14);
                    node = (char *)a6 + v15 + 65;
                    k = v22;
                    do
                    {
                        v26 = k;
                        *(uint128_t *)((char *)node - 16) = v23;
                        *node = v23;
                        node += 2;
                        k = v26 - 4;
                    } while (k);
                    if (v21 == v22)
                        continue;
                }
                do
                {
                    *(unsigned long long *)((char *)v17 + l) = v14;
                    l += 8;
                } while (l < v16);
            } while ((v15 += v16, v13 += 1, v14 += 0x101010101010101, v13 != v3));
            v5 = v12 + 3 + ((unsigned int)v1 >> 1);
LABEL_cb3c4:
            v28 = 0;
            i = 0;
            do
            {
                v30 = (char *)a6 + i;
                v0[v28 & v2].field_4 = v30[106];
                v0[v28 + (v5 & 0xffffffff) & v2].field_4 = v30[107];
                v28 = v28 + ((v5 * 2 | v5 >> 63) & 0x1fffffffe & 0x1ffffffff) & v2;
                i += 2;
            } while (i < v1);
        }
        else
        {
            v31 = 0;
            v32 = 0;
            do
            {
                v33 = a1[v31];
                if ((int)v33 >= 1)
                {
                    m = 0;
                    do
                    {
                        v0[v32].field_4 = v31;
                        do
                        {
                            v32 = v12 + ((unsigned int)v1 >> 1) + 3 + v32 & (unsigned int)v2;
                        } while (n < v32);
                        m += 1;
                    } while (m != v33);
                }
            } while ((v31 += 1, v31 != v3));
        }
    }
    iter = &a0->field_8;
    j = v1;
    do
    {
        v37 = j;
        idx = *iter;
        v39 = a6[idx];
        a6[idx] = v39 + 1;
        if (!(v39 * 0x100000000))
            v40 = 32;
        else
            v40 = Clz(v39 * 0x100000000);
        v41 = (char)(a5 - 31) + v40;
        *((char *)iter - 1) = v41;
        *(unsigned short *)((char *)iter - 4) = (v39 << (v41 & 31)) - v1;
        *((char *)iter - 2) = a4[idx];
        *iter = a3[idx];
        iter += 2;
        j = v37 - 1;
    } while (j);
    return a0;
}
