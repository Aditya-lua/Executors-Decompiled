/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb336c0..0xb33988 (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b336c0_0 {
    char padding_0[32];
    unsigned long long field_20;
    long long field_28;
} st_b336c0_0;


unsigned long long sub_b336c0(st_b336c0_0 *a0, void* a1, unsigned long long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v12;  // x11
    uint128_t v13;  // q1
    uint128_t v14;  // q3
    unsigned long long v16;  // x11
    void* v17;  // x9
    void* node;  // x10
    unsigned long long v19;  // x11
    unsigned long v21;  // d0
    unsigned long v4;  // x8
    unsigned long long v23;  // 4121
    unsigned long long j;  // x9
    void* iter;  // x10
    void* v26;  // x8
    unsigned long long v27;  // x9
    long long v30;  // x1
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    void* v7;  // x21
    unsigned long long v8;  // x8
    uint128_t *iter1;  // x9
    uint128_t *iter2;  // x10
    unsigned long long i;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b33994(a0, a3);
    if (!(unsigned int)v3)
        return v3;
    if (!*(long long *)&a0->padding_0[8])
    {
        sub_a368c8(0);
        sub_a369bc("providers/implementations/kdfs/tls1_prf.c", 0x101, "kdf_tls1_prf_derive");
        v30 = 129;
    }
    else if (!*(long long *)&a0->padding_0[24])
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/tls1_prf.c", 261, "kdf_tls1_prf_derive");
        v30 = 132;
    }
    else if (*(long long *)&a0[1].padding_0[0])
    {
        if (a2)
        {
            if (*(long long *)&a0->padding_0[16])
            {
                v4 = a0->field_20 + 1;
                v5 = sub_b33c3c();
                if (!(unsigned int)v5)
                    return v5;
                v6 = sub_a6bf4c(a2, "providers/implementations/kdfs/tls1_prf.c", 568);
                if (!v6)
                    return v6;
                v7 = v6;
                if (!sub_b33c3c(*(long long *)&a0->padding_0[16], *(long long *)&a0->padding_0[24] + a0->field_20 - (v4 >> 1), v4 >> 1, a0->field_28, *(long long *)&a0[1].padding_0[0], v7, a2))
                {
                    sub_a6c4e8(v7, a2, "providers/implementations/kdfs/tls1_prf.c", 573);
                    return 0;
                }
                if (8 > a2)
                {
                    v8 = 0;
                }
                else if (32 > a2)
                {
                    v8 = 0;
LABEL_b33910:
                    v16 = v8;
                    v8 = a2 & 0xfffffffffffffff8;
                    v17 = v7 + v16;
                    node = a1 + v16;
                    v19 = v16 - v8;
                    do
                    {
                        v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v17 ^ *(unsigned long long *)&*(double *)node);
                        *(unsigned long *)node = v21;
                        node += 8;
                        v23 = arm64g_calculate_condition(18, v19, 8, 0);
                        v17 += 8;
                        v19 += 8;
                    } while (v23 & 1);
                    if (v8 == a2)
                    {
                        sub_a6c4e8(v7, a2, "providers/implementations/kdfs/tls1_prf.c", 578);
                        return 1;
                    }
                }
                else
                {
                    v8 = a2 & 0xffffffffffffffe0;
                    iter1 = v7 + 16;
                    iter2 = a1 + 16;
                    i = v8;
                    do
                    {
                        v12 = i;
                        v13 = *iter1;
                        v14 = *iter2;
                        *(int128_t *)((char *)iter2 - 16) = *(int128_t *)((char *)iter1 - 16) ^ *(int128_t *)((char *)iter2 - 16);
                        *iter2 = v13 ^ v14;
                        iter1 += 2;
                        iter2 += 2;
                        i = v12 - 32;
                    } while (i);
                    if (v8 == a2)
                    {
                        sub_a6c4e8(v7, a2, "providers/implementations/kdfs/tls1_prf.c", 578);
                        return 1;
                    }
                    if (a2 & 24)
                        goto LABEL_b33910;
                }
                j = a2 - v8;
                iter = a1 + v8;
                v26 = v7 + v8;
                do
                {
                    v27 = j;
                    *(char *)iter = *(char *)iter ^ *(char *)v26;
                    iter += 1;
                    v26 += 1;
                    j = v27 - 1;
                } while (j);
                sub_a6c4e8(v7, a2, "providers/implementations/kdfs/tls1_prf.c", 578);
                return 1;
            }
            else
            {
                return sub_b33c3c();
            }
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/tls1_prf.c", 269, "kdf_tls1_prf_derive");
        v30 = 105;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/tls1_prf.c", 265, "kdf_tls1_prf_derive");
        v30 = 140;
    }
    sub_a36abc(57, v30, 0);
    return 0;
}
