/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97b68..0xa97c40 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a97b68(void* a0, long long a1, long long a2)
{
    long long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    long long v8;  // x20
    uint128_t v9;  // q0
    unsigned long v0;  // [bp-0x48]
    char v1;  // [bp-0x40]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 16;
    v4 = __builtin_bswap64(*(long long *)a0);
    v5 = __builtin_bswap64((long long)a0[8]);
    v6 = __builtin_bswap64(v4 * 2 | v5 >> 63);
    v7 = __builtin_bswap64(135 & v4 >> 63 ^ v5 * 2);
    *(unsigned long long *)a0 = v6;
    *(unsigned long long *)&a0[8] = v7;
    v8 = sub_a57f5c((long long)a0[48]);
    if (v8 && sub_a58164(v8, a1, a2) && sub_a58170(v8, &v1, &v0, 16) && v0 == 16)
    {
        sub_a57f0c(v8);
        v9 = v1 ^ *(int128_t *)a0;
        *(uint128_t *)a0 = v9;
    }
    else
    {
        sub_a57f0c(v8);
    }
    return (unsigned long long)v9;
}
