/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97d14..0xa97e54 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a97d14(void* a0, long long a1, uint128_t *a2, unsigned long n)
{
    unsigned long v7;  // x0
    unsigned long v8;  // x19
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long v19;  // 4110
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long v23;  // cc_op
    unsigned long v9;  // x24
    unsigned long v24;  // 4110
    unsigned long long v25;  // 4105
    unsigned long v26;  // x20
    long long v10;  // x8
    unsigned long long v11;  // x9
    unsigned long long v12;  // x9
    unsigned long long v13;  // x8
    unsigned long v15;  // x8
    unsigned long v0;  // [bp-0x58]
    uint128_t v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x50]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v0 = 16;
    v7 = sub_a57f5c((long long)a0[48]);
    if (!v7)
        return 0;
    v8 = v7;
    v9 = n - 16;
    if (n >= 16)
    {
        if (!sub_a58164(v8, a2, v9))
            goto LABEL_a97e2c;
        v1 = *(int128_t *)((char *)a2 + v9);
        v1 ^= *(int128_t *)a0;
    }
    else
    {
        v2 = 0;
        v4 = 0;
        ___memcpy_chk(&v2, a2, n, 16);
        *((char *)&v2 + n) = 128;
        v10 = __builtin_bswap64(*(long long *)a0);
        v11 = __builtin_bswap64((long long)a0[8]);
        v12 = __builtin_bswap64(v10 * 2 | v11 >> 63);
        v13 = __builtin_bswap64(135 & v10 >> 63 ^ v11 * 2);
        *(unsigned long long *)a0 = v12;
        *(unsigned long long *)&a0[8] = v13;
        v3 = v2 ^ v12;
        v4 ^= v13;
    }
    if (sub_a58164(v8, &v1, 16))
    {
        v15 = v0;
        if (sub_a58170(v8, a1, &v0, 16))
        {
            v19 = arm64g_calculate_condition(v23 | 16, v16, v17, v18);
            v20 = 4;
            v21 = (v19 & 1 ? v15 : 0);
            v22 = (v19 & 1 ? 16 : 0);
        }
        else
        {
            v24 = arm64g_calculate_condition(v23 | 16, v16, v17, v18);
            v20 = 0;
            v21 = (v24 & 1 ? v15 : 0);
            v22 = (v24 & 1 ? 16 : 0);
        }
        v25 = arm64g_calculate_condition(v20 | 16, v21, v22, 0);
        v26 = !(v25 & 1);
    }
    else
    {
LABEL_a97e2c:
        v26 = 0;
    }
    sub_a57f0c(v8);
    return v26;
}
