/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a808..0xb2a900 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b2a808(void* ptr)
{
    unsigned int v2;  // w20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (int)ptr[100];
    sub_a3f52c((long long)ptr[0x88]);
    sub_a58aa4((long long)ptr[144]);
    sub_a6c2e4((long long)ptr[152], "providers/implementations/kdfs/argon2.c", 1127);
    if ((long long)ptr[16])
        sub_a6c4e8((long long)ptr[16], (int)ptr[24], "providers/implementations/kdfs/argon2.c", 1130);
    if ((long long)ptr[32])
        sub_a6c4e8((long long)ptr[32], (int)ptr[40], "providers/implementations/kdfs/argon2.c", 1133);
    if ((long long)ptr[48])
        sub_a6c4e8((long long)ptr[48], (int)ptr[56], "providers/implementations/kdfs/argon2.c", 1136);
    if ((long long)ptr[64])
        sub_a6c4e8((long long)ptr[64], (int)ptr[72], "providers/implementations/kdfs/argon2.c", 1139);
    memset(ptr, 0, 160);
    *(long long *)&ptr[128] = (long long)ptr[128];
    *(unsigned int *)&ptr[8] = 64;
    *(uint128_t *)&ptr[76] = 0x1000000010000000800000003;
    *(unsigned int *)&ptr[92] = 19;
    *(unsigned int *)&ptr[100] = v2;
    return 34359738371;
}
