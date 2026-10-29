/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa94dd8..0xa94fe8 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a94dd8(void* a0, void* a1, unsigned int a2)
{
    unsigned long long v7;  // x9
    unsigned long long v8;  // 4128
    unsigned int v17;  // w9
    unsigned long long v18;  // x19
    unsigned int v19;  // x8
    uint128_t *node;  // x9
    uint128_t *iter;  // x10
    unsigned long long j;  // x11
    unsigned int v23;  // x11
    uint128_t v24;  // q1
    uint128_t v25;  // q3
    unsigned long long v9;  // x22
    unsigned long long v27;  // x11
    void* v28;  // x9
    unsigned long long *iter1;  // x10
    unsigned long long v30;  // x11
    void* v31;  // x9
    unsigned long v32;  // d0
    unsigned long long v34;  // 4121
    unsigned long long i;  // x9
    char *iter2;  // x10
    unsigned long long v10;  // x21
    void* v37;  // x8
    unsigned long long v38;  // x9
    void* v39;  // x8
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned int v14;  // w9
    unsigned long long v15;  // x2
    void* v16;  // x1
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if ((long long)a0[56])
        return 0xfffffffe;
    v7 = (long long)a0[48] + a2;
    v8 = arm64g_calculate_condition(50, (long long)a0[48], a2, 0);
    if (0x2000000000000000 < v7)
    {
        return 0xffffffff;
    }
    else if (!(v8 & 1))
    {
        return 0xffffffff;
    }
    else
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = &v6;
        v5 = v13;
        *(unsigned long long *)&a0[48] = v7;
        v14 = (int)a0[380];
        if (!v14)
        {
            v18 = a2 & 0xfffffffffffffff0;
            if (a2 & 0xfffffffffffffff0)
                (long long)a0[360]();
            if (!a2)
            {
                v14 = 0;
            }
            else
            {
                a0 = a0;
                if (a2 < 8 || a1 + a2 + v18 > a0 + 64 && a0 + a2 + 64 > a1)
                {
                    v19 = 0;
                }
                else
                {
                    if (32 > a2)
                    {
                        v19 = 0;
LABEL_a94fa8:
                        v27 = v19;
                        v19 = a2 & 0xfffffffffffffff8;
                        v28 = a1 + v27 + v18;
                        iter1 = v27 + a0 + 64;
                        v30 = v27 - v19;
                        do
                        {
                            v31 = v28 + 8;
                            v32 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v28 ^ *(unsigned long long *)&*(double *)iter1);
                            *iter1 = v32;
                            iter1 += 1;
                            v34 = arm64g_calculate_condition(18, v30, 8, 0);
                            v28 = v31;
                            v30 += 8;
                        } while (v34 & 1);
                        if (a2 == v19)
                            goto LABEL_a94f34;
                    }
                    else
                    {
                        v19 = a2 & 0xffffffffffffffe0;
                        node = v18 + a1 + 16;
                        iter = a0 + 80;
                        j = v19;
                        do
                        {
                            v23 = j;
                            v24 = *node;
                            v25 = *iter;
                            *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16) ^ *(int128_t *)((char *)iter - 16);
                            *iter = v24 ^ v25;
                            node += 2;
                            iter += 2;
                            j = v23 - 32;
                        } while (j);
                        if (a2 == v19)
                            goto LABEL_a94f34;
                        if (a2 & 24)
                            goto LABEL_a94fa8;
                    }
                }
                i = a2 - v19;
                iter2 = v19 + a0 + 64;
                v37 = a1 + v19 + v18;
                do
                {
                    v38 = i;
                    v39 = v37 + 1;
                    *iter2 = *iter2 ^ *(char *)v37;
                    iter2 += 1;
                    v37 = v39;
                    i = v38 - 1;
                } while (i);
LABEL_a94f34:
                v14 = a2;
            }
        }
        else if (a2)
        {
            do
            {
                v15 = a2;
                v16 = a1 + 1;
                *((char *)a0 + v14 + 64) = *((char *)a0 + v14 + 64) ^ *(char *)a1;
                v17 = v14 + 1;
                v14 = v17 & 15;
            } while (v17 & 15 && (a2 = v15 - 1, a1 = v16, v15 != 1));
            if (!v14)
                (long long)a0[368]();
        }
        *(unsigned int *)&a0[380] = v14;
        return 0;
    }
}
