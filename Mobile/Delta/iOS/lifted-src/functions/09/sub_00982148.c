/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982148..0x982594 (1100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982148_0 {
    char padding_0[8];
    char field_8;
    char field_9;
    char padding_a[46];
    long long field_38;
    unsigned long long field_40;
} st_982148_0;

extern char g_10002b0;

long long sub_982148(st_982148_0 *a0, long long *a1, long long a2, void* a3, void* a4)
{
    void* v15;  // x19
    unsigned long v16;  // x24
    unsigned int v25;  // w0
    unsigned int v26;  // w0
    unsigned long v27;  // x8
    unsigned long v28;  // x25
    unsigned long long v29;  // x8
    unsigned int v30;  // w8
    unsigned long v31;  // x27
    unsigned long n;  // x26
    unsigned long v33;  // x27
    char *v34;  // x8
    unsigned long long v17;  // x20
    unsigned long v35;  // x2
    unsigned long v36;  // x9
    unsigned long v37;  // x1
    char *v38;  // x26
    unsigned long v39;  // x25
    unsigned long v40;  // x27
    unsigned long v41;  // x0
    unsigned long v42;  // x8
    unsigned long long v43;  // 4104
    unsigned int v44;  // w8
    unsigned int v18;  // w0
    unsigned int v19;  // w0
    unsigned long v20;  // x26
    unsigned long v21;  // x25
    unsigned long long v22;  // x8
    long long v23;  // x26
    unsigned long long v24;  // x27
    unsigned long v0;  // [bp-0x198]
    void* v1;  // [bp-0x190]
    unsigned long v2;  // [bp-0x188]
    char v3;  // [bp-0x179]
    unsigned long v4;  // [bp-0x178]
    char v5;  // [bp-0x170]
    char v6;  // [bp-0x16f]
    uint256_t v7;  // [bp-0xd0], Other Possible Types: char
    uint128_t v8;  // [bp-0xb0]
    uint128_t v9;  // [bp-0xa0]
    unsigned long v10;  // [bp-0x98]
    uint128_t v11;  // [bp-0x90]
    unsigned long v12;  // [bp-0x78]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = a4;
    v12 = *(long long *)&g_10002b0;
    v9 = 0;
    v11 = 0;
    v7 = _INSERT(CONCAT(v7, 0), 16, 0);
    v8 = 0;
    *(uint128_t *)&v7 = 0;
    v16 = sub_a7c2c0();
    *(char *)v15 = 0;
    v17 = a0->field_40;
    v18 = sub_a50734(a1[20]);
    if (v18 && (v19 = sub_a4fbf0(a1[20]), (int)v19 >= 1))
    {
        v1 = a3;
        v20 = 0;
        v21 = 0;
        if (197 < v17)
            goto LABEL_9824ec;
        v22 = v18 + v19;
        if (v17 < v22)
            goto LABEL_9824ec;
        if (169 < v17 - v22)
            goto LABEL_9824ec;
        v23 = a0->field_38;
        v24 = a0->field_40;
        *(unsigned int *)&v2 = 0;
        v25 = sub_a50734(a1[20]);
        if (!v25 || !(v26 = sub_a4fbf0(a1[20]), (int)v26 >= 1 && 197 >= v24 && (v27 = v25, v28 = v26, v29 = v28 + v27, v0 = v24 - v29, v24 >= v29 && sub_a4d058(a1[20], 0, 0, 0, v23) && sub_a4c6b0(a1[20], &v3, &v2, v23 + v28, v0) && sub_a4d5dc(a1[20], 0x11, v27, v23 + v24 - v27) && sub_a4cc84(a1[20], &(&v3)[(unsigned int)v2], &v2))))
            goto LABEL_9824e4;
        *(unsigned long long *)&v11 = 0;
        if ((long long)v0 >= 1 && !(v30 = v3, *((char *)&v11 + 8) = v30, v31 = v0 - 9, v0 < 9 || 1 < v30))
        {
            *(unsigned long *)&v7 = v4;
            if (v30)
            {
                if (v31 && !(n = v5, v33 = v0 - 10, v33 < n || (*((char *)&v7 + 8) = n, 20 < (unsigned int)n || (___memcpy_chk(&v7 | 9, &v6, n, 71), v33 == n || (v34 = &(&v6)[n], v35 = *v34, v36 = v33 + ~n, v31 = v36 - v35, v36 < v35 || (*((char *)&v7 + 29) = v35, 20 < (unsigned int)v35))))))
                {
                    v37 = v34 + 1;
                    v38 = v37 + v35;
                    ___memcpy_chk((char *)&v7 + 30, v37);
                    goto LABEL_98238c;
                }
                goto LABEL_9824d0;
            }
            v38 = &v5;
LABEL_98238c:
            if (!v31 || (v39 = *v38, v40 = v31 - 1, v40 < v39 || (v10 = v39, !(unsigned int)v10 || (v41 = sub_a6bf4c(v10, "ssl/quic/quic_port.c", 1081), *(unsigned long *)&v11 = v41, !v41 || (_memcpy(), v40 != v10)))))
                goto LABEL_9824d0;
            v42 = *(unsigned long long *)&v7;
            if (v16 < v42)
                goto LABEL_9824e4;
            v43 = arm64g_calculate_condition(52, v16, v42, 0);
            if (v43 & 1)
                v16 = 0;
            else
                v16 -= v42;
            v44 = *(char *)((void*)&v11 + 8);
            if (v44 && 0x28fa6adff < v16 || !v44 && 0x3466c5369ff < v16 || !sub_9d35bc(a2, 0, &v2) || v2 != v10)
                goto LABEL_9824e4;
            v21 = sub_a6bf4c(v2, "ssl/quic/quic_port.c", 1377);
            if (!v21)
                goto LABEL_9824e8;
            if (!sub_9d35bc(a2, v21, &v2))
                goto LABEL_9824e8;
            if (_memcmp(v21, *(unsigned long long *)&v11, v2))
                goto LABEL_9824e8;
            if (!*(char *)((void*)&v11 + 8))
                goto LABEL_982554;
            if (*(char *)((void*)&v7 + 29) != a0->field_8)
                goto LABEL_9824e8;
            if (_memcmp((char *)&v7 + 30, &a0->field_9))
                goto LABEL_9824e8;
            *(uint128_t *)v1 = *(uint128_t *)((void*)&v7 + 8);
            *(unsigned long long *)&v1[13] = *(unsigned long long *)((void*)&v7 + 21);
        }
        else
        {
LABEL_9824d0:
            sub_a6c2e4(*(unsigned long long *)&v11, "ssl/quic/quic_port.c", 854);
            goto LABEL_9824e4;
        }
    }
    else
    {
LABEL_9824e4:
        v21 = 0;
        goto LABEL_9824e8;
    }
    while (1)
    {
        v20 = 1;
        *(char *)v15 = 1;
        do
        {
            while (1)
            {
LABEL_9824ec:
                v15 = "ssl/quic/quic_port.c";
                sub_a6c2e4(*(unsigned long long *)&v11, "ssl/quic/quic_port.c", 854);
                sub_a6c2e4(v21, "ssl/quic/quic_port.c", 1429);
                if (*(long long *)&g_10002b0 == v12)
                    return v20;
                ___stack_chk_fail();
LABEL_982554:
                if (sub_980c6c(a1[16], v1))
                    break;
LABEL_9824e8:
                v20 = 0;
            }
            if (*(char *)((void*)&v11 + 8))
                break;
        } while ((v20 = 1, v16 < 3241000000000));
    }
}
